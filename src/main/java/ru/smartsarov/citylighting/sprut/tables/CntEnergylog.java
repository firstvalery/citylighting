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
import ru.smartsarov.citylighting.sprut.tables.records.CntEnergylogRecord;


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
public class CntEnergylog extends TableImpl<CntEnergylogRecord> {

    private static final long serialVersionUID = -1633426216;

    /**
     * The reference instance of <code>CNT_ENERGYLOG</code>
     */
    public static final CntEnergylog CNT_ENERGYLOG = new CntEnergylog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CntEnergylogRecord> getRecordType() {
        return CntEnergylogRecord.class;
    }

    /**
     * The column <code>CNT_ENERGYLOG.CNTEL_ID</code>.
     */
    public final TableField<CntEnergylogRecord, Integer> CNTEL_ID = createField("CNTEL_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CNT_ENERGYLOG.CNTEL_CID</code>.
     */
    public final TableField<CntEnergylogRecord, Integer> CNTEL_CID = createField("CNTEL_CID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CNT_ENERGYLOG.CNTEL_DATE</code>.
     */
    public final TableField<CntEnergylogRecord, Timestamp> CNTEL_DATE = createField("CNTEL_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>CNT_ENERGYLOG.CNTEL_Q</code>.
     */
    public final TableField<CntEnergylogRecord, Double> CNTEL_Q = createField("CNTEL_Q", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_ENERGYLOG.CNTEL_Q1</code>.
     */
    public final TableField<CntEnergylogRecord, Double> CNTEL_Q1 = createField("CNTEL_Q1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_ENERGYLOG.CNTEL_Q2</code>.
     */
    public final TableField<CntEnergylogRecord, Double> CNTEL_Q2 = createField("CNTEL_Q2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_ENERGYLOG.CNTEL_Q3</code>.
     */
    public final TableField<CntEnergylogRecord, Double> CNTEL_Q3 = createField("CNTEL_Q3", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_ENERGYLOG.CNTEL_Q4</code>.
     */
    public final TableField<CntEnergylogRecord, Double> CNTEL_Q4 = createField("CNTEL_Q4", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CNT_ENERGYLOG.CNTEL_SDATE</code>.
     */
    public final TableField<CntEnergylogRecord, Timestamp> CNTEL_SDATE = createField("CNTEL_SDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>CNT_ENERGYLOG</code> table reference
     */
    public CntEnergylog() {
        this(DSL.name("CNT_ENERGYLOG"), null);
    }

    /**
     * Create an aliased <code>CNT_ENERGYLOG</code> table reference
     */
    public CntEnergylog(String alias) {
        this(DSL.name(alias), CNT_ENERGYLOG);
    }

    /**
     * Create an aliased <code>CNT_ENERGYLOG</code> table reference
     */
    public CntEnergylog(Name alias) {
        this(alias, CNT_ENERGYLOG);
    }

    private CntEnergylog(Name alias, Table<CntEnergylogRecord> aliased) {
        this(alias, aliased, null);
    }

    private CntEnergylog(Name alias, Table<CntEnergylogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CntEnergylog(Table<O> child, ForeignKey<O, CntEnergylogRecord> key) {
        super(child, key, CNT_ENERGYLOG);
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
    public UniqueKey<CntEnergylogRecord> getPrimaryKey() {
        return Keys.INTEG_28;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CntEnergylogRecord>> getKeys() {
        return Arrays.<UniqueKey<CntEnergylogRecord>>asList(Keys.INTEG_28);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntEnergylog as(String alias) {
        return new CntEnergylog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntEnergylog as(Name alias) {
        return new CntEnergylog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CntEnergylog rename(String name) {
        return new CntEnergylog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CntEnergylog rename(Name name) {
        return new CntEnergylog(name, null);
    }
}