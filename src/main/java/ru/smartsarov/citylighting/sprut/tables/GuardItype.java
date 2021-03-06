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
import ru.smartsarov.citylighting.sprut.tables.records.GuardItypeRecord;


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
public class GuardItype extends TableImpl<GuardItypeRecord> {

    private static final long serialVersionUID = -1271126107;

    /**
     * The reference instance of <code>GUARD_ITYPE</code>
     */
    public static final GuardItype GUARD_ITYPE = new GuardItype();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GuardItypeRecord> getRecordType() {
        return GuardItypeRecord.class;
    }

    /**
     * The column <code>GUARD_ITYPE.GRDIT_ID</code>.
     */
    public final TableField<GuardItypeRecord, Integer> GRDIT_ID = createField("GRDIT_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GUARD_ITYPE.GRDIT_NAME</code>.
     */
    public final TableField<GuardItypeRecord, String> GRDIT_NAME = createField("GRDIT_NAME", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * Create a <code>GUARD_ITYPE</code> table reference
     */
    public GuardItype() {
        this(DSL.name("GUARD_ITYPE"), null);
    }

    /**
     * Create an aliased <code>GUARD_ITYPE</code> table reference
     */
    public GuardItype(String alias) {
        this(DSL.name(alias), GUARD_ITYPE);
    }

    /**
     * Create an aliased <code>GUARD_ITYPE</code> table reference
     */
    public GuardItype(Name alias) {
        this(alias, GUARD_ITYPE);
    }

    private GuardItype(Name alias, Table<GuardItypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private GuardItype(Name alias, Table<GuardItypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GuardItype(Table<O> child, ForeignKey<O, GuardItypeRecord> key) {
        super(child, key, GUARD_ITYPE);
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
    public UniqueKey<GuardItypeRecord> getPrimaryKey() {
        return Keys.INTEG_68;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GuardItypeRecord>> getKeys() {
        return Arrays.<UniqueKey<GuardItypeRecord>>asList(Keys.INTEG_68);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardItype as(String alias) {
        return new GuardItype(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardItype as(Name alias) {
        return new GuardItype(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GuardItype rename(String name) {
        return new GuardItype(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GuardItype rename(Name name) {
        return new GuardItype(name, null);
    }
}
