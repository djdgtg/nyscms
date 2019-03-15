package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontUserExpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontUserExpExample() {
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

        public Criteria andExpidIsNull() {
            addCriterion("expID is null");
            return (Criteria) this;
        }

        public Criteria andExpidIsNotNull() {
            addCriterion("expID is not null");
            return (Criteria) this;
        }

        public Criteria andExpidEqualTo(Integer value) {
            addCriterion("expID =", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidNotEqualTo(Integer value) {
            addCriterion("expID <>", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidGreaterThan(Integer value) {
            addCriterion("expID >", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("expID >=", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidLessThan(Integer value) {
            addCriterion("expID <", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidLessThanOrEqualTo(Integer value) {
            addCriterion("expID <=", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidIn(List<Integer> values) {
            addCriterion("expID in", values, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidNotIn(List<Integer> values) {
            addCriterion("expID not in", values, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidBetween(Integer value1, Integer value2) {
            addCriterion("expID between", value1, value2, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidNotBetween(Integer value1, Integer value2) {
            addCriterion("expID not between", value1, value2, "expid");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNull() {
            addCriterion("beginTime is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("beginTime is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(Date value) {
            addCriterion("beginTime =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(Date value) {
            addCriterion("beginTime <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(Date value) {
            addCriterion("beginTime >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("beginTime >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(Date value) {
            addCriterion("beginTime <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("beginTime <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<Date> values) {
            addCriterion("beginTime in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<Date> values) {
            addCriterion("beginTime not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(Date value1, Date value2) {
            addCriterion("beginTime between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("beginTime not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andExptimeIsNull() {
            addCriterion("expTime is null");
            return (Criteria) this;
        }

        public Criteria andExptimeIsNotNull() {
            addCriterion("expTime is not null");
            return (Criteria) this;
        }

        public Criteria andExptimeEqualTo(Integer value) {
            addCriterion("expTime =", value, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeNotEqualTo(Integer value) {
            addCriterion("expTime <>", value, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeGreaterThan(Integer value) {
            addCriterion("expTime >", value, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("expTime >=", value, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeLessThan(Integer value) {
            addCriterion("expTime <", value, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeLessThanOrEqualTo(Integer value) {
            addCriterion("expTime <=", value, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeIn(List<Integer> values) {
            addCriterion("expTime in", values, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeNotIn(List<Integer> values) {
            addCriterion("expTime not in", values, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeBetween(Integer value1, Integer value2) {
            addCriterion("expTime between", value1, value2, "exptime");
            return (Criteria) this;
        }

        public Criteria andExptimeNotBetween(Integer value1, Integer value2) {
            addCriterion("expTime not between", value1, value2, "exptime");
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