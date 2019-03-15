package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontFullminusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontFullminusExample() {
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

        public Criteria andFullminustypeIsNull() {
            addCriterion("fullminusType is null");
            return (Criteria) this;
        }

        public Criteria andFullminustypeIsNotNull() {
            addCriterion("fullminusType is not null");
            return (Criteria) this;
        }

        public Criteria andFullminustypeEqualTo(Integer value) {
            addCriterion("fullminusType =", value, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeNotEqualTo(Integer value) {
            addCriterion("fullminusType <>", value, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeGreaterThan(Integer value) {
            addCriterion("fullminusType >", value, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fullminusType >=", value, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeLessThan(Integer value) {
            addCriterion("fullminusType <", value, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeLessThanOrEqualTo(Integer value) {
            addCriterion("fullminusType <=", value, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeIn(List<Integer> values) {
            addCriterion("fullminusType in", values, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeNotIn(List<Integer> values) {
            addCriterion("fullminusType not in", values, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeBetween(Integer value1, Integer value2) {
            addCriterion("fullminusType between", value1, value2, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeNotBetween(Integer value1, Integer value2) {
            addCriterion("fullminusType not between", value1, value2, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminusnumIsNull() {
            addCriterion("fullminusNum is null");
            return (Criteria) this;
        }

        public Criteria andFullminusnumIsNotNull() {
            addCriterion("fullminusNum is not null");
            return (Criteria) this;
        }

        public Criteria andFullminusnumEqualTo(String value) {
            addCriterion("fullminusNum =", value, "fullminusnum");
            return (Criteria) this;
        }

        public Criteria andFullminusnumNotEqualTo(String value) {
            addCriterion("fullminusNum <>", value, "fullminusnum");
            return (Criteria) this;
        }

        public Criteria andFullminusnumGreaterThan(String value) {
            addCriterion("fullminusNum >", value, "fullminusnum");
            return (Criteria) this;
        }

        public Criteria andFullminusnumGreaterThanOrEqualTo(String value) {
            addCriterion("fullminusNum >=", value, "fullminusnum");
            return (Criteria) this;
        }

        public Criteria andFullminusnumLessThan(String value) {
            addCriterion("fullminusNum <", value, "fullminusnum");
            return (Criteria) this;
        }

        public Criteria andFullminusnumLessThanOrEqualTo(String value) {
            addCriterion("fullminusNum <=", value, "fullminusnum");
            return (Criteria) this;
        }

        public Criteria andFullminusnumLike(String value) {
            addCriterion("fullminusNum like", value, "fullminusnum");
            return (Criteria) this;
        }

        public Criteria andFullminusnumNotLike(String value) {
            addCriterion("fullminusNum not like", value, "fullminusnum");
            return (Criteria) this;
        }

        public Criteria andFullminusnumIn(List<String> values) {
            addCriterion("fullminusNum in", values, "fullminusnum");
            return (Criteria) this;
        }

        public Criteria andFullminusnumNotIn(List<String> values) {
            addCriterion("fullminusNum not in", values, "fullminusnum");
            return (Criteria) this;
        }

        public Criteria andFullminusnumBetween(String value1, String value2) {
            addCriterion("fullminusNum between", value1, value2, "fullminusnum");
            return (Criteria) this;
        }

        public Criteria andFullminusnumNotBetween(String value1, String value2) {
            addCriterion("fullminusNum not between", value1, value2, "fullminusnum");
            return (Criteria) this;
        }

        public Criteria andFullminuscodeIsNull() {
            addCriterion("fullminuscode is null");
            return (Criteria) this;
        }

        public Criteria andFullminuscodeIsNotNull() {
            addCriterion("fullminuscode is not null");
            return (Criteria) this;
        }

        public Criteria andFullminuscodeEqualTo(String value) {
            addCriterion("fullminuscode =", value, "fullminuscode");
            return (Criteria) this;
        }

        public Criteria andFullminuscodeNotEqualTo(String value) {
            addCriterion("fullminuscode <>", value, "fullminuscode");
            return (Criteria) this;
        }

        public Criteria andFullminuscodeGreaterThan(String value) {
            addCriterion("fullminuscode >", value, "fullminuscode");
            return (Criteria) this;
        }

        public Criteria andFullminuscodeGreaterThanOrEqualTo(String value) {
            addCriterion("fullminuscode >=", value, "fullminuscode");
            return (Criteria) this;
        }

        public Criteria andFullminuscodeLessThan(String value) {
            addCriterion("fullminuscode <", value, "fullminuscode");
            return (Criteria) this;
        }

        public Criteria andFullminuscodeLessThanOrEqualTo(String value) {
            addCriterion("fullminuscode <=", value, "fullminuscode");
            return (Criteria) this;
        }

        public Criteria andFullminuscodeLike(String value) {
            addCriterion("fullminuscode like", value, "fullminuscode");
            return (Criteria) this;
        }

        public Criteria andFullminuscodeNotLike(String value) {
            addCriterion("fullminuscode not like", value, "fullminuscode");
            return (Criteria) this;
        }

        public Criteria andFullminuscodeIn(List<String> values) {
            addCriterion("fullminuscode in", values, "fullminuscode");
            return (Criteria) this;
        }

        public Criteria andFullminuscodeNotIn(List<String> values) {
            addCriterion("fullminuscode not in", values, "fullminuscode");
            return (Criteria) this;
        }

        public Criteria andFullminuscodeBetween(String value1, String value2) {
            addCriterion("fullminuscode between", value1, value2, "fullminuscode");
            return (Criteria) this;
        }

        public Criteria andFullminuscodeNotBetween(String value1, String value2) {
            addCriterion("fullminuscode not between", value1, value2, "fullminuscode");
            return (Criteria) this;
        }

        public Criteria andActivateuserIsNull() {
            addCriterion("activateuser is null");
            return (Criteria) this;
        }

        public Criteria andActivateuserIsNotNull() {
            addCriterion("activateuser is not null");
            return (Criteria) this;
        }

        public Criteria andActivateuserEqualTo(Integer value) {
            addCriterion("activateuser =", value, "activateuser");
            return (Criteria) this;
        }

        public Criteria andActivateuserNotEqualTo(Integer value) {
            addCriterion("activateuser <>", value, "activateuser");
            return (Criteria) this;
        }

        public Criteria andActivateuserGreaterThan(Integer value) {
            addCriterion("activateuser >", value, "activateuser");
            return (Criteria) this;
        }

        public Criteria andActivateuserGreaterThanOrEqualTo(Integer value) {
            addCriterion("activateuser >=", value, "activateuser");
            return (Criteria) this;
        }

        public Criteria andActivateuserLessThan(Integer value) {
            addCriterion("activateuser <", value, "activateuser");
            return (Criteria) this;
        }

        public Criteria andActivateuserLessThanOrEqualTo(Integer value) {
            addCriterion("activateuser <=", value, "activateuser");
            return (Criteria) this;
        }

        public Criteria andActivateuserIn(List<Integer> values) {
            addCriterion("activateuser in", values, "activateuser");
            return (Criteria) this;
        }

        public Criteria andActivateuserNotIn(List<Integer> values) {
            addCriterion("activateuser not in", values, "activateuser");
            return (Criteria) this;
        }

        public Criteria andActivateuserBetween(Integer value1, Integer value2) {
            addCriterion("activateuser between", value1, value2, "activateuser");
            return (Criteria) this;
        }

        public Criteria andActivateuserNotBetween(Integer value1, Integer value2) {
            addCriterion("activateuser not between", value1, value2, "activateuser");
            return (Criteria) this;
        }

        public Criteria andActivestatusIsNull() {
            addCriterion("activeStatus is null");
            return (Criteria) this;
        }

        public Criteria andActivestatusIsNotNull() {
            addCriterion("activeStatus is not null");
            return (Criteria) this;
        }

        public Criteria andActivestatusEqualTo(String value) {
            addCriterion("activeStatus =", value, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivestatusNotEqualTo(String value) {
            addCriterion("activeStatus <>", value, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivestatusGreaterThan(String value) {
            addCriterion("activeStatus >", value, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivestatusGreaterThanOrEqualTo(String value) {
            addCriterion("activeStatus >=", value, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivestatusLessThan(String value) {
            addCriterion("activeStatus <", value, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivestatusLessThanOrEqualTo(String value) {
            addCriterion("activeStatus <=", value, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivestatusLike(String value) {
            addCriterion("activeStatus like", value, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivestatusNotLike(String value) {
            addCriterion("activeStatus not like", value, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivestatusIn(List<String> values) {
            addCriterion("activeStatus in", values, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivestatusNotIn(List<String> values) {
            addCriterion("activeStatus not in", values, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivestatusBetween(String value1, String value2) {
            addCriterion("activeStatus between", value1, value2, "activestatus");
            return (Criteria) this;
        }

        public Criteria andActivestatusNotBetween(String value1, String value2) {
            addCriterion("activeStatus not between", value1, value2, "activestatus");
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