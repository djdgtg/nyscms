package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontCoinrateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontCoinrateExample() {
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

        public Criteria andDomesticrateIsNull() {
            addCriterion("domesticrate is null");
            return (Criteria) this;
        }

        public Criteria andDomesticrateIsNotNull() {
            addCriterion("domesticrate is not null");
            return (Criteria) this;
        }

        public Criteria andDomesticrateEqualTo(Float value) {
            addCriterion("domesticrate =", value, "domesticrate");
            return (Criteria) this;
        }

        public Criteria andDomesticrateNotEqualTo(Float value) {
            addCriterion("domesticrate <>", value, "domesticrate");
            return (Criteria) this;
        }

        public Criteria andDomesticrateGreaterThan(Float value) {
            addCriterion("domesticrate >", value, "domesticrate");
            return (Criteria) this;
        }

        public Criteria andDomesticrateGreaterThanOrEqualTo(Float value) {
            addCriterion("domesticrate >=", value, "domesticrate");
            return (Criteria) this;
        }

        public Criteria andDomesticrateLessThan(Float value) {
            addCriterion("domesticrate <", value, "domesticrate");
            return (Criteria) this;
        }

        public Criteria andDomesticrateLessThanOrEqualTo(Float value) {
            addCriterion("domesticrate <=", value, "domesticrate");
            return (Criteria) this;
        }

        public Criteria andDomesticrateIn(List<Float> values) {
            addCriterion("domesticrate in", values, "domesticrate");
            return (Criteria) this;
        }

        public Criteria andDomesticrateNotIn(List<Float> values) {
            addCriterion("domesticrate not in", values, "domesticrate");
            return (Criteria) this;
        }

        public Criteria andDomesticrateBetween(Float value1, Float value2) {
            addCriterion("domesticrate between", value1, value2, "domesticrate");
            return (Criteria) this;
        }

        public Criteria andDomesticrateNotBetween(Float value1, Float value2) {
            addCriterion("domesticrate not between", value1, value2, "domesticrate");
            return (Criteria) this;
        }

        public Criteria andForeignrateIsNull() {
            addCriterion("foreignrate is null");
            return (Criteria) this;
        }

        public Criteria andForeignrateIsNotNull() {
            addCriterion("foreignrate is not null");
            return (Criteria) this;
        }

        public Criteria andForeignrateEqualTo(Float value) {
            addCriterion("foreignrate =", value, "foreignrate");
            return (Criteria) this;
        }

        public Criteria andForeignrateNotEqualTo(Float value) {
            addCriterion("foreignrate <>", value, "foreignrate");
            return (Criteria) this;
        }

        public Criteria andForeignrateGreaterThan(Float value) {
            addCriterion("foreignrate >", value, "foreignrate");
            return (Criteria) this;
        }

        public Criteria andForeignrateGreaterThanOrEqualTo(Float value) {
            addCriterion("foreignrate >=", value, "foreignrate");
            return (Criteria) this;
        }

        public Criteria andForeignrateLessThan(Float value) {
            addCriterion("foreignrate <", value, "foreignrate");
            return (Criteria) this;
        }

        public Criteria andForeignrateLessThanOrEqualTo(Float value) {
            addCriterion("foreignrate <=", value, "foreignrate");
            return (Criteria) this;
        }

        public Criteria andForeignrateIn(List<Float> values) {
            addCriterion("foreignrate in", values, "foreignrate");
            return (Criteria) this;
        }

        public Criteria andForeignrateNotIn(List<Float> values) {
            addCriterion("foreignrate not in", values, "foreignrate");
            return (Criteria) this;
        }

        public Criteria andForeignrateBetween(Float value1, Float value2) {
            addCriterion("foreignrate between", value1, value2, "foreignrate");
            return (Criteria) this;
        }

        public Criteria andForeignrateNotBetween(Float value1, Float value2) {
            addCriterion("foreignrate not between", value1, value2, "foreignrate");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarrateIsNull() {
            addCriterion("domesticdollarrate is null");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarrateIsNotNull() {
            addCriterion("domesticdollarrate is not null");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarrateEqualTo(Float value) {
            addCriterion("domesticdollarrate =", value, "domesticdollarrate");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarrateNotEqualTo(Float value) {
            addCriterion("domesticdollarrate <>", value, "domesticdollarrate");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarrateGreaterThan(Float value) {
            addCriterion("domesticdollarrate >", value, "domesticdollarrate");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarrateGreaterThanOrEqualTo(Float value) {
            addCriterion("domesticdollarrate >=", value, "domesticdollarrate");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarrateLessThan(Float value) {
            addCriterion("domesticdollarrate <", value, "domesticdollarrate");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarrateLessThanOrEqualTo(Float value) {
            addCriterion("domesticdollarrate <=", value, "domesticdollarrate");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarrateIn(List<Float> values) {
            addCriterion("domesticdollarrate in", values, "domesticdollarrate");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarrateNotIn(List<Float> values) {
            addCriterion("domesticdollarrate not in", values, "domesticdollarrate");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarrateBetween(Float value1, Float value2) {
            addCriterion("domesticdollarrate between", value1, value2, "domesticdollarrate");
            return (Criteria) this;
        }

        public Criteria andDomesticdollarrateNotBetween(Float value1, Float value2) {
            addCriterion("domesticdollarrate not between", value1, value2, "domesticdollarrate");
            return (Criteria) this;
        }

        public Criteria andForeigndollarrateIsNull() {
            addCriterion("foreigndollarrate is null");
            return (Criteria) this;
        }

        public Criteria andForeigndollarrateIsNotNull() {
            addCriterion("foreigndollarrate is not null");
            return (Criteria) this;
        }

        public Criteria andForeigndollarrateEqualTo(Float value) {
            addCriterion("foreigndollarrate =", value, "foreigndollarrate");
            return (Criteria) this;
        }

        public Criteria andForeigndollarrateNotEqualTo(Float value) {
            addCriterion("foreigndollarrate <>", value, "foreigndollarrate");
            return (Criteria) this;
        }

        public Criteria andForeigndollarrateGreaterThan(Float value) {
            addCriterion("foreigndollarrate >", value, "foreigndollarrate");
            return (Criteria) this;
        }

        public Criteria andForeigndollarrateGreaterThanOrEqualTo(Float value) {
            addCriterion("foreigndollarrate >=", value, "foreigndollarrate");
            return (Criteria) this;
        }

        public Criteria andForeigndollarrateLessThan(Float value) {
            addCriterion("foreigndollarrate <", value, "foreigndollarrate");
            return (Criteria) this;
        }

        public Criteria andForeigndollarrateLessThanOrEqualTo(Float value) {
            addCriterion("foreigndollarrate <=", value, "foreigndollarrate");
            return (Criteria) this;
        }

        public Criteria andForeigndollarrateIn(List<Float> values) {
            addCriterion("foreigndollarrate in", values, "foreigndollarrate");
            return (Criteria) this;
        }

        public Criteria andForeigndollarrateNotIn(List<Float> values) {
            addCriterion("foreigndollarrate not in", values, "foreigndollarrate");
            return (Criteria) this;
        }

        public Criteria andForeigndollarrateBetween(Float value1, Float value2) {
            addCriterion("foreigndollarrate between", value1, value2, "foreigndollarrate");
            return (Criteria) this;
        }

        public Criteria andForeigndollarrateNotBetween(Float value1, Float value2) {
            addCriterion("foreigndollarrate not between", value1, value2, "foreigndollarrate");
            return (Criteria) this;
        }

        public Criteria andIntegralrateIsNull() {
            addCriterion("integralrate is null");
            return (Criteria) this;
        }

        public Criteria andIntegralrateIsNotNull() {
            addCriterion("integralrate is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralrateEqualTo(Float value) {
            addCriterion("integralrate =", value, "integralrate");
            return (Criteria) this;
        }

        public Criteria andIntegralrateNotEqualTo(Float value) {
            addCriterion("integralrate <>", value, "integralrate");
            return (Criteria) this;
        }

        public Criteria andIntegralrateGreaterThan(Float value) {
            addCriterion("integralrate >", value, "integralrate");
            return (Criteria) this;
        }

        public Criteria andIntegralrateGreaterThanOrEqualTo(Float value) {
            addCriterion("integralrate >=", value, "integralrate");
            return (Criteria) this;
        }

        public Criteria andIntegralrateLessThan(Float value) {
            addCriterion("integralrate <", value, "integralrate");
            return (Criteria) this;
        }

        public Criteria andIntegralrateLessThanOrEqualTo(Float value) {
            addCriterion("integralrate <=", value, "integralrate");
            return (Criteria) this;
        }

        public Criteria andIntegralrateIn(List<Float> values) {
            addCriterion("integralrate in", values, "integralrate");
            return (Criteria) this;
        }

        public Criteria andIntegralrateNotIn(List<Float> values) {
            addCriterion("integralrate not in", values, "integralrate");
            return (Criteria) this;
        }

        public Criteria andIntegralrateBetween(Float value1, Float value2) {
            addCriterion("integralrate between", value1, value2, "integralrate");
            return (Criteria) this;
        }

        public Criteria andIntegralrateNotBetween(Float value1, Float value2) {
            addCriterion("integralrate not between", value1, value2, "integralrate");
            return (Criteria) this;
        }

        public Criteria andIntegralpercentIsNull() {
            addCriterion("integralpercent is null");
            return (Criteria) this;
        }

        public Criteria andIntegralpercentIsNotNull() {
            addCriterion("integralpercent is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralpercentEqualTo(Float value) {
            addCriterion("integralpercent =", value, "integralpercent");
            return (Criteria) this;
        }

        public Criteria andIntegralpercentNotEqualTo(Float value) {
            addCriterion("integralpercent <>", value, "integralpercent");
            return (Criteria) this;
        }

        public Criteria andIntegralpercentGreaterThan(Float value) {
            addCriterion("integralpercent >", value, "integralpercent");
            return (Criteria) this;
        }

        public Criteria andIntegralpercentGreaterThanOrEqualTo(Float value) {
            addCriterion("integralpercent >=", value, "integralpercent");
            return (Criteria) this;
        }

        public Criteria andIntegralpercentLessThan(Float value) {
            addCriterion("integralpercent <", value, "integralpercent");
            return (Criteria) this;
        }

        public Criteria andIntegralpercentLessThanOrEqualTo(Float value) {
            addCriterion("integralpercent <=", value, "integralpercent");
            return (Criteria) this;
        }

        public Criteria andIntegralpercentIn(List<Float> values) {
            addCriterion("integralpercent in", values, "integralpercent");
            return (Criteria) this;
        }

        public Criteria andIntegralpercentNotIn(List<Float> values) {
            addCriterion("integralpercent not in", values, "integralpercent");
            return (Criteria) this;
        }

        public Criteria andIntegralpercentBetween(Float value1, Float value2) {
            addCriterion("integralpercent between", value1, value2, "integralpercent");
            return (Criteria) this;
        }

        public Criteria andIntegralpercentNotBetween(Float value1, Float value2) {
            addCriterion("integralpercent not between", value1, value2, "integralpercent");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
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