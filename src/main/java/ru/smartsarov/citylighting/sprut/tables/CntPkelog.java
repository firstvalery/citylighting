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
import ru.smartsarov.citylighting.sprut.tables.records.CntPkelogRecord;


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
public class CntPkelog extends TableImpl<CntPkelogRecord> {

    private static final long serialVersionUID = -1814992915;

    /**
     * The reference instance of <code>CNT_PKELOG</code>
     */
    public static final CntPkelog CNT_PKELOG = new CntPkelog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CntPkelogRecord> getRecordType() {
        return CntPkelogRecord.class;
    }

    /**
     * The column <code>CNT_PKELOG.PKE_LOGID</code>.
     */
    public final TableField<CntPkelogRecord, Integer> PKE_LOGID = createField("PKE_LOGID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CNT_PKELOG.PKE_CID</code>.
     */
    public final TableField<CntPkelogRecord, Integer> PKE_CID = createField("PKE_CID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CNT_PKELOG.PKE_KIND</code>.
     */
    public final TableField<CntPkelogRecord, Short> PKE_KIND = createField("PKE_KIND", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>CNT_PKELOG.PKE_INDEX</code>.
     */
    public final TableField<CntPkelogRecord, Short> PKE_INDEX = createField("PKE_INDEX", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>CNT_PKELOG.PKE_IN</code>.
     */
    public final TableField<CntPkelogRecord, Timestamp> PKE_IN = createField("PKE_IN", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>CNT_PKELOG.PKE_OUT</code>.
     */
    public final TableField<CntPkelogRecord, Timestamp> PKE_OUT = createField("PKE_OUT", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>CNT_PKELOG.PKE_STIME</code>.
     */
    public final TableField<CntPkelogRecord, Timestamp> PKE_STIME = createField("PKE_STIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>CNT_PKELOG</code> table reference
     */
    public CntPkelog() {
        this(DSL.name("CNT_PKELOG"), null);
    }

    /**
     * Create an aliased <code>CNT_PKELOG</code> table reference
     */
    public CntPkelog(String alias) {
        this(DSL.name(alias), CNT_PKELOG);
    }

    /**
     * Create an aliased <code>CNT_PKELOG</code> table reference
     */
    public CntPkelog(Name alias) {
        this(alias, CNT_PKELOG);
    }

    private CntPkelog(Name alias, Table<CntPkelogRecord> aliased) {
        this(alias, aliased, null);
    }

    private CntPkelog(Name alias, Table<CntPkelogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CntPkelog(Table<O> child, ForeignKey<O, CntPkelogRecord> key) {
        super(child, key, CNT_PKELOG);
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
    public UniqueKey<CntPkelogRecord> getPrimaryKey() {
        return Keys.PK_CNT_PKELOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CntPkelogRecord>> getKeys() {
        return Arrays.<UniqueKey<CntPkelogRecord>>asList(Keys.PK_CNT_PKELOG);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkelog as(String alias) {
        return new CntPkelog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkelog as(Name alias) {
        return new CntPkelog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CntPkelog rename(String name) {
        return new CntPkelog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CntPkelog rename(Name name) {
        return new CntPkelog(name, null);
    }
}
