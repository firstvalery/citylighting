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

import ru.smartsarov.citylighting.sprut.tables.UskSysEvent;


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
public class UskSysEventRecord extends UpdatableRecordImpl<UskSysEventRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -716686046;

    /**
     * Setter for <code>USK_SYS_EVENT.USKSE_ID</code>.
     */
    public void setUskseId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>USK_SYS_EVENT.USKSE_ID</code>.
     */
    public Integer getUskseId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>USK_SYS_EVENT.USKSE_EVENT</code>.
     */
    public void setUskseEvent(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>USK_SYS_EVENT.USKSE_EVENT</code>.
     */
    public String getUskseEvent() {
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
        return UskSysEvent.USK_SYS_EVENT.USKSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UskSysEvent.USK_SYS_EVENT.USKSE_EVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getUskseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getUskseEvent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUskseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUskseEvent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskSysEventRecord value1(Integer value) {
        setUskseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskSysEventRecord value2(String value) {
        setUskseEvent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskSysEventRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UskSysEventRecord
     */
    public UskSysEventRecord() {
        super(UskSysEvent.USK_SYS_EVENT);
    }

    /**
     * Create a detached, initialised UskSysEventRecord
     */
    public UskSysEventRecord(Integer uskseId, String uskseEvent) {
        super(UskSysEvent.USK_SYS_EVENT);

        set(0, uskseId);
        set(1, uskseEvent);
    }
}