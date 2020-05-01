package com.kwbbin.bean;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andGoodIsNull() {
            addCriterion("good is null");
            return (Criteria) this;
        }

        public Criteria andGoodIsNotNull() {
            addCriterion("good is not null");
            return (Criteria) this;
        }

        public Criteria andGoodEqualTo(Integer value) {
            addCriterion("good =", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodNotEqualTo(Integer value) {
            addCriterion("good <>", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodGreaterThan(Integer value) {
            addCriterion("good >", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("good >=", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodLessThan(Integer value) {
            addCriterion("good <", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodLessThanOrEqualTo(Integer value) {
            addCriterion("good <=", value, "good");
            return (Criteria) this;
        }

        public Criteria andGoodIn(List<Integer> values) {
            addCriterion("good in", values, "good");
            return (Criteria) this;
        }

        public Criteria andGoodNotIn(List<Integer> values) {
            addCriterion("good not in", values, "good");
            return (Criteria) this;
        }

        public Criteria andGoodBetween(Integer value1, Integer value2) {
            addCriterion("good between", value1, value2, "good");
            return (Criteria) this;
        }

        public Criteria andGoodNotBetween(Integer value1, Integer value2) {
            addCriterion("good not between", value1, value2, "good");
            return (Criteria) this;
        }

        public Criteria andResponsetimeIsNull() {
            addCriterion("responseTime is null");
            return (Criteria) this;
        }

        public Criteria andResponsetimeIsNotNull() {
            addCriterion("responseTime is not null");
            return (Criteria) this;
        }

        public Criteria andResponsetimeEqualTo(Date value) {
            addCriterion("responseTime =", value, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeNotEqualTo(Date value) {
            addCriterion("responseTime <>", value, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeGreaterThan(Date value) {
            addCriterion("responseTime >", value, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("responseTime >=", value, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeLessThan(Date value) {
            addCriterion("responseTime <", value, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeLessThanOrEqualTo(Date value) {
            addCriterion("responseTime <=", value, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeIn(List<Date> values) {
            addCriterion("responseTime in", values, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeNotIn(List<Date> values) {
            addCriterion("responseTime not in", values, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeBetween(Date value1, Date value2) {
            addCriterion("responseTime between", value1, value2, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeNotBetween(Date value1, Date value2) {
            addCriterion("responseTime not between", value1, value2, "responsetime");
            return (Criteria) this;
        }

        public Criteria andAnswertouserIsNull() {
            addCriterion("answerToUser is null");
            return (Criteria) this;
        }

        public Criteria andAnswertouserIsNotNull() {
            addCriterion("answerToUser is not null");
            return (Criteria) this;
        }

        public Criteria andAnswertouserEqualTo(Integer value) {
            addCriterion("answerToUser =", value, "answertouser");
            return (Criteria) this;
        }

        public Criteria andAnswertouserNotEqualTo(Integer value) {
            addCriterion("answerToUser <>", value, "answertouser");
            return (Criteria) this;
        }

        public Criteria andAnswertouserGreaterThan(Integer value) {
            addCriterion("answerToUser >", value, "answertouser");
            return (Criteria) this;
        }

        public Criteria andAnswertouserGreaterThanOrEqualTo(Integer value) {
            addCriterion("answerToUser >=", value, "answertouser");
            return (Criteria) this;
        }

        public Criteria andAnswertouserLessThan(Integer value) {
            addCriterion("answerToUser <", value, "answertouser");
            return (Criteria) this;
        }

        public Criteria andAnswertouserLessThanOrEqualTo(Integer value) {
            addCriterion("answerToUser <=", value, "answertouser");
            return (Criteria) this;
        }

        public Criteria andAnswertouserIn(List<Integer> values) {
            addCriterion("answerToUser in", values, "answertouser");
            return (Criteria) this;
        }

        public Criteria andAnswertouserNotIn(List<Integer> values) {
            addCriterion("answerToUser not in", values, "answertouser");
            return (Criteria) this;
        }

        public Criteria andAnswertouserBetween(Integer value1, Integer value2) {
            addCriterion("answerToUser between", value1, value2, "answertouser");
            return (Criteria) this;
        }

        public Criteria andAnswertouserNotBetween(Integer value1, Integer value2) {
            addCriterion("answerToUser not between", value1, value2, "answertouser");
            return (Criteria) this;
        }

        public Criteria andAnswertomessageIsNull() {
            addCriterion("answerToMessage is null");
            return (Criteria) this;
        }

        public Criteria andAnswertomessageIsNotNull() {
            addCriterion("answerToMessage is not null");
            return (Criteria) this;
        }

        public Criteria andAnswertomessageEqualTo(Long value) {
            addCriterion("answerToMessage =", value, "answertomessage");
            return (Criteria) this;
        }

        public Criteria andAnswertomessageNotEqualTo(Long value) {
            addCriterion("answerToMessage <>", value, "answertomessage");
            return (Criteria) this;
        }

        public Criteria andAnswertomessageGreaterThan(Long value) {
            addCriterion("answerToMessage >", value, "answertomessage");
            return (Criteria) this;
        }

        public Criteria andAnswertomessageGreaterThanOrEqualTo(Long value) {
            addCriterion("answerToMessage >=", value, "answertomessage");
            return (Criteria) this;
        }

        public Criteria andAnswertomessageLessThan(Long value) {
            addCriterion("answerToMessage <", value, "answertomessage");
            return (Criteria) this;
        }

        public Criteria andAnswertomessageLessThanOrEqualTo(Long value) {
            addCriterion("answerToMessage <=", value, "answertomessage");
            return (Criteria) this;
        }

        public Criteria andAnswertomessageIn(List<Long> values) {
            addCriterion("answerToMessage in", values, "answertomessage");
            return (Criteria) this;
        }

        public Criteria andAnswertomessageNotIn(List<Long> values) {
            addCriterion("answerToMessage not in", values, "answertomessage");
            return (Criteria) this;
        }

        public Criteria andAnswertomessageBetween(Long value1, Long value2) {
            addCriterion("answerToMessage between", value1, value2, "answertomessage");
            return (Criteria) this;
        }

        public Criteria andAnswertomessageNotBetween(Long value1, Long value2) {
            addCriterion("answerToMessage not between", value1, value2, "answertomessage");
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