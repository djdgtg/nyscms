package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontUserExpendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontUserExpendExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andWeekbookIsNull() {
            addCriterion("weekbook is null");
            return (Criteria) this;
        }

        public Criteria andWeekbookIsNotNull() {
            addCriterion("weekbook is not null");
            return (Criteria) this;
        }

        public Criteria andWeekbookEqualTo(Integer value) {
            addCriterion("weekbook =", value, "weekbook");
            return (Criteria) this;
        }

        public Criteria andWeekbookNotEqualTo(Integer value) {
            addCriterion("weekbook <>", value, "weekbook");
            return (Criteria) this;
        }

        public Criteria andWeekbookGreaterThan(Integer value) {
            addCriterion("weekbook >", value, "weekbook");
            return (Criteria) this;
        }

        public Criteria andWeekbookGreaterThanOrEqualTo(Integer value) {
            addCriterion("weekbook >=", value, "weekbook");
            return (Criteria) this;
        }

        public Criteria andWeekbookLessThan(Integer value) {
            addCriterion("weekbook <", value, "weekbook");
            return (Criteria) this;
        }

        public Criteria andWeekbookLessThanOrEqualTo(Integer value) {
            addCriterion("weekbook <=", value, "weekbook");
            return (Criteria) this;
        }

        public Criteria andWeekbookIn(List<Integer> values) {
            addCriterion("weekbook in", values, "weekbook");
            return (Criteria) this;
        }

        public Criteria andWeekbookNotIn(List<Integer> values) {
            addCriterion("weekbook not in", values, "weekbook");
            return (Criteria) this;
        }

        public Criteria andWeekbookBetween(Integer value1, Integer value2) {
            addCriterion("weekbook between", value1, value2, "weekbook");
            return (Criteria) this;
        }

        public Criteria andWeekbookNotBetween(Integer value1, Integer value2) {
            addCriterion("weekbook not between", value1, value2, "weekbook");
            return (Criteria) this;
        }

        public Criteria andMonthbookIsNull() {
            addCriterion("monthbook is null");
            return (Criteria) this;
        }

        public Criteria andMonthbookIsNotNull() {
            addCriterion("monthbook is not null");
            return (Criteria) this;
        }

        public Criteria andMonthbookEqualTo(Integer value) {
            addCriterion("monthbook =", value, "monthbook");
            return (Criteria) this;
        }

        public Criteria andMonthbookNotEqualTo(Integer value) {
            addCriterion("monthbook <>", value, "monthbook");
            return (Criteria) this;
        }

        public Criteria andMonthbookGreaterThan(Integer value) {
            addCriterion("monthbook >", value, "monthbook");
            return (Criteria) this;
        }

        public Criteria andMonthbookGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthbook >=", value, "monthbook");
            return (Criteria) this;
        }

        public Criteria andMonthbookLessThan(Integer value) {
            addCriterion("monthbook <", value, "monthbook");
            return (Criteria) this;
        }

        public Criteria andMonthbookLessThanOrEqualTo(Integer value) {
            addCriterion("monthbook <=", value, "monthbook");
            return (Criteria) this;
        }

        public Criteria andMonthbookIn(List<Integer> values) {
            addCriterion("monthbook in", values, "monthbook");
            return (Criteria) this;
        }

        public Criteria andMonthbookNotIn(List<Integer> values) {
            addCriterion("monthbook not in", values, "monthbook");
            return (Criteria) this;
        }

        public Criteria andMonthbookBetween(Integer value1, Integer value2) {
            addCriterion("monthbook between", value1, value2, "monthbook");
            return (Criteria) this;
        }

        public Criteria andMonthbookNotBetween(Integer value1, Integer value2) {
            addCriterion("monthbook not between", value1, value2, "monthbook");
            return (Criteria) this;
        }

        public Criteria andWeekmoneyIsNull() {
            addCriterion("weekmoney is null");
            return (Criteria) this;
        }

        public Criteria andWeekmoneyIsNotNull() {
            addCriterion("weekmoney is not null");
            return (Criteria) this;
        }

        public Criteria andWeekmoneyEqualTo(Float value) {
            addCriterion("weekmoney =", value, "weekmoney");
            return (Criteria) this;
        }

        public Criteria andWeekmoneyNotEqualTo(Float value) {
            addCriterion("weekmoney <>", value, "weekmoney");
            return (Criteria) this;
        }

        public Criteria andWeekmoneyGreaterThan(Float value) {
            addCriterion("weekmoney >", value, "weekmoney");
            return (Criteria) this;
        }

        public Criteria andWeekmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("weekmoney >=", value, "weekmoney");
            return (Criteria) this;
        }

        public Criteria andWeekmoneyLessThan(Float value) {
            addCriterion("weekmoney <", value, "weekmoney");
            return (Criteria) this;
        }

        public Criteria andWeekmoneyLessThanOrEqualTo(Float value) {
            addCriterion("weekmoney <=", value, "weekmoney");
            return (Criteria) this;
        }

        public Criteria andWeekmoneyIn(List<Float> values) {
            addCriterion("weekmoney in", values, "weekmoney");
            return (Criteria) this;
        }

        public Criteria andWeekmoneyNotIn(List<Float> values) {
            addCriterion("weekmoney not in", values, "weekmoney");
            return (Criteria) this;
        }

        public Criteria andWeekmoneyBetween(Float value1, Float value2) {
            addCriterion("weekmoney between", value1, value2, "weekmoney");
            return (Criteria) this;
        }

        public Criteria andWeekmoneyNotBetween(Float value1, Float value2) {
            addCriterion("weekmoney not between", value1, value2, "weekmoney");
            return (Criteria) this;
        }

        public Criteria andMonthmoneyIsNull() {
            addCriterion("monthmoney is null");
            return (Criteria) this;
        }

        public Criteria andMonthmoneyIsNotNull() {
            addCriterion("monthmoney is not null");
            return (Criteria) this;
        }

        public Criteria andMonthmoneyEqualTo(Float value) {
            addCriterion("monthmoney =", value, "monthmoney");
            return (Criteria) this;
        }

        public Criteria andMonthmoneyNotEqualTo(Float value) {
            addCriterion("monthmoney <>", value, "monthmoney");
            return (Criteria) this;
        }

        public Criteria andMonthmoneyGreaterThan(Float value) {
            addCriterion("monthmoney >", value, "monthmoney");
            return (Criteria) this;
        }

        public Criteria andMonthmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("monthmoney >=", value, "monthmoney");
            return (Criteria) this;
        }

        public Criteria andMonthmoneyLessThan(Float value) {
            addCriterion("monthmoney <", value, "monthmoney");
            return (Criteria) this;
        }

        public Criteria andMonthmoneyLessThanOrEqualTo(Float value) {
            addCriterion("monthmoney <=", value, "monthmoney");
            return (Criteria) this;
        }

        public Criteria andMonthmoneyIn(List<Float> values) {
            addCriterion("monthmoney in", values, "monthmoney");
            return (Criteria) this;
        }

        public Criteria andMonthmoneyNotIn(List<Float> values) {
            addCriterion("monthmoney not in", values, "monthmoney");
            return (Criteria) this;
        }

        public Criteria andMonthmoneyBetween(Float value1, Float value2) {
            addCriterion("monthmoney between", value1, value2, "monthmoney");
            return (Criteria) this;
        }

        public Criteria andMonthmoneyNotBetween(Float value1, Float value2) {
            addCriterion("monthmoney not between", value1, value2, "monthmoney");
            return (Criteria) this;
        }

        public Criteria andWeekscoreIsNull() {
            addCriterion("weekscore is null");
            return (Criteria) this;
        }

        public Criteria andWeekscoreIsNotNull() {
            addCriterion("weekscore is not null");
            return (Criteria) this;
        }

        public Criteria andWeekscoreEqualTo(Integer value) {
            addCriterion("weekscore =", value, "weekscore");
            return (Criteria) this;
        }

        public Criteria andWeekscoreNotEqualTo(Integer value) {
            addCriterion("weekscore <>", value, "weekscore");
            return (Criteria) this;
        }

        public Criteria andWeekscoreGreaterThan(Integer value) {
            addCriterion("weekscore >", value, "weekscore");
            return (Criteria) this;
        }

        public Criteria andWeekscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("weekscore >=", value, "weekscore");
            return (Criteria) this;
        }

        public Criteria andWeekscoreLessThan(Integer value) {
            addCriterion("weekscore <", value, "weekscore");
            return (Criteria) this;
        }

        public Criteria andWeekscoreLessThanOrEqualTo(Integer value) {
            addCriterion("weekscore <=", value, "weekscore");
            return (Criteria) this;
        }

        public Criteria andWeekscoreIn(List<Integer> values) {
            addCriterion("weekscore in", values, "weekscore");
            return (Criteria) this;
        }

        public Criteria andWeekscoreNotIn(List<Integer> values) {
            addCriterion("weekscore not in", values, "weekscore");
            return (Criteria) this;
        }

        public Criteria andWeekscoreBetween(Integer value1, Integer value2) {
            addCriterion("weekscore between", value1, value2, "weekscore");
            return (Criteria) this;
        }

        public Criteria andWeekscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("weekscore not between", value1, value2, "weekscore");
            return (Criteria) this;
        }

        public Criteria andMonthscoreIsNull() {
            addCriterion("monthscore is null");
            return (Criteria) this;
        }

        public Criteria andMonthscoreIsNotNull() {
            addCriterion("monthscore is not null");
            return (Criteria) this;
        }

        public Criteria andMonthscoreEqualTo(Integer value) {
            addCriterion("monthscore =", value, "monthscore");
            return (Criteria) this;
        }

        public Criteria andMonthscoreNotEqualTo(Integer value) {
            addCriterion("monthscore <>", value, "monthscore");
            return (Criteria) this;
        }

        public Criteria andMonthscoreGreaterThan(Integer value) {
            addCriterion("monthscore >", value, "monthscore");
            return (Criteria) this;
        }

        public Criteria andMonthscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthscore >=", value, "monthscore");
            return (Criteria) this;
        }

        public Criteria andMonthscoreLessThan(Integer value) {
            addCriterion("monthscore <", value, "monthscore");
            return (Criteria) this;
        }

        public Criteria andMonthscoreLessThanOrEqualTo(Integer value) {
            addCriterion("monthscore <=", value, "monthscore");
            return (Criteria) this;
        }

        public Criteria andMonthscoreIn(List<Integer> values) {
            addCriterion("monthscore in", values, "monthscore");
            return (Criteria) this;
        }

        public Criteria andMonthscoreNotIn(List<Integer> values) {
            addCriterion("monthscore not in", values, "monthscore");
            return (Criteria) this;
        }

        public Criteria andMonthscoreBetween(Integer value1, Integer value2) {
            addCriterion("monthscore between", value1, value2, "monthscore");
            return (Criteria) this;
        }

        public Criteria andMonthscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("monthscore not between", value1, value2, "monthscore");
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