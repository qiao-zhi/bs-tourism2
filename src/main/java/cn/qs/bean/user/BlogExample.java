package cn.qs.bean.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogExample() {
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

        public Criteria andBlogtitleIsNull() {
            addCriterion("blogtitle is null");
            return (Criteria) this;
        }

        public Criteria andBlogtitleIsNotNull() {
            addCriterion("blogtitle is not null");
            return (Criteria) this;
        }

        public Criteria andBlogtitleEqualTo(String value) {
            addCriterion("blogtitle =", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleNotEqualTo(String value) {
            addCriterion("blogtitle <>", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleGreaterThan(String value) {
            addCriterion("blogtitle >", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleGreaterThanOrEqualTo(String value) {
            addCriterion("blogtitle >=", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleLessThan(String value) {
            addCriterion("blogtitle <", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleLessThanOrEqualTo(String value) {
            addCriterion("blogtitle <=", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleLike(String value) {
            addCriterion("blogtitle like", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleNotLike(String value) {
            addCriterion("blogtitle not like", value, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleIn(List<String> values) {
            addCriterion("blogtitle in", values, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleNotIn(List<String> values) {
            addCriterion("blogtitle not in", values, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleBetween(String value1, String value2) {
            addCriterion("blogtitle between", value1, value2, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtitleNotBetween(String value1, String value2) {
            addCriterion("blogtitle not between", value1, value2, "blogtitle");
            return (Criteria) this;
        }

        public Criteria andBlogtypeIsNull() {
            addCriterion("blogtype is null");
            return (Criteria) this;
        }

        public Criteria andBlogtypeIsNotNull() {
            addCriterion("blogtype is not null");
            return (Criteria) this;
        }

        public Criteria andBlogtypeEqualTo(String value) {
            addCriterion("blogtype =", value, "blogtype");
            return (Criteria) this;
        }

        public Criteria andBlogtypeNotEqualTo(String value) {
            addCriterion("blogtype <>", value, "blogtype");
            return (Criteria) this;
        }

        public Criteria andBlogtypeGreaterThan(String value) {
            addCriterion("blogtype >", value, "blogtype");
            return (Criteria) this;
        }

        public Criteria andBlogtypeGreaterThanOrEqualTo(String value) {
            addCriterion("blogtype >=", value, "blogtype");
            return (Criteria) this;
        }

        public Criteria andBlogtypeLessThan(String value) {
            addCriterion("blogtype <", value, "blogtype");
            return (Criteria) this;
        }

        public Criteria andBlogtypeLessThanOrEqualTo(String value) {
            addCriterion("blogtype <=", value, "blogtype");
            return (Criteria) this;
        }

        public Criteria andBlogtypeLike(String value) {
            addCriterion("blogtype like", value, "blogtype");
            return (Criteria) this;
        }

        public Criteria andBlogtypeNotLike(String value) {
            addCriterion("blogtype not like", value, "blogtype");
            return (Criteria) this;
        }

        public Criteria andBlogtypeIn(List<String> values) {
            addCriterion("blogtype in", values, "blogtype");
            return (Criteria) this;
        }

        public Criteria andBlogtypeNotIn(List<String> values) {
            addCriterion("blogtype not in", values, "blogtype");
            return (Criteria) this;
        }

        public Criteria andBlogtypeBetween(String value1, String value2) {
            addCriterion("blogtype between", value1, value2, "blogtype");
            return (Criteria) this;
        }

        public Criteria andBlogtypeNotBetween(String value1, String value2) {
            addCriterion("blogtype not between", value1, value2, "blogtype");
            return (Criteria) this;
        }

        public Criteria andBlogstatusIsNull() {
            addCriterion("blogstatus is null");
            return (Criteria) this;
        }

        public Criteria andBlogstatusIsNotNull() {
            addCriterion("blogstatus is not null");
            return (Criteria) this;
        }

        public Criteria andBlogstatusEqualTo(String value) {
            addCriterion("blogstatus =", value, "blogstatus");
            return (Criteria) this;
        }

        public Criteria andBlogstatusNotEqualTo(String value) {
            addCriterion("blogstatus <>", value, "blogstatus");
            return (Criteria) this;
        }

        public Criteria andBlogstatusGreaterThan(String value) {
            addCriterion("blogstatus >", value, "blogstatus");
            return (Criteria) this;
        }

        public Criteria andBlogstatusGreaterThanOrEqualTo(String value) {
            addCriterion("blogstatus >=", value, "blogstatus");
            return (Criteria) this;
        }

        public Criteria andBlogstatusLessThan(String value) {
            addCriterion("blogstatus <", value, "blogstatus");
            return (Criteria) this;
        }

        public Criteria andBlogstatusLessThanOrEqualTo(String value) {
            addCriterion("blogstatus <=", value, "blogstatus");
            return (Criteria) this;
        }

        public Criteria andBlogstatusLike(String value) {
            addCriterion("blogstatus like", value, "blogstatus");
            return (Criteria) this;
        }

        public Criteria andBlogstatusNotLike(String value) {
            addCriterion("blogstatus not like", value, "blogstatus");
            return (Criteria) this;
        }

        public Criteria andBlogstatusIn(List<String> values) {
            addCriterion("blogstatus in", values, "blogstatus");
            return (Criteria) this;
        }

        public Criteria andBlogstatusNotIn(List<String> values) {
            addCriterion("blogstatus not in", values, "blogstatus");
            return (Criteria) this;
        }

        public Criteria andBlogstatusBetween(String value1, String value2) {
            addCriterion("blogstatus between", value1, value2, "blogstatus");
            return (Criteria) this;
        }

        public Criteria andBlogstatusNotBetween(String value1, String value2) {
            addCriterion("blogstatus not between", value1, value2, "blogstatus");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andBlogblankIsNull() {
            addCriterion("blogblank is null");
            return (Criteria) this;
        }

        public Criteria andBlogblankIsNotNull() {
            addCriterion("blogblank is not null");
            return (Criteria) this;
        }

        public Criteria andBlogblankEqualTo(String value) {
            addCriterion("blogblank =", value, "blogblank");
            return (Criteria) this;
        }

        public Criteria andBlogblankNotEqualTo(String value) {
            addCriterion("blogblank <>", value, "blogblank");
            return (Criteria) this;
        }

        public Criteria andBlogblankGreaterThan(String value) {
            addCriterion("blogblank >", value, "blogblank");
            return (Criteria) this;
        }

        public Criteria andBlogblankGreaterThanOrEqualTo(String value) {
            addCriterion("blogblank >=", value, "blogblank");
            return (Criteria) this;
        }

        public Criteria andBlogblankLessThan(String value) {
            addCriterion("blogblank <", value, "blogblank");
            return (Criteria) this;
        }

        public Criteria andBlogblankLessThanOrEqualTo(String value) {
            addCriterion("blogblank <=", value, "blogblank");
            return (Criteria) this;
        }

        public Criteria andBlogblankLike(String value) {
            addCriterion("blogblank like", value, "blogblank");
            return (Criteria) this;
        }

        public Criteria andBlogblankNotLike(String value) {
            addCriterion("blogblank not like", value, "blogblank");
            return (Criteria) this;
        }

        public Criteria andBlogblankIn(List<String> values) {
            addCriterion("blogblank in", values, "blogblank");
            return (Criteria) this;
        }

        public Criteria andBlogblankNotIn(List<String> values) {
            addCriterion("blogblank not in", values, "blogblank");
            return (Criteria) this;
        }

        public Criteria andBlogblankBetween(String value1, String value2) {
            addCriterion("blogblank between", value1, value2, "blogblank");
            return (Criteria) this;
        }

        public Criteria andBlogblankNotBetween(String value1, String value2) {
            addCriterion("blogblank not between", value1, value2, "blogblank");
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

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
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