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
import ru.smartsarov.citylighting.sprut.tables.records.Rdb$pagesRecord;


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
public class Rdb$pages extends TableImpl<Rdb$pagesRecord> {

    private static final long serialVersionUID = 1667000417;

    /**
     * The reference instance of <code>RDB$PAGES</code>
     */
    public static final Rdb$pages RDB$PAGES = new Rdb$pages();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Rdb$pagesRecord> getRecordType() {
        return Rdb$pagesRecord.class;
    }

    /**
     * The column <code>RDB$PAGES.RDB$PAGE_NUMBER</code>.
     */
    public final TableField<Rdb$pagesRecord, Integer> RDB$PAGE_NUMBER = createField("RDB$PAGE_NUMBER", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>RDB$PAGES.RDB$RELATION_ID</code>.
     */
    public final TableField<Rdb$pagesRecord, Short> RDB$RELATION_ID = createField("RDB$RELATION_ID", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$PAGES.RDB$PAGE_SEQUENCE</code>.
     */
    public final TableField<Rdb$pagesRecord, Integer> RDB$PAGE_SEQUENCE = createField("RDB$PAGE_SEQUENCE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>RDB$PAGES.RDB$PAGE_TYPE</code>.
     */
    public final TableField<Rdb$pagesRecord, Short> RDB$PAGE_TYPE = createField("RDB$PAGE_TYPE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>RDB$PAGES</code> table reference
     */
    public Rdb$pages() {
        this(DSL.name("RDB$PAGES"), null);
    }

    /**
     * Create an aliased <code>RDB$PAGES</code> table reference
     */
    public Rdb$pages(String alias) {
        this(DSL.name(alias), RDB$PAGES);
    }

    /**
     * Create an aliased <code>RDB$PAGES</code> table reference
     */
    public Rdb$pages(Name alias) {
        this(alias, RDB$PAGES);
    }

    private Rdb$pages(Name alias, Table<Rdb$pagesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Rdb$pages(Name alias, Table<Rdb$pagesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Rdb$pages(Table<O> child, ForeignKey<O, Rdb$pagesRecord> key) {
        super(child, key, RDB$PAGES);
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
    public Rdb$pages as(String alias) {
        return new Rdb$pages(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$pages as(Name alias) {
        return new Rdb$pages(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$pages rename(String name) {
        return new Rdb$pages(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$pages rename(Name name) {
        return new Rdb$pages(name, null);
    }
}
