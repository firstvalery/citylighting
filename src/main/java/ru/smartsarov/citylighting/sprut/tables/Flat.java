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
import ru.smartsarov.citylighting.sprut.tables.records.FlatRecord;


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
public class Flat extends TableImpl<FlatRecord> {

    private static final long serialVersionUID = -647013297;

    /**
     * The reference instance of <code>FLAT</code>
     */
    public static final Flat FLAT = new Flat();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FlatRecord> getRecordType() {
        return FlatRecord.class;
    }

    /**
     * The column <code>FLAT.FLT_ID</code>.
     */
    public final TableField<FlatRecord, Integer> FLT_ID = createField("FLT_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>FLAT.FLT_HOME_ID</code>.
     */
    public final TableField<FlatRecord, Integer> FLT_HOME_ID = createField("FLT_HOME_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>FLAT.FLT_PD</code>.
     */
    public final TableField<FlatRecord, String> FLT_PD = createField("FLT_PD", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>FLAT.FLT_ET</code>.
     */
    public final TableField<FlatRecord, Integer> FLT_ET = createField("FLT_ET", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>FLAT.FLT_KV</code>.
     */
    public final TableField<FlatRecord, String> FLT_KV = createField("FLT_KV", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>FLAT.FLT_KA</code>.
     */
    public final TableField<FlatRecord, String> FLT_KA = createField("FLT_KA", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>FLAT.FLT_SQUARE</code>.
     */
    public final TableField<FlatRecord, Double> FLT_SQUARE = createField("FLT_SQUARE", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>FLAT.FLT_NUM_PERSONS</code>.
     */
    public final TableField<FlatRecord, Integer> FLT_NUM_PERSONS = createField("FLT_NUM_PERSONS", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>FLAT</code> table reference
     */
    public Flat() {
        this(DSL.name("FLAT"), null);
    }

    /**
     * Create an aliased <code>FLAT</code> table reference
     */
    public Flat(String alias) {
        this(DSL.name(alias), FLAT);
    }

    /**
     * Create an aliased <code>FLAT</code> table reference
     */
    public Flat(Name alias) {
        this(alias, FLAT);
    }

    private Flat(Name alias, Table<FlatRecord> aliased) {
        this(alias, aliased, null);
    }

    private Flat(Name alias, Table<FlatRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Flat(Table<O> child, ForeignKey<O, FlatRecord> key) {
        super(child, key, FLAT);
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
    public UniqueKey<FlatRecord> getPrimaryKey() {
        return Keys.INTEG_7;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FlatRecord>> getKeys() {
        return Arrays.<UniqueKey<FlatRecord>>asList(Keys.INTEG_7);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Flat as(String alias) {
        return new Flat(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Flat as(Name alias) {
        return new Flat(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Flat rename(String name) {
        return new Flat(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Flat rename(Name name) {
        return new Flat(name, null);
    }
}