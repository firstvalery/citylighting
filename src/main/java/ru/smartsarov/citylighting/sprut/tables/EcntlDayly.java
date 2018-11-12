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
import ru.smartsarov.citylighting.sprut.tables.records.EcntlDaylyRecord;


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
public class EcntlDayly extends TableImpl<EcntlDaylyRecord> {

    private static final long serialVersionUID = 1863464998;

    /**
     * The reference instance of <code>ECNTL_DAYLY</code>
     */
    public static final EcntlDayly ECNTL_DAYLY = new EcntlDayly();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EcntlDaylyRecord> getRecordType() {
        return EcntlDaylyRecord.class;
    }

    /**
     * The column <code>ECNTL_DAYLY.ECDL_ID</code>.
     */
    public final TableField<EcntlDaylyRecord, Integer> ECDL_ID = createField("ECDL_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ECNTL_DAYLY.ECDL_CNT_ID</code>.
     */
    public final TableField<EcntlDaylyRecord, Integer> ECDL_CNT_ID = createField("ECDL_CNT_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ECNTL_DAYLY.ECDL_CDATE</code>.
     */
    public final TableField<EcntlDaylyRecord, Timestamp> ECDL_CDATE = createField("ECDL_CDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ECNTL_DAYLY.ECDL_SDATE</code>.
     */
    public final TableField<EcntlDaylyRecord, Timestamp> ECDL_SDATE = createField("ECDL_SDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ECNTL_DAYLY.ECDL_EDATE</code>.
     */
    public final TableField<EcntlDaylyRecord, Timestamp> ECDL_EDATE = createField("ECDL_EDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ECNTL_DAYLY.ECDL_TID</code>.
     */
    public final TableField<EcntlDaylyRecord, Integer> ECDL_TID = createField("ECDL_TID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ECNTL_DAYLY.ECDL_COF</code>.
     */
    public final TableField<EcntlDaylyRecord, Double> ECDL_COF = createField("ECDL_COF", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>ECNTL_DAYLY.ECDL_SAP</code>.
     */
    public final TableField<EcntlDaylyRecord, Double> ECDL_SAP = createField("ECDL_SAP", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>ECNTL_DAYLY.ECDL_SAM</code>.
     */
    public final TableField<EcntlDaylyRecord, Double> ECDL_SAM = createField("ECDL_SAM", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>ECNTL_DAYLY.ECDL_SRP</code>.
     */
    public final TableField<EcntlDaylyRecord, Double> ECDL_SRP = createField("ECDL_SRP", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>ECNTL_DAYLY.ECDL_SRM</code>.
     */
    public final TableField<EcntlDaylyRecord, Double> ECDL_SRM = createField("ECDL_SRM", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>ECNTL_DAYLY.ECDL_DAP</code>.
     */
    public final TableField<EcntlDaylyRecord, Double> ECDL_DAP = createField("ECDL_DAP", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>ECNTL_DAYLY.ECDL_DAM</code>.
     */
    public final TableField<EcntlDaylyRecord, Double> ECDL_DAM = createField("ECDL_DAM", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>ECNTL_DAYLY.ECDL_DRP</code>.
     */
    public final TableField<EcntlDaylyRecord, Double> ECDL_DRP = createField("ECDL_DRP", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>ECNTL_DAYLY.ECDL_DRM</code>.
     */
    public final TableField<EcntlDaylyRecord, Double> ECDL_DRM = createField("ECDL_DRM", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>ECNTL_DAYLY.ECDL_EAP</code>.
     */
    public final TableField<EcntlDaylyRecord, Double> ECDL_EAP = createField("ECDL_EAP", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>ECNTL_DAYLY.ECDL_EAM</code>.
     */
    public final TableField<EcntlDaylyRecord, Double> ECDL_EAM = createField("ECDL_EAM", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>ECNTL_DAYLY.ECDL_ERP</code>.
     */
    public final TableField<EcntlDaylyRecord, Double> ECDL_ERP = createField("ECDL_ERP", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>ECNTL_DAYLY.ECDL_ERM</code>.
     */
    public final TableField<EcntlDaylyRecord, Double> ECDL_ERM = createField("ECDL_ERM", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>ECNTL_DAYLY</code> table reference
     */
    public EcntlDayly() {
        this(DSL.name("ECNTL_DAYLY"), null);
    }

    /**
     * Create an aliased <code>ECNTL_DAYLY</code> table reference
     */
    public EcntlDayly(String alias) {
        this(DSL.name(alias), ECNTL_DAYLY);
    }

    /**
     * Create an aliased <code>ECNTL_DAYLY</code> table reference
     */
    public EcntlDayly(Name alias) {
        this(alias, ECNTL_DAYLY);
    }

    private EcntlDayly(Name alias, Table<EcntlDaylyRecord> aliased) {
        this(alias, aliased, null);
    }

    private EcntlDayly(Name alias, Table<EcntlDaylyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EcntlDayly(Table<O> child, ForeignKey<O, EcntlDaylyRecord> key) {
        super(child, key, ECNTL_DAYLY);
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
    public UniqueKey<EcntlDaylyRecord> getPrimaryKey() {
        return Keys.INTEG_40;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EcntlDaylyRecord>> getKeys() {
        return Arrays.<UniqueKey<EcntlDaylyRecord>>asList(Keys.INTEG_40);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EcntlDayly as(String alias) {
        return new EcntlDayly(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EcntlDayly as(Name alias) {
        return new EcntlDayly(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EcntlDayly rename(String name) {
        return new EcntlDayly(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EcntlDayly rename(Name name) {
        return new EcntlDayly(name, null);
    }
}
