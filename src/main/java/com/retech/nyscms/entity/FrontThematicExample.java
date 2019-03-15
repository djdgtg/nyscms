package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontThematicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontThematicExample() {
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

        public Criteria andTempletimgIsNull() {
            addCriterion("templetimg is null");
            return (Criteria) this;
        }

        public Criteria andTempletimgIsNotNull() {
            addCriterion("templetimg is not null");
            return (Criteria) this;
        }

        public Criteria andTempletimgEqualTo(String value) {
            addCriterion("templetimg =", value, "templetimg");
            return (Criteria) this;
        }

        public Criteria andTempletimgNotEqualTo(String value) {
            addCriterion("templetimg <>", value, "templetimg");
            return (Criteria) this;
        }

        public Criteria andTempletimgGreaterThan(String value) {
            addCriterion("templetimg >", value, "templetimg");
            return (Criteria) this;
        }

        public Criteria andTempletimgGreaterThanOrEqualTo(String value) {
            addCriterion("templetimg >=", value, "templetimg");
            return (Criteria) this;
        }

        public Criteria andTempletimgLessThan(String value) {
            addCriterion("templetimg <", value, "templetimg");
            return (Criteria) this;
        }

        public Criteria andTempletimgLessThanOrEqualTo(String value) {
            addCriterion("templetimg <=", value, "templetimg");
            return (Criteria) this;
        }

        public Criteria andTempletimgLike(String value) {
            addCriterion("templetimg like", value, "templetimg");
            return (Criteria) this;
        }

        public Criteria andTempletimgNotLike(String value) {
            addCriterion("templetimg not like", value, "templetimg");
            return (Criteria) this;
        }

        public Criteria andTempletimgIn(List<String> values) {
            addCriterion("templetimg in", values, "templetimg");
            return (Criteria) this;
        }

        public Criteria andTempletimgNotIn(List<String> values) {
            addCriterion("templetimg not in", values, "templetimg");
            return (Criteria) this;
        }

        public Criteria andTempletimgBetween(String value1, String value2) {
            addCriterion("templetimg between", value1, value2, "templetimg");
            return (Criteria) this;
        }

        public Criteria andTempletimgNotBetween(String value1, String value2) {
            addCriterion("templetimg not between", value1, value2, "templetimg");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("imgURL is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("imgURL is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("imgURL =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("imgURL <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("imgURL >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("imgURL >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("imgURL <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("imgURL <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("imgURL like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("imgURL not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("imgURL in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("imgURL not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("imgURL between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("imgURL not between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgIsNull() {
            addCriterion("backgroundimg is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgIsNotNull() {
            addCriterion("backgroundimg is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgEqualTo(String value) {
            addCriterion("backgroundimg =", value, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgNotEqualTo(String value) {
            addCriterion("backgroundimg <>", value, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgGreaterThan(String value) {
            addCriterion("backgroundimg >", value, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgGreaterThanOrEqualTo(String value) {
            addCriterion("backgroundimg >=", value, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgLessThan(String value) {
            addCriterion("backgroundimg <", value, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgLessThanOrEqualTo(String value) {
            addCriterion("backgroundimg <=", value, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgLike(String value) {
            addCriterion("backgroundimg like", value, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgNotLike(String value) {
            addCriterion("backgroundimg not like", value, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgIn(List<String> values) {
            addCriterion("backgroundimg in", values, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgNotIn(List<String> values) {
            addCriterion("backgroundimg not in", values, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgBetween(String value1, String value2) {
            addCriterion("backgroundimg between", value1, value2, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andBackgroundimgNotBetween(String value1, String value2) {
            addCriterion("backgroundimg not between", value1, value2, "backgroundimg");
            return (Criteria) this;
        }

        public Criteria andAppTempletimgIsNull() {
            addCriterion("app_templetimg is null");
            return (Criteria) this;
        }

        public Criteria andAppTempletimgIsNotNull() {
            addCriterion("app_templetimg is not null");
            return (Criteria) this;
        }

        public Criteria andAppTempletimgEqualTo(String value) {
            addCriterion("app_templetimg =", value, "appTempletimg");
            return (Criteria) this;
        }

        public Criteria andAppTempletimgNotEqualTo(String value) {
            addCriterion("app_templetimg <>", value, "appTempletimg");
            return (Criteria) this;
        }

        public Criteria andAppTempletimgGreaterThan(String value) {
            addCriterion("app_templetimg >", value, "appTempletimg");
            return (Criteria) this;
        }

        public Criteria andAppTempletimgGreaterThanOrEqualTo(String value) {
            addCriterion("app_templetimg >=", value, "appTempletimg");
            return (Criteria) this;
        }

        public Criteria andAppTempletimgLessThan(String value) {
            addCriterion("app_templetimg <", value, "appTempletimg");
            return (Criteria) this;
        }

        public Criteria andAppTempletimgLessThanOrEqualTo(String value) {
            addCriterion("app_templetimg <=", value, "appTempletimg");
            return (Criteria) this;
        }

        public Criteria andAppTempletimgLike(String value) {
            addCriterion("app_templetimg like", value, "appTempletimg");
            return (Criteria) this;
        }

        public Criteria andAppTempletimgNotLike(String value) {
            addCriterion("app_templetimg not like", value, "appTempletimg");
            return (Criteria) this;
        }

        public Criteria andAppTempletimgIn(List<String> values) {
            addCriterion("app_templetimg in", values, "appTempletimg");
            return (Criteria) this;
        }

        public Criteria andAppTempletimgNotIn(List<String> values) {
            addCriterion("app_templetimg not in", values, "appTempletimg");
            return (Criteria) this;
        }

        public Criteria andAppTempletimgBetween(String value1, String value2) {
            addCriterion("app_templetimg between", value1, value2, "appTempletimg");
            return (Criteria) this;
        }

        public Criteria andAppTempletimgNotBetween(String value1, String value2) {
            addCriterion("app_templetimg not between", value1, value2, "appTempletimg");
            return (Criteria) this;
        }

        public Criteria andAppImgurlIsNull() {
            addCriterion("app_imgURL is null");
            return (Criteria) this;
        }

        public Criteria andAppImgurlIsNotNull() {
            addCriterion("app_imgURL is not null");
            return (Criteria) this;
        }

        public Criteria andAppImgurlEqualTo(String value) {
            addCriterion("app_imgURL =", value, "appImgurl");
            return (Criteria) this;
        }

        public Criteria andAppImgurlNotEqualTo(String value) {
            addCriterion("app_imgURL <>", value, "appImgurl");
            return (Criteria) this;
        }

        public Criteria andAppImgurlGreaterThan(String value) {
            addCriterion("app_imgURL >", value, "appImgurl");
            return (Criteria) this;
        }

        public Criteria andAppImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("app_imgURL >=", value, "appImgurl");
            return (Criteria) this;
        }

        public Criteria andAppImgurlLessThan(String value) {
            addCriterion("app_imgURL <", value, "appImgurl");
            return (Criteria) this;
        }

        public Criteria andAppImgurlLessThanOrEqualTo(String value) {
            addCriterion("app_imgURL <=", value, "appImgurl");
            return (Criteria) this;
        }

        public Criteria andAppImgurlLike(String value) {
            addCriterion("app_imgURL like", value, "appImgurl");
            return (Criteria) this;
        }

        public Criteria andAppImgurlNotLike(String value) {
            addCriterion("app_imgURL not like", value, "appImgurl");
            return (Criteria) this;
        }

        public Criteria andAppImgurlIn(List<String> values) {
            addCriterion("app_imgURL in", values, "appImgurl");
            return (Criteria) this;
        }

        public Criteria andAppImgurlNotIn(List<String> values) {
            addCriterion("app_imgURL not in", values, "appImgurl");
            return (Criteria) this;
        }

        public Criteria andAppImgurlBetween(String value1, String value2) {
            addCriterion("app_imgURL between", value1, value2, "appImgurl");
            return (Criteria) this;
        }

        public Criteria andAppImgurlNotBetween(String value1, String value2) {
            addCriterion("app_imgURL not between", value1, value2, "appImgurl");
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

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andEnDescriptionIsNull() {
            addCriterion("en_description is null");
            return (Criteria) this;
        }

        public Criteria andEnDescriptionIsNotNull() {
            addCriterion("en_description is not null");
            return (Criteria) this;
        }

        public Criteria andEnDescriptionEqualTo(String value) {
            addCriterion("en_description =", value, "enDescription");
            return (Criteria) this;
        }

        public Criteria andEnDescriptionNotEqualTo(String value) {
            addCriterion("en_description <>", value, "enDescription");
            return (Criteria) this;
        }

        public Criteria andEnDescriptionGreaterThan(String value) {
            addCriterion("en_description >", value, "enDescription");
            return (Criteria) this;
        }

        public Criteria andEnDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("en_description >=", value, "enDescription");
            return (Criteria) this;
        }

        public Criteria andEnDescriptionLessThan(String value) {
            addCriterion("en_description <", value, "enDescription");
            return (Criteria) this;
        }

        public Criteria andEnDescriptionLessThanOrEqualTo(String value) {
            addCriterion("en_description <=", value, "enDescription");
            return (Criteria) this;
        }

        public Criteria andEnDescriptionLike(String value) {
            addCriterion("en_description like", value, "enDescription");
            return (Criteria) this;
        }

        public Criteria andEnDescriptionNotLike(String value) {
            addCriterion("en_description not like", value, "enDescription");
            return (Criteria) this;
        }

        public Criteria andEnDescriptionIn(List<String> values) {
            addCriterion("en_description in", values, "enDescription");
            return (Criteria) this;
        }

        public Criteria andEnDescriptionNotIn(List<String> values) {
            addCriterion("en_description not in", values, "enDescription");
            return (Criteria) this;
        }

        public Criteria andEnDescriptionBetween(String value1, String value2) {
            addCriterion("en_description between", value1, value2, "enDescription");
            return (Criteria) this;
        }

        public Criteria andEnDescriptionNotBetween(String value1, String value2) {
            addCriterion("en_description not between", value1, value2, "enDescription");
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