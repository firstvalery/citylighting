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
import ru.smartsarov.citylighting.sprut.tables.records.CntMrcpowerlogRecord;


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
public class CntMrcpowerlog extends TableImpl<CntMrcpowerlogRecord> {

    private static final long serialVersionUID = -433785501;

    /**
     * The reference instance of <code>CNT_MRCPOWERLOG</code>
     */
    public static final CntMrcpowerlog CNT_MRCPOWERLOG = new CntMrcpowerlog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CntMrcpowerlogRecord> getRecordType() {
        return CntMrcpowerlogRecord.class;
    }

    /**
     * The column <code>CNT_MRCPOWERLOG.CNTMPL_ID</code>.
     */
    public final TableField<CntMrcpowerlogRecord, Integer> CNTMPL_ID = createField("CNTMPL_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CNT_MRCPOWERLOG.CNTMPL_CID</code>.
     */
    public final TableField<CntMrcpowerlogRecord, Integer> CNTMPL_CID = createField("CNTMPL_CID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CNT_MRCPOWERLOG.CNTMPL_DATE</code>.
     */
    public final TableField<CntMrcpowerlogRecord, Timestamp> CNTMPL_DATE = createField("CNTMPL_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>CNT_MRCPOWERLOG.CNTMPL_ERR</code>.
     */
    public final TableField<CntMrcpowerlogRecord, Integer> CNTMPL_ERR = createField("CNTMPL_ERR", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CNT_MRCPOWERLOG.CNTMPL_T</code>.
     */
    public final TableField<CntMrcpowerlogRecord, Integer> CNTMPL_T = createField("CNTMPL_T", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CNT_MRCPOWERLOG.CNTMPL_PP</code>.
     */
    public final TableField<CntMrcpowerlogRecord, Double> CNTMPL_PP = createField("CNTMPL_PP", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCPOWERLOG.CNTMPL_PM</code>.
     */
    public final TableField<CntMrcpowerlogRecord, Double> CNTMPL_PM = createField("CNTMPL_PM", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCPOWERLOG.CNTMPL_QP</code>.
     */
    public final TableField<CntMrcpowerlogRecord, Double> CNTMPL_QP = createField("CNTMPL_QP", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCPOWERLOG.CNTMPL_QM</code>.
     */
    public final TableField<CntMrcpowerlogRecord, Double> CNTMPL_QM = createField("CNTMPL_QM", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCPOWERLOG.CNTMPL_SDATE</code>.
     */
    public final TableField<CntMrcpowerlogRecord, Timestamp> CNTMPL_SDATE = createField("CNTMPL_SDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>CNT_MRCPOWERLOG.CNTMPL_MEM_IND</code>.
     */
    public final TableField<CntMrcpowerlogRecord, Integer> CNTMPL_MEM_IND = createField("CNTMPL_MEM_IND", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>CNT_MRCPOWERLOG</code> table reference
     */
    public CntMrcpowerlog() {
        this(DSL.name("CNT_MRCPOWERLOG"), null);
    }

    /**
     * Create an aliased <code>CNT_MRCPOWERLOG</code> table reference
     */
    public CntMrcpowerlog(String alias) {
        this(DSL.name(alias), CNT_MRCPOWERLOG);
    }

    /**
     * Create an aliased <code>CNT_MRCPOWERLOG</code> table reference
     */
    public CntMrcpowerlog(Name alias) {
        this(alias, CNT_MRCPOWERLOG);
    }

    private CntMrcpowerlog(Name alias, Table<CntMrcpowerlogRecord> aliased) {
        this(alias, aliased, null);
    }

    private CntMrcpowerlog(Name alias, Table<CntMrcpowerlogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CntMrcpowerlog(Table<O> child, ForeignKey<O, CntMrcpowerlogRecord> key) {
        super(child, key, CNT_MRCPOWERLOG);
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
    public UniqueKey<CntMrcpowerlogRecord> getPrimaryKey() {
        return Keys.INTEG_36;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CntMrcpowerlogRecord>> getKeys() {
        return Arrays.<UniqueKey<CntMrcpowerlogRecord>>asList(Keys.INTEG_36);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcpowerlog as(String alias) {
        return new CntMrcpowerlog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcpowerlog as(Name alias) {
        return new CntMrcpowerlog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CntMrcpowerlog rename(String name) {
        return new CntMrcpowerlog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CntMrcpowerlog rename(Name name) {
        return new CntMrcpowerlog(name, null);
    }
}
