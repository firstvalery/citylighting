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
import ru.smartsarov.citylighting.sprut.tables.records.ObjActionAvailableRecord;


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
public class ObjActionAvailable extends TableImpl<ObjActionAvailableRecord> {

    private static final long serialVersionUID = 1225556554;

    /**
     * The reference instance of <code>OBJ_ACTION_AVAILABLE</code>
     */
    public static final ObjActionAvailable OBJ_ACTION_AVAILABLE = new ObjActionAvailable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ObjActionAvailableRecord> getRecordType() {
        return ObjActionAvailableRecord.class;
    }

    /**
     * The column <code>OBJ_ACTION_AVAILABLE.OBJ_TYPE</code>.
     */
    public final TableField<ObjActionAvailableRecord, Integer> OBJ_TYPE = createField("OBJ_TYPE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>OBJ_ACTION_AVAILABLE.OBJ_BTYPE</code>.
     */
    public final TableField<ObjActionAvailableRecord, Integer> OBJ_BTYPE = createField("OBJ_BTYPE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>OBJ_ACTION_AVAILABLE.OBJ_ACTION</code>.
     */
    public final TableField<ObjActionAvailableRecord, Integer> OBJ_ACTION = createField("OBJ_ACTION", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>OBJ_ACTION_AVAILABLE.OBJ_ACTION_TYPE</code>.
     */
    public final TableField<ObjActionAvailableRecord, Integer> OBJ_ACTION_TYPE = createField("OBJ_ACTION_TYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>OBJ_ACTION_AVAILABLE.OBJ_ACTION_NAME</code>.
     */
    public final TableField<ObjActionAvailableRecord, String> OBJ_ACTION_NAME = createField("OBJ_ACTION_NAME", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>OBJ_ACTION_AVAILABLE.OBJ_COMMENT</code>.
     */
    public final TableField<ObjActionAvailableRecord, String> OBJ_COMMENT = createField("OBJ_COMMENT", org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * Create a <code>OBJ_ACTION_AVAILABLE</code> table reference
     */
    public ObjActionAvailable() {
        this(DSL.name("OBJ_ACTION_AVAILABLE"), null);
    }

    /**
     * Create an aliased <code>OBJ_ACTION_AVAILABLE</code> table reference
     */
    public ObjActionAvailable(String alias) {
        this(DSL.name(alias), OBJ_ACTION_AVAILABLE);
    }

    /**
     * Create an aliased <code>OBJ_ACTION_AVAILABLE</code> table reference
     */
    public ObjActionAvailable(Name alias) {
        this(alias, OBJ_ACTION_AVAILABLE);
    }

    private ObjActionAvailable(Name alias, Table<ObjActionAvailableRecord> aliased) {
        this(alias, aliased, null);
    }

    private ObjActionAvailable(Name alias, Table<ObjActionAvailableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ObjActionAvailable(Table<O> child, ForeignKey<O, ObjActionAvailableRecord> key) {
        super(child, key, OBJ_ACTION_AVAILABLE);
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
    public UniqueKey<ObjActionAvailableRecord> getPrimaryKey() {
        return Keys.OBJ_ACTION_AVAILABLE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ObjActionAvailableRecord>> getKeys() {
        return Arrays.<UniqueKey<ObjActionAvailableRecord>>asList(Keys.OBJ_ACTION_AVAILABLE_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjActionAvailable as(String alias) {
        return new ObjActionAvailable(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjActionAvailable as(Name alias) {
        return new ObjActionAvailable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ObjActionAvailable rename(String name) {
        return new ObjActionAvailable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ObjActionAvailable rename(Name name) {
        return new ObjActionAvailable(name, null);
    }
}