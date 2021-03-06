/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.LightShift;


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
public class LightShiftRecord extends UpdatableRecordImpl<LightShiftRecord> implements Record7<Integer, Integer, Integer, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1057337984;

    /**
     * Setter for <code>LIGHT_SHIFT.LTSHT_ID</code>.
     */
    public void setLtshtId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>LIGHT_SHIFT.LTSHT_ID</code>.
     */
    public Integer getLtshtId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>LIGHT_SHIFT.LTSHT_USK_ID</code>.
     */
    public void setLtshtUskId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>LIGHT_SHIFT.LTSHT_USK_ID</code>.
     */
    public Integer getLtshtUskId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>LIGHT_SHIFT.LTSHT_TIME1</code>.
     */
    public void setLtshtTime1(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>LIGHT_SHIFT.LTSHT_TIME1</code>.
     */
    public Integer getLtshtTime1() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>LIGHT_SHIFT.LTSHT_TIME2</code>.
     */
    public void setLtshtTime2(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>LIGHT_SHIFT.LTSHT_TIME2</code>.
     */
    public Integer getLtshtTime2() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>LIGHT_SHIFT.LTSHT_TIME3</code>.
     */
    public void setLtshtTime3(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>LIGHT_SHIFT.LTSHT_TIME3</code>.
     */
    public Integer getLtshtTime3() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>LIGHT_SHIFT.LTSHT_TIME4</code>.
     */
    public void setLtshtTime4(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>LIGHT_SHIFT.LTSHT_TIME4</code>.
     */
    public Integer getLtshtTime4() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>LIGHT_SHIFT.LTSHT_SYNC</code>.
     */
    public void setLtshtSync(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>LIGHT_SHIFT.LTSHT_SYNC</code>.
     */
    public Integer getLtshtSync() {
        return (Integer) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return LightShift.LIGHT_SHIFT.LTSHT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return LightShift.LIGHT_SHIFT.LTSHT_USK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return LightShift.LIGHT_SHIFT.LTSHT_TIME1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return LightShift.LIGHT_SHIFT.LTSHT_TIME2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return LightShift.LIGHT_SHIFT.LTSHT_TIME3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return LightShift.LIGHT_SHIFT.LTSHT_TIME4;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return LightShift.LIGHT_SHIFT.LTSHT_SYNC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getLtshtId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getLtshtUskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getLtshtTime1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getLtshtTime2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getLtshtTime3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getLtshtTime4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getLtshtSync();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getLtshtId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getLtshtUskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getLtshtTime1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getLtshtTime2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getLtshtTime3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getLtshtTime4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getLtshtSync();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightShiftRecord value1(Integer value) {
        setLtshtId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightShiftRecord value2(Integer value) {
        setLtshtUskId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightShiftRecord value3(Integer value) {
        setLtshtTime1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightShiftRecord value4(Integer value) {
        setLtshtTime2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightShiftRecord value5(Integer value) {
        setLtshtTime3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightShiftRecord value6(Integer value) {
        setLtshtTime4(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightShiftRecord value7(Integer value) {
        setLtshtSync(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightShiftRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LightShiftRecord
     */
    public LightShiftRecord() {
        super(LightShift.LIGHT_SHIFT);
    }

    /**
     * Create a detached, initialised LightShiftRecord
     */
    public LightShiftRecord(Integer ltshtId, Integer ltshtUskId, Integer ltshtTime1, Integer ltshtTime2, Integer ltshtTime3, Integer ltshtTime4, Integer ltshtSync) {
        super(LightShift.LIGHT_SHIFT);

        set(0, ltshtId);
        set(1, ltshtUskId);
        set(2, ltshtTime1);
        set(3, ltshtTime2);
        set(4, ltshtTime3);
        set(5, ltshtTime4);
        set(6, ltshtSync);
    }
}
