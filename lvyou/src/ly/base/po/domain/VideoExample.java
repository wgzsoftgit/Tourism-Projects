package ly.base.po.domain;

import java.util.ArrayList;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andVidIdIsNull() {
            addCriterion("vid_id is null");
            return (Criteria) this;
        }

        public Criteria andVidIdIsNotNull() {
            addCriterion("vid_id is not null");
            return (Criteria) this;
        }

        public Criteria andVidIdEqualTo(Integer value) {
            addCriterion("vid_id =", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdNotEqualTo(Integer value) {
            addCriterion("vid_id <>", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdGreaterThan(Integer value) {
            addCriterion("vid_id >", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid_id >=", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdLessThan(Integer value) {
            addCriterion("vid_id <", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdLessThanOrEqualTo(Integer value) {
            addCriterion("vid_id <=", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdIn(List<Integer> values) {
            addCriterion("vid_id in", values, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdNotIn(List<Integer> values) {
            addCriterion("vid_id not in", values, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdBetween(Integer value1, Integer value2) {
            addCriterion("vid_id between", value1, value2, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vid_id not between", value1, value2, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidNameIsNull() {
            addCriterion("vid_name is null");
            return (Criteria) this;
        }

        public Criteria andVidNameIsNotNull() {
            addCriterion("vid_name is not null");
            return (Criteria) this;
        }

        public Criteria andVidNameEqualTo(String value) {
            addCriterion("vid_name =", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameNotEqualTo(String value) {
            addCriterion("vid_name <>", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameGreaterThan(String value) {
            addCriterion("vid_name >", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameGreaterThanOrEqualTo(String value) {
            addCriterion("vid_name >=", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameLessThan(String value) {
            addCriterion("vid_name <", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameLessThanOrEqualTo(String value) {
            addCriterion("vid_name <=", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameLike(String value) {
            addCriterion("vid_name like", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameNotLike(String value) {
            addCriterion("vid_name not like", value, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameIn(List<String> values) {
            addCriterion("vid_name in", values, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameNotIn(List<String> values) {
            addCriterion("vid_name not in", values, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameBetween(String value1, String value2) {
            addCriterion("vid_name between", value1, value2, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidNameNotBetween(String value1, String value2) {
            addCriterion("vid_name not between", value1, value2, "vidName");
            return (Criteria) this;
        }

        public Criteria andVidLiveIsNull() {
            addCriterion("vid_live is null");
            return (Criteria) this;
        }

        public Criteria andVidLiveIsNotNull() {
            addCriterion("vid_live is not null");
            return (Criteria) this;
        }

        public Criteria andVidLiveEqualTo(String value) {
            addCriterion("vid_live =", value, "vidLive");
            return (Criteria) this;
        }

        public Criteria andVidLiveNotEqualTo(String value) {
            addCriterion("vid_live <>", value, "vidLive");
            return (Criteria) this;
        }

        public Criteria andVidLiveGreaterThan(String value) {
            addCriterion("vid_live >", value, "vidLive");
            return (Criteria) this;
        }

        public Criteria andVidLiveGreaterThanOrEqualTo(String value) {
            addCriterion("vid_live >=", value, "vidLive");
            return (Criteria) this;
        }

        public Criteria andVidLiveLessThan(String value) {
            addCriterion("vid_live <", value, "vidLive");
            return (Criteria) this;
        }

        public Criteria andVidLiveLessThanOrEqualTo(String value) {
            addCriterion("vid_live <=", value, "vidLive");
            return (Criteria) this;
        }

        public Criteria andVidLiveLike(String value) {
            addCriterion("vid_live like", value, "vidLive");
            return (Criteria) this;
        }

        public Criteria andVidLiveNotLike(String value) {
            addCriterion("vid_live not like", value, "vidLive");
            return (Criteria) this;
        }

        public Criteria andVidLiveIn(List<String> values) {
            addCriterion("vid_live in", values, "vidLive");
            return (Criteria) this;
        }

        public Criteria andVidLiveNotIn(List<String> values) {
            addCriterion("vid_live not in", values, "vidLive");
            return (Criteria) this;
        }

        public Criteria andVidLiveBetween(String value1, String value2) {
            addCriterion("vid_live between", value1, value2, "vidLive");
            return (Criteria) this;
        }

        public Criteria andVidLiveNotBetween(String value1, String value2) {
            addCriterion("vid_live not between", value1, value2, "vidLive");
            return (Criteria) this;
        }

        public Criteria andVidIspushIsNull() {
            addCriterion("vid_ispush is null");
            return (Criteria) this;
        }

        public Criteria andVidIspushIsNotNull() {
            addCriterion("vid_ispush is not null");
            return (Criteria) this;
        }

        public Criteria andVidIspushEqualTo(Integer value) {
            addCriterion("vid_ispush =", value, "vidIspush");
            return (Criteria) this;
        }

        public Criteria andVidIspushNotEqualTo(Integer value) {
            addCriterion("vid_ispush <>", value, "vidIspush");
            return (Criteria) this;
        }

        public Criteria andVidIspushGreaterThan(Integer value) {
            addCriterion("vid_ispush >", value, "vidIspush");
            return (Criteria) this;
        }

        public Criteria andVidIspushGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid_ispush >=", value, "vidIspush");
            return (Criteria) this;
        }

        public Criteria andVidIspushLessThan(Integer value) {
            addCriterion("vid_ispush <", value, "vidIspush");
            return (Criteria) this;
        }

        public Criteria andVidIspushLessThanOrEqualTo(Integer value) {
            addCriterion("vid_ispush <=", value, "vidIspush");
            return (Criteria) this;
        }

        public Criteria andVidIspushIn(List<Integer> values) {
            addCriterion("vid_ispush in", values, "vidIspush");
            return (Criteria) this;
        }

        public Criteria andVidIspushNotIn(List<Integer> values) {
            addCriterion("vid_ispush not in", values, "vidIspush");
            return (Criteria) this;
        }

        public Criteria andVidIspushBetween(Integer value1, Integer value2) {
            addCriterion("vid_ispush between", value1, value2, "vidIspush");
            return (Criteria) this;
        }

        public Criteria andVidIspushNotBetween(Integer value1, Integer value2) {
            addCriterion("vid_ispush not between", value1, value2, "vidIspush");
            return (Criteria) this;
        }

        public Criteria andVidCountIsNull() {
            addCriterion("vid_count is null");
            return (Criteria) this;
        }

        public Criteria andVidCountIsNotNull() {
            addCriterion("vid_count is not null");
            return (Criteria) this;
        }

        public Criteria andVidCountEqualTo(Integer value) {
            addCriterion("vid_count =", value, "vidCount");
            return (Criteria) this;
        }

        public Criteria andVidCountNotEqualTo(Integer value) {
            addCriterion("vid_count <>", value, "vidCount");
            return (Criteria) this;
        }

        public Criteria andVidCountGreaterThan(Integer value) {
            addCriterion("vid_count >", value, "vidCount");
            return (Criteria) this;
        }

        public Criteria andVidCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid_count >=", value, "vidCount");
            return (Criteria) this;
        }

        public Criteria andVidCountLessThan(Integer value) {
            addCriterion("vid_count <", value, "vidCount");
            return (Criteria) this;
        }

        public Criteria andVidCountLessThanOrEqualTo(Integer value) {
            addCriterion("vid_count <=", value, "vidCount");
            return (Criteria) this;
        }

        public Criteria andVidCountIn(List<Integer> values) {
            addCriterion("vid_count in", values, "vidCount");
            return (Criteria) this;
        }

        public Criteria andVidCountNotIn(List<Integer> values) {
            addCriterion("vid_count not in", values, "vidCount");
            return (Criteria) this;
        }

        public Criteria andVidCountBetween(Integer value1, Integer value2) {
            addCriterion("vid_count between", value1, value2, "vidCount");
            return (Criteria) this;
        }

        public Criteria andVidCountNotBetween(Integer value1, Integer value2) {
            addCriterion("vid_count not between", value1, value2, "vidCount");
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