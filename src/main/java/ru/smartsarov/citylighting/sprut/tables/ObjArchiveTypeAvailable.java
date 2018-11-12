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
import ru.smartsarov.citylighting.sprut.tables.records.ObjArchiveTypeAvailableRecord;


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
public class ObjArchiveTypeAvailable extends TableImpl<ObjArchiveTypeAvailableRecord> {

    private static final long serialVersionUID = -910940579;

    /**
     * The reference instance of <code>OBJ_ARCHIVE_TYPE_AVAILABLE</code>
     */
    public static final ObjArchiveTypeAvailable OBJ_ARCHIVE_TYPE_AVAILABLE = new ObjArchiveTypeAvailable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ObjArchiveTypeAvailableRecord> getRecordType() {
        return ObjArchiveTypeAvailableRecord.class;
    }

    /**
     * The column <code>OBJ_ARCHIVE_TYPE_AVAILABLE.OBJ_TYPE</code>.
     */
    public final TableField<ObjArchiveTypeAvailableRecord, Integer> OBJ_TYPE = createField("OBJ_TYPE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>OBJ_ARCHIVE_TYPE_AVAILABLE.OBJ_BTYPE</code>.
     */
    public final TableField<ObjArchiveTypeAvailableRecord, Integer> OBJ_BTYPE = createField("OBJ_BTYPE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>OBJ_ARCHIVE_TYPE_AVAILABLE.OBJ_ARCH_TYPE</code>.
     */
    public final TableField<ObjArchiveTypeAvailableRecord, Integer> OBJ_ARCH_TYPE = createField("OBJ_ARCH_TYPE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>OBJ_ARCHIVE_TYPE_AVAILABLE</code> table reference
     */
    public ObjArchiveTypeAvailable() {
        this(DSL.name("OBJ_ARCHIVE_TYPE_AVAILABLE"), null);
    }

    /**
     * Create an aliased <code>OBJ_ARCHIVE_TYPE_AVAILABLE</code> table reference
     */
    public ObjArchiveTypeAvailable(String alias) {
        this(DSL.name(alias), OBJ_ARCHIVE_TYPE_AVAILABLE);
    }

    /**
     * Create an aliased <code>OBJ_ARCHIVE_TYPE_AVAILABLE</code> table reference
     */
    public ObjArchiveTypeAvailable(Name alias) {
        this(alias, OBJ_ARCHIVE_TYPE_AVAILABLE);
    }

    private ObjArchiveTypeAvailable(Name alias, Table<ObjArchiveTypeAvailableRecord> aliased) {
        this(alias, aliased, null);
    }

    private ObjArchiveTypeAvailable(Name alias, Table<ObjArchiveTypeAvailableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ObjArchiveTypeAvailable(Table<O> child, ForeignKey<O, ObjArchiveTypeAvailableRecord> key) {
        super(child, key, OBJ_ARCHIVE_TYPE_AVAILABLE);
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
    public UniqueKey<ObjArchiveTypeAvailableRecord> getPrimaryKey() {
        return Keys.OBJ_ARCH_TYPE_AVAILABLE_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ObjArchiveTypeAvailableRecord>> getKeys() {
        return Arrays.<UniqueKey<ObjArchiveTypeAvailableRecord>>asList(Keys.OBJ_ARCH_TYPE_AVAILABLE_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjArchiveTypeAvailable as(String alias) {
        return new ObjArchiveTypeAvailable(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjArchiveTypeAvailable as(Name alias) {
        return new ObjArchiveTypeAvailable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ObjArchiveTypeAvailable rename(String name) {
        return new ObjArchiveTypeAvailable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ObjArchiveTypeAvailable rename(Name name) {
        return new ObjArchiveTypeAvailable(name, null);
    }
}