/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.CsdModemLocal;


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
public class CsdModemLocalRecord extends UpdatableRecordImpl<CsdModemLocalRecord> implements Record14<Integer, Integer, String, Integer, Integer, String, Float, Short, Short, Short, Short, Short, String, String> {

    private static final long serialVersionUID = -444318593;

    /**
     * Setter for <code>CSD_MODEM_LOCAL.MODEM_ID</code>.
     */
    public void setModemId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>CSD_MODEM_LOCAL.MODEM_ID</code>.
     */
    public Integer getModemId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>CSD_MODEM_LOCAL.MDM_TYPE_ID</code>.
     */
    public void setMdmTypeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>CSD_MODEM_LOCAL.MDM_TYPE_ID</code>.
     */
    public Integer getMdmTypeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>CSD_MODEM_LOCAL.COM_PORT</code>.
     */
    public void setComPort(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>CSD_MODEM_LOCAL.COM_PORT</code>.
     */
    public String getComPort() {
        return (String) get(2);
    }

    /**
     * Setter for <code>CSD_MODEM_LOCAL.COM_SPEED</code>.
     */
    public void setComSpeed(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>CSD_MODEM_LOCAL.COM_SPEED</code>.
     */
    public Integer getComSpeed() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>CSD_MODEM_LOCAL.COM_DATA_BITS</code>.
     */
    public void setComDataBits(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>CSD_MODEM_LOCAL.COM_DATA_BITS</code>.
     */
    public Integer getComDataBits() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>CSD_MODEM_LOCAL.COM_PARITY</code>.
     */
    public void setComParity(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>CSD_MODEM_LOCAL.COM_PARITY</code>.
     */
    public String getComParity() {
        return (String) get(5);
    }

    /**
     * Setter for <code>CSD_MODEM_LOCAL.COM_STOP_BITS</code>.
     */
    public void setComStopBits(Float value) {
        set(6, value);
    }

    /**
     * Getter for <code>CSD_MODEM_LOCAL.COM_STOP_BITS</code>.
     */
    public Float getComStopBits() {
        return (Float) get(6);
    }

    /**
     * Setter for <code>CSD_MODEM_LOCAL.AT_TIMEOUT</code>.
     */
    public void setAtTimeout(Short value) {
        set(7, value);
    }

    /**
     * Getter for <code>CSD_MODEM_LOCAL.AT_TIMEOUT</code>.
     */
    public Short getAtTimeout() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>CSD_MODEM_LOCAL.AT_MAX_RETRIES</code>.
     */
    public void setAtMaxRetries(Short value) {
        set(8, value);
    }

    /**
     * Getter for <code>CSD_MODEM_LOCAL.AT_MAX_RETRIES</code>.
     */
    public Short getAtMaxRetries() {
        return (Short) get(8);
    }

    /**
     * Setter for <code>CSD_MODEM_LOCAL.DIAL_TIMEOUT</code>.
     */
    public void setDialTimeout(Short value) {
        set(9, value);
    }

    /**
     * Getter for <code>CSD_MODEM_LOCAL.DIAL_TIMEOUT</code>.
     */
    public Short getDialTimeout() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>CSD_MODEM_LOCAL.LINE_HOLD_TIME</code>.
     */
    public void setLineHoldTime(Short value) {
        set(10, value);
    }

    /**
     * Getter for <code>CSD_MODEM_LOCAL.LINE_HOLD_TIME</code>.
     */
    public Short getLineHoldTime() {
        return (Short) get(10);
    }

    /**
     * Setter for <code>CSD_MODEM_LOCAL.ENABLED</code>.
     */
    public void setEnabled(Short value) {
        set(11, value);
    }

    /**
     * Getter for <code>CSD_MODEM_LOCAL.ENABLED</code>.
     */
    public Short getEnabled() {
        return (Short) get(11);
    }

    /**
     * Setter for <code>CSD_MODEM_LOCAL.PHONE</code>.
     */
    public void setPhone(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>CSD_MODEM_LOCAL.PHONE</code>.
     */
    public String getPhone() {
        return (String) get(12);
    }

    /**
     * Setter for <code>CSD_MODEM_LOCAL.DESCRIPTION</code>.
     */
    public void setDescription(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>CSD_MODEM_LOCAL.DESCRIPTION</code>.
     */
    public String getDescription() {
        return (String) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Integer, String, Integer, Integer, String, Float, Short, Short, Short, Short, Short, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Integer, String, Integer, Integer, String, Float, Short, Short, Short, Short, Short, String, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CsdModemLocal.CSD_MODEM_LOCAL.MODEM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CsdModemLocal.CSD_MODEM_LOCAL.MDM_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CsdModemLocal.CSD_MODEM_LOCAL.COM_PORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return CsdModemLocal.CSD_MODEM_LOCAL.COM_SPEED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return CsdModemLocal.CSD_MODEM_LOCAL.COM_DATA_BITS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CsdModemLocal.CSD_MODEM_LOCAL.COM_PARITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Float> field7() {
        return CsdModemLocal.CSD_MODEM_LOCAL.COM_STOP_BITS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field8() {
        return CsdModemLocal.CSD_MODEM_LOCAL.AT_TIMEOUT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field9() {
        return CsdModemLocal.CSD_MODEM_LOCAL.AT_MAX_RETRIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field10() {
        return CsdModemLocal.CSD_MODEM_LOCAL.DIAL_TIMEOUT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field11() {
        return CsdModemLocal.CSD_MODEM_LOCAL.LINE_HOLD_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field12() {
        return CsdModemLocal.CSD_MODEM_LOCAL.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return CsdModemLocal.CSD_MODEM_LOCAL.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return CsdModemLocal.CSD_MODEM_LOCAL.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getModemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getMdmTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getComPort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getComSpeed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getComDataBits();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getComParity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float component7() {
        return getComStopBits();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component8() {
        return getAtTimeout();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component9() {
        return getAtMaxRetries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component10() {
        return getDialTimeout();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component11() {
        return getLineHoldTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component12() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getModemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getMdmTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getComPort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getComSpeed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getComDataBits();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getComParity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float value7() {
        return getComStopBits();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value8() {
        return getAtTimeout();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value9() {
        return getAtMaxRetries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value10() {
        return getDialTimeout();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value11() {
        return getLineHoldTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value12() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemLocalRecord value1(Integer value) {
        setModemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemLocalRecord value2(Integer value) {
        setMdmTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemLocalRecord value3(String value) {
        setComPort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemLocalRecord value4(Integer value) {
        setComSpeed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemLocalRecord value5(Integer value) {
        setComDataBits(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemLocalRecord value6(String value) {
        setComParity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemLocalRecord value7(Float value) {
        setComStopBits(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemLocalRecord value8(Short value) {
        setAtTimeout(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemLocalRecord value9(Short value) {
        setAtMaxRetries(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemLocalRecord value10(Short value) {
        setDialTimeout(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemLocalRecord value11(Short value) {
        setLineHoldTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemLocalRecord value12(Short value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemLocalRecord value13(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemLocalRecord value14(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemLocalRecord values(Integer value1, Integer value2, String value3, Integer value4, Integer value5, String value6, Float value7, Short value8, Short value9, Short value10, Short value11, Short value12, String value13, String value14) {
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
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CsdModemLocalRecord
     */
    public CsdModemLocalRecord() {
        super(CsdModemLocal.CSD_MODEM_LOCAL);
    }

    /**
     * Create a detached, initialised CsdModemLocalRecord
     */
    public CsdModemLocalRecord(Integer modemId, Integer mdmTypeId, String comPort, Integer comSpeed, Integer comDataBits, String comParity, Float comStopBits, Short atTimeout, Short atMaxRetries, Short dialTimeout, Short lineHoldTime, Short enabled, String phone, String description) {
        super(CsdModemLocal.CSD_MODEM_LOCAL);

        set(0, modemId);
        set(1, mdmTypeId);
        set(2, comPort);
        set(3, comSpeed);
        set(4, comDataBits);
        set(5, comParity);
        set(6, comStopBits);
        set(7, atTimeout);
        set(8, atMaxRetries);
        set(9, dialTimeout);
        set(10, lineHoldTime);
        set(11, enabled);
        set(12, phone);
        set(13, description);
    }
}