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
import ru.smartsarov.citylighting.sprut.tables.records.UskSysEventRecord;


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
public class UskSysEvent extends TableImpl<UskSysEventRecord> {

    private static final long serialVersionUID = 859856657;

    /**
     * The reference instance of <code>USK_SYS_EVENT</code>
     */
    public static final UskSysEvent USK_SYS_EVENT = new UskSysEvent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UskSysEventRecord> getRecordType() {
        return UskSysEventRecord.class;
    }

    /**
     * The column <code>USK_SYS_EVENT.USKSE_ID</code>.
     */
    public final TableField<UskSysEventRecord, Integer> USKSE_ID = createField("USKSE_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>USK_SYS_EVENT.USKSE_EVENT</code>.
     */
    public final TableField<UskSysEventRecord, String> USKSE_EVENT = createField("USKSE_EVENT", org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * Create a <code>USK_SYS_EVENT</code> table reference
     */
    public UskSysEvent() {
        this(DSL.name("USK_SYS_EVENT"), null);
    }

    /**
     * Create an aliased <code>USK_SYS_EVENT</code> table reference
     */
    public UskSysEvent(String alias) {
        this(DSL.name(alias), USK_SYS_EVENT);
    }

    /**
     * Create an aliased <code>USK_SYS_EVENT</code> table reference
     */
    public UskSysEvent(Name alias) {
        this(alias, USK_SYS_EVENT);
    }

    private UskSysEvent(Name alias, Table<UskSysEventRecord> aliased) {
        this(alias, aliased, null);
    }

    private UskSysEvent(Name alias, Table<UskSysEventRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UskSysEvent(Table<O> child, ForeignKey<O, UskSysEventRecord> key) {
        super(child, key, USK_SYS_EVENT);
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
    public UniqueKey<UskSysEventRecord> getPrimaryKey() {
        return Keys.USK_SYS_EVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UskSysEventRecord>> getKeys() {
        return Arrays.<UniqueKey<UskSysEventRecord>>asList(Keys.USK_SYS_EVENT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskSysEvent as(String alias) {
        return new UskSysEvent(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskSysEvent as(Name alias) {
        return new UskSysEvent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UskSysEvent rename(String name) {
        return new UskSysEvent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UskSysEvent rename(Name name) {
        return new UskSysEvent(name, null);
    }
}
