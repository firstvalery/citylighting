/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.UnoStates;


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
public class UnoStatesRecord extends UpdatableRecordImpl<UnoStatesRecord> implements Record6<Integer, Timestamp, Timestamp, Integer, Integer, Integer> {

    private static final long serialVersionUID = 382785267;

    /**
     * Setter for <code>UNO_STATES.UC_USK_ID</code>.
     */
    public void setUcUskId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>UNO_STATES.UC_USK_ID</code>.
     */
    public Integer getUcUskId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>UNO_STATES.UC_LDATE</code>.
     */
    public void setUcLdate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>UNO_STATES.UC_LDATE</code>.
     */
    public Timestamp getUcLdate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>UNO_STATES.UC_SDATE</code>.
     */
    public void setUcSdate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>UNO_STATES.UC_SDATE</code>.
     */
    public Timestamp getUcSdate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>UNO_STATES.UC_EVENT</code>.
     */
    public void setUcEvent(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>UNO_STATES.UC_EVENT</code>.
     */
    public Integer getUcEvent() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>UNO_STATES.UC_ACTION</code>.
     */
    public void setUcAction(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>UNO_STATES.UC_ACTION</code>.
     */
    public Integer getUcAction() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>UNO_STATES.UC_ACTION_TYPE</code>.
     */
    public void setUcActionType(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>UNO_STATES.UC_ACTION_TYPE</code>.
     */
    public Integer getUcActionType() {
        return (Integer) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Timestamp, Timestamp, Integer, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Timestamp, Timestamp, Integer, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UnoStates.UNO_STATES.UC_USK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return UnoStates.UNO_STATES.UC_LDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return UnoStates.UNO_STATES.UC_SDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return UnoStates.UNO_STATES.UC_EVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return UnoStates.UNO_STATES.UC_ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return UnoStates.UNO_STATES.UC_ACTION_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getUcUskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getUcLdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getUcSdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getUcEvent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getUcAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getUcActionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUcUskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getUcLdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getUcSdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUcEvent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getUcAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getUcActionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UnoStatesRecord value1(Integer value) {
        setUcUskId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UnoStatesRecord value2(Timestamp value) {
        setUcLdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UnoStatesRecord value3(Timestamp value) {
        setUcSdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UnoStatesRecord value4(Integer value) {
        setUcEvent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UnoStatesRecord value5(Integer value) {
        setUcAction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UnoStatesRecord value6(Integer value) {
        setUcActionType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UnoStatesRecord values(Integer value1, Timestamp value2, Timestamp value3, Integer value4, Integer value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UnoStatesRecord
     */
    public UnoStatesRecord() {
        super(UnoStates.UNO_STATES);
    }

    /**
     * Create a detached, initialised UnoStatesRecord
     */
    public UnoStatesRecord(Integer ucUskId, Timestamp ucLdate, Timestamp ucSdate, Integer ucEvent, Integer ucAction, Integer ucActionType) {
        super(UnoStates.UNO_STATES);

        set(0, ucUskId);
        set(1, ucLdate);
        set(2, ucSdate);
        set(3, ucEvent);
        set(4, ucAction);
        set(5, ucActionType);
    }
}