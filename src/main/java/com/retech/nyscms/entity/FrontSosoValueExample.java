package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontSosoValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontSosoValueExample() {
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

        public Criteria andSosovalueIsNull() {
            addCriterion("sosovalue is null");
            return (Criteria) this;
        }

        public Criteria andSosovalueIsNotNull() {
            addCriterion("sosovalue is not null");
            return (Criteria) this;
        }

        public Criteria andSosovalueEqualTo(String value) {
            addCriterion("sosovalue =", value, "sosovalue");
            return (Criteria) this;
        }

        public Criteria andSosovalueNotEqualTo(String value) {
            addCriterion("sosovalue <>", value, "sosovalue");
            return (Criteria) this;
        }

        public Criteria andSosovalueGreaterThan(String value) {
            addCriterion("sosovalue >", value, "sosovalue");
            return (Criteria) this;
        }

        public Criteria andSosovalueGreaterThanOrEqualTo(String value) {
            addCriterion("sosovalue >=", value, "sosovalue");
            return (Criteria) this;
        }

        public Criteria andSosovalueLessThan(String value) {
            addCriterion("sosovalue <", value, "sosovalue");
            return (Criteria) this;
        }

        public Criteria andSosovalueLessThanOrEqualTo(String value) {
            addCriterion("sosovalue <=", value, "sosovalue");
            return (Criteria) this;
        }

        public Criteria andSosovalueLike(String value) {
            addCriterion("sosovalue like", value, "sosovalue");
            return (Criteria) this;
        }

        public Criteria andSosovalueNotLike(String value) {
            addCriterion("sosovalue not like", value, "sosovalue");
            return (Criteria) this;
        }

        public Criteria andSosovalueIn(List<String> values) {
            addCriterion("sosovalue in", values, "sosovalue");
            return (Criteria) this;
        }

        public Criteria andSosovalueNotIn(List<String> values) {
            addCriterion("sosovalue not in", values, "sosovalue");
            return (Criteria) this;
        }

        public Criteria andSosovalueBetween(String value1, String value2) {
            addCriterion("sosovalue between", value1, value2, "sosovalue");
            return (Criteria) this;
        }

        public Criteria andSosovalueNotBetween(String value1, String value2) {
            addCriterion("sosovalue not between", value1, value2, "sosovalue");
            return (Criteria) this;
        }

        public Criteria andSosotypeIsNull() {
            addCriterion("sosoType is null");
            return (Criteria) this;
        }

        public Criteria andSosotypeIsNotNull() {
            addCriterion("sosoType is not null");
            return (Criteria) this;
        }

        public Criteria andSosotypeEqualTo(Integer value) {
            addCriterion("sosoType =", value, "sosotype");
            return (Criteria) this;
        }

        public Criteria andSosotypeNotEqualTo(Integer value) {
            addCriterion("sosoType <>", value, "sosotype");
            return (Criteria) this;
        }

        public Criteria andSosotypeGreaterThan(Integer value) {
            addCriterion("sosoType >", value, "sosotype");
            return (Criteria) this;
        }

        public Criteria andSosotypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sosoType >=", value, "sosotype");
            return (Criteria) this;
        }

        public Criteria andSosotypeLessThan(Integer value) {
            addCriterion("sosoType <", value, "sosotype");
            return (Criteria) this;
        }

        public Criteria andSosotypeLessThanOrEqualTo(Integer value) {
            addCriterion("sosoType <=", value, "sosotype");
            return (Criteria) this;
        }

        public Criteria andSosotypeIn(List<Integer> values) {
            addCriterion("sosoType in", values, "sosotype");
            return (Criteria) this;
        }

        public Criteria andSosotypeNotIn(List<Integer> values) {
            addCriterion("sosoType not in", values, "sosotype");
            return (Criteria) this;
        }

        public Criteria andSosotypeBetween(Integer value1, Integer value2) {
            addCriterion("sosoType between", value1, value2, "sosotype");
            return (Criteria) this;
        }

        public Criteria andSosotypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sosoType not between", value1, value2, "sosotype");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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