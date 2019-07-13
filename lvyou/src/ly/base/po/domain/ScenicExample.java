package ly.base.po.domain;

import java.util.ArrayList;
import java.util.List;

public class ScenicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicExample() {
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

        public Criteria andSceIdIsNull() {
            addCriterion("sce_id is null");
            return (Criteria) this;
        }

        public Criteria andSceIdIsNotNull() {
            addCriterion("sce_id is not null");
            return (Criteria) this;
        }

        public Criteria andSceIdEqualTo(Integer value) {
            addCriterion("sce_id =", value, "sceId");
            return (Criteria) this;
        }

        public Criteria andSceIdNotEqualTo(Integer value) {
            addCriterion("sce_id <>", value, "sceId");
            return (Criteria) this;
        }

        public Criteria andSceIdGreaterThan(Integer value) {
            addCriterion("sce_id >", value, "sceId");
            return (Criteria) this;
        }

        public Criteria andSceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sce_id >=", value, "sceId");
            return (Criteria) this;
        }

        public Criteria andSceIdLessThan(Integer value) {
            addCriterion("sce_id <", value, "sceId");
            return (Criteria) this;
        }

        public Criteria andSceIdLessThanOrEqualTo(Integer value) {
            addCriterion("sce_id <=", value, "sceId");
            return (Criteria) this;
        }

        public Criteria andSceIdIn(List<Integer> values) {
            addCriterion("sce_id in", values, "sceId");
            return (Criteria) this;
        }

        public Criteria andSceIdNotIn(List<Integer> values) {
            addCriterion("sce_id not in", values, "sceId");
            return (Criteria) this;
        }

        public Criteria andSceIdBetween(Integer value1, Integer value2) {
            addCriterion("sce_id between", value1, value2, "sceId");
            return (Criteria) this;
        }

        public Criteria andSceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sce_id not between", value1, value2, "sceId");
            return (Criteria) this;
        }

        public Criteria andSceNameIsNull() {
            addCriterion("sce_name is null");
            return (Criteria) this;
        }

        public Criteria andSceNameIsNotNull() {
            addCriterion("sce_name is not null");
            return (Criteria) this;
        }

        public Criteria andSceNameEqualTo(String value) {
            addCriterion("sce_name =", value, "sceName");
            return (Criteria) this;
        }

        public Criteria andSceNameNotEqualTo(String value) {
            addCriterion("sce_name <>", value, "sceName");
            return (Criteria) this;
        }

        public Criteria andSceNameGreaterThan(String value) {
            addCriterion("sce_name >", value, "sceName");
            return (Criteria) this;
        }

        public Criteria andSceNameGreaterThanOrEqualTo(String value) {
            addCriterion("sce_name >=", value, "sceName");
            return (Criteria) this;
        }

        public Criteria andSceNameLessThan(String value) {
            addCriterion("sce_name <", value, "sceName");
            return (Criteria) this;
        }

        public Criteria andSceNameLessThanOrEqualTo(String value) {
            addCriterion("sce_name <=", value, "sceName");
            return (Criteria) this;
        }

        public Criteria andSceNameLike(String value) {
            addCriterion("sce_name like", value, "sceName");
            return (Criteria) this;
        }

        public Criteria andSceNameNotLike(String value) {
            addCriterion("sce_name not like", value, "sceName");
            return (Criteria) this;
        }

        public Criteria andSceNameIn(List<String> values) {
            addCriterion("sce_name in", values, "sceName");
            return (Criteria) this;
        }

        public Criteria andSceNameNotIn(List<String> values) {
            addCriterion("sce_name not in", values, "sceName");
            return (Criteria) this;
        }

        public Criteria andSceNameBetween(String value1, String value2) {
            addCriterion("sce_name between", value1, value2, "sceName");
            return (Criteria) this;
        }

        public Criteria andSceNameNotBetween(String value1, String value2) {
            addCriterion("sce_name not between", value1, value2, "sceName");
            return (Criteria) this;
        }

        public Criteria andScePictureIsNull() {
            addCriterion("sce_picture is null");
            return (Criteria) this;
        }

        public Criteria andScePictureIsNotNull() {
            addCriterion("sce_picture is not null");
            return (Criteria) this;
        }

        public Criteria andScePictureEqualTo(String value) {
            addCriterion("sce_picture =", value, "scePicture");
            return (Criteria) this;
        }

        public Criteria andScePictureNotEqualTo(String value) {
            addCriterion("sce_picture <>", value, "scePicture");
            return (Criteria) this;
        }

        public Criteria andScePictureGreaterThan(String value) {
            addCriterion("sce_picture >", value, "scePicture");
            return (Criteria) this;
        }

        public Criteria andScePictureGreaterThanOrEqualTo(String value) {
            addCriterion("sce_picture >=", value, "scePicture");
            return (Criteria) this;
        }

        public Criteria andScePictureLessThan(String value) {
            addCriterion("sce_picture <", value, "scePicture");
            return (Criteria) this;
        }

        public Criteria andScePictureLessThanOrEqualTo(String value) {
            addCriterion("sce_picture <=", value, "scePicture");
            return (Criteria) this;
        }

        public Criteria andScePictureLike(String value) {
            addCriterion("sce_picture like", value, "scePicture");
            return (Criteria) this;
        }

        public Criteria andScePictureNotLike(String value) {
            addCriterion("sce_picture not like", value, "scePicture");
            return (Criteria) this;
        }

        public Criteria andScePictureIn(List<String> values) {
            addCriterion("sce_picture in", values, "scePicture");
            return (Criteria) this;
        }

        public Criteria andScePictureNotIn(List<String> values) {
            addCriterion("sce_picture not in", values, "scePicture");
            return (Criteria) this;
        }

        public Criteria andScePictureBetween(String value1, String value2) {
            addCriterion("sce_picture between", value1, value2, "scePicture");
            return (Criteria) this;
        }

        public Criteria andScePictureNotBetween(String value1, String value2) {
            addCriterion("sce_picture not between", value1, value2, "scePicture");
            return (Criteria) this;
        }

        public Criteria andSceContentIsNull() {
            addCriterion("sce_content is null");
            return (Criteria) this;
        }

        public Criteria andSceContentIsNotNull() {
            addCriterion("sce_content is not null");
            return (Criteria) this;
        }

        public Criteria andSceContentEqualTo(String value) {
            addCriterion("sce_content =", value, "sceContent");
            return (Criteria) this;
        }

        public Criteria andSceContentNotEqualTo(String value) {
            addCriterion("sce_content <>", value, "sceContent");
            return (Criteria) this;
        }

        public Criteria andSceContentGreaterThan(String value) {
            addCriterion("sce_content >", value, "sceContent");
            return (Criteria) this;
        }

        public Criteria andSceContentGreaterThanOrEqualTo(String value) {
            addCriterion("sce_content >=", value, "sceContent");
            return (Criteria) this;
        }

        public Criteria andSceContentLessThan(String value) {
            addCriterion("sce_content <", value, "sceContent");
            return (Criteria) this;
        }

        public Criteria andSceContentLessThanOrEqualTo(String value) {
            addCriterion("sce_content <=", value, "sceContent");
            return (Criteria) this;
        }

        public Criteria andSceContentLike(String value) {
            addCriterion("sce_content like", value, "sceContent");
            return (Criteria) this;
        }

        public Criteria andSceContentNotLike(String value) {
            addCriterion("sce_content not like", value, "sceContent");
            return (Criteria) this;
        }

        public Criteria andSceContentIn(List<String> values) {
            addCriterion("sce_content in", values, "sceContent");
            return (Criteria) this;
        }

        public Criteria andSceContentNotIn(List<String> values) {
            addCriterion("sce_content not in", values, "sceContent");
            return (Criteria) this;
        }

        public Criteria andSceContentBetween(String value1, String value2) {
            addCriterion("sce_content between", value1, value2, "sceContent");
            return (Criteria) this;
        }

        public Criteria andSceContentNotBetween(String value1, String value2) {
            addCriterion("sce_content not between", value1, value2, "sceContent");
            return (Criteria) this;
        }

        public Criteria andScePriceIsNull() {
            addCriterion("sce_price is null");
            return (Criteria) this;
        }

        public Criteria andScePriceIsNotNull() {
            addCriterion("sce_price is not null");
            return (Criteria) this;
        }

        public Criteria andScePriceEqualTo(Float value) {
            addCriterion("sce_price =", value, "scePrice");
            return (Criteria) this;
        }

        public Criteria andScePriceNotEqualTo(Float value) {
            addCriterion("sce_price <>", value, "scePrice");
            return (Criteria) this;
        }

        public Criteria andScePriceGreaterThan(Float value) {
            addCriterion("sce_price >", value, "scePrice");
            return (Criteria) this;
        }

        public Criteria andScePriceGreaterThanOrEqualTo(Float value) {
            addCriterion("sce_price >=", value, "scePrice");
            return (Criteria) this;
        }

        public Criteria andScePriceLessThan(Float value) {
            addCriterion("sce_price <", value, "scePrice");
            return (Criteria) this;
        }

        public Criteria andScePriceLessThanOrEqualTo(Float value) {
            addCriterion("sce_price <=", value, "scePrice");
            return (Criteria) this;
        }

        public Criteria andScePriceIn(List<Float> values) {
            addCriterion("sce_price in", values, "scePrice");
            return (Criteria) this;
        }

        public Criteria andScePriceNotIn(List<Float> values) {
            addCriterion("sce_price not in", values, "scePrice");
            return (Criteria) this;
        }

        public Criteria andScePriceBetween(Float value1, Float value2) {
            addCriterion("sce_price between", value1, value2, "scePrice");
            return (Criteria) this;
        }

        public Criteria andScePriceNotBetween(Float value1, Float value2) {
            addCriterion("sce_price not between", value1, value2, "scePrice");
            return (Criteria) this;
        }

        public Criteria andSceVpriceIsNull() {
            addCriterion("sce_vprice is null");
            return (Criteria) this;
        }

        public Criteria andSceVpriceIsNotNull() {
            addCriterion("sce_vprice is not null");
            return (Criteria) this;
        }

        public Criteria andSceVpriceEqualTo(Float value) {
            addCriterion("sce_vprice =", value, "sceVprice");
            return (Criteria) this;
        }

        public Criteria andSceVpriceNotEqualTo(Float value) {
            addCriterion("sce_vprice <>", value, "sceVprice");
            return (Criteria) this;
        }

        public Criteria andSceVpriceGreaterThan(Float value) {
            addCriterion("sce_vprice >", value, "sceVprice");
            return (Criteria) this;
        }

        public Criteria andSceVpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("sce_vprice >=", value, "sceVprice");
            return (Criteria) this;
        }

        public Criteria andSceVpriceLessThan(Float value) {
            addCriterion("sce_vprice <", value, "sceVprice");
            return (Criteria) this;
        }

        public Criteria andSceVpriceLessThanOrEqualTo(Float value) {
            addCriterion("sce_vprice <=", value, "sceVprice");
            return (Criteria) this;
        }

        public Criteria andSceVpriceIn(List<Float> values) {
            addCriterion("sce_vprice in", values, "sceVprice");
            return (Criteria) this;
        }

        public Criteria andSceVpriceNotIn(List<Float> values) {
            addCriterion("sce_vprice not in", values, "sceVprice");
            return (Criteria) this;
        }

        public Criteria andSceVpriceBetween(Float value1, Float value2) {
            addCriterion("sce_vprice between", value1, value2, "sceVprice");
            return (Criteria) this;
        }

        public Criteria andSceVpriceNotBetween(Float value1, Float value2) {
            addCriterion("sce_vprice not between", value1, value2, "sceVprice");
            return (Criteria) this;
        }

        public Criteria andSceCountIsNull() {
            addCriterion("sce_count is null");
            return (Criteria) this;
        }

        public Criteria andSceCountIsNotNull() {
            addCriterion("sce_count is not null");
            return (Criteria) this;
        }

        public Criteria andSceCountEqualTo(Integer value) {
            addCriterion("sce_count =", value, "sceCount");
            return (Criteria) this;
        }

        public Criteria andSceCountNotEqualTo(Integer value) {
            addCriterion("sce_count <>", value, "sceCount");
            return (Criteria) this;
        }

        public Criteria andSceCountGreaterThan(Integer value) {
            addCriterion("sce_count >", value, "sceCount");
            return (Criteria) this;
        }

        public Criteria andSceCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sce_count >=", value, "sceCount");
            return (Criteria) this;
        }

        public Criteria andSceCountLessThan(Integer value) {
            addCriterion("sce_count <", value, "sceCount");
            return (Criteria) this;
        }

        public Criteria andSceCountLessThanOrEqualTo(Integer value) {
            addCriterion("sce_count <=", value, "sceCount");
            return (Criteria) this;
        }

        public Criteria andSceCountIn(List<Integer> values) {
            addCriterion("sce_count in", values, "sceCount");
            return (Criteria) this;
        }

        public Criteria andSceCountNotIn(List<Integer> values) {
            addCriterion("sce_count not in", values, "sceCount");
            return (Criteria) this;
        }

        public Criteria andSceCountBetween(Integer value1, Integer value2) {
            addCriterion("sce_count between", value1, value2, "sceCount");
            return (Criteria) this;
        }

        public Criteria andSceCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sce_count not between", value1, value2, "sceCount");
            return (Criteria) this;
        }

        public Criteria andSceIspushIsNull() {
            addCriterion("sce_ispush is null");
            return (Criteria) this;
        }

        public Criteria andSceIspushIsNotNull() {
            addCriterion("sce_ispush is not null");
            return (Criteria) this;
        }

        public Criteria andSceIspushEqualTo(Integer value) {
            addCriterion("sce_ispush =", value, "sceIspush");
            return (Criteria) this;
        }

        public Criteria andSceIspushNotEqualTo(Integer value) {
            addCriterion("sce_ispush <>", value, "sceIspush");
            return (Criteria) this;
        }

        public Criteria andSceIspushGreaterThan(Integer value) {
            addCriterion("sce_ispush >", value, "sceIspush");
            return (Criteria) this;
        }

        public Criteria andSceIspushGreaterThanOrEqualTo(Integer value) {
            addCriterion("sce_ispush >=", value, "sceIspush");
            return (Criteria) this;
        }

        public Criteria andSceIspushLessThan(Integer value) {
            addCriterion("sce_ispush <", value, "sceIspush");
            return (Criteria) this;
        }

        public Criteria andSceIspushLessThanOrEqualTo(Integer value) {
            addCriterion("sce_ispush <=", value, "sceIspush");
            return (Criteria) this;
        }

        public Criteria andSceIspushIn(List<Integer> values) {
            addCriterion("sce_ispush in", values, "sceIspush");
            return (Criteria) this;
        }

        public Criteria andSceIspushNotIn(List<Integer> values) {
            addCriterion("sce_ispush not in", values, "sceIspush");
            return (Criteria) this;
        }

        public Criteria andSceIspushBetween(Integer value1, Integer value2) {
            addCriterion("sce_ispush between", value1, value2, "sceIspush");
            return (Criteria) this;
        }

        public Criteria andSceIspushNotBetween(Integer value1, Integer value2) {
            addCriterion("sce_ispush not between", value1, value2, "sceIspush");
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