/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.GetControlState;


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
public class GetControlStateRecord extends TableRecordImpl<GetControlStateRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 168080250;

    /**
     * Setter for <code>GET_CONTROL_STATE.OBJ_ID</code>.
     */
    public void setObjId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>GET_CONTROL_STATE.OBJ_ID</code>.
     */
    public Integer getObjId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>GET_CONTROL_STATE.OBJ_ACTION_STATE</code>.
     */
    public void setObjActionState(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>GET_CONTROL_STATE.OBJ_ACTION_STATE</code>.
     */
    public String getObjActionState() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return GetControlState.GET_CONTROL_STATE.OBJ_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GetControlState.GET_CONTROL_STATE.OBJ_ACTION_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getObjId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getObjActionState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getObjId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getObjActionState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetControlStateRecord value1(Integer value) {
        setObjId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetControlStateRecord value2(String value) {
        setObjActionState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetControlStateRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetControlStateRecord
     */
    public GetControlStateRecord() {
        super(GetControlState.GET_CONTROL_STATE);
    }

    /**
     * Create a detached, initialised GetControlStateRecord
     */
    public GetControlStateRecord(Integer objId, String objActionState) {
        super(GetControlState.GET_CONTROL_STATE);

        set(0, objId);
        set(1, objActionState);
    }
}
