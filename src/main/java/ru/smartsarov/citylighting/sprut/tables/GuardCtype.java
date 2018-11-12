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
import ru.smartsarov.citylighting.sprut.tables.records.GuardCtypeRecord;


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
public class GuardCtype extends TableImpl<GuardCtypeRecord> {

    private static final long serialVersionUID = -1675798803;

    /**
     * The reference instance of <code>GUARD_CTYPE</code>
     */
    public static final GuardCtype GUARD_CTYPE = new GuardCtype();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GuardCtypeRecord> getRecordType() {
        return GuardCtypeRecord.class;
    }

    /**
     * The column <code>GUARD_CTYPE.GRDCT_ID</code>.
     */
    public final TableField<GuardCtypeRecord, Integer> GRDCT_ID = createField("GRDCT_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GUARD_CTYPE.GRDCT_NAME</code>.
     */
    public final TableField<GuardCtypeRecord, String> GRDCT_NAME = createField("GRDCT_NAME", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * Create a <code>GUARD_CTYPE</code> table reference
     */
    public GuardCtype() {
        this(DSL.name("GUARD_CTYPE"), null);
    }

    /**
     * Create an aliased <code>GUARD_CTYPE</code> table reference
     */
    public GuardCtype(String alias) {
        this(DSL.name(alias), GUARD_CTYPE);
    }

    /**
     * Create an aliased <code>GUARD_CTYPE</code> table reference
     */
    public GuardCtype(Name alias) {
        this(alias, GUARD_CTYPE);
    }

    private GuardCtype(Name alias, Table<GuardCtypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private GuardCtype(Name alias, Table<GuardCtypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GuardCtype(Table<O> child, ForeignKey<O, GuardCtypeRecord> key) {
        super(child, key, GUARD_CTYPE);
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
    public UniqueKey<GuardCtypeRecord> getPrimaryKey() {
        return Keys.INTEG_64;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GuardCtypeRecord>> getKeys() {
        return Arrays.<UniqueKey<GuardCtypeRecord>>asList(Keys.INTEG_64);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardCtype as(String alias) {
        return new GuardCtype(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardCtype as(Name alias) {
        return new GuardCtype(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GuardCtype rename(String name) {
        return new GuardCtype(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GuardCtype rename(Name name) {
        return new GuardCtype(name, null);
    }
}