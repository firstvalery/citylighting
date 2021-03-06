/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables;


import java.sql.Timestamp;
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
import ru.smartsarov.citylighting.sprut.tables.records.GuardExstateRecord;


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
public class GuardExstate extends TableImpl<GuardExstateRecord> {

    private static final long serialVersionUID = -550620535;

    /**
     * The reference instance of <code>GUARD_EXSTATE</code>
     */
    public static final GuardExstate GUARD_EXSTATE = new GuardExstate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GuardExstateRecord> getRecordType() {
        return GuardExstateRecord.class;
    }

    /**
     * The column <code>GUARD_EXSTATE.GRDEX_ID</code>.
     */
    public final TableField<GuardExstateRecord, Integer> GRDEX_ID = createField("GRDEX_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GUARD_EXSTATE.GRDEX_STATE</code>.
     */
    public final TableField<GuardExstateRecord, Integer> GRDEX_STATE = createField("GRDEX_STATE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GUARD_EXSTATE.GRDEX_ACCESS</code>.
     */
    public final TableField<GuardExstateRecord, Integer> GRDEX_ACCESS = createField("GRDEX_ACCESS", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GUARD_EXSTATE.GRDEX_DATE</code>.
     */
    public final TableField<GuardExstateRecord, Timestamp> GRDEX_DATE = createField("GRDEX_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>GUARD_EXSTATE</code> table reference
     */
    public GuardExstate() {
        this(DSL.name("GUARD_EXSTATE"), null);
    }

    /**
     * Create an aliased <code>GUARD_EXSTATE</code> table reference
     */
    public GuardExstate(String alias) {
        this(DSL.name(alias), GUARD_EXSTATE);
    }

    /**
     * Create an aliased <code>GUARD_EXSTATE</code> table reference
     */
    public GuardExstate(Name alias) {
        this(alias, GUARD_EXSTATE);
    }

    private GuardExstate(Name alias, Table<GuardExstateRecord> aliased) {
        this(alias, aliased, null);
    }

    private GuardExstate(Name alias, Table<GuardExstateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GuardExstate(Table<O> child, ForeignKey<O, GuardExstateRecord> key) {
        super(child, key, GUARD_EXSTATE);
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
    public UniqueKey<GuardExstateRecord> getPrimaryKey() {
        return Keys.INTEG_66;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GuardExstateRecord>> getKeys() {
        return Arrays.<UniqueKey<GuardExstateRecord>>asList(Keys.INTEG_66);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardExstate as(String alias) {
        return new GuardExstate(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardExstate as(Name alias) {
        return new GuardExstate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GuardExstate rename(String name) {
        return new GuardExstate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GuardExstate rename(Name name) {
        return new GuardExstate(name, null);
    }
}
