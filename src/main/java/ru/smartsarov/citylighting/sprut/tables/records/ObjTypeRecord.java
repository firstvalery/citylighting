/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.ObjType;


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
public class ObjTypeRecord extends UpdatableRecordImpl<ObjTypeRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 445468100;

    /**
     * Setter for <code>OBJ_TYPE.OBJ_TYPE</code>.
     */
    public void setObjType(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>OBJ_TYPE.OBJ_TYPE</code>.
     */
    public Integer getObjType() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>OBJ_TYPE.OBJ_TYPE_NAME</code>.
     */
    public void setObjTypeName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>OBJ_TYPE.OBJ_TYPE_NAME</code>.
     */
    public String getObjTypeName() {
        return (String) get(1);
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
        return ObjType.OBJ_TYPE.OBJ_TYPE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ObjType.OBJ_TYPE.OBJ_TYPE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getObjType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getObjTypeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getObjType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getObjTypeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjTypeRecord value1(Integer value) {
        setObjType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjTypeRecord value2(String value) {
        setObjTypeName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjTypeRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ObjTypeRecord
     */
    public ObjTypeRecord() {
        super(ObjType.OBJ_TYPE);
    }

    /**
     * Create a detached, initialised ObjTypeRecord
     */
    public ObjTypeRecord(Integer objType, String objTypeName) {
        super(ObjType.OBJ_TYPE);

        set(0, objType);
        set(1, objTypeName);
    }
}