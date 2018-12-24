/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.GetProcedureField;


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
public class GetProcedureFieldRecord extends TableRecordImpl<GetProcedureFieldRecord> implements Record3<String, Integer, Integer> {

    private static final long serialVersionUID = 1895703365;

    /**
     * Setter for <code>GET_PROCEDURE_FIELD.FIELD</code>.
     */
    public void setField(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>GET_PROCEDURE_FIELD.FIELD</code>.
     */
    public String getField() {
        return (String) get(0);
    }

    /**
     * Setter for <code>GET_PROCEDURE_FIELD.F_TYPE</code>.
     */
    public void setFType(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>GET_PROCEDURE_FIELD.F_TYPE</code>.
     */
    public Integer getFType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>GET_PROCEDURE_FIELD.F_POSITION</code>.
     */
    public void setFPosition(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>GET_PROCEDURE_FIELD.F_POSITION</code>.
     */
    public Integer getFPosition() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return GetProcedureField.GET_PROCEDURE_FIELD.FIELD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return GetProcedureField.GET_PROCEDURE_FIELD.F_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return GetProcedureField.GET_PROCEDURE_FIELD.F_POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getField();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getFType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getFPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getField();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getFType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetProcedureFieldRecord value1(String value) {
        setField(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetProcedureFieldRecord value2(Integer value) {
        setFType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetProcedureFieldRecord value3(Integer value) {
        setFPosition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetProcedureFieldRecord values(String value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetProcedureFieldRecord
     */
    public GetProcedureFieldRecord() {
        super(GetProcedureField.GET_PROCEDURE_FIELD);
    }

    /**
     * Create a detached, initialised GetProcedureFieldRecord
     */
    public GetProcedureFieldRecord(String field, Integer fType, Integer fPosition) {
        super(GetProcedureField.GET_PROCEDURE_FIELD);

        set(0, field);
        set(1, fType);
        set(2, fPosition);
    }
}
