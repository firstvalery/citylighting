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

import ru.smartsarov.citylighting.sprut.tables.UskLog;


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
public class UskLogRecord extends UpdatableRecordImpl<UskLogRecord> implements Record12<Integer, Integer, Timestamp, Integer, Double, Double, Integer, Integer, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 553618157;

    /**
     * Setter for <code>USK_LOG.USKL_ID</code>.
     */
    public void setUsklId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>USK_LOG.USKL_ID</code>.
     */
    public Integer getUsklId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>USK_LOG.USKL_USK_ID</code>.
     */
    public void setUsklUskId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>USK_LOG.USKL_USK_ID</code>.
     */
    public Integer getUsklUskId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>USK_LOG.USKL_STIME</code>.
     */
    public void setUsklStime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>USK_LOG.USKL_STIME</code>.
     */
    public Timestamp getUsklStime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>USK_LOG.USKL_STATE</code>.
     */
    public void setUsklState(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>USK_LOG.USKL_STATE</code>.
     */
    public Integer getUsklState() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>USK_LOG.USKL_V</code>.
     */
    public void setUsklV(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>USK_LOG.USKL_V</code>.
     */
    public Double getUsklV() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>USK_LOG.USKL_T</code>.
     */
    public void setUsklT(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>USK_LOG.USKL_T</code>.
     */
    public Double getUsklT() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>USK_LOG.USKL_VADC</code>.
     */
    public void setUsklVadc(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>USK_LOG.USKL_VADC</code>.
     */
    public Integer getUsklVadc() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>USK_LOG.USKL_TADC</code>.
     */
    public void setUsklTadc(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>USK_LOG.USKL_TADC</code>.
     */
    public Integer getUsklTadc() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>USK_LOG.USKL_UPTIME_SEC</code>.
     */
    public void setUsklUptimeSec(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>USK_LOG.USKL_UPTIME_SEC</code>.
     */
    public Integer getUsklUptimeSec() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>USK_LOG.USKL_SENSOR</code>.
     */
    public void setUsklSensor(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>USK_LOG.USKL_SENSOR</code>.
     */
    public Integer getUsklSensor() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>USK_LOG.USKL_SIGNAL_LEVEL</code>.
     */
    public void setUsklSignalLevel(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>USK_LOG.USKL_SIGNAL_LEVEL</code>.
     */
    public Integer getUsklSignalLevel() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>USK_LOG.USKL_MODEM_STAT</code>.
     */
    public void setUsklModemStat(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>USK_LOG.USKL_MODEM_STAT</code>.
     */
    public Integer getUsklModemStat() {
        return (Integer) get(11);
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
    public Row12<Integer, Integer, Timestamp, Integer, Double, Double, Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, Timestamp, Integer, Double, Double, Integer, Integer, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UskLog.USK_LOG.USKL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UskLog.USK_LOG.USKL_USK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return UskLog.USK_LOG.USKL_STIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return UskLog.USK_LOG.USKL_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return UskLog.USK_LOG.USKL_V;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return UskLog.USK_LOG.USKL_T;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return UskLog.USK_LOG.USKL_VADC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return UskLog.USK_LOG.USKL_TADC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return UskLog.USK_LOG.USKL_UPTIME_SEC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return UskLog.USK_LOG.USKL_SENSOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return UskLog.USK_LOG.USKL_SIGNAL_LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return UskLog.USK_LOG.USKL_MODEM_STAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getUsklId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getUsklUskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getUsklStime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getUsklState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component5() {
        return getUsklV();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component6() {
        return getUsklT();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getUsklVadc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getUsklTadc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getUsklUptimeSec();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getUsklSensor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getUsklSignalLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getUsklModemStat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUsklId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUsklUskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getUsklStime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUsklState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getUsklV();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getUsklT();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getUsklVadc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getUsklTadc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getUsklUptimeSec();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getUsklSensor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getUsklSignalLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getUsklModemStat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskLogRecord value1(Integer value) {
        setUsklId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskLogRecord value2(Integer value) {
        setUsklUskId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskLogRecord value3(Timestamp value) {
        setUsklStime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskLogRecord value4(Integer value) {
        setUsklState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskLogRecord value5(Double value) {
        setUsklV(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskLogRecord value6(Double value) {
        setUsklT(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskLogRecord value7(Integer value) {
        setUsklVadc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskLogRecord value8(Integer value) {
        setUsklTadc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskLogRecord value9(Integer value) {
        setUsklUptimeSec(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskLogRecord value10(Integer value) {
        setUsklSensor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskLogRecord value11(Integer value) {
        setUsklSignalLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskLogRecord value12(Integer value) {
        setUsklModemStat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskLogRecord values(Integer value1, Integer value2, Timestamp value3, Integer value4, Double value5, Double value6, Integer value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12) {
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
     * Create a detached UskLogRecord
     */
    public UskLogRecord() {
        super(UskLog.USK_LOG);
    }

    /**
     * Create a detached, initialised UskLogRecord
     */
    public UskLogRecord(Integer usklId, Integer usklUskId, Timestamp usklStime, Integer usklState, Double usklV, Double usklT, Integer usklVadc, Integer usklTadc, Integer usklUptimeSec, Integer usklSensor, Integer usklSignalLevel, Integer usklModemStat) {
        super(UskLog.USK_LOG);

        set(0, usklId);
        set(1, usklUskId);
        set(2, usklStime);
        set(3, usklState);
        set(4, usklV);
        set(5, usklT);
        set(6, usklVadc);
        set(7, usklTadc);
        set(8, usklUptimeSec);
        set(9, usklSensor);
        set(10, usklSignalLevel);
        set(11, usklModemStat);
    }
}