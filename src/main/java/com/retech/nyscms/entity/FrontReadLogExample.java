package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontReadLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontReadLogExample() {
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

        public Criteria andReadidIsNull() {
            addCriterion("readID is null");
            return (Criteria) this;
        }

        public Criteria andReadidIsNotNull() {
            addCriterion("readID is not null");
            return (Criteria) this;
        }

        public Criteria andReadidEqualTo(Integer value) {
            addCriterion("readID =", value, "readid");
            return (Criteria) this;
        }

        public Criteria andReadidNotEqualTo(Integer value) {
            addCriterion("readID <>", value, "readid");
            return (Criteria) this;
        }

        public Criteria andReadidGreaterThan(Integer value) {
            addCriterion("readID >", value, "readid");
            return (Criteria) this;
        }

        public Criteria andReadidGreaterThanOrEqualTo(Integer value) {
            addCriterion("readID >=", value, "readid");
            return (Criteria) this;
        }

        public Criteria andReadidLessThan(Integer value) {
            addCriterion("readID <", value, "readid");
            return (Criteria) this;
        }

        public Criteria andReadidLessThanOrEqualTo(Integer value) {
            addCriterion("readID <=", value, "readid");
            return (Criteria) this;
        }

        public Criteria andReadidIn(List<Integer> values) {
            addCriterion("readID in", values, "readid");
            return (Criteria) this;
        }

        public Criteria andReadidNotIn(List<Integer> values) {
            addCriterion("readID not in", values, "readid");
            return (Criteria) this;
        }

        public Criteria andReadidBetween(Integer value1, Integer value2) {
            addCriterion("readID between", value1, value2, "readid");
            return (Criteria) this;
        }

        public Criteria andReadidNotBetween(Integer value1, Integer value2) {
            addCriterion("readID not between", value1, value2, "readid");
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

        public Criteria andEbookidIsNull() {
            addCriterion("ebookID is null");
            return (Criteria) this;
        }

        public Criteria andEbookidIsNotNull() {
            addCriterion("ebookID is not null");
            return (Criteria) this;
        }

        public Criteria andEbookidEqualTo(Integer value) {
            addCriterion("ebookID =", value, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidNotEqualTo(Integer value) {
            addCriterion("ebookID <>", value, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidGreaterThan(Integer value) {
            addCriterion("ebookID >", value, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ebookID >=", value, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidLessThan(Integer value) {
            addCriterion("ebookID <", value, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidLessThanOrEqualTo(Integer value) {
            addCriterion("ebookID <=", value, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidIn(List<Integer> values) {
            addCriterion("ebookID in", values, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidNotIn(List<Integer> values) {
            addCriterion("ebookID not in", values, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidBetween(Integer value1, Integer value2) {
            addCriterion("ebookID between", value1, value2, "ebookid");
            return (Criteria) this;
        }

        public Criteria andEbookidNotBetween(Integer value1, Integer value2) {
            addCriterion("ebookID not between", value1, value2, "ebookid");
            return (Criteria) this;
        }

        public Criteria andReadProgressIsNull() {
            addCriterion("read_progress is null");
            return (Criteria) this;
        }

        public Criteria andReadProgressIsNotNull() {
            addCriterion("read_progress is not null");
            return (Criteria) this;
        }

        public Criteria andReadProgressEqualTo(Double value) {
            addCriterion("read_progress =", value, "readProgress");
            return (Criteria) this;
        }

        public Criteria andReadProgressNotEqualTo(Double value) {
            addCriterion("read_progress <>", value, "readProgress");
            return (Criteria) this;
        }

        public Criteria andReadProgressGreaterThan(Double value) {
            addCriterion("read_progress >", value, "readProgress");
            return (Criteria) this;
        }

        public Criteria andReadProgressGreaterThanOrEqualTo(Double value) {
            addCriterion("read_progress >=", value, "readProgress");
            return (Criteria) this;
        }

        public Criteria andReadProgressLessThan(Double value) {
            addCriterion("read_progress <", value, "readProgress");
            return (Criteria) this;
        }

        public Criteria andReadProgressLessThanOrEqualTo(Double value) {
            addCriterion("read_progress <=", value, "readProgress");
            return (Criteria) this;
        }

        public Criteria andReadProgressIn(List<Double> values) {
            addCriterion("read_progress in", values, "readProgress");
            return (Criteria) this;
        }

        public Criteria andReadProgressNotIn(List<Double> values) {
            addCriterion("read_progress not in", values, "readProgress");
            return (Criteria) this;
        }

        public Criteria andReadProgressBetween(Double value1, Double value2) {
            addCriterion("read_progress between", value1, value2, "readProgress");
            return (Criteria) this;
        }

        public Criteria andReadProgressNotBetween(Double value1, Double value2) {
            addCriterion("read_progress not between", value1, value2, "readProgress");
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

        public Criteria andCreatedtimeIsNull() {
            addCriterion("createdTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIsNotNull() {
            addCriterion("createdTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeEqualTo(Date value) {
            addCriterion("createdTime =", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotEqualTo(Date value) {
            addCriterion("createdTime <>", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeGreaterThan(Date value) {
            addCriterion("createdTime >", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createdTime >=", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeLessThan(Date value) {
            addCriterion("createdTime <", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeLessThanOrEqualTo(Date value) {
            addCriterion("createdTime <=", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIn(List<Date> values) {
            addCriterion("createdTime in", values, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotIn(List<Date> values) {
            addCriterion("createdTime not in", values, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeBetween(Date value1, Date value2) {
            addCriterion("createdTime between", value1, value2, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotBetween(Date value1, Date value2) {
            addCriterion("createdTime not between", value1, value2, "createdtime");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andChapterIndexIsNull() {
            addCriterion("chapter_index is null");
            return (Criteria) this;
        }

        public Criteria andChapterIndexIsNotNull() {
            addCriterion("chapter_index is not null");
            return (Criteria) this;
        }

        public Criteria andChapterIndexEqualTo(String value) {
            addCriterion("chapter_index =", value, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterIndexNotEqualTo(String value) {
            addCriterion("chapter_index <>", value, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterIndexGreaterThan(String value) {
            addCriterion("chapter_index >", value, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterIndexGreaterThanOrEqualTo(String value) {
            addCriterion("chapter_index >=", value, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterIndexLessThan(String value) {
            addCriterion("chapter_index <", value, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterIndexLessThanOrEqualTo(String value) {
            addCriterion("chapter_index <=", value, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterIndexLike(String value) {
            addCriterion("chapter_index like", value, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterIndexNotLike(String value) {
            addCriterion("chapter_index not like", value, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterIndexIn(List<String> values) {
            addCriterion("chapter_index in", values, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterIndexNotIn(List<String> values) {
            addCriterion("chapter_index not in", values, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterIndexBetween(String value1, String value2) {
            addCriterion("chapter_index between", value1, value2, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andChapterIndexNotBetween(String value1, String value2) {
            addCriterion("chapter_index not between", value1, value2, "chapterIndex");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
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