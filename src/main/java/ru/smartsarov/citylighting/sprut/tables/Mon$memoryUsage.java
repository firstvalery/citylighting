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
import ru.smartsarov.citylighting.sprut.tables.records.Mon$memoryUsageRecord;


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
public class Mon$memoryUsage extends TableImpl<Mon$memoryUsageRecord> {

    private static final long serialVersionUID = -837678444;

    /**
     * The reference instance of <code>MON$MEMORY_USAGE</code>
     */
    public static final Mon$memoryUsage MON$MEMORY_USAGE = new Mon$memoryUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Mon$memoryUsageRecord> getRecordType() {
        return Mon$memoryUsageRecord.class;
    }

    /**
     * The column <code>MON$MEMORY_USAGE.MON$STAT_ID</code>.
     */
    public final TableField<Mon$memoryUsageRecord, Integer> MON$STAT_ID = createField("MON$STAT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>MON$MEMORY_USAGE.MON$STAT_GROUP</code>.
     */
    public final TableField<Mon$memoryUsageRecord, Short> MON$STAT_GROUP = createField("MON$STAT_GROUP", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>MON$MEMORY_USAGE.MON$MEMORY_USED</code>.
     */
    public final TableField<Mon$memoryUsageRecord, Long> MON$MEMORY_USED = createField("MON$MEMORY_USED", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>MON$MEMORY_USAGE.MON$MEMORY_ALLOCATED</code>.
     */
    public final TableField<Mon$memoryUsageRecord, Long> MON$MEMORY_ALLOCATED = createField("MON$MEMORY_ALLOCATED", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>MON$MEMORY_USAGE.MON$MAX_MEMORY_USED</code>.
     */
    public final TableField<Mon$memoryUsageRecord, Long> MON$MAX_MEMORY_USED = createField("MON$MAX_MEMORY_USED", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>MON$MEMORY_USAGE.MON$MAX_MEMORY_ALLOCATED</code>.
     */
    public final TableField<Mon$memoryUsageRecord, Long> MON$MAX_MEMORY_ALLOCATED = createField("MON$MAX_MEMORY_ALLOCATED", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>MON$MEMORY_USAGE</code> table reference
     */
    public Mon$memoryUsage() {
        this(DSL.name("MON$MEMORY_USAGE"), null);
    }

    /**
     * Create an aliased <code>MON$MEMORY_USAGE</code> table reference
     */
    public Mon$memoryUsage(String alias) {
        this(DSL.name(alias), MON$MEMORY_USAGE);
    }

    /**
     * Create an aliased <code>MON$MEMORY_USAGE</code> table reference
     */
    public Mon$memoryUsage(Name alias) {
        this(alias, MON$MEMORY_USAGE);
    }

    private Mon$memoryUsage(Name alias, Table<Mon$memoryUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private Mon$memoryUsage(Name alias, Table<Mon$memoryUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Mon$memoryUsage(Table<O> child, ForeignKey<O, Mon$memoryUsageRecord> key) {
        super(child, key, MON$MEMORY_USAGE);
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
    public Mon$memoryUsage as(String alias) {
        return new Mon$memoryUsage(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$memoryUsage as(Name alias) {
        return new Mon$memoryUsage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Mon$memoryUsage rename(String name) {
        return new Mon$memoryUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Mon$memoryUsage rename(Name name) {
        return new Mon$memoryUsage(name, null);
    }
}