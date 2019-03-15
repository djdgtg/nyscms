package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.List;

public class BaseClassesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseClassesExample() {
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

        public Criteria andClassidIsNull() {
            addCriterion("ClassID is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("ClassID is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Integer value) {
            addCriterion("ClassID =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Integer value) {
            addCriterion("ClassID <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Integer value) {
            addCriterion("ClassID >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ClassID >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Integer value) {
            addCriterion("ClassID <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Integer value) {
            addCriterion("ClassID <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Integer> values) {
            addCriterion("ClassID in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Integer> values) {
            addCriterion("ClassID not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Integer value1, Integer value2) {
            addCriterion("ClassID between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("ClassID not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andParentclassidIsNull() {
            addCriterion("ParentClassID is null");
            return (Criteria) this;
        }

        public Criteria andParentclassidIsNotNull() {
            addCriterion("ParentClassID is not null");
            return (Criteria) this;
        }

        public Criteria andParentclassidEqualTo(Integer value) {
            addCriterion("ParentClassID =", value, "parentclassid");
            return (Criteria) this;
        }

        public Criteria andParentclassidNotEqualTo(Integer value) {
            addCriterion("ParentClassID <>", value, "parentclassid");
            return (Criteria) this;
        }

        public Criteria andParentclassidGreaterThan(Integer value) {
            addCriterion("ParentClassID >", value, "parentclassid");
            return (Criteria) this;
        }

        public Criteria andParentclassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentClassID >=", value, "parentclassid");
            return (Criteria) this;
        }

        public Criteria andParentclassidLessThan(Integer value) {
            addCriterion("ParentClassID <", value, "parentclassid");
            return (Criteria) this;
        }

        public Criteria andParentclassidLessThanOrEqualTo(Integer value) {
            addCriterion("ParentClassID <=", value, "parentclassid");
            return (Criteria) this;
        }

        public Criteria andParentclassidIn(List<Integer> values) {
            addCriterion("ParentClassID in", values, "parentclassid");
            return (Criteria) this;
        }

        public Criteria andParentclassidNotIn(List<Integer> values) {
            addCriterion("ParentClassID not in", values, "parentclassid");
            return (Criteria) this;
        }

        public Criteria andParentclassidBetween(Integer value1, Integer value2) {
            addCriterion("ParentClassID between", value1, value2, "parentclassid");
            return (Criteria) this;
        }

        public Criteria andParentclassidNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentClassID not between", value1, value2, "parentclassid");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("ClassName is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("ClassName is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("ClassName =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("ClassName <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("ClassName >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("ClassName >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("ClassName <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("ClassName <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("ClassName like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("ClassName not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("ClassName in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("ClassName not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("ClassName between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("ClassName not between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andEnClassnameIsNull() {
            addCriterion("en_ClassName is null");
            return (Criteria) this;
        }

        public Criteria andEnClassnameIsNotNull() {
            addCriterion("en_ClassName is not null");
            return (Criteria) this;
        }

        public Criteria andEnClassnameEqualTo(String value) {
            addCriterion("en_ClassName =", value, "enClassname");
            return (Criteria) this;
        }

        public Criteria andEnClassnameNotEqualTo(String value) {
            addCriterion("en_ClassName <>", value, "enClassname");
            return (Criteria) this;
        }

        public Criteria andEnClassnameGreaterThan(String value) {
            addCriterion("en_ClassName >", value, "enClassname");
            return (Criteria) this;
        }

        public Criteria andEnClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("en_ClassName >=", value, "enClassname");
            return (Criteria) this;
        }

        public Criteria andEnClassnameLessThan(String value) {
            addCriterion("en_ClassName <", value, "enClassname");
            return (Criteria) this;
        }

        public Criteria andEnClassnameLessThanOrEqualTo(String value) {
            addCriterion("en_ClassName <=", value, "enClassname");
            return (Criteria) this;
        }

        public Criteria andEnClassnameLike(String value) {
            addCriterion("en_ClassName like", value, "enClassname");
            return (Criteria) this;
        }

        public Criteria andEnClassnameNotLike(String value) {
            addCriterion("en_ClassName not like", value, "enClassname");
            return (Criteria) this;
        }

        public Criteria andEnClassnameIn(List<String> values) {
            addCriterion("en_ClassName in", values, "enClassname");
            return (Criteria) this;
        }

        public Criteria andEnClassnameNotIn(List<String> values) {
            addCriterion("en_ClassName not in", values, "enClassname");
            return (Criteria) this;
        }

        public Criteria andEnClassnameBetween(String value1, String value2) {
            addCriterion("en_ClassName between", value1, value2, "enClassname");
            return (Criteria) this;
        }

        public Criteria andEnClassnameNotBetween(String value1, String value2) {
            addCriterion("en_ClassName not between", value1, value2, "enClassname");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("Remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("Remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("Remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("Remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("Remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("Remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("Remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("Remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("Remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("Remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("Remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("Remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("Remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("Remarks not between", value1, value2, "remarks");
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