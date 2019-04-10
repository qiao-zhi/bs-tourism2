package cn.qs.bean.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogpictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogpictureExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andOriginnameIsNull() {
            addCriterion("originname is null");
            return (Criteria) this;
        }

        public Criteria andOriginnameIsNotNull() {
            addCriterion("originname is not null");
            return (Criteria) this;
        }

        public Criteria andOriginnameEqualTo(String value) {
            addCriterion("originname =", value, "originname");
            return (Criteria) this;
        }

        public Criteria andOriginnameNotEqualTo(String value) {
            addCriterion("originname <>", value, "originname");
            return (Criteria) this;
        }

        public Criteria andOriginnameGreaterThan(String value) {
            addCriterion("originname >", value, "originname");
            return (Criteria) this;
        }

        public Criteria andOriginnameGreaterThanOrEqualTo(String value) {
            addCriterion("originname >=", value, "originname");
            return (Criteria) this;
        }

        public Criteria andOriginnameLessThan(String value) {
            addCriterion("originname <", value, "originname");
            return (Criteria) this;
        }

        public Criteria andOriginnameLessThanOrEqualTo(String value) {
            addCriterion("originname <=", value, "originname");
            return (Criteria) this;
        }

        public Criteria andOriginnameLike(String value) {
            addCriterion("originname like", value, "originname");
            return (Criteria) this;
        }

        public Criteria andOriginnameNotLike(String value) {
            addCriterion("originname not like", value, "originname");
            return (Criteria) this;
        }

        public Criteria andOriginnameIn(List<String> values) {
            addCriterion("originname in", values, "originname");
            return (Criteria) this;
        }

        public Criteria andOriginnameNotIn(List<String> values) {
            addCriterion("originname not in", values, "originname");
            return (Criteria) this;
        }

        public Criteria andOriginnameBetween(String value1, String value2) {
            addCriterion("originname between", value1, value2, "originname");
            return (Criteria) this;
        }

        public Criteria andOriginnameNotBetween(String value1, String value2) {
            addCriterion("originname not between", value1, value2, "originname");
            return (Criteria) this;
        }

        public Criteria andBlogpictureblankIsNull() {
            addCriterion("blogpictureblank is null");
            return (Criteria) this;
        }

        public Criteria andBlogpictureblankIsNotNull() {
            addCriterion("blogpictureblank is not null");
            return (Criteria) this;
        }

        public Criteria andBlogpictureblankEqualTo(String value) {
            addCriterion("blogpictureblank =", value, "blogpictureblank");
            return (Criteria) this;
        }

        public Criteria andBlogpictureblankNotEqualTo(String value) {
            addCriterion("blogpictureblank <>", value, "blogpictureblank");
            return (Criteria) this;
        }

        public Criteria andBlogpictureblankGreaterThan(String value) {
            addCriterion("blogpictureblank >", value, "blogpictureblank");
            return (Criteria) this;
        }

        public Criteria andBlogpictureblankGreaterThanOrEqualTo(String value) {
            addCriterion("blogpictureblank >=", value, "blogpictureblank");
            return (Criteria) this;
        }

        public Criteria andBlogpictureblankLessThan(String value) {
            addCriterion("blogpictureblank <", value, "blogpictureblank");
            return (Criteria) this;
        }

        public Criteria andBlogpictureblankLessThanOrEqualTo(String value) {
            addCriterion("blogpictureblank <=", value, "blogpictureblank");
            return (Criteria) this;
        }

        public Criteria andBlogpictureblankLike(String value) {
            addCriterion("blogpictureblank like", value, "blogpictureblank");
            return (Criteria) this;
        }

        public Criteria andBlogpictureblankNotLike(String value) {
            addCriterion("blogpictureblank not like", value, "blogpictureblank");
            return (Criteria) this;
        }

        public Criteria andBlogpictureblankIn(List<String> values) {
            addCriterion("blogpictureblank in", values, "blogpictureblank");
            return (Criteria) this;
        }

        public Criteria andBlogpictureblankNotIn(List<String> values) {
            addCriterion("blogpictureblank not in", values, "blogpictureblank");
            return (Criteria) this;
        }

        public Criteria andBlogpictureblankBetween(String value1, String value2) {
            addCriterion("blogpictureblank between", value1, value2, "blogpictureblank");
            return (Criteria) this;
        }

        public Criteria andBlogpictureblankNotBetween(String value1, String value2) {
            addCriterion("blogpictureblank not between", value1, value2, "blogpictureblank");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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