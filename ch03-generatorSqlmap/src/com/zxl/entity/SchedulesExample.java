package com.zxl.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SchedulesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchedulesExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andScidIsNull() {
            addCriterion("scId is null");
            return (Criteria) this;
        }

        public Criteria andScidIsNotNull() {
            addCriterion("scId is not null");
            return (Criteria) this;
        }

        public Criteria andScidEqualTo(Integer value) {
            addCriterion("scId =", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotEqualTo(Integer value) {
            addCriterion("scId <>", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidGreaterThan(Integer value) {
            addCriterion("scId >", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidGreaterThanOrEqualTo(Integer value) {
            addCriterion("scId >=", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidLessThan(Integer value) {
            addCriterion("scId <", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidLessThanOrEqualTo(Integer value) {
            addCriterion("scId <=", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidIn(List<Integer> values) {
            addCriterion("scId in", values, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotIn(List<Integer> values) {
            addCriterion("scId not in", values, "scid");
            return (Criteria) this;
        }

        public Criteria andScidBetween(Integer value1, Integer value2) {
            addCriterion("scId between", value1, value2, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotBetween(Integer value1, Integer value2) {
            addCriterion("scId not between", value1, value2, "scid");
            return (Criteria) this;
        }

        public Criteria andDocidIsNull() {
            addCriterion("docId is null");
            return (Criteria) this;
        }

        public Criteria andDocidIsNotNull() {
            addCriterion("docId is not null");
            return (Criteria) this;
        }

        public Criteria andDocidEqualTo(Integer value) {
            addCriterion("docId =", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotEqualTo(Integer value) {
            addCriterion("docId <>", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidGreaterThan(Integer value) {
            addCriterion("docId >", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidGreaterThanOrEqualTo(Integer value) {
            addCriterion("docId >=", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidLessThan(Integer value) {
            addCriterion("docId <", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidLessThanOrEqualTo(Integer value) {
            addCriterion("docId <=", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidIn(List<Integer> values) {
            addCriterion("docId in", values, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotIn(List<Integer> values) {
            addCriterion("docId not in", values, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidBetween(Integer value1, Integer value2) {
            addCriterion("docId between", value1, value2, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotBetween(Integer value1, Integer value2) {
            addCriterion("docId not between", value1, value2, "docid");
            return (Criteria) this;
        }

        public Criteria andScstartIsNull() {
            addCriterion("scStart is null");
            return (Criteria) this;
        }

        public Criteria andScstartIsNotNull() {
            addCriterion("scStart is not null");
            return (Criteria) this;
        }

        public Criteria andScstartEqualTo(Date value) {
            addCriterionForJDBCTime("scStart =", value, "scstart");
            return (Criteria) this;
        }

        public Criteria andScstartNotEqualTo(Date value) {
            addCriterionForJDBCTime("scStart <>", value, "scstart");
            return (Criteria) this;
        }

        public Criteria andScstartGreaterThan(Date value) {
            addCriterionForJDBCTime("scStart >", value, "scstart");
            return (Criteria) this;
        }

        public Criteria andScstartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("scStart >=", value, "scstart");
            return (Criteria) this;
        }

        public Criteria andScstartLessThan(Date value) {
            addCriterionForJDBCTime("scStart <", value, "scstart");
            return (Criteria) this;
        }

        public Criteria andScstartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("scStart <=", value, "scstart");
            return (Criteria) this;
        }

        public Criteria andScstartIn(List<Date> values) {
            addCriterionForJDBCTime("scStart in", values, "scstart");
            return (Criteria) this;
        }

        public Criteria andScstartNotIn(List<Date> values) {
            addCriterionForJDBCTime("scStart not in", values, "scstart");
            return (Criteria) this;
        }

        public Criteria andScstartBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("scStart between", value1, value2, "scstart");
            return (Criteria) this;
        }

        public Criteria andScstartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("scStart not between", value1, value2, "scstart");
            return (Criteria) this;
        }

        public Criteria andScstopIsNull() {
            addCriterion("scStop is null");
            return (Criteria) this;
        }

        public Criteria andScstopIsNotNull() {
            addCriterion("scStop is not null");
            return (Criteria) this;
        }

        public Criteria andScstopEqualTo(Date value) {
            addCriterionForJDBCTime("scStop =", value, "scstop");
            return (Criteria) this;
        }

        public Criteria andScstopNotEqualTo(Date value) {
            addCriterionForJDBCTime("scStop <>", value, "scstop");
            return (Criteria) this;
        }

        public Criteria andScstopGreaterThan(Date value) {
            addCriterionForJDBCTime("scStop >", value, "scstop");
            return (Criteria) this;
        }

        public Criteria andScstopGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("scStop >=", value, "scstop");
            return (Criteria) this;
        }

        public Criteria andScstopLessThan(Date value) {
            addCriterionForJDBCTime("scStop <", value, "scstop");
            return (Criteria) this;
        }

        public Criteria andScstopLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("scStop <=", value, "scstop");
            return (Criteria) this;
        }

        public Criteria andScstopIn(List<Date> values) {
            addCriterionForJDBCTime("scStop in", values, "scstop");
            return (Criteria) this;
        }

        public Criteria andScstopNotIn(List<Date> values) {
            addCriterionForJDBCTime("scStop not in", values, "scstop");
            return (Criteria) this;
        }

        public Criteria andScstopBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("scStop between", value1, value2, "scstop");
            return (Criteria) this;
        }

        public Criteria andScstopNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("scStop not between", value1, value2, "scstop");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cId is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cId is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cId =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cId <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cId >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cId >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cId <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cId <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cId in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cId not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cId between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cId not between", value1, value2, "cid");
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