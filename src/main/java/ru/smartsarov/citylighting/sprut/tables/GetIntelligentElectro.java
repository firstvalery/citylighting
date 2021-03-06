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
import ru.smartsarov.citylighting.sprut.tables.records.GetIntelligentElectroRecord;


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
public class GetIntelligentElectro extends TableImpl<GetIntelligentElectroRecord> {

    private static final long serialVersionUID = 927383540;

    /**
     * The reference instance of <code>GET_INTELLIGENT_ELECTRO</code>
     */
    public static final GetIntelligentElectro GET_INTELLIGENT_ELECTRO = new GetIntelligentElectro();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetIntelligentElectroRecord> getRecordType() {
        return GetIntelligentElectroRecord.class;
    }

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.CNT_ID</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Integer> CNT_ID = createField("CNT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.TARIFF</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Integer> TARIFF = createField("TARIFF", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.CDATE</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Timestamp> CDATE = createField("CDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.AP</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> AP = createField("AP", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.AM</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> AM = createField("AM", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.RP</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> RP = createField("RP", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.RM</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> RM = createField("RM", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.P</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> P = createField("P", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.PA</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> PA = createField("PA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.PB</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> PB = createField("PB", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.PC</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> PC = createField("PC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.Q</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> Q = createField("Q", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.QA</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> QA = createField("QA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.QB</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> QB = createField("QB", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.QC</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> QC = createField("QC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.VA</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> VA = createField("VA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.VB</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> VB = createField("VB", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.VC</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> VC = createField("VC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.IA</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> IA = createField("IA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.IB</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> IB = createField("IB", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.IC</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> IC = createField("IC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.FREQ</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> FREQ = createField("FREQ", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.COSAB</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> COSAB = createField("COSAB", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.COSAC</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> COSAC = createField("COSAC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.COSBC</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> COSBC = createField("COSBC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.SDATE</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Timestamp> SDATE = createField("SDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.COS_FI</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> COS_FI = createField("COS_FI", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.COS_FA</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> COS_FA = createField("COS_FA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.COS_FB</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> COS_FB = createField("COS_FB", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.COS_FC</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> COS_FC = createField("COS_FC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.STATE</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Integer> STATE = createField("STATE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.CNTB_NAME</code>.
     */
    public final TableField<GetIntelligentElectroRecord, String> CNTB_NAME = createField("CNTB_NAME", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.CNT_SNUM</code>.
     */
    public final TableField<GetIntelligentElectroRecord, String> CNT_SNUM = createField("CNT_SNUM", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.CNT_NETADR</code>.
     */
    public final TableField<GetIntelligentElectroRecord, String> CNT_NETADR = createField("CNT_NETADR", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.CNT_ENTRY</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Integer> CNT_ENTRY = createField("CNT_ENTRY", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.CNT_NAME</code>.
     */
    public final TableField<GetIntelligentElectroRecord, String> CNT_NAME = createField("CNT_NAME", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.CNT_ADR</code>.
     */
    public final TableField<GetIntelligentElectroRecord, String> CNT_ADR = createField("CNT_ADR", org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.CNT_TRANSFORMATION</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> CNT_TRANSFORMATION = createField("CNT_TRANSFORMATION", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.CNT_VALUE1</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> CNT_VALUE1 = createField("CNT_VALUE1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.CNT_VALUE2</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> CNT_VALUE2 = createField("CNT_VALUE2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.CNT_VALUE3</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Double> CNT_VALUE3 = createField("CNT_VALUE3", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.CNT_NUM_ABONENT</code>.
     */
    public final TableField<GetIntelligentElectroRecord, String> CNT_NUM_ABONENT = createField("CNT_NUM_ABONENT", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.REQUEST</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Integer> REQUEST = createField("REQUEST", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.USK_IP</code>.
     */
    public final TableField<GetIntelligentElectroRecord, String> USK_IP = createField("USK_IP", org.jooq.impl.SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.AB_NAME</code>.
     */
    public final TableField<GetIntelligentElectroRecord, String> AB_NAME = createField("AB_NAME", org.jooq.impl.SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.AB_ID</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Integer> AB_ID = createField("AB_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ELECTRO.CNTB_ID</code>.
     */
    public final TableField<GetIntelligentElectroRecord, Integer> CNTB_ID = createField("CNTB_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>GET_INTELLIGENT_ELECTRO</code> table reference
     */
    public GetIntelligentElectro() {
        this(DSL.name("GET_INTELLIGENT_ELECTRO"), null);
    }

    /**
     * Create an aliased <code>GET_INTELLIGENT_ELECTRO</code> table reference
     */
    public GetIntelligentElectro(String alias) {
        this(DSL.name(alias), GET_INTELLIGENT_ELECTRO);
    }

    /**
     * Create an aliased <code>GET_INTELLIGENT_ELECTRO</code> table reference
     */
    public GetIntelligentElectro(Name alias) {
        this(alias, GET_INTELLIGENT_ELECTRO);
    }

    private GetIntelligentElectro(Name alias, Table<GetIntelligentElectroRecord> aliased) {
        this(alias, aliased, new Field[2]);
    }

    private GetIntelligentElectro(Name alias, Table<GetIntelligentElectroRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GetIntelligentElectro(Table<O> child, ForeignKey<O, GetIntelligentElectroRecord> key) {
        super(child, key, GET_INTELLIGENT_ELECTRO);
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
    public GetIntelligentElectro as(String alias) {
        return new GetIntelligentElectro(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetIntelligentElectro as(Name alias) {
        return new GetIntelligentElectro(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetIntelligentElectro rename(String name) {
        return new GetIntelligentElectro(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetIntelligentElectro rename(Name name) {
        return new GetIntelligentElectro(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public GetIntelligentElectro call(String login, String pass) {
        return new GetIntelligentElectro(DSL.name(getName()), null, new Field[] { 
              DSL.val(login, org.jooq.impl.SQLDataType.VARCHAR(32))
            , DSL.val(pass, org.jooq.impl.SQLDataType.VARCHAR(32))
        });
    }

    /**
     * Call this table-valued function
     */
    public GetIntelligentElectro call(Field<String> login, Field<String> pass) {
        return new GetIntelligentElectro(DSL.name(getName()), null, new Field[] { 
              login
            , pass
        });
    }
}
