/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.AiisAbnInfo;


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
public class AiisAbnInfoRecord extends UpdatableRecordImpl<AiisAbnInfoRecord> implements Record5<Integer, Short, Integer, String, String> {

    private static final long serialVersionUID = -191961551;

    /**
     * Setter for <code>AIIS_ABN_INFO.ABN_ID</code>.
     */
    public void setAbnId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>AIIS_ABN_INFO.ABN_ID</code>.
     */
    public Integer getAbnId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>AIIS_ABN_INFO.ENABLED</code>.
     */
    public void setEnabled(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>AIIS_ABN_INFO.ENABLED</code>.
     */
    public Short getEnabled() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>AIIS_ABN_INFO.MSG_NUM</code>.
     */
    public void setMsgNum(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>AIIS_ABN_INFO.MSG_NUM</code>.
     */
    public Integer getMsgNum() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>AIIS_ABN_INFO.AIIS_CODE</code>.
     */
    public void setAiisCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>AIIS_ABN_INFO.AIIS_CODE</code>.
     */
    public String getAiisCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>AIIS_ABN_INFO.INN</code>.
     */
    public void setInn(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>AIIS_ABN_INFO.INN</code>.
     */
    public String getInn() {
        return (String) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Short, Integer, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Short, Integer, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AiisAbnInfo.AIIS_ABN_INFO.ABN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return AiisAbnInfo.AIIS_ABN_INFO.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return AiisAbnInfo.AIIS_ABN_INFO.MSG_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return AiisAbnInfo.AIIS_ABN_INFO.AIIS_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return AiisAbnInfo.AIIS_ABN_INFO.INN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getAbnId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component2() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getMsgNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAiisCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getInn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAbnId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getMsgNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAiisCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getInn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AiisAbnInfoRecord value1(Integer value) {
        setAbnId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AiisAbnInfoRecord value2(Short value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AiisAbnInfoRecord value3(Integer value) {
        setMsgNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AiisAbnInfoRecord value4(String value) {
        setAiisCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AiisAbnInfoRecord value5(String value) {
        setInn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AiisAbnInfoRecord values(Integer value1, Short value2, Integer value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AiisAbnInfoRecord
     */
    public AiisAbnInfoRecord() {
        super(AiisAbnInfo.AIIS_ABN_INFO);
    }

    /**
     * Create a detached, initialised AiisAbnInfoRecord
     */
    public AiisAbnInfoRecord(Integer abnId, Short enabled, Integer msgNum, String aiisCode, String inn) {
        super(AiisAbnInfo.AIIS_ABN_INFO);

        set(0, abnId);
        set(1, enabled);
        set(2, msgNum);
        set(3, aiisCode);
        set(4, inn);
    }
}