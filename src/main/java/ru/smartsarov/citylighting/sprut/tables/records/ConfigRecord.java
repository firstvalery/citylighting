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

import ru.smartsarov.citylighting.sprut.tables.Config;


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
public class ConfigRecord extends UpdatableRecordImpl<ConfigRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 323528893;

    /**
     * Setter for <code>CONFIG.CNFG_NAME</code>.
     */
    public void setCnfgName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>CONFIG.CNFG_NAME</code>.
     */
    public String getCnfgName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>CONFIG.CNFG_VALUE</code>.
     */
    public void setCnfgValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>CONFIG.CNFG_VALUE</code>.
     */
    public String getCnfgValue() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
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
        return Config.CONFIG.CNFG_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Config.CONFIG.CNFG_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getCnfgName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCnfgValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getCnfgName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCnfgValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigRecord value1(String value) {
        setCnfgName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigRecord value2(String value) {
        setCnfgValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ConfigRecord
     */
    public ConfigRecord() {
        super(Config.CONFIG);
    }

    /**
     * Create a detached, initialised ConfigRecord
     */
    public ConfigRecord(String cnfgName, String cnfgValue) {
        super(Config.CONFIG);

        set(0, cnfgName);
        set(1, cnfgValue);
    }
}
