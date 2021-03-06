/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables;


import java.sql.Timestamp;
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
import ru.smartsarov.citylighting.sprut.tables.records.ObjControlRecord;


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
public class ObjControl extends TableImpl<ObjControlRecord> {

    private static final long serialVersionUID = 1371217286;

    /**
     * The reference instance of <code>OBJ_CONTROL</code>
     */
    public static final ObjControl OBJ_CONTROL = new ObjControl();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ObjControlRecord> getRecordType() {
        return ObjControlRecord.class;
    }

    /**
     * The column <code>OBJ_CONTROL.OBJ_ID</code>.
     */
    public final TableField<ObjControlRecord, Integer> OBJ_ID = createField("OBJ_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>OBJ_CONTROL.OBJ_TYPE</code>.
     */
    public final TableField<ObjControlRecord, Integer> OBJ_TYPE = createField("OBJ_TYPE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>OBJ_CONTROL.OBJ_ACTION</code>.
     */
    public final TableField<ObjControlRecord, Integer> OBJ_ACTION = createField("OBJ_ACTION", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>OBJ_CONTROL.OBJ_ACTION_TYPE</code>.
     */
    public final TableField<ObjControlRecord, Integer> OBJ_ACTION_TYPE = createField("OBJ_ACTION_TYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>OBJ_CONTROL.OBJ_PARAM_INT</code>.
     */
    public final TableField<ObjControlRecord, Integer> OBJ_PARAM_INT = createField("OBJ_PARAM_INT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>OBJ_CONTROL.OBJ_PARAM_DOUBLE</code>.
     */
    public final TableField<ObjControlRecord, Double> OBJ_PARAM_DOUBLE = createField("OBJ_PARAM_DOUBLE", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>OBJ_CONTROL.OBJ_PARAM_STR</code>.
     */
    public final TableField<ObjControlRecord, String> OBJ_PARAM_STR = createField("OBJ_PARAM_STR", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>OBJ_CONTROL.OBJ_SYNC</code>.
     */
    public final TableField<ObjControlRecord, Integer> OBJ_SYNC = createField("OBJ_SYNC", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>OBJ_CONTROL.OBJ_COMMENT_USER</code>.
     */
    public final TableField<ObjControlRecord, String> OBJ_COMMENT_USER = createField("OBJ_COMMENT_USER", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>OBJ_CONTROL.OBJ_COMMENT_DATETIME</code>.
     */
    public final TableField<ObjControlRecord, Timestamp> OBJ_COMMENT_DATETIME = createField("OBJ_COMMENT_DATETIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>OBJ_CONTROL.OBJ_COMMENT_IP</code>.
     */
    public final TableField<ObjControlRecord, String> OBJ_COMMENT_IP = createField("OBJ_COMMENT_IP", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>OBJ_CONTROL.OBJ_ACTION_STATE</code>.
     */
    public final TableField<ObjControlRecord, Integer> OBJ_ACTION_STATE = createField("OBJ_ACTION_STATE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>OBJ_CONTROL.OBJ_ACTION_PROGRESS</code>.
     */
    public final TableField<ObjControlRecord, Integer> OBJ_ACTION_PROGRESS = createField("OBJ_ACTION_PROGRESS", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>OBJ_CONTROL</code> table reference
     */
    public ObjControl() {
        this(DSL.name("OBJ_CONTROL"), null);
    }

    /**
     * Create an aliased <code>OBJ_CONTROL</code> table reference
     */
    public ObjControl(String alias) {
        this(DSL.name(alias), OBJ_CONTROL);
    }

    /**
     * Create an aliased <code>OBJ_CONTROL</code> table reference
     */
    public ObjControl(Name alias) {
        this(alias, OBJ_CONTROL);
    }

    private ObjControl(Name alias, Table<ObjControlRecord> aliased) {
        this(alias, aliased, null);
    }

    private ObjControl(Name alias, Table<ObjControlRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ObjControl(Table<O> child, ForeignKey<O, ObjControlRecord> key) {
        super(child, key, OBJ_CONTROL);
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
    public UniqueKey<ObjControlRecord> getPrimaryKey() {
        return Keys.OBJ_CONTROL_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ObjControlRecord>> getKeys() {
        return Arrays.<UniqueKey<ObjControlRecord>>asList(Keys.OBJ_CONTROL_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjControl as(String alias) {
        return new ObjControl(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjControl as(Name alias) {
        return new ObjControl(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ObjControl rename(String name) {
        return new ObjControl(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ObjControl rename(Name name) {
        return new ObjControl(name, null);
    }
}
