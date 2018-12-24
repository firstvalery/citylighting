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
import ru.smartsarov.citylighting.sprut.tables.records.GetCntc_214Record;


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
public class GetCntc_214 extends TableImpl<GetCntc_214Record> {

    private static final long serialVersionUID = -1372869469;

    /**
     * The reference instance of <code>GET_CNTC_214</code>
     */
    public static final GetCntc_214 GET_CNTC_214 = new GetCntc_214();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetCntc_214Record> getRecordType() {
        return GetCntc_214Record.class;
    }

    /**
     * The column <code>GET_CNTC_214.CNT_ID</code>.
     */
    public final TableField<GetCntc_214Record, Integer> CNT_ID = createField("CNT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_214.CNT_AB_ID</code>.
     */
    public final TableField<GetCntc_214Record, Integer> CNT_AB_ID = createField("CNT_AB_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_214.CNT_SNUM</code>.
     */
    public final TableField<GetCntc_214Record, String> CNT_SNUM = createField("CNT_SNUM", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_CNTC_214.CNT_NAME</code>.
     */
    public final TableField<GetCntc_214Record, String> CNT_NAME = createField("CNT_NAME", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_CNTC_214.CNTB_NAME</code>.
     */
    public final TableField<GetCntc_214Record, String> CNTB_NAME = createField("CNTB_NAME", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_CNTC_214.USK_IP</code>.
     */
    public final TableField<GetCntc_214Record, String> USK_IP = createField("USK_IP", org.jooq.impl.SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>GET_CNTC_214.Q</code>.
     */
    public final TableField<GetCntc_214Record, Double> Q = createField("Q", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_214.W</code>.
     */
    public final TableField<GetCntc_214Record, Double> W = createField("W", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_214.G1</code>.
     */
    public final TableField<GetCntc_214Record, Double> G1 = createField("G1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_214.G2</code>.
     */
    public final TableField<GetCntc_214Record, Double> G2 = createField("G2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_214.M1</code>.
     */
    public final TableField<GetCntc_214Record, Double> M1 = createField("M1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_214.M2</code>.
     */
    public final TableField<GetCntc_214Record, Double> M2 = createField("M2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_214.TA</code>.
     */
    public final TableField<GetCntc_214Record, Double> TA = createField("TA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_214.T1</code>.
     */
    public final TableField<GetCntc_214Record, Double> T1 = createField("T1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_214.T2</code>.
     */
    public final TableField<GetCntc_214Record, Double> T2 = createField("T2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_214.T3</code>.
     */
    public final TableField<GetCntc_214Record, Double> T3 = createField("T3", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_214.T4</code>.
     */
    public final TableField<GetCntc_214Record, Double> T4 = createField("T4", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_214.P1</code>.
     */
    public final TableField<GetCntc_214Record, Double> P1 = createField("P1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_214.P2</code>.
     */
    public final TableField<GetCntc_214Record, Double> P2 = createField("P2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_214.P3</code>.
     */
    public final TableField<GetCntc_214Record, Double> P3 = createField("P3", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_214.CTIME</code>.
     */
    public final TableField<GetCntc_214Record, Timestamp> CTIME = createField("CTIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_CNTC_214.STATE</code>.
     */
    public final TableField<GetCntc_214Record, Integer> STATE = createField("STATE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_214.ADR_ID</code>.
     */
    public final TableField<GetCntc_214Record, Integer> ADR_ID = createField("ADR_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_214.FLT_ID</code>.
     */
    public final TableField<GetCntc_214Record, Integer> FLT_ID = createField("FLT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_214.HOME_ID</code>.
     */
    public final TableField<GetCntc_214Record, Integer> HOME_ID = createField("HOME_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_214.STRT_ID</code>.
     */
    public final TableField<GetCntc_214Record, Integer> STRT_ID = createField("STRT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_214.CITY_ID</code>.
     */
    public final TableField<GetCntc_214Record, Integer> CITY_ID = createField("CITY_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>GET_CNTC_214</code> table reference
     */
    public GetCntc_214() {
        this(DSL.name("GET_CNTC_214"), null);
    }

    /**
     * Create an aliased <code>GET_CNTC_214</code> table reference
     */
    public GetCntc_214(String alias) {
        this(DSL.name(alias), GET_CNTC_214);
    }

    /**
     * Create an aliased <code>GET_CNTC_214</code> table reference
     */
    public GetCntc_214(Name alias) {
        this(alias, GET_CNTC_214);
    }

    private GetCntc_214(Name alias, Table<GetCntc_214Record> aliased) {
        this(alias, aliased, new Field[0]);
    }

    private GetCntc_214(Name alias, Table<GetCntc_214Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GetCntc_214(Table<O> child, ForeignKey<O, GetCntc_214Record> key) {
        super(child, key, GET_CNTC_214);
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
    public GetCntc_214 as(String alias) {
        return new GetCntc_214(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntc_214 as(Name alias) {
        return new GetCntc_214(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetCntc_214 rename(String name) {
        return new GetCntc_214(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetCntc_214 rename(Name name) {
        return new GetCntc_214(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public GetCntc_214 call() {
        return new GetCntc_214(DSL.name(getName()), null, new Field[] { 
        });
    }
}