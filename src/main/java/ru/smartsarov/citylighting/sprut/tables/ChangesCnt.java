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
import ru.smartsarov.citylighting.sprut.tables.records.ChangesCntRecord;


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
public class ChangesCnt extends TableImpl<ChangesCntRecord> {

    private static final long serialVersionUID = 730091566;

    /**
     * The reference instance of <code>CHANGES_CNT</code>
     */
    public static final ChangesCnt CHANGES_CNT = new ChangesCnt();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ChangesCntRecord> getRecordType() {
        return ChangesCntRecord.class;
    }

    /**
     * The column <code>CHANGES_CNT.ID</code>.
     */
    public final TableField<ChangesCntRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CHANGES_CNT.LOGIN</code>.
     */
    public final TableField<ChangesCntRecord, String> LOGIN = createField("LOGIN", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>CHANGES_CNT.CHANGE_TIME</code>.
     */
    public final TableField<ChangesCntRecord, Timestamp> CHANGE_TIME = createField("CHANGE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>CHANGES_CNT.CHANGE_TYPE</code>.
     */
    public final TableField<ChangesCntRecord, Integer> CHANGE_TYPE = createField("CHANGE_TYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_ID</code>.
     */
    public final TableField<ChangesCntRecord, Integer> CNT_ID = createField("CNT_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_PID</code>.
     */
    public final TableField<ChangesCntRecord, Integer> CNT_PID = createField("CNT_PID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_AB_ID</code>.
     */
    public final TableField<ChangesCntRecord, Integer> CNT_AB_ID = createField("CNT_AB_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_UNK_ID</code>.
     */
    public final TableField<ChangesCntRecord, Integer> CNT_UNK_ID = createField("CNT_UNK_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_ATYPE</code>.
     */
    public final TableField<ChangesCntRecord, Integer> CNT_ATYPE = createField("CNT_ATYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_BTYPE</code>.
     */
    public final TableField<ChangesCntRecord, Integer> CNT_BTYPE = createField("CNT_BTYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_SNUM</code>.
     */
    public final TableField<ChangesCntRecord, String> CNT_SNUM = createField("CNT_SNUM", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_NETADR</code>.
     */
    public final TableField<ChangesCntRecord, String> CNT_NETADR = createField("CNT_NETADR", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_ENTRY</code>.
     */
    public final TableField<ChangesCntRecord, Integer> CNT_ENTRY = createField("CNT_ENTRY", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_QTIME</code>.
     */
    public final TableField<ChangesCntRecord, Integer> CNT_QTIME = createField("CNT_QTIME", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_REQUEST</code>.
     */
    public final TableField<ChangesCntRecord, Integer> CNT_REQUEST = createField("CNT_REQUEST", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_NAME</code>.
     */
    public final TableField<ChangesCntRecord, String> CNT_NAME = createField("CNT_NAME", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_ADR_ID</code>.
     */
    public final TableField<ChangesCntRecord, Integer> CNT_ADR_ID = createField("CNT_ADR_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_STARTVALUE</code>.
     */
    public final TableField<ChangesCntRecord, Double> CNT_STARTVALUE = createField("CNT_STARTVALUE", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_CORRECTION</code>.
     */
    public final TableField<ChangesCntRecord, Double> CNT_CORRECTION = createField("CNT_CORRECTION", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_TRANSFORMATION</code>.
     */
    public final TableField<ChangesCntRecord, Double> CNT_TRANSFORMATION = createField("CNT_TRANSFORMATION", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_MAXPOWER</code>.
     */
    public final TableField<ChangesCntRecord, Double> CNT_MAXPOWER = createField("CNT_MAXPOWER", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_MNGLINE</code>.
     */
    public final TableField<ChangesCntRecord, Integer> CNT_MNGLINE = createField("CNT_MNGLINE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_SDATE</code>.
     */
    public final TableField<ChangesCntRecord, Timestamp> CNT_SDATE = createField("CNT_SDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_EDATE</code>.
     */
    public final TableField<ChangesCntRecord, Timestamp> CNT_EDATE = createField("CNT_EDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_VALUE1</code>.
     */
    public final TableField<ChangesCntRecord, Double> CNT_VALUE1 = createField("CNT_VALUE1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_VALUE2</code>.
     */
    public final TableField<ChangesCntRecord, Double> CNT_VALUE2 = createField("CNT_VALUE2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_VALUE3</code>.
     */
    public final TableField<ChangesCntRecord, Double> CNT_VALUE3 = createField("CNT_VALUE3", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_CHANNEL</code>.
     */
    public final TableField<ChangesCntRecord, Integer> CNT_CHANNEL = createField("CNT_CHANNEL", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_NUM_ABONENT</code>.
     */
    public final TableField<ChangesCntRecord, String> CNT_NUM_ABONENT = createField("CNT_NUM_ABONENT", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_CTYPE</code>.
     */
    public final TableField<ChangesCntRecord, Integer> CNT_CTYPE = createField("CNT_CTYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CHANGES_CNT.CNT_EXT_MOD</code>.
     */
    public final TableField<ChangesCntRecord, Integer> CNT_EXT_MOD = createField("CNT_EXT_MOD", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>CHANGES_CNT</code> table reference
     */
    public ChangesCnt() {
        this(DSL.name("CHANGES_CNT"), null);
    }

    /**
     * Create an aliased <code>CHANGES_CNT</code> table reference
     */
    public ChangesCnt(String alias) {
        this(DSL.name(alias), CHANGES_CNT);
    }

    /**
     * Create an aliased <code>CHANGES_CNT</code> table reference
     */
    public ChangesCnt(Name alias) {
        this(alias, CHANGES_CNT);
    }

    private ChangesCnt(Name alias, Table<ChangesCntRecord> aliased) {
        this(alias, aliased, null);
    }

    private ChangesCnt(Name alias, Table<ChangesCntRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ChangesCnt(Table<O> child, ForeignKey<O, ChangesCntRecord> key) {
        super(child, key, CHANGES_CNT);
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
    public UniqueKey<ChangesCntRecord> getPrimaryKey() {
        return Keys.CHANGES_CNT_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ChangesCntRecord>> getKeys() {
        return Arrays.<UniqueKey<ChangesCntRecord>>asList(Keys.CHANGES_CNT_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangesCnt as(String alias) {
        return new ChangesCnt(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangesCnt as(Name alias) {
        return new ChangesCnt(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ChangesCnt rename(String name) {
        return new ChangesCnt(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ChangesCnt rename(Name name) {
        return new ChangesCnt(name, null);
    }
}