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

import ru.smartsarov.citylighting.sprut.tables.GuardItype;


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
public class GuardItypeRecord extends UpdatableRecordImpl<GuardItypeRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -752808510;

    /**
     * Setter for <code>GUARD_ITYPE.GRDIT_ID</code>.
     */
    public void setGrditId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>GUARD_ITYPE.GRDIT_ID</code>.
     */
    public Integer getGrditId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>GUARD_ITYPE.GRDIT_NAME</code>.
     */
    public void setGrditName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>GUARD_ITYPE.GRDIT_NAME</code>.
     */
    public String getGrditName() {
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
        return GuardItype.GUARD_ITYPE.GRDIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GuardItype.GUARD_ITYPE.GRDIT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getGrditId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getGrditName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getGrditId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGrditName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardItypeRecord value1(Integer value) {
        setGrditId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardItypeRecord value2(String value) {
        setGrditName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardItypeRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GuardItypeRecord
     */
    public GuardItypeRecord() {
        super(GuardItype.GUARD_ITYPE);
    }

    /**
     * Create a detached, initialised GuardItypeRecord
     */
    public GuardItypeRecord(Integer grditId, String grditName) {
        super(GuardItype.GUARD_ITYPE);

        set(0, grditId);
        set(1, grditName);
    }
}