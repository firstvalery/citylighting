/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.smartsarov.citylighting.sprut.DefaultSchema;
import ru.smartsarov.citylighting.sprut.tables.records.Mon$recordStatsRecord;


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
public class Mon$recordStats extends TableImpl<Mon$recordStatsRecord> {

    private static final long serialVersionUID = 609539517;

    /**
     * The reference instance of <code>MON$RECORD_STATS</code>
     */
    public static final Mon$recordStats MON$RECORD_STATS = new Mon$recordStats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Mon$recordStatsRecord> getRecordType() {
        return Mon$recordStatsRecord.class;
    }

    /**
     * The column <code>MON$RECORD_STATS.MON$STAT_ID</code>.
     */
    public final TableField<Mon$recordStatsRecord, Integer> MON$STAT_ID = createField("MON$STAT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>MON$RECORD_STATS.MON$STAT_GROUP</code>.
     */
    public final TableField<Mon$recordStatsRecord, Short> MON$STAT_GROUP = createField("MON$STAT_GROUP", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>MON$RECORD_STATS.MON$RECORD_SEQ_READS</code>.
     */
    public final TableField<Mon$recordStatsRecord, Long> MON$RECORD_SEQ_READS = createField("MON$RECORD_SEQ_READS", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>MON$RECORD_STATS.MON$RECORD_IDX_READS</code>.
     */
    public final TableField<Mon$recordStatsRecord, Long> MON$RECORD_IDX_READS = createField("MON$RECORD_IDX_READS", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>MON$RECORD_STATS.MON$RECORD_INSERTS</code>.
     */
    public final TableField<Mon$recordStatsRecord, Long> MON$RECORD_INSERTS = createField("MON$RECORD_INSERTS", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>MON$RECORD_STATS.MON$RECORD_UPDATES</code>.
     */
    public final TableField<Mon$recordStatsRecord, Long> MON$RECORD_UPDATES = createField("MON$RECORD_UPDATES", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>MON$RECORD_STATS.MON$RECORD_DELETES</code>.
     */
    public final TableField<Mon$recordStatsRecord, Long> MON$RECORD_DELETES = createField("MON$RECORD_DELETES", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>MON$RECORD_STATS.MON$RECORD_BACKOUTS</code>.
     */
    public final TableField<Mon$recordStatsRecord, Long> MON$RECORD_BACKOUTS = createField("MON$RECORD_BACKOUTS", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>MON$RECORD_STATS.MON$RECORD_PURGES</code>.
     */
    public final TableField<Mon$recordStatsRecord, Long> MON$RECORD_PURGES = createField("MON$RECORD_PURGES", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>MON$RECORD_STATS.MON$RECORD_EXPUNGES</code>.
     */
    public final TableField<Mon$recordStatsRecord, Long> MON$RECORD_EXPUNGES = createField("MON$RECORD_EXPUNGES", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>MON$RECORD_STATS</code> table reference
     */
    public Mon$recordStats() {
        this(DSL.name("MON$RECORD_STATS"), null);
    }

    /**
     * Create an aliased <code>MON$RECORD_STATS</code> table reference
     */
    public Mon$recordStats(String alias) {
        this(DSL.name(alias), MON$RECORD_STATS);
    }

    /**
     * Create an aliased <code>MON$RECORD_STATS</code> table reference
     */
    public Mon$recordStats(Name alias) {
        this(alias, MON$RECORD_STATS);
    }

    private Mon$recordStats(Name alias, Table<Mon$recordStatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Mon$recordStats(Name alias, Table<Mon$recordStatsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Mon$recordStats(Table<O> child, ForeignKey<O, Mon$recordStatsRecord> key) {
        super(child, key, MON$RECORD_STATS);
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
    public Mon$recordStats as(String alias) {
        return new Mon$recordStats(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$recordStats as(Name alias) {
        return new Mon$recordStats(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Mon$recordStats rename(String name) {
        return new Mon$recordStats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Mon$recordStats rename(Name name) {
        return new Mon$recordStats(name, null);
    }
}
