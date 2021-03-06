/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.GprsCurr;


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
public class GprsCurrRecord extends UpdatableRecordImpl<GprsCurrRecord> implements Record9<Integer, Timestamp, String, Float, Float, Integer, Short, Short, Short> {

    private static final long serialVersionUID = -744328574;

    /**
     * Setter for <code>GPRS_CURR.GPRS_USK_ID</code>.
     */
    public void setGprsUskId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>GPRS_CURR.GPRS_USK_ID</code>.
     */
    public Integer getGprsUskId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>GPRS_CURR.GPRS_CTIME</code>.
     */
    public void setGprsCtime(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>GPRS_CURR.GPRS_CTIME</code>.
     */
    public Timestamp getGprsCtime() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>GPRS_CURR.GPRS_IP</code>.
     */
    public void setGprsIp(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>GPRS_CURR.GPRS_IP</code>.
     */
    public String getGprsIp() {
        return (String) get(2);
    }

    /**
     * Setter for <code>GPRS_CURR.GPRS_VOLTAGE</code>.
     */
    public void setGprsVoltage(Float value) {
        set(3, value);
    }

    /**
     * Getter for <code>GPRS_CURR.GPRS_VOLTAGE</code>.
     */
    public Float getGprsVoltage() {
        return (Float) get(3);
    }

    /**
     * Setter for <code>GPRS_CURR.GPRS_TEMPER</code>.
     */
    public void setGprsTemper(Float value) {
        set(4, value);
    }

    /**
     * Getter for <code>GPRS_CURR.GPRS_TEMPER</code>.
     */
    public Float getGprsTemper() {
        return (Float) get(4);
    }

    /**
     * Setter for <code>GPRS_CURR.GPRS_UPTIME</code>.
     */
    public void setGprsUptime(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>GPRS_CURR.GPRS_UPTIME</code>.
     */
    public Integer getGprsUptime() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>GPRS_CURR.GPRS_SENSOR</code>.
     */
    public void setGprsSensor(Short value) {
        set(6, value);
    }

    /**
     * Getter for <code>GPRS_CURR.GPRS_SENSOR</code>.
     */
    public Short getGprsSensor() {
        return (Short) get(6);
    }

    /**
     * Setter for <code>GPRS_CURR.GPRS_SLEVEL</code>.
     */
    public void setGprsSlevel(Short value) {
        set(7, value);
    }

    /**
     * Getter for <code>GPRS_CURR.GPRS_SLEVEL</code>.
     */
    public Short getGprsSlevel() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>GPRS_CURR.GPRS_MSTAT</code>.
     */
    public void setGprsMstat(Short value) {
        set(8, value);
    }

    /**
     * Getter for <code>GPRS_CURR.GPRS_MSTAT</code>.
     */
    public Short getGprsMstat() {
        return (Short) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Timestamp, String, Float, Float, Integer, Short, Short, Short> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Timestamp, String, Float, Float, Integer, Short, Short, Short> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return GprsCurr.GPRS_CURR.GPRS_USK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return GprsCurr.GPRS_CURR.GPRS_CTIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GprsCurr.GPRS_CURR.GPRS_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Float> field4() {
        return GprsCurr.GPRS_CURR.GPRS_VOLTAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Float> field5() {
        return GprsCurr.GPRS_CURR.GPRS_TEMPER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return GprsCurr.GPRS_CURR.GPRS_UPTIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field7() {
        return GprsCurr.GPRS_CURR.GPRS_SENSOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field8() {
        return GprsCurr.GPRS_CURR.GPRS_SLEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field9() {
        return GprsCurr.GPRS_CURR.GPRS_MSTAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getGprsUskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getGprsCtime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getGprsIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float component4() {
        return getGprsVoltage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float component5() {
        return getGprsTemper();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getGprsUptime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component7() {
        return getGprsSensor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component8() {
        return getGprsSlevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component9() {
        return getGprsMstat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getGprsUskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getGprsCtime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGprsIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float value4() {
        return getGprsVoltage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float value5() {
        return getGprsTemper();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getGprsUptime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value7() {
        return getGprsSensor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value8() {
        return getGprsSlevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value9() {
        return getGprsMstat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GprsCurrRecord value1(Integer value) {
        setGprsUskId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GprsCurrRecord value2(Timestamp value) {
        setGprsCtime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GprsCurrRecord value3(String value) {
        setGprsIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GprsCurrRecord value4(Float value) {
        setGprsVoltage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GprsCurrRecord value5(Float value) {
        setGprsTemper(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GprsCurrRecord value6(Integer value) {
        setGprsUptime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GprsCurrRecord value7(Short value) {
        setGprsSensor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GprsCurrRecord value8(Short value) {
        setGprsSlevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GprsCurrRecord value9(Short value) {
        setGprsMstat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GprsCurrRecord values(Integer value1, Timestamp value2, String value3, Float value4, Float value5, Integer value6, Short value7, Short value8, Short value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GprsCurrRecord
     */
    public GprsCurrRecord() {
        super(GprsCurr.GPRS_CURR);
    }

    /**
     * Create a detached, initialised GprsCurrRecord
     */
    public GprsCurrRecord(Integer gprsUskId, Timestamp gprsCtime, String gprsIp, Float gprsVoltage, Float gprsTemper, Integer gprsUptime, Short gprsSensor, Short gprsSlevel, Short gprsMstat) {
        super(GprsCurr.GPRS_CURR);

        set(0, gprsUskId);
        set(1, gprsCtime);
        set(2, gprsIp);
        set(3, gprsVoltage);
        set(4, gprsTemper);
        set(5, gprsUptime);
        set(6, gprsSensor);
        set(7, gprsSlevel);
        set(8, gprsMstat);
    }
}
