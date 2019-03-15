package com.retech.nyscms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrontUserNoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrontUserNoteExample() {
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

        public Criteria andFkUserIdEqualTo(Integer value) {
            addCriterion("fk_user_id =", value, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdNotEqualTo(Integer value) {
            addCriterion("fk_user_id <>", value, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdGreaterThan(Integer value) {
            addCriterion("fk_user_id >", value, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fk_user_id >=", value, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdLessThan(Integer value) {
            addCriterion("fk_user_id <", value, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("fk_user_id <=", value, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdIn(List<Integer> values) {
            addCriterion("fk_user_id in", values, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdNotIn(List<Integer> values) {
            addCriterion("fk_user_id not in", values, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdBetween(Integer value1, Integer value2) {
            addCriterion("fk_user_id between", value1, value2, "fkUserId");
            return (Criteria) this;
        }

        public Criteria andFkUserIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andFkBookIdEqualTo(Integer value) {
            addCriterion("fk_book_id =", value, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdNotEqualTo(Integer value) {
            addCriterion("fk_book_id <>", value, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdGreaterThan(Integer value) {
            addCriterion("fk_book_id >", value, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fk_book_id >=", value, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdLessThan(Integer value) {
            addCriterion("fk_book_id <", value, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("fk_book_id <=", value, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdIn(List<Integer> values) {
            addCriterion("fk_book_id in", values, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdNotIn(List<Integer> values) {
            addCriterion("fk_book_id not in", values, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdBetween(Integer value1, Integer value2) {
            addCriterion("fk_book_id between", value1, value2, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andPositionOffsetIsNull() {
            addCriterion("position_offset is null");
            return (Criteria) this;
        }

        public Criteria andPositionOffsetIsNotNull() {
            addCriterion("position_offset is not null");
            return (Criteria) this;
        }

        public Criteria andPositionOffsetEqualTo(String value) {
            addCriterion("position_offset =", value, "positionOffset");
            return (Criteria) this;
        }

        public Criteria andPositionOffsetNotEqualTo(String value) {
            addCriterion("position_offset <>", value, "positionOffset");
            return (Criteria) this;
        }

        public Criteria andPositionOffsetGreaterThan(String value) {
            addCriterion("position_offset >", value, "positionOffset");
            return (Criteria) this;
        }

        public Criteria andPositionOffsetGreaterThanOrEqualTo(String value) {
            addCriterion("position_offset >=", value, "positionOffset");
            return (Criteria) this;
        }

        public Criteria andPositionOffsetLessThan(String value) {
            addCriterion("position_offset <", value, "positionOffset");
            return (Criteria) this;
        }

        public Criteria andPositionOffsetLessThanOrEqualTo(String value) {
            addCriterion("position_offset <=", value, "positionOffset");
            return (Criteria) this;
        }

        public Criteria andPositionOffsetLike(String value) {
            addCriterion("position_offset like", value, "positionOffset");
            return (Criteria) this;
        }

        public Criteria andPositionOffsetNotLike(String value) {
            addCriterion("position_offset not like", value, "positionOffset");
            return (Criteria) this;
        }

        public Criteria andPositionOffsetIn(List<String> values) {
            addCriterion("position_offset in", values, "positionOffset");
            return (Criteria) this;
        }

        public Criteria andPositionOffsetNotIn(List<String> values) {
            addCriterion("position_offset not in", values, "positionOffset");
            return (Criteria) this;
        }

        public Criteria andPositionOffsetBetween(String value1, String value2) {
            addCriterion("position_offset between", value1, value2, "positionOffset");
            return (Criteria) this;
        }

        public Criteria andPositionOffsetNotBetween(String value1, String value2) {
            addCriterion("position_offset not between", value1, value2, "positionOffset");
            return (Criteria) this;
        }

        public Criteria andNoteContentIsNull() {
            addCriterion("note_content is null");
            return (Criteria) this;
        }

        public Criteria andNoteContentIsNotNull() {
            addCriterion("note_content is not null");
            return (Criteria) this;
        }

        public Criteria andNoteContentEqualTo(String value) {
            addCriterion("note_content =", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentNotEqualTo(String value) {
            addCriterion("note_content <>", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentGreaterThan(String value) {
            addCriterion("note_content >", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentGreaterThanOrEqualTo(String value) {
            addCriterion("note_content >=", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentLessThan(String value) {
            addCriterion("note_content <", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentLessThanOrEqualTo(String value) {
            addCriterion("note_content <=", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentLike(String value) {
            addCriterion("note_content like", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentNotLike(String value) {
            addCriterion("note_content not like", value, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentIn(List<String> values) {
            addCriterion("note_content in", values, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentNotIn(List<String> values) {
            addCriterion("note_content not in", values, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentBetween(String value1, String value2) {
            addCriterion("note_content between", value1, value2, "noteContent");
            return (Criteria) this;
        }

        public Criteria andNoteContentNotBetween(String value1, String value2) {
            addCriterion("note_content not between", value1, value2, "noteContent");
            return (Criteria) this;
        }

        public Criteria andSummaryUnderlineColorIsNull() {
            addCriterion("summary_underline_color is null");
            return (Criteria) this;
        }

        public Criteria andSummaryUnderlineColorIsNotNull() {
            addCriterion("summary_underline_color is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryUnderlineColorEqualTo(String value) {
            addCriterion("summary_underline_color =", value, "summaryUnderlineColor");
            return (Criteria) this;
        }

        public Criteria andSummaryUnderlineColorNotEqualTo(String value) {
            addCriterion("summary_underline_color <>", value, "summaryUnderlineColor");
            return (Criteria) this;
        }

        public Criteria andSummaryUnderlineColorGreaterThan(String value) {
            addCriterion("summary_underline_color >", value, "summaryUnderlineColor");
            return (Criteria) this;
        }

        public Criteria andSummaryUnderlineColorGreaterThanOrEqualTo(String value) {
            addCriterion("summary_underline_color >=", value, "summaryUnderlineColor");
            return (Criteria) this;
        }

        public Criteria andSummaryUnderlineColorLessThan(String value) {
            addCriterion("summary_underline_color <", value, "summaryUnderlineColor");
            return (Criteria) this;
        }

        public Criteria andSummaryUnderlineColorLessThanOrEqualTo(String value) {
            addCriterion("summary_underline_color <=", value, "summaryUnderlineColor");
            return (Criteria) this;
        }

        public Criteria andSummaryUnderlineColorLike(String value) {
            addCriterion("summary_underline_color like", value, "summaryUnderlineColor");
            return (Criteria) this;
        }

        public Criteria andSummaryUnderlineColorNotLike(String value) {
            addCriterion("summary_underline_color not like", value, "summaryUnderlineColor");
            return (Criteria) this;
        }

        public Criteria andSummaryUnderlineColorIn(List<String> values) {
            addCriterion("summary_underline_color in", values, "summaryUnderlineColor");
            return (Criteria) this;
        }

        public Criteria andSummaryUnderlineColorNotIn(List<String> values) {
            addCriterion("summary_underline_color not in", values, "summaryUnderlineColor");
            return (Criteria) this;
        }

        public Criteria andSummaryUnderlineColorBetween(String value1, String value2) {
            addCriterion("summary_underline_color between", value1, value2, "summaryUnderlineColor");
            return (Criteria) this;
        }

        public Criteria andSummaryUnderlineColorNotBetween(String value1, String value2) {
            addCriterion("summary_underline_color not between", value1, value2, "summaryUnderlineColor");
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

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
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

        public Criteria andPlatformEqualTo(Integer value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(Integer value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(Integer value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(Integer value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(Integer value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(Integer value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<Integer> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<Integer> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(Integer value1, Integer value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(Integer value1, Integer value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeIsNull() {
            addCriterion("platformType is null");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeIsNotNull() {
            addCriterion("platformType is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeEqualTo(String value) {
            addCriterion("platformType =", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeNotEqualTo(String value) {
            addCriterion("platformType <>", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeGreaterThan(String value) {
            addCriterion("platformType >", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeGreaterThanOrEqualTo(String value) {
            addCriterion("platformType >=", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeLessThan(String value) {
            addCriterion("platformType <", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeLessThanOrEqualTo(String value) {
            addCriterion("platformType <=", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeLike(String value) {
            addCriterion("platformType like", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeNotLike(String value) {
            addCriterion("platformType not like", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeIn(List<String> values) {
            addCriterion("platformType in", values, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeNotIn(List<String> values) {
            addCriterion("platformType not in", values, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeBetween(String value1, String value2) {
            addCriterion("platformType between", value1, value2, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeNotBetween(String value1, String value2) {
            addCriterion("platformType not between", value1, value2, "platformtype");
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

        public Criteria andProcessIsNull() {
            addCriterion("process is null");
            return (Criteria) this;
        }

        public Criteria andProcessIsNotNull() {
            addCriterion("process is not null");
            return (Criteria) this;
        }

        public Criteria andProcessEqualTo(String value) {
            addCriterion("process =", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotEqualTo(String value) {
            addCriterion("process <>", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessGreaterThan(String value) {
            addCriterion("process >", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessGreaterThanOrEqualTo(String value) {
            addCriterion("process >=", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLessThan(String value) {
            addCriterion("process <", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLessThanOrEqualTo(String value) {
            addCriterion("process <=", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLike(String value) {
            addCriterion("process like", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotLike(String value) {
            addCriterion("process not like", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessIn(List<String> values) {
            addCriterion("process in", values, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotIn(List<String> values) {
            addCriterion("process not in", values, "process");
            return (Criteria) this;
        }

        public Criteria andProcessBetween(String value1, String value2) {
            addCriterion("process between", value1, value2, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotBetween(String value1, String value2) {
            addCriterion("process not between", value1, value2, "process");
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