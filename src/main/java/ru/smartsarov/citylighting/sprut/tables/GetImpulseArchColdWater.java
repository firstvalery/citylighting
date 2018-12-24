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
import ru.smartsarov.citylighting.sprut.tables.records.GetImpulseArchColdWaterRecord;


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
public class GetImpulseArchColdWater extends TableImpl<GetImpulseArchColdWaterRecord> {

    private static final long serialVersionUID = 1001575978;

    /**
     * The reference instance of <code>GET_IMPULSE_ARCH_COLD_WATER</code>
     */
    public static final GetImpulseArchColdWater GET_IMPULSE_ARCH_COLD_WATER = new GetImpulseArchColdWater();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetImpulseArchColdWaterRecord> getRecordType() {
        return GetImpulseArchColdWaterRecord.class;
    }

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.ID</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.CTYPE</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Integer> CTYPE = createField("CTYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.STATE</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Integer> STATE = createField("STATE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.CNT_ID</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Integer> CNT_ID = createField("CNT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.PID</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Integer> PID = createField("PID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.AB_ID</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Integer> AB_ID = createField("AB_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.UNK_ID</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Integer> UNK_ID = createField("UNK_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.ATYPE</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Integer> ATYPE = createField("ATYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.BTYPE</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Integer> BTYPE = createField("BTYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.VALUE1</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Double> VALUE1 = createField("VALUE1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.VALUE2</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Double> VALUE2 = createField("VALUE2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.VALUE3</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Double> VALUE3 = createField("VALUE3", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.VALUE4</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Double> VALUE4 = createField("VALUE4", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.VALUE5</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Double> VALUE5 = createField("VALUE5", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.DDATE</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Timestamp> DDATE = createField("DDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.SDATE</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Timestamp> SDATE = createField("SDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.VALUE6</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Double> VALUE6 = createField("VALUE6", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.VALUE7</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Double> VALUE7 = createField("VALUE7", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.VALUE8</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Double> VALUE8 = createField("VALUE8", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.VALUE9</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Double> VALUE9 = createField("VALUE9", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.VALUE10</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Double> VALUE10 = createField("VALUE10", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.CNTB_NAME</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, String> CNTB_NAME = createField("CNTB_NAME", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.CNT_SNUM</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, String> CNT_SNUM = createField("CNT_SNUM", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.CNT_NETADR</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, String> CNT_NETADR = createField("CNT_NETADR", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.CNT_ENTRY</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Integer> CNT_ENTRY = createField("CNT_ENTRY", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.CNT_NAME</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, String> CNT_NAME = createField("CNT_NAME", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.CNT_ADR</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, String> CNT_ADR = createField("CNT_ADR", org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.CNT_TRANSFORMATION</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Double> CNT_TRANSFORMATION = createField("CNT_TRANSFORMATION", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.CNT_VALUE1</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Double> CNT_VALUE1 = createField("CNT_VALUE1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.CNT_VALUE2</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Double> CNT_VALUE2 = createField("CNT_VALUE2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.CNT_VALUE3</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, Double> CNT_VALUE3 = createField("CNT_VALUE3", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.CNT_NUM_ABONENT</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, String> CNT_NUM_ABONENT = createField("CNT_NUM_ABONENT", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.USK_IP</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, String> USK_IP = createField("USK_IP", org.jooq.impl.SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>GET_IMPULSE_ARCH_COLD_WATER.AB_NAME</code>.
     */
    public final TableField<GetImpulseArchColdWaterRecord, String> AB_NAME = createField("AB_NAME", org.jooq.impl.SQLDataType.VARCHAR(60), this, "");

    /**
     * Create a <code>GET_IMPULSE_ARCH_COLD_WATER</code> table reference
     */
    public GetImpulseArchColdWater() {
        this(DSL.name("GET_IMPULSE_ARCH_COLD_WATER"), null);
    }

    /**
     * Create an aliased <code>GET_IMPULSE_ARCH_COLD_WATER</code> table reference
     */
    public GetImpulseArchColdWater(String alias) {
        this(DSL.name(alias), GET_IMPULSE_ARCH_COLD_WATER);
    }

    /**
     * Create an aliased <code>GET_IMPULSE_ARCH_COLD_WATER</code> table reference
     */
    public GetImpulseArchColdWater(Name alias) {
        this(alias, GET_IMPULSE_ARCH_COLD_WATER);
    }

    private GetImpulseArchColdWater(Name alias, Table<GetImpulseArchColdWaterRecord> aliased) {
        this(alias, aliased, new Field[5]);
    }

    private GetImpulseArchColdWater(Name alias, Table<GetImpulseArchColdWaterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GetImpulseArchColdWater(Table<O> child, ForeignKey<O, GetImpulseArchColdWaterRecord> key) {
        super(child, key, GET_IMPULSE_ARCH_COLD_WATER);
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
    public GetImpulseArchColdWater as(String alias) {
        return new GetImpulseArchColdWater(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetImpulseArchColdWater as(Name alias) {
        return new GetImpulseArchColdWater(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetImpulseArchColdWater rename(String name) {
        return new GetImpulseArchColdWater(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetImpulseArchColdWater rename(Name name) {
        return new GetImpulseArchColdWater(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public GetImpulseArchColdWater call(String login, String pass, Integer cid, Timestamp fromDate, Timestamp toDate) {
        return new GetImpulseArchColdWater(DSL.name(getName()), null, new Field[] { 
              DSL.val(login, org.jooq.impl.SQLDataType.VARCHAR(32))
            , DSL.val(pass, org.jooq.impl.SQLDataType.VARCHAR(32))
            , DSL.val(cid, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(fromDate, org.jooq.impl.SQLDataType.TIMESTAMP)
            , DSL.val(toDate, org.jooq.impl.SQLDataType.TIMESTAMP)
        });
    }

    /**
     * Call this table-valued function
     */
    public GetImpulseArchColdWater call(Field<String> login, Field<String> pass, Field<Integer> cid, Field<Timestamp> fromDate, Field<Timestamp> toDate) {
        return new GetImpulseArchColdWater(DSL.name(getName()), null, new Field[] { 
              login
            , pass
            , cid
            , fromDate
            , toDate
        });
    }
}