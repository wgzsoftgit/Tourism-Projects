package ly.base.po.domain;

import java.util.ArrayList;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andActIdIsNull() {
            addCriterion("act_id is null");
            return (Criteria) this;
        }

        public Criteria andActIdIsNotNull() {
            addCriterion("act_id is not null");
            return (Criteria) this;
        }

        public Criteria andActIdEqualTo(Integer value) {
            addCriterion("act_id =", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotEqualTo(Integer value) {
            addCriterion("act_id <>", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThan(Integer value) {
            addCriterion("act_id >", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_id >=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThan(Integer value) {
            addCriterion("act_id <", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThanOrEqualTo(Integer value) {
            addCriterion("act_id <=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdIn(List<Integer> values) {
            addCriterion("act_id in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotIn(List<Integer> values) {
            addCriterion("act_id not in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdBetween(Integer value1, Integer value2) {
            addCriterion("act_id between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotBetween(Integer value1, Integer value2) {
            addCriterion("act_id not between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andActTimeIsNull() {
            addCriterion("act_time is null");
            return (Criteria) this;
        }

        public Criteria andActTimeIsNotNull() {
            addCriterion("act_time is not null");
            return (Criteria) this;
        }

        public Criteria andActTimeEqualTo(String value) {
            addCriterion("act_time =", value, "actTime");
            return (Criteria) this;
        }

        public Criteria andActTimeNotEqualTo(String value) {
            addCriterion("act_time <>", value, "actTime");
            return (Criteria) this;
        }

        public Criteria andActTimeGreaterThan(String value) {
            addCriterion("act_time >", value, "actTime");
            return (Criteria) this;
        }

        public Criteria andActTimeGreaterThanOrEqualTo(String value) {
            addCriterion("act_time >=", value, "actTime");
            return (Criteria) this;
        }

        public Criteria andActTimeLessThan(String value) {
            addCriterion("act_time <", value, "actTime");
            return (Criteria) this;
        }

        public Criteria andActTimeLessThanOrEqualTo(String value) {
            addCriterion("act_time <=", value, "actTime");
            return (Criteria) this;
        }

        public Criteria andActTimeLike(String value) {
            addCriterion("act_time like", value, "actTime");
            return (Criteria) this;
        }

        public Criteria andActTimeNotLike(String value) {
            addCriterion("act_time not like", value, "actTime");
            return (Criteria) this;
        }

        public Criteria andActTimeIn(List<String> values) {
            addCriterion("act_time in", values, "actTime");
            return (Criteria) this;
        }

        public Criteria andActTimeNotIn(List<String> values) {
            addCriterion("act_time not in", values, "actTime");
            return (Criteria) this;
        }

        public Criteria andActTimeBetween(String value1, String value2) {
            addCriterion("act_time between", value1, value2, "actTime");
            return (Criteria) this;
        }

        public Criteria andActTimeNotBetween(String value1, String value2) {
            addCriterion("act_time not between", value1, value2, "actTime");
            return (Criteria) this;
        }

        public Criteria andActContentIsNull() {
            addCriterion("act_content is null");
            return (Criteria) this;
        }

        public Criteria andActContentIsNotNull() {
            addCriterion("act_content is not null");
            return (Criteria) this;
        }

        public Criteria andActContentEqualTo(String value) {
            addCriterion("act_content =", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentNotEqualTo(String value) {
            addCriterion("act_content <>", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentGreaterThan(String value) {
            addCriterion("act_content >", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentGreaterThanOrEqualTo(String value) {
            addCriterion("act_content >=", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentLessThan(String value) {
            addCriterion("act_content <", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentLessThanOrEqualTo(String value) {
            addCriterion("act_content <=", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentLike(String value) {
            addCriterion("act_content like", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentNotLike(String value) {
            addCriterion("act_content not like", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentIn(List<String> values) {
            addCriterion("act_content in", values, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentNotIn(List<String> values) {
            addCriterion("act_content not in", values, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentBetween(String value1, String value2) {
            addCriterion("act_content between", value1, value2, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentNotBetween(String value1, String value2) {
            addCriterion("act_content not between", value1, value2, "actContent");
            return (Criteria) this;
        }

        public Criteria andActIspushIsNull() {
            addCriterion("act_ispush is null");
            return (Criteria) this;
        }

        public Criteria andActIspushIsNotNull() {
            addCriterion("act_ispush is not null");
            return (Criteria) this;
        }

        public Criteria andActIspushEqualTo(Integer value) {
            addCriterion("act_ispush =", value, "actIspush");
            return (Criteria) this;
        }

        public Criteria andActIspushNotEqualTo(Integer value) {
            addCriterion("act_ispush <>", value, "actIspush");
            return (Criteria) this;
        }

        public Criteria andActIspushGreaterThan(Integer value) {
            addCriterion("act_ispush >", value, "actIspush");
            return (Criteria) this;
        }

        public Criteria andActIspushGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_ispush >=", value, "actIspush");
            return (Criteria) this;
        }

        public Criteria andActIspushLessThan(Integer value) {
            addCriterion("act_ispush <", value, "actIspush");
            return (Criteria) this;
        }

        public Criteria andActIspushLessThanOrEqualTo(Integer value) {
            addCriterion("act_ispush <=", value, "actIspush");
            return (Criteria) this;
        }

        public Criteria andActIspushIn(List<Integer> values) {
            addCriterion("act_ispush in", values, "actIspush");
            return (Criteria) this;
        }

        public Criteria andActIspushNotIn(List<Integer> values) {
            addCriterion("act_ispush not in", values, "actIspush");
            return (Criteria) this;
        }

        public Criteria andActIspushBetween(Integer value1, Integer value2) {
            addCriterion("act_ispush between", value1, value2, "actIspush");
            return (Criteria) this;
        }

        public Criteria andActIspushNotBetween(Integer value1, Integer value2) {
            addCriterion("act_ispush not between", value1, value2, "actIspush");
            return (Criteria) this;
        }

        public Criteria andActCountIsNull() {
            addCriterion("act_count is null");
            return (Criteria) this;
        }

        public Criteria andActCountIsNotNull() {
            addCriterion("act_count is not null");
            return (Criteria) this;
        }

        public Criteria andActCountEqualTo(Integer value) {
            addCriterion("act_count =", value, "actCount");
            return (Criteria) this;
        }

        public Criteria andActCountNotEqualTo(Integer value) {
            addCriterion("act_count <>", value, "actCount");
            return (Criteria) this;
        }

        public Criteria andActCountGreaterThan(Integer value) {
            addCriterion("act_count >", value, "actCount");
            return (Criteria) this;
        }

        public Criteria andActCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_count >=", value, "actCount");
            return (Criteria) this;
        }

        public Criteria andActCountLessThan(Integer value) {
            addCriterion("act_count <", value, "actCount");
            return (Criteria) this;
        }

        public Criteria andActCountLessThanOrEqualTo(Integer value) {
            addCriterion("act_count <=", value, "actCount");
            return (Criteria) this;
        }

        public Criteria andActCountIn(List<Integer> values) {
            addCriterion("act_count in", values, "actCount");
            return (Criteria) this;
        }

        public Criteria andActCountNotIn(List<Integer> values) {
            addCriterion("act_count not in", values, "actCount");
            return (Criteria) this;
        }

        public Criteria andActCountBetween(Integer value1, Integer value2) {
            addCriterion("act_count between", value1, value2, "actCount");
            return (Criteria) this;
        }

        public Criteria andActCountNotBetween(Integer value1, Integer value2) {
            addCriterion("act_count not between", value1, value2, "actCount");
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