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
import ru.smartsarov.citylighting.sprut.tables.records.CntChannelTypeRecord;


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
public class CntChannelType extends TableImpl<CntChannelTypeRecord> {

    private static final long serialVersionUID = 213714990;

    /**
     * The reference instance of <code>CNT_CHANNEL_TYPE</code>
     */
    public static final CntChannelType CNT_CHANNEL_TYPE = new CntChannelType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CntChannelTypeRecord> getRecordType() {
        return CntChannelTypeRecord.class;
    }

    /**
     * The column <code>CNT_CHANNEL_TYPE.ID</code>.
     */
    public final TableField<CntChannelTypeRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CNT_CHANNEL_TYPE.CH_TYPE_NAME</code>.
     */
    public final TableField<CntChannelTypeRecord, String> CH_TYPE_NAME = createField("CH_TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>CNT_CHANNEL_TYPE.CH_TYPE_DEM</code>.
     */
    public final TableField<CntChannelTypeRecord, String> CH_TYPE_DEM = createField("CH_TYPE_DEM", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * Create a <code>CNT_CHANNEL_TYPE</code> table reference
     */
    public CntChannelType() {
        this(DSL.name("CNT_CHANNEL_TYPE"), null);
    }

    /**
     * Create an aliased <code>CNT_CHANNEL_TYPE</code> table reference
     */
    public CntChannelType(String alias) {
        this(DSL.name(alias), CNT_CHANNEL_TYPE);
    }

    /**
     * Create an aliased <code>CNT_CHANNEL_TYPE</code> table reference
     */
    public CntChannelType(Name alias) {
        this(alias, CNT_CHANNEL_TYPE);
    }

    private CntChannelType(Name alias, Table<CntChannelTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private CntChannelType(Name alias, Table<CntChannelTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CntChannelType(Table<O> child, ForeignKey<O, CntChannelTypeRecord> key) {
        super(child, key, CNT_CHANNEL_TYPE);
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
    public UniqueKey<CntChannelTypeRecord> getPrimaryKey() {
        return Keys.INTEG_175;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CntChannelTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<CntChannelTypeRecord>>asList(Keys.INTEG_175);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntChannelType as(String alias) {
        return new CntChannelType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntChannelType as(Name alias) {
        return new CntChannelType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CntChannelType rename(String name) {
        return new CntChannelType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CntChannelType rename(Name name) {
        return new CntChannelType(name, null);
    }
}