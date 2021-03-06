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
import ru.smartsarov.citylighting.sprut.tables.records.UskLogRecord;


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
public class UskLog extends TableImpl<UskLogRecord> {

    private static final long serialVersionUID = -1203438315;

    /**
     * The reference instance of <code>USK_LOG</code>
     */
    public static final UskLog USK_LOG = new UskLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UskLogRecord> getRecordType() {
        return UskLogRecord.class;
    }

    /**
     * The column <code>USK_LOG.USKL_ID</code>.
     */
    public final TableField<UskLogRecord, Integer> USKL_ID = createField("USKL_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>USK_LOG.USKL_USK_ID</code>.
     */
    public final TableField<UskLogRecord, Integer> USKL_USK_ID = createField("USKL_USK_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>USK_LOG.USKL_STIME</code>.
     */
    public final TableField<UskLogRecord, Timestamp> USKL_STIME = createField("USKL_STIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>USK_LOG.USKL_STATE</code>.
     */
    public final TableField<UskLogRecord, Integer> USKL_STATE = createField("USKL_STATE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>USK_LOG.USKL_V</code>.
     */
    public final TableField<UskLogRecord, Double> USKL_V = createField("USKL_V", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>USK_LOG.USKL_T</code>.
     */
    public final TableField<UskLogRecord, Double> USKL_T = createField("USKL_T", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>USK_LOG.USKL_VADC</code>.
     */
    public final TableField<UskLogRecord, Integer> USKL_VADC = createField("USKL_VADC", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>USK_LOG.USKL_TADC</code>.
     */
    public final TableField<UskLogRecord, Integer> USKL_TADC = createField("USKL_TADC", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>USK_LOG.USKL_UPTIME_SEC</code>.
     */
    public final TableField<UskLogRecord, Integer> USKL_UPTIME_SEC = createField("USKL_UPTIME_SEC", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>USK_LOG.USKL_SENSOR</code>.
     */
    public final TableField<UskLogRecord, Integer> USKL_SENSOR = createField("USKL_SENSOR", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>USK_LOG.USKL_SIGNAL_LEVEL</code>.
     */
    public final TableField<UskLogRecord, Integer> USKL_SIGNAL_LEVEL = createField("USKL_SIGNAL_LEVEL", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>USK_LOG.USKL_MODEM_STAT</code>.
     */
    public final TableField<UskLogRecord, Integer> USKL_MODEM_STAT = createField("USKL_MODEM_STAT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>USK_LOG</code> table reference
     */
    public UskLog() {
        this(DSL.name("USK_LOG"), null);
    }

    /**
     * Create an aliased <code>USK_LOG</code> table reference
     */
    public UskLog(String alias) {
        this(DSL.name(alias), USK_LOG);
    }

    /**
     * Create an aliased <code>USK_LOG</code> table reference
     */
    public UskLog(Name alias) {
        this(alias, USK_LOG);
    }

    private UskLog(Name alias, Table<UskLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private UskLog(Name alias, Table<UskLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UskLog(Table<O> child, ForeignKey<O, UskLogRecord> key) {
        super(child, key, USK_LOG);
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
    public UniqueKey<UskLogRecord> getPrimaryKey() {
        return Keys.USK_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UskLogRecord>> getKeys() {
        return Arrays.<UniqueKey<UskLogRecord>>asList(Keys.USK_LOG);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskLog as(String alias) {
        return new UskLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskLog as(Name alias) {
        return new UskLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UskLog rename(String name) {
        return new UskLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UskLog rename(Name name) {
        return new UskLog(name, null);
    }
}
