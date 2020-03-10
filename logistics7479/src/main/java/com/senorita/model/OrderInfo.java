package com.senorita.model;

import lombok.Data;

import java.util.Date;
@Data
public class OrderInfo {
    private Long id;

    private Long orderPid;

    private String orderNo;

    private Long userId;

    private Integer totalFee;

    private Date createTime;

    private String payType;

    private Date payTime;

    private String tradeNo;

    private String payChannel;

    private Long payConfigId;

    private Date refundTime;

    private Integer ordersType;

    private Integer bonusRate;

    private Integer totalFeeRate;

    private String orderStatus;

    private String outNumber;

    private String outCompany;

    private String outDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderPid() {
        return orderPid;
    }

    public void setOrderPid(Long orderPid) {
        this.orderPid = orderPid;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public Long getPayConfigId() {
        return payConfigId;
    }

    public void setPayConfigId(Long payConfigId) {
        this.payConfigId = payConfigId;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public Integer getOrdersType() {
        return ordersType;
    }

    public void setOrdersType(Integer ordersType) {
        this.ordersType = ordersType;
    }

    public Integer getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(Integer bonusRate) {
        this.bonusRate = bonusRate;
    }

    public Integer getTotalFeeRate() {
        return totalFeeRate;
    }

    public void setTotalFeeRate(Integer totalFeeRate) {
        this.totalFeeRate = totalFeeRate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getOutNumber() {
        return outNumber;
    }

    public void setOutNumber(String outNumber) {
        this.outNumber = outNumber == null ? null : outNumber.trim();
    }

    public String getOutCompany() {
        return outCompany;
    }

    public void setOutCompany(String outCompany) {
        this.outCompany = outCompany == null ? null : outCompany.trim();
    }

    public String getOutDesc() {
        return outDesc;
    }

    public void setOutDesc(String outDesc) {
        this.outDesc = outDesc == null ? null : outDesc.trim();
    }
}