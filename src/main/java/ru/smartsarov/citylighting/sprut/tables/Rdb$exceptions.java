/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.smartsarov.citylighting.sprut.DefaultSchema;
import ru.smartsarov.citylighting.sprut.tables.records.Rdb$exceptionsRecord;


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
public class Rdb$exceptions extends TableImpl<Rdb$exceptionsRecord> {

    private static final long serialVersionUID = -1101046810;

    /**
     * The reference instance of <code>RDB$EXCEPTIONS</code>
     */
    public static final Rdb$exceptions RDB$EXCEPTIONS = new Rdb$exceptions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Rdb$exceptionsRecord> getRecordType() {
        return Rdb$exceptionsRecord.class;
    }

    /**
     * The column <code>RDB$EXCEPTIONS.RDB$EXCEPTION_NAME</code>.
     */
    public final TableField<Rdb$exceptionsRecord, String> RDB$EXCEPTION_NAME = createField("RDB$EXCEPTION_NAME", org.jooq.impl.SQLDataType.CHAR, this, "");

    /**
     * The column <code>RDB$EXCEPTIONS.RDB$EXCEPTION_NUMBER</code>.
     */
    public final TableField<Rdb$exceptionsRecord, Integer> RDB$EXCEPTION_NUMBER = createField("RDB$EXCEPTION_NUMBER", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>RDB$EXCEPTIONS.RDB$MESSAGE</code>.
     */
    public final TableField<Rdb$exceptionsRecord, String> RDB$MESSAGE = createField("RDB$MESSAGE", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>RDB$EXCEPTIONS.RDB$DESCRIPTION</code>.
     */
    public final TableField<Rdb$exceptionsRecord, String> RDB$DESCRIPTION = createField("RDB$DESCRIPTION", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>RDB$EXCEPTIONS.RDB$SYSTEM_FLAG</code>.
     */
    public final TableField<Rdb$exceptionsRecord, Short> RDB$SYSTEM_FLAG = createField("RDB$SYSTEM_FLAG", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>RDB$EXCEPTIONS</code> table reference
     */
    public Rdb$exceptions() {
        this(DSL.name("RDB$EXCEPTIONS"), null);
    }

    /**
     * Create an aliased <code>RDB$EXCEPTIONS</code> table reference
     */
    public Rdb$exceptions(String alias) {
        this(DSL.name(alias), RDB$EXCEPTIONS);
    }

    /**
     * Create an aliased <code>RDB$EXCEPTIONS</code> table reference
     */
    public Rdb$exceptions(Name alias) {
        this(alias, RDB$EXCEPTIONS);
    }

    private Rdb$exceptions(Name alias, Table<Rdb$exceptionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Rdb$exceptions(Name alias, Table<Rdb$exceptionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Rdb$exceptions(Table<O> child, ForeignKey<O, Rdb$exceptionsRecord> key) {
        super(child, key, RDB$EXCEPTIONS);
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
    public Rdb$exceptions as(String alias) {
        return new Rdb$exceptions(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$exceptions as(Name alias) {
        return new Rdb$exceptions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$exceptions rename(String name) {
        return new Rdb$exceptions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$exceptions rename(Name name) {
        return new Rdb$exceptions(name, null);
    }
}
