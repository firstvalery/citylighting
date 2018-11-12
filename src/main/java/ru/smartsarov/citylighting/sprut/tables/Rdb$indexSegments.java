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
import ru.smartsarov.citylighting.sprut.tables.records.Rdb$indexSegmentsRecord;


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
public class Rdb$indexSegments extends TableImpl<Rdb$indexSegmentsRecord> {

    private static final long serialVersionUID = 1337456813;

    /**
     * The reference instance of <code>RDB$INDEX_SEGMENTS</code>
     */
    public static final Rdb$indexSegments RDB$INDEX_SEGMENTS = new Rdb$indexSegments();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Rdb$indexSegmentsRecord> getRecordType() {
        return Rdb$indexSegmentsRecord.class;
    }

    /**
     * The column <code>RDB$INDEX_SEGMENTS.RDB$INDEX_NAME</code>.
     */
    public final TableField<Rdb$indexSegmentsRecord, String> RDB$INDEX_NAME = createField("RDB$INDEX_NAME", org.jooq.impl.SQLDataType.CHAR, this, "");

    /**
     * The column <code>RDB$INDEX_SEGMENTS.RDB$FIELD_NAME</code>.
     */
    public final TableField<Rdb$indexSegmentsRecord, String> RDB$FIELD_NAME = createField("RDB$FIELD_NAME", org.jooq.impl.SQLDataType.CHAR, this, "");

    /**
     * The column <code>RDB$INDEX_SEGMENTS.RDB$FIELD_POSITION</code>.
     */
    public final TableField<Rdb$indexSegmentsRecord, Short> RDB$FIELD_POSITION = createField("RDB$FIELD_POSITION", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$INDEX_SEGMENTS.RDB$STATISTICS</code>.
     */
    public final TableField<Rdb$indexSegmentsRecord, Double> RDB$STATISTICS = createField("RDB$STATISTICS", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>RDB$INDEX_SEGMENTS</code> table reference
     */
    public Rdb$indexSegments() {
        this(DSL.name("RDB$INDEX_SEGMENTS"), null);
    }

    /**
     * Create an aliased <code>RDB$INDEX_SEGMENTS</code> table reference
     */
    public Rdb$indexSegments(String alias) {
        this(DSL.name(alias), RDB$INDEX_SEGMENTS);
    }

    /**
     * Create an aliased <code>RDB$INDEX_SEGMENTS</code> table reference
     */
    public Rdb$indexSegments(Name alias) {
        this(alias, RDB$INDEX_SEGMENTS);
    }

    private Rdb$indexSegments(Name alias, Table<Rdb$indexSegmentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Rdb$indexSegments(Name alias, Table<Rdb$indexSegmentsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Rdb$indexSegments(Table<O> child, ForeignKey<O, Rdb$indexSegmentsRecord> key) {
        super(child, key, RDB$INDEX_SEGMENTS);
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
    public Rdb$indexSegments as(String alias) {
        return new Rdb$indexSegments(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$indexSegments as(Name alias) {
        return new Rdb$indexSegments(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$indexSegments rename(String name) {
        return new Rdb$indexSegments(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$indexSegments rename(Name name) {
        return new Rdb$indexSegments(name, null);
    }
}
