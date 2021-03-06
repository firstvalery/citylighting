/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables;


import java.sql.Timestamp;
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
import ru.smartsarov.citylighting.sprut.tables.records.GraphicsPinManualRecord;


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
public class GraphicsPinManual extends TableImpl<GraphicsPinManualRecord> {

    private static final long serialVersionUID = -1897323959;

    /**
     * The reference instance of <code>GRAPHICS_PIN_MANUAL</code>
     */
    public static final GraphicsPinManual GRAPHICS_PIN_MANUAL = new GraphicsPinManual();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GraphicsPinManualRecord> getRecordType() {
        return GraphicsPinManualRecord.class;
    }

    /**
     * The column <code>GRAPHICS_PIN_MANUAL.ID</code>.
     */
    public final TableField<GraphicsPinManualRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GRAPHICS_PIN_MANUAL.SEND_DATE</code>.
     */
    public final TableField<GraphicsPinManualRecord, Timestamp> SEND_DATE = createField("SEND_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GRAPHICS_PIN_MANUAL.LOGIN</code>.
     */
    public final TableField<GraphicsPinManualRecord, String> LOGIN = createField("LOGIN", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GRAPHICS_PIN_MANUAL.IP</code>.
     */
    public final TableField<GraphicsPinManualRecord, String> IP = createField("IP", org.jooq.impl.SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>GRAPHICS_PIN_MANUAL.USK_ID</code>.
     */
    public final TableField<GraphicsPinManualRecord, Integer> USK_ID = createField("USK_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GRAPHICS_PIN_MANUAL.PIN_ID</code>.
     */
    public final TableField<GraphicsPinManualRecord, Integer> PIN_ID = createField("PIN_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GRAPHICS_PIN_MANUAL.ACTION_NUM</code>.
     */
    public final TableField<GraphicsPinManualRecord, Integer> ACTION_NUM = createField("ACTION_NUM", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GRAPHICS_PIN_MANUAL.COMPLETED</code>.
     */
    public final TableField<GraphicsPinManualRecord, Integer> COMPLETED = createField("COMPLETED", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GRAPHICS_PIN_MANUAL.COMPLETED_DATE</code>.
     */
    public final TableField<GraphicsPinManualRecord, Timestamp> COMPLETED_DATE = createField("COMPLETED_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>GRAPHICS_PIN_MANUAL</code> table reference
     */
    public GraphicsPinManual() {
        this(DSL.name("GRAPHICS_PIN_MANUAL"), null);
    }

    /**
     * Create an aliased <code>GRAPHICS_PIN_MANUAL</code> table reference
     */
    public GraphicsPinManual(String alias) {
        this(DSL.name(alias), GRAPHICS_PIN_MANUAL);
    }

    /**
     * Create an aliased <code>GRAPHICS_PIN_MANUAL</code> table reference
     */
    public GraphicsPinManual(Name alias) {
        this(alias, GRAPHICS_PIN_MANUAL);
    }

    private GraphicsPinManual(Name alias, Table<GraphicsPinManualRecord> aliased) {
        this(alias, aliased, null);
    }

    private GraphicsPinManual(Name alias, Table<GraphicsPinManualRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GraphicsPinManual(Table<O> child, ForeignKey<O, GraphicsPinManualRecord> key) {
        super(child, key, GRAPHICS_PIN_MANUAL);
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
    public UniqueKey<GraphicsPinManualRecord> getPrimaryKey() {
        return Keys.GPM_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GraphicsPinManualRecord>> getKeys() {
        return Arrays.<UniqueKey<GraphicsPinManualRecord>>asList(Keys.GPM_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraphicsPinManual as(String alias) {
        return new GraphicsPinManual(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraphicsPinManual as(Name alias) {
        return new GraphicsPinManual(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GraphicsPinManual rename(String name) {
        return new GraphicsPinManual(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GraphicsPinManual rename(Name name) {
        return new GraphicsPinManual(name, null);
    }
}
