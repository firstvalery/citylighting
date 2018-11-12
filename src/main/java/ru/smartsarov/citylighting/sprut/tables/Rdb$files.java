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
import ru.smartsarov.citylighting.sprut.tables.records.Rdb$filesRecord;


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
public class Rdb$files extends TableImpl<Rdb$filesRecord> {

    private static final long serialVersionUID = 989991292;

    /**
     * The reference instance of <code>RDB$FILES</code>
     */
    public static final Rdb$files RDB$FILES = new Rdb$files();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Rdb$filesRecord> getRecordType() {
        return Rdb$filesRecord.class;
    }

    /**
     * The column <code>RDB$FILES.RDB$FILE_NAME</code>.
     */
    public final TableField<Rdb$filesRecord, String> RDB$FILE_NAME = createField("RDB$FILE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>RDB$FILES.RDB$FILE_SEQUENCE</code>.
     */
    public final TableField<Rdb$filesRecord, Short> RDB$FILE_SEQUENCE = createField("RDB$FILE_SEQUENCE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$FILES.RDB$FILE_START</code>.
     */
    public final TableField<Rdb$filesRecord, Integer> RDB$FILE_START = createField("RDB$FILE_START", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>RDB$FILES.RDB$FILE_LENGTH</code>.
     */
    public final TableField<Rdb$filesRecord, Integer> RDB$FILE_LENGTH = createField("RDB$FILE_LENGTH", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>RDB$FILES.RDB$FILE_FLAGS</code>.
     */
    public final TableField<Rdb$filesRecord, Short> RDB$FILE_FLAGS = createField("RDB$FILE_FLAGS", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$FILES.RDB$SHADOW_NUMBER</code>.
     */
    public final TableField<Rdb$filesRecord, Short> RDB$SHADOW_NUMBER = createField("RDB$SHADOW_NUMBER", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>RDB$FILES</code> table reference
     */
    public Rdb$files() {
        this(DSL.name("RDB$FILES"), null);
    }

    /**
     * Create an aliased <code>RDB$FILES</code> table reference
     */
    public Rdb$files(String alias) {
        this(DSL.name(alias), RDB$FILES);
    }

    /**
     * Create an aliased <code>RDB$FILES</code> table reference
     */
    public Rdb$files(Name alias) {
        this(alias, RDB$FILES);
    }

    private Rdb$files(Name alias, Table<Rdb$filesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Rdb$files(Name alias, Table<Rdb$filesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Rdb$files(Table<O> child, ForeignKey<O, Rdb$filesRecord> key) {
        super(child, key, RDB$FILES);
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
    public Rdb$files as(String alias) {
        return new Rdb$files(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$files as(Name alias) {
        return new Rdb$files(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$files rename(String name) {
        return new Rdb$files(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$files rename(Name name) {
        return new Rdb$files(name, null);
    }
}
