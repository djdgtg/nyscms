package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontSearchRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontSearchRecordExample() {
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

        public Criteria andSerachidIsNull() {
            addCriterion("serachID is null");
            return (Criteria) this;
        }

        public Criteria andSerachidIsNotNull() {
            addCriterion("serachID is not null");
            return (Criteria) this;
        }

        public Criteria andSerachidEqualTo(Integer value) {
            addCriterion("serachID =", value, "serachid");
            return (Criteria) this;
        }

        public Criteria andSerachidNotEqualTo(Integer value) {
            addCriterion("serachID <>", value, "serachid");
            return (Criteria) this;
        }

        public Criteria andSerachidGreaterThan(Integer value) {
            addCriterion("serachID >", value, "serachid");
            return (Criteria) this;
        }

        public Criteria andSerachidGreaterThanOrEqualTo(Integer value) {
            addCriterion("serachID >=", value, "serachid");
            return (Criteria) this;
        }

        public Criteria andSerachidLessThan(Integer value) {
            addCriterion("serachID <", value, "serachid");
            return (Criteria) this;
        }

        public Criteria andSerachidLessThanOrEqualTo(Integer value) {
            addCriterion("serachID <=", value, "serachid");
            return (Criteria) this;
        }

        public Criteria andSerachidIn(List<Integer> values) {
            addCriterion("serachID in", values, "serachid");
            return (Criteria) this;
        }

        public Criteria andSerachidNotIn(List<Integer> values) {
            addCriterion("serachID not in", values, "serachid");
            return (Criteria) this;
        }

        public Criteria andSerachidBetween(Integer value1, Integer value2) {
            addCriterion("serachID between", value1, value2, "serachid");
            return (Criteria) this;
        }

        public Criteria andSerachidNotBetween(Integer value1, Integer value2) {
            addCriterion("serachID not between", value1, value2, "serachid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andSerachvalueIsNull() {
            addCriterion("serachValue is null");
            return (Criteria) this;
        }

        public Criteria andSerachvalueIsNotNull() {
            addCriterion("serachValue is not null");
            return (Criteria) this;
        }

        public Criteria andSerachvalueEqualTo(String value) {
            addCriterion("serachValue =", value, "serachvalue");
            return (Criteria) this;
        }

        public Criteria andSerachvalueNotEqualTo(String value) {
            addCriterion("serachValue <>", value, "serachvalue");
            return (Criteria) this;
        }

        public Criteria andSerachvalueGreaterThan(String value) {
            addCriterion("serachValue >", value, "serachvalue");
            return (Criteria) this;
        }

        public Criteria andSerachvalueGreaterThanOrEqualTo(String value) {
            addCriterion("serachValue >=", value, "serachvalue");
            return (Criteria) this;
        }

        public Criteria andSerachvalueLessThan(String value) {
            addCriterion("serachValue <", value, "serachvalue");
            return (Criteria) this;
        }

        public Criteria andSerachvalueLessThanOrEqualTo(String value) {
            addCriterion("serachValue <=", value, "serachvalue");
            return (Criteria) this;
        }

        public Criteria andSerachvalueLike(String value) {
            addCriterion("serachValue like", value, "serachvalue");
            return (Criteria) this;
        }

        public Criteria andSerachvalueNotLike(String value) {
            addCriterion("serachValue not like", value, "serachvalue");
            return (Criteria) this;
        }

        public Criteria andSerachvalueIn(List<String> values) {
            addCriterion("serachValue in", values, "serachvalue");
            return (Criteria) this;
        }

        public Criteria andSerachvalueNotIn(List<String> values) {
            addCriterion("serachValue not in", values, "serachvalue");
            return (Criteria) this;
        }

        public Criteria andSerachvalueBetween(String value1, String value2) {
            addCriterion("serachValue between", value1, value2, "serachvalue");
            return (Criteria) this;
        }

        public Criteria andSerachvalueNotBetween(String value1, String value2) {
            addCriterion("serachValue not between", value1, value2, "serachvalue");
            return (Criteria) this;
        }

        public Criteria andSerachdateIsNull() {
            addCriterion("serachDate is null");
            return (Criteria) this;
        }

        public Criteria andSerachdateIsNotNull() {
            addCriterion("serachDate is not null");
            return (Criteria) this;
        }

        public Criteria andSerachdateEqualTo(Date value) {
            addCriterion("serachDate =", value, "serachdate");
            return (Criteria) this;
        }

        public Criteria andSerachdateNotEqualTo(Date value) {
            addCriterion("serachDate <>", value, "serachdate");
            return (Criteria) this;
        }

        public Criteria andSerachdateGreaterThan(Date value) {
            addCriterion("serachDate >", value, "serachdate");
            return (Criteria) this;
        }

        public Criteria andSerachdateGreaterThanOrEqualTo(Date value) {
            addCriterion("serachDate >=", value, "serachdate");
            return (Criteria) this;
        }

        public Criteria andSerachdateLessThan(Date value) {
            addCriterion("serachDate <", value, "serachdate");
            return (Criteria) this;
        }

        public Criteria andSerachdateLessThanOrEqualTo(Date value) {
            addCriterion("serachDate <=", value, "serachdate");
            return (Criteria) this;
        }

        public Criteria andSerachdateIn(List<Date> values) {
            addCriterion("serachDate in", values, "serachdate");
            return (Criteria) this;
        }

        public Criteria andSerachdateNotIn(List<Date> values) {
            addCriterion("serachDate not in", values, "serachdate");
            return (Criteria) this;
        }

        public Criteria andSerachdateBetween(Date value1, Date value2) {
            addCriterion("serachDate between", value1, value2, "serachdate");
            return (Criteria) this;
        }

        public Criteria andSerachdateNotBetween(Date value1, Date value2) {
            addCriterion("serachDate not between", value1, value2, "serachdate");
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