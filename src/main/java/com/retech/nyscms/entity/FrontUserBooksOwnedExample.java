package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontUserBooksOwnedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontUserBooksOwnedExample() {
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
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andEbookidIsNull() {
            addCriterion("eBookId is null");
            return (Criteria) this;
        }

        public Criteria andEbookidIsNotNull() {
            addCriterion("eBookId is not null");
            return (Criteria) this;
        }

        public Criteria andEbookidEqualTo(Integer value) {
            addCriterion("eBookId =", value, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidNotEqualTo(Integer value) {
            addCriterion("eBookId <>", value, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidGreaterThan(Integer value) {
            addCriterion("eBookId >", value, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eBookId >=", value, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidLessThan(Integer value) {
            addCriterion("eBookId <", value, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidLessThanOrEqualTo(Integer value) {
            addCriterion("eBookId <=", value, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidIn(List<Integer> values) {
            addCriterion("eBookId in", values, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidNotIn(List<Integer> values) {
            addCriterion("eBookId not in", values, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidBetween(Integer value1, Integer value2) {
            addCriterion("eBookId between", value1, value2, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidNotBetween(Integer value1, Integer value2) {
            addCriterion("eBookId not between", value1, value2, "ebookid");
            return (Criteria) this;
        }

        public Criteria andSerialidIsNull() {
            addCriterion("serialId is null");
            return (Criteria) this;
        }

        public Criteria andSerialidIsNotNull() {
            addCriterion("serialId is not null");
            return (Criteria) this;
        }

        public Criteria andSerialidEqualTo(Integer value) {
            addCriterion("serialId =", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotEqualTo(Integer value) {
            addCriterion("serialId <>", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidGreaterThan(Integer value) {
            addCriterion("serialId >", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidGreaterThanOrEqualTo(Integer value) {
            addCriterion("serialId >=", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidLessThan(Integer value) {
            addCriterion("serialId <", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidLessThanOrEqualTo(Integer value) {
            addCriterion("serialId <=", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidIn(List<Integer> values) {
            addCriterion("serialId in", values, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotIn(List<Integer> values) {
            addCriterion("serialId not in", values, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidBetween(Integer value1, Integer value2) {
            addCriterion("serialId between", value1, value2, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotBetween(Integer value1, Integer value2) {
            addCriterion("serialId not between", value1, value2, "serialid");
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

        public Criteria andBuytypeIsNull() {
            addCriterion("buyType is null");
            return (Criteria) this;
        }

        public Criteria andBuytypeIsNotNull() {
            addCriterion("buyType is not null");
            return (Criteria) this;
        }

        public Criteria andBuytypeEqualTo(Integer value) {
            addCriterion("buyType =", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeNotEqualTo(Integer value) {
            addCriterion("buyType <>", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeGreaterThan(Integer value) {
            addCriterion("buyType >", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyType >=", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeLessThan(Integer value) {
            addCriterion("buyType <", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeLessThanOrEqualTo(Integer value) {
            addCriterion("buyType <=", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeIn(List<Integer> values) {
            addCriterion("buyType in", values, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeNotIn(List<Integer> values) {
            addCriterion("buyType not in", values, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeBetween(Integer value1, Integer value2) {
            addCriterion("buyType between", value1, value2, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("buyType not between", value1, value2, "buytype");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andGrantauthorityidIsNull() {
            addCriterion("grantauthorityId is null");
            return (Criteria) this;
        }

        public Criteria andGrantauthorityidIsNotNull() {
            addCriterion("grantauthorityId is not null");
            return (Criteria) this;
        }

        public Criteria andGrantauthorityidEqualTo(Integer value) {
            addCriterion("grantauthorityId =", value, "grantauthorityid");
            return (Criteria) this;
        }

        public Criteria andGrantauthorityidNotEqualTo(Integer value) {
            addCriterion("grantauthorityId <>", value, "grantauthorityid");
            return (Criteria) this;
        }

        public Criteria andGrantauthorityidGreaterThan(Integer value) {
            addCriterion("grantauthorityId >", value, "grantauthorityid");
            return (Criteria) this;
        }

        public Criteria andGrantauthorityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("grantauthorityId >=", value, "grantauthorityid");
            return (Criteria) this;
        }

        public Criteria andGrantauthorityidLessThan(Integer value) {
            addCriterion("grantauthorityId <", value, "grantauthorityid");
            return (Criteria) this;
        }

        public Criteria andGrantauthorityidLessThanOrEqualTo(Integer value) {
            addCriterion("grantauthorityId <=", value, "grantauthorityid");
            return (Criteria) this;
        }

        public Criteria andGrantauthorityidIn(List<Integer> values) {
            addCriterion("grantauthorityId in", values, "grantauthorityid");
            return (Criteria) this;
        }

        public Criteria andGrantauthorityidNotIn(List<Integer> values) {
            addCriterion("grantauthorityId not in", values, "grantauthorityid");
            return (Criteria) this;
        }

        public Criteria andGrantauthorityidBetween(Integer value1, Integer value2) {
            addCriterion("grantauthorityId between", value1, value2, "grantauthorityid");
            return (Criteria) this;
        }

        public Criteria andGrantauthorityidNotBetween(Integer value1, Integer value2) {
            addCriterion("grantauthorityId not between", value1, value2, "grantauthorityid");
            return (Criteria) this;
        }

        public Criteria andGrantbatchidIsNull() {
            addCriterion("grantbatchId is null");
            return (Criteria) this;
        }

        public Criteria andGrantbatchidIsNotNull() {
            addCriterion("grantbatchId is not null");
            return (Criteria) this;
        }

        public Criteria andGrantbatchidEqualTo(Integer value) {
            addCriterion("grantbatchId =", value, "grantbatchid");
            return (Criteria) this;
        }

        public Criteria andGrantbatchidNotEqualTo(Integer value) {
            addCriterion("grantbatchId <>", value, "grantbatchid");
            return (Criteria) this;
        }

        public Criteria andGrantbatchidGreaterThan(Integer value) {
            addCriterion("grantbatchId >", value, "grantbatchid");
            return (Criteria) this;
        }

        public Criteria andGrantbatchidGreaterThanOrEqualTo(Integer value) {
            addCriterion("grantbatchId >=", value, "grantbatchid");
            return (Criteria) this;
        }

        public Criteria andGrantbatchidLessThan(Integer value) {
            addCriterion("grantbatchId <", value, "grantbatchid");
            return (Criteria) this;
        }

        public Criteria andGrantbatchidLessThanOrEqualTo(Integer value) {
            addCriterion("grantbatchId <=", value, "grantbatchid");
            return (Criteria) this;
        }

        public Criteria andGrantbatchidIn(List<Integer> values) {
            addCriterion("grantbatchId in", values, "grantbatchid");
            return (Criteria) this;
        }

        public Criteria andGrantbatchidNotIn(List<Integer> values) {
            addCriterion("grantbatchId not in", values, "grantbatchid");
            return (Criteria) this;
        }

        public Criteria andGrantbatchidBetween(Integer value1, Integer value2) {
            addCriterion("grantbatchId between", value1, value2, "grantbatchid");
            return (Criteria) this;
        }

        public Criteria andGrantbatchidNotBetween(Integer value1, Integer value2) {
            addCriterion("grantbatchId not between", value1, value2, "grantbatchid");
            return (Criteria) this;
        }

        public Criteria andBookstatusIsNull() {
            addCriterion("bookstatus is null");
            return (Criteria) this;
        }

        public Criteria andBookstatusIsNotNull() {
            addCriterion("bookstatus is not null");
            return (Criteria) this;
        }

        public Criteria andBookstatusEqualTo(Integer value) {
            addCriterion("bookstatus =", value, "bookstatus");
            return (Criteria) this;
        }

        public Criteria andBookstatusNotEqualTo(Integer value) {
            addCriterion("bookstatus <>", value, "bookstatus");
            return (Criteria) this;
        }

        public Criteria andBookstatusGreaterThan(Integer value) {
            addCriterion("bookstatus >", value, "bookstatus");
            return (Criteria) this;
        }

        public Criteria andBookstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookstatus >=", value, "bookstatus");
            return (Criteria) this;
        }

        public Criteria andBookstatusLessThan(Integer value) {
            addCriterion("bookstatus <", value, "bookstatus");
            return (Criteria) this;
        }

        public Criteria andBookstatusLessThanOrEqualTo(Integer value) {
            addCriterion("bookstatus <=", value, "bookstatus");
            return (Criteria) this;
        }

        public Criteria andBookstatusIn(List<Integer> values) {
            addCriterion("bookstatus in", values, "bookstatus");
            return (Criteria) this;
        }

        public Criteria andBookstatusNotIn(List<Integer> values) {
            addCriterion("bookstatus not in", values, "bookstatus");
            return (Criteria) this;
        }

        public Criteria andBookstatusBetween(Integer value1, Integer value2) {
            addCriterion("bookstatus between", value1, value2, "bookstatus");
            return (Criteria) this;
        }

        public Criteria andBookstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("bookstatus not between", value1, value2, "bookstatus");
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