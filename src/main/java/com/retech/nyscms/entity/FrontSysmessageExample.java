package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontSysmessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontSysmessageExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andEnTitleIsNull() {
            addCriterion("en_title is null");
            return (Criteria) this;
        }

        public Criteria andEnTitleIsNotNull() {
            addCriterion("en_title is not null");
            return (Criteria) this;
        }

        public Criteria andEnTitleEqualTo(String value) {
            addCriterion("en_title =", value, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleNotEqualTo(String value) {
            addCriterion("en_title <>", value, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleGreaterThan(String value) {
            addCriterion("en_title >", value, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleGreaterThanOrEqualTo(String value) {
            addCriterion("en_title >=", value, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleLessThan(String value) {
            addCriterion("en_title <", value, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleLessThanOrEqualTo(String value) {
            addCriterion("en_title <=", value, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleLike(String value) {
            addCriterion("en_title like", value, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleNotLike(String value) {
            addCriterion("en_title not like", value, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleIn(List<String> values) {
            addCriterion("en_title in", values, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleNotIn(List<String> values) {
            addCriterion("en_title not in", values, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleBetween(String value1, String value2) {
            addCriterion("en_title between", value1, value2, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleNotBetween(String value1, String value2) {
            addCriterion("en_title not between", value1, value2, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnContentIsNull() {
            addCriterion("en_content is null");
            return (Criteria) this;
        }

        public Criteria andEnContentIsNotNull() {
            addCriterion("en_content is not null");
            return (Criteria) this;
        }

        public Criteria andEnContentEqualTo(String value) {
            addCriterion("en_content =", value, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentNotEqualTo(String value) {
            addCriterion("en_content <>", value, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentGreaterThan(String value) {
            addCriterion("en_content >", value, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentGreaterThanOrEqualTo(String value) {
            addCriterion("en_content >=", value, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentLessThan(String value) {
            addCriterion("en_content <", value, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentLessThanOrEqualTo(String value) {
            addCriterion("en_content <=", value, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentLike(String value) {
            addCriterion("en_content like", value, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentNotLike(String value) {
            addCriterion("en_content not like", value, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentIn(List<String> values) {
            addCriterion("en_content in", values, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentNotIn(List<String> values) {
            addCriterion("en_content not in", values, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentBetween(String value1, String value2) {
            addCriterion("en_content between", value1, value2, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentNotBetween(String value1, String value2) {
            addCriterion("en_content not between", value1, value2, "enContent");
            return (Criteria) this;
        }

        public Criteria andSendstatusIsNull() {
            addCriterion("sendstatus is null");
            return (Criteria) this;
        }

        public Criteria andSendstatusIsNotNull() {
            addCriterion("sendstatus is not null");
            return (Criteria) this;
        }

        public Criteria andSendstatusEqualTo(String value) {
            addCriterion("sendstatus =", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusNotEqualTo(String value) {
            addCriterion("sendstatus <>", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusGreaterThan(String value) {
            addCriterion("sendstatus >", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusGreaterThanOrEqualTo(String value) {
            addCriterion("sendstatus >=", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusLessThan(String value) {
            addCriterion("sendstatus <", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusLessThanOrEqualTo(String value) {
            addCriterion("sendstatus <=", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusLike(String value) {
            addCriterion("sendstatus like", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusNotLike(String value) {
            addCriterion("sendstatus not like", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusIn(List<String> values) {
            addCriterion("sendstatus in", values, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusNotIn(List<String> values) {
            addCriterion("sendstatus not in", values, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusBetween(String value1, String value2) {
            addCriterion("sendstatus between", value1, value2, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusNotBetween(String value1, String value2) {
            addCriterion("sendstatus not between", value1, value2, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNull() {
            addCriterion("sendtime is null");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNotNull() {
            addCriterion("sendtime is not null");
            return (Criteria) this;
        }

        public Criteria andSendtimeEqualTo(Date value) {
            addCriterion("sendtime =", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotEqualTo(Date value) {
            addCriterion("sendtime <>", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThan(Date value) {
            addCriterion("sendtime >", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sendtime >=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThan(Date value) {
            addCriterion("sendtime <", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThanOrEqualTo(Date value) {
            addCriterion("sendtime <=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIn(List<Date> values) {
            addCriterion("sendtime in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotIn(List<Date> values) {
            addCriterion("sendtime not in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeBetween(Date value1, Date value2) {
            addCriterion("sendtime between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotBetween(Date value1, Date value2) {
            addCriterion("sendtime not between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendmsgtypeIsNull() {
            addCriterion("sendmsgtype is null");
            return (Criteria) this;
        }

        public Criteria andSendmsgtypeIsNotNull() {
            addCriterion("sendmsgtype is not null");
            return (Criteria) this;
        }

        public Criteria andSendmsgtypeEqualTo(Integer value) {
            addCriterion("sendmsgtype =", value, "sendmsgtype");
            return (Criteria) this;
        }

        public Criteria andSendmsgtypeNotEqualTo(Integer value) {
            addCriterion("sendmsgtype <>", value, "sendmsgtype");
            return (Criteria) this;
        }

        public Criteria andSendmsgtypeGreaterThan(Integer value) {
            addCriterion("sendmsgtype >", value, "sendmsgtype");
            return (Criteria) this;
        }

        public Criteria andSendmsgtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendmsgtype >=", value, "sendmsgtype");
            return (Criteria) this;
        }

        public Criteria andSendmsgtypeLessThan(Integer value) {
            addCriterion("sendmsgtype <", value, "sendmsgtype");
            return (Criteria) this;
        }

        public Criteria andSendmsgtypeLessThanOrEqualTo(Integer value) {
            addCriterion("sendmsgtype <=", value, "sendmsgtype");
            return (Criteria) this;
        }

        public Criteria andSendmsgtypeIn(List<Integer> values) {
            addCriterion("sendmsgtype in", values, "sendmsgtype");
            return (Criteria) this;
        }

        public Criteria andSendmsgtypeNotIn(List<Integer> values) {
            addCriterion("sendmsgtype not in", values, "sendmsgtype");
            return (Criteria) this;
        }

        public Criteria andSendmsgtypeBetween(Integer value1, Integer value2) {
            addCriterion("sendmsgtype between", value1, value2, "sendmsgtype");
            return (Criteria) this;
        }

        public Criteria andSendmsgtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sendmsgtype not between", value1, value2, "sendmsgtype");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andThemeidIsNull() {
            addCriterion("themeid is null");
            return (Criteria) this;
        }

        public Criteria andThemeidIsNotNull() {
            addCriterion("themeid is not null");
            return (Criteria) this;
        }

        public Criteria andThemeidEqualTo(Integer value) {
            addCriterion("themeid =", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotEqualTo(Integer value) {
            addCriterion("themeid <>", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidGreaterThan(Integer value) {
            addCriterion("themeid >", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("themeid >=", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidLessThan(Integer value) {
            addCriterion("themeid <", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidLessThanOrEqualTo(Integer value) {
            addCriterion("themeid <=", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidIn(List<Integer> values) {
            addCriterion("themeid in", values, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotIn(List<Integer> values) {
            addCriterion("themeid not in", values, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidBetween(Integer value1, Integer value2) {
            addCriterion("themeid between", value1, value2, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotBetween(Integer value1, Integer value2) {
            addCriterion("themeid not between", value1, value2, "themeid");
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