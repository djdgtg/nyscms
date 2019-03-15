package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontActivityExample() {
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

        public Criteria andActivitynameIsNull() {
            addCriterion("activityName is null");
            return (Criteria) this;
        }

        public Criteria andActivitynameIsNotNull() {
            addCriterion("activityName is not null");
            return (Criteria) this;
        }

        public Criteria andActivitynameEqualTo(String value) {
            addCriterion("activityName =", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotEqualTo(String value) {
            addCriterion("activityName <>", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameGreaterThan(String value) {
            addCriterion("activityName >", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameGreaterThanOrEqualTo(String value) {
            addCriterion("activityName >=", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameLessThan(String value) {
            addCriterion("activityName <", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameLessThanOrEqualTo(String value) {
            addCriterion("activityName <=", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameLike(String value) {
            addCriterion("activityName like", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotLike(String value) {
            addCriterion("activityName not like", value, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameIn(List<String> values) {
            addCriterion("activityName in", values, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotIn(List<String> values) {
            addCriterion("activityName not in", values, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameBetween(String value1, String value2) {
            addCriterion("activityName between", value1, value2, "activityname");
            return (Criteria) this;
        }

        public Criteria andActivitynameNotBetween(String value1, String value2) {
            addCriterion("activityName not between", value1, value2, "activityname");
            return (Criteria) this;
        }

        public Criteria andEnActivitynameIsNull() {
            addCriterion("en_activityName is null");
            return (Criteria) this;
        }

        public Criteria andEnActivitynameIsNotNull() {
            addCriterion("en_activityName is not null");
            return (Criteria) this;
        }

        public Criteria andEnActivitynameEqualTo(String value) {
            addCriterion("en_activityName =", value, "enActivityname");
            return (Criteria) this;
        }

        public Criteria andEnActivitynameNotEqualTo(String value) {
            addCriterion("en_activityName <>", value, "enActivityname");
            return (Criteria) this;
        }

        public Criteria andEnActivitynameGreaterThan(String value) {
            addCriterion("en_activityName >", value, "enActivityname");
            return (Criteria) this;
        }

        public Criteria andEnActivitynameGreaterThanOrEqualTo(String value) {
            addCriterion("en_activityName >=", value, "enActivityname");
            return (Criteria) this;
        }

        public Criteria andEnActivitynameLessThan(String value) {
            addCriterion("en_activityName <", value, "enActivityname");
            return (Criteria) this;
        }

        public Criteria andEnActivitynameLessThanOrEqualTo(String value) {
            addCriterion("en_activityName <=", value, "enActivityname");
            return (Criteria) this;
        }

        public Criteria andEnActivitynameLike(String value) {
            addCriterion("en_activityName like", value, "enActivityname");
            return (Criteria) this;
        }

        public Criteria andEnActivitynameNotLike(String value) {
            addCriterion("en_activityName not like", value, "enActivityname");
            return (Criteria) this;
        }

        public Criteria andEnActivitynameIn(List<String> values) {
            addCriterion("en_activityName in", values, "enActivityname");
            return (Criteria) this;
        }

        public Criteria andEnActivitynameNotIn(List<String> values) {
            addCriterion("en_activityName not in", values, "enActivityname");
            return (Criteria) this;
        }

        public Criteria andEnActivitynameBetween(String value1, String value2) {
            addCriterion("en_activityName between", value1, value2, "enActivityname");
            return (Criteria) this;
        }

        public Criteria andEnActivitynameNotBetween(String value1, String value2) {
            addCriterion("en_activityName not between", value1, value2, "enActivityname");
            return (Criteria) this;
        }

        public Criteria andActivitytitleIsNull() {
            addCriterion("activityTitle is null");
            return (Criteria) this;
        }

        public Criteria andActivitytitleIsNotNull() {
            addCriterion("activityTitle is not null");
            return (Criteria) this;
        }

        public Criteria andActivitytitleEqualTo(String value) {
            addCriterion("activityTitle =", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleNotEqualTo(String value) {
            addCriterion("activityTitle <>", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleGreaterThan(String value) {
            addCriterion("activityTitle >", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleGreaterThanOrEqualTo(String value) {
            addCriterion("activityTitle >=", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleLessThan(String value) {
            addCriterion("activityTitle <", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleLessThanOrEqualTo(String value) {
            addCriterion("activityTitle <=", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleLike(String value) {
            addCriterion("activityTitle like", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleNotLike(String value) {
            addCriterion("activityTitle not like", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleIn(List<String> values) {
            addCriterion("activityTitle in", values, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleNotIn(List<String> values) {
            addCriterion("activityTitle not in", values, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleBetween(String value1, String value2) {
            addCriterion("activityTitle between", value1, value2, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleNotBetween(String value1, String value2) {
            addCriterion("activityTitle not between", value1, value2, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andEnActivitytitleIsNull() {
            addCriterion("en_activityTitle is null");
            return (Criteria) this;
        }

        public Criteria andEnActivitytitleIsNotNull() {
            addCriterion("en_activityTitle is not null");
            return (Criteria) this;
        }

        public Criteria andEnActivitytitleEqualTo(String value) {
            addCriterion("en_activityTitle =", value, "enActivitytitle");
            return (Criteria) this;
        }

        public Criteria andEnActivitytitleNotEqualTo(String value) {
            addCriterion("en_activityTitle <>", value, "enActivitytitle");
            return (Criteria) this;
        }

        public Criteria andEnActivitytitleGreaterThan(String value) {
            addCriterion("en_activityTitle >", value, "enActivitytitle");
            return (Criteria) this;
        }

        public Criteria andEnActivitytitleGreaterThanOrEqualTo(String value) {
            addCriterion("en_activityTitle >=", value, "enActivitytitle");
            return (Criteria) this;
        }

        public Criteria andEnActivitytitleLessThan(String value) {
            addCriterion("en_activityTitle <", value, "enActivitytitle");
            return (Criteria) this;
        }

        public Criteria andEnActivitytitleLessThanOrEqualTo(String value) {
            addCriterion("en_activityTitle <=", value, "enActivitytitle");
            return (Criteria) this;
        }

        public Criteria andEnActivitytitleLike(String value) {
            addCriterion("en_activityTitle like", value, "enActivitytitle");
            return (Criteria) this;
        }

        public Criteria andEnActivitytitleNotLike(String value) {
            addCriterion("en_activityTitle not like", value, "enActivitytitle");
            return (Criteria) this;
        }

        public Criteria andEnActivitytitleIn(List<String> values) {
            addCriterion("en_activityTitle in", values, "enActivitytitle");
            return (Criteria) this;
        }

        public Criteria andEnActivitytitleNotIn(List<String> values) {
            addCriterion("en_activityTitle not in", values, "enActivitytitle");
            return (Criteria) this;
        }

        public Criteria andEnActivitytitleBetween(String value1, String value2) {
            addCriterion("en_activityTitle between", value1, value2, "enActivitytitle");
            return (Criteria) this;
        }

        public Criteria andEnActivitytitleNotBetween(String value1, String value2) {
            addCriterion("en_activityTitle not between", value1, value2, "enActivitytitle");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
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