package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontFullminustypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontFullminustypeExample() {
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

        public Criteria andFullminustypeEqualTo(String value) {
            addCriterion("fullminusType =", value, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeNotEqualTo(String value) {
            addCriterion("fullminusType <>", value, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeGreaterThan(String value) {
            addCriterion("fullminusType >", value, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeGreaterThanOrEqualTo(String value) {
            addCriterion("fullminusType >=", value, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeLessThan(String value) {
            addCriterion("fullminusType <", value, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeLessThanOrEqualTo(String value) {
            addCriterion("fullminusType <=", value, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeLike(String value) {
            addCriterion("fullminusType like", value, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeNotLike(String value) {
            addCriterion("fullminusType not like", value, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeIn(List<String> values) {
            addCriterion("fullminusType in", values, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeNotIn(List<String> values) {
            addCriterion("fullminusType not in", values, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeBetween(String value1, String value2) {
            addCriterion("fullminusType between", value1, value2, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeNotBetween(String value1, String value2) {
            addCriterion("fullminusType not between", value1, value2, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andEnFullminustypeIsNull() {
            addCriterion("en_fullminusType is null");
            return (Criteria) this;
        }

        public Criteria andEnFullminustypeIsNotNull() {
            addCriterion("en_fullminusType is not null");
            return (Criteria) this;
        }

        public Criteria andEnFullminustypeEqualTo(String value) {
            addCriterion("en_fullminusType =", value, "enFullminustype");
            return (Criteria) this;
        }

        public Criteria andEnFullminustypeNotEqualTo(String value) {
            addCriterion("en_fullminusType <>", value, "enFullminustype");
            return (Criteria) this;
        }

        public Criteria andEnFullminustypeGreaterThan(String value) {
            addCriterion("en_fullminusType >", value, "enFullminustype");
            return (Criteria) this;
        }

        public Criteria andEnFullminustypeGreaterThanOrEqualTo(String value) {
            addCriterion("en_fullminusType >=", value, "enFullminustype");
            return (Criteria) this;
        }

        public Criteria andEnFullminustypeLessThan(String value) {
            addCriterion("en_fullminusType <", value, "enFullminustype");
            return (Criteria) this;
        }

        public Criteria andEnFullminustypeLessThanOrEqualTo(String value) {
            addCriterion("en_fullminusType <=", value, "enFullminustype");
            return (Criteria) this;
        }

        public Criteria andEnFullminustypeLike(String value) {
            addCriterion("en_fullminusType like", value, "enFullminustype");
            return (Criteria) this;
        }

        public Criteria andEnFullminustypeNotLike(String value) {
            addCriterion("en_fullminusType not like", value, "enFullminustype");
            return (Criteria) this;
        }

        public Criteria andEnFullminustypeIn(List<String> values) {
            addCriterion("en_fullminusType in", values, "enFullminustype");
            return (Criteria) this;
        }

        public Criteria andEnFullminustypeNotIn(List<String> values) {
            addCriterion("en_fullminusType not in", values, "enFullminustype");
            return (Criteria) this;
        }

        public Criteria andEnFullminustypeBetween(String value1, String value2) {
            addCriterion("en_fullminusType between", value1, value2, "enFullminustype");
            return (Criteria) this;
        }

        public Criteria andEnFullminustypeNotBetween(String value1, String value2) {
            addCriterion("en_fullminusType not between", value1, value2, "enFullminustype");
            return (Criteria) this;
        }

        public Criteria andFullmoneyIsNull() {
            addCriterion("fullMoney is null");
            return (Criteria) this;
        }

        public Criteria andFullmoneyIsNotNull() {
            addCriterion("fullMoney is not null");
            return (Criteria) this;
        }

        public Criteria andFullmoneyEqualTo(Float value) {
            addCriterion("fullMoney =", value, "fullmoney");
            return (Criteria) this;
        }

        public Criteria andFullmoneyNotEqualTo(Float value) {
            addCriterion("fullMoney <>", value, "fullmoney");
            return (Criteria) this;
        }

        public Criteria andFullmoneyGreaterThan(Float value) {
            addCriterion("fullMoney >", value, "fullmoney");
            return (Criteria) this;
        }

        public Criteria andFullmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("fullMoney >=", value, "fullmoney");
            return (Criteria) this;
        }

        public Criteria andFullmoneyLessThan(Float value) {
            addCriterion("fullMoney <", value, "fullmoney");
            return (Criteria) this;
        }

        public Criteria andFullmoneyLessThanOrEqualTo(Float value) {
            addCriterion("fullMoney <=", value, "fullmoney");
            return (Criteria) this;
        }

        public Criteria andFullmoneyIn(List<Float> values) {
            addCriterion("fullMoney in", values, "fullmoney");
            return (Criteria) this;
        }

        public Criteria andFullmoneyNotIn(List<Float> values) {
            addCriterion("fullMoney not in", values, "fullmoney");
            return (Criteria) this;
        }

        public Criteria andFullmoneyBetween(Float value1, Float value2) {
            addCriterion("fullMoney between", value1, value2, "fullmoney");
            return (Criteria) this;
        }

        public Criteria andFullmoneyNotBetween(Float value1, Float value2) {
            addCriterion("fullMoney not between", value1, value2, "fullmoney");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyIsNull() {
            addCriterion("minusMoney is null");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyIsNotNull() {
            addCriterion("minusMoney is not null");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyEqualTo(Float value) {
            addCriterion("minusMoney =", value, "minusmoney");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyNotEqualTo(Float value) {
            addCriterion("minusMoney <>", value, "minusmoney");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyGreaterThan(Float value) {
            addCriterion("minusMoney >", value, "minusmoney");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("minusMoney >=", value, "minusmoney");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyLessThan(Float value) {
            addCriterion("minusMoney <", value, "minusmoney");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyLessThanOrEqualTo(Float value) {
            addCriterion("minusMoney <=", value, "minusmoney");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyIn(List<Float> values) {
            addCriterion("minusMoney in", values, "minusmoney");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyNotIn(List<Float> values) {
            addCriterion("minusMoney not in", values, "minusmoney");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyBetween(Float value1, Float value2) {
            addCriterion("minusMoney between", value1, value2, "minusmoney");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyNotBetween(Float value1, Float value2) {
            addCriterion("minusMoney not between", value1, value2, "minusmoney");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
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

        public Criteria andEnMemoIsNull() {
            addCriterion("en_memo is null");
            return (Criteria) this;
        }

        public Criteria andEnMemoIsNotNull() {
            addCriterion("en_memo is not null");
            return (Criteria) this;
        }

        public Criteria andEnMemoEqualTo(String value) {
            addCriterion("en_memo =", value, "enMemo");
            return (Criteria) this;
        }

        public Criteria andEnMemoNotEqualTo(String value) {
            addCriterion("en_memo <>", value, "enMemo");
            return (Criteria) this;
        }

        public Criteria andEnMemoGreaterThan(String value) {
            addCriterion("en_memo >", value, "enMemo");
            return (Criteria) this;
        }

        public Criteria andEnMemoGreaterThanOrEqualTo(String value) {
            addCriterion("en_memo >=", value, "enMemo");
            return (Criteria) this;
        }

        public Criteria andEnMemoLessThan(String value) {
            addCriterion("en_memo <", value, "enMemo");
            return (Criteria) this;
        }

        public Criteria andEnMemoLessThanOrEqualTo(String value) {
            addCriterion("en_memo <=", value, "enMemo");
            return (Criteria) this;
        }

        public Criteria andEnMemoLike(String value) {
            addCriterion("en_memo like", value, "enMemo");
            return (Criteria) this;
        }

        public Criteria andEnMemoNotLike(String value) {
            addCriterion("en_memo not like", value, "enMemo");
            return (Criteria) this;
        }

        public Criteria andEnMemoIn(List<String> values) {
            addCriterion("en_memo in", values, "enMemo");
            return (Criteria) this;
        }

        public Criteria andEnMemoNotIn(List<String> values) {
            addCriterion("en_memo not in", values, "enMemo");
            return (Criteria) this;
        }

        public Criteria andEnMemoBetween(String value1, String value2) {
            addCriterion("en_memo between", value1, value2, "enMemo");
            return (Criteria) this;
        }

        public Criteria andEnMemoNotBetween(String value1, String value2) {
            addCriterion("en_memo not between", value1, value2, "enMemo");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andIsonlineIsNull() {
            addCriterion("isonline is null");
            return (Criteria) this;
        }

        public Criteria andIsonlineIsNotNull() {
            addCriterion("isonline is not null");
            return (Criteria) this;
        }

        public Criteria andIsonlineEqualTo(Integer value) {
            addCriterion("isonline =", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotEqualTo(Integer value) {
            addCriterion("isonline <>", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineGreaterThan(Integer value) {
            addCriterion("isonline >", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("isonline >=", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineLessThan(Integer value) {
            addCriterion("isonline <", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineLessThanOrEqualTo(Integer value) {
            addCriterion("isonline <=", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineIn(List<Integer> values) {
            addCriterion("isonline in", values, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotIn(List<Integer> values) {
            addCriterion("isonline not in", values, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineBetween(Integer value1, Integer value2) {
            addCriterion("isonline between", value1, value2, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotBetween(Integer value1, Integer value2) {
            addCriterion("isonline not between", value1, value2, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsbuildIsNull() {
            addCriterion("isbuild is null");
            return (Criteria) this;
        }

        public Criteria andIsbuildIsNotNull() {
            addCriterion("isbuild is not null");
            return (Criteria) this;
        }

        public Criteria andIsbuildEqualTo(Integer value) {
            addCriterion("isbuild =", value, "isbuild");
            return (Criteria) this;
        }

        public Criteria andIsbuildNotEqualTo(Integer value) {
            addCriterion("isbuild <>", value, "isbuild");
            return (Criteria) this;
        }

        public Criteria andIsbuildGreaterThan(Integer value) {
            addCriterion("isbuild >", value, "isbuild");
            return (Criteria) this;
        }

        public Criteria andIsbuildGreaterThanOrEqualTo(Integer value) {
            addCriterion("isbuild >=", value, "isbuild");
            return (Criteria) this;
        }

        public Criteria andIsbuildLessThan(Integer value) {
            addCriterion("isbuild <", value, "isbuild");
            return (Criteria) this;
        }

        public Criteria andIsbuildLessThanOrEqualTo(Integer value) {
            addCriterion("isbuild <=", value, "isbuild");
            return (Criteria) this;
        }

        public Criteria andIsbuildIn(List<Integer> values) {
            addCriterion("isbuild in", values, "isbuild");
            return (Criteria) this;
        }

        public Criteria andIsbuildNotIn(List<Integer> values) {
            addCriterion("isbuild not in", values, "isbuild");
            return (Criteria) this;
        }

        public Criteria andIsbuildBetween(Integer value1, Integer value2) {
            addCriterion("isbuild between", value1, value2, "isbuild");
            return (Criteria) this;
        }

        public Criteria andIsbuildNotBetween(Integer value1, Integer value2) {
            addCriterion("isbuild not between", value1, value2, "isbuild");
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