package com.senorita.service;

import com.senorita.dao.OrderInfoMapper;
import com.senorita.model.OrderInfo;
import com.senorita.model.OrderInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderInfoService {
    @Autowired
    OrderInfoMapper orderInfoMapper;

    public String getLogisticsInfoByOrderNum(String orderNum) {
        KdniaoTrackQueryAPI api = new KdniaoTrackQueryAPI();

        OrderInfoExample orderInfoExample = new OrderInfoExample();
        OrderInfoExample.Criteria criteria = orderInfoExample.createCriteria();
        criteria.andOrderNoEqualTo(orderNum);
        List<OrderInfo> orderInfos = orderInfoMapper.selectByExample(orderInfoExample);
        OrderInfo orderInfo=orderInfos.get(0);
        String s=null;
        try {
            s=api.getOrderTracesByJson(orderInfo.getOutCompany(),orderInfo.getOutNumber());
        } catch (Exception e) {
            e.printStackTrace();
        }
        orderInfo.setOutDesc(s);
        orderInfoMapper.updateByPrimaryKeySelective(orderInfo);
        return s;
    }

}
