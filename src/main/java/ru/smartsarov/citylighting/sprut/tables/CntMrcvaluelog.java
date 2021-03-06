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
import ru.smartsarov.citylighting.sprut.tables.records.CntMrcvaluelogRecord;


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
public class CntMrcvaluelog extends TableImpl<CntMrcvaluelogRecord> {

    private static final long serialVersionUID = -1577194459;

    /**
     * The reference instance of <code>CNT_MRCVALUELOG</code>
     */
    public static final CntMrcvaluelog CNT_MRCVALUELOG = new CntMrcvaluelog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CntMrcvaluelogRecord> getRecordType() {
        return CntMrcvaluelogRecord.class;
    }

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_ID</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Integer> CNTMVL_ID = createField("CNTMVL_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_CID</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Integer> CNTMVL_CID = createField("CNTMVL_CID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_TARIFF</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Integer> CNTMVL_TARIFF = createField("CNTMVL_TARIFF", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_DATE</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Timestamp> CNTMVL_DATE = createField("CNTMVL_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_AP</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_AP = createField("CNTMVL_AP", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_AM</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_AM = createField("CNTMVL_AM", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_RP</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_RP = createField("CNTMVL_RP", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_RM</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_RM = createField("CNTMVL_RM", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_P</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_P = createField("CNTMVL_P", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_PA</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_PA = createField("CNTMVL_PA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_PB</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_PB = createField("CNTMVL_PB", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_PC</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_PC = createField("CNTMVL_PC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_Q</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_Q = createField("CNTMVL_Q", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_QA</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_QA = createField("CNTMVL_QA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_QB</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_QB = createField("CNTMVL_QB", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_QC</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_QC = createField("CNTMVL_QC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_VA</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_VA = createField("CNTMVL_VA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_VB</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_VB = createField("CNTMVL_VB", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_VC</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_VC = createField("CNTMVL_VC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_IA</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_IA = createField("CNTMVL_IA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_IB</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_IB = createField("CNTMVL_IB", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_IC</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_IC = createField("CNTMVL_IC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_FREQ</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_FREQ = createField("CNTMVL_FREQ", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_COSAB</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_COSAB = createField("CNTMVL_COSAB", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_COSAC</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_COSAC = createField("CNTMVL_COSAC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_COSBC</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_COSBC = createField("CNTMVL_COSBC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_LDATE</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Timestamp> CNTMVL_LDATE = createField("CNTMVL_LDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_SDATE</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Timestamp> CNTMVL_SDATE = createField("CNTMVL_SDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_COS_FI</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_COS_FI = createField("CNTMVL_COS_FI", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_COS_FA</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_COS_FA = createField("CNTMVL_COS_FA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_COS_FB</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_COS_FB = createField("CNTMVL_COS_FB", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_MRCVALUELOG.CNTMVL_COS_FC</code>.
     */
    public final TableField<CntMrcvaluelogRecord, Double> CNTMVL_COS_FC = createField("CNTMVL_COS_FC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>CNT_MRCVALUELOG</code> table reference
     */
    public CntMrcvaluelog() {
        this(DSL.name("CNT_MRCVALUELOG"), null);
    }

    /**
     * Create an aliased <code>CNT_MRCVALUELOG</code> table reference
     */
    public CntMrcvaluelog(String alias) {
        this(DSL.name(alias), CNT_MRCVALUELOG);
    }

    /**
     * Create an aliased <code>CNT_MRCVALUELOG</code> table reference
     */
    public CntMrcvaluelog(Name alias) {
        this(alias, CNT_MRCVALUELOG);
    }

    private CntMrcvaluelog(Name alias, Table<CntMrcvaluelogRecord> aliased) {
        this(alias, aliased, null);
    }

    private CntMrcvaluelog(Name alias, Table<CntMrcvaluelogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CntMrcvaluelog(Table<O> child, ForeignKey<O, CntMrcvaluelogRecord> key) {
        super(child, key, CNT_MRCVALUELOG);
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
    public UniqueKey<CntMrcvaluelogRecord> getPrimaryKey() {
        return Keys.INTEG_37;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CntMrcvaluelogRecord>> getKeys() {
        return Arrays.<UniqueKey<CntMrcvaluelogRecord>>asList(Keys.INTEG_37);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcvaluelog as(String alias) {
        return new CntMrcvaluelog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcvaluelog as(Name alias) {
        return new CntMrcvaluelog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CntMrcvaluelog rename(String name) {
        return new CntMrcvaluelog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CntMrcvaluelog rename(Name name) {
        return new CntMrcvaluelog(name, null);
    }
}
