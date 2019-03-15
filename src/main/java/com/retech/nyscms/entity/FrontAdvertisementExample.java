package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontAdvertisementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontAdvertisementExample() {
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

        public Criteria andAdurlIsNull() {
            addCriterion("adurl is null");
            return (Criteria) this;
        }

        public Criteria andAdurlIsNotNull() {
            addCriterion("adurl is not null");
            return (Criteria) this;
        }

        public Criteria andAdurlEqualTo(String value) {
            addCriterion("adurl =", value, "adurl");
            return (Criteria) this;
        }

        public Criteria andAdurlNotEqualTo(String value) {
            addCriterion("adurl <>", value, "adurl");
            return (Criteria) this;
        }

        public Criteria andAdurlGreaterThan(String value) {
            addCriterion("adurl >", value, "adurl");
            return (Criteria) this;
        }

        public Criteria andAdurlGreaterThanOrEqualTo(String value) {
            addCriterion("adurl >=", value, "adurl");
            return (Criteria) this;
        }

        public Criteria andAdurlLessThan(String value) {
            addCriterion("adurl <", value, "adurl");
            return (Criteria) this;
        }

        public Criteria andAdurlLessThanOrEqualTo(String value) {
            addCriterion("adurl <=", value, "adurl");
            return (Criteria) this;
        }

        public Criteria andAdurlLike(String value) {
            addCriterion("adurl like", value, "adurl");
            return (Criteria) this;
        }

        public Criteria andAdurlNotLike(String value) {
            addCriterion("adurl not like", value, "adurl");
            return (Criteria) this;
        }

        public Criteria andAdurlIn(List<String> values) {
            addCriterion("adurl in", values, "adurl");
            return (Criteria) this;
        }

        public Criteria andAdurlNotIn(List<String> values) {
            addCriterion("adurl not in", values, "adurl");
            return (Criteria) this;
        }

        public Criteria andAdurlBetween(String value1, String value2) {
            addCriterion("adurl between", value1, value2, "adurl");
            return (Criteria) this;
        }

        public Criteria andAdurlNotBetween(String value1, String value2) {
            addCriterion("adurl not between", value1, value2, "adurl");
            return (Criteria) this;
        }

        public Criteria andImghrefIsNull() {
            addCriterion("imghref is null");
            return (Criteria) this;
        }

        public Criteria andImghrefIsNotNull() {
            addCriterion("imghref is not null");
            return (Criteria) this;
        }

        public Criteria andImghrefEqualTo(String value) {
            addCriterion("imghref =", value, "imghref");
            return (Criteria) this;
        }

        public Criteria andImghrefNotEqualTo(String value) {
            addCriterion("imghref <>", value, "imghref");
            return (Criteria) this;
        }

        public Criteria andImghrefGreaterThan(String value) {
            addCriterion("imghref >", value, "imghref");
            return (Criteria) this;
        }

        public Criteria andImghrefGreaterThanOrEqualTo(String value) {
            addCriterion("imghref >=", value, "imghref");
            return (Criteria) this;
        }

        public Criteria andImghrefLessThan(String value) {
            addCriterion("imghref <", value, "imghref");
            return (Criteria) this;
        }

        public Criteria andImghrefLessThanOrEqualTo(String value) {
            addCriterion("imghref <=", value, "imghref");
            return (Criteria) this;
        }

        public Criteria andImghrefLike(String value) {
            addCriterion("imghref like", value, "imghref");
            return (Criteria) this;
        }

        public Criteria andImghrefNotLike(String value) {
            addCriterion("imghref not like", value, "imghref");
            return (Criteria) this;
        }

        public Criteria andImghrefIn(List<String> values) {
            addCriterion("imghref in", values, "imghref");
            return (Criteria) this;
        }

        public Criteria andImghrefNotIn(List<String> values) {
            addCriterion("imghref not in", values, "imghref");
            return (Criteria) this;
        }

        public Criteria andImghrefBetween(String value1, String value2) {
            addCriterion("imghref between", value1, value2, "imghref");
            return (Criteria) this;
        }

        public Criteria andImghrefNotBetween(String value1, String value2) {
            addCriterion("imghref not between", value1, value2, "imghref");
            return (Criteria) this;
        }

        public Criteria andAppImghrefIsNull() {
            addCriterion("app_imghref is null");
            return (Criteria) this;
        }

        public Criteria andAppImghrefIsNotNull() {
            addCriterion("app_imghref is not null");
            return (Criteria) this;
        }

        public Criteria andAppImghrefEqualTo(String value) {
            addCriterion("app_imghref =", value, "appImghref");
            return (Criteria) this;
        }

        public Criteria andAppImghrefNotEqualTo(String value) {
            addCriterion("app_imghref <>", value, "appImghref");
            return (Criteria) this;
        }

        public Criteria andAppImghrefGreaterThan(String value) {
            addCriterion("app_imghref >", value, "appImghref");
            return (Criteria) this;
        }

        public Criteria andAppImghrefGreaterThanOrEqualTo(String value) {
            addCriterion("app_imghref >=", value, "appImghref");
            return (Criteria) this;
        }

        public Criteria andAppImghrefLessThan(String value) {
            addCriterion("app_imghref <", value, "appImghref");
            return (Criteria) this;
        }

        public Criteria andAppImghrefLessThanOrEqualTo(String value) {
            addCriterion("app_imghref <=", value, "appImghref");
            return (Criteria) this;
        }

        public Criteria andAppImghrefLike(String value) {
            addCriterion("app_imghref like", value, "appImghref");
            return (Criteria) this;
        }

        public Criteria andAppImghrefNotLike(String value) {
            addCriterion("app_imghref not like", value, "appImghref");
            return (Criteria) this;
        }

        public Criteria andAppImghrefIn(List<String> values) {
            addCriterion("app_imghref in", values, "appImghref");
            return (Criteria) this;
        }

        public Criteria andAppImghrefNotIn(List<String> values) {
            addCriterion("app_imghref not in", values, "appImghref");
            return (Criteria) this;
        }

        public Criteria andAppImghrefBetween(String value1, String value2) {
            addCriterion("app_imghref between", value1, value2, "appImghref");
            return (Criteria) this;
        }

        public Criteria andAppImghrefNotBetween(String value1, String value2) {
            addCriterion("app_imghref not between", value1, value2, "appImghref");
            return (Criteria) this;
        }

        public Criteria andViewcountIsNull() {
            addCriterion("viewcount is null");
            return (Criteria) this;
        }

        public Criteria andViewcountIsNotNull() {
            addCriterion("viewcount is not null");
            return (Criteria) this;
        }

        public Criteria andViewcountEqualTo(Integer value) {
            addCriterion("viewcount =", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountNotEqualTo(Integer value) {
            addCriterion("viewcount <>", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountGreaterThan(Integer value) {
            addCriterion("viewcount >", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("viewcount >=", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountLessThan(Integer value) {
            addCriterion("viewcount <", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountLessThanOrEqualTo(Integer value) {
            addCriterion("viewcount <=", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountIn(List<Integer> values) {
            addCriterion("viewcount in", values, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountNotIn(List<Integer> values) {
            addCriterion("viewcount not in", values, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountBetween(Integer value1, Integer value2) {
            addCriterion("viewcount between", value1, value2, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountNotBetween(Integer value1, Integer value2) {
            addCriterion("viewcount not between", value1, value2, "viewcount");
            return (Criteria) this;
        }

        public Criteria andAdtitleIsNull() {
            addCriterion("adtitle is null");
            return (Criteria) this;
        }

        public Criteria andAdtitleIsNotNull() {
            addCriterion("adtitle is not null");
            return (Criteria) this;
        }

        public Criteria andAdtitleEqualTo(String value) {
            addCriterion("adtitle =", value, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleNotEqualTo(String value) {
            addCriterion("adtitle <>", value, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleGreaterThan(String value) {
            addCriterion("adtitle >", value, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleGreaterThanOrEqualTo(String value) {
            addCriterion("adtitle >=", value, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleLessThan(String value) {
            addCriterion("adtitle <", value, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleLessThanOrEqualTo(String value) {
            addCriterion("adtitle <=", value, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleLike(String value) {
            addCriterion("adtitle like", value, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleNotLike(String value) {
            addCriterion("adtitle not like", value, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleIn(List<String> values) {
            addCriterion("adtitle in", values, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleNotIn(List<String> values) {
            addCriterion("adtitle not in", values, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleBetween(String value1, String value2) {
            addCriterion("adtitle between", value1, value2, "adtitle");
            return (Criteria) this;
        }

        public Criteria andAdtitleNotBetween(String value1, String value2) {
            addCriterion("adtitle not between", value1, value2, "adtitle");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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