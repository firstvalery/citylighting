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
import ru.smartsarov.citylighting.sprut.tables.records.GraphicsRecord;


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
public class Graphics extends TableImpl<GraphicsRecord> {

    private static final long serialVersionUID = 314000403;

    /**
     * The reference instance of <code>GRAPHICS</code>
     */
    public static final Graphics GRAPHICS = new Graphics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GraphicsRecord> getRecordType() {
        return GraphicsRecord.class;
    }

    /**
     * The column <code>GRAPHICS.GRPH_ID</code>.
     */
    public final TableField<GraphicsRecord, Integer> GRPH_ID = createField("GRPH_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GRAPHICS.GRPH_AB_ID</code>.
     */
    public final TableField<GraphicsRecord, Integer> GRPH_AB_ID = createField("GRPH_AB_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GRAPHICS.GRPH_NAME</code>.
     */
    public final TableField<GraphicsRecord, String> GRPH_NAME = createField("GRPH_NAME", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>GRAPHICS.GRPH_MEMO</code>.
     */
    public final TableField<GraphicsRecord, String> GRPH_MEMO = createField("GRPH_MEMO", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>GRAPHICS.GRPH_DATA</code>.
     */
    public final TableField<GraphicsRecord, byte[]> GRPH_DATA = createField("GRPH_DATA", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>GRAPHICS.GRPH_RECUCLE</code>.
     */
    public final TableField<GraphicsRecord, Integer> GRPH_RECUCLE = createField("GRPH_RECUCLE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GRAPHICS.GRPH_VERSION</code>.
     */
    public final TableField<GraphicsRecord, Long> GRPH_VERSION = createField("GRPH_VERSION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>GRAPHICS</code> table reference
     */
    public Graphics() {
        this(DSL.name("GRAPHICS"), null);
    }

    /**
     * Create an aliased <code>GRAPHICS</code> table reference
     */
    public Graphics(String alias) {
        this(DSL.name(alias), GRAPHICS);
    }

    /**
     * Create an aliased <code>GRAPHICS</code> table reference
     */
    public Graphics(Name alias) {
        this(alias, GRAPHICS);
    }

    private Graphics(Name alias, Table<GraphicsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Graphics(Name alias, Table<GraphicsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Graphics(Table<O> child, ForeignKey<O, GraphicsRecord> key) {
        super(child, key, GRAPHICS);
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
    public UniqueKey<GraphicsRecord> getPrimaryKey() {
        return Keys.INTEG_108;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GraphicsRecord>> getKeys() {
        return Arrays.<UniqueKey<GraphicsRecord>>asList(Keys.INTEG_108);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Graphics as(String alias) {
        return new Graphics(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Graphics as(Name alias) {
        return new Graphics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Graphics rename(String name) {
        return new Graphics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Graphics rename(Name name) {
        return new Graphics(name, null);
    }
}