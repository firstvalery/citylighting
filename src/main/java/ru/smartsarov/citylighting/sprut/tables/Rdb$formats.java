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
import ru.smartsarov.citylighting.sprut.tables.records.Rdb$formatsRecord;


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
public class Rdb$formats extends TableImpl<Rdb$formatsRecord> {

    private static final long serialVersionUID = 621295282;

    /**
     * The reference instance of <code>RDB$FORMATS</code>
     */
    public static final Rdb$formats RDB$FORMATS = new Rdb$formats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Rdb$formatsRecord> getRecordType() {
        return Rdb$formatsRecord.class;
    }

    /**
     * The column <code>RDB$FORMATS.RDB$RELATION_ID</code>.
     */
    public final TableField<Rdb$formatsRecord, Short> RDB$RELATION_ID = createField("RDB$RELATION_ID", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$FORMATS.RDB$FORMAT</code>.
     */
    public final TableField<Rdb$formatsRecord, Short> RDB$FORMAT = createField("RDB$FORMAT", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$FORMATS.RDB$DESCRIPTOR</code>.
     */
    public final TableField<Rdb$formatsRecord, byte[]> RDB$DESCRIPTOR = createField("RDB$DESCRIPTOR", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * Create a <code>RDB$FORMATS</code> table reference
     */
    public Rdb$formats() {
        this(DSL.name("RDB$FORMATS"), null);
    }

    /**
     * Create an aliased <code>RDB$FORMATS</code> table reference
     */
    public Rdb$formats(String alias) {
        this(DSL.name(alias), RDB$FORMATS);
    }

    /**
     * Create an aliased <code>RDB$FORMATS</code> table reference
     */
    public Rdb$formats(Name alias) {
        this(alias, RDB$FORMATS);
    }

    private Rdb$formats(Name alias, Table<Rdb$formatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Rdb$formats(Name alias, Table<Rdb$formatsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Rdb$formats(Table<O> child, ForeignKey<O, Rdb$formatsRecord> key) {
        super(child, key, RDB$FORMATS);
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
    public Rdb$formats as(String alias) {
        return new Rdb$formats(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$formats as(Name alias) {
        return new Rdb$formats(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$formats rename(String name) {
        return new Rdb$formats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$formats rename(Name name) {
        return new Rdb$formats(name, null);
    }
}