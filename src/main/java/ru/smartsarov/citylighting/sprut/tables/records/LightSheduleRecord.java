/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Time;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.LightShedule;


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
public class LightSheduleRecord extends UpdatableRecordImpl<LightSheduleRecord> implements Record8<Integer, Integer, Integer, Time, Time, Time, Time, Integer> {

    private static final long serialVersionUID = 740075592;

    /**
     * Setter for <code>LIGHT_SHEDULE.LTSHD_ID</code>.
     */
    public void setLtshdId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>LIGHT_SHEDULE.LTSHD_ID</code>.
     */
    public Integer getLtshdId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>LIGHT_SHEDULE.LTSHD_USK_ID</code>.
     */
    public void setLtshdUskId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>LIGHT_SHEDULE.LTSHD_USK_ID</code>.
     */
    public Integer getLtshdUskId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>LIGHT_SHEDULE.LTSHD_DOY</code>.
     */
    public void setLtshdDoy(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>LIGHT_SHEDULE.LTSHD_DOY</code>.
     */
    public Integer getLtshdDoy() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>LIGHT_SHEDULE.LTSHD_TIME1</code>.
     */
    public void setLtshdTime1(Time value) {
        set(3, value);
    }

    /**
     * Getter for <code>LIGHT_SHEDULE.LTSHD_TIME1</code>.
     */
    public Time getLtshdTime1() {
        return (Time) get(3);
    }

    /**
     * Setter for <code>LIGHT_SHEDULE.LTSHD_TIME2</code>.
     */
    public void setLtshdTime2(Time value) {
        set(4, value);
    }

    /**
     * Getter for <code>LIGHT_SHEDULE.LTSHD_TIME2</code>.
     */
    public Time getLtshdTime2() {
        return (Time) get(4);
    }

    /**
     * Setter for <code>LIGHT_SHEDULE.LTSHD_TIME3</code>.
     */
    public void setLtshdTime3(Time value) {
        set(5, value);
    }

    /**
     * Getter for <code>LIGHT_SHEDULE.LTSHD_TIME3</code>.
     */
    public Time getLtshdTime3() {
        return (Time) get(5);
    }

    /**
     * Setter for <code>LIGHT_SHEDULE.LTSHD_TIME4</code>.
     */
    public void setLtshdTime4(Time value) {
        set(6, value);
    }

    /**
     * Getter for <code>LIGHT_SHEDULE.LTSHD_TIME4</code>.
     */
    public Time getLtshdTime4() {
        return (Time) get(6);
    }

    /**
     * Setter for <code>LIGHT_SHEDULE.LTSHD_SYNC</code>.
     */
    public void setLtshdSync(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>LIGHT_SHEDULE.LTSHD_SYNC</code>.
     */
    public Integer getLtshdSync() {
        return (Integer) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Time, Time, Time, Time, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Time, Time, Time, Time, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return LightShedule.LIGHT_SHEDULE.LTSHD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return LightShedule.LIGHT_SHEDULE.LTSHD_USK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return LightShedule.LIGHT_SHEDULE.LTSHD_DOY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Time> field4() {
        return LightShedule.LIGHT_SHEDULE.LTSHD_TIME1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Time> field5() {
        return LightShedule.LIGHT_SHEDULE.LTSHD_TIME2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Time> field6() {
        return LightShedule.LIGHT_SHEDULE.LTSHD_TIME3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Time> field7() {
        return LightShedule.LIGHT_SHEDULE.LTSHD_TIME4;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return LightShedule.LIGHT_SHEDULE.LTSHD_SYNC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getLtshdId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getLtshdUskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getLtshdDoy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Time component4() {
        return getLtshdTime1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Time component5() {
        return getLtshdTime2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Time component6() {
        return getLtshdTime3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Time component7() {
        return getLtshdTime4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getLtshdSync();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getLtshdId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getLtshdUskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getLtshdDoy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Time value4() {
        return getLtshdTime1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Time value5() {
        return getLtshdTime2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Time value6() {
        return getLtshdTime3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Time value7() {
        return getLtshdTime4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getLtshdSync();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightSheduleRecord value1(Integer value) {
        setLtshdId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightSheduleRecord value2(Integer value) {
        setLtshdUskId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightSheduleRecord value3(Integer value) {
        setLtshdDoy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightSheduleRecord value4(Time value) {
        setLtshdTime1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightSheduleRecord value5(Time value) {
        setLtshdTime2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightSheduleRecord value6(Time value) {
        setLtshdTime3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightSheduleRecord value7(Time value) {
        setLtshdTime4(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightSheduleRecord value8(Integer value) {
        setLtshdSync(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightSheduleRecord values(Integer value1, Integer value2, Integer value3, Time value4, Time value5, Time value6, Time value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LightSheduleRecord
     */
    public LightSheduleRecord() {
        super(LightShedule.LIGHT_SHEDULE);
    }

    /**
     * Create a detached, initialised LightSheduleRecord
     */
    public LightSheduleRecord(Integer ltshdId, Integer ltshdUskId, Integer ltshdDoy, Time ltshdTime1, Time ltshdTime2, Time ltshdTime3, Time ltshdTime4, Integer ltshdSync) {
        super(LightShedule.LIGHT_SHEDULE);

        set(0, ltshdId);
        set(1, ltshdUskId);
        set(2, ltshdDoy);
        set(3, ltshdTime1);
        set(4, ltshdTime2);
        set(5, ltshdTime3);
        set(6, ltshdTime4);
        set(7, ltshdSync);
    }
}
