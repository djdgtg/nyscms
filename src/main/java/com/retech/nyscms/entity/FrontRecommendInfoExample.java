package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.List;

public class FrontRecommendInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontRecommendInfoExample() {
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
            addCriterion("seqID is null");
            return (Criteria) this;
        }

        public Criteria andSeqidIsNotNull() {
            addCriterion("seqID is not null");
            return (Criteria) this;
        }

        public Criteria andSeqidEqualTo(Integer value) {
            addCriterion("seqID =", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotEqualTo(Integer value) {
            addCriterion("seqID <>", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidGreaterThan(Integer value) {
            addCriterion("seqID >", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidGreaterThanOrEqualTo(Integer value) {
            addCriterion("seqID >=", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidLessThan(Integer value) {
            addCriterion("seqID <", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidLessThanOrEqualTo(Integer value) {
            addCriterion("seqID <=", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidIn(List<Integer> values) {
            addCriterion("seqID in", values, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotIn(List<Integer> values) {
            addCriterion("seqID not in", values, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidBetween(Integer value1, Integer value2) {
            addCriterion("seqID between", value1, value2, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotBetween(Integer value1, Integer value2) {
            addCriterion("seqID not between", value1, value2, "seqid");
            return (Criteria) this;
        }

        public Criteria andRecommendidIsNull() {
            addCriterion("recommendID is null");
            return (Criteria) this;
        }

        public Criteria andRecommendidIsNotNull() {
            addCriterion("recommendID is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendidEqualTo(Integer value) {
            addCriterion("recommendID =", value, "recommendid");
            return (Criteria) this;
        }

        public Criteria andRecommendidNotEqualTo(Integer value) {
            addCriterion("recommendID <>", value, "recommendid");
            return (Criteria) this;
        }

        public Criteria andRecommendidGreaterThan(Integer value) {
            addCriterion("recommendID >", value, "recommendid");
            return (Criteria) this;
        }

        public Criteria andRecommendidGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommendID >=", value, "recommendid");
            return (Criteria) this;
        }

        public Criteria andRecommendidLessThan(Integer value) {
            addCriterion("recommendID <", value, "recommendid");
            return (Criteria) this;
        }

        public Criteria andRecommendidLessThanOrEqualTo(Integer value) {
            addCriterion("recommendID <=", value, "recommendid");
            return (Criteria) this;
        }

        public Criteria andRecommendidIn(List<Integer> values) {
            addCriterion("recommendID in", values, "recommendid");
            return (Criteria) this;
        }

        public Criteria andRecommendidNotIn(List<Integer> values) {
            addCriterion("recommendID not in", values, "recommendid");
            return (Criteria) this;
        }

        public Criteria andRecommendidBetween(Integer value1, Integer value2) {
            addCriterion("recommendID between", value1, value2, "recommendid");
            return (Criteria) this;
        }

        public Criteria andRecommendidNotBetween(Integer value1, Integer value2) {
            addCriterion("recommendID not between", value1, value2, "recommendid");
            return (Criteria) this;
        }

        public Criteria andRecommendedidIsNull() {
            addCriterion("RecommendedID is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedidIsNotNull() {
            addCriterion("RecommendedID is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedidEqualTo(Integer value) {
            addCriterion("RecommendedID =", value, "recommendedid");
            return (Criteria) this;
        }

        public Criteria andRecommendedidNotEqualTo(Integer value) {
            addCriterion("RecommendedID <>", value, "recommendedid");
            return (Criteria) this;
        }

        public Criteria andRecommendedidGreaterThan(Integer value) {
            addCriterion("RecommendedID >", value, "recommendedid");
            return (Criteria) this;
        }

        public Criteria andRecommendedidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RecommendedID >=", value, "recommendedid");
            return (Criteria) this;
        }

        public Criteria andRecommendedidLessThan(Integer value) {
            addCriterion("RecommendedID <", value, "recommendedid");
            return (Criteria) this;
        }

        public Criteria andRecommendedidLessThanOrEqualTo(Integer value) {
            addCriterion("RecommendedID <=", value, "recommendedid");
            return (Criteria) this;
        }

        public Criteria andRecommendedidIn(List<Integer> values) {
            addCriterion("RecommendedID in", values, "recommendedid");
            return (Criteria) this;
        }

        public Criteria andRecommendedidNotIn(List<Integer> values) {
            addCriterion("RecommendedID not in", values, "recommendedid");
            return (Criteria) this;
        }

        public Criteria andRecommendedidBetween(Integer value1, Integer value2) {
            addCriterion("RecommendedID between", value1, value2, "recommendedid");
            return (Criteria) this;
        }

        public Criteria andRecommendedidNotBetween(Integer value1, Integer value2) {
            addCriterion("RecommendedID not between", value1, value2, "recommendedid");
            return (Criteria) this;
        }

        public Criteria andEbookidIsNull() {
            addCriterion("eBookID is null");
            return (Criteria) this;
        }

        public Criteria andEbookidIsNotNull() {
            addCriterion("eBookID is not null");
            return (Criteria) this;
        }

        public Criteria andEbookidEqualTo(Integer value) {
            addCriterion("eBookID =", value, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidNotEqualTo(Integer value) {
            addCriterion("eBookID <>", value, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidGreaterThan(Integer value) {
            addCriterion("eBookID >", value, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eBookID >=", value, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidLessThan(Integer value) {
            addCriterion("eBookID <", value, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidLessThanOrEqualTo(Integer value) {
            addCriterion("eBookID <=", value, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidIn(List<Integer> values) {
            addCriterion("eBookID in", values, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidNotIn(List<Integer> values) {
            addCriterion("eBookID not in", values, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidBetween(Integer value1, Integer value2) {
            addCriterion("eBookID between", value1, value2, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidNotBetween(Integer value1, Integer value2) {
            addCriterion("eBookID not between", value1, value2, "ebookid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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