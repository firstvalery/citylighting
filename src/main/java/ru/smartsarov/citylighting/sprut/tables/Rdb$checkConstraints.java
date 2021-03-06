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
import ru.smartsarov.citylighting.sprut.tables.records.Rdb$checkConstraintsRecord;


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
public class Rdb$checkConstraints extends TableImpl<Rdb$checkConstraintsRecord> {

    private static final long serialVersionUID = 407602735;

    /**
     * The reference instance of <code>RDB$CHECK_CONSTRAINTS</code>
     */
    public static final Rdb$checkConstraints RDB$CHECK_CONSTRAINTS = new Rdb$checkConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Rdb$checkConstraintsRecord> getRecordType() {
        return Rdb$checkConstraintsRecord.class;
    }

    /**
     * The column <code>RDB$CHECK_CONSTRAINTS.RDB$CONSTRAINT_NAME</code>.
     */
    public final TableField<Rdb$checkConstraintsRecord, String> RDB$CONSTRAINT_NAME = createField("RDB$CONSTRAINT_NAME", org.jooq.impl.SQLDataType.CHAR, this, "");

    /**
     * The column <code>RDB$CHECK_CONSTRAINTS.RDB$TRIGGER_NAME</code>.
     */
    public final TableField<Rdb$checkConstraintsRecord, String> RDB$TRIGGER_NAME = createField("RDB$TRIGGER_NAME", org.jooq.impl.SQLDataType.CHAR, this, "");

    /**
     * Create a <code>RDB$CHECK_CONSTRAINTS</code> table reference
     */
    public Rdb$checkConstraints() {
        this(DSL.name("RDB$CHECK_CONSTRAINTS"), null);
    }

    /**
     * Create an aliased <code>RDB$CHECK_CONSTRAINTS</code> table reference
     */
    public Rdb$checkConstraints(String alias) {
        this(DSL.name(alias), RDB$CHECK_CONSTRAINTS);
    }

    /**
     * Create an aliased <code>RDB$CHECK_CONSTRAINTS</code> table reference
     */
    public Rdb$checkConstraints(Name alias) {
        this(alias, RDB$CHECK_CONSTRAINTS);
    }

    private Rdb$checkConstraints(Name alias, Table<Rdb$checkConstraintsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Rdb$checkConstraints(Name alias, Table<Rdb$checkConstraintsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Rdb$checkConstraints(Table<O> child, ForeignKey<O, Rdb$checkConstraintsRecord> key) {
        super(child, key, RDB$CHECK_CONSTRAINTS);
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
    public Rdb$checkConstraints as(String alias) {
        return new Rdb$checkConstraints(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$checkConstraints as(Name alias) {
        return new Rdb$checkConstraints(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$checkConstraints rename(String name) {
        return new Rdb$checkConstraints(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$checkConstraints rename(Name name) {
        return new Rdb$checkConstraints(name, null);
    }
}
