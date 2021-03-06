/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables;


import java.sql.Timestamp;

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
import ru.smartsarov.citylighting.sprut.tables.records.GetImpulseCntvHotWaterRecord;


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
public class GetImpulseCntvHotWater extends TableImpl<GetImpulseCntvHotWaterRecord> {

    private static final long serialVersionUID = 1453878487;

    /**
     * The reference instance of <code>GET_IMPULSE_CNTV_HOT_WATER</code>
     */
    public static final GetImpulseCntvHotWater GET_IMPULSE_CNTV_HOT_WATER = new GetImpulseCntvHotWater();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetImpulseCntvHotWaterRecord> getRecordType() {
        return GetImpulseCntvHotWaterRecord.class;
    }

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.CNT_ID</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Integer> CNT_ID = createField("CNT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.VALUE1</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Double> VALUE1 = createField("VALUE1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.VALUE2</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Double> VALUE2 = createField("VALUE2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.VALUE3</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Double> VALUE3 = createField("VALUE3", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.VALUE4</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Double> VALUE4 = createField("VALUE4", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.VALUE5</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Double> VALUE5 = createField("VALUE5", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.CDATE</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Timestamp> CDATE = createField("CDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.STATE</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Integer> STATE = createField("STATE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.VALUE6</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Double> VALUE6 = createField("VALUE6", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.VALUE7</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Double> VALUE7 = createField("VALUE7", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.VALUE8</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Double> VALUE8 = createField("VALUE8", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.VALUE9</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Double> VALUE9 = createField("VALUE9", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.VALUE10</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Double> VALUE10 = createField("VALUE10", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.CNTB_NAME</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, String> CNTB_NAME = createField("CNTB_NAME", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.CNT_SNUM</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, String> CNT_SNUM = createField("CNT_SNUM", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.CNT_NETADR</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, String> CNT_NETADR = createField("CNT_NETADR", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.CNT_ENTRY</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Integer> CNT_ENTRY = createField("CNT_ENTRY", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.CNT_NAME</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, String> CNT_NAME = createField("CNT_NAME", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.CNT_ADR</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, String> CNT_ADR = createField("CNT_ADR", org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.CNT_TRANSFORMATION</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Double> CNT_TRANSFORMATION = createField("CNT_TRANSFORMATION", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.CNT_VALUE1</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Double> CNT_VALUE1 = createField("CNT_VALUE1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.CNT_VALUE2</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Double> CNT_VALUE2 = createField("CNT_VALUE2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.CNT_VALUE3</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Double> CNT_VALUE3 = createField("CNT_VALUE3", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.CNT_NUM_ABONENT</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, String> CNT_NUM_ABONENT = createField("CNT_NUM_ABONENT", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.REQUEST</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Integer> REQUEST = createField("REQUEST", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.USK_IP</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, String> USK_IP = createField("USK_IP", org.jooq.impl.SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.AB_NAME</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, String> AB_NAME = createField("AB_NAME", org.jooq.impl.SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.AB_ID</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Integer> AB_ID = createField("AB_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.CNTB_ID</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Integer> CNTB_ID = createField("CNTB_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.CNT_CORRECTION</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Integer> CNT_CORRECTION = createField("CNT_CORRECTION", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_IMPULSE_CNTV_HOT_WATER.CNT_QTIME</code>.
     */
    public final TableField<GetImpulseCntvHotWaterRecord, Integer> CNT_QTIME = createField("CNT_QTIME", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>GET_IMPULSE_CNTV_HOT_WATER</code> table reference
     */
    public GetImpulseCntvHotWater() {
        this(DSL.name("GET_IMPULSE_CNTV_HOT_WATER"), null);
    }

    /**
     * Create an aliased <code>GET_IMPULSE_CNTV_HOT_WATER</code> table reference
     */
    public GetImpulseCntvHotWater(String alias) {
        this(DSL.name(alias), GET_IMPULSE_CNTV_HOT_WATER);
    }

    /**
     * Create an aliased <code>GET_IMPULSE_CNTV_HOT_WATER</code> table reference
     */
    public GetImpulseCntvHotWater(Name alias) {
        this(alias, GET_IMPULSE_CNTV_HOT_WATER);
    }

    private GetImpulseCntvHotWater(Name alias, Table<GetImpulseCntvHotWaterRecord> aliased) {
        this(alias, aliased, new Field[2]);
    }

    private GetImpulseCntvHotWater(Name alias, Table<GetImpulseCntvHotWaterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GetImpulseCntvHotWater(Table<O> child, ForeignKey<O, GetImpulseCntvHotWaterRecord> key) {
        super(child, key, GET_IMPULSE_CNTV_HOT_WATER);
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
    public GetImpulseCntvHotWater as(String alias) {
        return new GetImpulseCntvHotWater(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetImpulseCntvHotWater as(Name alias) {
        return new GetImpulseCntvHotWater(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetImpulseCntvHotWater rename(String name) {
        return new GetImpulseCntvHotWater(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetImpulseCntvHotWater rename(Name name) {
        return new GetImpulseCntvHotWater(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public GetImpulseCntvHotWater call(String login, String pass) {
        return new GetImpulseCntvHotWater(DSL.name(getName()), null, new Field[] { 
              DSL.val(login, org.jooq.impl.SQLDataType.VARCHAR(32))
            , DSL.val(pass, org.jooq.impl.SQLDataType.VARCHAR(32))
        });
    }

    /**
     * Call this table-valued function
     */
    public GetImpulseCntvHotWater call(Field<String> login, Field<String> pass) {
        return new GetImpulseCntvHotWater(DSL.name(getName()), null, new Field[] { 
              login
            , pass
        });
    }
}
