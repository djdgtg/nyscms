package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontSeriesAllPriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontSeriesAllPriceExample() {
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

        public Criteria andSeqidIsNull() {
            addCriterion("seqid is null");
            return (Criteria) this;
        }

        public Criteria andSeqidIsNotNull() {
            addCriterion("seqid is not null");
            return (Criteria) this;
        }

        public Criteria andSeqidEqualTo(Integer value) {
            addCriterion("seqid =", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotEqualTo(Integer value) {
            addCriterion("seqid <>", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidGreaterThan(Integer value) {
            addCriterion("seqid >", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidGreaterThanOrEqualTo(Integer value) {
            addCriterion("seqid >=", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidLessThan(Integer value) {
            addCriterion("seqid <", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidLessThanOrEqualTo(Integer value) {
            addCriterion("seqid <=", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidIn(List<Integer> values) {
            addCriterion("seqid in", values, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotIn(List<Integer> values) {
            addCriterion("seqid not in", values, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidBetween(Integer value1, Integer value2) {
            addCriterion("seqid between", value1, value2, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotBetween(Integer value1, Integer value2) {
            addCriterion("seqid not between", value1, value2, "seqid");
            return (Criteria) this;
        }

        public Criteria andDayIsNull() {
            addCriterion("day is null");
            return (Criteria) this;
        }

        public Criteria andDayIsNotNull() {
            addCriterion("day is not null");
            return (Criteria) this;
        }

        public Criteria andDayEqualTo(Integer value) {
            addCriterion("day =", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotEqualTo(Integer value) {
            addCriterion("day <>", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThan(Integer value) {
            addCriterion("day >", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("day >=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThan(Integer value) {
            addCriterion("day <", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThanOrEqualTo(Integer value) {
            addCriterion("day <=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayIn(List<Integer> values) {
            addCriterion("day in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotIn(List<Integer> values) {
            addCriterion("day not in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayBetween(Integer value1, Integer value2) {
            addCriterion("day between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotBetween(Integer value1, Integer value2) {
            addCriterion("day not between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDomesticpriceIsNull() {
            addCriterion("domesticPrice is null");
            return (Criteria) this;
        }

        public Criteria andDomesticpriceIsNotNull() {
            addCriterion("domesticPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDomesticpriceEqualTo(Float value) {
            addCriterion("domesticPrice =", value, "domesticprice");
            return (Criteria) this;
        }

        public Criteria andDomesticpriceNotEqualTo(Float value) {
            addCriterion("domesticPrice <>", value, "domesticprice");
            return (Criteria) this;
        }

        public Criteria andDomesticpriceGreaterThan(Float value) {
            addCriterion("domesticPrice >", value, "domesticprice");
            return (Criteria) this;
        }

        public Criteria andDomesticpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("domesticPrice >=", value, "domesticprice");
            return (Criteria) this;
        }

        public Criteria andDomesticpriceLessThan(Float value) {
            addCriterion("domesticPrice <", value, "domesticprice");
            return (Criteria) this;
        }

        public Criteria andDomesticpriceLessThanOrEqualTo(Float value) {
            addCriterion("domesticPrice <=", value, "domesticprice");
            return (Criteria) this;
        }

        public Criteria andDomesticpriceIn(List<Float> values) {
            addCriterion("domesticPrice in", values, "domesticprice");
            return (Criteria) this;
        }

        public Criteria andDomesticpriceNotIn(List<Float> values) {
            addCriterion("domesticPrice not in", values, "domesticprice");
            return (Criteria) this;
        }

        public Criteria andDomesticpriceBetween(Float value1, Float value2) {
            addCriterion("domesticPrice between", value1, value2, "domesticprice");
            return (Criteria) this;
        }

        public Criteria andDomesticpriceNotBetween(Float value1, Float value2) {
            addCriterion("domesticPrice not between", value1, value2, "domesticprice");
            return (Criteria) this;
        }

        public Criteria andForeignpriceIsNull() {
            addCriterion("foreignPrice is null");
            return (Criteria) this;
        }

        public Criteria andForeignpriceIsNotNull() {
            addCriterion("foreignPrice is not null");
            return (Criteria) this;
        }

        public Criteria andForeignpriceEqualTo(Float value) {
            addCriterion("foreignPrice =", value, "foreignprice");
            return (Criteria) this;
        }

        public Criteria andForeignpriceNotEqualTo(Float value) {
            addCriterion("foreignPrice <>", value, "foreignprice");
            return (Criteria) this;
        }

        public Criteria andForeignpriceGreaterThan(Float value) {
            addCriterion("foreignPrice >", value, "foreignprice");
            return (Criteria) this;
        }

        public Criteria andForeignpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("foreignPrice >=", value, "foreignprice");
            return (Criteria) this;
        }

        public Criteria andForeignpriceLessThan(Float value) {
            addCriterion("foreignPrice <", value, "foreignprice");
            return (Criteria) this;
        }

        public Criteria andForeignpriceLessThanOrEqualTo(Float value) {
            addCriterion("foreignPrice <=", value, "foreignprice");
            return (Criteria) this;
        }

        public Criteria andForeignpriceIn(List<Float> values) {
            addCriterion("foreignPrice in", values, "foreignprice");
            return (Criteria) this;
        }

        public Criteria andForeignpriceNotIn(List<Float> values) {
            addCriterion("foreignPrice not in", values, "foreignprice");
            return (Criteria) this;
        }

        public Criteria andForeignpriceBetween(Float value1, Float value2) {
            addCriterion("foreignPrice between", value1, value2, "foreignprice");
            return (Criteria) this;
        }

        public Criteria andForeignpriceNotBetween(Float value1, Float value2) {
            addCriterion("foreignPrice not between", value1, value2, "foreignprice");
            return (Criteria) this;
        }

        public Criteria andForeigndollarIsNull() {
            addCriterion("foreignDollar is null");
            return (Criteria) this;
        }

        public Criteria andForeigndollarIsNotNull() {
            addCriterion("foreignDollar is not null");
            return (Criteria) this;
        }

        public Criteria andForeigndollarEqualTo(Float value) {
            addCriterion("foreignDollar =", value, "foreigndollar");
            return (Criteria) this;
        }

        public Criteria andForeigndollarNotEqualTo(Float value) {
            addCriterion("foreignDollar <>", value, "foreigndollar");
            return (Criteria) this;
        }

        public Criteria andForeigndollarGreaterThan(Float value) {
            addCriterion("foreignDollar >", value, "foreigndollar");
            return (Criteria) this;
        }

        public Criteria andForeigndollarGreaterThanOrEqualTo(Float value) {
            addCriterion("foreignDollar >=", value, "foreigndollar");
            return (Criteria) this;
        }

        public Criteria andForeigndollarLessThan(Float value) {
            addCriterion("foreignDollar <", value, "foreigndollar");
            return (Criteria) this;
        }

        public Criteria andForeigndollarLessThanOrEqualTo(Float value) {
            addCriterion("foreignDollar <=", value, "foreigndollar");
            return (Criteria) this;
        }

        public Criteria andForeigndollarIn(List<Float> values) {
            addCriterion("foreignDollar in", values, "foreigndollar");
            return (Criteria) this;
        }

        public Criteria andForeigndollarNotIn(List<Float> values) {
            addCriterion("foreignDollar not in", values, "foreigndollar");
            return (Criteria) this;
        }

        public Criteria andForeigndollarBetween(Float value1, Float value2) {
            addCriterion("foreignDollar between", value1, value2, "foreigndollar");
            return (Criteria) this;
        }

        public Criteria andForeigndollarNotBetween(Float value1, Float value2) {
            addCriterion("foreignDollar not between", value1, value2, "foreigndollar");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarIsNull() {
            addCriterion("domesticDollar is null");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarIsNotNull() {
            addCriterion("domesticDollar is not null");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarEqualTo(Float value) {
            addCriterion("domesticDollar =", value, "domesticdollar");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarNotEqualTo(Float value) {
            addCriterion("domesticDollar <>", value, "domesticdollar");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarGreaterThan(Float value) {
            addCriterion("domesticDollar >", value, "domesticdollar");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarGreaterThanOrEqualTo(Float value) {
            addCriterion("domesticDollar >=", value, "domesticdollar");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarLessThan(Float value) {
            addCriterion("domesticDollar <", value, "domesticdollar");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarLessThanOrEqualTo(Float value) {
            addCriterion("domesticDollar <=", value, "domesticdollar");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarIn(List<Float> values) {
            addCriterion("domesticDollar in", values, "domesticdollar");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarNotIn(List<Float> values) {
            addCriterion("domesticDollar not in", values, "domesticdollar");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarBetween(Float value1, Float value2) {
            addCriterion("domesticDollar between", value1, value2, "domesticdollar");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarNotBetween(Float value1, Float value2) {
            addCriterion("domesticDollar not between", value1, value2, "domesticdollar");
            return (Criteria) this;
        }

        public Criteria andIsapplepayIsNull() {
            addCriterion("isApplePay is null");
            return (Criteria) this;
        }

        public Criteria andIsapplepayIsNotNull() {
            addCriterion("isApplePay is not null");
            return (Criteria) this;
        }

        public Criteria andIsapplepayEqualTo(Integer value) {
            addCriterion("isApplePay =", value, "isapplepay");
            return (Criteria) this;
        }

        public Criteria andIsapplepayNotEqualTo(Integer value) {
            addCriterion("isApplePay <>", value, "isapplepay");
            return (Criteria) this;
        }

        public Criteria andIsapplepayGreaterThan(Integer value) {
            addCriterion("isApplePay >", value, "isapplepay");
            return (Criteria) this;
        }

        public Criteria andIsapplepayGreaterThanOrEqualTo(Integer value) {
            addCriterion("isApplePay >=", value, "isapplepay");
            return (Criteria) this;
        }

        public Criteria andIsapplepayLessThan(Integer value) {
            addCriterion("isApplePay <", value, "isapplepay");
            return (Criteria) this;
        }

        public Criteria andIsapplepayLessThanOrEqualTo(Integer value) {
            addCriterion("isApplePay <=", value, "isapplepay");
            return (Criteria) this;
        }

        public Criteria andIsapplepayIn(List<Integer> values) {
            addCriterion("isApplePay in", values, "isapplepay");
            return (Criteria) this;
        }

        public Criteria andIsapplepayNotIn(List<Integer> values) {
            addCriterion("isApplePay not in", values, "isapplepay");
            return (Criteria) this;
        }

        public Criteria andIsapplepayBetween(Integer value1, Integer value2) {
            addCriterion("isApplePay between", value1, value2, "isapplepay");
            return (Criteria) this;
        }

        public Criteria andIsapplepayNotBetween(Integer value1, Integer value2) {
            addCriterion("isApplePay not between", value1, value2, "isapplepay");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIsNull() {
            addCriterion("createdtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIsNotNull() {
            addCriterion("createdtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeEqualTo(Date value) {
            addCriterion("createdtime =", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotEqualTo(Date value) {
            addCriterion("createdtime <>", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeGreaterThan(Date value) {
            addCriterion("createdtime >", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createdtime >=", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeLessThan(Date value) {
            addCriterion("createdtime <", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeLessThanOrEqualTo(Date value) {
            addCriterion("createdtime <=", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIn(List<Date> values) {
            addCriterion("createdtime in", values, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotIn(List<Date> values) {
            addCriterion("createdtime not in", values, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeBetween(Date value1, Date value2) {
            addCriterion("createdtime between", value1, value2, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotBetween(Date value1, Date value2) {
            addCriterion("createdtime not between", value1, value2, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNull() {
            addCriterion("creatorid is null");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNotNull() {
            addCriterion("creatorid is not null");
            return (Criteria) this;
        }

        public Criteria andCreatoridEqualTo(Integer value) {
            addCriterion("creatorid =", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotEqualTo(Integer value) {
            addCriterion("creatorid <>", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThan(Integer value) {
            addCriterion("creatorid >", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("creatorid >=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThan(Integer value) {
            addCriterion("creatorid <", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThanOrEqualTo(Integer value) {
            addCriterion("creatorid <=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridIn(List<Integer> values) {
            addCriterion("creatorid in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotIn(List<Integer> values) {
            addCriterion("creatorid not in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridBetween(Integer value1, Integer value2) {
            addCriterion("creatorid between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotBetween(Integer value1, Integer value2) {
            addCriterion("creatorid not between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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