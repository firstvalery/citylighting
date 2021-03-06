/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.Rdb$checkConstraints;


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
public class Rdb$checkConstraintsRecord extends TableRecordImpl<Rdb$checkConstraintsRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -1623232867;

    /**
     * Setter for <code>RDB$CHECK_CONSTRAINTS.RDB$CONSTRAINT_NAME</code>.
     */
    public void setRdb$constraintName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>RDB$CHECK_CONSTRAINTS.RDB$CONSTRAINT_NAME</code>.
     */
    public String getRdb$constraintName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>RDB$CHECK_CONSTRAINTS.RDB$TRIGGER_NAME</code>.
     */
    public void setRdb$triggerName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>RDB$CHECK_CONSTRAINTS.RDB$TRIGGER_NAME</code>.
     */
    public String getRdb$triggerName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Rdb$checkConstraints.RDB$CHECK_CONSTRAINTS.RDB$CONSTRAINT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Rdb$checkConstraints.RDB$CHECK_CONSTRAINTS.RDB$TRIGGER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getRdb$constraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getRdb$triggerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getRdb$constraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRdb$triggerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$checkConstraintsRecord value1(String value) {
        setRdb$constraintName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$checkConstraintsRecord value2(String value) {
        setRdb$triggerName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$checkConstraintsRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Rdb$checkConstraintsRecord
     */
    public Rdb$checkConstraintsRecord() {
        super(Rdb$checkConstraints.RDB$CHECK_CONSTRAINTS);
    }

    /**
     * Create a detached, initialised Rdb$checkConstraintsRecord
     */
    public Rdb$checkConstraintsRecord(String rdb$constraintName, String rdb$triggerName) {
        super(Rdb$checkConstraints.RDB$CHECK_CONSTRAINTS);

        set(0, rdb$constraintName);
        set(1, rdb$triggerName);
    }
}
