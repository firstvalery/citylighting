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
import ru.smartsarov.citylighting.sprut.tables.records.GetCnttcurrRecord;


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
public class GetCnttcurr extends TableImpl<GetCnttcurrRecord> {

    private static final long serialVersionUID = -653917290;

    /**
     * The reference instance of <code>GET_CNTTCURR</code>
     */
    public static final GetCnttcurr GET_CNTTCURR = new GetCnttcurr();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetCnttcurrRecord> getRecordType() {
        return GetCnttcurrRecord.class;
    }

    /**
     * The column <code>GET_CNTTCURR.CNT_ID</code>.
     */
    public final TableField<GetCnttcurrRecord, Integer> CNT_ID = createField("CNT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTTCURR.CNT_AB_ID</code>.
     */
    public final TableField<GetCnttcurrRecord, Integer> CNT_AB_ID = createField("CNT_AB_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTTCURR.CNT_SNUM</code>.
     */
    public final TableField<GetCnttcurrRecord, String> CNT_SNUM = createField("CNT_SNUM", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_CNTTCURR.CNT_NAME</code>.
     */
    public final TableField<GetCnttcurrRecord, String> CNT_NAME = createField("CNT_NAME", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>GET_CNTTCURR.CNTB_NAME</code>.
     */
    public final TableField<GetCnttcurrRecord, String> CNTB_NAME = createField("CNTB_NAME", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>GET_CNTTCURR.USK_IP</code>.
     */
    public final TableField<GetCnttcurrRecord, String> USK_IP = createField("USK_IP", org.jooq.impl.SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>GET_CNTTCURR.Q</code>.
     */
    public final TableField<GetCnttcurrRecord, Double> Q = createField("Q", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTTCURR.W</code>.
     */
    public final TableField<GetCnttcurrRecord, Double> W = createField("W", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTTCURR.G1</code>.
     */
    public final TableField<GetCnttcurrRecord, Double> G1 = createField("G1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTTCURR.G2</code>.
     */
    public final TableField<GetCnttcurrRecord, Double> G2 = createField("G2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTTCURR.M1</code>.
     */
    public final TableField<GetCnttcurrRecord, Double> M1 = createField("M1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTTCURR.M2</code>.
     */
    public final TableField<GetCnttcurrRecord, Double> M2 = createField("M2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTTCURR.TA</code>.
     */
    public final TableField<GetCnttcurrRecord, Double> TA = createField("TA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTTCURR.T1</code>.
     */
    public final TableField<GetCnttcurrRecord, Double> T1 = createField("T1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTTCURR.T2</code>.
     */
    public final TableField<GetCnttcurrRecord, Double> T2 = createField("T2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTTCURR.T3</code>.
     */
    public final TableField<GetCnttcurrRecord, Double> T3 = createField("T3", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTTCURR.T4</code>.
     */
    public final TableField<GetCnttcurrRecord, Double> T4 = createField("T4", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTTCURR.P1</code>.
     */
    public final TableField<GetCnttcurrRecord, Double> P1 = createField("P1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTTCURR.P2</code>.
     */
    public final TableField<GetCnttcurrRecord, Double> P2 = createField("P2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTTCURR.P3</code>.
     */
    public final TableField<GetCnttcurrRecord, Double> P3 = createField("P3", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_CNTTCURR.CTIME</code>.
     */
    public final TableField<GetCnttcurrRecord, Timestamp> CTIME = createField("CTIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_CNTTCURR.STATE</code>.
     */
    public final TableField<GetCnttcurrRecord, Integer> STATE = createField("STATE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTTCURR.ADR_ID</code>.
     */
    public final TableField<GetCnttcurrRecord, Integer> ADR_ID = createField("ADR_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTTCURR.FLT_ID</code>.
     */
    public final TableField<GetCnttcurrRecord, Integer> FLT_ID = createField("FLT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTTCURR.HOME_ID</code>.
     */
    public final TableField<GetCnttcurrRecord, Integer> HOME_ID = createField("HOME_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTTCURR.STRT_ID</code>.
     */
    public final TableField<GetCnttcurrRecord, Integer> STRT_ID = createField("STRT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_CNTTCURR.CITY_ID</code>.
     */
    public final TableField<GetCnttcurrRecord, Integer> CITY_ID = createField("CITY_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>GET_CNTTCURR</code> table reference
     */
    public GetCnttcurr() {
        this(DSL.name("GET_CNTTCURR"), null);
    }

    /**
     * Create an aliased <code>GET_CNTTCURR</code> table reference
     */
    public GetCnttcurr(String alias) {
        this(DSL.name(alias), GET_CNTTCURR);
    }

    /**
     * Create an aliased <code>GET_CNTTCURR</code> table reference
     */
    public GetCnttcurr(Name alias) {
        this(alias, GET_CNTTCURR);
    }

    private GetCnttcurr(Name alias, Table<GetCnttcurrRecord> aliased) {
        this(alias, aliased, new Field[0]);
    }

    private GetCnttcurr(Name alias, Table<GetCnttcurrRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GetCnttcurr(Table<O> child, ForeignKey<O, GetCnttcurrRecord> key) {
        super(child, key, GET_CNTTCURR);
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
    public GetCnttcurr as(String alias) {
        return new GetCnttcurr(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCnttcurr as(Name alias) {
        return new GetCnttcurr(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetCnttcurr rename(String name) {
        return new GetCnttcurr(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetCnttcurr rename(Name name) {
        return new GetCnttcurr(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public GetCnttcurr call() {
        return new GetCnttcurr(DSL.name(getName()), null, new Field[] { 
        });
    }
}
