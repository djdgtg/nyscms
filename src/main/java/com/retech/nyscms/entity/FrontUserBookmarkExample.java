package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontUserBookmarkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontUserBookmarkExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFkUserIdIsNull() {
            addCriterion("fk_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFkUserIdIsNotNull() {
            addCriterion("fk_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFkUserIdEqualTo(Long value) {
            addCriterion("fk_user_id =", value, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdNotEqualTo(Long value) {
            addCriterion("fk_user_id <>", value, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdGreaterThan(Long value) {
            addCriterion("fk_user_id >", value, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fk_user_id >=", value, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdLessThan(Long value) {
            addCriterion("fk_user_id <", value, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdLessThanOrEqualTo(Long value) {
            addCriterion("fk_user_id <=", value, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdIn(List<Long> values) {
            addCriterion("fk_user_id in", values, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdNotIn(List<Long> values) {
            addCriterion("fk_user_id not in", values, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdBetween(Long value1, Long value2) {
            addCriterion("fk_user_id between", value1, value2, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdNotBetween(Long value1, Long value2) {
            addCriterion("fk_user_id not between", value1, value2, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdIsNull() {
            addCriterion("fk_book_id is null");
            return (Criteria) this;
        }

        public Criteria andFkBookIdIsNotNull() {
            addCriterion("fk_book_id is not null");
            return (Criteria) this;
        }

        public Criteria andFkBookIdEqualTo(Long value) {
            addCriterion("fk_book_id =", value, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdNotEqualTo(Long value) {
            addCriterion("fk_book_id <>", value, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdGreaterThan(Long value) {
            addCriterion("fk_book_id >", value, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fk_book_id >=", value, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdLessThan(Long value) {
            addCriterion("fk_book_id <", value, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdLessThanOrEqualTo(Long value) {
            addCriterion("fk_book_id <=", value, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdIn(List<Long> values) {
            addCriterion("fk_book_id in", values, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdNotIn(List<Long> values) {
            addCriterion("fk_book_id not in", values, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdBetween(Long value1, Long value2) {
            addCriterion("fk_book_id between", value1, value2, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdNotBetween(Long value1, Long value2) {
            addCriterion("fk_book_id not between", value1, value2, "fkBookId");
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

        public Criteria andChapterNameIsNull() {
            addCriterion("chapter_name is null");
            return (Criteria) this;
        }

        public Criteria andChapterNameIsNotNull() {
            addCriterion("chapter_name is not null");
            return (Criteria) this;
        }

        public Criteria andChapterNameEqualTo(String value) {
            addCriterion("chapter_name =", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotEqualTo(String value) {
            addCriterion("chapter_name <>", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameGreaterThan(String value) {
            addCriterion("chapter_name >", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameGreaterThanOrEqualTo(String value) {
            addCriterion("chapter_name >=", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLessThan(String value) {
            addCriterion("chapter_name <", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLessThanOrEqualTo(String value) {
            addCriterion("chapter_name <=", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLike(String value) {
            addCriterion("chapter_name like", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotLike(String value) {
            addCriterion("chapter_name not like", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameIn(List<String> values) {
            addCriterion("chapter_name in", values, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotIn(List<String> values) {
            addCriterion("chapter_name not in", values, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameBetween(String value1, String value2) {
            addCriterion("chapter_name between", value1, value2, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotBetween(String value1, String value2) {
            addCriterion("chapter_name not between", value1, value2, "chapterName");
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

        public Criteria andSummaryContentIsNull() {
            addCriterion("summary_content is null");
            return (Criteria) this;
        }

        public Criteria andSummaryContentIsNotNull() {
            addCriterion("summary_content is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryContentEqualTo(String value) {
            addCriterion("summary_content =", value, "summaryContent");
            return (Criteria) this;
        }

        public Criteria andSummaryContentNotEqualTo(String value) {
            addCriterion("summary_content <>", value, "summaryContent");
            return (Criteria) this;
        }

        public Criteria andSummaryContentGreaterThan(String value) {
            addCriterion("summary_content >", value, "summaryContent");
            return (Criteria) this;
        }

        public Criteria andSummaryContentGreaterThanOrEqualTo(String value) {
            addCriterion("summary_content >=", value, "summaryContent");
            return (Criteria) this;
        }

        public Criteria andSummaryContentLessThan(String value) {
            addCriterion("summary_content <", value, "summaryContent");
            return (Criteria) this;
        }

        public Criteria andSummaryContentLessThanOrEqualTo(String value) {
            addCriterion("summary_content <=", value, "summaryContent");
            return (Criteria) this;
        }

        public Criteria andSummaryContentLike(String value) {
            addCriterion("summary_content like", value, "summaryContent");
            return (Criteria) this;
        }

        public Criteria andSummaryContentNotLike(String value) {
            addCriterion("summary_content not like", value, "summaryContent");
            return (Criteria) this;
        }

        public Criteria andSummaryContentIn(List<String> values) {
            addCriterion("summary_content in", values, "summaryContent");
            return (Criteria) this;
        }

        public Criteria andSummaryContentNotIn(List<String> values) {
            addCriterion("summary_content not in", values, "summaryContent");
            return (Criteria) this;
        }

        public Criteria andSummaryContentBetween(String value1, String value2) {
            addCriterion("summary_content between", value1, value2, "summaryContent");
            return (Criteria) this;
        }

        public Criteria andSummaryContentNotBetween(String value1, String value2) {
            addCriterion("summary_content not between", value1, value2, "summaryContent");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andPositionEndIsNull() {
            addCriterion("position_end is null");
            return (Criteria) this;
        }

        public Criteria andPositionEndIsNotNull() {
            addCriterion("position_end is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEndEqualTo(String value) {
            addCriterion("position_end =", value, "positionEnd");
            return (Criteria) this;
        }

        public Criteria andPositionEndNotEqualTo(String value) {
            addCriterion("position_end <>", value, "positionEnd");
            return (Criteria) this;
        }

        public Criteria andPositionEndGreaterThan(String value) {
            addCriterion("position_end >", value, "positionEnd");
            return (Criteria) this;
        }

        public Criteria andPositionEndGreaterThanOrEqualTo(String value) {
            addCriterion("position_end >=", value, "positionEnd");
            return (Criteria) this;
        }

        public Criteria andPositionEndLessThan(String value) {
            addCriterion("position_end <", value, "positionEnd");
            return (Criteria) this;
        }

        public Criteria andPositionEndLessThanOrEqualTo(String value) {
            addCriterion("position_end <=", value, "positionEnd");
            return (Criteria) this;
        }

        public Criteria andPositionEndLike(String value) {
            addCriterion("position_end like", value, "positionEnd");
            return (Criteria) this;
        }

        public Criteria andPositionEndNotLike(String value) {
            addCriterion("position_end not like", value, "positionEnd");
            return (Criteria) this;
        }

        public Criteria andPositionEndIn(List<String> values) {
            addCriterion("position_end in", values, "positionEnd");
            return (Criteria) this;
        }

        public Criteria andPositionEndNotIn(List<String> values) {
            addCriterion("position_end not in", values, "positionEnd");
            return (Criteria) this;
        }

        public Criteria andPositionEndBetween(String value1, String value2) {
            addCriterion("position_end between", value1, value2, "positionEnd");
            return (Criteria) this;
        }

        public Criteria andPositionEndNotBetween(String value1, String value2) {
            addCriterion("position_end not between", value1, value2, "positionEnd");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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