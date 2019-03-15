package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FrontUserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontUserInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNull() {
            addCriterion("passwd is null");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNotNull() {
            addCriterion("passwd is not null");
            return (Criteria) this;
        }

        public Criteria andPasswdEqualTo(String value) {
            addCriterion("passwd =", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotEqualTo(String value) {
            addCriterion("passwd <>", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThan(String value) {
            addCriterion("passwd >", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("passwd >=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThan(String value) {
            addCriterion("passwd <", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThanOrEqualTo(String value) {
            addCriterion("passwd <=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLike(String value) {
            addCriterion("passwd like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotLike(String value) {
            addCriterion("passwd not like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdIn(List<String> values) {
            addCriterion("passwd in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotIn(List<String> values) {
            addCriterion("passwd not in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdBetween(String value1, String value2) {
            addCriterion("passwd between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotBetween(String value1, String value2) {
            addCriterion("passwd not between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andInterestIsNull() {
            addCriterion("interest is null");
            return (Criteria) this;
        }

        public Criteria andInterestIsNotNull() {
            addCriterion("interest is not null");
            return (Criteria) this;
        }

        public Criteria andInterestEqualTo(String value) {
            addCriterion("interest =", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotEqualTo(String value) {
            addCriterion("interest <>", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThan(String value) {
            addCriterion("interest >", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThanOrEqualTo(String value) {
            addCriterion("interest >=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThan(String value) {
            addCriterion("interest <", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThanOrEqualTo(String value) {
            addCriterion("interest <=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLike(String value) {
            addCriterion("interest like", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotLike(String value) {
            addCriterion("interest not like", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestIn(List<String> values) {
            addCriterion("interest in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotIn(List<String> values) {
            addCriterion("interest not in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestBetween(String value1, String value2) {
            addCriterion("interest between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotBetween(String value1, String value2) {
            addCriterion("interest not between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("userType is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("userType is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(Integer value) {
            addCriterion("userType =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(Integer value) {
            addCriterion("userType <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(Integer value) {
            addCriterion("userType >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("userType >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(Integer value) {
            addCriterion("userType <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(Integer value) {
            addCriterion("userType <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<Integer> values) {
            addCriterion("userType in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<Integer> values) {
            addCriterion("userType not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(Integer value1, Integer value2) {
            addCriterion("userType between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("userType not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(Integer value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(Integer value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(Integer value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(Integer value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(Integer value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(Integer value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<Integer> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<Integer> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(Integer value1, Integer value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(Integer value1, Integer value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountrynameIsNull() {
            addCriterion("countryName is null");
            return (Criteria) this;
        }

        public Criteria andCountrynameIsNotNull() {
            addCriterion("countryName is not null");
            return (Criteria) this;
        }

        public Criteria andCountrynameEqualTo(String value) {
            addCriterion("countryName =", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameNotEqualTo(String value) {
            addCriterion("countryName <>", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameGreaterThan(String value) {
            addCriterion("countryName >", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameGreaterThanOrEqualTo(String value) {
            addCriterion("countryName >=", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameLessThan(String value) {
            addCriterion("countryName <", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameLessThanOrEqualTo(String value) {
            addCriterion("countryName <=", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameLike(String value) {
            addCriterion("countryName like", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameNotLike(String value) {
            addCriterion("countryName not like", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameIn(List<String> values) {
            addCriterion("countryName in", values, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameNotIn(List<String> values) {
            addCriterion("countryName not in", values, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameBetween(String value1, String value2) {
            addCriterion("countryName between", value1, value2, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameNotBetween(String value1, String value2) {
            addCriterion("countryName not between", value1, value2, "countryname");
            return (Criteria) this;
        }

        public Criteria andMothertongueIsNull() {
            addCriterion("motherTongue is null");
            return (Criteria) this;
        }

        public Criteria andMothertongueIsNotNull() {
            addCriterion("motherTongue is not null");
            return (Criteria) this;
        }

        public Criteria andMothertongueEqualTo(String value) {
            addCriterion("motherTongue =", value, "mothertongue");
            return (Criteria) this;
        }

        public Criteria andMothertongueNotEqualTo(String value) {
            addCriterion("motherTongue <>", value, "mothertongue");
            return (Criteria) this;
        }

        public Criteria andMothertongueGreaterThan(String value) {
            addCriterion("motherTongue >", value, "mothertongue");
            return (Criteria) this;
        }

        public Criteria andMothertongueGreaterThanOrEqualTo(String value) {
            addCriterion("motherTongue >=", value, "mothertongue");
            return (Criteria) this;
        }

        public Criteria andMothertongueLessThan(String value) {
            addCriterion("motherTongue <", value, "mothertongue");
            return (Criteria) this;
        }

        public Criteria andMothertongueLessThanOrEqualTo(String value) {
            addCriterion("motherTongue <=", value, "mothertongue");
            return (Criteria) this;
        }

        public Criteria andMothertongueLike(String value) {
            addCriterion("motherTongue like", value, "mothertongue");
            return (Criteria) this;
        }

        public Criteria andMothertongueNotLike(String value) {
            addCriterion("motherTongue not like", value, "mothertongue");
            return (Criteria) this;
        }

        public Criteria andMothertongueIn(List<String> values) {
            addCriterion("motherTongue in", values, "mothertongue");
            return (Criteria) this;
        }

        public Criteria andMothertongueNotIn(List<String> values) {
            addCriterion("motherTongue not in", values, "mothertongue");
            return (Criteria) this;
        }

        public Criteria andMothertongueBetween(String value1, String value2) {
            addCriterion("motherTongue between", value1, value2, "mothertongue");
            return (Criteria) this;
        }

        public Criteria andMothertongueNotBetween(String value1, String value2) {
            addCriterion("motherTongue not between", value1, value2, "mothertongue");
            return (Criteria) this;
        }

        public Criteria andLeanchyearIsNull() {
            addCriterion("leanCHYear is null");
            return (Criteria) this;
        }

        public Criteria andLeanchyearIsNotNull() {
            addCriterion("leanCHYear is not null");
            return (Criteria) this;
        }

        public Criteria andLeanchyearEqualTo(Integer value) {
            addCriterion("leanCHYear =", value, "leanchyear");
            return (Criteria) this;
        }

        public Criteria andLeanchyearNotEqualTo(Integer value) {
            addCriterion("leanCHYear <>", value, "leanchyear");
            return (Criteria) this;
        }

        public Criteria andLeanchyearGreaterThan(Integer value) {
            addCriterion("leanCHYear >", value, "leanchyear");
            return (Criteria) this;
        }

        public Criteria andLeanchyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("leanCHYear >=", value, "leanchyear");
            return (Criteria) this;
        }

        public Criteria andLeanchyearLessThan(Integer value) {
            addCriterion("leanCHYear <", value, "leanchyear");
            return (Criteria) this;
        }

        public Criteria andLeanchyearLessThanOrEqualTo(Integer value) {
            addCriterion("leanCHYear <=", value, "leanchyear");
            return (Criteria) this;
        }

        public Criteria andLeanchyearIn(List<Integer> values) {
            addCriterion("leanCHYear in", values, "leanchyear");
            return (Criteria) this;
        }

        public Criteria andLeanchyearNotIn(List<Integer> values) {
            addCriterion("leanCHYear not in", values, "leanchyear");
            return (Criteria) this;
        }

        public Criteria andLeanchyearBetween(Integer value1, Integer value2) {
            addCriterion("leanCHYear between", value1, value2, "leanchyear");
            return (Criteria) this;
        }

        public Criteria andLeanchyearNotBetween(Integer value1, Integer value2) {
            addCriterion("leanCHYear not between", value1, value2, "leanchyear");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("imei is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("imei is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("imei =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("imei <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("imei >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("imei >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("imei <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("imei <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("imei like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("imei not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("imei in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("imei not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("imei between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("imei not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImsiIsNull() {
            addCriterion("imsi is null");
            return (Criteria) this;
        }

        public Criteria andImsiIsNotNull() {
            addCriterion("imsi is not null");
            return (Criteria) this;
        }

        public Criteria andImsiEqualTo(String value) {
            addCriterion("imsi =", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotEqualTo(String value) {
            addCriterion("imsi <>", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThan(String value) {
            addCriterion("imsi >", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThanOrEqualTo(String value) {
            addCriterion("imsi >=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThan(String value) {
            addCriterion("imsi <", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThanOrEqualTo(String value) {
            addCriterion("imsi <=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLike(String value) {
            addCriterion("imsi like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotLike(String value) {
            addCriterion("imsi not like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiIn(List<String> values) {
            addCriterion("imsi in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotIn(List<String> values) {
            addCriterion("imsi not in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiBetween(String value1, String value2) {
            addCriterion("imsi between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotBetween(String value1, String value2) {
            addCriterion("imsi not between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andSchooltypeIsNull() {
            addCriterion("schoolType is null");
            return (Criteria) this;
        }

        public Criteria andSchooltypeIsNotNull() {
            addCriterion("schoolType is not null");
            return (Criteria) this;
        }

        public Criteria andSchooltypeEqualTo(Integer value) {
            addCriterion("schoolType =", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeNotEqualTo(Integer value) {
            addCriterion("schoolType <>", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeGreaterThan(Integer value) {
            addCriterion("schoolType >", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("schoolType >=", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeLessThan(Integer value) {
            addCriterion("schoolType <", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeLessThanOrEqualTo(Integer value) {
            addCriterion("schoolType <=", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeIn(List<Integer> values) {
            addCriterion("schoolType in", values, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeNotIn(List<Integer> values) {
            addCriterion("schoolType not in", values, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeBetween(Integer value1, Integer value2) {
            addCriterion("schoolType between", value1, value2, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeNotBetween(Integer value1, Integer value2) {
            addCriterion("schoolType not between", value1, value2, "schooltype");
            return (Criteria) this;
        }

        public Criteria andCanviewIsNull() {
            addCriterion("canview is null");
            return (Criteria) this;
        }

        public Criteria andCanviewIsNotNull() {
            addCriterion("canview is not null");
            return (Criteria) this;
        }

        public Criteria andCanviewEqualTo(Integer value) {
            addCriterion("canview =", value, "canview");
            return (Criteria) this;
        }

        public Criteria andCanviewNotEqualTo(Integer value) {
            addCriterion("canview <>", value, "canview");
            return (Criteria) this;
        }

        public Criteria andCanviewGreaterThan(Integer value) {
            addCriterion("canview >", value, "canview");
            return (Criteria) this;
        }

        public Criteria andCanviewGreaterThanOrEqualTo(Integer value) {
            addCriterion("canview >=", value, "canview");
            return (Criteria) this;
        }

        public Criteria andCanviewLessThan(Integer value) {
            addCriterion("canview <", value, "canview");
            return (Criteria) this;
        }

        public Criteria andCanviewLessThanOrEqualTo(Integer value) {
            addCriterion("canview <=", value, "canview");
            return (Criteria) this;
        }

        public Criteria andCanviewIn(List<Integer> values) {
            addCriterion("canview in", values, "canview");
            return (Criteria) this;
        }

        public Criteria andCanviewNotIn(List<Integer> values) {
            addCriterion("canview not in", values, "canview");
            return (Criteria) this;
        }

        public Criteria andCanviewBetween(Integer value1, Integer value2) {
            addCriterion("canview between", value1, value2, "canview");
            return (Criteria) this;
        }

        public Criteria andCanviewNotBetween(Integer value1, Integer value2) {
            addCriterion("canview not between", value1, value2, "canview");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIsNull() {
            addCriterion("organizationId is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIsNotNull() {
            addCriterion("organizationId is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationidEqualTo(Integer value) {
            addCriterion("organizationId =", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotEqualTo(Integer value) {
            addCriterion("organizationId <>", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidGreaterThan(Integer value) {
            addCriterion("organizationId >", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("organizationId >=", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLessThan(Integer value) {
            addCriterion("organizationId <", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLessThanOrEqualTo(Integer value) {
            addCriterion("organizationId <=", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIn(List<Integer> values) {
            addCriterion("organizationId in", values, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotIn(List<Integer> values) {
            addCriterion("organizationId not in", values, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidBetween(Integer value1, Integer value2) {
            addCriterion("organizationId between", value1, value2, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotBetween(Integer value1, Integer value2) {
            addCriterion("organizationId not between", value1, value2, "organizationid");
            return (Criteria) this;
        }

        public Criteria andTeacherstatusIsNull() {
            addCriterion("teacherstatus is null");
            return (Criteria) this;
        }

        public Criteria andTeacherstatusIsNotNull() {
            addCriterion("teacherstatus is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherstatusEqualTo(String value) {
            addCriterion("teacherstatus =", value, "teacherstatus");
            return (Criteria) this;
        }

        public Criteria andTeacherstatusNotEqualTo(String value) {
            addCriterion("teacherstatus <>", value, "teacherstatus");
            return (Criteria) this;
        }

        public Criteria andTeacherstatusGreaterThan(String value) {
            addCriterion("teacherstatus >", value, "teacherstatus");
            return (Criteria) this;
        }

        public Criteria andTeacherstatusGreaterThanOrEqualTo(String value) {
            addCriterion("teacherstatus >=", value, "teacherstatus");
            return (Criteria) this;
        }

        public Criteria andTeacherstatusLessThan(String value) {
            addCriterion("teacherstatus <", value, "teacherstatus");
            return (Criteria) this;
        }

        public Criteria andTeacherstatusLessThanOrEqualTo(String value) {
            addCriterion("teacherstatus <=", value, "teacherstatus");
            return (Criteria) this;
        }

        public Criteria andTeacherstatusLike(String value) {
            addCriterion("teacherstatus like", value, "teacherstatus");
            return (Criteria) this;
        }

        public Criteria andTeacherstatusNotLike(String value) {
            addCriterion("teacherstatus not like", value, "teacherstatus");
            return (Criteria) this;
        }

        public Criteria andTeacherstatusIn(List<String> values) {
            addCriterion("teacherstatus in", values, "teacherstatus");
            return (Criteria) this;
        }

        public Criteria andTeacherstatusNotIn(List<String> values) {
            addCriterion("teacherstatus not in", values, "teacherstatus");
            return (Criteria) this;
        }

        public Criteria andTeacherstatusBetween(String value1, String value2) {
            addCriterion("teacherstatus between", value1, value2, "teacherstatus");
            return (Criteria) this;
        }

        public Criteria andTeacherstatusNotBetween(String value1, String value2) {
            addCriterion("teacherstatus not between", value1, value2, "teacherstatus");
            return (Criteria) this;
        }

        public Criteria andPaypassIsNull() {
            addCriterion("payPass is null");
            return (Criteria) this;
        }

        public Criteria andPaypassIsNotNull() {
            addCriterion("payPass is not null");
            return (Criteria) this;
        }

        public Criteria andPaypassEqualTo(String value) {
            addCriterion("payPass =", value, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassNotEqualTo(String value) {
            addCriterion("payPass <>", value, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassGreaterThan(String value) {
            addCriterion("payPass >", value, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassGreaterThanOrEqualTo(String value) {
            addCriterion("payPass >=", value, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassLessThan(String value) {
            addCriterion("payPass <", value, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassLessThanOrEqualTo(String value) {
            addCriterion("payPass <=", value, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassLike(String value) {
            addCriterion("payPass like", value, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassNotLike(String value) {
            addCriterion("payPass not like", value, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassIn(List<String> values) {
            addCriterion("payPass in", values, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassNotIn(List<String> values) {
            addCriterion("payPass not in", values, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassBetween(String value1, String value2) {
            addCriterion("payPass between", value1, value2, "paypass");
            return (Criteria) this;
        }

        public Criteria andPaypassNotBetween(String value1, String value2) {
            addCriterion("payPass not between", value1, value2, "paypass");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("classID is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("classID is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Integer value) {
            addCriterion("classID =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Integer value) {
            addCriterion("classID <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Integer value) {
            addCriterion("classID >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("classID >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Integer value) {
            addCriterion("classID <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Integer value) {
            addCriterion("classID <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Integer> values) {
            addCriterion("classID in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Integer> values) {
            addCriterion("classID not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Integer value1, Integer value2) {
            addCriterion("classID between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("classID not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andEmailstatusIsNull() {
            addCriterion("emailStatus is null");
            return (Criteria) this;
        }

        public Criteria andEmailstatusIsNotNull() {
            addCriterion("emailStatus is not null");
            return (Criteria) this;
        }

        public Criteria andEmailstatusEqualTo(Integer value) {
            addCriterion("emailStatus =", value, "emailstatus");
            return (Criteria) this;
        }

        public Criteria andEmailstatusNotEqualTo(Integer value) {
            addCriterion("emailStatus <>", value, "emailstatus");
            return (Criteria) this;
        }

        public Criteria andEmailstatusGreaterThan(Integer value) {
            addCriterion("emailStatus >", value, "emailstatus");
            return (Criteria) this;
        }

        public Criteria andEmailstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("emailStatus >=", value, "emailstatus");
            return (Criteria) this;
        }

        public Criteria andEmailstatusLessThan(Integer value) {
            addCriterion("emailStatus <", value, "emailstatus");
            return (Criteria) this;
        }

        public Criteria andEmailstatusLessThanOrEqualTo(Integer value) {
            addCriterion("emailStatus <=", value, "emailstatus");
            return (Criteria) this;
        }

        public Criteria andEmailstatusIn(List<Integer> values) {
            addCriterion("emailStatus in", values, "emailstatus");
            return (Criteria) this;
        }

        public Criteria andEmailstatusNotIn(List<Integer> values) {
            addCriterion("emailStatus not in", values, "emailstatus");
            return (Criteria) this;
        }

        public Criteria andEmailstatusBetween(Integer value1, Integer value2) {
            addCriterion("emailStatus between", value1, value2, "emailstatus");
            return (Criteria) this;
        }

        public Criteria andEmailstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("emailStatus not between", value1, value2, "emailstatus");
            return (Criteria) this;
        }

        public Criteria andPhonestatusIsNull() {
            addCriterion("phoneStatus is null");
            return (Criteria) this;
        }

        public Criteria andPhonestatusIsNotNull() {
            addCriterion("phoneStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPhonestatusEqualTo(Integer value) {
            addCriterion("phoneStatus =", value, "phonestatus");
            return (Criteria) this;
        }

        public Criteria andPhonestatusNotEqualTo(Integer value) {
            addCriterion("phoneStatus <>", value, "phonestatus");
            return (Criteria) this;
        }

        public Criteria andPhonestatusGreaterThan(Integer value) {
            addCriterion("phoneStatus >", value, "phonestatus");
            return (Criteria) this;
        }

        public Criteria andPhonestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("phoneStatus >=", value, "phonestatus");
            return (Criteria) this;
        }

        public Criteria andPhonestatusLessThan(Integer value) {
            addCriterion("phoneStatus <", value, "phonestatus");
            return (Criteria) this;
        }

        public Criteria andPhonestatusLessThanOrEqualTo(Integer value) {
            addCriterion("phoneStatus <=", value, "phonestatus");
            return (Criteria) this;
        }

        public Criteria andPhonestatusIn(List<Integer> values) {
            addCriterion("phoneStatus in", values, "phonestatus");
            return (Criteria) this;
        }

        public Criteria andPhonestatusNotIn(List<Integer> values) {
            addCriterion("phoneStatus not in", values, "phonestatus");
            return (Criteria) this;
        }

        public Criteria andPhonestatusBetween(Integer value1, Integer value2) {
            addCriterion("phoneStatus between", value1, value2, "phonestatus");
            return (Criteria) this;
        }

        public Criteria andPhonestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("phoneStatus not between", value1, value2, "phonestatus");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNull() {
            addCriterion("loginIP is null");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNotNull() {
            addCriterion("loginIP is not null");
            return (Criteria) this;
        }

        public Criteria andLoginipEqualTo(String value) {
            addCriterion("loginIP =", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotEqualTo(String value) {
            addCriterion("loginIP <>", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThan(String value) {
            addCriterion("loginIP >", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThanOrEqualTo(String value) {
            addCriterion("loginIP >=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThan(String value) {
            addCriterion("loginIP <", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThanOrEqualTo(String value) {
            addCriterion("loginIP <=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLike(String value) {
            addCriterion("loginIP like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotLike(String value) {
            addCriterion("loginIP not like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipIn(List<String> values) {
            addCriterion("loginIP in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotIn(List<String> values) {
            addCriterion("loginIP not in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipBetween(String value1, String value2) {
            addCriterion("loginIP between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotBetween(String value1, String value2) {
            addCriterion("loginIP not between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNull() {
            addCriterion("lastLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNotNull() {
            addCriterion("lastLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeEqualTo(Date value) {
            addCriterion("lastLoginTime =", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotEqualTo(Date value) {
            addCriterion("lastLoginTime <>", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThan(Date value) {
            addCriterion("lastLoginTime >", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastLoginTime >=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThan(Date value) {
            addCriterion("lastLoginTime <", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("lastLoginTime <=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIn(List<Date> values) {
            addCriterion("lastLoginTime in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotIn(List<Date> values) {
            addCriterion("lastLoginTime not in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeBetween(Date value1, Date value2) {
            addCriterion("lastLoginTime between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("lastLoginTime not between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastipIsNull() {
            addCriterion("lastIP is null");
            return (Criteria) this;
        }

        public Criteria andLastipIsNotNull() {
            addCriterion("lastIP is not null");
            return (Criteria) this;
        }

        public Criteria andLastipEqualTo(String value) {
            addCriterion("lastIP =", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipNotEqualTo(String value) {
            addCriterion("lastIP <>", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipGreaterThan(String value) {
            addCriterion("lastIP >", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipGreaterThanOrEqualTo(String value) {
            addCriterion("lastIP >=", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipLessThan(String value) {
            addCriterion("lastIP <", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipLessThanOrEqualTo(String value) {
            addCriterion("lastIP <=", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipLike(String value) {
            addCriterion("lastIP like", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipNotLike(String value) {
            addCriterion("lastIP not like", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipIn(List<String> values) {
            addCriterion("lastIP in", values, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipNotIn(List<String> values) {
            addCriterion("lastIP not in", values, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipBetween(String value1, String value2) {
            addCriterion("lastIP between", value1, value2, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipNotBetween(String value1, String value2) {
            addCriterion("lastIP not between", value1, value2, "lastip");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeIsNull() {
            addCriterion("terminalCode is null");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeIsNotNull() {
            addCriterion("terminalCode is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeEqualTo(String value) {
            addCriterion("terminalCode =", value, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeNotEqualTo(String value) {
            addCriterion("terminalCode <>", value, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeGreaterThan(String value) {
            addCriterion("terminalCode >", value, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("terminalCode >=", value, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeLessThan(String value) {
            addCriterion("terminalCode <", value, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeLessThanOrEqualTo(String value) {
            addCriterion("terminalCode <=", value, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeLike(String value) {
            addCriterion("terminalCode like", value, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeNotLike(String value) {
            addCriterion("terminalCode not like", value, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeIn(List<String> values) {
            addCriterion("terminalCode in", values, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeNotIn(List<String> values) {
            addCriterion("terminalCode not in", values, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeBetween(String value1, String value2) {
            addCriterion("terminalCode between", value1, value2, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTerminalcodeNotBetween(String value1, String value2) {
            addCriterion("terminalCode not between", value1, value2, "terminalcode");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("modifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("modifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Date value) {
            addCriterion("modifyTime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Date value) {
            addCriterion("modifyTime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Date value) {
            addCriterion("modifyTime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modifyTime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Date value) {
            addCriterion("modifyTime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Date value) {
            addCriterion("modifyTime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Date> values) {
            addCriterion("modifyTime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Date> values) {
            addCriterion("modifyTime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Date value1, Date value2) {
            addCriterion("modifyTime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Date value1, Date value2) {
            addCriterion("modifyTime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNull() {
            addCriterion("license is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNotNull() {
            addCriterion("license is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseEqualTo(String value) {
            addCriterion("license =", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotEqualTo(String value) {
            addCriterion("license <>", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThan(String value) {
            addCriterion("license >", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("license >=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThan(String value) {
            addCriterion("license <", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThanOrEqualTo(String value) {
            addCriterion("license <=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLike(String value) {
            addCriterion("license like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotLike(String value) {
            addCriterion("license not like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseIn(List<String> values) {
            addCriterion("license in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotIn(List<String> values) {
            addCriterion("license not in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseBetween(String value1, String value2) {
            addCriterion("license between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotBetween(String value1, String value2) {
            addCriterion("license not between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andIconurlIsNull() {
            addCriterion("iconUrl is null");
            return (Criteria) this;
        }

        public Criteria andIconurlIsNotNull() {
            addCriterion("iconUrl is not null");
            return (Criteria) this;
        }

        public Criteria andIconurlEqualTo(String value) {
            addCriterion("iconUrl =", value, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlNotEqualTo(String value) {
            addCriterion("iconUrl <>", value, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlGreaterThan(String value) {
            addCriterion("iconUrl >", value, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlGreaterThanOrEqualTo(String value) {
            addCriterion("iconUrl >=", value, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlLessThan(String value) {
            addCriterion("iconUrl <", value, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlLessThanOrEqualTo(String value) {
            addCriterion("iconUrl <=", value, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlLike(String value) {
            addCriterion("iconUrl like", value, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlNotLike(String value) {
            addCriterion("iconUrl not like", value, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlIn(List<String> values) {
            addCriterion("iconUrl in", values, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlNotIn(List<String> values) {
            addCriterion("iconUrl not in", values, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlBetween(String value1, String value2) {
            addCriterion("iconUrl between", value1, value2, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlNotBetween(String value1, String value2) {
            addCriterion("iconUrl not between", value1, value2, "iconurl");
            return (Criteria) this;
        }

        public Criteria andReadfinishnumIsNull() {
            addCriterion("readFinishNum is null");
            return (Criteria) this;
        }

        public Criteria andReadfinishnumIsNotNull() {
            addCriterion("readFinishNum is not null");
            return (Criteria) this;
        }

        public Criteria andReadfinishnumEqualTo(Integer value) {
            addCriterion("readFinishNum =", value, "readfinishnum");
            return (Criteria) this;
        }

        public Criteria andReadfinishnumNotEqualTo(Integer value) {
            addCriterion("readFinishNum <>", value, "readfinishnum");
            return (Criteria) this;
        }

        public Criteria andReadfinishnumGreaterThan(Integer value) {
            addCriterion("readFinishNum >", value, "readfinishnum");
            return (Criteria) this;
        }

        public Criteria andReadfinishnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("readFinishNum >=", value, "readfinishnum");
            return (Criteria) this;
        }

        public Criteria andReadfinishnumLessThan(Integer value) {
            addCriterion("readFinishNum <", value, "readfinishnum");
            return (Criteria) this;
        }

        public Criteria andReadfinishnumLessThanOrEqualTo(Integer value) {
            addCriterion("readFinishNum <=", value, "readfinishnum");
            return (Criteria) this;
        }

        public Criteria andReadfinishnumIn(List<Integer> values) {
            addCriterion("readFinishNum in", values, "readfinishnum");
            return (Criteria) this;
        }

        public Criteria andReadfinishnumNotIn(List<Integer> values) {
            addCriterion("readFinishNum not in", values, "readfinishnum");
            return (Criteria) this;
        }

        public Criteria andReadfinishnumBetween(Integer value1, Integer value2) {
            addCriterion("readFinishNum between", value1, value2, "readfinishnum");
            return (Criteria) this;
        }

        public Criteria andReadfinishnumNotBetween(Integer value1, Integer value2) {
            addCriterion("readFinishNum not between", value1, value2, "readfinishnum");
            return (Criteria) this;
        }

        public Criteria andUserstatusIsNull() {
            addCriterion("userStatus is null");
            return (Criteria) this;
        }

        public Criteria andUserstatusIsNotNull() {
            addCriterion("userStatus is not null");
            return (Criteria) this;
        }

        public Criteria andUserstatusEqualTo(String value) {
            addCriterion("userStatus =", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusNotEqualTo(String value) {
            addCriterion("userStatus <>", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusGreaterThan(String value) {
            addCriterion("userStatus >", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusGreaterThanOrEqualTo(String value) {
            addCriterion("userStatus >=", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusLessThan(String value) {
            addCriterion("userStatus <", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusLessThanOrEqualTo(String value) {
            addCriterion("userStatus <=", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusLike(String value) {
            addCriterion("userStatus like", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusNotLike(String value) {
            addCriterion("userStatus not like", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusIn(List<String> values) {
            addCriterion("userStatus in", values, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusNotIn(List<String> values) {
            addCriterion("userStatus not in", values, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusBetween(String value1, String value2) {
            addCriterion("userStatus between", value1, value2, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusNotBetween(String value1, String value2) {
            addCriterion("userStatus not between", value1, value2, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNull() {
            addCriterion("schoolName is null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNotNull() {
            addCriterion("schoolName is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameEqualTo(String value) {
            addCriterion("schoolName =", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotEqualTo(String value) {
            addCriterion("schoolName <>", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThan(String value) {
            addCriterion("schoolName >", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThanOrEqualTo(String value) {
            addCriterion("schoolName >=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThan(String value) {
            addCriterion("schoolName <", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThanOrEqualTo(String value) {
            addCriterion("schoolName <=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLike(String value) {
            addCriterion("schoolName like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotLike(String value) {
            addCriterion("schoolName not like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIn(List<String> values) {
            addCriterion("schoolName in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotIn(List<String> values) {
            addCriterion("schoolName not in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameBetween(String value1, String value2) {
            addCriterion("schoolName between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotBetween(String value1, String value2) {
            addCriterion("schoolName not between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andLearnchnumIsNull() {
            addCriterion("learnChNum is null");
            return (Criteria) this;
        }

        public Criteria andLearnchnumIsNotNull() {
            addCriterion("learnChNum is not null");
            return (Criteria) this;
        }

        public Criteria andLearnchnumEqualTo(Integer value) {
            addCriterion("learnChNum =", value, "learnchnum");
            return (Criteria) this;
        }

        public Criteria andLearnchnumNotEqualTo(Integer value) {
            addCriterion("learnChNum <>", value, "learnchnum");
            return (Criteria) this;
        }

        public Criteria andLearnchnumGreaterThan(Integer value) {
            addCriterion("learnChNum >", value, "learnchnum");
            return (Criteria) this;
        }

        public Criteria andLearnchnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("learnChNum >=", value, "learnchnum");
            return (Criteria) this;
        }

        public Criteria andLearnchnumLessThan(Integer value) {
            addCriterion("learnChNum <", value, "learnchnum");
            return (Criteria) this;
        }

        public Criteria andLearnchnumLessThanOrEqualTo(Integer value) {
            addCriterion("learnChNum <=", value, "learnchnum");
            return (Criteria) this;
        }

        public Criteria andLearnchnumIn(List<Integer> values) {
            addCriterion("learnChNum in", values, "learnchnum");
            return (Criteria) this;
        }

        public Criteria andLearnchnumNotIn(List<Integer> values) {
            addCriterion("learnChNum not in", values, "learnchnum");
            return (Criteria) this;
        }

        public Criteria andLearnchnumBetween(Integer value1, Integer value2) {
            addCriterion("learnChNum between", value1, value2, "learnchnum");
            return (Criteria) this;
        }

        public Criteria andLearnchnumNotBetween(Integer value1, Integer value2) {
            addCriterion("learnChNum not between", value1, value2, "learnchnum");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNull() {
            addCriterion("unionid is null");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNotNull() {
            addCriterion("unionid is not null");
            return (Criteria) this;
        }

        public Criteria andUnionidEqualTo(String value) {
            addCriterion("unionid =", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotEqualTo(String value) {
            addCriterion("unionid <>", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThan(String value) {
            addCriterion("unionid >", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThanOrEqualTo(String value) {
            addCriterion("unionid >=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThan(String value) {
            addCriterion("unionid <", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThanOrEqualTo(String value) {
            addCriterion("unionid <=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLike(String value) {
            addCriterion("unionid like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotLike(String value) {
            addCriterion("unionid not like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidIn(List<String> values) {
            addCriterion("unionid in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotIn(List<String> values) {
            addCriterion("unionid not in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidBetween(String value1, String value2) {
            addCriterion("unionid between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotBetween(String value1, String value2) {
            addCriterion("unionid not between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andAccessidIsNull() {
            addCriterion("accessId is null");
            return (Criteria) this;
        }

        public Criteria andAccessidIsNotNull() {
            addCriterion("accessId is not null");
            return (Criteria) this;
        }

        public Criteria andAccessidEqualTo(Integer value) {
            addCriterion("accessId =", value, "accessid");
            return (Criteria) this;
        }

        public Criteria andAccessidNotEqualTo(Integer value) {
            addCriterion("accessId <>", value, "accessid");
            return (Criteria) this;
        }

        public Criteria andAccessidGreaterThan(Integer value) {
            addCriterion("accessId >", value, "accessid");
            return (Criteria) this;
        }

        public Criteria andAccessidGreaterThanOrEqualTo(Integer value) {
            addCriterion("accessId >=", value, "accessid");
            return (Criteria) this;
        }

        public Criteria andAccessidLessThan(Integer value) {
            addCriterion("accessId <", value, "accessid");
            return (Criteria) this;
        }

        public Criteria andAccessidLessThanOrEqualTo(Integer value) {
            addCriterion("accessId <=", value, "accessid");
            return (Criteria) this;
        }

        public Criteria andAccessidIn(List<Integer> values) {
            addCriterion("accessId in", values, "accessid");
            return (Criteria) this;
        }

        public Criteria andAccessidNotIn(List<Integer> values) {
            addCriterion("accessId not in", values, "accessid");
            return (Criteria) this;
        }

        public Criteria andAccessidBetween(Integer value1, Integer value2) {
            addCriterion("accessId between", value1, value2, "accessid");
            return (Criteria) this;
        }

        public Criteria andAccessidNotBetween(Integer value1, Integer value2) {
            addCriterion("accessId not between", value1, value2, "accessid");
            return (Criteria) this;
        }

        public Criteria andZasbranchidIsNull() {
            addCriterion("zasBranchId is null");
            return (Criteria) this;
        }

        public Criteria andZasbranchidIsNotNull() {
            addCriterion("zasBranchId is not null");
            return (Criteria) this;
        }

        public Criteria andZasbranchidEqualTo(Integer value) {
            addCriterion("zasBranchId =", value, "zasbranchid");
            return (Criteria) this;
        }

        public Criteria andZasbranchidNotEqualTo(Integer value) {
            addCriterion("zasBranchId <>", value, "zasbranchid");
            return (Criteria) this;
        }

        public Criteria andZasbranchidGreaterThan(Integer value) {
            addCriterion("zasBranchId >", value, "zasbranchid");
            return (Criteria) this;
        }

        public Criteria andZasbranchidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zasBranchId >=", value, "zasbranchid");
            return (Criteria) this;
        }

        public Criteria andZasbranchidLessThan(Integer value) {
            addCriterion("zasBranchId <", value, "zasbranchid");
            return (Criteria) this;
        }

        public Criteria andZasbranchidLessThanOrEqualTo(Integer value) {
            addCriterion("zasBranchId <=", value, "zasbranchid");
            return (Criteria) this;
        }

        public Criteria andZasbranchidIn(List<Integer> values) {
            addCriterion("zasBranchId in", values, "zasbranchid");
            return (Criteria) this;
        }

        public Criteria andZasbranchidNotIn(List<Integer> values) {
            addCriterion("zasBranchId not in", values, "zasbranchid");
            return (Criteria) this;
        }

        public Criteria andZasbranchidBetween(Integer value1, Integer value2) {
            addCriterion("zasBranchId between", value1, value2, "zasbranchid");
            return (Criteria) this;
        }

        public Criteria andZasbranchidNotBetween(Integer value1, Integer value2) {
            addCriterion("zasBranchId not between", value1, value2, "zasbranchid");
            return (Criteria) this;
        }

        public Criteria andRoletypeIsNull() {
            addCriterion("roletype is null");
            return (Criteria) this;
        }

        public Criteria andRoletypeIsNotNull() {
            addCriterion("roletype is not null");
            return (Criteria) this;
        }

        public Criteria andRoletypeEqualTo(Integer value) {
            addCriterion("roletype =", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeNotEqualTo(Integer value) {
            addCriterion("roletype <>", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeGreaterThan(Integer value) {
            addCriterion("roletype >", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("roletype >=", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeLessThan(Integer value) {
            addCriterion("roletype <", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeLessThanOrEqualTo(Integer value) {
            addCriterion("roletype <=", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeIn(List<Integer> values) {
            addCriterion("roletype in", values, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeNotIn(List<Integer> values) {
            addCriterion("roletype not in", values, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeBetween(Integer value1, Integer value2) {
            addCriterion("roletype between", value1, value2, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeNotBetween(Integer value1, Integer value2) {
            addCriterion("roletype not between", value1, value2, "roletype");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNull() {
            addCriterion("areacode is null");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNotNull() {
            addCriterion("areacode is not null");
            return (Criteria) this;
        }

        public Criteria andAreacodeEqualTo(Integer value) {
            addCriterion("areacode =", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotEqualTo(Integer value) {
            addCriterion("areacode <>", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThan(Integer value) {
            addCriterion("areacode >", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("areacode >=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThan(Integer value) {
            addCriterion("areacode <", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThanOrEqualTo(Integer value) {
            addCriterion("areacode <=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIn(List<Integer> values) {
            addCriterion("areacode in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotIn(List<Integer> values) {
            addCriterion("areacode not in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeBetween(Integer value1, Integer value2) {
            addCriterion("areacode between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotBetween(Integer value1, Integer value2) {
            addCriterion("areacode not between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andBindingnumIsNull() {
            addCriterion("bindingNum is null");
            return (Criteria) this;
        }

        public Criteria andBindingnumIsNotNull() {
            addCriterion("bindingNum is not null");
            return (Criteria) this;
        }

        public Criteria andBindingnumEqualTo(Integer value) {
            addCriterion("bindingNum =", value, "bindingnum");
            return (Criteria) this;
        }

        public Criteria andBindingnumNotEqualTo(Integer value) {
            addCriterion("bindingNum <>", value, "bindingnum");
            return (Criteria) this;
        }

        public Criteria andBindingnumGreaterThan(Integer value) {
            addCriterion("bindingNum >", value, "bindingnum");
            return (Criteria) this;
        }

        public Criteria andBindingnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("bindingNum >=", value, "bindingnum");
            return (Criteria) this;
        }

        public Criteria andBindingnumLessThan(Integer value) {
            addCriterion("bindingNum <", value, "bindingnum");
            return (Criteria) this;
        }

        public Criteria andBindingnumLessThanOrEqualTo(Integer value) {
            addCriterion("bindingNum <=", value, "bindingnum");
            return (Criteria) this;
        }

        public Criteria andBindingnumIn(List<Integer> values) {
            addCriterion("bindingNum in", values, "bindingnum");
            return (Criteria) this;
        }

        public Criteria andBindingnumNotIn(List<Integer> values) {
            addCriterion("bindingNum not in", values, "bindingnum");
            return (Criteria) this;
        }

        public Criteria andBindingnumBetween(Integer value1, Integer value2) {
            addCriterion("bindingNum between", value1, value2, "bindingnum");
            return (Criteria) this;
        }

        public Criteria andBindingnumNotBetween(Integer value1, Integer value2) {
            addCriterion("bindingNum not between", value1, value2, "bindingnum");
            return (Criteria) this;
        }

        public Criteria andMaxbindingnumIsNull() {
            addCriterion("maxbindingNum is null");
            return (Criteria) this;
        }

        public Criteria andMaxbindingnumIsNotNull() {
            addCriterion("maxbindingNum is not null");
            return (Criteria) this;
        }

        public Criteria andMaxbindingnumEqualTo(Integer value) {
            addCriterion("maxbindingNum =", value, "maxbindingnum");
            return (Criteria) this;
        }

        public Criteria andMaxbindingnumNotEqualTo(Integer value) {
            addCriterion("maxbindingNum <>", value, "maxbindingnum");
            return (Criteria) this;
        }

        public Criteria andMaxbindingnumGreaterThan(Integer value) {
            addCriterion("maxbindingNum >", value, "maxbindingnum");
            return (Criteria) this;
        }

        public Criteria andMaxbindingnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxbindingNum >=", value, "maxbindingnum");
            return (Criteria) this;
        }

        public Criteria andMaxbindingnumLessThan(Integer value) {
            addCriterion("maxbindingNum <", value, "maxbindingnum");
            return (Criteria) this;
        }

        public Criteria andMaxbindingnumLessThanOrEqualTo(Integer value) {
            addCriterion("maxbindingNum <=", value, "maxbindingnum");
            return (Criteria) this;
        }

        public Criteria andMaxbindingnumIn(List<Integer> values) {
            addCriterion("maxbindingNum in", values, "maxbindingnum");
            return (Criteria) this;
        }

        public Criteria andMaxbindingnumNotIn(List<Integer> values) {
            addCriterion("maxbindingNum not in", values, "maxbindingnum");
            return (Criteria) this;
        }

        public Criteria andMaxbindingnumBetween(Integer value1, Integer value2) {
            addCriterion("maxbindingNum between", value1, value2, "maxbindingnum");
            return (Criteria) this;
        }

        public Criteria andMaxbindingnumNotBetween(Integer value1, Integer value2) {
            addCriterion("maxbindingNum not between", value1, value2, "maxbindingnum");
            return (Criteria) this;
        }

        public Criteria andAllbooksIsNull() {
            addCriterion("allbooks is null");
            return (Criteria) this;
        }

        public Criteria andAllbooksIsNotNull() {
            addCriterion("allbooks is not null");
            return (Criteria) this;
        }

        public Criteria andAllbooksEqualTo(Integer value) {
            addCriterion("allbooks =", value, "allbooks");
            return (Criteria) this;
        }

        public Criteria andAllbooksNotEqualTo(Integer value) {
            addCriterion("allbooks <>", value, "allbooks");
            return (Criteria) this;
        }

        public Criteria andAllbooksGreaterThan(Integer value) {
            addCriterion("allbooks >", value, "allbooks");
            return (Criteria) this;
        }

        public Criteria andAllbooksGreaterThanOrEqualTo(Integer value) {
            addCriterion("allbooks >=", value, "allbooks");
            return (Criteria) this;
        }

        public Criteria andAllbooksLessThan(Integer value) {
            addCriterion("allbooks <", value, "allbooks");
            return (Criteria) this;
        }

        public Criteria andAllbooksLessThanOrEqualTo(Integer value) {
            addCriterion("allbooks <=", value, "allbooks");
            return (Criteria) this;
        }

        public Criteria andAllbooksIn(List<Integer> values) {
            addCriterion("allbooks in", values, "allbooks");
            return (Criteria) this;
        }

        public Criteria andAllbooksNotIn(List<Integer> values) {
            addCriterion("allbooks not in", values, "allbooks");
            return (Criteria) this;
        }

        public Criteria andAllbooksBetween(Integer value1, Integer value2) {
            addCriterion("allbooks between", value1, value2, "allbooks");
            return (Criteria) this;
        }

        public Criteria andAllbooksNotBetween(Integer value1, Integer value2) {
            addCriterion("allbooks not between", value1, value2, "allbooks");
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