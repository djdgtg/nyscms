package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseSeriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseSeriesExample() {
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

        public Criteria andSerialidIsNull() {
            addCriterion("serialID is null");
            return (Criteria) this;
        }

        public Criteria andSerialidIsNotNull() {
            addCriterion("serialID is not null");
            return (Criteria) this;
        }

        public Criteria andSerialidEqualTo(Integer value) {
            addCriterion("serialID =", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotEqualTo(Integer value) {
            addCriterion("serialID <>", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidGreaterThan(Integer value) {
            addCriterion("serialID >", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidGreaterThanOrEqualTo(Integer value) {
            addCriterion("serialID >=", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidLessThan(Integer value) {
            addCriterion("serialID <", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidLessThanOrEqualTo(Integer value) {
            addCriterion("serialID <=", value, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidIn(List<Integer> values) {
            addCriterion("serialID in", values, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotIn(List<Integer> values) {
            addCriterion("serialID not in", values, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidBetween(Integer value1, Integer value2) {
            addCriterion("serialID between", value1, value2, "serialid");
            return (Criteria) this;
        }

        public Criteria andSerialidNotBetween(Integer value1, Integer value2) {
            addCriterion("serialID not between", value1, value2, "serialid");
            return (Criteria) this;
        }

        public Criteria andParentserialidIsNull() {
            addCriterion("parentserialID is null");
            return (Criteria) this;
        }

        public Criteria andParentserialidIsNotNull() {
            addCriterion("parentserialID is not null");
            return (Criteria) this;
        }

        public Criteria andParentserialidEqualTo(Integer value) {
            addCriterion("parentserialID =", value, "parentserialid");
            return (Criteria) this;
        }

        public Criteria andParentserialidNotEqualTo(Integer value) {
            addCriterion("parentserialID <>", value, "parentserialid");
            return (Criteria) this;
        }

        public Criteria andParentserialidGreaterThan(Integer value) {
            addCriterion("parentserialID >", value, "parentserialid");
            return (Criteria) this;
        }

        public Criteria andParentserialidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentserialID >=", value, "parentserialid");
            return (Criteria) this;
        }

        public Criteria andParentserialidLessThan(Integer value) {
            addCriterion("parentserialID <", value, "parentserialid");
            return (Criteria) this;
        }

        public Criteria andParentserialidLessThanOrEqualTo(Integer value) {
            addCriterion("parentserialID <=", value, "parentserialid");
            return (Criteria) this;
        }

        public Criteria andParentserialidIn(List<Integer> values) {
            addCriterion("parentserialID in", values, "parentserialid");
            return (Criteria) this;
        }

        public Criteria andParentserialidNotIn(List<Integer> values) {
            addCriterion("parentserialID not in", values, "parentserialid");
            return (Criteria) this;
        }

        public Criteria andParentserialidBetween(Integer value1, Integer value2) {
            addCriterion("parentserialID between", value1, value2, "parentserialid");
            return (Criteria) this;
        }

        public Criteria andParentserialidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentserialID not between", value1, value2, "parentserialid");
            return (Criteria) this;
        }

        public Criteria andEnSerialnameIsNull() {
            addCriterion("en_serialName is null");
            return (Criteria) this;
        }

        public Criteria andEnSerialnameIsNotNull() {
            addCriterion("en_serialName is not null");
            return (Criteria) this;
        }

        public Criteria andEnSerialnameEqualTo(String value) {
            addCriterion("en_serialName =", value, "enSerialname");
            return (Criteria) this;
        }

        public Criteria andEnSerialnameNotEqualTo(String value) {
            addCriterion("en_serialName <>", value, "enSerialname");
            return (Criteria) this;
        }

        public Criteria andEnSerialnameGreaterThan(String value) {
            addCriterion("en_serialName >", value, "enSerialname");
            return (Criteria) this;
        }

        public Criteria andEnSerialnameGreaterThanOrEqualTo(String value) {
            addCriterion("en_serialName >=", value, "enSerialname");
            return (Criteria) this;
        }

        public Criteria andEnSerialnameLessThan(String value) {
            addCriterion("en_serialName <", value, "enSerialname");
            return (Criteria) this;
        }

        public Criteria andEnSerialnameLessThanOrEqualTo(String value) {
            addCriterion("en_serialName <=", value, "enSerialname");
            return (Criteria) this;
        }

        public Criteria andEnSerialnameLike(String value) {
            addCriterion("en_serialName like", value, "enSerialname");
            return (Criteria) this;
        }

        public Criteria andEnSerialnameNotLike(String value) {
            addCriterion("en_serialName not like", value, "enSerialname");
            return (Criteria) this;
        }

        public Criteria andEnSerialnameIn(List<String> values) {
            addCriterion("en_serialName in", values, "enSerialname");
            return (Criteria) this;
        }

        public Criteria andEnSerialnameNotIn(List<String> values) {
            addCriterion("en_serialName not in", values, "enSerialname");
            return (Criteria) this;
        }

        public Criteria andEnSerialnameBetween(String value1, String value2) {
            addCriterion("en_serialName between", value1, value2, "enSerialname");
            return (Criteria) this;
        }

        public Criteria andEnSerialnameNotBetween(String value1, String value2) {
            addCriterion("en_serialName not between", value1, value2, "enSerialname");
            return (Criteria) this;
        }

        public Criteria andSerialnameIsNull() {
            addCriterion("serialName is null");
            return (Criteria) this;
        }

        public Criteria andSerialnameIsNotNull() {
            addCriterion("serialName is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnameEqualTo(String value) {
            addCriterion("serialName =", value, "serialname");
            return (Criteria) this;
        }

        public Criteria andSerialnameNotEqualTo(String value) {
            addCriterion("serialName <>", value, "serialname");
            return (Criteria) this;
        }

        public Criteria andSerialnameGreaterThan(String value) {
            addCriterion("serialName >", value, "serialname");
            return (Criteria) this;
        }

        public Criteria andSerialnameGreaterThanOrEqualTo(String value) {
            addCriterion("serialName >=", value, "serialname");
            return (Criteria) this;
        }

        public Criteria andSerialnameLessThan(String value) {
            addCriterion("serialName <", value, "serialname");
            return (Criteria) this;
        }

        public Criteria andSerialnameLessThanOrEqualTo(String value) {
            addCriterion("serialName <=", value, "serialname");
            return (Criteria) this;
        }

        public Criteria andSerialnameLike(String value) {
            addCriterion("serialName like", value, "serialname");
            return (Criteria) this;
        }

        public Criteria andSerialnameNotLike(String value) {
            addCriterion("serialName not like", value, "serialname");
            return (Criteria) this;
        }

        public Criteria andSerialnameIn(List<String> values) {
            addCriterion("serialName in", values, "serialname");
            return (Criteria) this;
        }

        public Criteria andSerialnameNotIn(List<String> values) {
            addCriterion("serialName not in", values, "serialname");
            return (Criteria) this;
        }

        public Criteria andSerialnameBetween(String value1, String value2) {
            addCriterion("serialName between", value1, value2, "serialname");
            return (Criteria) this;
        }

        public Criteria andSerialnameNotBetween(String value1, String value2) {
            addCriterion("serialName not between", value1, value2, "serialname");
            return (Criteria) this;
        }

        public Criteria andEnSerialurlIsNull() {
            addCriterion("en_serialUrl is null");
            return (Criteria) this;
        }

        public Criteria andEnSerialurlIsNotNull() {
            addCriterion("en_serialUrl is not null");
            return (Criteria) this;
        }

        public Criteria andEnSerialurlEqualTo(String value) {
            addCriterion("en_serialUrl =", value, "enSerialurl");
            return (Criteria) this;
        }

        public Criteria andEnSerialurlNotEqualTo(String value) {
            addCriterion("en_serialUrl <>", value, "enSerialurl");
            return (Criteria) this;
        }

        public Criteria andEnSerialurlGreaterThan(String value) {
            addCriterion("en_serialUrl >", value, "enSerialurl");
            return (Criteria) this;
        }

        public Criteria andEnSerialurlGreaterThanOrEqualTo(String value) {
            addCriterion("en_serialUrl >=", value, "enSerialurl");
            return (Criteria) this;
        }

        public Criteria andEnSerialurlLessThan(String value) {
            addCriterion("en_serialUrl <", value, "enSerialurl");
            return (Criteria) this;
        }

        public Criteria andEnSerialurlLessThanOrEqualTo(String value) {
            addCriterion("en_serialUrl <=", value, "enSerialurl");
            return (Criteria) this;
        }

        public Criteria andEnSerialurlLike(String value) {
            addCriterion("en_serialUrl like", value, "enSerialurl");
            return (Criteria) this;
        }

        public Criteria andEnSerialurlNotLike(String value) {
            addCriterion("en_serialUrl not like", value, "enSerialurl");
            return (Criteria) this;
        }

        public Criteria andEnSerialurlIn(List<String> values) {
            addCriterion("en_serialUrl in", values, "enSerialurl");
            return (Criteria) this;
        }

        public Criteria andEnSerialurlNotIn(List<String> values) {
            addCriterion("en_serialUrl not in", values, "enSerialurl");
            return (Criteria) this;
        }

        public Criteria andEnSerialurlBetween(String value1, String value2) {
            addCriterion("en_serialUrl between", value1, value2, "enSerialurl");
            return (Criteria) this;
        }

        public Criteria andEnSerialurlNotBetween(String value1, String value2) {
            addCriterion("en_serialUrl not between", value1, value2, "enSerialurl");
            return (Criteria) this;
        }

        public Criteria andSerialurlIsNull() {
            addCriterion("serialUrl is null");
            return (Criteria) this;
        }

        public Criteria andSerialurlIsNotNull() {
            addCriterion("serialUrl is not null");
            return (Criteria) this;
        }

        public Criteria andSerialurlEqualTo(String value) {
            addCriterion("serialUrl =", value, "serialurl");
            return (Criteria) this;
        }

        public Criteria andSerialurlNotEqualTo(String value) {
            addCriterion("serialUrl <>", value, "serialurl");
            return (Criteria) this;
        }

        public Criteria andSerialurlGreaterThan(String value) {
            addCriterion("serialUrl >", value, "serialurl");
            return (Criteria) this;
        }

        public Criteria andSerialurlGreaterThanOrEqualTo(String value) {
            addCriterion("serialUrl >=", value, "serialurl");
            return (Criteria) this;
        }

        public Criteria andSerialurlLessThan(String value) {
            addCriterion("serialUrl <", value, "serialurl");
            return (Criteria) this;
        }

        public Criteria andSerialurlLessThanOrEqualTo(String value) {
            addCriterion("serialUrl <=", value, "serialurl");
            return (Criteria) this;
        }

        public Criteria andSerialurlLike(String value) {
            addCriterion("serialUrl like", value, "serialurl");
            return (Criteria) this;
        }

        public Criteria andSerialurlNotLike(String value) {
            addCriterion("serialUrl not like", value, "serialurl");
            return (Criteria) this;
        }

        public Criteria andSerialurlIn(List<String> values) {
            addCriterion("serialUrl in", values, "serialurl");
            return (Criteria) this;
        }

        public Criteria andSerialurlNotIn(List<String> values) {
            addCriterion("serialUrl not in", values, "serialurl");
            return (Criteria) this;
        }

        public Criteria andSerialurlBetween(String value1, String value2) {
            addCriterion("serialUrl between", value1, value2, "serialurl");
            return (Criteria) this;
        }

        public Criteria andSerialurlNotBetween(String value1, String value2) {
            addCriterion("serialUrl not between", value1, value2, "serialurl");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("Remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("Remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("Remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("Remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("Remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("Remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("Remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("Remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("Remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("Remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("Remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("Remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("Remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("Remarks not between", value1, value2, "remarks");
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

        public Criteria andSortEqualTo(String value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(String value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(String value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(String value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(String value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(String value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLike(String value) {
            addCriterion("sort like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotLike(String value) {
            addCriterion("sort not like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<String> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<String> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(String value1, String value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(String value1, String value2) {
            addCriterion("sort not between", value1, value2, "sort");
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

        public Criteria andCreateridIsNull() {
            addCriterion("createrid is null");
            return (Criteria) this;
        }

        public Criteria andCreateridIsNotNull() {
            addCriterion("createrid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateridEqualTo(Integer value) {
            addCriterion("createrid =", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridNotEqualTo(Integer value) {
            addCriterion("createrid <>", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridGreaterThan(Integer value) {
            addCriterion("createrid >", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridGreaterThanOrEqualTo(Integer value) {
            addCriterion("createrid >=", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridLessThan(Integer value) {
            addCriterion("createrid <", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridLessThanOrEqualTo(Integer value) {
            addCriterion("createrid <=", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridIn(List<Integer> values) {
            addCriterion("createrid in", values, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridNotIn(List<Integer> values) {
            addCriterion("createrid not in", values, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridBetween(Integer value1, Integer value2) {
            addCriterion("createrid between", value1, value2, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridNotBetween(Integer value1, Integer value2) {
            addCriterion("createrid not between", value1, value2, "createrid");
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