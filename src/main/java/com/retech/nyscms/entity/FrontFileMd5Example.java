package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.List;

public class FrontFileMd5Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontFileMd5Example() {
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

        public Criteria andFilemd5IsNull() {
            addCriterion("filemd5 is null");
            return (Criteria) this;
        }

        public Criteria andFilemd5IsNotNull() {
            addCriterion("filemd5 is not null");
            return (Criteria) this;
        }

        public Criteria andFilemd5EqualTo(String value) {
            addCriterion("filemd5 =", value, "filemd5");
            return (Criteria) this;
        }

        public Criteria andFilemd5NotEqualTo(String value) {
            addCriterion("filemd5 <>", value, "filemd5");
            return (Criteria) this;
        }

        public Criteria andFilemd5GreaterThan(String value) {
            addCriterion("filemd5 >", value, "filemd5");
            return (Criteria) this;
        }

        public Criteria andFilemd5GreaterThanOrEqualTo(String value) {
            addCriterion("filemd5 >=", value, "filemd5");
            return (Criteria) this;
        }

        public Criteria andFilemd5LessThan(String value) {
            addCriterion("filemd5 <", value, "filemd5");
            return (Criteria) this;
        }

        public Criteria andFilemd5LessThanOrEqualTo(String value) {
            addCriterion("filemd5 <=", value, "filemd5");
            return (Criteria) this;
        }

        public Criteria andFilemd5Like(String value) {
            addCriterion("filemd5 like", value, "filemd5");
            return (Criteria) this;
        }

        public Criteria andFilemd5NotLike(String value) {
            addCriterion("filemd5 not like", value, "filemd5");
            return (Criteria) this;
        }

        public Criteria andFilemd5In(List<String> values) {
            addCriterion("filemd5 in", values, "filemd5");
            return (Criteria) this;
        }

        public Criteria andFilemd5NotIn(List<String> values) {
            addCriterion("filemd5 not in", values, "filemd5");
            return (Criteria) this;
        }

        public Criteria andFilemd5Between(String value1, String value2) {
            addCriterion("filemd5 between", value1, value2, "filemd5");
            return (Criteria) this;
        }

        public Criteria andFilemd5NotBetween(String value1, String value2) {
            addCriterion("filemd5 not between", value1, value2, "filemd5");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNull() {
            addCriterion("filepath is null");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("filepath is not null");
            return (Criteria) this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("filepath =", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("filepath <>", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("filepath >", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("filepath >=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("filepath <", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("filepath <=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("filepath like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("filepath not like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("filepath in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("filepath not in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("filepath between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("filepath not between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andMachienipIsNull() {
            addCriterion("machienip is null");
            return (Criteria) this;
        }

        public Criteria andMachienipIsNotNull() {
            addCriterion("machienip is not null");
            return (Criteria) this;
        }

        public Criteria andMachienipEqualTo(String value) {
            addCriterion("machienip =", value, "machienip");
            return (Criteria) this;
        }

        public Criteria andMachienipNotEqualTo(String value) {
            addCriterion("machienip <>", value, "machienip");
            return (Criteria) this;
        }

        public Criteria andMachienipGreaterThan(String value) {
            addCriterion("machienip >", value, "machienip");
            return (Criteria) this;
        }

        public Criteria andMachienipGreaterThanOrEqualTo(String value) {
            addCriterion("machienip >=", value, "machienip");
            return (Criteria) this;
        }

        public Criteria andMachienipLessThan(String value) {
            addCriterion("machienip <", value, "machienip");
            return (Criteria) this;
        }

        public Criteria andMachienipLessThanOrEqualTo(String value) {
            addCriterion("machienip <=", value, "machienip");
            return (Criteria) this;
        }

        public Criteria andMachienipLike(String value) {
            addCriterion("machienip like", value, "machienip");
            return (Criteria) this;
        }

        public Criteria andMachienipNotLike(String value) {
            addCriterion("machienip not like", value, "machienip");
            return (Criteria) this;
        }

        public Criteria andMachienipIn(List<String> values) {
            addCriterion("machienip in", values, "machienip");
            return (Criteria) this;
        }

        public Criteria andMachienipNotIn(List<String> values) {
            addCriterion("machienip not in", values, "machienip");
            return (Criteria) this;
        }

        public Criteria andMachienipBetween(String value1, String value2) {
            addCriterion("machienip between", value1, value2, "machienip");
            return (Criteria) this;
        }

        public Criteria andMachienipNotBetween(String value1, String value2) {
            addCriterion("machienip not between", value1, value2, "machienip");
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