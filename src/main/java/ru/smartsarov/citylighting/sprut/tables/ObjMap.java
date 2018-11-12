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
import ru.smartsarov.citylighting.sprut.tables.records.ObjMapRecord;


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
public class ObjMap extends TableImpl<ObjMapRecord> {

    private static final long serialVersionUID = 1231860006;

    /**
     * The reference instance of <code>OBJ_MAP</code>
     */
    public static final ObjMap OBJ_MAP = new ObjMap();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ObjMapRecord> getRecordType() {
        return ObjMapRecord.class;
    }

    /**
     * The column <code>OBJ_MAP.OBJ_ID</code>.
     */
    public final TableField<ObjMapRecord, Integer> OBJ_ID = createField("OBJ_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>OBJ_MAP.OBJ_TYPE</code>.
     */
    public final TableField<ObjMapRecord, Integer> OBJ_TYPE = createField("OBJ_TYPE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>OBJ_MAP.OBJ_POS_X</code>.
     */
    public final TableField<ObjMapRecord, Double> OBJ_POS_X = createField("OBJ_POS_X", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>OBJ_MAP.OBJ_POS_Y</code>.
     */
    public final TableField<ObjMapRecord, Double> OBJ_POS_Y = createField("OBJ_POS_Y", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>OBJ_MAP.OBJ_POS_Z</code>.
     */
    public final TableField<ObjMapRecord, Double> OBJ_POS_Z = createField("OBJ_POS_Z", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>OBJ_MAP.OBJ_PARAM</code>.
     */
    public final TableField<ObjMapRecord, String> OBJ_PARAM = createField("OBJ_PARAM", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * Create a <code>OBJ_MAP</code> table reference
     */
    public ObjMap() {
        this(DSL.name("OBJ_MAP"), null);
    }

    /**
     * Create an aliased <code>OBJ_MAP</code> table reference
     */
    public ObjMap(String alias) {
        this(DSL.name(alias), OBJ_MAP);
    }

    /**
     * Create an aliased <code>OBJ_MAP</code> table reference
     */
    public ObjMap(Name alias) {
        this(alias, OBJ_MAP);
    }

    private ObjMap(Name alias, Table<ObjMapRecord> aliased) {
        this(alias, aliased, null);
    }

    private ObjMap(Name alias, Table<ObjMapRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ObjMap(Table<O> child, ForeignKey<O, ObjMapRecord> key) {
        super(child, key, OBJ_MAP);
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
    public UniqueKey<ObjMapRecord> getPrimaryKey() {
        return Keys.INTEG_209;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ObjMapRecord>> getKeys() {
        return Arrays.<UniqueKey<ObjMapRecord>>asList(Keys.INTEG_209);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjMap as(String alias) {
        return new ObjMap(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjMap as(Name alias) {
        return new ObjMap(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ObjMap rename(String name) {
        return new ObjMap(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ObjMap rename(Name name) {
        return new ObjMap(name, null);
    }
}