/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.ObjComment;


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
public class ObjCommentRecord extends UpdatableRecordImpl<ObjCommentRecord> implements Record4<Integer, Integer, String, String> {

    private static final long serialVersionUID = 984358601;

    /**
     * Setter for <code>OBJ_COMMENT.OBJ_ID</code>.
     */
    public void setObjId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>OBJ_COMMENT.OBJ_ID</code>.
     */
    public Integer getObjId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>OBJ_COMMENT.OBJ_TYPE</code>.
     */
    public void setObjType(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>OBJ_COMMENT.OBJ_TYPE</code>.
     */
    public Integer getObjType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>OBJ_COMMENT.OBJ_VAL</code>.
     */
    public void setObjVal(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>OBJ_COMMENT.OBJ_VAL</code>.
     */
    public String getObjVal() {
        return (String) get(2);
    }

    /**
     * Setter for <code>OBJ_COMMENT.OBJ_PARAM</code>.
     */
    public void setObjParam(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>OBJ_COMMENT.OBJ_PARAM</code>.
     */
    public String getObjParam() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<Integer, Integer, String> key() {
        return (Record3) super.key();
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
        return ObjComment.OBJ_COMMENT.OBJ_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ObjComment.OBJ_COMMENT.OBJ_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ObjComment.OBJ_COMMENT.OBJ_VAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ObjComment.OBJ_COMMENT.OBJ_PARAM;
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
    public Integer component2() {
        return getObjType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getObjVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getObjParam();
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
    public Integer value2() {
        return getObjType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getObjVal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getObjParam();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjCommentRecord value1(Integer value) {
        setObjId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjCommentRecord value2(Integer value) {
        setObjType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjCommentRecord value3(String value) {
        setObjVal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjCommentRecord value4(String value) {
        setObjParam(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjCommentRecord values(Integer value1, Integer value2, String value3, String value4) {
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
     * Create a detached ObjCommentRecord
     */
    public ObjCommentRecord() {
        super(ObjComment.OBJ_COMMENT);
    }

    /**
     * Create a detached, initialised ObjCommentRecord
     */
    public ObjCommentRecord(Integer objId, Integer objType, String objVal, String objParam) {
        super(ObjComment.OBJ_COMMENT);

        set(0, objId);
        set(1, objType);
        set(2, objVal);
        set(3, objParam);
    }
}