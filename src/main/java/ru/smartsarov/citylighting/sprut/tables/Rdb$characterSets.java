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
import ru.smartsarov.citylighting.sprut.tables.records.Rdb$characterSetsRecord;


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
public class Rdb$characterSets extends TableImpl<Rdb$characterSetsRecord> {

    private static final long serialVersionUID = 1025531173;

    /**
     * The reference instance of <code>RDB$CHARACTER_SETS</code>
     */
    public static final Rdb$characterSets RDB$CHARACTER_SETS = new Rdb$characterSets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Rdb$characterSetsRecord> getRecordType() {
        return Rdb$characterSetsRecord.class;
    }

    /**
     * The column <code>RDB$CHARACTER_SETS.RDB$CHARACTER_SET_NAME</code>.
     */
    public final TableField<Rdb$characterSetsRecord, String> RDB$CHARACTER_SET_NAME = createField("RDB$CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.CHAR, this, "");

    /**
     * The column <code>RDB$CHARACTER_SETS.RDB$FORM_OF_USE</code>.
     */
    public final TableField<Rdb$characterSetsRecord, String> RDB$FORM_OF_USE = createField("RDB$FORM_OF_USE", org.jooq.impl.SQLDataType.CHAR, this, "");

    /**
     * The column <code>RDB$CHARACTER_SETS.RDB$NUMBER_OF_CHARACTERS</code>.
     */
    public final TableField<Rdb$characterSetsRecord, Integer> RDB$NUMBER_OF_CHARACTERS = createField("RDB$NUMBER_OF_CHARACTERS", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>RDB$CHARACTER_SETS.RDB$DEFAULT_COLLATE_NAME</code>.
     */
    public final TableField<Rdb$characterSetsRecord, String> RDB$DEFAULT_COLLATE_NAME = createField("RDB$DEFAULT_COLLATE_NAME", org.jooq.impl.SQLDataType.CHAR, this, "");

    /**
     * The column <code>RDB$CHARACTER_SETS.RDB$CHARACTER_SET_ID</code>.
     */
    public final TableField<Rdb$characterSetsRecord, Short> RDB$CHARACTER_SET_ID = createField("RDB$CHARACTER_SET_ID", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$CHARACTER_SETS.RDB$SYSTEM_FLAG</code>.
     */
    public final TableField<Rdb$characterSetsRecord, Short> RDB$SYSTEM_FLAG = createField("RDB$SYSTEM_FLAG", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$CHARACTER_SETS.RDB$DESCRIPTION</code>.
     */
    public final TableField<Rdb$characterSetsRecord, String> RDB$DESCRIPTION = createField("RDB$DESCRIPTION", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>RDB$CHARACTER_SETS.RDB$FUNCTION_NAME</code>.
     */
    public final TableField<Rdb$characterSetsRecord, String> RDB$FUNCTION_NAME = createField("RDB$FUNCTION_NAME", org.jooq.impl.SQLDataType.CHAR, this, "");

    /**
     * The column <code>RDB$CHARACTER_SETS.RDB$BYTES_PER_CHARACTER</code>.
     */
    public final TableField<Rdb$characterSetsRecord, Short> RDB$BYTES_PER_CHARACTER = createField("RDB$BYTES_PER_CHARACTER", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>RDB$CHARACTER_SETS</code> table reference
     */
    public Rdb$characterSets() {
        this(DSL.name("RDB$CHARACTER_SETS"), null);
    }

    /**
     * Create an aliased <code>RDB$CHARACTER_SETS</code> table reference
     */
    public Rdb$characterSets(String alias) {
        this(DSL.name(alias), RDB$CHARACTER_SETS);
    }

    /**
     * Create an aliased <code>RDB$CHARACTER_SETS</code> table reference
     */
    public Rdb$characterSets(Name alias) {
        this(alias, RDB$CHARACTER_SETS);
    }

    private Rdb$characterSets(Name alias, Table<Rdb$characterSetsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Rdb$characterSets(Name alias, Table<Rdb$characterSetsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Rdb$characterSets(Table<O> child, ForeignKey<O, Rdb$characterSetsRecord> key) {
        super(child, key, RDB$CHARACTER_SETS);
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
    public Rdb$characterSets as(String alias) {
        return new Rdb$characterSets(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$characterSets as(Name alias) {
        return new Rdb$characterSets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$characterSets rename(String name) {
        return new Rdb$characterSets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$characterSets rename(Name name) {
        return new Rdb$characterSets(name, null);
    }
}
