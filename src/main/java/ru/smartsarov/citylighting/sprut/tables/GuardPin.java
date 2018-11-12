/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.smartsarov.citylighting.sprut.DefaultSchema;
import ru.smartsarov.citylighting.sprut.Keys;
import ru.smartsarov.citylighting.sprut.tables.records.GuardPinRecord;


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
public class GuardPin extends TableImpl<GuardPinRecord> {

    private static final long serialVersionUID = 2114491653;

    /**
     * The reference instance of <code>GUARD_PIN</code>
     */
    public static final GuardPin GUARD_PIN = new GuardPin();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GuardPinRecord> getRecordType() {
        return GuardPinRecord.class;
    }

    /**
     * The column <code>GUARD_PIN.GPIN_ID</code>.
     */
    public final TableField<GuardPinRecord, Integer> GPIN_ID = createField("GPIN_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GUARD_PIN.GPIN_ZID</code>.
     */
    public final TableField<GuardPinRecord, Integer> GPIN_ZID = createField("GPIN_ZID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GUARD_PIN.GPIN_UNK_ID</code>.
     */
    public final TableField<GuardPinRecord, Integer> GPIN_UNK_ID = createField("GPIN_UNK_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GUARD_PIN.GPIN_TYPE</code>.
     */
    public final TableField<GuardPinRecord, Integer> GPIN_TYPE = createField("GPIN_TYPE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GUARD_PIN.GPIN_DEVTYPE</code>.
     */
    public final TableField<GuardPinRecord, Integer> GPIN_DEVTYPE = createField("GPIN_DEVTYPE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GUARD_PIN.GPIN_ENTRY</code>.
     */
    public final TableField<GuardPinRecord, Integer> GPIN_ENTRY = createField("GPIN_ENTRY", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GUARD_PIN.GPIN_NETADR</code>.
     */
    public final TableField<GuardPinRecord, Integer> GPIN_NETADR = createField("GPIN_NETADR", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GUARD_PIN.GPIN_NAME</code>.
     */
    public final TableField<GuardPinRecord, String> GPIN_NAME = createField("GPIN_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>GUARD_PIN.GPIN_DELAY</code>.
     */
    public final TableField<GuardPinRecord, Integer> GPIN_DELAY = createField("GPIN_DELAY", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GUARD_PIN.GPIN_ATYPE</code>.
     */
    public final TableField<GuardPinRecord, Integer> GPIN_ATYPE = createField("GPIN_ATYPE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GUARD_PIN.GPIN_ON</code>.
     */
    public final TableField<GuardPinRecord, Integer> GPIN_ON = createField("GPIN_ON", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GUARD_PIN.GPIN_REM</code>.
     */
    public final TableField<GuardPinRecord, String> GPIN_REM = createField("GPIN_REM", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * Create a <code>GUARD_PIN</code> table reference
     */
    public GuardPin() {
        this(DSL.name("GUARD_PIN"), null);
    }

    /**
     * Create an aliased <code>GUARD_PIN</code> table reference
     */
    public GuardPin(String alias) {
        this(DSL.name(alias), GUARD_PIN);
    }

    /**
     * Create an aliased <code>GUARD_PIN</code> table reference
     */
    public GuardPin(Name alias) {
        this(alias, GUARD_PIN);
    }

    private GuardPin(Name alias, Table<GuardPinRecord> aliased) {
        this(alias, aliased, null);
    }

    private GuardPin(Name alias, Table<GuardPinRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GuardPin(Table<O> child, ForeignKey<O, GuardPinRecord> key) {
        super(child, key, GUARD_PIN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GuardPinRecord> getPrimaryKey() {
        return Keys.INTEG_78;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GuardPinRecord>> getKeys() {
        return Arrays.<UniqueKey<GuardPinRecord>>asList(Keys.INTEG_78);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardPin as(String alias) {
        return new GuardPin(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardPin as(Name alias) {
        return new GuardPin(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GuardPin rename(String name) {
        return new GuardPin(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GuardPin rename(Name name) {
        return new GuardPin(name, null);
    }
}