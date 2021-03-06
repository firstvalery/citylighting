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
import ru.smartsarov.citylighting.sprut.tables.records.ObjArchiveTypeRecord;


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
public class ObjArchiveType extends TableImpl<ObjArchiveTypeRecord> {

    private static final long serialVersionUID = 724507817;

    /**
     * The reference instance of <code>OBJ_ARCHIVE_TYPE</code>
     */
    public static final ObjArchiveType OBJ_ARCHIVE_TYPE = new ObjArchiveType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ObjArchiveTypeRecord> getRecordType() {
        return ObjArchiveTypeRecord.class;
    }

    /**
     * The column <code>OBJ_ARCHIVE_TYPE.OBJ_ARCH_TYPE</code>.
     */
    public final TableField<ObjArchiveTypeRecord, Integer> OBJ_ARCH_TYPE = createField("OBJ_ARCH_TYPE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>OBJ_ARCHIVE_TYPE.OBJ_ARCH_INTERVAL</code>.
     */
    public final TableField<ObjArchiveTypeRecord, Integer> OBJ_ARCH_INTERVAL = createField("OBJ_ARCH_INTERVAL", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>OBJ_ARCHIVE_TYPE.OBJ_ARCH_TYPE_NAME</code>.
     */
    public final TableField<ObjArchiveTypeRecord, String> OBJ_ARCH_TYPE_NAME = createField("OBJ_ARCH_TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * Create a <code>OBJ_ARCHIVE_TYPE</code> table reference
     */
    public ObjArchiveType() {
        this(DSL.name("OBJ_ARCHIVE_TYPE"), null);
    }

    /**
     * Create an aliased <code>OBJ_ARCHIVE_TYPE</code> table reference
     */
    public ObjArchiveType(String alias) {
        this(DSL.name(alias), OBJ_ARCHIVE_TYPE);
    }

    /**
     * Create an aliased <code>OBJ_ARCHIVE_TYPE</code> table reference
     */
    public ObjArchiveType(Name alias) {
        this(alias, OBJ_ARCHIVE_TYPE);
    }

    private ObjArchiveType(Name alias, Table<ObjArchiveTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private ObjArchiveType(Name alias, Table<ObjArchiveTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ObjArchiveType(Table<O> child, ForeignKey<O, ObjArchiveTypeRecord> key) {
        super(child, key, OBJ_ARCHIVE_TYPE);
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
    public UniqueKey<ObjArchiveTypeRecord> getPrimaryKey() {
        return Keys.OBJ_ARCH_TYPE_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ObjArchiveTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<ObjArchiveTypeRecord>>asList(Keys.OBJ_ARCH_TYPE_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjArchiveType as(String alias) {
        return new ObjArchiveType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjArchiveType as(Name alias) {
        return new ObjArchiveType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ObjArchiveType rename(String name) {
        return new ObjArchiveType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ObjArchiveType rename(Name name) {
        return new ObjArchiveType(name, null);
    }
}
