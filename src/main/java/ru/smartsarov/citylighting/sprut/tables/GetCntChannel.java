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
import ru.smartsarov.citylighting.sprut.tables.records.GetCntChannelRecord;


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
public class GetCntChannel extends TableImpl<GetCntChannelRecord> {

    private static final long serialVersionUID = -477761887;

    /**
     * The reference instance of <code>GET_CNT_CHANNEL</code>
     */
    public static final GetCntChannel GET_CNT_CHANNEL = new GetCntChannel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetCntChannelRecord> getRecordType() {
        return GetCntChannelRecord.class;
    }

    /**
     * The column <code>GET_CNT_CHANNEL.CNT_ID</code>.
     */
    public final TableField<GetCntChannelRecord, Integer> CNT_ID = createField("CNT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.CNTB_ID</code>.
     */
    public final TableField<GetCntChannelRecord, Integer> CNTB_ID = createField("CNTB_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.CNT_AB_ID</code>.
     */
    public final TableField<GetCntChannelRecord, Integer> CNT_AB_ID = createField("CNT_AB_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.CNT_SNUM</code>.
     */
    public final TableField<GetCntChannelRecord, String> CNT_SNUM = createField("CNT_SNUM", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.CNT_NAME</code>.
     */
    public final TableField<GetCntChannelRecord, String> CNT_NAME = createField("CNT_NAME", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.USK_IP</code>.
     */
    public final TableField<GetCntChannelRecord, String> USK_IP = createField("USK_IP", org.jooq.impl.SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.INDEX_PUT</code>.
     */
    public final TableField<GetCntChannelRecord, Integer> INDEX_PUT = createField("INDEX_PUT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.TYPE_PUT</code>.
     */
    public final TableField<GetCntChannelRecord, Integer> TYPE_PUT = createField("TYPE_PUT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.CHANNEL_NAME</code>.
     */
    public final TableField<GetCntChannelRecord, String> CHANNEL_NAME = createField("CHANNEL_NAME", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.CHANNEL_TYPE_NAME</code>.
     */
    public final TableField<GetCntChannelRecord, String> CHANNEL_TYPE_NAME = createField("CHANNEL_TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.CHANNEL_TYPE_DEM</code>.
     */
    public final TableField<GetCntChannelRecord, String> CHANNEL_TYPE_DEM = createField("CHANNEL_TYPE_DEM", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.CHANNEL_TYPE_ID</code>.
     */
    public final TableField<GetCntChannelRecord, Integer> CHANNEL_TYPE_ID = createField("CHANNEL_TYPE_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.VAL</code>.
     */
    public final TableField<GetCntChannelRecord, Double> VAL = createField("VAL", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.SERVER_TIME</code>.
     */
    public final TableField<GetCntChannelRecord, Timestamp> SERVER_TIME = createField("SERVER_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.COUNTER_TIME</code>.
     */
    public final TableField<GetCntChannelRecord, Timestamp> COUNTER_TIME = createField("COUNTER_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.STATE</code>.
     */
    public final TableField<GetCntChannelRecord, Integer> STATE = createField("STATE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.CSTATE</code>.
     */
    public final TableField<GetCntChannelRecord, String> CSTATE = createField("CSTATE", org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.ADR_ID</code>.
     */
    public final TableField<GetCntChannelRecord, Integer> ADR_ID = createField("ADR_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.FLT_ID</code>.
     */
    public final TableField<GetCntChannelRecord, Integer> FLT_ID = createField("FLT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.HOME_ID</code>.
     */
    public final TableField<GetCntChannelRecord, Integer> HOME_ID = createField("HOME_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.STRT_ID</code>.
     */
    public final TableField<GetCntChannelRecord, Integer> STRT_ID = createField("STRT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.CITY_ID</code>.
     */
    public final TableField<GetCntChannelRecord, Integer> CITY_ID = createField("CITY_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.REGION_ID</code>.
     */
    public final TableField<GetCntChannelRecord, Integer> REGION_ID = createField("REGION_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.ADR_STR</code>.
     */
    public final TableField<GetCntChannelRecord, String> ADR_STR = createField("ADR_STR", org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.CNT_REQUEST</code>.
     */
    public final TableField<GetCntChannelRecord, Integer> CNT_REQUEST = createField("CNT_REQUEST", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNT_CHANNEL.CHANNEL_ID</code>.
     */
    public final TableField<GetCntChannelRecord, Integer> CHANNEL_ID = createField("CHANNEL_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>GET_CNT_CHANNEL</code> table reference
     */
    public GetCntChannel() {
        this(DSL.name("GET_CNT_CHANNEL"), null);
    }

    /**
     * Create an aliased <code>GET_CNT_CHANNEL</code> table reference
     */
    public GetCntChannel(String alias) {
        this(DSL.name(alias), GET_CNT_CHANNEL);
    }

    /**
     * Create an aliased <code>GET_CNT_CHANNEL</code> table reference
     */
    public GetCntChannel(Name alias) {
        this(alias, GET_CNT_CHANNEL);
    }

    private GetCntChannel(Name alias, Table<GetCntChannelRecord> aliased) {
        this(alias, aliased, new Field[2]);
    }

    private GetCntChannel(Name alias, Table<GetCntChannelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GetCntChannel(Table<O> child, ForeignKey<O, GetCntChannelRecord> key) {
        super(child, key, GET_CNT_CHANNEL);
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
    public GetCntChannel as(String alias) {
        return new GetCntChannel(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntChannel as(Name alias) {
        return new GetCntChannel(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetCntChannel rename(String name) {
        return new GetCntChannel(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetCntChannel rename(Name name) {
        return new GetCntChannel(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public GetCntChannel call(String login, String pass) {
        return new GetCntChannel(DSL.name(getName()), null, new Field[] { 
              DSL.val(login, org.jooq.impl.SQLDataType.VARCHAR(32))
            , DSL.val(pass, org.jooq.impl.SQLDataType.VARCHAR(32))
        });
    }

    /**
     * Call this table-valued function
     */
    public GetCntChannel call(Field<String> login, Field<String> pass) {
        return new GetCntChannel(DSL.name(getName()), null, new Field[] { 
              login
            , pass
        });
    }
}
