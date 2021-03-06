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
import ru.smartsarov.citylighting.sprut.tables.records.GetCntc_211Record;


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
public class GetCntc_211 extends TableImpl<GetCntc_211Record> {

    private static final long serialVersionUID = -1249497798;

    /**
     * The reference instance of <code>GET_CNTC_211</code>
     */
    public static final GetCntc_211 GET_CNTC_211 = new GetCntc_211();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetCntc_211Record> getRecordType() {
        return GetCntc_211Record.class;
    }

    /**
     * The column <code>GET_CNTC_211.CNT_ID</code>.
     */
    public final TableField<GetCntc_211Record, Integer> CNT_ID = createField("CNT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_211.CNT_AB_ID</code>.
     */
    public final TableField<GetCntc_211Record, Integer> CNT_AB_ID = createField("CNT_AB_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_211.CNT_SNUM</code>.
     */
    public final TableField<GetCntc_211Record, String> CNT_SNUM = createField("CNT_SNUM", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_CNTC_211.CNT_NAME</code>.
     */
    public final TableField<GetCntc_211Record, String> CNT_NAME = createField("CNT_NAME", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_CNTC_211.CNTB_NAME</code>.
     */
    public final TableField<GetCntc_211Record, String> CNTB_NAME = createField("CNTB_NAME", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_CNTC_211.USK_IP</code>.
     */
    public final TableField<GetCntc_211Record, String> USK_IP = createField("USK_IP", org.jooq.impl.SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>GET_CNTC_211.Q</code>.
     */
    public final TableField<GetCntc_211Record, Double> Q = createField("Q", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_211.W</code>.
     */
    public final TableField<GetCntc_211Record, Double> W = createField("W", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_211.G1</code>.
     */
    public final TableField<GetCntc_211Record, Double> G1 = createField("G1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_211.G2</code>.
     */
    public final TableField<GetCntc_211Record, Double> G2 = createField("G2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_211.M1</code>.
     */
    public final TableField<GetCntc_211Record, Double> M1 = createField("M1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_211.M2</code>.
     */
    public final TableField<GetCntc_211Record, Double> M2 = createField("M2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_211.TA</code>.
     */
    public final TableField<GetCntc_211Record, Double> TA = createField("TA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_211.T1</code>.
     */
    public final TableField<GetCntc_211Record, Double> T1 = createField("T1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_211.T2</code>.
     */
    public final TableField<GetCntc_211Record, Double> T2 = createField("T2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_211.T3</code>.
     */
    public final TableField<GetCntc_211Record, Double> T3 = createField("T3", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_211.T4</code>.
     */
    public final TableField<GetCntc_211Record, Double> T4 = createField("T4", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_211.P1</code>.
     */
    public final TableField<GetCntc_211Record, Double> P1 = createField("P1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_211.P2</code>.
     */
    public final TableField<GetCntc_211Record, Double> P2 = createField("P2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_211.P3</code>.
     */
    public final TableField<GetCntc_211Record, Double> P3 = createField("P3", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_211.CTIME</code>.
     */
    public final TableField<GetCntc_211Record, Timestamp> CTIME = createField("CTIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_CNTC_211.STATE</code>.
     */
    public final TableField<GetCntc_211Record, Integer> STATE = createField("STATE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_211.ADR_ID</code>.
     */
    public final TableField<GetCntc_211Record, Integer> ADR_ID = createField("ADR_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_211.FLT_ID</code>.
     */
    public final TableField<GetCntc_211Record, Integer> FLT_ID = createField("FLT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_211.HOME_ID</code>.
     */
    public final TableField<GetCntc_211Record, Integer> HOME_ID = createField("HOME_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_211.STRT_ID</code>.
     */
    public final TableField<GetCntc_211Record, Integer> STRT_ID = createField("STRT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_211.CITY_ID</code>.
     */
    public final TableField<GetCntc_211Record, Integer> CITY_ID = createField("CITY_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>GET_CNTC_211</code> table reference
     */
    public GetCntc_211() {
        this(DSL.name("GET_CNTC_211"), null);
    }

    /**
     * Create an aliased <code>GET_CNTC_211</code> table reference
     */
    public GetCntc_211(String alias) {
        this(DSL.name(alias), GET_CNTC_211);
    }

    /**
     * Create an aliased <code>GET_CNTC_211</code> table reference
     */
    public GetCntc_211(Name alias) {
        this(alias, GET_CNTC_211);
    }

    private GetCntc_211(Name alias, Table<GetCntc_211Record> aliased) {
        this(alias, aliased, new Field[0]);
    }

    private GetCntc_211(Name alias, Table<GetCntc_211Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GetCntc_211(Table<O> child, ForeignKey<O, GetCntc_211Record> key) {
        super(child, key, GET_CNTC_211);
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
    public GetCntc_211 as(String alias) {
        return new GetCntc_211(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntc_211 as(Name alias) {
        return new GetCntc_211(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetCntc_211 rename(String name) {
        return new GetCntc_211(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetCntc_211 rename(Name name) {
        return new GetCntc_211(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public GetCntc_211 call() {
        return new GetCntc_211(DSL.name(getName()), null, new Field[] { 
        });
    }
}
