package cn.qs.bean.tourism;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TicketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketExample() {
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

        public Criteria andTicketnameIsNull() {
            addCriterion("ticketname is null");
            return (Criteria) this;
        }

        public Criteria andTicketnameIsNotNull() {
            addCriterion("ticketname is not null");
            return (Criteria) this;
        }

        public Criteria andTicketnameEqualTo(String value) {
            addCriterion("ticketname =", value, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameNotEqualTo(String value) {
            addCriterion("ticketname <>", value, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameGreaterThan(String value) {
            addCriterion("ticketname >", value, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameGreaterThanOrEqualTo(String value) {
            addCriterion("ticketname >=", value, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameLessThan(String value) {
            addCriterion("ticketname <", value, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameLessThanOrEqualTo(String value) {
            addCriterion("ticketname <=", value, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameLike(String value) {
            addCriterion("ticketname like", value, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameNotLike(String value) {
            addCriterion("ticketname not like", value, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameIn(List<String> values) {
            addCriterion("ticketname in", values, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameNotIn(List<String> values) {
            addCriterion("ticketname not in", values, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameBetween(String value1, String value2) {
            addCriterion("ticketname between", value1, value2, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameNotBetween(String value1, String value2) {
            addCriterion("ticketname not between", value1, value2, "ticketname");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andTicketnumIsNull() {
            addCriterion("ticketnum is null");
            return (Criteria) this;
        }

        public Criteria andTicketnumIsNotNull() {
            addCriterion("ticketnum is not null");
            return (Criteria) this;
        }

        public Criteria andTicketnumEqualTo(Integer value) {
            addCriterion("ticketnum =", value, "ticketnum");
            return (Criteria) this;
        }

        public Criteria andTicketnumNotEqualTo(Integer value) {
            addCriterion("ticketnum <>", value, "ticketnum");
            return (Criteria) this;
        }

        public Criteria andTicketnumGreaterThan(Integer value) {
            addCriterion("ticketnum >", value, "ticketnum");
            return (Criteria) this;
        }

        public Criteria andTicketnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticketnum >=", value, "ticketnum");
            return (Criteria) this;
        }

        public Criteria andTicketnumLessThan(Integer value) {
            addCriterion("ticketnum <", value, "ticketnum");
            return (Criteria) this;
        }

        public Criteria andTicketnumLessThanOrEqualTo(Integer value) {
            addCriterion("ticketnum <=", value, "ticketnum");
            return (Criteria) this;
        }

        public Criteria andTicketnumIn(List<Integer> values) {
            addCriterion("ticketnum in", values, "ticketnum");
            return (Criteria) this;
        }

        public Criteria andTicketnumNotIn(List<Integer> values) {
            addCriterion("ticketnum not in", values, "ticketnum");
            return (Criteria) this;
        }

        public Criteria andTicketnumBetween(Integer value1, Integer value2) {
            addCriterion("ticketnum between", value1, value2, "ticketnum");
            return (Criteria) this;
        }

        public Criteria andTicketnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ticketnum not between", value1, value2, "ticketnum");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
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

        public Criteria andViewidIsNull() {
            addCriterion("viewID is null");
            return (Criteria) this;
        }

        public Criteria andViewidIsNotNull() {
            addCriterion("viewID is not null");
            return (Criteria) this;
        }

        public Criteria andViewidEqualTo(Integer value) {
            addCriterion("viewID =", value, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidNotEqualTo(Integer value) {
            addCriterion("viewID <>", value, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidGreaterThan(Integer value) {
            addCriterion("viewID >", value, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidGreaterThanOrEqualTo(Integer value) {
            addCriterion("viewID >=", value, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidLessThan(Integer value) {
            addCriterion("viewID <", value, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidLessThanOrEqualTo(Integer value) {
            addCriterion("viewID <=", value, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidIn(List<Integer> values) {
            addCriterion("viewID in", values, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidNotIn(List<Integer> values) {
            addCriterion("viewID not in", values, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidBetween(Integer value1, Integer value2) {
            addCriterion("viewID between", value1, value2, "viewid");
            return (Criteria) this;
        }

        public Criteria andViewidNotBetween(Integer value1, Integer value2) {
            addCriterion("viewID not between", value1, value2, "viewid");
            return (Criteria) this;
        }

        public Criteria andTicketblankIsNull() {
            addCriterion("ticketblank is null");
            return (Criteria) this;
        }

        public Criteria andTicketblankIsNotNull() {
            addCriterion("ticketblank is not null");
            return (Criteria) this;
        }

        public Criteria andTicketblankEqualTo(String value) {
            addCriterion("ticketblank =", value, "ticketblank");
            return (Criteria) this;
        }

        public Criteria andTicketblankNotEqualTo(String value) {
            addCriterion("ticketblank <>", value, "ticketblank");
            return (Criteria) this;
        }

        public Criteria andTicketblankGreaterThan(String value) {
            addCriterion("ticketblank >", value, "ticketblank");
            return (Criteria) this;
        }

        public Criteria andTicketblankGreaterThanOrEqualTo(String value) {
            addCriterion("ticketblank >=", value, "ticketblank");
            return (Criteria) this;
        }

        public Criteria andTicketblankLessThan(String value) {
            addCriterion("ticketblank <", value, "ticketblank");
            return (Criteria) this;
        }

        public Criteria andTicketblankLessThanOrEqualTo(String value) {
            addCriterion("ticketblank <=", value, "ticketblank");
            return (Criteria) this;
        }

        public Criteria andTicketblankLike(String value) {
            addCriterion("ticketblank like", value, "ticketblank");
            return (Criteria) this;
        }

        public Criteria andTicketblankNotLike(String value) {
            addCriterion("ticketblank not like", value, "ticketblank");
            return (Criteria) this;
        }

        public Criteria andTicketblankIn(List<String> values) {
            addCriterion("ticketblank in", values, "ticketblank");
            return (Criteria) this;
        }

        public Criteria andTicketblankNotIn(List<String> values) {
            addCriterion("ticketblank not in", values, "ticketblank");
            return (Criteria) this;
        }

        public Criteria andTicketblankBetween(String value1, String value2) {
            addCriterion("ticketblank between", value1, value2, "ticketblank");
            return (Criteria) this;
        }

        public Criteria andTicketblankNotBetween(String value1, String value2) {
            addCriterion("ticketblank not between", value1, value2, "ticketblank");
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