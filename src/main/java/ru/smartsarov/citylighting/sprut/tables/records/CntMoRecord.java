/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.CntMo;


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
public class CntMoRecord extends UpdatableRecordImpl<CntMoRecord> implements Record10<Integer, Integer, Integer, Short, Integer, String, Integer, Short, String, String> {

    private static final long serialVersionUID = -2058533676;

    /**
     * Setter for <code>CNT_MO.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>CNT_MO.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>CNT_MO.CNT_ID</code>.
     */
    public void setCntId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>CNT_MO.CNT_ID</code>.
     */
    public Integer getCntId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>CNT_MO.CNT_TS_NUM</code>.
     */
    public void setCntTsNum(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>CNT_MO.CNT_TS_NUM</code>.
     */
    public Integer getCntTsNum() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>CNT_MO.ENABLED</code>.
     */
    public void setEnabled(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>CNT_MO.ENABLED</code>.
     */
    public Short getEnabled() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>CNT_MO.CNT_MO_TYPE</code>.
     */
    public void setCntMoType(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>CNT_MO.CNT_MO_TYPE</code>.
     */
    public Integer getCntMoType() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>CNT_MO.CNT_MO_CODE</code>.
     */
    public void setCntMoCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>CNT_MO.CNT_MO_CODE</code>.
     */
    public String getCntMoCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>CNT_MO.CNT_MO_ALG_VERSION</code>.
     */
    public void setCntMoAlgVersion(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>CNT_MO.CNT_MO_ALG_VERSION</code>.
     */
    public Integer getCntMoAlgVersion() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>CNT_MO.BALANCE_ENABLED</code>.
     */
    public void setBalanceEnabled(Short value) {
        set(7, value);
    }

    /**
     * Getter for <code>CNT_MO.BALANCE_ENABLED</code>.
     */
    public Short getBalanceEnabled() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>CNT_MO.CNT_MO_CODE_FROM</code>.
     */
    public void setCntMoCodeFrom(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>CNT_MO.CNT_MO_CODE_FROM</code>.
     */
    public String getCntMoCodeFrom() {
        return (String) get(8);
    }

    /**
     * Setter for <code>CNT_MO.CNT_MO_CODE_TO</code>.
     */
    public void setCntMoCodeTo(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>CNT_MO.CNT_MO_CODE_TO</code>.
     */
    public String getCntMoCodeTo() {
        return (String) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, Integer, Short, Integer, String, Integer, Short, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, Integer, Short, Integer, String, Integer, Short, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CntMo.CNT_MO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CntMo.CNT_MO.CNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CntMo.CNT_MO.CNT_TS_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return CntMo.CNT_MO.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return CntMo.CNT_MO.CNT_MO_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CntMo.CNT_MO.CNT_MO_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return CntMo.CNT_MO.CNT_MO_ALG_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field8() {
        return CntMo.CNT_MO.BALANCE_ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return CntMo.CNT_MO.CNT_MO_CODE_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return CntMo.CNT_MO.CNT_MO_CODE_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCntId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCntTsNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getCntMoType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCntMoCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getCntMoAlgVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component8() {
        return getBalanceEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCntMoCodeFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getCntMoCodeTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCntId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCntTsNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCntMoType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCntMoCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getCntMoAlgVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value8() {
        return getBalanceEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCntMoCodeFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCntMoCodeTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMoRecord value2(Integer value) {
        setCntId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMoRecord value3(Integer value) {
        setCntTsNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMoRecord value4(Short value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMoRecord value5(Integer value) {
        setCntMoType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMoRecord value6(String value) {
        setCntMoCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMoRecord value7(Integer value) {
        setCntMoAlgVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMoRecord value8(Short value) {
        setBalanceEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMoRecord value9(String value) {
        setCntMoCodeFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMoRecord value10(String value) {
        setCntMoCodeTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMoRecord values(Integer value1, Integer value2, Integer value3, Short value4, Integer value5, String value6, Integer value7, Short value8, String value9, String value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CntMoRecord
     */
    public CntMoRecord() {
        super(CntMo.CNT_MO);
    }

    /**
     * Create a detached, initialised CntMoRecord
     */
    public CntMoRecord(Integer id, Integer cntId, Integer cntTsNum, Short enabled, Integer cntMoType, String cntMoCode, Integer cntMoAlgVersion, Short balanceEnabled, String cntMoCodeFrom, String cntMoCodeTo) {
        super(CntMo.CNT_MO);

        set(0, id);
        set(1, cntId);
        set(2, cntTsNum);
        set(3, enabled);
        set(4, cntMoType);
        set(5, cntMoCode);
        set(6, cntMoAlgVersion);
        set(7, balanceEnabled);
        set(8, cntMoCodeFrom);
        set(9, cntMoCodeTo);
    }
}
