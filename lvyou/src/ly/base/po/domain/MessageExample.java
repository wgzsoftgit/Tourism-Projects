package ly.base.po.domain;

import java.util.ArrayList;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMesIdIsNull() {
            addCriterion("mes_id is null");
            return (Criteria) this;
        }

        public Criteria andMesIdIsNotNull() {
            addCriterion("mes_id is not null");
            return (Criteria) this;
        }

        public Criteria andMesIdEqualTo(Integer value) {
            addCriterion("mes_id =", value, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesIdNotEqualTo(Integer value) {
            addCriterion("mes_id <>", value, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesIdGreaterThan(Integer value) {
            addCriterion("mes_id >", value, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mes_id >=", value, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesIdLessThan(Integer value) {
            addCriterion("mes_id <", value, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesIdLessThanOrEqualTo(Integer value) {
            addCriterion("mes_id <=", value, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesIdIn(List<Integer> values) {
            addCriterion("mes_id in", values, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesIdNotIn(List<Integer> values) {
            addCriterion("mes_id not in", values, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesIdBetween(Integer value1, Integer value2) {
            addCriterion("mes_id between", value1, value2, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mes_id not between", value1, value2, "mesId");
            return (Criteria) this;
        }

        public Criteria andMesTitleIsNull() {
            addCriterion("mes_title is null");
            return (Criteria) this;
        }

        public Criteria andMesTitleIsNotNull() {
            addCriterion("mes_title is not null");
            return (Criteria) this;
        }

        public Criteria andMesTitleEqualTo(String value) {
            addCriterion("mes_title =", value, "mesTitle");
            return (Criteria) this;
        }

        public Criteria andMesTitleNotEqualTo(String value) {
            addCriterion("mes_title <>", value, "mesTitle");
            return (Criteria) this;
        }

        public Criteria andMesTitleGreaterThan(String value) {
            addCriterion("mes_title >", value, "mesTitle");
            return (Criteria) this;
        }

        public Criteria andMesTitleGreaterThanOrEqualTo(String value) {
            addCriterion("mes_title >=", value, "mesTitle");
            return (Criteria) this;
        }

        public Criteria andMesTitleLessThan(String value) {
            addCriterion("mes_title <", value, "mesTitle");
            return (Criteria) this;
        }

        public Criteria andMesTitleLessThanOrEqualTo(String value) {
            addCriterion("mes_title <=", value, "mesTitle");
            return (Criteria) this;
        }

        public Criteria andMesTitleLike(String value) {
            addCriterion("mes_title like", value, "mesTitle");
            return (Criteria) this;
        }

        public Criteria andMesTitleNotLike(String value) {
            addCriterion("mes_title not like", value, "mesTitle");
            return (Criteria) this;
        }

        public Criteria andMesTitleIn(List<String> values) {
            addCriterion("mes_title in", values, "mesTitle");
            return (Criteria) this;
        }

        public Criteria andMesTitleNotIn(List<String> values) {
            addCriterion("mes_title not in", values, "mesTitle");
            return (Criteria) this;
        }

        public Criteria andMesTitleBetween(String value1, String value2) {
            addCriterion("mes_title between", value1, value2, "mesTitle");
            return (Criteria) this;
        }

        public Criteria andMesTitleNotBetween(String value1, String value2) {
            addCriterion("mes_title not between", value1, value2, "mesTitle");
            return (Criteria) this;
        }

        public Criteria andMesContentIsNull() {
            addCriterion("mes_content is null");
            return (Criteria) this;
        }

        public Criteria andMesContentIsNotNull() {
            addCriterion("mes_content is not null");
            return (Criteria) this;
        }

        public Criteria andMesContentEqualTo(String value) {
            addCriterion("mes_content =", value, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentNotEqualTo(String value) {
            addCriterion("mes_content <>", value, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentGreaterThan(String value) {
            addCriterion("mes_content >", value, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentGreaterThanOrEqualTo(String value) {
            addCriterion("mes_content >=", value, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentLessThan(String value) {
            addCriterion("mes_content <", value, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentLessThanOrEqualTo(String value) {
            addCriterion("mes_content <=", value, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentLike(String value) {
            addCriterion("mes_content like", value, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentNotLike(String value) {
            addCriterion("mes_content not like", value, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentIn(List<String> values) {
            addCriterion("mes_content in", values, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentNotIn(List<String> values) {
            addCriterion("mes_content not in", values, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentBetween(String value1, String value2) {
            addCriterion("mes_content between", value1, value2, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesContentNotBetween(String value1, String value2) {
            addCriterion("mes_content not between", value1, value2, "mesContent");
            return (Criteria) this;
        }

        public Criteria andMesTimeIsNull() {
            addCriterion("mes_time is null");
            return (Criteria) this;
        }

        public Criteria andMesTimeIsNotNull() {
            addCriterion("mes_time is not null");
            return (Criteria) this;
        }

        public Criteria andMesTimeEqualTo(String value) {
            addCriterion("mes_time =", value, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeNotEqualTo(String value) {
            addCriterion("mes_time <>", value, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeGreaterThan(String value) {
            addCriterion("mes_time >", value, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeGreaterThanOrEqualTo(String value) {
            addCriterion("mes_time >=", value, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeLessThan(String value) {
            addCriterion("mes_time <", value, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeLessThanOrEqualTo(String value) {
            addCriterion("mes_time <=", value, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeLike(String value) {
            addCriterion("mes_time like", value, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeNotLike(String value) {
            addCriterion("mes_time not like", value, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeIn(List<String> values) {
            addCriterion("mes_time in", values, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeNotIn(List<String> values) {
            addCriterion("mes_time not in", values, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeBetween(String value1, String value2) {
            addCriterion("mes_time between", value1, value2, "mesTime");
            return (Criteria) this;
        }

        public Criteria andMesTimeNotBetween(String value1, String value2) {
            addCriterion("mes_time not between", value1, value2, "mesTime");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
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