/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables;


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
import ru.smartsarov.citylighting.sprut.tables.records.LightShiftRecord;


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
public class LightShift extends TableImpl<LightShiftRecord> {

    private static final long serialVersionUID = 1225341780;

    /**
     * The reference instance of <code>LIGHT_SHIFT</code>
     */
    public static final LightShift LIGHT_SHIFT = new LightShift();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LightShiftRecord> getRecordType() {
        return LightShiftRecord.class;
    }

    /**
     * The column <code>LIGHT_SHIFT.LTSHT_ID</code>.
     */
    public final TableField<LightShiftRecord, Integer> LTSHT_ID = createField("LTSHT_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>LIGHT_SHIFT.LTSHT_USK_ID</code>.
     */
    public final TableField<LightShiftRecord, Integer> LTSHT_USK_ID = createField("LTSHT_USK_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>LIGHT_SHIFT.LTSHT_TIME1</code>.
     */
    public final TableField<LightShiftRecord, Integer> LTSHT_TIME1 = createField("LTSHT_TIME1", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>LIGHT_SHIFT.LTSHT_TIME2</code>.
     */
    public final TableField<LightShiftRecord, Integer> LTSHT_TIME2 = createField("LTSHT_TIME2", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>LIGHT_SHIFT.LTSHT_TIME3</code>.
     */
    public final TableField<LightShiftRecord, Integer> LTSHT_TIME3 = createField("LTSHT_TIME3", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>LIGHT_SHIFT.LTSHT_TIME4</code>.
     */
    public final TableField<LightShiftRecord, Integer> LTSHT_TIME4 = createField("LTSHT_TIME4", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>LIGHT_SHIFT.LTSHT_SYNC</code>.
     */
    public final TableField<LightShiftRecord, Integer> LTSHT_SYNC = createField("LTSHT_SYNC", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>LIGHT_SHIFT</code> table reference
     */
    public LightShift() {
        this(DSL.name("LIGHT_SHIFT"), null);
    }

    /**
     * Create an aliased <code>LIGHT_SHIFT</code> table reference
     */
    public LightShift(String alias) {
        this(DSL.name(alias), LIGHT_SHIFT);
    }

    /**
     * Create an aliased <code>LIGHT_SHIFT</code> table reference
     */
    public LightShift(Name alias) {
        this(alias, LIGHT_SHIFT);
    }

    private LightShift(Name alias, Table<LightShiftRecord> aliased) {
        this(alias, aliased, null);
    }

    private LightShift(Name alias, Table<LightShiftRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> LightShift(Table<O> child, ForeignKey<O, LightShiftRecord> key) {
        super(child, key, LIGHT_SHIFT);
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
    public UniqueKey<LightShiftRecord> getPrimaryKey() {
        return Keys.INTEG_192;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LightShiftRecord>> getKeys() {
        return Arrays.<UniqueKey<LightShiftRecord>>asList(Keys.INTEG_192);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightShift as(String alias) {
        return new LightShift(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightShift as(Name alias) {
        return new LightShift(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LightShift rename(String name) {
        return new LightShift(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LightShift rename(Name name) {
        return new LightShift(name, null);
    }
}
