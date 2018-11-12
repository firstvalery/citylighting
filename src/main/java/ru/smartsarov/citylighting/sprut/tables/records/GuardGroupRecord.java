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

import ru.smartsarov.citylighting.sprut.tables.GuardGroup;


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
public class GuardGroupRecord extends UpdatableRecordImpl<GuardGroupRecord> implements Record5<Integer, Integer, String, Integer, String> {

    private static final long serialVersionUID = 930621021;

    /**
     * Setter for <code>GUARD_GROUP.GRDG_ID</code>.
     */
    public void setGrdgId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>GUARD_GROUP.GRDG_ID</code>.
     */
    public Integer getGrdgId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>GUARD_GROUP.GRDG_ZID</code>.
     */
    public void setGrdgZid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>GUARD_GROUP.GRDG_ZID</code>.
     */
    public Integer getGrdgZid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>GUARD_GROUP.GRDG_NAME</code>.
     */
    public void setGrdgName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>GUARD_GROUP.GRDG_NAME</code>.
     */
    public String getGrdgName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>GUARD_GROUP.GRDG_ON</code>.
     */
    public void setGrdgOn(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>GUARD_GROUP.GRDG_ON</code>.
     */
    public Integer getGrdgOn() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>GUARD_GROUP.GRDG_REM</code>.
     */
    public void setGrdgRem(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>GUARD_GROUP.GRDG_REM</code>.
     */
    public String getGrdgRem() {
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
    public Row5<Integer, Integer, String, Integer, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Integer, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return GuardGroup.GUARD_GROUP.GRDG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return GuardGroup.GUARD_GROUP.GRDG_ZID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GuardGroup.GUARD_GROUP.GRDG_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return GuardGroup.GUARD_GROUP.GRDG_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return GuardGroup.GUARD_GROUP.GRDG_REM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getGrdgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getGrdgZid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getGrdgName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getGrdgOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getGrdgRem();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getGrdgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getGrdgZid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGrdgName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getGrdgOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getGrdgRem();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardGroupRecord value1(Integer value) {
        setGrdgId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardGroupRecord value2(Integer value) {
        setGrdgZid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardGroupRecord value3(String value) {
        setGrdgName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardGroupRecord value4(Integer value) {
        setGrdgOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardGroupRecord value5(String value) {
        setGrdgRem(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardGroupRecord values(Integer value1, Integer value2, String value3, Integer value4, String value5) {
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
     * Create a detached GuardGroupRecord
     */
    public GuardGroupRecord() {
        super(GuardGroup.GUARD_GROUP);
    }

    /**
     * Create a detached, initialised GuardGroupRecord
     */
    public GuardGroupRecord(Integer grdgId, Integer grdgZid, String grdgName, Integer grdgOn, String grdgRem) {
        super(GuardGroup.GUARD_GROUP);

        set(0, grdgId);
        set(1, grdgZid);
        set(2, grdgName);
        set(3, grdgOn);
        set(4, grdgRem);
    }
}