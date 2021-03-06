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
import ru.smartsarov.citylighting.sprut.tables.records.LightBlockRecord;


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
public class LightBlock extends TableImpl<LightBlockRecord> {

    private static final long serialVersionUID = 1956947998;

    /**
     * The reference instance of <code>LIGHT_BLOCK</code>
     */
    public static final LightBlock LIGHT_BLOCK = new LightBlock();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LightBlockRecord> getRecordType() {
        return LightBlockRecord.class;
    }

    /**
     * The column <code>LIGHT_BLOCK.ID</code>.
     */
    public final TableField<LightBlockRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>LIGHT_BLOCK.USK_ID</code>.
     */
    public final TableField<LightBlockRecord, Integer> USK_ID = createField("USK_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>LIGHT_BLOCK.BLOCK_STANDALONE</code>.
     */
    public final TableField<LightBlockRecord, Integer> BLOCK_STANDALONE = createField("BLOCK_STANDALONE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>LIGHT_BLOCK.BLOCK_ALL</code>.
     */
    public final TableField<LightBlockRecord, Integer> BLOCK_ALL = createField("BLOCK_ALL", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>LIGHT_BLOCK.SYNCED</code>.
     */
    public final TableField<LightBlockRecord, Integer> SYNCED = createField("SYNCED", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>LIGHT_BLOCK</code> table reference
     */
    public LightBlock() {
        this(DSL.name("LIGHT_BLOCK"), null);
    }

    /**
     * Create an aliased <code>LIGHT_BLOCK</code> table reference
     */
    public LightBlock(String alias) {
        this(DSL.name(alias), LIGHT_BLOCK);
    }

    /**
     * Create an aliased <code>LIGHT_BLOCK</code> table reference
     */
    public LightBlock(Name alias) {
        this(alias, LIGHT_BLOCK);
    }

    private LightBlock(Name alias, Table<LightBlockRecord> aliased) {
        this(alias, aliased, null);
    }

    private LightBlock(Name alias, Table<LightBlockRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> LightBlock(Table<O> child, ForeignKey<O, LightBlockRecord> key) {
        super(child, key, LIGHT_BLOCK);
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
    public UniqueKey<LightBlockRecord> getPrimaryKey() {
        return Keys.INTEG_188;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LightBlockRecord>> getKeys() {
        return Arrays.<UniqueKey<LightBlockRecord>>asList(Keys.INTEG_188);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightBlock as(String alias) {
        return new LightBlock(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LightBlock as(Name alias) {
        return new LightBlock(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LightBlock rename(String name) {
        return new LightBlock(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LightBlock rename(Name name) {
        return new LightBlock(name, null);
    }
}
