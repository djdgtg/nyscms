package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontTaskExample() {
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

        public Criteria andTasktypeIsNull() {
            addCriterion("tasktype is null");
            return (Criteria) this;
        }

        public Criteria andTasktypeIsNotNull() {
            addCriterion("tasktype is not null");
            return (Criteria) this;
        }

        public Criteria andTasktypeEqualTo(Integer value) {
            addCriterion("tasktype =", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotEqualTo(Integer value) {
            addCriterion("tasktype <>", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThan(Integer value) {
            addCriterion("tasktype >", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tasktype >=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThan(Integer value) {
            addCriterion("tasktype <", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThanOrEqualTo(Integer value) {
            addCriterion("tasktype <=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeIn(List<Integer> values) {
            addCriterion("tasktype in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotIn(List<Integer> values) {
            addCriterion("tasktype not in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeBetween(Integer value1, Integer value2) {
            addCriterion("tasktype between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tasktype not between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTaskdescribeIsNull() {
            addCriterion("taskdescribe is null");
            return (Criteria) this;
        }

        public Criteria andTaskdescribeIsNotNull() {
            addCriterion("taskdescribe is not null");
            return (Criteria) this;
        }

        public Criteria andTaskdescribeEqualTo(String value) {
            addCriterion("taskdescribe =", value, "taskdescribe");
            return (Criteria) this;
        }

        public Criteria andTaskdescribeNotEqualTo(String value) {
            addCriterion("taskdescribe <>", value, "taskdescribe");
            return (Criteria) this;
        }

        public Criteria andTaskdescribeGreaterThan(String value) {
            addCriterion("taskdescribe >", value, "taskdescribe");
            return (Criteria) this;
        }

        public Criteria andTaskdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("taskdescribe >=", value, "taskdescribe");
            return (Criteria) this;
        }

        public Criteria andTaskdescribeLessThan(String value) {
            addCriterion("taskdescribe <", value, "taskdescribe");
            return (Criteria) this;
        }

        public Criteria andTaskdescribeLessThanOrEqualTo(String value) {
            addCriterion("taskdescribe <=", value, "taskdescribe");
            return (Criteria) this;
        }

        public Criteria andTaskdescribeLike(String value) {
            addCriterion("taskdescribe like", value, "taskdescribe");
            return (Criteria) this;
        }

        public Criteria andTaskdescribeNotLike(String value) {
            addCriterion("taskdescribe not like", value, "taskdescribe");
            return (Criteria) this;
        }

        public Criteria andTaskdescribeIn(List<String> values) {
            addCriterion("taskdescribe in", values, "taskdescribe");
            return (Criteria) this;
        }

        public Criteria andTaskdescribeNotIn(List<String> values) {
            addCriterion("taskdescribe not in", values, "taskdescribe");
            return (Criteria) this;
        }

        public Criteria andTaskdescribeBetween(String value1, String value2) {
            addCriterion("taskdescribe between", value1, value2, "taskdescribe");
            return (Criteria) this;
        }

        public Criteria andTaskdescribeNotBetween(String value1, String value2) {
            addCriterion("taskdescribe not between", value1, value2, "taskdescribe");
            return (Criteria) this;
        }

        public Criteria andEnTaskdescribeIsNull() {
            addCriterion("en_taskdescribe is null");
            return (Criteria) this;
        }

        public Criteria andEnTaskdescribeIsNotNull() {
            addCriterion("en_taskdescribe is not null");
            return (Criteria) this;
        }

        public Criteria andEnTaskdescribeEqualTo(String value) {
            addCriterion("en_taskdescribe =", value, "enTaskdescribe");
            return (Criteria) this;
        }

        public Criteria andEnTaskdescribeNotEqualTo(String value) {
            addCriterion("en_taskdescribe <>", value, "enTaskdescribe");
            return (Criteria) this;
        }

        public Criteria andEnTaskdescribeGreaterThan(String value) {
            addCriterion("en_taskdescribe >", value, "enTaskdescribe");
            return (Criteria) this;
        }

        public Criteria andEnTaskdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("en_taskdescribe >=", value, "enTaskdescribe");
            return (Criteria) this;
        }

        public Criteria andEnTaskdescribeLessThan(String value) {
            addCriterion("en_taskdescribe <", value, "enTaskdescribe");
            return (Criteria) this;
        }

        public Criteria andEnTaskdescribeLessThanOrEqualTo(String value) {
            addCriterion("en_taskdescribe <=", value, "enTaskdescribe");
            return (Criteria) this;
        }

        public Criteria andEnTaskdescribeLike(String value) {
            addCriterion("en_taskdescribe like", value, "enTaskdescribe");
            return (Criteria) this;
        }

        public Criteria andEnTaskdescribeNotLike(String value) {
            addCriterion("en_taskdescribe not like", value, "enTaskdescribe");
            return (Criteria) this;
        }

        public Criteria andEnTaskdescribeIn(List<String> values) {
            addCriterion("en_taskdescribe in", values, "enTaskdescribe");
            return (Criteria) this;
        }

        public Criteria andEnTaskdescribeNotIn(List<String> values) {
            addCriterion("en_taskdescribe not in", values, "enTaskdescribe");
            return (Criteria) this;
        }

        public Criteria andEnTaskdescribeBetween(String value1, String value2) {
            addCriterion("en_taskdescribe between", value1, value2, "enTaskdescribe");
            return (Criteria) this;
        }

        public Criteria andEnTaskdescribeNotBetween(String value1, String value2) {
            addCriterion("en_taskdescribe not between", value1, value2, "enTaskdescribe");
            return (Criteria) this;
        }

        public Criteria andTaskreachcountIsNull() {
            addCriterion("taskreachcount is null");
            return (Criteria) this;
        }

        public Criteria andTaskreachcountIsNotNull() {
            addCriterion("taskreachcount is not null");
            return (Criteria) this;
        }

        public Criteria andTaskreachcountEqualTo(Float value) {
            addCriterion("taskreachcount =", value, "taskreachcount");
            return (Criteria) this;
        }

        public Criteria andTaskreachcountNotEqualTo(Float value) {
            addCriterion("taskreachcount <>", value, "taskreachcount");
            return (Criteria) this;
        }

        public Criteria andTaskreachcountGreaterThan(Float value) {
            addCriterion("taskreachcount >", value, "taskreachcount");
            return (Criteria) this;
        }

        public Criteria andTaskreachcountGreaterThanOrEqualTo(Float value) {
            addCriterion("taskreachcount >=", value, "taskreachcount");
            return (Criteria) this;
        }

        public Criteria andTaskreachcountLessThan(Float value) {
            addCriterion("taskreachcount <", value, "taskreachcount");
            return (Criteria) this;
        }

        public Criteria andTaskreachcountLessThanOrEqualTo(Float value) {
            addCriterion("taskreachcount <=", value, "taskreachcount");
            return (Criteria) this;
        }

        public Criteria andTaskreachcountIn(List<Float> values) {
            addCriterion("taskreachcount in", values, "taskreachcount");
            return (Criteria) this;
        }

        public Criteria andTaskreachcountNotIn(List<Float> values) {
            addCriterion("taskreachcount not in", values, "taskreachcount");
            return (Criteria) this;
        }

        public Criteria andTaskreachcountBetween(Float value1, Float value2) {
            addCriterion("taskreachcount between", value1, value2, "taskreachcount");
            return (Criteria) this;
        }

        public Criteria andTaskreachcountNotBetween(Float value1, Float value2) {
            addCriterion("taskreachcount not between", value1, value2, "taskreachcount");
            return (Criteria) this;
        }

        public Criteria andTaskrewardIsNull() {
            addCriterion("taskreward is null");
            return (Criteria) this;
        }

        public Criteria andTaskrewardIsNotNull() {
            addCriterion("taskreward is not null");
            return (Criteria) this;
        }

        public Criteria andTaskrewardEqualTo(Integer value) {
            addCriterion("taskreward =", value, "taskreward");
            return (Criteria) this;
        }

        public Criteria andTaskrewardNotEqualTo(Integer value) {
            addCriterion("taskreward <>", value, "taskreward");
            return (Criteria) this;
        }

        public Criteria andTaskrewardGreaterThan(Integer value) {
            addCriterion("taskreward >", value, "taskreward");
            return (Criteria) this;
        }

        public Criteria andTaskrewardGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskreward >=", value, "taskreward");
            return (Criteria) this;
        }

        public Criteria andTaskrewardLessThan(Integer value) {
            addCriterion("taskreward <", value, "taskreward");
            return (Criteria) this;
        }

        public Criteria andTaskrewardLessThanOrEqualTo(Integer value) {
            addCriterion("taskreward <=", value, "taskreward");
            return (Criteria) this;
        }

        public Criteria andTaskrewardIn(List<Integer> values) {
            addCriterion("taskreward in", values, "taskreward");
            return (Criteria) this;
        }

        public Criteria andTaskrewardNotIn(List<Integer> values) {
            addCriterion("taskreward not in", values, "taskreward");
            return (Criteria) this;
        }

        public Criteria andTaskrewardBetween(Integer value1, Integer value2) {
            addCriterion("taskreward between", value1, value2, "taskreward");
            return (Criteria) this;
        }

        public Criteria andTaskrewardNotBetween(Integer value1, Integer value2) {
            addCriterion("taskreward not between", value1, value2, "taskreward");
            return (Criteria) this;
        }

        public Criteria andTaskrewardtypeIsNull() {
            addCriterion("taskrewardtype is null");
            return (Criteria) this;
        }

        public Criteria andTaskrewardtypeIsNotNull() {
            addCriterion("taskrewardtype is not null");
            return (Criteria) this;
        }

        public Criteria andTaskrewardtypeEqualTo(Integer value) {
            addCriterion("taskrewardtype =", value, "taskrewardtype");
            return (Criteria) this;
        }

        public Criteria andTaskrewardtypeNotEqualTo(Integer value) {
            addCriterion("taskrewardtype <>", value, "taskrewardtype");
            return (Criteria) this;
        }

        public Criteria andTaskrewardtypeGreaterThan(Integer value) {
            addCriterion("taskrewardtype >", value, "taskrewardtype");
            return (Criteria) this;
        }

        public Criteria andTaskrewardtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskrewardtype >=", value, "taskrewardtype");
            return (Criteria) this;
        }

        public Criteria andTaskrewardtypeLessThan(Integer value) {
            addCriterion("taskrewardtype <", value, "taskrewardtype");
            return (Criteria) this;
        }

        public Criteria andTaskrewardtypeLessThanOrEqualTo(Integer value) {
            addCriterion("taskrewardtype <=", value, "taskrewardtype");
            return (Criteria) this;
        }

        public Criteria andTaskrewardtypeIn(List<Integer> values) {
            addCriterion("taskrewardtype in", values, "taskrewardtype");
            return (Criteria) this;
        }

        public Criteria andTaskrewardtypeNotIn(List<Integer> values) {
            addCriterion("taskrewardtype not in", values, "taskrewardtype");
            return (Criteria) this;
        }

        public Criteria andTaskrewardtypeBetween(Integer value1, Integer value2) {
            addCriterion("taskrewardtype between", value1, value2, "taskrewardtype");
            return (Criteria) this;
        }

        public Criteria andTaskrewardtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("taskrewardtype not between", value1, value2, "taskrewardtype");
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

        public Criteria andTasktimesIsNull() {
            addCriterion("taskTimes is null");
            return (Criteria) this;
        }

        public Criteria andTasktimesIsNotNull() {
            addCriterion("taskTimes is not null");
            return (Criteria) this;
        }

        public Criteria andTasktimesEqualTo(Integer value) {
            addCriterion("taskTimes =", value, "tasktimes");
            return (Criteria) this;
        }

        public Criteria andTasktimesNotEqualTo(Integer value) {
            addCriterion("taskTimes <>", value, "tasktimes");
            return (Criteria) this;
        }

        public Criteria andTasktimesGreaterThan(Integer value) {
            addCriterion("taskTimes >", value, "tasktimes");
            return (Criteria) this;
        }

        public Criteria andTasktimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskTimes >=", value, "tasktimes");
            return (Criteria) this;
        }

        public Criteria andTasktimesLessThan(Integer value) {
            addCriterion("taskTimes <", value, "tasktimes");
            return (Criteria) this;
        }

        public Criteria andTasktimesLessThanOrEqualTo(Integer value) {
            addCriterion("taskTimes <=", value, "tasktimes");
            return (Criteria) this;
        }

        public Criteria andTasktimesIn(List<Integer> values) {
            addCriterion("taskTimes in", values, "tasktimes");
            return (Criteria) this;
        }

        public Criteria andTasktimesNotIn(List<Integer> values) {
            addCriterion("taskTimes not in", values, "tasktimes");
            return (Criteria) this;
        }

        public Criteria andTasktimesBetween(Integer value1, Integer value2) {
            addCriterion("taskTimes between", value1, value2, "tasktimes");
            return (Criteria) this;
        }

        public Criteria andTasktimesNotBetween(Integer value1, Integer value2) {
            addCriterion("taskTimes not between", value1, value2, "tasktimes");
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