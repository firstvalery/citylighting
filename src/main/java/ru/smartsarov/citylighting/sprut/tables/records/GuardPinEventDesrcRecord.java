/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.GuardPinEventDesrc;


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
public class GuardPinEventDesrcRecord extends UpdatableRecordImpl<GuardPinEventDesrcRecord> implements Record4<Integer, Integer, String, String> {

    private static final long serialVersionUID = -1236766433;

    /**
     * Setter for <code>GUARD_PIN_EVENT_DESRC.EVENT_NUM</code>.
     */
    public void setEventNum(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>GUARD_PIN_EVENT_DESRC.EVENT_NUM</code>.
     */
    public Integer getEventNum() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>GUARD_PIN_EVENT_DESRC.ACTION_NUM</code>.
     */
    public void setActionNum(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>GUARD_PIN_EVENT_DESRC.ACTION_NUM</code>.
     */
    public Integer getActionNum() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>GUARD_PIN_EVENT_DESRC.NAME</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>GUARD_PIN_EVENT_DESRC.NAME</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>GUARD_PIN_EVENT_DESRC.STATE</code>.
     */
    public void setState(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>GUARD_PIN_EVENT_DESRC.STATE</code>.
     */
    public String getState() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return GuardPinEventDesrc.GUARD_PIN_EVENT_DESRC.EVENT_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return GuardPinEventDesrc.GUARD_PIN_EVENT_DESRC.ACTION_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GuardPinEventDesrc.GUARD_PIN_EVENT_DESRC.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return GuardPinEventDesrc.GUARD_PIN_EVENT_DESRC.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getEventNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getActionNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getEventNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getActionNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardPinEventDesrcRecord value1(Integer value) {
        setEventNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardPinEventDesrcRecord value2(Integer value) {
        setActionNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardPinEventDesrcRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardPinEventDesrcRecord value4(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardPinEventDesrcRecord values(Integer value1, Integer value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GuardPinEventDesrcRecord
     */
    public GuardPinEventDesrcRecord() {
        super(GuardPinEventDesrc.GUARD_PIN_EVENT_DESRC);
    }

    /**
     * Create a detached, initialised GuardPinEventDesrcRecord
     */
    public GuardPinEventDesrcRecord(Integer eventNum, Integer actionNum, String name, String state) {
        super(GuardPinEventDesrc.GUARD_PIN_EVENT_DESRC);

        set(0, eventNum);
        set(1, actionNum);
        set(2, name);
        set(3, state);
    }
}
