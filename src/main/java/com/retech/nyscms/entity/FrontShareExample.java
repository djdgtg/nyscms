package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontShareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontShareExample() {
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

        public Criteria andShareidIsNull() {
            addCriterion("shareID is null");
            return (Criteria) this;
        }

        public Criteria andShareidIsNotNull() {
            addCriterion("shareID is not null");
            return (Criteria) this;
        }

        public Criteria andShareidEqualTo(Integer value) {
            addCriterion("shareID =", value, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidNotEqualTo(Integer value) {
            addCriterion("shareID <>", value, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidGreaterThan(Integer value) {
            addCriterion("shareID >", value, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shareID >=", value, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidLessThan(Integer value) {
            addCriterion("shareID <", value, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidLessThanOrEqualTo(Integer value) {
            addCriterion("shareID <=", value, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidIn(List<Integer> values) {
            addCriterion("shareID in", values, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidNotIn(List<Integer> values) {
            addCriterion("shareID not in", values, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidBetween(Integer value1, Integer value2) {
            addCriterion("shareID between", value1, value2, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidNotBetween(Integer value1, Integer value2) {
            addCriterion("shareID not between", value1, value2, "shareid");
            return (Criteria) this;
        }

        public Criteria andSharetitleIsNull() {
            addCriterion("shareTitle is null");
            return (Criteria) this;
        }

        public Criteria andSharetitleIsNotNull() {
            addCriterion("shareTitle is not null");
            return (Criteria) this;
        }

        public Criteria andSharetitleEqualTo(String value) {
            addCriterion("shareTitle =", value, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleNotEqualTo(String value) {
            addCriterion("shareTitle <>", value, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleGreaterThan(String value) {
            addCriterion("shareTitle >", value, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleGreaterThanOrEqualTo(String value) {
            addCriterion("shareTitle >=", value, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleLessThan(String value) {
            addCriterion("shareTitle <", value, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleLessThanOrEqualTo(String value) {
            addCriterion("shareTitle <=", value, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleLike(String value) {
            addCriterion("shareTitle like", value, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleNotLike(String value) {
            addCriterion("shareTitle not like", value, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleIn(List<String> values) {
            addCriterion("shareTitle in", values, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleNotIn(List<String> values) {
            addCriterion("shareTitle not in", values, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleBetween(String value1, String value2) {
            addCriterion("shareTitle between", value1, value2, "sharetitle");
            return (Criteria) this;
        }

        public Criteria andSharetitleNotBetween(String value1, String value2) {
            addCriterion("shareTitle not between", value1, value2, "sharetitle");
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

        public Criteria andFriendidIsNull() {
            addCriterion("friendID is null");
            return (Criteria) this;
        }

        public Criteria andFriendidIsNotNull() {
            addCriterion("friendID is not null");
            return (Criteria) this;
        }

        public Criteria andFriendidEqualTo(Integer value) {
            addCriterion("friendID =", value, "friendid");
            return (Criteria) this;
        }

        public Criteria andFriendidNotEqualTo(Integer value) {
            addCriterion("friendID <>", value, "friendid");
            return (Criteria) this;
        }

        public Criteria andFriendidGreaterThan(Integer value) {
            addCriterion("friendID >", value, "friendid");
            return (Criteria) this;
        }

        public Criteria andFriendidGreaterThanOrEqualTo(Integer value) {
            addCriterion("friendID >=", value, "friendid");
            return (Criteria) this;
        }

        public Criteria andFriendidLessThan(Integer value) {
            addCriterion("friendID <", value, "friendid");
            return (Criteria) this;
        }

        public Criteria andFriendidLessThanOrEqualTo(Integer value) {
            addCriterion("friendID <=", value, "friendid");
            return (Criteria) this;
        }

        public Criteria andFriendidIn(List<Integer> values) {
            addCriterion("friendID in", values, "friendid");
            return (Criteria) this;
        }

        public Criteria andFriendidNotIn(List<Integer> values) {
            addCriterion("friendID not in", values, "friendid");
            return (Criteria) this;
        }

        public Criteria andFriendidBetween(Integer value1, Integer value2) {
            addCriterion("friendID between", value1, value2, "friendid");
            return (Criteria) this;
        }

        public Criteria andFriendidNotBetween(Integer value1, Integer value2) {
            addCriterion("friendID not between", value1, value2, "friendid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andReadhistoryidIsNull() {
            addCriterion("readHistoryID is null");
            return (Criteria) this;
        }

        public Criteria andReadhistoryidIsNotNull() {
            addCriterion("readHistoryID is not null");
            return (Criteria) this;
        }

        public Criteria andReadhistoryidEqualTo(Integer value) {
            addCriterion("readHistoryID =", value, "readhistoryid");
            return (Criteria) this;
        }

        public Criteria andReadhistoryidNotEqualTo(Integer value) {
            addCriterion("readHistoryID <>", value, "readhistoryid");
            return (Criteria) this;
        }

        public Criteria andReadhistoryidGreaterThan(Integer value) {
            addCriterion("readHistoryID >", value, "readhistoryid");
            return (Criteria) this;
        }

        public Criteria andReadhistoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("readHistoryID >=", value, "readhistoryid");
            return (Criteria) this;
        }

        public Criteria andReadhistoryidLessThan(Integer value) {
            addCriterion("readHistoryID <", value, "readhistoryid");
            return (Criteria) this;
        }

        public Criteria andReadhistoryidLessThanOrEqualTo(Integer value) {
            addCriterion("readHistoryID <=", value, "readhistoryid");
            return (Criteria) this;
        }

        public Criteria andReadhistoryidIn(List<Integer> values) {
            addCriterion("readHistoryID in", values, "readhistoryid");
            return (Criteria) this;
        }

        public Criteria andReadhistoryidNotIn(List<Integer> values) {
            addCriterion("readHistoryID not in", values, "readhistoryid");
            return (Criteria) this;
        }

        public Criteria andReadhistoryidBetween(Integer value1, Integer value2) {
            addCriterion("readHistoryID between", value1, value2, "readhistoryid");
            return (Criteria) this;
        }

        public Criteria andReadhistoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("readHistoryID not between", value1, value2, "readhistoryid");
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