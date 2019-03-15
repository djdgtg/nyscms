package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontReadHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontReadHistoryExample() {
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
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andDispalyIsNull() {
            addCriterion("dispaly is null");
            return (Criteria) this;
        }

        public Criteria andDispalyIsNotNull() {
            addCriterion("dispaly is not null");
            return (Criteria) this;
        }

        public Criteria andDispalyEqualTo(Integer value) {
            addCriterion("dispaly =", value, "dispaly");
            return (Criteria) this;
        }

        public Criteria andDispalyNotEqualTo(Integer value) {
            addCriterion("dispaly <>", value, "dispaly");
            return (Criteria) this;
        }

        public Criteria andDispalyGreaterThan(Integer value) {
            addCriterion("dispaly >", value, "dispaly");
            return (Criteria) this;
        }

        public Criteria andDispalyGreaterThanOrEqualTo(Integer value) {
            addCriterion("dispaly >=", value, "dispaly");
            return (Criteria) this;
        }

        public Criteria andDispalyLessThan(Integer value) {
            addCriterion("dispaly <", value, "dispaly");
            return (Criteria) this;
        }

        public Criteria andDispalyLessThanOrEqualTo(Integer value) {
            addCriterion("dispaly <=", value, "dispaly");
            return (Criteria) this;
        }

        public Criteria andDispalyIn(List<Integer> values) {
            addCriterion("dispaly in", values, "dispaly");
            return (Criteria) this;
        }

        public Criteria andDispalyNotIn(List<Integer> values) {
            addCriterion("dispaly not in", values, "dispaly");
            return (Criteria) this;
        }

        public Criteria andDispalyBetween(Integer value1, Integer value2) {
            addCriterion("dispaly between", value1, value2, "dispaly");
            return (Criteria) this;
        }

        public Criteria andDispalyNotBetween(Integer value1, Integer value2) {
            addCriterion("dispaly not between", value1, value2, "dispaly");
            return (Criteria) this;
        }

        public Criteria andReadtimeIsNull() {
            addCriterion("readTime is null");
            return (Criteria) this;
        }

        public Criteria andReadtimeIsNotNull() {
            addCriterion("readTime is not null");
            return (Criteria) this;
        }

        public Criteria andReadtimeEqualTo(Double value) {
            addCriterion("readTime =", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeNotEqualTo(Double value) {
            addCriterion("readTime <>", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeGreaterThan(Double value) {
            addCriterion("readTime >", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeGreaterThanOrEqualTo(Double value) {
            addCriterion("readTime >=", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeLessThan(Double value) {
            addCriterion("readTime <", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeLessThanOrEqualTo(Double value) {
            addCriterion("readTime <=", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeIn(List<Double> values) {
            addCriterion("readTime in", values, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeNotIn(List<Double> values) {
            addCriterion("readTime not in", values, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeBetween(Double value1, Double value2) {
            addCriterion("readTime between", value1, value2, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeNotBetween(Double value1, Double value2) {
            addCriterion("readTime not between", value1, value2, "readtime");
            return (Criteria) this;
        }

        public Criteria andAveragewordIsNull() {
            addCriterion("averageWord is null");
            return (Criteria) this;
        }

        public Criteria andAveragewordIsNotNull() {
            addCriterion("averageWord is not null");
            return (Criteria) this;
        }

        public Criteria andAveragewordEqualTo(Integer value) {
            addCriterion("averageWord =", value, "averageword");
            return (Criteria) this;
        }

        public Criteria andAveragewordNotEqualTo(Integer value) {
            addCriterion("averageWord <>", value, "averageword");
            return (Criteria) this;
        }

        public Criteria andAveragewordGreaterThan(Integer value) {
            addCriterion("averageWord >", value, "averageword");
            return (Criteria) this;
        }

        public Criteria andAveragewordGreaterThanOrEqualTo(Integer value) {
            addCriterion("averageWord >=", value, "averageword");
            return (Criteria) this;
        }

        public Criteria andAveragewordLessThan(Integer value) {
            addCriterion("averageWord <", value, "averageword");
            return (Criteria) this;
        }

        public Criteria andAveragewordLessThanOrEqualTo(Integer value) {
            addCriterion("averageWord <=", value, "averageword");
            return (Criteria) this;
        }

        public Criteria andAveragewordIn(List<Integer> values) {
            addCriterion("averageWord in", values, "averageword");
            return (Criteria) this;
        }

        public Criteria andAveragewordNotIn(List<Integer> values) {
            addCriterion("averageWord not in", values, "averageword");
            return (Criteria) this;
        }

        public Criteria andAveragewordBetween(Integer value1, Integer value2) {
            addCriterion("averageWord between", value1, value2, "averageword");
            return (Criteria) this;
        }

        public Criteria andAveragewordNotBetween(Integer value1, Integer value2) {
            addCriterion("averageWord not between", value1, value2, "averageword");
            return (Criteria) this;
        }

        public Criteria andTotalwordIsNull() {
            addCriterion("totalWord is null");
            return (Criteria) this;
        }

        public Criteria andTotalwordIsNotNull() {
            addCriterion("totalWord is not null");
            return (Criteria) this;
        }

        public Criteria andTotalwordEqualTo(Integer value) {
            addCriterion("totalWord =", value, "totalword");
            return (Criteria) this;
        }

        public Criteria andTotalwordNotEqualTo(Integer value) {
            addCriterion("totalWord <>", value, "totalword");
            return (Criteria) this;
        }

        public Criteria andTotalwordGreaterThan(Integer value) {
            addCriterion("totalWord >", value, "totalword");
            return (Criteria) this;
        }

        public Criteria andTotalwordGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalWord >=", value, "totalword");
            return (Criteria) this;
        }

        public Criteria andTotalwordLessThan(Integer value) {
            addCriterion("totalWord <", value, "totalword");
            return (Criteria) this;
        }

        public Criteria andTotalwordLessThanOrEqualTo(Integer value) {
            addCriterion("totalWord <=", value, "totalword");
            return (Criteria) this;
        }

        public Criteria andTotalwordIn(List<Integer> values) {
            addCriterion("totalWord in", values, "totalword");
            return (Criteria) this;
        }

        public Criteria andTotalwordNotIn(List<Integer> values) {
            addCriterion("totalWord not in", values, "totalword");
            return (Criteria) this;
        }

        public Criteria andTotalwordBetween(Integer value1, Integer value2) {
            addCriterion("totalWord between", value1, value2, "totalword");
            return (Criteria) this;
        }

        public Criteria andTotalwordNotBetween(Integer value1, Integer value2) {
            addCriterion("totalWord not between", value1, value2, "totalword");
            return (Criteria) this;
        }

        public Criteria andRankingIsNull() {
            addCriterion("ranking is null");
            return (Criteria) this;
        }

        public Criteria andRankingIsNotNull() {
            addCriterion("ranking is not null");
            return (Criteria) this;
        }

        public Criteria andRankingEqualTo(Integer value) {
            addCriterion("ranking =", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotEqualTo(Integer value) {
            addCriterion("ranking <>", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThan(Integer value) {
            addCriterion("ranking >", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThanOrEqualTo(Integer value) {
            addCriterion("ranking >=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThan(Integer value) {
            addCriterion("ranking <", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThanOrEqualTo(Integer value) {
            addCriterion("ranking <=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingIn(List<Integer> values) {
            addCriterion("ranking in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotIn(List<Integer> values) {
            addCriterion("ranking not in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingBetween(Integer value1, Integer value2) {
            addCriterion("ranking between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotBetween(Integer value1, Integer value2) {
            addCriterion("ranking not between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andAccesstimeIsNull() {
            addCriterion("accessTime is null");
            return (Criteria) this;
        }

        public Criteria andAccesstimeIsNotNull() {
            addCriterion("accessTime is not null");
            return (Criteria) this;
        }

        public Criteria andAccesstimeEqualTo(Date value) {
            addCriterion("accessTime =", value, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeNotEqualTo(Date value) {
            addCriterion("accessTime <>", value, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeGreaterThan(Date value) {
            addCriterion("accessTime >", value, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("accessTime >=", value, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeLessThan(Date value) {
            addCriterion("accessTime <", value, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeLessThanOrEqualTo(Date value) {
            addCriterion("accessTime <=", value, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeIn(List<Date> values) {
            addCriterion("accessTime in", values, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeNotIn(List<Date> values) {
            addCriterion("accessTime not in", values, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeBetween(Date value1, Date value2) {
            addCriterion("accessTime between", value1, value2, "accesstime");
            return (Criteria) this;
        }

        public Criteria andAccesstimeNotBetween(Date value1, Date value2) {
            addCriterion("accessTime not between", value1, value2, "accesstime");
            return (Criteria) this;
        }

        public Criteria andReadthroughIsNull() {
            addCriterion("readThrough is null");
            return (Criteria) this;
        }

        public Criteria andReadthroughIsNotNull() {
            addCriterion("readThrough is not null");
            return (Criteria) this;
        }

        public Criteria andReadthroughEqualTo(Integer value) {
            addCriterion("readThrough =", value, "readthrough");
            return (Criteria) this;
        }

        public Criteria andReadthroughNotEqualTo(Integer value) {
            addCriterion("readThrough <>", value, "readthrough");
            return (Criteria) this;
        }

        public Criteria andReadthroughGreaterThan(Integer value) {
            addCriterion("readThrough >", value, "readthrough");
            return (Criteria) this;
        }

        public Criteria andReadthroughGreaterThanOrEqualTo(Integer value) {
            addCriterion("readThrough >=", value, "readthrough");
            return (Criteria) this;
        }

        public Criteria andReadthroughLessThan(Integer value) {
            addCriterion("readThrough <", value, "readthrough");
            return (Criteria) this;
        }

        public Criteria andReadthroughLessThanOrEqualTo(Integer value) {
            addCriterion("readThrough <=", value, "readthrough");
            return (Criteria) this;
        }

        public Criteria andReadthroughIn(List<Integer> values) {
            addCriterion("readThrough in", values, "readthrough");
            return (Criteria) this;
        }

        public Criteria andReadthroughNotIn(List<Integer> values) {
            addCriterion("readThrough not in", values, "readthrough");
            return (Criteria) this;
        }

        public Criteria andReadthroughBetween(Integer value1, Integer value2) {
            addCriterion("readThrough between", value1, value2, "readthrough");
            return (Criteria) this;
        }

        public Criteria andReadthroughNotBetween(Integer value1, Integer value2) {
            addCriterion("readThrough not between", value1, value2, "readthrough");
            return (Criteria) this;
        }

        public Criteria andReadhaveIsNull() {
            addCriterion("readHave is null");
            return (Criteria) this;
        }

        public Criteria andReadhaveIsNotNull() {
            addCriterion("readHave is not null");
            return (Criteria) this;
        }

        public Criteria andReadhaveEqualTo(Integer value) {
            addCriterion("readHave =", value, "readhave");
            return (Criteria) this;
        }

        public Criteria andReadhaveNotEqualTo(Integer value) {
            addCriterion("readHave <>", value, "readhave");
            return (Criteria) this;
        }

        public Criteria andReadhaveGreaterThan(Integer value) {
            addCriterion("readHave >", value, "readhave");
            return (Criteria) this;
        }

        public Criteria andReadhaveGreaterThanOrEqualTo(Integer value) {
            addCriterion("readHave >=", value, "readhave");
            return (Criteria) this;
        }

        public Criteria andReadhaveLessThan(Integer value) {
            addCriterion("readHave <", value, "readhave");
            return (Criteria) this;
        }

        public Criteria andReadhaveLessThanOrEqualTo(Integer value) {
            addCriterion("readHave <=", value, "readhave");
            return (Criteria) this;
        }

        public Criteria andReadhaveIn(List<Integer> values) {
            addCriterion("readHave in", values, "readhave");
            return (Criteria) this;
        }

        public Criteria andReadhaveNotIn(List<Integer> values) {
            addCriterion("readHave not in", values, "readhave");
            return (Criteria) this;
        }

        public Criteria andReadhaveBetween(Integer value1, Integer value2) {
            addCriterion("readHave between", value1, value2, "readhave");
            return (Criteria) this;
        }

        public Criteria andReadhaveNotBetween(Integer value1, Integer value2) {
            addCriterion("readHave not between", value1, value2, "readhave");
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