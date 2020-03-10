package com.senorita.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderPidIsNull() {
            addCriterion("order_pid is null");
            return (Criteria) this;
        }

        public Criteria andOrderPidIsNotNull() {
            addCriterion("order_pid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPidEqualTo(Long value) {
            addCriterion("order_pid =", value, "orderPid");
            return (Criteria) this;
        }

        public Criteria andOrderPidNotEqualTo(Long value) {
            addCriterion("order_pid <>", value, "orderPid");
            return (Criteria) this;
        }

        public Criteria andOrderPidGreaterThan(Long value) {
            addCriterion("order_pid >", value, "orderPid");
            return (Criteria) this;
        }

        public Criteria andOrderPidGreaterThanOrEqualTo(Long value) {
            addCriterion("order_pid >=", value, "orderPid");
            return (Criteria) this;
        }

        public Criteria andOrderPidLessThan(Long value) {
            addCriterion("order_pid <", value, "orderPid");
            return (Criteria) this;
        }

        public Criteria andOrderPidLessThanOrEqualTo(Long value) {
            addCriterion("order_pid <=", value, "orderPid");
            return (Criteria) this;
        }

        public Criteria andOrderPidIn(List<Long> values) {
            addCriterion("order_pid in", values, "orderPid");
            return (Criteria) this;
        }

        public Criteria andOrderPidNotIn(List<Long> values) {
            addCriterion("order_pid not in", values, "orderPid");
            return (Criteria) this;
        }

        public Criteria andOrderPidBetween(Long value1, Long value2) {
            addCriterion("order_pid between", value1, value2, "orderPid");
            return (Criteria) this;
        }

        public Criteria andOrderPidNotBetween(Long value1, Long value2) {
            addCriterion("order_pid not between", value1, value2, "orderPid");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNull() {
            addCriterion("total_fee is null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNotNull() {
            addCriterion("total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeEqualTo(Integer value) {
            addCriterion("total_fee =", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotEqualTo(Integer value) {
            addCriterion("total_fee <>", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThan(Integer value) {
            addCriterion("total_fee >", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_fee >=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThan(Integer value) {
            addCriterion("total_fee <", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThanOrEqualTo(Integer value) {
            addCriterion("total_fee <=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIn(List<Integer> values) {
            addCriterion("total_fee in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotIn(List<Integer> values) {
            addCriterion("total_fee not in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeBetween(Integer value1, Integer value2) {
            addCriterion("total_fee between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("total_fee not between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("pay_type like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("pay_type not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNull() {
            addCriterion("trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(String value) {
            addCriterion("trade_no =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLike(String value) {
            addCriterion("trade_no like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotLike(String value) {
            addCriterion("trade_no not like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<String> values) {
            addCriterion("trade_no in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<String> values) {
            addCriterion("trade_no not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(String value1, String value2) {
            addCriterion("trade_no between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(String value1, String value2) {
            addCriterion("trade_no not between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNull() {
            addCriterion("pay_channel is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNotNull() {
            addCriterion("pay_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelEqualTo(String value) {
            addCriterion("pay_channel =", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotEqualTo(String value) {
            addCriterion("pay_channel <>", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThan(String value) {
            addCriterion("pay_channel >", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThanOrEqualTo(String value) {
            addCriterion("pay_channel >=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThan(String value) {
            addCriterion("pay_channel <", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThanOrEqualTo(String value) {
            addCriterion("pay_channel <=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLike(String value) {
            addCriterion("pay_channel like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotLike(String value) {
            addCriterion("pay_channel not like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelIn(List<String> values) {
            addCriterion("pay_channel in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotIn(List<String> values) {
            addCriterion("pay_channel not in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelBetween(String value1, String value2) {
            addCriterion("pay_channel between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotBetween(String value1, String value2) {
            addCriterion("pay_channel not between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayConfigIdIsNull() {
            addCriterion("pay_config_id is null");
            return (Criteria) this;
        }

        public Criteria andPayConfigIdIsNotNull() {
            addCriterion("pay_config_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayConfigIdEqualTo(Long value) {
            addCriterion("pay_config_id =", value, "payConfigId");
            return (Criteria) this;
        }

        public Criteria andPayConfigIdNotEqualTo(Long value) {
            addCriterion("pay_config_id <>", value, "payConfigId");
            return (Criteria) this;
        }

        public Criteria andPayConfigIdGreaterThan(Long value) {
            addCriterion("pay_config_id >", value, "payConfigId");
            return (Criteria) this;
        }

        public Criteria andPayConfigIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_config_id >=", value, "payConfigId");
            return (Criteria) this;
        }

        public Criteria andPayConfigIdLessThan(Long value) {
            addCriterion("pay_config_id <", value, "payConfigId");
            return (Criteria) this;
        }

        public Criteria andPayConfigIdLessThanOrEqualTo(Long value) {
            addCriterion("pay_config_id <=", value, "payConfigId");
            return (Criteria) this;
        }

        public Criteria andPayConfigIdIn(List<Long> values) {
            addCriterion("pay_config_id in", values, "payConfigId");
            return (Criteria) this;
        }

        public Criteria andPayConfigIdNotIn(List<Long> values) {
            addCriterion("pay_config_id not in", values, "payConfigId");
            return (Criteria) this;
        }

        public Criteria andPayConfigIdBetween(Long value1, Long value2) {
            addCriterion("pay_config_id between", value1, value2, "payConfigId");
            return (Criteria) this;
        }

        public Criteria andPayConfigIdNotBetween(Long value1, Long value2) {
            addCriterion("pay_config_id not between", value1, value2, "payConfigId");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNull() {
            addCriterion("refund_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNotNull() {
            addCriterion("refund_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeEqualTo(Date value) {
            addCriterion("refund_time =", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotEqualTo(Date value) {
            addCriterion("refund_time <>", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThan(Date value) {
            addCriterion("refund_time >", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_time >=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThan(Date value) {
            addCriterion("refund_time <", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_time <=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIn(List<Date> values) {
            addCriterion("refund_time in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotIn(List<Date> values) {
            addCriterion("refund_time not in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeBetween(Date value1, Date value2) {
            addCriterion("refund_time between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_time not between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeIsNull() {
            addCriterion("orders_type is null");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeIsNotNull() {
            addCriterion("orders_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeEqualTo(Integer value) {
            addCriterion("orders_type =", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeNotEqualTo(Integer value) {
            addCriterion("orders_type <>", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeGreaterThan(Integer value) {
            addCriterion("orders_type >", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_type >=", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeLessThan(Integer value) {
            addCriterion("orders_type <", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeLessThanOrEqualTo(Integer value) {
            addCriterion("orders_type <=", value, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeIn(List<Integer> values) {
            addCriterion("orders_type in", values, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeNotIn(List<Integer> values) {
            addCriterion("orders_type not in", values, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeBetween(Integer value1, Integer value2) {
            addCriterion("orders_type between", value1, value2, "ordersType");
            return (Criteria) this;
        }

        public Criteria andOrdersTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_type not between", value1, value2, "ordersType");
            return (Criteria) this;
        }

        public Criteria andBonusRateIsNull() {
            addCriterion("bonus_rate is null");
            return (Criteria) this;
        }

        public Criteria andBonusRateIsNotNull() {
            addCriterion("bonus_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBonusRateEqualTo(Integer value) {
            addCriterion("bonus_rate =", value, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateNotEqualTo(Integer value) {
            addCriterion("bonus_rate <>", value, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateGreaterThan(Integer value) {
            addCriterion("bonus_rate >", value, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("bonus_rate >=", value, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateLessThan(Integer value) {
            addCriterion("bonus_rate <", value, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateLessThanOrEqualTo(Integer value) {
            addCriterion("bonus_rate <=", value, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateIn(List<Integer> values) {
            addCriterion("bonus_rate in", values, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateNotIn(List<Integer> values) {
            addCriterion("bonus_rate not in", values, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateBetween(Integer value1, Integer value2) {
            addCriterion("bonus_rate between", value1, value2, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateNotBetween(Integer value1, Integer value2) {
            addCriterion("bonus_rate not between", value1, value2, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andTotalFeeRateIsNull() {
            addCriterion("total_fee_rate is null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeRateIsNotNull() {
            addCriterion("total_fee_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeRateEqualTo(Integer value) {
            addCriterion("total_fee_rate =", value, "totalFeeRate");
            return (Criteria) this;
        }

        public Criteria andTotalFeeRateNotEqualTo(Integer value) {
            addCriterion("total_fee_rate <>", value, "totalFeeRate");
            return (Criteria) this;
        }

        public Criteria andTotalFeeRateGreaterThan(Integer value) {
            addCriterion("total_fee_rate >", value, "totalFeeRate");
            return (Criteria) this;
        }

        public Criteria andTotalFeeRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_fee_rate >=", value, "totalFeeRate");
            return (Criteria) this;
        }

        public Criteria andTotalFeeRateLessThan(Integer value) {
            addCriterion("total_fee_rate <", value, "totalFeeRate");
            return (Criteria) this;
        }

        public Criteria andTotalFeeRateLessThanOrEqualTo(Integer value) {
            addCriterion("total_fee_rate <=", value, "totalFeeRate");
            return (Criteria) this;
        }

        public Criteria andTotalFeeRateIn(List<Integer> values) {
            addCriterion("total_fee_rate in", values, "totalFeeRate");
            return (Criteria) this;
        }

        public Criteria andTotalFeeRateNotIn(List<Integer> values) {
            addCriterion("total_fee_rate not in", values, "totalFeeRate");
            return (Criteria) this;
        }

        public Criteria andTotalFeeRateBetween(Integer value1, Integer value2) {
            addCriterion("total_fee_rate between", value1, value2, "totalFeeRate");
            return (Criteria) this;
        }

        public Criteria andTotalFeeRateNotBetween(Integer value1, Integer value2) {
            addCriterion("total_fee_rate not between", value1, value2, "totalFeeRate");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOutNumberIsNull() {
            addCriterion("out_number is null");
            return (Criteria) this;
        }

        public Criteria andOutNumberIsNotNull() {
            addCriterion("out_number is not null");
            return (Criteria) this;
        }

        public Criteria andOutNumberEqualTo(String value) {
            addCriterion("out_number =", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberNotEqualTo(String value) {
            addCriterion("out_number <>", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberGreaterThan(String value) {
            addCriterion("out_number >", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberGreaterThanOrEqualTo(String value) {
            addCriterion("out_number >=", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberLessThan(String value) {
            addCriterion("out_number <", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberLessThanOrEqualTo(String value) {
            addCriterion("out_number <=", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberLike(String value) {
            addCriterion("out_number like", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberNotLike(String value) {
            addCriterion("out_number not like", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberIn(List<String> values) {
            addCriterion("out_number in", values, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberNotIn(List<String> values) {
            addCriterion("out_number not in", values, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberBetween(String value1, String value2) {
            addCriterion("out_number between", value1, value2, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberNotBetween(String value1, String value2) {
            addCriterion("out_number not between", value1, value2, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutCompanyIsNull() {
            addCriterion("out_company is null");
            return (Criteria) this;
        }

        public Criteria andOutCompanyIsNotNull() {
            addCriterion("out_company is not null");
            return (Criteria) this;
        }

        public Criteria andOutCompanyEqualTo(String value) {
            addCriterion("out_company =", value, "outCompany");
            return (Criteria) this;
        }

        public Criteria andOutCompanyNotEqualTo(String value) {
            addCriterion("out_company <>", value, "outCompany");
            return (Criteria) this;
        }

        public Criteria andOutCompanyGreaterThan(String value) {
            addCriterion("out_company >", value, "outCompany");
            return (Criteria) this;
        }

        public Criteria andOutCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("out_company >=", value, "outCompany");
            return (Criteria) this;
        }

        public Criteria andOutCompanyLessThan(String value) {
            addCriterion("out_company <", value, "outCompany");
            return (Criteria) this;
        }

        public Criteria andOutCompanyLessThanOrEqualTo(String value) {
            addCriterion("out_company <=", value, "outCompany");
            return (Criteria) this;
        }

        public Criteria andOutCompanyLike(String value) {
            addCriterion("out_company like", value, "outCompany");
            return (Criteria) this;
        }

        public Criteria andOutCompanyNotLike(String value) {
            addCriterion("out_company not like", value, "outCompany");
            return (Criteria) this;
        }

        public Criteria andOutCompanyIn(List<String> values) {
            addCriterion("out_company in", values, "outCompany");
            return (Criteria) this;
        }

        public Criteria andOutCompanyNotIn(List<String> values) {
            addCriterion("out_company not in", values, "outCompany");
            return (Criteria) this;
        }

        public Criteria andOutCompanyBetween(String value1, String value2) {
            addCriterion("out_company between", value1, value2, "outCompany");
            return (Criteria) this;
        }

        public Criteria andOutCompanyNotBetween(String value1, String value2) {
            addCriterion("out_company not between", value1, value2, "outCompany");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}