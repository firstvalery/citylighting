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
import ru.smartsarov.citylighting.sprut.tables.records.CntGroupRecord;


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
public class CntGroup extends TableImpl<CntGroupRecord> {

    private static final long serialVersionUID = -927229298;

    /**
     * The reference instance of <code>CNT_GROUP</code>
     */
    public static final CntGroup CNT_GROUP = new CntGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CntGroupRecord> getRecordType() {
        return CntGroupRecord.class;
    }

    /**
     * The column <code>CNT_GROUP.GROUP_ID</code>.
     */
    public final TableField<CntGroupRecord, Integer> GROUP_ID = createField("GROUP_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CNT_GROUP.AB_ID</code>.
     */
    public final TableField<CntGroupRecord, Integer> AB_ID = createField("AB_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CNT_GROUP.GROUP_NAME</code>.
     */
    public final TableField<CntGroupRecord, String> GROUP_NAME = createField("GROUP_NAME", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>CNT_GROUP.GROUP_MEMO</code>.
     */
    public final TableField<CntGroupRecord, String> GROUP_MEMO = createField("GROUP_MEMO", org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>CNT_GROUP.GROUP_TYPE</code>.
     */
    public final TableField<CntGroupRecord, Integer> GROUP_TYPE = createField("GROUP_TYPE", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("DEFAULT 0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>CNT_GROUP.GROUP_ADDRESS_LEVEL</code>.
     */
    public final TableField<CntGroupRecord, Integer> GROUP_ADDRESS_LEVEL = createField("GROUP_ADDRESS_LEVEL", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("DEFAULT 0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>CNT_GROUP</code> table reference
     */
    public CntGroup() {
        this(DSL.name("CNT_GROUP"), null);
    }

    /**
     * Create an aliased <code>CNT_GROUP</code> table reference
     */
    public CntGroup(String alias) {
        this(DSL.name(alias), CNT_GROUP);
    }

    /**
     * Create an aliased <code>CNT_GROUP</code> table reference
     */
    public CntGroup(Name alias) {
        this(alias, CNT_GROUP);
    }

    private CntGroup(Name alias, Table<CntGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private CntGroup(Name alias, Table<CntGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CntGroup(Table<O> child, ForeignKey<O, CntGroupRecord> key) {
        super(child, key, CNT_GROUP);
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
    public UniqueKey<CntGroupRecord> getPrimaryKey() {
        return Keys.INTEG_178;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CntGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<CntGroupRecord>>asList(Keys.INTEG_178);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntGroup as(String alias) {
        return new CntGroup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntGroup as(Name alias) {
        return new CntGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CntGroup rename(String name) {
        return new CntGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CntGroup rename(Name name) {
        return new CntGroup(name, null);
    }
}
