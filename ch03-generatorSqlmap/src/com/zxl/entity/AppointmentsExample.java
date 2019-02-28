package com.zxl.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppointmentsExample() {
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

        public Criteria andAppidIsNull() {
            addCriterion("appId is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("appId is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(Integer value) {
            addCriterion("appId =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(Integer value) {
            addCriterion("appId <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(Integer value) {
            addCriterion("appId >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(Integer value) {
            addCriterion("appId >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(Integer value) {
            addCriterion("appId <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(Integer value) {
            addCriterion("appId <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<Integer> values) {
            addCriterion("appId in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<Integer> values) {
            addCriterion("appId not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(Integer value1, Integer value2) {
            addCriterion("appId between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(Integer value1, Integer value2) {
            addCriterion("appId not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppmasterIsNull() {
            addCriterion("appMaster is null");
            return (Criteria) this;
        }

        public Criteria andAppmasterIsNotNull() {
            addCriterion("appMaster is not null");
            return (Criteria) this;
        }

        public Criteria andAppmasterEqualTo(String value) {
            addCriterion("appMaster =", value, "appmaster");
            return (Criteria) this;
        }

        public Criteria andAppmasterNotEqualTo(String value) {
            addCriterion("appMaster <>", value, "appmaster");
            return (Criteria) this;
        }

        public Criteria andAppmasterGreaterThan(String value) {
            addCriterion("appMaster >", value, "appmaster");
            return (Criteria) this;
        }

        public Criteria andAppmasterGreaterThanOrEqualTo(String value) {
            addCriterion("appMaster >=", value, "appmaster");
            return (Criteria) this;
        }

        public Criteria andAppmasterLessThan(String value) {
            addCriterion("appMaster <", value, "appmaster");
            return (Criteria) this;
        }

        public Criteria andAppmasterLessThanOrEqualTo(String value) {
            addCriterion("appMaster <=", value, "appmaster");
            return (Criteria) this;
        }

        public Criteria andAppmasterLike(String value) {
            addCriterion("appMaster like", value, "appmaster");
            return (Criteria) this;
        }

        public Criteria andAppmasterNotLike(String value) {
            addCriterion("appMaster not like", value, "appmaster");
            return (Criteria) this;
        }

        public Criteria andAppmasterIn(List<String> values) {
            addCriterion("appMaster in", values, "appmaster");
            return (Criteria) this;
        }

        public Criteria andAppmasterNotIn(List<String> values) {
            addCriterion("appMaster not in", values, "appmaster");
            return (Criteria) this;
        }

        public Criteria andAppmasterBetween(String value1, String value2) {
            addCriterion("appMaster between", value1, value2, "appmaster");
            return (Criteria) this;
        }

        public Criteria andAppmasterNotBetween(String value1, String value2) {
            addCriterion("appMaster not between", value1, value2, "appmaster");
            return (Criteria) this;
        }

        public Criteria andAppidcardIsNull() {
            addCriterion("appIdCard is null");
            return (Criteria) this;
        }

        public Criteria andAppidcardIsNotNull() {
            addCriterion("appIdCard is not null");
            return (Criteria) this;
        }

        public Criteria andAppidcardEqualTo(String value) {
            addCriterion("appIdCard =", value, "appidcard");
            return (Criteria) this;
        }

        public Criteria andAppidcardNotEqualTo(String value) {
            addCriterion("appIdCard <>", value, "appidcard");
            return (Criteria) this;
        }

        public Criteria andAppidcardGreaterThan(String value) {
            addCriterion("appIdCard >", value, "appidcard");
            return (Criteria) this;
        }

        public Criteria andAppidcardGreaterThanOrEqualTo(String value) {
            addCriterion("appIdCard >=", value, "appidcard");
            return (Criteria) this;
        }

        public Criteria andAppidcardLessThan(String value) {
            addCriterion("appIdCard <", value, "appidcard");
            return (Criteria) this;
        }

        public Criteria andAppidcardLessThanOrEqualTo(String value) {
            addCriterion("appIdCard <=", value, "appidcard");
            return (Criteria) this;
        }

        public Criteria andAppidcardLike(String value) {
            addCriterion("appIdCard like", value, "appidcard");
            return (Criteria) this;
        }

        public Criteria andAppidcardNotLike(String value) {
            addCriterion("appIdCard not like", value, "appidcard");
            return (Criteria) this;
        }

        public Criteria andAppidcardIn(List<String> values) {
            addCriterion("appIdCard in", values, "appidcard");
            return (Criteria) this;
        }

        public Criteria andAppidcardNotIn(List<String> values) {
            addCriterion("appIdCard not in", values, "appidcard");
            return (Criteria) this;
        }

        public Criteria andAppidcardBetween(String value1, String value2) {
            addCriterion("appIdCard between", value1, value2, "appidcard");
            return (Criteria) this;
        }

        public Criteria andAppidcardNotBetween(String value1, String value2) {
            addCriterion("appIdCard not between", value1, value2, "appidcard");
            return (Criteria) this;
        }

        public Criteria andAppphoneIsNull() {
            addCriterion("appPhone is null");
            return (Criteria) this;
        }

        public Criteria andAppphoneIsNotNull() {
            addCriterion("appPhone is not null");
            return (Criteria) this;
        }

        public Criteria andAppphoneEqualTo(String value) {
            addCriterion("appPhone =", value, "appphone");
            return (Criteria) this;
        }

        public Criteria andAppphoneNotEqualTo(String value) {
            addCriterion("appPhone <>", value, "appphone");
            return (Criteria) this;
        }

        public Criteria andAppphoneGreaterThan(String value) {
            addCriterion("appPhone >", value, "appphone");
            return (Criteria) this;
        }

        public Criteria andAppphoneGreaterThanOrEqualTo(String value) {
            addCriterion("appPhone >=", value, "appphone");
            return (Criteria) this;
        }

        public Criteria andAppphoneLessThan(String value) {
            addCriterion("appPhone <", value, "appphone");
            return (Criteria) this;
        }

        public Criteria andAppphoneLessThanOrEqualTo(String value) {
            addCriterion("appPhone <=", value, "appphone");
            return (Criteria) this;
        }

        public Criteria andAppphoneLike(String value) {
            addCriterion("appPhone like", value, "appphone");
            return (Criteria) this;
        }

        public Criteria andAppphoneNotLike(String value) {
            addCriterion("appPhone not like", value, "appphone");
            return (Criteria) this;
        }

        public Criteria andAppphoneIn(List<String> values) {
            addCriterion("appPhone in", values, "appphone");
            return (Criteria) this;
        }

        public Criteria andAppphoneNotIn(List<String> values) {
            addCriterion("appPhone not in", values, "appphone");
            return (Criteria) this;
        }

        public Criteria andAppphoneBetween(String value1, String value2) {
            addCriterion("appPhone between", value1, value2, "appphone");
            return (Criteria) this;
        }

        public Criteria andAppphoneNotBetween(String value1, String value2) {
            addCriterion("appPhone not between", value1, value2, "appphone");
            return (Criteria) this;
        }

        public Criteria andApppnameIsNull() {
            addCriterion("appPName is null");
            return (Criteria) this;
        }

        public Criteria andApppnameIsNotNull() {
            addCriterion("appPName is not null");
            return (Criteria) this;
        }

        public Criteria andApppnameEqualTo(String value) {
            addCriterion("appPName =", value, "apppname");
            return (Criteria) this;
        }

        public Criteria andApppnameNotEqualTo(String value) {
            addCriterion("appPName <>", value, "apppname");
            return (Criteria) this;
        }

        public Criteria andApppnameGreaterThan(String value) {
            addCriterion("appPName >", value, "apppname");
            return (Criteria) this;
        }

        public Criteria andApppnameGreaterThanOrEqualTo(String value) {
            addCriterion("appPName >=", value, "apppname");
            return (Criteria) this;
        }

        public Criteria andApppnameLessThan(String value) {
            addCriterion("appPName <", value, "apppname");
            return (Criteria) this;
        }

        public Criteria andApppnameLessThanOrEqualTo(String value) {
            addCriterion("appPName <=", value, "apppname");
            return (Criteria) this;
        }

        public Criteria andApppnameLike(String value) {
            addCriterion("appPName like", value, "apppname");
            return (Criteria) this;
        }

        public Criteria andApppnameNotLike(String value) {
            addCriterion("appPName not like", value, "apppname");
            return (Criteria) this;
        }

        public Criteria andApppnameIn(List<String> values) {
            addCriterion("appPName in", values, "apppname");
            return (Criteria) this;
        }

        public Criteria andApppnameNotIn(List<String> values) {
            addCriterion("appPName not in", values, "apppname");
            return (Criteria) this;
        }

        public Criteria andApppnameBetween(String value1, String value2) {
            addCriterion("appPName between", value1, value2, "apppname");
            return (Criteria) this;
        }

        public Criteria andApppnameNotBetween(String value1, String value2) {
            addCriterion("appPName not between", value1, value2, "apppname");
            return (Criteria) this;
        }

        public Criteria andApppsexIsNull() {
            addCriterion("appPSex is null");
            return (Criteria) this;
        }

        public Criteria andApppsexIsNotNull() {
            addCriterion("appPSex is not null");
            return (Criteria) this;
        }

        public Criteria andApppsexEqualTo(String value) {
            addCriterion("appPSex =", value, "apppsex");
            return (Criteria) this;
        }

        public Criteria andApppsexNotEqualTo(String value) {
            addCriterion("appPSex <>", value, "apppsex");
            return (Criteria) this;
        }

        public Criteria andApppsexGreaterThan(String value) {
            addCriterion("appPSex >", value, "apppsex");
            return (Criteria) this;
        }

        public Criteria andApppsexGreaterThanOrEqualTo(String value) {
            addCriterion("appPSex >=", value, "apppsex");
            return (Criteria) this;
        }

        public Criteria andApppsexLessThan(String value) {
            addCriterion("appPSex <", value, "apppsex");
            return (Criteria) this;
        }

        public Criteria andApppsexLessThanOrEqualTo(String value) {
            addCriterion("appPSex <=", value, "apppsex");
            return (Criteria) this;
        }

        public Criteria andApppsexLike(String value) {
            addCriterion("appPSex like", value, "apppsex");
            return (Criteria) this;
        }

        public Criteria andApppsexNotLike(String value) {
            addCriterion("appPSex not like", value, "apppsex");
            return (Criteria) this;
        }

        public Criteria andApppsexIn(List<String> values) {
            addCriterion("appPSex in", values, "apppsex");
            return (Criteria) this;
        }

        public Criteria andApppsexNotIn(List<String> values) {
            addCriterion("appPSex not in", values, "apppsex");
            return (Criteria) this;
        }

        public Criteria andApppsexBetween(String value1, String value2) {
            addCriterion("appPSex between", value1, value2, "apppsex");
            return (Criteria) this;
        }

        public Criteria andApppsexNotBetween(String value1, String value2) {
            addCriterion("appPSex not between", value1, value2, "apppsex");
            return (Criteria) this;
        }

        public Criteria andBreidIsNull() {
            addCriterion("breId is null");
            return (Criteria) this;
        }

        public Criteria andBreidIsNotNull() {
            addCriterion("breId is not null");
            return (Criteria) this;
        }

        public Criteria andBreidEqualTo(Integer value) {
            addCriterion("breId =", value, "breid");
            return (Criteria) this;
        }

        public Criteria andBreidNotEqualTo(Integer value) {
            addCriterion("breId <>", value, "breid");
            return (Criteria) this;
        }

        public Criteria andBreidGreaterThan(Integer value) {
            addCriterion("breId >", value, "breid");
            return (Criteria) this;
        }

        public Criteria andBreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("breId >=", value, "breid");
            return (Criteria) this;
        }

        public Criteria andBreidLessThan(Integer value) {
            addCriterion("breId <", value, "breid");
            return (Criteria) this;
        }

        public Criteria andBreidLessThanOrEqualTo(Integer value) {
            addCriterion("breId <=", value, "breid");
            return (Criteria) this;
        }

        public Criteria andBreidIn(List<Integer> values) {
            addCriterion("breId in", values, "breid");
            return (Criteria) this;
        }

        public Criteria andBreidNotIn(List<Integer> values) {
            addCriterion("breId not in", values, "breid");
            return (Criteria) this;
        }

        public Criteria andBreidBetween(Integer value1, Integer value2) {
            addCriterion("breId between", value1, value2, "breid");
            return (Criteria) this;
        }

        public Criteria andBreidNotBetween(Integer value1, Integer value2) {
            addCriterion("breId not between", value1, value2, "breid");
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

        public Criteria andDeptidIsNull() {
            addCriterion("deptId is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("deptId is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(Integer value) {
            addCriterion("deptId =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(Integer value) {
            addCriterion("deptId <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(Integer value) {
            addCriterion("deptId >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("deptId >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(Integer value) {
            addCriterion("deptId <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(Integer value) {
            addCriterion("deptId <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<Integer> values) {
            addCriterion("deptId in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<Integer> values) {
            addCriterion("deptId not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(Integer value1, Integer value2) {
            addCriterion("deptId between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("deptId not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andAppotimeIsNull() {
            addCriterion("appoTime is null");
            return (Criteria) this;
        }

        public Criteria andAppotimeIsNotNull() {
            addCriterion("appoTime is not null");
            return (Criteria) this;
        }

        public Criteria andAppotimeEqualTo(Date value) {
            addCriterion("appoTime =", value, "appotime");
            return (Criteria) this;
        }

        public Criteria andAppotimeNotEqualTo(Date value) {
            addCriterion("appoTime <>", value, "appotime");
            return (Criteria) this;
        }

        public Criteria andAppotimeGreaterThan(Date value) {
            addCriterion("appoTime >", value, "appotime");
            return (Criteria) this;
        }

        public Criteria andAppotimeGreaterThanOrEqualTo(Date value) {
            addCriterion("appoTime >=", value, "appotime");
            return (Criteria) this;
        }

        public Criteria andAppotimeLessThan(Date value) {
            addCriterion("appoTime <", value, "appotime");
            return (Criteria) this;
        }

        public Criteria andAppotimeLessThanOrEqualTo(Date value) {
            addCriterion("appoTime <=", value, "appotime");
            return (Criteria) this;
        }

        public Criteria andAppotimeIn(List<Date> values) {
            addCriterion("appoTime in", values, "appotime");
            return (Criteria) this;
        }

        public Criteria andAppotimeNotIn(List<Date> values) {
            addCriterion("appoTime not in", values, "appotime");
            return (Criteria) this;
        }

        public Criteria andAppotimeBetween(Date value1, Date value2) {
            addCriterion("appoTime between", value1, value2, "appotime");
            return (Criteria) this;
        }

        public Criteria andAppotimeNotBetween(Date value1, Date value2) {
            addCriterion("appoTime not between", value1, value2, "appotime");
            return (Criteria) this;
        }

        public Criteria andAppcreatetimeIsNull() {
            addCriterion("appCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andAppcreatetimeIsNotNull() {
            addCriterion("appCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andAppcreatetimeEqualTo(Date value) {
            addCriterion("appCreateTime =", value, "appcreatetime");
            return (Criteria) this;
        }

        public Criteria andAppcreatetimeNotEqualTo(Date value) {
            addCriterion("appCreateTime <>", value, "appcreatetime");
            return (Criteria) this;
        }

        public Criteria andAppcreatetimeGreaterThan(Date value) {
            addCriterion("appCreateTime >", value, "appcreatetime");
            return (Criteria) this;
        }

        public Criteria andAppcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("appCreateTime >=", value, "appcreatetime");
            return (Criteria) this;
        }

        public Criteria andAppcreatetimeLessThan(Date value) {
            addCriterion("appCreateTime <", value, "appcreatetime");
            return (Criteria) this;
        }

        public Criteria andAppcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("appCreateTime <=", value, "appcreatetime");
            return (Criteria) this;
        }

        public Criteria andAppcreatetimeIn(List<Date> values) {
            addCriterion("appCreateTime in", values, "appcreatetime");
            return (Criteria) this;
        }

        public Criteria andAppcreatetimeNotIn(List<Date> values) {
            addCriterion("appCreateTime not in", values, "appcreatetime");
            return (Criteria) this;
        }

        public Criteria andAppcreatetimeBetween(Date value1, Date value2) {
            addCriterion("appCreateTime between", value1, value2, "appcreatetime");
            return (Criteria) this;
        }

        public Criteria andAppcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("appCreateTime not between", value1, value2, "appcreatetime");
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