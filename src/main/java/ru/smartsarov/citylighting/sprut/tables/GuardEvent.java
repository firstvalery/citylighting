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
import ru.smartsarov.citylighting.sprut.tables.records.GuardEventRecord;


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
public class GuardEvent extends TableImpl<GuardEventRecord> {

    private static final long serialVersionUID = -1110571171;

    /**
     * The reference instance of <code>GUARD_EVENT</code>
     */
    public static final GuardEvent GUARD_EVENT = new GuardEvent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GuardEventRecord> getRecordType() {
        return GuardEventRecord.class;
    }

    /**
     * The column <code>GUARD_EVENT.GRDET_ID</code>.
     */
    public final TableField<GuardEventRecord, Integer> GRDET_ID = createField("GRDET_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GUARD_EVENT.GRDET_NAME</code>.
     */
    public final TableField<GuardEventRecord, String> GRDET_NAME = createField("GRDET_NAME", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * Create a <code>GUARD_EVENT</code> table reference
     */
    public GuardEvent() {
        this(DSL.name("GUARD_EVENT"), null);
    }

    /**
     * Create an aliased <code>GUARD_EVENT</code> table reference
     */
    public GuardEvent(String alias) {
        this(DSL.name(alias), GUARD_EVENT);
    }

    /**
     * Create an aliased <code>GUARD_EVENT</code> table reference
     */
    public GuardEvent(Name alias) {
        this(alias, GUARD_EVENT);
    }

    private GuardEvent(Name alias, Table<GuardEventRecord> aliased) {
        this(alias, aliased, null);
    }

    private GuardEvent(Name alias, Table<GuardEventRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GuardEvent(Table<O> child, ForeignKey<O, GuardEventRecord> key) {
        super(child, key, GUARD_EVENT);
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
    public UniqueKey<GuardEventRecord> getPrimaryKey() {
        return Keys.INTEG_65;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GuardEventRecord>> getKeys() {
        return Arrays.<UniqueKey<GuardEventRecord>>asList(Keys.INTEG_65);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardEvent as(String alias) {
        return new GuardEvent(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardEvent as(Name alias) {
        return new GuardEvent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GuardEvent rename(String name) {
        return new GuardEvent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GuardEvent rename(Name name) {
        return new GuardEvent(name, null);
    }
}
