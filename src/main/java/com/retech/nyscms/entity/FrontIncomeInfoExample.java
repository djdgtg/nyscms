package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontIncomeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontIncomeInfoExample() {
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

        public Criteria andIncometypeIsNull() {
            addCriterion("incomeType is null");
            return (Criteria) this;
        }

        public Criteria andIncometypeIsNotNull() {
            addCriterion("incomeType is not null");
            return (Criteria) this;
        }

        public Criteria andIncometypeEqualTo(String value) {
            addCriterion("incomeType =", value, "incometype");
            return (Criteria) this;
        }

        public Criteria andIncometypeNotEqualTo(String value) {
            addCriterion("incomeType <>", value, "incometype");
            return (Criteria) this;
        }

        public Criteria andIncometypeGreaterThan(String value) {
            addCriterion("incomeType >", value, "incometype");
            return (Criteria) this;
        }

        public Criteria andIncometypeGreaterThanOrEqualTo(String value) {
            addCriterion("incomeType >=", value, "incometype");
            return (Criteria) this;
        }

        public Criteria andIncometypeLessThan(String value) {
            addCriterion("incomeType <", value, "incometype");
            return (Criteria) this;
        }

        public Criteria andIncometypeLessThanOrEqualTo(String value) {
            addCriterion("incomeType <=", value, "incometype");
            return (Criteria) this;
        }

        public Criteria andIncometypeLike(String value) {
            addCriterion("incomeType like", value, "incometype");
            return (Criteria) this;
        }

        public Criteria andIncometypeNotLike(String value) {
            addCriterion("incomeType not like", value, "incometype");
            return (Criteria) this;
        }

        public Criteria andIncometypeIn(List<String> values) {
            addCriterion("incomeType in", values, "incometype");
            return (Criteria) this;
        }

        public Criteria andIncometypeNotIn(List<String> values) {
            addCriterion("incomeType not in", values, "incometype");
            return (Criteria) this;
        }

        public Criteria andIncometypeBetween(String value1, String value2) {
            addCriterion("incomeType between", value1, value2, "incometype");
            return (Criteria) this;
        }

        public Criteria andIncometypeNotBetween(String value1, String value2) {
            addCriterion("incomeType not between", value1, value2, "incometype");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("payType is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("payType is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("payType =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("payType <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("payType >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("payType >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("payType <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("payType <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("payType like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("payType not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("payType in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("payType not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("payType between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("payType not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andVirtualmoneyIsNull() {
            addCriterion("virtualMoney is null");
            return (Criteria) this;
        }

        public Criteria andVirtualmoneyIsNotNull() {
            addCriterion("virtualMoney is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualmoneyEqualTo(Float value) {
            addCriterion("virtualMoney =", value, "virtualmoney");
            return (Criteria) this;
        }

        public Criteria andVirtualmoneyNotEqualTo(Float value) {
            addCriterion("virtualMoney <>", value, "virtualmoney");
            return (Criteria) this;
        }

        public Criteria andVirtualmoneyGreaterThan(Float value) {
            addCriterion("virtualMoney >", value, "virtualmoney");
            return (Criteria) this;
        }

        public Criteria andVirtualmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("virtualMoney >=", value, "virtualmoney");
            return (Criteria) this;
        }

        public Criteria andVirtualmoneyLessThan(Float value) {
            addCriterion("virtualMoney <", value, "virtualmoney");
            return (Criteria) this;
        }

        public Criteria andVirtualmoneyLessThanOrEqualTo(Float value) {
            addCriterion("virtualMoney <=", value, "virtualmoney");
            return (Criteria) this;
        }

        public Criteria andVirtualmoneyIn(List<Float> values) {
            addCriterion("virtualMoney in", values, "virtualmoney");
            return (Criteria) this;
        }

        public Criteria andVirtualmoneyNotIn(List<Float> values) {
            addCriterion("virtualMoney not in", values, "virtualmoney");
            return (Criteria) this;
        }

        public Criteria andVirtualmoneyBetween(Float value1, Float value2) {
            addCriterion("virtualMoney between", value1, value2, "virtualmoney");
            return (Criteria) this;
        }

        public Criteria andVirtualmoneyNotBetween(Float value1, Float value2) {
            addCriterion("virtualMoney not between", value1, value2, "virtualmoney");
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

        public Criteria andPaymoneyIsNull() {
            addCriterion("payMoney is null");
            return (Criteria) this;
        }

        public Criteria andPaymoneyIsNotNull() {
            addCriterion("payMoney is not null");
            return (Criteria) this;
        }

        public Criteria andPaymoneyEqualTo(Float value) {
            addCriterion("payMoney =", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyNotEqualTo(Float value) {
            addCriterion("payMoney <>", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyGreaterThan(Float value) {
            addCriterion("payMoney >", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("payMoney >=", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyLessThan(Float value) {
            addCriterion("payMoney <", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyLessThanOrEqualTo(Float value) {
            addCriterion("payMoney <=", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyIn(List<Float> values) {
            addCriterion("payMoney in", values, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyNotIn(List<Float> values) {
            addCriterion("payMoney not in", values, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyBetween(Float value1, Float value2) {
            addCriterion("payMoney between", value1, value2, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyNotBetween(Float value1, Float value2) {
            addCriterion("payMoney not between", value1, value2, "paymoney");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyIsNull() {
            addCriterion("discountMoney is null");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyIsNotNull() {
            addCriterion("discountMoney is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyEqualTo(Float value) {
            addCriterion("discountMoney =", value, "discountmoney");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyNotEqualTo(Float value) {
            addCriterion("discountMoney <>", value, "discountmoney");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyGreaterThan(Float value) {
            addCriterion("discountMoney >", value, "discountmoney");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("discountMoney >=", value, "discountmoney");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyLessThan(Float value) {
            addCriterion("discountMoney <", value, "discountmoney");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyLessThanOrEqualTo(Float value) {
            addCriterion("discountMoney <=", value, "discountmoney");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyIn(List<Float> values) {
            addCriterion("discountMoney in", values, "discountmoney");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyNotIn(List<Float> values) {
            addCriterion("discountMoney not in", values, "discountmoney");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyBetween(Float value1, Float value2) {
            addCriterion("discountMoney between", value1, value2, "discountmoney");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyNotBetween(Float value1, Float value2) {
            addCriterion("discountMoney not between", value1, value2, "discountmoney");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("payTime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("payTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Date value) {
            addCriterion("payTime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Date value) {
            addCriterion("payTime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Date value) {
            addCriterion("payTime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payTime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Date value) {
            addCriterion("payTime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Date value) {
            addCriterion("payTime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Date> values) {
            addCriterion("payTime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Date> values) {
            addCriterion("payTime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Date value1, Date value2) {
            addCriterion("payTime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Date value1, Date value2) {
            addCriterion("payTime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNull() {
            addCriterion("accountID is null");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNotNull() {
            addCriterion("accountID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountidEqualTo(String value) {
            addCriterion("accountID =", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotEqualTo(String value) {
            addCriterion("accountID <>", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThan(String value) {
            addCriterion("accountID >", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThanOrEqualTo(String value) {
            addCriterion("accountID >=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThan(String value) {
            addCriterion("accountID <", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThanOrEqualTo(String value) {
            addCriterion("accountID <=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLike(String value) {
            addCriterion("accountID like", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotLike(String value) {
            addCriterion("accountID not like", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidIn(List<String> values) {
            addCriterion("accountID in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotIn(List<String> values) {
            addCriterion("accountID not in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidBetween(String value1, String value2) {
            addCriterion("accountID between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotBetween(String value1, String value2) {
            addCriterion("accountID not between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAddscoreIsNull() {
            addCriterion("addScore is null");
            return (Criteria) this;
        }

        public Criteria andAddscoreIsNotNull() {
            addCriterion("addScore is not null");
            return (Criteria) this;
        }

        public Criteria andAddscoreEqualTo(Integer value) {
            addCriterion("addScore =", value, "addscore");
            return (Criteria) this;
        }

        public Criteria andAddscoreNotEqualTo(Integer value) {
            addCriterion("addScore <>", value, "addscore");
            return (Criteria) this;
        }

        public Criteria andAddscoreGreaterThan(Integer value) {
            addCriterion("addScore >", value, "addscore");
            return (Criteria) this;
        }

        public Criteria andAddscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("addScore >=", value, "addscore");
            return (Criteria) this;
        }

        public Criteria andAddscoreLessThan(Integer value) {
            addCriterion("addScore <", value, "addscore");
            return (Criteria) this;
        }

        public Criteria andAddscoreLessThanOrEqualTo(Integer value) {
            addCriterion("addScore <=", value, "addscore");
            return (Criteria) this;
        }

        public Criteria andAddscoreIn(List<Integer> values) {
            addCriterion("addScore in", values, "addscore");
            return (Criteria) this;
        }

        public Criteria andAddscoreNotIn(List<Integer> values) {
            addCriterion("addScore not in", values, "addscore");
            return (Criteria) this;
        }

        public Criteria andAddscoreBetween(Integer value1, Integer value2) {
            addCriterion("addScore between", value1, value2, "addscore");
            return (Criteria) this;
        }

        public Criteria andAddscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("addScore not between", value1, value2, "addscore");
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

        public Criteria andFriendidEqualTo(String value) {
            addCriterion("friendID =", value, "friendid");
            return (Criteria) this;
        }

        public Criteria andFriendidNotEqualTo(String value) {
            addCriterion("friendID <>", value, "friendid");
            return (Criteria) this;
        }

        public Criteria andFriendidGreaterThan(String value) {
            addCriterion("friendID >", value, "friendid");
            return (Criteria) this;
        }

        public Criteria andFriendidGreaterThanOrEqualTo(String value) {
            addCriterion("friendID >=", value, "friendid");
            return (Criteria) this;
        }

        public Criteria andFriendidLessThan(String value) {
            addCriterion("friendID <", value, "friendid");
            return (Criteria) this;
        }

        public Criteria andFriendidLessThanOrEqualTo(String value) {
            addCriterion("friendID <=", value, "friendid");
            return (Criteria) this;
        }

        public Criteria andFriendidLike(String value) {
            addCriterion("friendID like", value, "friendid");
            return (Criteria) this;
        }

        public Criteria andFriendidNotLike(String value) {
            addCriterion("friendID not like", value, "friendid");
            return (Criteria) this;
        }

        public Criteria andFriendidIn(List<String> values) {
            addCriterion("friendID in", values, "friendid");
            return (Criteria) this;
        }

        public Criteria andFriendidNotIn(List<String> values) {
            addCriterion("friendID not in", values, "friendid");
            return (Criteria) this;
        }

        public Criteria andFriendidBetween(String value1, String value2) {
            addCriterion("friendID between", value1, value2, "friendid");
            return (Criteria) this;
        }

        public Criteria andFriendidNotBetween(String value1, String value2) {
            addCriterion("friendID not between", value1, value2, "friendid");
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