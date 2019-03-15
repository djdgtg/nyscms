package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FrontEbookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontEbookExample() {
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

        public Criteria andClassidIsNull() {
            addCriterion("ClassID is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("ClassID is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(String value) {
            addCriterion("ClassID =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(String value) {
            addCriterion("ClassID <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(String value) {
            addCriterion("ClassID >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(String value) {
            addCriterion("ClassID >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(String value) {
            addCriterion("ClassID <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(String value) {
            addCriterion("ClassID <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLike(String value) {
            addCriterion("ClassID like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotLike(String value) {
            addCriterion("ClassID not like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<String> values) {
            addCriterion("ClassID in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<String> values) {
            addCriterion("ClassID not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(String value1, String value2) {
            addCriterion("ClassID between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(String value1, String value2) {
            addCriterion("ClassID not between", value1, value2, "classid");
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andEbookpriceIsNull() {
            addCriterion("eBookPrice is null");
            return (Criteria) this;
        }

        public Criteria andEbookpriceIsNotNull() {
            addCriterion("eBookPrice is not null");
            return (Criteria) this;
        }

        public Criteria andEbookpriceEqualTo(Float value) {
            addCriterion("eBookPrice =", value, "ebookprice");
            return (Criteria) this;
        }

        public Criteria andEbookpriceNotEqualTo(Float value) {
            addCriterion("eBookPrice <>", value, "ebookprice");
            return (Criteria) this;
        }

        public Criteria andEbookpriceGreaterThan(Float value) {
            addCriterion("eBookPrice >", value, "ebookprice");
            return (Criteria) this;
        }

        public Criteria andEbookpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("eBookPrice >=", value, "ebookprice");
            return (Criteria) this;
        }

        public Criteria andEbookpriceLessThan(Float value) {
            addCriterion("eBookPrice <", value, "ebookprice");
            return (Criteria) this;
        }

        public Criteria andEbookpriceLessThanOrEqualTo(Float value) {
            addCriterion("eBookPrice <=", value, "ebookprice");
            return (Criteria) this;
        }

        public Criteria andEbookpriceIn(List<Float> values) {
            addCriterion("eBookPrice in", values, "ebookprice");
            return (Criteria) this;
        }

        public Criteria andEbookpriceNotIn(List<Float> values) {
            addCriterion("eBookPrice not in", values, "ebookprice");
            return (Criteria) this;
        }

        public Criteria andEbookpriceBetween(Float value1, Float value2) {
            addCriterion("eBookPrice between", value1, value2, "ebookprice");
            return (Criteria) this;
        }

        public Criteria andEbookpriceNotBetween(Float value1, Float value2) {
            addCriterion("eBookPrice not between", value1, value2, "ebookprice");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNull() {
            addCriterion("publishTime is null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNotNull() {
            addCriterion("publishTime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeEqualTo(Date value) {
            addCriterionForJDBCDate("publishTime =", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("publishTime <>", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("publishTime >", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publishTime >=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThan(Date value) {
            addCriterionForJDBCDate("publishTime <", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publishTime <=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIn(List<Date> values) {
            addCriterionForJDBCDate("publishTime in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("publishTime not in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publishTime between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publishTime not between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andEbookstatusIsNull() {
            addCriterion("ebookStatus is null");
            return (Criteria) this;
        }

        public Criteria andEbookstatusIsNotNull() {
            addCriterion("ebookStatus is not null");
            return (Criteria) this;
        }

        public Criteria andEbookstatusEqualTo(String value) {
            addCriterion("ebookStatus =", value, "ebookstatus");
            return (Criteria) this;
        }

        public Criteria andEbookstatusNotEqualTo(String value) {
            addCriterion("ebookStatus <>", value, "ebookstatus");
            return (Criteria) this;
        }

        public Criteria andEbookstatusGreaterThan(String value) {
            addCriterion("ebookStatus >", value, "ebookstatus");
            return (Criteria) this;
        }

        public Criteria andEbookstatusGreaterThanOrEqualTo(String value) {
            addCriterion("ebookStatus >=", value, "ebookstatus");
            return (Criteria) this;
        }

        public Criteria andEbookstatusLessThan(String value) {
            addCriterion("ebookStatus <", value, "ebookstatus");
            return (Criteria) this;
        }

        public Criteria andEbookstatusLessThanOrEqualTo(String value) {
            addCriterion("ebookStatus <=", value, "ebookstatus");
            return (Criteria) this;
        }

        public Criteria andEbookstatusLike(String value) {
            addCriterion("ebookStatus like", value, "ebookstatus");
            return (Criteria) this;
        }

        public Criteria andEbookstatusNotLike(String value) {
            addCriterion("ebookStatus not like", value, "ebookstatus");
            return (Criteria) this;
        }

        public Criteria andEbookstatusIn(List<String> values) {
            addCriterion("ebookStatus in", values, "ebookstatus");
            return (Criteria) this;
        }

        public Criteria andEbookstatusNotIn(List<String> values) {
            addCriterion("ebookStatus not in", values, "ebookstatus");
            return (Criteria) this;
        }

        public Criteria andEbookstatusBetween(String value1, String value2) {
            addCriterion("ebookStatus between", value1, value2, "ebookstatus");
            return (Criteria) this;
        }

        public Criteria andEbookstatusNotBetween(String value1, String value2) {
            addCriterion("ebookStatus not between", value1, value2, "ebookstatus");
            return (Criteria) this;
        }

        public Criteria andEbooktpriceIsNull() {
            addCriterion("eBookTPrice is null");
            return (Criteria) this;
        }

        public Criteria andEbooktpriceIsNotNull() {
            addCriterion("eBookTPrice is not null");
            return (Criteria) this;
        }

        public Criteria andEbooktpriceEqualTo(Float value) {
            addCriterion("eBookTPrice =", value, "ebooktprice");
            return (Criteria) this;
        }

        public Criteria andEbooktpriceNotEqualTo(Float value) {
            addCriterion("eBookTPrice <>", value, "ebooktprice");
            return (Criteria) this;
        }

        public Criteria andEbooktpriceGreaterThan(Float value) {
            addCriterion("eBookTPrice >", value, "ebooktprice");
            return (Criteria) this;
        }

        public Criteria andEbooktpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("eBookTPrice >=", value, "ebooktprice");
            return (Criteria) this;
        }

        public Criteria andEbooktpriceLessThan(Float value) {
            addCriterion("eBookTPrice <", value, "ebooktprice");
            return (Criteria) this;
        }

        public Criteria andEbooktpriceLessThanOrEqualTo(Float value) {
            addCriterion("eBookTPrice <=", value, "ebooktprice");
            return (Criteria) this;
        }

        public Criteria andEbooktpriceIn(List<Float> values) {
            addCriterion("eBookTPrice in", values, "ebooktprice");
            return (Criteria) this;
        }

        public Criteria andEbooktpriceNotIn(List<Float> values) {
            addCriterion("eBookTPrice not in", values, "ebooktprice");
            return (Criteria) this;
        }

        public Criteria andEbooktpriceBetween(Float value1, Float value2) {
            addCriterion("eBookTPrice between", value1, value2, "ebooktprice");
            return (Criteria) this;
        }

        public Criteria andEbooktpriceNotBetween(Float value1, Float value2) {
            addCriterion("eBookTPrice not between", value1, value2, "ebooktprice");
            return (Criteria) this;
        }

        public Criteria andSerialidIsNull() {
            addCriterion("serialID is null");
            return (Criteria) this;
        }

        public Criteria andSerialidIsNotNull() {
            addCriterion("serialID is not null");
            return (Criteria) this;
        }

        public Criteria andSerialidEqualTo(String value) {
            addCriterion("serialID =", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotEqualTo(String value) {
            addCriterion("serialID <>", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidGreaterThan(String value) {
            addCriterion("serialID >", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidGreaterThanOrEqualTo(String value) {
            addCriterion("serialID >=", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidLessThan(String value) {
            addCriterion("serialID <", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidLessThanOrEqualTo(String value) {
            addCriterion("serialID <=", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidLike(String value) {
            addCriterion("serialID like", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotLike(String value) {
            addCriterion("serialID not like", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidIn(List<String> values) {
            addCriterion("serialID in", values, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotIn(List<String> values) {
            addCriterion("serialID not in", values, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidBetween(String value1, String value2) {
            addCriterion("serialID between", value1, value2, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotBetween(String value1, String value2) {
            addCriterion("serialID not between", value1, value2, "serialid");
            return (Criteria) this;
        }

        public Criteria andEbookformatIsNull() {
            addCriterion("eBookFormat is null");
            return (Criteria) this;
        }

        public Criteria andEbookformatIsNotNull() {
            addCriterion("eBookFormat is not null");
            return (Criteria) this;
        }

        public Criteria andEbookformatEqualTo(String value) {
            addCriterion("eBookFormat =", value, "ebookformat");
            return (Criteria) this;
        }

        public Criteria andEbookformatNotEqualTo(String value) {
            addCriterion("eBookFormat <>", value, "ebookformat");
            return (Criteria) this;
        }

        public Criteria andEbookformatGreaterThan(String value) {
            addCriterion("eBookFormat >", value, "ebookformat");
            return (Criteria) this;
        }

        public Criteria andEbookformatGreaterThanOrEqualTo(String value) {
            addCriterion("eBookFormat >=", value, "ebookformat");
            return (Criteria) this;
        }

        public Criteria andEbookformatLessThan(String value) {
            addCriterion("eBookFormat <", value, "ebookformat");
            return (Criteria) this;
        }

        public Criteria andEbookformatLessThanOrEqualTo(String value) {
            addCriterion("eBookFormat <=", value, "ebookformat");
            return (Criteria) this;
        }

        public Criteria andEbookformatLike(String value) {
            addCriterion("eBookFormat like", value, "ebookformat");
            return (Criteria) this;
        }

        public Criteria andEbookformatNotLike(String value) {
            addCriterion("eBookFormat not like", value, "ebookformat");
            return (Criteria) this;
        }

        public Criteria andEbookformatIn(List<String> values) {
            addCriterion("eBookFormat in", values, "ebookformat");
            return (Criteria) this;
        }

        public Criteria andEbookformatNotIn(List<String> values) {
            addCriterion("eBookFormat not in", values, "ebookformat");
            return (Criteria) this;
        }

        public Criteria andEbookformatBetween(String value1, String value2) {
            addCriterion("eBookFormat between", value1, value2, "ebookformat");
            return (Criteria) this;
        }

        public Criteria andEbookformatNotBetween(String value1, String value2) {
            addCriterion("eBookFormat not between", value1, value2, "ebookformat");
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

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Float value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Float value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Float value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Float value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Float value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Float> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Float> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Float value1, Float value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Float value1, Float value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNull() {
            addCriterion("ISBN is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNotNull() {
            addCriterion("ISBN is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnEqualTo(String value) {
            addCriterion("ISBN =", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotEqualTo(String value) {
            addCriterion("ISBN <>", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThan(String value) {
            addCriterion("ISBN >", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("ISBN >=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThan(String value) {
            addCriterion("ISBN <", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThanOrEqualTo(String value) {
            addCriterion("ISBN <=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLike(String value) {
            addCriterion("ISBN like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotLike(String value) {
            addCriterion("ISBN not like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnIn(List<String> values) {
            addCriterion("ISBN in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotIn(List<String> values) {
            addCriterion("ISBN not in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnBetween(String value1, String value2) {
            addCriterion("ISBN between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotBetween(String value1, String value2) {
            addCriterion("ISBN not between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andEisbnIsNull() {
            addCriterion("EISBN is null");
            return (Criteria) this;
        }

        public Criteria andEisbnIsNotNull() {
            addCriterion("EISBN is not null");
            return (Criteria) this;
        }

        public Criteria andEisbnEqualTo(String value) {
            addCriterion("EISBN =", value, "eisbn");
            return (Criteria) this;
        }

        public Criteria andEisbnNotEqualTo(String value) {
            addCriterion("EISBN <>", value, "eisbn");
            return (Criteria) this;
        }

        public Criteria andEisbnGreaterThan(String value) {
            addCriterion("EISBN >", value, "eisbn");
            return (Criteria) this;
        }

        public Criteria andEisbnGreaterThanOrEqualTo(String value) {
            addCriterion("EISBN >=", value, "eisbn");
            return (Criteria) this;
        }

        public Criteria andEisbnLessThan(String value) {
            addCriterion("EISBN <", value, "eisbn");
            return (Criteria) this;
        }

        public Criteria andEisbnLessThanOrEqualTo(String value) {
            addCriterion("EISBN <=", value, "eisbn");
            return (Criteria) this;
        }

        public Criteria andEisbnLike(String value) {
            addCriterion("EISBN like", value, "eisbn");
            return (Criteria) this;
        }

        public Criteria andEisbnNotLike(String value) {
            addCriterion("EISBN not like", value, "eisbn");
            return (Criteria) this;
        }

        public Criteria andEisbnIn(List<String> values) {
            addCriterion("EISBN in", values, "eisbn");
            return (Criteria) this;
        }

        public Criteria andEisbnNotIn(List<String> values) {
            addCriterion("EISBN not in", values, "eisbn");
            return (Criteria) this;
        }

        public Criteria andEisbnBetween(String value1, String value2) {
            addCriterion("EISBN between", value1, value2, "eisbn");
            return (Criteria) this;
        }

        public Criteria andEisbnNotBetween(String value1, String value2) {
            addCriterion("EISBN not between", value1, value2, "eisbn");
            return (Criteria) this;
        }

        public Criteria andPublishhouseIsNull() {
            addCriterion("publishHouse is null");
            return (Criteria) this;
        }

        public Criteria andPublishhouseIsNotNull() {
            addCriterion("publishHouse is not null");
            return (Criteria) this;
        }

        public Criteria andPublishhouseEqualTo(String value) {
            addCriterion("publishHouse =", value, "publishhouse");
            return (Criteria) this;
        }

        public Criteria andPublishhouseNotEqualTo(String value) {
            addCriterion("publishHouse <>", value, "publishhouse");
            return (Criteria) this;
        }

        public Criteria andPublishhouseGreaterThan(String value) {
            addCriterion("publishHouse >", value, "publishhouse");
            return (Criteria) this;
        }

        public Criteria andPublishhouseGreaterThanOrEqualTo(String value) {
            addCriterion("publishHouse >=", value, "publishhouse");
            return (Criteria) this;
        }

        public Criteria andPublishhouseLessThan(String value) {
            addCriterion("publishHouse <", value, "publishhouse");
            return (Criteria) this;
        }

        public Criteria andPublishhouseLessThanOrEqualTo(String value) {
            addCriterion("publishHouse <=", value, "publishhouse");
            return (Criteria) this;
        }

        public Criteria andPublishhouseLike(String value) {
            addCriterion("publishHouse like", value, "publishhouse");
            return (Criteria) this;
        }

        public Criteria andPublishhouseNotLike(String value) {
            addCriterion("publishHouse not like", value, "publishhouse");
            return (Criteria) this;
        }

        public Criteria andPublishhouseIn(List<String> values) {
            addCriterion("publishHouse in", values, "publishhouse");
            return (Criteria) this;
        }

        public Criteria andPublishhouseNotIn(List<String> values) {
            addCriterion("publishHouse not in", values, "publishhouse");
            return (Criteria) this;
        }

        public Criteria andPublishhouseBetween(String value1, String value2) {
            addCriterion("publishHouse between", value1, value2, "publishhouse");
            return (Criteria) this;
        }

        public Criteria andPublishhouseNotBetween(String value1, String value2) {
            addCriterion("publishHouse not between", value1, value2, "publishhouse");
            return (Criteria) this;
        }

        public Criteria andPageIsNull() {
            addCriterion("page is null");
            return (Criteria) this;
        }

        public Criteria andPageIsNotNull() {
            addCriterion("page is not null");
            return (Criteria) this;
        }

        public Criteria andPageEqualTo(Integer value) {
            addCriterion("page =", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotEqualTo(Integer value) {
            addCriterion("page <>", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThan(Integer value) {
            addCriterion("page >", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThanOrEqualTo(Integer value) {
            addCriterion("page >=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThan(Integer value) {
            addCriterion("page <", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThanOrEqualTo(Integer value) {
            addCriterion("page <=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageIn(List<Integer> values) {
            addCriterion("page in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotIn(List<Integer> values) {
            addCriterion("page not in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageBetween(Integer value1, Integer value2) {
            addCriterion("page between", value1, value2, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotBetween(Integer value1, Integer value2) {
            addCriterion("page not between", value1, value2, "page");
            return (Criteria) this;
        }

        public Criteria andLessontypeIsNull() {
            addCriterion("lessonType is null");
            return (Criteria) this;
        }

        public Criteria andLessontypeIsNotNull() {
            addCriterion("lessonType is not null");
            return (Criteria) this;
        }

        public Criteria andLessontypeEqualTo(Integer value) {
            addCriterion("lessonType =", value, "lessontype");
            return (Criteria) this;
        }

        public Criteria andLessontypeNotEqualTo(Integer value) {
            addCriterion("lessonType <>", value, "lessontype");
            return (Criteria) this;
        }

        public Criteria andLessontypeGreaterThan(Integer value) {
            addCriterion("lessonType >", value, "lessontype");
            return (Criteria) this;
        }

        public Criteria andLessontypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lessonType >=", value, "lessontype");
            return (Criteria) this;
        }

        public Criteria andLessontypeLessThan(Integer value) {
            addCriterion("lessonType <", value, "lessontype");
            return (Criteria) this;
        }

        public Criteria andLessontypeLessThanOrEqualTo(Integer value) {
            addCriterion("lessonType <=", value, "lessontype");
            return (Criteria) this;
        }

        public Criteria andLessontypeIn(List<Integer> values) {
            addCriterion("lessonType in", values, "lessontype");
            return (Criteria) this;
        }

        public Criteria andLessontypeNotIn(List<Integer> values) {
            addCriterion("lessonType not in", values, "lessontype");
            return (Criteria) this;
        }

        public Criteria andLessontypeBetween(Integer value1, Integer value2) {
            addCriterion("lessonType between", value1, value2, "lessontype");
            return (Criteria) this;
        }

        public Criteria andLessontypeNotBetween(Integer value1, Integer value2) {
            addCriterion("lessonType not between", value1, value2, "lessontype");
            return (Criteria) this;
        }

        public Criteria andApplicableageIsNull() {
            addCriterion("applicableage is null");
            return (Criteria) this;
        }

        public Criteria andApplicableageIsNotNull() {
            addCriterion("applicableage is not null");
            return (Criteria) this;
        }

        public Criteria andApplicableageEqualTo(Integer value) {
            addCriterion("applicableage =", value, "applicableage");
            return (Criteria) this;
        }

        public Criteria andApplicableageNotEqualTo(Integer value) {
            addCriterion("applicableage <>", value, "applicableage");
            return (Criteria) this;
        }

        public Criteria andApplicableageGreaterThan(Integer value) {
            addCriterion("applicableage >", value, "applicableage");
            return (Criteria) this;
        }

        public Criteria andApplicableageGreaterThanOrEqualTo(Integer value) {
            addCriterion("applicableage >=", value, "applicableage");
            return (Criteria) this;
        }

        public Criteria andApplicableageLessThan(Integer value) {
            addCriterion("applicableage <", value, "applicableage");
            return (Criteria) this;
        }

        public Criteria andApplicableageLessThanOrEqualTo(Integer value) {
            addCriterion("applicableage <=", value, "applicableage");
            return (Criteria) this;
        }

        public Criteria andApplicableageIn(List<Integer> values) {
            addCriterion("applicableage in", values, "applicableage");
            return (Criteria) this;
        }

        public Criteria andApplicableageNotIn(List<Integer> values) {
            addCriterion("applicableage not in", values, "applicableage");
            return (Criteria) this;
        }

        public Criteria andApplicableageBetween(Integer value1, Integer value2) {
            addCriterion("applicableage between", value1, value2, "applicableage");
            return (Criteria) this;
        }

        public Criteria andApplicableageNotBetween(Integer value1, Integer value2) {
            addCriterion("applicableage not between", value1, value2, "applicableage");
            return (Criteria) this;
        }

        public Criteria andLanguageclassIsNull() {
            addCriterion("languageClass is null");
            return (Criteria) this;
        }

        public Criteria andLanguageclassIsNotNull() {
            addCriterion("languageClass is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageclassEqualTo(String value) {
            addCriterion("languageClass =", value, "languageclass");
            return (Criteria) this;
        }

        public Criteria andLanguageclassNotEqualTo(String value) {
            addCriterion("languageClass <>", value, "languageclass");
            return (Criteria) this;
        }

        public Criteria andLanguageclassGreaterThan(String value) {
            addCriterion("languageClass >", value, "languageclass");
            return (Criteria) this;
        }

        public Criteria andLanguageclassGreaterThanOrEqualTo(String value) {
            addCriterion("languageClass >=", value, "languageclass");
            return (Criteria) this;
        }

        public Criteria andLanguageclassLessThan(String value) {
            addCriterion("languageClass <", value, "languageclass");
            return (Criteria) this;
        }

        public Criteria andLanguageclassLessThanOrEqualTo(String value) {
            addCriterion("languageClass <=", value, "languageclass");
            return (Criteria) this;
        }

        public Criteria andLanguageclassLike(String value) {
            addCriterion("languageClass like", value, "languageclass");
            return (Criteria) this;
        }

        public Criteria andLanguageclassNotLike(String value) {
            addCriterion("languageClass not like", value, "languageclass");
            return (Criteria) this;
        }

        public Criteria andLanguageclassIn(List<String> values) {
            addCriterion("languageClass in", values, "languageclass");
            return (Criteria) this;
        }

        public Criteria andLanguageclassNotIn(List<String> values) {
            addCriterion("languageClass not in", values, "languageclass");
            return (Criteria) this;
        }

        public Criteria andLanguageclassBetween(String value1, String value2) {
            addCriterion("languageClass between", value1, value2, "languageclass");
            return (Criteria) this;
        }

        public Criteria andLanguageclassNotBetween(String value1, String value2) {
            addCriterion("languageClass not between", value1, value2, "languageclass");
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

        public Criteria andFullminustypeEqualTo(Integer value) {
            addCriterion("fullminusType =", value, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeNotEqualTo(Integer value) {
            addCriterion("fullminusType <>", value, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeGreaterThan(Integer value) {
            addCriterion("fullminusType >", value, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fullminusType >=", value, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeLessThan(Integer value) {
            addCriterion("fullminusType <", value, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeLessThanOrEqualTo(Integer value) {
            addCriterion("fullminusType <=", value, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeIn(List<Integer> values) {
            addCriterion("fullminusType in", values, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeNotIn(List<Integer> values) {
            addCriterion("fullminusType not in", values, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeBetween(Integer value1, Integer value2) {
            addCriterion("fullminusType between", value1, value2, "fullminustype");
            return (Criteria) this;
        }

        public Criteria andFullminustypeNotBetween(Integer value1, Integer value2) {
            addCriterion("fullminusType not between", value1, value2, "fullminustype");
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

        public Criteria andFavoritenumIsNull() {
            addCriterion("favoriteNum is null");
            return (Criteria) this;
        }

        public Criteria andFavoritenumIsNotNull() {
            addCriterion("favoriteNum is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritenumEqualTo(Integer value) {
            addCriterion("favoriteNum =", value, "favoritenum");
            return (Criteria) this;
        }

        public Criteria andFavoritenumNotEqualTo(Integer value) {
            addCriterion("favoriteNum <>", value, "favoritenum");
            return (Criteria) this;
        }

        public Criteria andFavoritenumGreaterThan(Integer value) {
            addCriterion("favoriteNum >", value, "favoritenum");
            return (Criteria) this;
        }

        public Criteria andFavoritenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("favoriteNum >=", value, "favoritenum");
            return (Criteria) this;
        }

        public Criteria andFavoritenumLessThan(Integer value) {
            addCriterion("favoriteNum <", value, "favoritenum");
            return (Criteria) this;
        }

        public Criteria andFavoritenumLessThanOrEqualTo(Integer value) {
            addCriterion("favoriteNum <=", value, "favoritenum");
            return (Criteria) this;
        }

        public Criteria andFavoritenumIn(List<Integer> values) {
            addCriterion("favoriteNum in", values, "favoritenum");
            return (Criteria) this;
        }

        public Criteria andFavoritenumNotIn(List<Integer> values) {
            addCriterion("favoriteNum not in", values, "favoritenum");
            return (Criteria) this;
        }

        public Criteria andFavoritenumBetween(Integer value1, Integer value2) {
            addCriterion("favoriteNum between", value1, value2, "favoritenum");
            return (Criteria) this;
        }

        public Criteria andFavoritenumNotBetween(Integer value1, Integer value2) {
            addCriterion("favoriteNum not between", value1, value2, "favoritenum");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeIsNull() {
            addCriterion("salesVolume is null");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeIsNotNull() {
            addCriterion("salesVolume is not null");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeEqualTo(Integer value) {
            addCriterion("salesVolume =", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeNotEqualTo(Integer value) {
            addCriterion("salesVolume <>", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeGreaterThan(Integer value) {
            addCriterion("salesVolume >", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("salesVolume >=", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeLessThan(Integer value) {
            addCriterion("salesVolume <", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeLessThanOrEqualTo(Integer value) {
            addCriterion("salesVolume <=", value, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeIn(List<Integer> values) {
            addCriterion("salesVolume in", values, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeNotIn(List<Integer> values) {
            addCriterion("salesVolume not in", values, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeBetween(Integer value1, Integer value2) {
            addCriterion("salesVolume between", value1, value2, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andSalesvolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("salesVolume not between", value1, value2, "salesvolume");
            return (Criteria) this;
        }

        public Criteria andCommentnumberIsNull() {
            addCriterion("commentNumber is null");
            return (Criteria) this;
        }

        public Criteria andCommentnumberIsNotNull() {
            addCriterion("commentNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCommentnumberEqualTo(Integer value) {
            addCriterion("commentNumber =", value, "commentnumber");
            return (Criteria) this;
        }

        public Criteria andCommentnumberNotEqualTo(Integer value) {
            addCriterion("commentNumber <>", value, "commentnumber");
            return (Criteria) this;
        }

        public Criteria andCommentnumberGreaterThan(Integer value) {
            addCriterion("commentNumber >", value, "commentnumber");
            return (Criteria) this;
        }

        public Criteria andCommentnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentNumber >=", value, "commentnumber");
            return (Criteria) this;
        }

        public Criteria andCommentnumberLessThan(Integer value) {
            addCriterion("commentNumber <", value, "commentnumber");
            return (Criteria) this;
        }

        public Criteria andCommentnumberLessThanOrEqualTo(Integer value) {
            addCriterion("commentNumber <=", value, "commentnumber");
            return (Criteria) this;
        }

        public Criteria andCommentnumberIn(List<Integer> values) {
            addCriterion("commentNumber in", values, "commentnumber");
            return (Criteria) this;
        }

        public Criteria andCommentnumberNotIn(List<Integer> values) {
            addCriterion("commentNumber not in", values, "commentnumber");
            return (Criteria) this;
        }

        public Criteria andCommentnumberBetween(Integer value1, Integer value2) {
            addCriterion("commentNumber between", value1, value2, "commentnumber");
            return (Criteria) this;
        }

        public Criteria andCommentnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("commentNumber not between", value1, value2, "commentnumber");
            return (Criteria) this;
        }

        public Criteria andLocationurlIsNull() {
            addCriterion("locationUrl is null");
            return (Criteria) this;
        }

        public Criteria andLocationurlIsNotNull() {
            addCriterion("locationUrl is not null");
            return (Criteria) this;
        }

        public Criteria andLocationurlEqualTo(String value) {
            addCriterion("locationUrl =", value, "locationurl");
            return (Criteria) this;
        }

        public Criteria andLocationurlNotEqualTo(String value) {
            addCriterion("locationUrl <>", value, "locationurl");
            return (Criteria) this;
        }

        public Criteria andLocationurlGreaterThan(String value) {
            addCriterion("locationUrl >", value, "locationurl");
            return (Criteria) this;
        }

        public Criteria andLocationurlGreaterThanOrEqualTo(String value) {
            addCriterion("locationUrl >=", value, "locationurl");
            return (Criteria) this;
        }

        public Criteria andLocationurlLessThan(String value) {
            addCriterion("locationUrl <", value, "locationurl");
            return (Criteria) this;
        }

        public Criteria andLocationurlLessThanOrEqualTo(String value) {
            addCriterion("locationUrl <=", value, "locationurl");
            return (Criteria) this;
        }

        public Criteria andLocationurlLike(String value) {
            addCriterion("locationUrl like", value, "locationurl");
            return (Criteria) this;
        }

        public Criteria andLocationurlNotLike(String value) {
            addCriterion("locationUrl not like", value, "locationurl");
            return (Criteria) this;
        }

        public Criteria andLocationurlIn(List<String> values) {
            addCriterion("locationUrl in", values, "locationurl");
            return (Criteria) this;
        }

        public Criteria andLocationurlNotIn(List<String> values) {
            addCriterion("locationUrl not in", values, "locationurl");
            return (Criteria) this;
        }

        public Criteria andLocationurlBetween(String value1, String value2) {
            addCriterion("locationUrl between", value1, value2, "locationurl");
            return (Criteria) this;
        }

        public Criteria andLocationurlNotBetween(String value1, String value2) {
            addCriterion("locationUrl not between", value1, value2, "locationurl");
            return (Criteria) this;
        }

        public Criteria andAcademicprobationurlIsNull() {
            addCriterion("academicProbationUrl is null");
            return (Criteria) this;
        }

        public Criteria andAcademicprobationurlIsNotNull() {
            addCriterion("academicProbationUrl is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicprobationurlEqualTo(String value) {
            addCriterion("academicProbationUrl =", value, "academicprobationurl");
            return (Criteria) this;
        }

        public Criteria andAcademicprobationurlNotEqualTo(String value) {
            addCriterion("academicProbationUrl <>", value, "academicprobationurl");
            return (Criteria) this;
        }

        public Criteria andAcademicprobationurlGreaterThan(String value) {
            addCriterion("academicProbationUrl >", value, "academicprobationurl");
            return (Criteria) this;
        }

        public Criteria andAcademicprobationurlGreaterThanOrEqualTo(String value) {
            addCriterion("academicProbationUrl >=", value, "academicprobationurl");
            return (Criteria) this;
        }

        public Criteria andAcademicprobationurlLessThan(String value) {
            addCriterion("academicProbationUrl <", value, "academicprobationurl");
            return (Criteria) this;
        }

        public Criteria andAcademicprobationurlLessThanOrEqualTo(String value) {
            addCriterion("academicProbationUrl <=", value, "academicprobationurl");
            return (Criteria) this;
        }

        public Criteria andAcademicprobationurlLike(String value) {
            addCriterion("academicProbationUrl like", value, "academicprobationurl");
            return (Criteria) this;
        }

        public Criteria andAcademicprobationurlNotLike(String value) {
            addCriterion("academicProbationUrl not like", value, "academicprobationurl");
            return (Criteria) this;
        }

        public Criteria andAcademicprobationurlIn(List<String> values) {
            addCriterion("academicProbationUrl in", values, "academicprobationurl");
            return (Criteria) this;
        }

        public Criteria andAcademicprobationurlNotIn(List<String> values) {
            addCriterion("academicProbationUrl not in", values, "academicprobationurl");
            return (Criteria) this;
        }

        public Criteria andAcademicprobationurlBetween(String value1, String value2) {
            addCriterion("academicProbationUrl between", value1, value2, "academicprobationurl");
            return (Criteria) this;
        }

        public Criteria andAcademicprobationurlNotBetween(String value1, String value2) {
            addCriterion("academicProbationUrl not between", value1, value2, "academicprobationurl");
            return (Criteria) this;
        }

        public Criteria andIntegraldeductionIsNull() {
            addCriterion("integraldeduction is null");
            return (Criteria) this;
        }

        public Criteria andIntegraldeductionIsNotNull() {
            addCriterion("integraldeduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntegraldeductionEqualTo(Float value) {
            addCriterion("integraldeduction =", value, "integraldeduction");
            return (Criteria) this;
        }

        public Criteria andIntegraldeductionNotEqualTo(Float value) {
            addCriterion("integraldeduction <>", value, "integraldeduction");
            return (Criteria) this;
        }

        public Criteria andIntegraldeductionGreaterThan(Float value) {
            addCriterion("integraldeduction >", value, "integraldeduction");
            return (Criteria) this;
        }

        public Criteria andIntegraldeductionGreaterThanOrEqualTo(Float value) {
            addCriterion("integraldeduction >=", value, "integraldeduction");
            return (Criteria) this;
        }

        public Criteria andIntegraldeductionLessThan(Float value) {
            addCriterion("integraldeduction <", value, "integraldeduction");
            return (Criteria) this;
        }

        public Criteria andIntegraldeductionLessThanOrEqualTo(Float value) {
            addCriterion("integraldeduction <=", value, "integraldeduction");
            return (Criteria) this;
        }

        public Criteria andIntegraldeductionIn(List<Float> values) {
            addCriterion("integraldeduction in", values, "integraldeduction");
            return (Criteria) this;
        }

        public Criteria andIntegraldeductionNotIn(List<Float> values) {
            addCriterion("integraldeduction not in", values, "integraldeduction");
            return (Criteria) this;
        }

        public Criteria andIntegraldeductionBetween(Float value1, Float value2) {
            addCriterion("integraldeduction between", value1, value2, "integraldeduction");
            return (Criteria) this;
        }

        public Criteria andIntegraldeductionNotBetween(Float value1, Float value2) {
            addCriterion("integraldeduction not between", value1, value2, "integraldeduction");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNull() {
            addCriterion("en_name is null");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNotNull() {
            addCriterion("en_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnNameEqualTo(String value) {
            addCriterion("en_name =", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotEqualTo(String value) {
            addCriterion("en_name <>", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThan(String value) {
            addCriterion("en_name >", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("en_name >=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThan(String value) {
            addCriterion("en_name <", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThanOrEqualTo(String value) {
            addCriterion("en_name <=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLike(String value) {
            addCriterion("en_name like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotLike(String value) {
            addCriterion("en_name not like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameIn(List<String> values) {
            addCriterion("en_name in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotIn(List<String> values) {
            addCriterion("en_name not in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameBetween(String value1, String value2) {
            addCriterion("en_name between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotBetween(String value1, String value2) {
            addCriterion("en_name not between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andEnAuthorIsNull() {
            addCriterion("en_author is null");
            return (Criteria) this;
        }

        public Criteria andEnAuthorIsNotNull() {
            addCriterion("en_author is not null");
            return (Criteria) this;
        }

        public Criteria andEnAuthorEqualTo(String value) {
            addCriterion("en_author =", value, "enAuthor");
            return (Criteria) this;
        }

        public Criteria andEnAuthorNotEqualTo(String value) {
            addCriterion("en_author <>", value, "enAuthor");
            return (Criteria) this;
        }

        public Criteria andEnAuthorGreaterThan(String value) {
            addCriterion("en_author >", value, "enAuthor");
            return (Criteria) this;
        }

        public Criteria andEnAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("en_author >=", value, "enAuthor");
            return (Criteria) this;
        }

        public Criteria andEnAuthorLessThan(String value) {
            addCriterion("en_author <", value, "enAuthor");
            return (Criteria) this;
        }

        public Criteria andEnAuthorLessThanOrEqualTo(String value) {
            addCriterion("en_author <=", value, "enAuthor");
            return (Criteria) this;
        }

        public Criteria andEnAuthorLike(String value) {
            addCriterion("en_author like", value, "enAuthor");
            return (Criteria) this;
        }

        public Criteria andEnAuthorNotLike(String value) {
            addCriterion("en_author not like", value, "enAuthor");
            return (Criteria) this;
        }

        public Criteria andEnAuthorIn(List<String> values) {
            addCriterion("en_author in", values, "enAuthor");
            return (Criteria) this;
        }

        public Criteria andEnAuthorNotIn(List<String> values) {
            addCriterion("en_author not in", values, "enAuthor");
            return (Criteria) this;
        }

        public Criteria andEnAuthorBetween(String value1, String value2) {
            addCriterion("en_author between", value1, value2, "enAuthor");
            return (Criteria) this;
        }

        public Criteria andEnAuthorNotBetween(String value1, String value2) {
            addCriterion("en_author not between", value1, value2, "enAuthor");
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

        public Criteria andEnPublishhouseIsNull() {
            addCriterion("en_publishHouse is null");
            return (Criteria) this;
        }

        public Criteria andEnPublishhouseIsNotNull() {
            addCriterion("en_publishHouse is not null");
            return (Criteria) this;
        }

        public Criteria andEnPublishhouseEqualTo(String value) {
            addCriterion("en_publishHouse =", value, "enPublishhouse");
            return (Criteria) this;
        }

        public Criteria andEnPublishhouseNotEqualTo(String value) {
            addCriterion("en_publishHouse <>", value, "enPublishhouse");
            return (Criteria) this;
        }

        public Criteria andEnPublishhouseGreaterThan(String value) {
            addCriterion("en_publishHouse >", value, "enPublishhouse");
            return (Criteria) this;
        }

        public Criteria andEnPublishhouseGreaterThanOrEqualTo(String value) {
            addCriterion("en_publishHouse >=", value, "enPublishhouse");
            return (Criteria) this;
        }

        public Criteria andEnPublishhouseLessThan(String value) {
            addCriterion("en_publishHouse <", value, "enPublishhouse");
            return (Criteria) this;
        }

        public Criteria andEnPublishhouseLessThanOrEqualTo(String value) {
            addCriterion("en_publishHouse <=", value, "enPublishhouse");
            return (Criteria) this;
        }

        public Criteria andEnPublishhouseLike(String value) {
            addCriterion("en_publishHouse like", value, "enPublishhouse");
            return (Criteria) this;
        }

        public Criteria andEnPublishhouseNotLike(String value) {
            addCriterion("en_publishHouse not like", value, "enPublishhouse");
            return (Criteria) this;
        }

        public Criteria andEnPublishhouseIn(List<String> values) {
            addCriterion("en_publishHouse in", values, "enPublishhouse");
            return (Criteria) this;
        }

        public Criteria andEnPublishhouseNotIn(List<String> values) {
            addCriterion("en_publishHouse not in", values, "enPublishhouse");
            return (Criteria) this;
        }

        public Criteria andEnPublishhouseBetween(String value1, String value2) {
            addCriterion("en_publishHouse between", value1, value2, "enPublishhouse");
            return (Criteria) this;
        }

        public Criteria andEnPublishhouseNotBetween(String value1, String value2) {
            addCriterion("en_publishHouse not between", value1, value2, "enPublishhouse");
            return (Criteria) this;
        }

        public Criteria andEnLessontypeIsNull() {
            addCriterion("en_lessonType is null");
            return (Criteria) this;
        }

        public Criteria andEnLessontypeIsNotNull() {
            addCriterion("en_lessonType is not null");
            return (Criteria) this;
        }

        public Criteria andEnLessontypeEqualTo(Integer value) {
            addCriterion("en_lessonType =", value, "enLessontype");
            return (Criteria) this;
        }

        public Criteria andEnLessontypeNotEqualTo(Integer value) {
            addCriterion("en_lessonType <>", value, "enLessontype");
            return (Criteria) this;
        }

        public Criteria andEnLessontypeGreaterThan(Integer value) {
            addCriterion("en_lessonType >", value, "enLessontype");
            return (Criteria) this;
        }

        public Criteria andEnLessontypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("en_lessonType >=", value, "enLessontype");
            return (Criteria) this;
        }

        public Criteria andEnLessontypeLessThan(Integer value) {
            addCriterion("en_lessonType <", value, "enLessontype");
            return (Criteria) this;
        }

        public Criteria andEnLessontypeLessThanOrEqualTo(Integer value) {
            addCriterion("en_lessonType <=", value, "enLessontype");
            return (Criteria) this;
        }

        public Criteria andEnLessontypeIn(List<Integer> values) {
            addCriterion("en_lessonType in", values, "enLessontype");
            return (Criteria) this;
        }

        public Criteria andEnLessontypeNotIn(List<Integer> values) {
            addCriterion("en_lessonType not in", values, "enLessontype");
            return (Criteria) this;
        }

        public Criteria andEnLessontypeBetween(Integer value1, Integer value2) {
            addCriterion("en_lessonType between", value1, value2, "enLessontype");
            return (Criteria) this;
        }

        public Criteria andEnLessontypeNotBetween(Integer value1, Integer value2) {
            addCriterion("en_lessonType not between", value1, value2, "enLessontype");
            return (Criteria) this;
        }

        public Criteria andEnLanguageclassIsNull() {
            addCriterion("en_languageClass is null");
            return (Criteria) this;
        }

        public Criteria andEnLanguageclassIsNotNull() {
            addCriterion("en_languageClass is not null");
            return (Criteria) this;
        }

        public Criteria andEnLanguageclassEqualTo(String value) {
            addCriterion("en_languageClass =", value, "enLanguageclass");
            return (Criteria) this;
        }

        public Criteria andEnLanguageclassNotEqualTo(String value) {
            addCriterion("en_languageClass <>", value, "enLanguageclass");
            return (Criteria) this;
        }

        public Criteria andEnLanguageclassGreaterThan(String value) {
            addCriterion("en_languageClass >", value, "enLanguageclass");
            return (Criteria) this;
        }

        public Criteria andEnLanguageclassGreaterThanOrEqualTo(String value) {
            addCriterion("en_languageClass >=", value, "enLanguageclass");
            return (Criteria) this;
        }

        public Criteria andEnLanguageclassLessThan(String value) {
            addCriterion("en_languageClass <", value, "enLanguageclass");
            return (Criteria) this;
        }

        public Criteria andEnLanguageclassLessThanOrEqualTo(String value) {
            addCriterion("en_languageClass <=", value, "enLanguageclass");
            return (Criteria) this;
        }

        public Criteria andEnLanguageclassLike(String value) {
            addCriterion("en_languageClass like", value, "enLanguageclass");
            return (Criteria) this;
        }

        public Criteria andEnLanguageclassNotLike(String value) {
            addCriterion("en_languageClass not like", value, "enLanguageclass");
            return (Criteria) this;
        }

        public Criteria andEnLanguageclassIn(List<String> values) {
            addCriterion("en_languageClass in", values, "enLanguageclass");
            return (Criteria) this;
        }

        public Criteria andEnLanguageclassNotIn(List<String> values) {
            addCriterion("en_languageClass not in", values, "enLanguageclass");
            return (Criteria) this;
        }

        public Criteria andEnLanguageclassBetween(String value1, String value2) {
            addCriterion("en_languageClass between", value1, value2, "enLanguageclass");
            return (Criteria) this;
        }

        public Criteria andEnLanguageclassNotBetween(String value1, String value2) {
            addCriterion("en_languageClass not between", value1, value2, "enLanguageclass");
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

        public Criteria andIsdisplayIsNull() {
            addCriterion("isdisplay is null");
            return (Criteria) this;
        }

        public Criteria andIsdisplayIsNotNull() {
            addCriterion("isdisplay is not null");
            return (Criteria) this;
        }

        public Criteria andIsdisplayEqualTo(Integer value) {
            addCriterion("isdisplay =", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayNotEqualTo(Integer value) {
            addCriterion("isdisplay <>", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayGreaterThan(Integer value) {
            addCriterion("isdisplay >", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayGreaterThanOrEqualTo(Integer value) {
            addCriterion("isdisplay >=", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayLessThan(Integer value) {
            addCriterion("isdisplay <", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayLessThanOrEqualTo(Integer value) {
            addCriterion("isdisplay <=", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayIn(List<Integer> values) {
            addCriterion("isdisplay in", values, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayNotIn(List<Integer> values) {
            addCriterion("isdisplay not in", values, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayBetween(Integer value1, Integer value2) {
            addCriterion("isdisplay between", value1, value2, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayNotBetween(Integer value1, Integer value2) {
            addCriterion("isdisplay not between", value1, value2, "isdisplay");
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

        public Criteria andIsrecommendIsNull() {
            addCriterion("isRecommend is null");
            return (Criteria) this;
        }

        public Criteria andIsrecommendIsNotNull() {
            addCriterion("isRecommend is not null");
            return (Criteria) this;
        }

        public Criteria andIsrecommendEqualTo(Integer value) {
            addCriterion("isRecommend =", value, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendNotEqualTo(Integer value) {
            addCriterion("isRecommend <>", value, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendGreaterThan(Integer value) {
            addCriterion("isRecommend >", value, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendGreaterThanOrEqualTo(Integer value) {
            addCriterion("isRecommend >=", value, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendLessThan(Integer value) {
            addCriterion("isRecommend <", value, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendLessThanOrEqualTo(Integer value) {
            addCriterion("isRecommend <=", value, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendIn(List<Integer> values) {
            addCriterion("isRecommend in", values, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendNotIn(List<Integer> values) {
            addCriterion("isRecommend not in", values, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendBetween(Integer value1, Integer value2) {
            addCriterion("isRecommend between", value1, value2, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsrecommendNotBetween(Integer value1, Integer value2) {
            addCriterion("isRecommend not between", value1, value2, "isrecommend");
            return (Criteria) this;
        }

        public Criteria andIsnewbookIsNull() {
            addCriterion("isNewbook is null");
            return (Criteria) this;
        }

        public Criteria andIsnewbookIsNotNull() {
            addCriterion("isNewbook is not null");
            return (Criteria) this;
        }

        public Criteria andIsnewbookEqualTo(Integer value) {
            addCriterion("isNewbook =", value, "isnewbook");
            return (Criteria) this;
        }

        public Criteria andIsnewbookNotEqualTo(Integer value) {
            addCriterion("isNewbook <>", value, "isnewbook");
            return (Criteria) this;
        }

        public Criteria andIsnewbookGreaterThan(Integer value) {
            addCriterion("isNewbook >", value, "isnewbook");
            return (Criteria) this;
        }

        public Criteria andIsnewbookGreaterThanOrEqualTo(Integer value) {
            addCriterion("isNewbook >=", value, "isnewbook");
            return (Criteria) this;
        }

        public Criteria andIsnewbookLessThan(Integer value) {
            addCriterion("isNewbook <", value, "isnewbook");
            return (Criteria) this;
        }

        public Criteria andIsnewbookLessThanOrEqualTo(Integer value) {
            addCriterion("isNewbook <=", value, "isnewbook");
            return (Criteria) this;
        }

        public Criteria andIsnewbookIn(List<Integer> values) {
            addCriterion("isNewbook in", values, "isnewbook");
            return (Criteria) this;
        }

        public Criteria andIsnewbookNotIn(List<Integer> values) {
            addCriterion("isNewbook not in", values, "isnewbook");
            return (Criteria) this;
        }

        public Criteria andIsnewbookBetween(Integer value1, Integer value2) {
            addCriterion("isNewbook between", value1, value2, "isnewbook");
            return (Criteria) this;
        }

        public Criteria andIsnewbookNotBetween(Integer value1, Integer value2) {
            addCriterion("isNewbook not between", value1, value2, "isnewbook");
            return (Criteria) this;
        }

        public Criteria andThemeidIsNull() {
            addCriterion("themeId is null");
            return (Criteria) this;
        }

        public Criteria andThemeidIsNotNull() {
            addCriterion("themeId is not null");
            return (Criteria) this;
        }

        public Criteria andThemeidEqualTo(Integer value) {
            addCriterion("themeId =", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotEqualTo(Integer value) {
            addCriterion("themeId <>", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidGreaterThan(Integer value) {
            addCriterion("themeId >", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("themeId >=", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidLessThan(Integer value) {
            addCriterion("themeId <", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidLessThanOrEqualTo(Integer value) {
            addCriterion("themeId <=", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidIn(List<Integer> values) {
            addCriterion("themeId in", values, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotIn(List<Integer> values) {
            addCriterion("themeId not in", values, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidBetween(Integer value1, Integer value2) {
            addCriterion("themeId between", value1, value2, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotBetween(Integer value1, Integer value2) {
            addCriterion("themeId not between", value1, value2, "themeid");
            return (Criteria) this;
        }

        public Criteria andBookdesIsNull() {
            addCriterion("bookdes is null");
            return (Criteria) this;
        }

        public Criteria andBookdesIsNotNull() {
            addCriterion("bookdes is not null");
            return (Criteria) this;
        }

        public Criteria andBookdesEqualTo(String value) {
            addCriterion("bookdes =", value, "bookdes");
            return (Criteria) this;
        }

        public Criteria andBookdesNotEqualTo(String value) {
            addCriterion("bookdes <>", value, "bookdes");
            return (Criteria) this;
        }

        public Criteria andBookdesGreaterThan(String value) {
            addCriterion("bookdes >", value, "bookdes");
            return (Criteria) this;
        }

        public Criteria andBookdesGreaterThanOrEqualTo(String value) {
            addCriterion("bookdes >=", value, "bookdes");
            return (Criteria) this;
        }

        public Criteria andBookdesLessThan(String value) {
            addCriterion("bookdes <", value, "bookdes");
            return (Criteria) this;
        }

        public Criteria andBookdesLessThanOrEqualTo(String value) {
            addCriterion("bookdes <=", value, "bookdes");
            return (Criteria) this;
        }

        public Criteria andBookdesLike(String value) {
            addCriterion("bookdes like", value, "bookdes");
            return (Criteria) this;
        }

        public Criteria andBookdesNotLike(String value) {
            addCriterion("bookdes not like", value, "bookdes");
            return (Criteria) this;
        }

        public Criteria andBookdesIn(List<String> values) {
            addCriterion("bookdes in", values, "bookdes");
            return (Criteria) this;
        }

        public Criteria andBookdesNotIn(List<String> values) {
            addCriterion("bookdes not in", values, "bookdes");
            return (Criteria) this;
        }

        public Criteria andBookdesBetween(String value1, String value2) {
            addCriterion("bookdes between", value1, value2, "bookdes");
            return (Criteria) this;
        }

        public Criteria andBookdesNotBetween(String value1, String value2) {
            addCriterion("bookdes not between", value1, value2, "bookdes");
            return (Criteria) this;
        }

        public Criteria andLocationsizeIsNull() {
            addCriterion("locationsize is null");
            return (Criteria) this;
        }

        public Criteria andLocationsizeIsNotNull() {
            addCriterion("locationsize is not null");
            return (Criteria) this;
        }

        public Criteria andLocationsizeEqualTo(Long value) {
            addCriterion("locationsize =", value, "locationsize");
            return (Criteria) this;
        }

        public Criteria andLocationsizeNotEqualTo(Long value) {
            addCriterion("locationsize <>", value, "locationsize");
            return (Criteria) this;
        }

        public Criteria andLocationsizeGreaterThan(Long value) {
            addCriterion("locationsize >", value, "locationsize");
            return (Criteria) this;
        }

        public Criteria andLocationsizeGreaterThanOrEqualTo(Long value) {
            addCriterion("locationsize >=", value, "locationsize");
            return (Criteria) this;
        }

        public Criteria andLocationsizeLessThan(Long value) {
            addCriterion("locationsize <", value, "locationsize");
            return (Criteria) this;
        }

        public Criteria andLocationsizeLessThanOrEqualTo(Long value) {
            addCriterion("locationsize <=", value, "locationsize");
            return (Criteria) this;
        }

        public Criteria andLocationsizeIn(List<Long> values) {
            addCriterion("locationsize in", values, "locationsize");
            return (Criteria) this;
        }

        public Criteria andLocationsizeNotIn(List<Long> values) {
            addCriterion("locationsize not in", values, "locationsize");
            return (Criteria) this;
        }

        public Criteria andLocationsizeBetween(Long value1, Long value2) {
            addCriterion("locationsize between", value1, value2, "locationsize");
            return (Criteria) this;
        }

        public Criteria andLocationsizeNotBetween(Long value1, Long value2) {
            addCriterion("locationsize not between", value1, value2, "locationsize");
            return (Criteria) this;
        }

        public Criteria andAcademicsizeIsNull() {
            addCriterion("academicsize is null");
            return (Criteria) this;
        }

        public Criteria andAcademicsizeIsNotNull() {
            addCriterion("academicsize is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicsizeEqualTo(Long value) {
            addCriterion("academicsize =", value, "academicsize");
            return (Criteria) this;
        }

        public Criteria andAcademicsizeNotEqualTo(Long value) {
            addCriterion("academicsize <>", value, "academicsize");
            return (Criteria) this;
        }

        public Criteria andAcademicsizeGreaterThan(Long value) {
            addCriterion("academicsize >", value, "academicsize");
            return (Criteria) this;
        }

        public Criteria andAcademicsizeGreaterThanOrEqualTo(Long value) {
            addCriterion("academicsize >=", value, "academicsize");
            return (Criteria) this;
        }

        public Criteria andAcademicsizeLessThan(Long value) {
            addCriterion("academicsize <", value, "academicsize");
            return (Criteria) this;
        }

        public Criteria andAcademicsizeLessThanOrEqualTo(Long value) {
            addCriterion("academicsize <=", value, "academicsize");
            return (Criteria) this;
        }

        public Criteria andAcademicsizeIn(List<Long> values) {
            addCriterion("academicsize in", values, "academicsize");
            return (Criteria) this;
        }

        public Criteria andAcademicsizeNotIn(List<Long> values) {
            addCriterion("academicsize not in", values, "academicsize");
            return (Criteria) this;
        }

        public Criteria andAcademicsizeBetween(Long value1, Long value2) {
            addCriterion("academicsize between", value1, value2, "academicsize");
            return (Criteria) this;
        }

        public Criteria andAcademicsizeNotBetween(Long value1, Long value2) {
            addCriterion("academicsize not between", value1, value2, "academicsize");
            return (Criteria) this;
        }

        public Criteria andIsallseriesIsNull() {
            addCriterion("isallseries is null");
            return (Criteria) this;
        }

        public Criteria andIsallseriesIsNotNull() {
            addCriterion("isallseries is not null");
            return (Criteria) this;
        }

        public Criteria andIsallseriesEqualTo(String value) {
            addCriterion("isallseries =", value, "isallseries");
            return (Criteria) this;
        }

        public Criteria andIsallseriesNotEqualTo(String value) {
            addCriterion("isallseries <>", value, "isallseries");
            return (Criteria) this;
        }

        public Criteria andIsallseriesGreaterThan(String value) {
            addCriterion("isallseries >", value, "isallseries");
            return (Criteria) this;
        }

        public Criteria andIsallseriesGreaterThanOrEqualTo(String value) {
            addCriterion("isallseries >=", value, "isallseries");
            return (Criteria) this;
        }

        public Criteria andIsallseriesLessThan(String value) {
            addCriterion("isallseries <", value, "isallseries");
            return (Criteria) this;
        }

        public Criteria andIsallseriesLessThanOrEqualTo(String value) {
            addCriterion("isallseries <=", value, "isallseries");
            return (Criteria) this;
        }

        public Criteria andIsallseriesLike(String value) {
            addCriterion("isallseries like", value, "isallseries");
            return (Criteria) this;
        }

        public Criteria andIsallseriesNotLike(String value) {
            addCriterion("isallseries not like", value, "isallseries");
            return (Criteria) this;
        }

        public Criteria andIsallseriesIn(List<String> values) {
            addCriterion("isallseries in", values, "isallseries");
            return (Criteria) this;
        }

        public Criteria andIsallseriesNotIn(List<String> values) {
            addCriterion("isallseries not in", values, "isallseries");
            return (Criteria) this;
        }

        public Criteria andIsallseriesBetween(String value1, String value2) {
            addCriterion("isallseries between", value1, value2, "isallseries");
            return (Criteria) this;
        }

        public Criteria andIsallseriesNotBetween(String value1, String value2) {
            addCriterion("isallseries not between", value1, value2, "isallseries");
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