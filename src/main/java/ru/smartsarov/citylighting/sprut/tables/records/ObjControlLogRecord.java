/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.ObjControlLog;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ObjControlLogRecord extends UpdatableRecordImpl<ObjControlLogRecord> implements Record12<Integer, Integer, Integer, Integer, Integer, Integer, Double, String, Integer, String, Timestamp, String> {

    private static final long serialVersionUID = 835103570;

    /**
     * Setter for <code>OBJ_CONTROL_LOG.GENERATOR_ID</code>.
     */
    public void setGeneratorId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>OBJ_CONTROL_LOG.GENERATOR_ID</code>.
     */
    public Integer getGeneratorId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>OBJ_CONTROL_LOG.OBJ_ID</code>.
     */
    public void setObjId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>OBJ_CONTROL_LOG.OBJ_ID</code>.
     */
    public Integer getObjId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>OBJ_CONTROL_LOG.OBJ_TYPE</code>.
     */
    public void setObjType(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>OBJ_CONTROL_LOG.OBJ_TYPE</code>.
     */
    public Integer getObjType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>OBJ_CONTROL_LOG.OBJ_ACTION</code>.
     */
    public void setObjAction(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>OBJ_CONTROL_LOG.OBJ_ACTION</code>.
     */
    public Integer getObjAction() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>OBJ_CONTROL_LOG.OBJ_ACTION_TYPE</code>.
     */
    public void setObjActionType(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>OBJ_CONTROL_LOG.OBJ_ACTION_TYPE</code>.
     */
    public Integer getObjActionType() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>OBJ_CONTROL_LOG.OBJ_PARAM_INT</code>.
     */
    public void setObjParamInt(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>OBJ_CONTROL_LOG.OBJ_PARAM_INT</code>.
     */
    public Integer getObjParamInt() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>OBJ_CONTROL_LOG.OBJ_PARAM_DOUBLE</code>.
     */
    public void setObjParamDouble(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>OBJ_CONTROL_LOG.OBJ_PARAM_DOUBLE</code>.
     */
    public Double getObjParamDouble() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>OBJ_CONTROL_LOG.OBJ_PARAM_STR</code>.
     */
    public void setObjParamStr(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>OBJ_CONTROL_LOG.OBJ_PARAM_STR</code>.
     */
    public String getObjParamStr() {
        return (String) get(7);
    }

    /**
     * Setter for <code>OBJ_CONTROL_LOG.OBJ_SYNC</code>.
     */
    public void setObjSync(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>OBJ_CONTROL_LOG.OBJ_SYNC</code>.
     */
    public Integer getObjSync() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>OBJ_CONTROL_LOG.OBJ_COMMENT_USER</code>.
     */
    public void setObjCommentUser(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>OBJ_CONTROL_LOG.OBJ_COMMENT_USER</code>.
     */
    public String getObjCommentUser() {
        return (String) get(9);
    }

    /**
     * Setter for <code>OBJ_CONTROL_LOG.OBJ_COMMENT_DATETIME</code>.
     */
    public void setObjCommentDatetime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>OBJ_CONTROL_LOG.OBJ_COMMENT_DATETIME</code>.
     */
    public Timestamp getObjCommentDatetime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>OBJ_CONTROL_LOG.OBJ_COMMENT_IP</code>.
     */
    public void setObjCommentIp(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>OBJ_CONTROL_LOG.OBJ_COMMENT_IP</code>.
     */
    public String getObjCommentIp() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, Integer, Integer, Integer, Integer, Double, String, Integer, String, Timestamp, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, Integer, Integer, Integer, Integer, Double, String, Integer, String, Timestamp, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ObjControlLog.OBJ_CONTROL_LOG.GENERATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ObjControlLog.OBJ_CONTROL_LOG.OBJ_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ObjControlLog.OBJ_CONTROL_LOG.OBJ_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ObjControlLog.OBJ_CONTROL_LOG.OBJ_ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ObjControlLog.OBJ_CONTROL_LOG.OBJ_ACTION_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ObjControlLog.OBJ_CONTROL_LOG.OBJ_PARAM_INT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return ObjControlLog.OBJ_CONTROL_LOG.OBJ_PARAM_DOUBLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ObjControlLog.OBJ_CONTROL_LOG.OBJ_PARAM_STR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return ObjControlLog.OBJ_CONTROL_LOG.OBJ_SYNC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ObjControlLog.OBJ_CONTROL_LOG.OBJ_COMMENT_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return ObjControlLog.OBJ_CONTROL_LOG.OBJ_COMMENT_DATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ObjControlLog.OBJ_CONTROL_LOG.OBJ_COMMENT_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getGeneratorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getObjId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getObjType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getObjAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getObjActionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getObjParamInt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component7() {
        return getObjParamDouble();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getObjParamStr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getObjSync();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getObjCommentUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getObjCommentDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getObjCommentIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getGeneratorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getObjId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getObjType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getObjAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getObjActionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getObjParamInt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getObjParamDouble();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getObjParamStr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getObjSync();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getObjCommentUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getObjCommentDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getObjCommentIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjControlLogRecord value1(Integer value) {
        setGeneratorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjControlLogRecord value2(Integer value) {
        setObjId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjControlLogRecord value3(Integer value) {
        setObjType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjControlLogRecord value4(Integer value) {
        setObjAction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjControlLogRecord value5(Integer value) {
        setObjActionType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjControlLogRecord value6(Integer value) {
        setObjParamInt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjControlLogRecord value7(Double value) {
        setObjParamDouble(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjControlLogRecord value8(String value) {
        setObjParamStr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjControlLogRecord value9(Integer value) {
        setObjSync(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjControlLogRecord value10(String value) {
        setObjCommentUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjControlLogRecord value11(Timestamp value) {
        setObjCommentDatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjControlLogRecord value12(String value) {
        setObjCommentIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjControlLogRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6, Double value7, String value8, Integer value9, String value10, Timestamp value11, String value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ObjControlLogRecord
     */
    public ObjControlLogRecord() {
        super(ObjControlLog.OBJ_CONTROL_LOG);
    }

    /**
     * Create a detached, initialised ObjControlLogRecord
     */
    public ObjControlLogRecord(Integer generatorId, Integer objId, Integer objType, Integer objAction, Integer objActionType, Integer objParamInt, Double objParamDouble, String objParamStr, Integer objSync, String objCommentUser, Timestamp objCommentDatetime, String objCommentIp) {
        super(ObjControlLog.OBJ_CONTROL_LOG);

        set(0, generatorId);
        set(1, objId);
        set(2, objType);
        set(3, objAction);
        set(4, objActionType);
        set(5, objParamInt);
        set(6, objParamDouble);
        set(7, objParamStr);
        set(8, objSync);
        set(9, objCommentUser);
        set(10, objCommentDatetime);
        set(11, objCommentIp);
    }
}
