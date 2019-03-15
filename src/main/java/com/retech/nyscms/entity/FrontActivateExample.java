package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontActivateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontActivateExample() {
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

        public Criteria andActivatecodeIsNull() {
            addCriterion("activatecode is null");
            return (Criteria) this;
        }

        public Criteria andActivatecodeIsNotNull() {
            addCriterion("activatecode is not null");
            return (Criteria) this;
        }

        public Criteria andActivatecodeEqualTo(String value) {
            addCriterion("activatecode =", value, "activatecode");
            return (Criteria) this;
        }

        public Criteria andActivatecodeNotEqualTo(String value) {
            addCriterion("activatecode <>", value, "activatecode");
            return (Criteria) this;
        }

        public Criteria andActivatecodeGreaterThan(String value) {
            addCriterion("activatecode >", value, "activatecode");
            return (Criteria) this;
        }

        public Criteria andActivatecodeGreaterThanOrEqualTo(String value) {
            addCriterion("activatecode >=", value, "activatecode");
            return (Criteria) this;
        }

        public Criteria andActivatecodeLessThan(String value) {
            addCriterion("activatecode <", value, "activatecode");
            return (Criteria) this;
        }

        public Criteria andActivatecodeLessThanOrEqualTo(String value) {
            addCriterion("activatecode <=", value, "activatecode");
            return (Criteria) this;
        }

        public Criteria andActivatecodeLike(String value) {
            addCriterion("activatecode like", value, "activatecode");
            return (Criteria) this;
        }

        public Criteria andActivatecodeNotLike(String value) {
            addCriterion("activatecode not like", value, "activatecode");
            return (Criteria) this;
        }

        public Criteria andActivatecodeIn(List<String> values) {
            addCriterion("activatecode in", values, "activatecode");
            return (Criteria) this;
        }

        public Criteria andActivatecodeNotIn(List<String> values) {
            addCriterion("activatecode not in", values, "activatecode");
            return (Criteria) this;
        }

        public Criteria andActivatecodeBetween(String value1, String value2) {
            addCriterion("activatecode between", value1, value2, "activatecode");
            return (Criteria) this;
        }

        public Criteria andActivatecodeNotBetween(String value1, String value2) {
            addCriterion("activatecode not between", value1, value2, "activatecode");
            return (Criteria) this;
        }

        public Criteria andActivatenumberIsNull() {
            addCriterion("activatenumber is null");
            return (Criteria) this;
        }

        public Criteria andActivatenumberIsNotNull() {
            addCriterion("activatenumber is not null");
            return (Criteria) this;
        }

        public Criteria andActivatenumberEqualTo(String value) {
            addCriterion("activatenumber =", value, "activatenumber");
            return (Criteria) this;
        }

        public Criteria andActivatenumberNotEqualTo(String value) {
            addCriterion("activatenumber <>", value, "activatenumber");
            return (Criteria) this;
        }

        public Criteria andActivatenumberGreaterThan(String value) {
            addCriterion("activatenumber >", value, "activatenumber");
            return (Criteria) this;
        }

        public Criteria andActivatenumberGreaterThanOrEqualTo(String value) {
            addCriterion("activatenumber >=", value, "activatenumber");
            return (Criteria) this;
        }

        public Criteria andActivatenumberLessThan(String value) {
            addCriterion("activatenumber <", value, "activatenumber");
            return (Criteria) this;
        }

        public Criteria andActivatenumberLessThanOrEqualTo(String value) {
            addCriterion("activatenumber <=", value, "activatenumber");
            return (Criteria) this;
        }

        public Criteria andActivatenumberLike(String value) {
            addCriterion("activatenumber like", value, "activatenumber");
            return (Criteria) this;
        }

        public Criteria andActivatenumberNotLike(String value) {
            addCriterion("activatenumber not like", value, "activatenumber");
            return (Criteria) this;
        }

        public Criteria andActivatenumberIn(List<String> values) {
            addCriterion("activatenumber in", values, "activatenumber");
            return (Criteria) this;
        }

        public Criteria andActivatenumberNotIn(List<String> values) {
            addCriterion("activatenumber not in", values, "activatenumber");
            return (Criteria) this;
        }

        public Criteria andActivatenumberBetween(String value1, String value2) {
            addCriterion("activatenumber between", value1, value2, "activatenumber");
            return (Criteria) this;
        }

        public Criteria andActivatenumberNotBetween(String value1, String value2) {
            addCriterion("activatenumber not between", value1, value2, "activatenumber");
            return (Criteria) this;
        }

        public Criteria andBookidsIsNull() {
            addCriterion("bookids is null");
            return (Criteria) this;
        }

        public Criteria andBookidsIsNotNull() {
            addCriterion("bookids is not null");
            return (Criteria) this;
        }

        public Criteria andBookidsEqualTo(String value) {
            addCriterion("bookids =", value, "bookids");
            return (Criteria) this;
        }

        public Criteria andBookidsNotEqualTo(String value) {
            addCriterion("bookids <>", value, "bookids");
            return (Criteria) this;
        }

        public Criteria andBookidsGreaterThan(String value) {
            addCriterion("bookids >", value, "bookids");
            return (Criteria) this;
        }

        public Criteria andBookidsGreaterThanOrEqualTo(String value) {
            addCriterion("bookids >=", value, "bookids");
            return (Criteria) this;
        }

        public Criteria andBookidsLessThan(String value) {
            addCriterion("bookids <", value, "bookids");
            return (Criteria) this;
        }

        public Criteria andBookidsLessThanOrEqualTo(String value) {
            addCriterion("bookids <=", value, "bookids");
            return (Criteria) this;
        }

        public Criteria andBookidsLike(String value) {
            addCriterion("bookids like", value, "bookids");
            return (Criteria) this;
        }

        public Criteria andBookidsNotLike(String value) {
            addCriterion("bookids not like", value, "bookids");
            return (Criteria) this;
        }

        public Criteria andBookidsIn(List<String> values) {
            addCriterion("bookids in", values, "bookids");
            return (Criteria) this;
        }

        public Criteria andBookidsNotIn(List<String> values) {
            addCriterion("bookids not in", values, "bookids");
            return (Criteria) this;
        }

        public Criteria andBookidsBetween(String value1, String value2) {
            addCriterion("bookids between", value1, value2, "bookids");
            return (Criteria) this;
        }

        public Criteria andBookidsNotBetween(String value1, String value2) {
            addCriterion("bookids not between", value1, value2, "bookids");
            return (Criteria) this;
        }

        public Criteria andBookcountIsNull() {
            addCriterion("bookcount is null");
            return (Criteria) this;
        }

        public Criteria andBookcountIsNotNull() {
            addCriterion("bookcount is not null");
            return (Criteria) this;
        }

        public Criteria andBookcountEqualTo(Integer value) {
            addCriterion("bookcount =", value, "bookcount");
            return (Criteria) this;
        }

        public Criteria andBookcountNotEqualTo(Integer value) {
            addCriterion("bookcount <>", value, "bookcount");
            return (Criteria) this;
        }

        public Criteria andBookcountGreaterThan(Integer value) {
            addCriterion("bookcount >", value, "bookcount");
            return (Criteria) this;
        }

        public Criteria andBookcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookcount >=", value, "bookcount");
            return (Criteria) this;
        }

        public Criteria andBookcountLessThan(Integer value) {
            addCriterion("bookcount <", value, "bookcount");
            return (Criteria) this;
        }

        public Criteria andBookcountLessThanOrEqualTo(Integer value) {
            addCriterion("bookcount <=", value, "bookcount");
            return (Criteria) this;
        }

        public Criteria andBookcountIn(List<Integer> values) {
            addCriterion("bookcount in", values, "bookcount");
            return (Criteria) this;
        }

        public Criteria andBookcountNotIn(List<Integer> values) {
            addCriterion("bookcount not in", values, "bookcount");
            return (Criteria) this;
        }

        public Criteria andBookcountBetween(Integer value1, Integer value2) {
            addCriterion("bookcount between", value1, value2, "bookcount");
            return (Criteria) this;
        }

        public Criteria andBookcountNotBetween(Integer value1, Integer value2) {
            addCriterion("bookcount not between", value1, value2, "bookcount");
            return (Criteria) this;
        }

        public Criteria andActivatetypeIsNull() {
            addCriterion("activatetype is null");
            return (Criteria) this;
        }

        public Criteria andActivatetypeIsNotNull() {
            addCriterion("activatetype is not null");
            return (Criteria) this;
        }

        public Criteria andActivatetypeEqualTo(String value) {
            addCriterion("activatetype =", value, "activatetype");
            return (Criteria) this;
        }

        public Criteria andActivatetypeNotEqualTo(String value) {
            addCriterion("activatetype <>", value, "activatetype");
            return (Criteria) this;
        }

        public Criteria andActivatetypeGreaterThan(String value) {
            addCriterion("activatetype >", value, "activatetype");
            return (Criteria) this;
        }

        public Criteria andActivatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("activatetype >=", value, "activatetype");
            return (Criteria) this;
        }

        public Criteria andActivatetypeLessThan(String value) {
            addCriterion("activatetype <", value, "activatetype");
            return (Criteria) this;
        }

        public Criteria andActivatetypeLessThanOrEqualTo(String value) {
            addCriterion("activatetype <=", value, "activatetype");
            return (Criteria) this;
        }

        public Criteria andActivatetypeLike(String value) {
            addCriterion("activatetype like", value, "activatetype");
            return (Criteria) this;
        }

        public Criteria andActivatetypeNotLike(String value) {
            addCriterion("activatetype not like", value, "activatetype");
            return (Criteria) this;
        }

        public Criteria andActivatetypeIn(List<String> values) {
            addCriterion("activatetype in", values, "activatetype");
            return (Criteria) this;
        }

        public Criteria andActivatetypeNotIn(List<String> values) {
            addCriterion("activatetype not in", values, "activatetype");
            return (Criteria) this;
        }

        public Criteria andActivatetypeBetween(String value1, String value2) {
            addCriterion("activatetype between", value1, value2, "activatetype");
            return (Criteria) this;
        }

        public Criteria andActivatetypeNotBetween(String value1, String value2) {
            addCriterion("activatetype not between", value1, value2, "activatetype");
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

        public Criteria andEffectivedaysIsNull() {
            addCriterion("effectiveDays is null");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysIsNotNull() {
            addCriterion("effectiveDays is not null");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysEqualTo(Integer value) {
            addCriterion("effectiveDays =", value, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysNotEqualTo(Integer value) {
            addCriterion("effectiveDays <>", value, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysGreaterThan(Integer value) {
            addCriterion("effectiveDays >", value, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("effectiveDays >=", value, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysLessThan(Integer value) {
            addCriterion("effectiveDays <", value, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysLessThanOrEqualTo(Integer value) {
            addCriterion("effectiveDays <=", value, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysIn(List<Integer> values) {
            addCriterion("effectiveDays in", values, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysNotIn(List<Integer> values) {
            addCriterion("effectiveDays not in", values, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysBetween(Integer value1, Integer value2) {
            addCriterion("effectiveDays between", value1, value2, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysNotBetween(Integer value1, Integer value2) {
            addCriterion("effectiveDays not between", value1, value2, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andStartactivettimeIsNull() {
            addCriterion("startactivettime is null");
            return (Criteria) this;
        }

        public Criteria andStartactivettimeIsNotNull() {
            addCriterion("startactivettime is not null");
            return (Criteria) this;
        }

        public Criteria andStartactivettimeEqualTo(Date value) {
            addCriterion("startactivettime =", value, "startactivettime");
            return (Criteria) this;
        }

        public Criteria andStartactivettimeNotEqualTo(Date value) {
            addCriterion("startactivettime <>", value, "startactivettime");
            return (Criteria) this;
        }

        public Criteria andStartactivettimeGreaterThan(Date value) {
            addCriterion("startactivettime >", value, "startactivettime");
            return (Criteria) this;
        }

        public Criteria andStartactivettimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startactivettime >=", value, "startactivettime");
            return (Criteria) this;
        }

        public Criteria andStartactivettimeLessThan(Date value) {
            addCriterion("startactivettime <", value, "startactivettime");
            return (Criteria) this;
        }

        public Criteria andStartactivettimeLessThanOrEqualTo(Date value) {
            addCriterion("startactivettime <=", value, "startactivettime");
            return (Criteria) this;
        }

        public Criteria andStartactivettimeIn(List<Date> values) {
            addCriterion("startactivettime in", values, "startactivettime");
            return (Criteria) this;
        }

        public Criteria andStartactivettimeNotIn(List<Date> values) {
            addCriterion("startactivettime not in", values, "startactivettime");
            return (Criteria) this;
        }

        public Criteria andStartactivettimeBetween(Date value1, Date value2) {
            addCriterion("startactivettime between", value1, value2, "startactivettime");
            return (Criteria) this;
        }

        public Criteria andStartactivettimeNotBetween(Date value1, Date value2) {
            addCriterion("startactivettime not between", value1, value2, "startactivettime");
            return (Criteria) this;
        }

        public Criteria andEndactivettimeIsNull() {
            addCriterion("endactivettime is null");
            return (Criteria) this;
        }

        public Criteria andEndactivettimeIsNotNull() {
            addCriterion("endactivettime is not null");
            return (Criteria) this;
        }

        public Criteria andEndactivettimeEqualTo(Date value) {
            addCriterion("endactivettime =", value, "endactivettime");
            return (Criteria) this;
        }

        public Criteria andEndactivettimeNotEqualTo(Date value) {
            addCriterion("endactivettime <>", value, "endactivettime");
            return (Criteria) this;
        }

        public Criteria andEndactivettimeGreaterThan(Date value) {
            addCriterion("endactivettime >", value, "endactivettime");
            return (Criteria) this;
        }

        public Criteria andEndactivettimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endactivettime >=", value, "endactivettime");
            return (Criteria) this;
        }

        public Criteria andEndactivettimeLessThan(Date value) {
            addCriterion("endactivettime <", value, "endactivettime");
            return (Criteria) this;
        }

        public Criteria andEndactivettimeLessThanOrEqualTo(Date value) {
            addCriterion("endactivettime <=", value, "endactivettime");
            return (Criteria) this;
        }

        public Criteria andEndactivettimeIn(List<Date> values) {
            addCriterion("endactivettime in", values, "endactivettime");
            return (Criteria) this;
        }

        public Criteria andEndactivettimeNotIn(List<Date> values) {
            addCriterion("endactivettime not in", values, "endactivettime");
            return (Criteria) this;
        }

        public Criteria andEndactivettimeBetween(Date value1, Date value2) {
            addCriterion("endactivettime between", value1, value2, "endactivettime");
            return (Criteria) this;
        }

        public Criteria andEndactivettimeNotBetween(Date value1, Date value2) {
            addCriterion("endactivettime not between", value1, value2, "endactivettime");
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