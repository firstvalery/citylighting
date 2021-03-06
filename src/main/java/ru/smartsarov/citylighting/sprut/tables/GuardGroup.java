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
import ru.smartsarov.citylighting.sprut.tables.records.GuardGroupRecord;


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
public class GuardGroup extends TableImpl<GuardGroupRecord> {

    private static final long serialVersionUID = 1622692465;

    /**
     * The reference instance of <code>GUARD_GROUP</code>
     */
    public static final GuardGroup GUARD_GROUP = new GuardGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GuardGroupRecord> getRecordType() {
        return GuardGroupRecord.class;
    }

    /**
     * The column <code>GUARD_GROUP.GRDG_ID</code>.
     */
    public final TableField<GuardGroupRecord, Integer> GRDG_ID = createField("GRDG_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GUARD_GROUP.GRDG_ZID</code>.
     */
    public final TableField<GuardGroupRecord, Integer> GRDG_ZID = createField("GRDG_ZID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GUARD_GROUP.GRDG_NAME</code>.
     */
    public final TableField<GuardGroupRecord, String> GRDG_NAME = createField("GRDG_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>GUARD_GROUP.GRDG_ON</code>.
     */
    public final TableField<GuardGroupRecord, Integer> GRDG_ON = createField("GRDG_ON", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GUARD_GROUP.GRDG_REM</code>.
     */
    public final TableField<GuardGroupRecord, String> GRDG_REM = createField("GRDG_REM", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * Create a <code>GUARD_GROUP</code> table reference
     */
    public GuardGroup() {
        this(DSL.name("GUARD_GROUP"), null);
    }

    /**
     * Create an aliased <code>GUARD_GROUP</code> table reference
     */
    public GuardGroup(String alias) {
        this(DSL.name(alias), GUARD_GROUP);
    }

    /**
     * Create an aliased <code>GUARD_GROUP</code> table reference
     */
    public GuardGroup(Name alias) {
        this(alias, GUARD_GROUP);
    }

    private GuardGroup(Name alias, Table<GuardGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private GuardGroup(Name alias, Table<GuardGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GuardGroup(Table<O> child, ForeignKey<O, GuardGroupRecord> key) {
        super(child, key, GUARD_GROUP);
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
    public UniqueKey<GuardGroupRecord> getPrimaryKey() {
        return Keys.INTEG_67;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GuardGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<GuardGroupRecord>>asList(Keys.INTEG_67);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardGroup as(String alias) {
        return new GuardGroup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardGroup as(Name alias) {
        return new GuardGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GuardGroup rename(String name) {
        return new GuardGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GuardGroup rename(Name name) {
        return new GuardGroup(name, null);
    }
}
