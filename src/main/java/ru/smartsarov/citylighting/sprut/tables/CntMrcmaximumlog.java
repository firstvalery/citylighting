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
import ru.smartsarov.citylighting.sprut.tables.records.CntMrcmaximumlogRecord;


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
public class CntMrcmaximumlog extends TableImpl<CntMrcmaximumlogRecord> {

    private static final long serialVersionUID = 2105273565;

    /**
     * The reference instance of <code>CNT_MRCMAXIMUMLOG</code>
     */
    public static final CntMrcmaximumlog CNT_MRCMAXIMUMLOG = new CntMrcmaximumlog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CntMrcmaximumlogRecord> getRecordType() {
        return CntMrcmaximumlogRecord.class;
    }

    /**
     * The column <code>CNT_MRCMAXIMUMLOG.CNTMML_ID</code>.
     */
    public final TableField<CntMrcmaximumlogRecord, Integer> CNTMML_ID = createField("CNTMML_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CNT_MRCMAXIMUMLOG.CNTMML_CID</code>.
     */
    public final TableField<CntMrcmaximumlogRecord, Integer> CNTMML_CID = createField("CNTMML_CID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CNT_MRCMAXIMUMLOG.CNTMML_DATE</code>.
     */
    public final TableField<CntMrcmaximumlogRecord, Timestamp> CNTMML_DATE = createField("CNTMML_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>CNT_MRCMAXIMUMLOG.CNTMML_APM</code>.
     */
    public final TableField<CntMrcmaximumlogRecord, Double> CNTMML_APM = createField("CNTMML_APM", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCMAXIMUMLOG.CNTMML_APE</code>.
     */
    public final TableField<CntMrcmaximumlogRecord, Double> CNTMML_APE = createField("CNTMML_APE", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCMAXIMUMLOG.CNTMML_AMM</code>.
     */
    public final TableField<CntMrcmaximumlogRecord, Double> CNTMML_AMM = createField("CNTMML_AMM", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCMAXIMUMLOG.CNTMML_AME</code>.
     */
    public final TableField<CntMrcmaximumlogRecord, Double> CNTMML_AME = createField("CNTMML_AME", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCMAXIMUMLOG.CNTMML_RPM</code>.
     */
    public final TableField<CntMrcmaximumlogRecord, Double> CNTMML_RPM = createField("CNTMML_RPM", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCMAXIMUMLOG.CNTMML_RPE</code>.
     */
    public final TableField<CntMrcmaximumlogRecord, Double> CNTMML_RPE = createField("CNTMML_RPE", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCMAXIMUMLOG.CNTMML_RMM</code>.
     */
    public final TableField<CntMrcmaximumlogRecord, Double> CNTMML_RMM = createField("CNTMML_RMM", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCMAXIMUMLOG.CNTMML_RME</code>.
     */
    public final TableField<CntMrcmaximumlogRecord, Double> CNTMML_RME = createField("CNTMML_RME", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCMAXIMUMLOG.CNTMML_SDATE</code>.
     */
    public final TableField<CntMrcmaximumlogRecord, Timestamp> CNTMML_SDATE = createField("CNTMML_SDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>CNT_MRCMAXIMUMLOG</code> table reference
     */
    public CntMrcmaximumlog() {
        this(DSL.name("CNT_MRCMAXIMUMLOG"), null);
    }

    /**
     * Create an aliased <code>CNT_MRCMAXIMUMLOG</code> table reference
     */
    public CntMrcmaximumlog(String alias) {
        this(DSL.name(alias), CNT_MRCMAXIMUMLOG);
    }

    /**
     * Create an aliased <code>CNT_MRCMAXIMUMLOG</code> table reference
     */
    public CntMrcmaximumlog(Name alias) {
        this(alias, CNT_MRCMAXIMUMLOG);
    }

    private CntMrcmaximumlog(Name alias, Table<CntMrcmaximumlogRecord> aliased) {
        this(alias, aliased, null);
    }

    private CntMrcmaximumlog(Name alias, Table<CntMrcmaximumlogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CntMrcmaximumlog(Table<O> child, ForeignKey<O, CntMrcmaximumlogRecord> key) {
        super(child, key, CNT_MRCMAXIMUMLOG);
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
    public UniqueKey<CntMrcmaximumlogRecord> getPrimaryKey() {
        return Keys.INTEG_35;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CntMrcmaximumlogRecord>> getKeys() {
        return Arrays.<UniqueKey<CntMrcmaximumlogRecord>>asList(Keys.INTEG_35);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcmaximumlog as(String alias) {
        return new CntMrcmaximumlog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcmaximumlog as(Name alias) {
        return new CntMrcmaximumlog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CntMrcmaximumlog rename(String name) {
        return new CntMrcmaximumlog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CntMrcmaximumlog rename(Name name) {
        return new CntMrcmaximumlog(name, null);
    }
}
