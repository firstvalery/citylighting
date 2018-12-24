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
import ru.smartsarov.citylighting.sprut.tables.records.GetCntc_207Record;


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
public class GetCntc_207 extends TableImpl<GetCntc_207Record> {

    private static final long serialVersionUID = -1653056305;

    /**
     * The reference instance of <code>GET_CNTC_207</code>
     */
    public static final GetCntc_207 GET_CNTC_207 = new GetCntc_207();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetCntc_207Record> getRecordType() {
        return GetCntc_207Record.class;
    }

    /**
     * The column <code>GET_CNTC_207.CNT_ID</code>.
     */
    public final TableField<GetCntc_207Record, Integer> CNT_ID = createField("CNT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_207.CNT_AB_ID</code>.
     */
    public final TableField<GetCntc_207Record, Integer> CNT_AB_ID = createField("CNT_AB_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_207.CNT_SNUM</code>.
     */
    public final TableField<GetCntc_207Record, String> CNT_SNUM = createField("CNT_SNUM", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_CNTC_207.CNT_NAME</code>.
     */
    public final TableField<GetCntc_207Record, String> CNT_NAME = createField("CNT_NAME", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_CNTC_207.CNTB_NAME</code>.
     */
    public final TableField<GetCntc_207Record, String> CNTB_NAME = createField("CNTB_NAME", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_CNTC_207.USK_IP</code>.
     */
    public final TableField<GetCntc_207Record, String> USK_IP = createField("USK_IP", org.jooq.impl.SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>GET_CNTC_207.Q</code>.
     */
    public final TableField<GetCntc_207Record, Double> Q = createField("Q", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_207.W</code>.
     */
    public final TableField<GetCntc_207Record, Double> W = createField("W", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_207.G1</code>.
     */
    public final TableField<GetCntc_207Record, Double> G1 = createField("G1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_207.G2</code>.
     */
    public final TableField<GetCntc_207Record, Double> G2 = createField("G2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_207.M1</code>.
     */
    public final TableField<GetCntc_207Record, Double> M1 = createField("M1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_207.M2</code>.
     */
    public final TableField<GetCntc_207Record, Double> M2 = createField("M2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_207.TA</code>.
     */
    public final TableField<GetCntc_207Record, Double> TA = createField("TA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_207.T1</code>.
     */
    public final TableField<GetCntc_207Record, Double> T1 = createField("T1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_207.T2</code>.
     */
    public final TableField<GetCntc_207Record, Double> T2 = createField("T2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_207.T3</code>.
     */
    public final TableField<GetCntc_207Record, Double> T3 = createField("T3", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_207.T4</code>.
     */
    public final TableField<GetCntc_207Record, Double> T4 = createField("T4", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_207.P1</code>.
     */
    public final TableField<GetCntc_207Record, Double> P1 = createField("P1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_207.P2</code>.
     */
    public final TableField<GetCntc_207Record, Double> P2 = createField("P2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_207.P3</code>.
     */
    public final TableField<GetCntc_207Record, Double> P3 = createField("P3", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTC_207.CTIME</code>.
     */
    public final TableField<GetCntc_207Record, Timestamp> CTIME = createField("CTIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_CNTC_207.STATE</code>.
     */
    public final TableField<GetCntc_207Record, Integer> STATE = createField("STATE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_207.ADR_ID</code>.
     */
    public final TableField<GetCntc_207Record, Integer> ADR_ID = createField("ADR_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_207.FLT_ID</code>.
     */
    public final TableField<GetCntc_207Record, Integer> FLT_ID = createField("FLT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_207.HOME_ID</code>.
     */
    public final TableField<GetCntc_207Record, Integer> HOME_ID = createField("HOME_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_207.STRT_ID</code>.
     */
    public final TableField<GetCntc_207Record, Integer> STRT_ID = createField("STRT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTC_207.CITY_ID</code>.
     */
    public final TableField<GetCntc_207Record, Integer> CITY_ID = createField("CITY_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>GET_CNTC_207</code> table reference
     */
    public GetCntc_207() {
        this(DSL.name("GET_CNTC_207"), null);
    }

    /**
     * Create an aliased <code>GET_CNTC_207</code> table reference
     */
    public GetCntc_207(String alias) {
        this(DSL.name(alias), GET_CNTC_207);
    }

    /**
     * Create an aliased <code>GET_CNTC_207</code> table reference
     */
    public GetCntc_207(Name alias) {
        this(alias, GET_CNTC_207);
    }

    private GetCntc_207(Name alias, Table<GetCntc_207Record> aliased) {
        this(alias, aliased, new Field[0]);
    }

    private GetCntc_207(Name alias, Table<GetCntc_207Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GetCntc_207(Table<O> child, ForeignKey<O, GetCntc_207Record> key) {
        super(child, key, GET_CNTC_207);
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
    public GetCntc_207 as(String alias) {
        return new GetCntc_207(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntc_207 as(Name alias) {
        return new GetCntc_207(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetCntc_207 rename(String name) {
        return new GetCntc_207(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetCntc_207 rename(Name name) {
        return new GetCntc_207(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public GetCntc_207 call() {
        return new GetCntc_207(DSL.name(getName()), null, new Field[] { 
        });
    }
}
