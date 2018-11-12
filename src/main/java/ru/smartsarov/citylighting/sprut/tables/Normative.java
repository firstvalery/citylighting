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
import ru.smartsarov.citylighting.sprut.tables.records.NormativeRecord;


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
public class Normative extends TableImpl<NormativeRecord> {

    private static final long serialVersionUID = -402963849;

    /**
     * The reference instance of <code>NORMATIVE</code>
     */
    public static final Normative NORMATIVE = new Normative();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NormativeRecord> getRecordType() {
        return NormativeRecord.class;
    }

    /**
     * The column <code>NORMATIVE.ID</code>.
     */
    public final TableField<NormativeRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>NORMATIVE.NAME</code>.
     */
    public final TableField<NormativeRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(250).nullable(false), this, "");

    /**
     * The column <code>NORMATIVE.DESCRIPTION</code>.
     */
    public final TableField<NormativeRecord, String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column <code>NORMATIVE.CNT_ATYPE</code>.
     */
    public final TableField<NormativeRecord, Integer> CNT_ATYPE = createField("CNT_ATYPE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>NORMATIVE.ABONENT_ID</code>.
     */
    public final TableField<NormativeRecord, Integer> ABONENT_ID = createField("ABONENT_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>NORMATIVE.DAY_FIRST_HOUR</code>.
     */
    public final TableField<NormativeRecord, Integer> DAY_FIRST_HOUR = createField("DAY_FIRST_HOUR", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>NORMATIVE.NIGHT_FIRST_HOUR</code>.
     */
    public final TableField<NormativeRecord, Integer> NIGHT_FIRST_HOUR = createField("NIGHT_FIRST_HOUR", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>NORMATIVE</code> table reference
     */
    public Normative() {
        this(DSL.name("NORMATIVE"), null);
    }

    /**
     * Create an aliased <code>NORMATIVE</code> table reference
     */
    public Normative(String alias) {
        this(DSL.name(alias), NORMATIVE);
    }

    /**
     * Create an aliased <code>NORMATIVE</code> table reference
     */
    public Normative(Name alias) {
        this(alias, NORMATIVE);
    }

    private Normative(Name alias, Table<NormativeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Normative(Name alias, Table<NormativeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Normative(Table<O> child, ForeignKey<O, NormativeRecord> key) {
        super(child, key, NORMATIVE);
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
    public UniqueKey<NormativeRecord> getPrimaryKey() {
        return Keys.NORMATIVE_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<NormativeRecord>> getKeys() {
        return Arrays.<UniqueKey<NormativeRecord>>asList(Keys.NORMATIVE_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Normative as(String alias) {
        return new Normative(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Normative as(Name alias) {
        return new Normative(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Normative rename(String name) {
        return new Normative(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Normative rename(Name name) {
        return new Normative(name, null);
    }
}