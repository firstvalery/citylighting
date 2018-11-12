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
import ru.smartsarov.citylighting.sprut.tables.records.UsklLogRecord;


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
public class UsklLog extends TableImpl<UsklLogRecord> {

    private static final long serialVersionUID = 1115983156;

    /**
     * The reference instance of <code>USKL_LOG</code>
     */
    public static final UsklLog USKL_LOG = new UsklLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsklLogRecord> getRecordType() {
        return UsklLogRecord.class;
    }

    /**
     * The column <code>USKL_LOG.USKLL_ID</code>.
     */
    public final TableField<UsklLogRecord, Integer> USKLL_ID = createField("USKLL_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>USKL_LOG.USKLL_USK_ID</code>.
     */
    public final TableField<UsklLogRecord, Integer> USKLL_USK_ID = createField("USKLL_USK_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>USKL_LOG.USKLL_STIME</code>.
     */
    public final TableField<UsklLogRecord, Timestamp> USKLL_STIME = createField("USKLL_STIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>USKL_LOG.USKLL_EVENT</code>.
     */
    public final TableField<UsklLogRecord, String> USKLL_EVENT = createField("USKLL_EVENT", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>USKL_LOG.USKLL_EVENT_TYPE</code>.
     */
    public final TableField<UsklLogRecord, Integer> USKLL_EVENT_TYPE = createField("USKLL_EVENT_TYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>USKL_LOG</code> table reference
     */
    public UsklLog() {
        this(DSL.name("USKL_LOG"), null);
    }

    /**
     * Create an aliased <code>USKL_LOG</code> table reference
     */
    public UsklLog(String alias) {
        this(DSL.name(alias), USKL_LOG);
    }

    /**
     * Create an aliased <code>USKL_LOG</code> table reference
     */
    public UsklLog(Name alias) {
        this(alias, USKL_LOG);
    }

    private UsklLog(Name alias, Table<UsklLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private UsklLog(Name alias, Table<UsklLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UsklLog(Table<O> child, ForeignKey<O, UsklLogRecord> key) {
        super(child, key, USKL_LOG);
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
    public UniqueKey<UsklLogRecord> getPrimaryKey() {
        return Keys.USKL_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UsklLogRecord>> getKeys() {
        return Arrays.<UniqueKey<UsklLogRecord>>asList(Keys.USKL_LOG);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsklLog as(String alias) {
        return new UsklLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsklLog as(Name alias) {
        return new UsklLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UsklLog rename(String name) {
        return new UsklLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UsklLog rename(Name name) {
        return new UsklLog(name, null);
    }
}
