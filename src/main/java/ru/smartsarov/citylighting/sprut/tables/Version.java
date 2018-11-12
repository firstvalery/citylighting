/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables;


import java.sql.Timestamp;

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
import ru.smartsarov.citylighting.sprut.tables.records.VersionRecord;


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
public class Version extends TableImpl<VersionRecord> {

    private static final long serialVersionUID = 330567664;

    /**
     * The reference instance of <code>VERSION</code>
     */
    public static final Version VERSION = new Version();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VersionRecord> getRecordType() {
        return VersionRecord.class;
    }

    /**
     * The column <code>VERSION.VER_MODULE_NAME</code>.
     */
    public final TableField<VersionRecord, String> VER_MODULE_NAME = createField("VER_MODULE_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>VERSION.MAJOR</code>.
     */
    public final TableField<VersionRecord, Integer> MAJOR = createField("MAJOR", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>VERSION.MINOR</code>.
     */
    public final TableField<VersionRecord, Integer> MINOR = createField("MINOR", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>VERSION.REVISION</code>.
     */
    public final TableField<VersionRecord, Integer> REVISION = createField("REVISION", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>VERSION.BUILD</code>.
     */
    public final TableField<VersionRecord, Integer> BUILD = createField("BUILD", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>VERSION.TIME_UPDATE</code>.
     */
    public final TableField<VersionRecord, Timestamp> TIME_UPDATE = createField("TIME_UPDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>VERSION</code> table reference
     */
    public Version() {
        this(DSL.name("VERSION"), null);
    }

    /**
     * Create an aliased <code>VERSION</code> table reference
     */
    public Version(String alias) {
        this(DSL.name(alias), VERSION);
    }

    /**
     * Create an aliased <code>VERSION</code> table reference
     */
    public Version(Name alias) {
        this(alias, VERSION);
    }

    private Version(Name alias, Table<VersionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Version(Name alias, Table<VersionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Version(Table<O> child, ForeignKey<O, VersionRecord> key) {
        super(child, key, VERSION);
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
    public Version as(String alias) {
        return new Version(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Version as(Name alias) {
        return new Version(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Version rename(String name) {
        return new Version(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Version rename(Name name) {
        return new Version(name, null);
    }
}