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
import ru.smartsarov.citylighting.sprut.tables.records.GetUskcExtRecord;


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
public class GetUskcExt extends TableImpl<GetUskcExtRecord> {

    private static final long serialVersionUID = -448797447;

    /**
     * The reference instance of <code>GET_USKC_EXT</code>
     */
    public static final GetUskcExt GET_USKC_EXT = new GetUskcExt();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetUskcExtRecord> getRecordType() {
        return GetUskcExtRecord.class;
    }

    /**
     * The column <code>GET_USKC_EXT.ADR_STR</code>.
     */
    public final TableField<GetUskcExtRecord, String> ADR_STR = createField("ADR_STR", org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>GET_USKC_EXT.USK_ID</code>.
     */
    public final TableField<GetUskcExtRecord, Integer> USK_ID = createField("USK_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USKC_EXT.USK_AB_ID</code>.
     */
    public final TableField<GetUskcExtRecord, Integer> USK_AB_ID = createField("USK_AB_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USKC_EXT.USK_UID</code>.
     */
    public final TableField<GetUskcExtRecord, Integer> USK_UID = createField("USK_UID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USKC_EXT.USK_TYPE_ID</code>.
     */
    public final TableField<GetUskcExtRecord, Integer> USK_TYPE_ID = createField("USK_TYPE_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USKC_EXT.USK_TYPE</code>.
     */
    public final TableField<GetUskcExtRecord, String> USK_TYPE = createField("USK_TYPE", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>GET_USKC_EXT.USK_IP</code>.
     */
    public final TableField<GetUskcExtRecord, String> USK_IP = createField("USK_IP", org.jooq.impl.SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>GET_USKC_EXT.USK_KEY</code>.
     */
    public final TableField<GetUskcExtRecord, String> USK_KEY = createField("USK_KEY", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>GET_USKC_EXT.ADR_ID</code>.
     */
    public final TableField<GetUskcExtRecord, Integer> ADR_ID = createField("ADR_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USKC_EXT.FLT_ID</code>.
     */
    public final TableField<GetUskcExtRecord, Integer> FLT_ID = createField("FLT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USKC_EXT.HOME_ID</code>.
     */
    public final TableField<GetUskcExtRecord, Integer> HOME_ID = createField("HOME_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USKC_EXT.STRT_ID</code>.
     */
    public final TableField<GetUskcExtRecord, Integer> STRT_ID = createField("STRT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USKC_EXT.CITY_ID</code>.
     */
    public final TableField<GetUskcExtRecord, Integer> CITY_ID = createField("CITY_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USKC_EXT.REGION_ID</code>.
     */
    public final TableField<GetUskcExtRecord, Integer> REGION_ID = createField("REGION_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USKC_EXT.STIME</code>.
     */
    public final TableField<GetUskcExtRecord, Timestamp> STIME = createField("STIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_USKC_EXT.STATE</code>.
     */
    public final TableField<GetUskcExtRecord, Integer> STATE = createField("STATE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USKC_EXT.V</code>.
     */
    public final TableField<GetUskcExtRecord, Double> V = createField("V", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_USKC_EXT.V_ADC</code>.
     */
    public final TableField<GetUskcExtRecord, Integer> V_ADC = createField("V_ADC", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USKC_EXT.T</code>.
     */
    public final TableField<GetUskcExtRecord, Double> T = createField("T", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_USKC_EXT.T_ADC</code>.
     */
    public final TableField<GetUskcExtRecord, Integer> T_ADC = createField("T_ADC", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USKC_EXT.TWRK</code>.
     */
    public final TableField<GetUskcExtRecord, Integer> TWRK = createField("TWRK", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USKC_EXT.TWRK_TEXT</code>.
     */
    public final TableField<GetUskcExtRecord, String> TWRK_TEXT = createField("TWRK_TEXT", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>GET_USKC_EXT.SENSOR</code>.
     */
    public final TableField<GetUskcExtRecord, String> SENSOR = createField("SENSOR", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>GET_USKC_EXT.SIGNAL_LEVEL</code>.
     */
    public final TableField<GetUskcExtRecord, Integer> SIGNAL_LEVEL = createField("SIGNAL_LEVEL", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USKC_EXT.MODEM_STAT</code>.
     */
    public final TableField<GetUskcExtRecord, Integer> MODEM_STAT = createField("MODEM_STAT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USKC_EXT.VERS</code>.
     */
    public final TableField<GetUskcExtRecord, String> VERS = createField("VERS", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>GET_USKC_EXT.VERDATE</code>.
     */
    public final TableField<GetUskcExtRecord, String> VERDATE = createField("VERDATE", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>GET_USKC_EXT.ZNAME</code>.
     */
    public final TableField<GetUskcExtRecord, String> ZNAME = createField("ZNAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * Create a <code>GET_USKC_EXT</code> table reference
     */
    public GetUskcExt() {
        this(DSL.name("GET_USKC_EXT"), null);
    }

    /**
     * Create an aliased <code>GET_USKC_EXT</code> table reference
     */
    public GetUskcExt(String alias) {
        this(DSL.name(alias), GET_USKC_EXT);
    }

    /**
     * Create an aliased <code>GET_USKC_EXT</code> table reference
     */
    public GetUskcExt(Name alias) {
        this(alias, GET_USKC_EXT);
    }

    private GetUskcExt(Name alias, Table<GetUskcExtRecord> aliased) {
        this(alias, aliased, new Field[2]);
    }

    private GetUskcExt(Name alias, Table<GetUskcExtRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GetUskcExt(Table<O> child, ForeignKey<O, GetUskcExtRecord> key) {
        super(child, key, GET_USKC_EXT);
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
    public GetUskcExt as(String alias) {
        return new GetUskcExt(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUskcExt as(Name alias) {
        return new GetUskcExt(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetUskcExt rename(String name) {
        return new GetUskcExt(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetUskcExt rename(Name name) {
        return new GetUskcExt(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public GetUskcExt call(String login, String pass) {
        return new GetUskcExt(DSL.name(getName()), null, new Field[] { 
              DSL.val(login, org.jooq.impl.SQLDataType.VARCHAR(32))
            , DSL.val(pass, org.jooq.impl.SQLDataType.VARCHAR(32))
        });
    }

    /**
     * Call this table-valued function
     */
    public GetUskcExt call(Field<String> login, Field<String> pass) {
        return new GetUskcExt(DSL.name(getName()), null, new Field[] { 
              login
            , pass
        });
    }
}
