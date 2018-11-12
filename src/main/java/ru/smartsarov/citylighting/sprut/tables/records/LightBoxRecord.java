/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.LightBox;


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
public class LightBoxRecord extends UpdatableRecordImpl<LightBoxRecord> implements Record5<Integer, Integer, Integer, Integer, String> {

    private static final long serialVersionUID = 780213314;

    /**
     * Setter for <code>LIGHT_BOX.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>LIGHT_BOX.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>LIGHT_BOX.ZID</code>.
     */
    public void setZid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>LIGHT_BOX.ZID</code>.
     */
    public Integer getZid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>LIGHT_BOX.USK_ID</code>.
     */
    public void setUskId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>LIGHT_BOX.USK_ID</code>.
     */
    public Integer getUskId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>LIGHT_BOX.BOX_TYPE</code>.
     */
    public void setBoxType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>LIGHT_BOX.BOX_TYPE</code>.
     */
    public Integer getBoxType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>LIGHT_BOX.BOX_NAME</code>.
     */
    public void setBoxName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>LIGHT_BOX.BOX_NAME</code>.
     */
    public String getBoxName() {
        return (String) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Integer, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Integer, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return LightBox.LIGHT_BOX.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return LightBox.LIGHT_BOX.ZID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return LightBox.LIGHT_BOX.USK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return LightBox.LIGHT_BOX.BOX_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return LightBox.LIGHT_BOX.BOX_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getZid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getUskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getBoxType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getBoxName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getZid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getBoxType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBoxName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightBoxRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightBoxRecord value2(Integer value) {
        setZid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightBoxRecord value3(Integer value) {
        setUskId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightBoxRecord value4(Integer value) {
        setBoxType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightBoxRecord value5(String value) {
        setBoxName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightBoxRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LightBoxRecord
     */
    public LightBoxRecord() {
        super(LightBox.LIGHT_BOX);
    }

    /**
     * Create a detached, initialised LightBoxRecord
     */
    public LightBoxRecord(Integer id, Integer zid, Integer uskId, Integer boxType, String boxName) {
        super(LightBox.LIGHT_BOX);

        set(0, id);
        set(1, zid);
        set(2, uskId);
        set(3, boxType);
        set(4, boxName);
    }
}
