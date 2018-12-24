/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables;


import java.sql.Date;
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
import ru.smartsarov.citylighting.sprut.tables.records.GetIntelligentArchElectro_15Record;


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
public class GetIntelligentArchElectro_15 extends TableImpl<GetIntelligentArchElectro_15Record> {

    private static final long serialVersionUID = 1812929776;

    /**
     * The reference instance of <code>GET_INTELLIGENT_ARCH_ELECTRO_15</code>
     */
    public static final GetIntelligentArchElectro_15 GET_INTELLIGENT_ARCH_ELECTRO_15 = new GetIntelligentArchElectro_15();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetIntelligentArchElectro_15Record> getRecordType() {
        return GetIntelligentArchElectro_15Record.class;
    }

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_CID</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Integer> GMRCL_CID = createField("GMRCL_CID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_TARIFF</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Integer> GMRCL_TARIFF = createField("GMRCL_TARIFF", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_AP</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_AP = createField("GMRCL_AP", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_AM</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_AM = createField("GMRCL_AM", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_RP</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_RP = createField("GMRCL_RP", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_RM</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_RM = createField("GMRCL_RM", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_IAP</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_IAP = createField("GMRCL_IAP", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_IAM</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_IAM = createField("GMRCL_IAM", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_IRP</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_IRP = createField("GMRCL_IRP", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_IRM</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_IRM = createField("GMRCL_IRM", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_P</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_P = createField("GMRCL_P", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_PA</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_PA = createField("GMRCL_PA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_PB</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_PB = createField("GMRCL_PB", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_PC</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_PC = createField("GMRCL_PC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_Q</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_Q = createField("GMRCL_Q", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_QA</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_QA = createField("GMRCL_QA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_QB</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_QB = createField("GMRCL_QB", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_QC</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_QC = createField("GMRCL_QC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_QP</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_QP = createField("GMRCL_QP", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_VA</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_VA = createField("GMRCL_VA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_VB</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_VB = createField("GMRCL_VB", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_VC</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_VC = createField("GMRCL_VC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_IA</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_IA = createField("GMRCL_IA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_IB</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_IB = createField("GMRCL_IB", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_IC</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_IC = createField("GMRCL_IC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_FREQ</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_FREQ = createField("GMRCL_FREQ", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_COSAB</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_COSAB = createField("GMRCL_COSAB", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_COSAC</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_COSAC = createField("GMRCL_COSAC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_COSBC</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_COSBC = createField("GMRCL_COSBC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_COS_FI</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_COS_FI = createField("GMRCL_COS_FI", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_COS_FA</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_COS_FA = createField("GMRCL_COS_FA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_COS_FB</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_COS_FB = createField("GMRCL_COS_FB", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_COS_FC</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_COS_FC = createField("GMRCL_COS_FC", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_LDATE</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Timestamp> GMRCL_LDATE = createField("GMRCL_LDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.GMRCL_TDELTA</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> GMRCL_TDELTA = createField("GMRCL_TDELTA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.CNTB_NAME</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, String> CNTB_NAME = createField("CNTB_NAME", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.CNT_SNUM</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, String> CNT_SNUM = createField("CNT_SNUM", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.CNT_NETADR</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, String> CNT_NETADR = createField("CNT_NETADR", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.CNT_ENTRY</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Integer> CNT_ENTRY = createField("CNT_ENTRY", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.CNT_NAME</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, String> CNT_NAME = createField("CNT_NAME", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.CNT_ADR</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, String> CNT_ADR = createField("CNT_ADR", org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.CNT_TRANSFORMATION</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> CNT_TRANSFORMATION = createField("CNT_TRANSFORMATION", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.CNT_UTRANSFORMATION</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> CNT_UTRANSFORMATION = createField("CNT_UTRANSFORMATION", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.CNT_VALUE1</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> CNT_VALUE1 = createField("CNT_VALUE1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.CNT_VALUE2</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> CNT_VALUE2 = createField("CNT_VALUE2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.CNT_VALUE3</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, Double> CNT_VALUE3 = createField("CNT_VALUE3", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.CNT_NUM_ABONENT</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, String> CNT_NUM_ABONENT = createField("CNT_NUM_ABONENT", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.USK_IP</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, String> USK_IP = createField("USK_IP", org.jooq.impl.SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>GET_INTELLIGENT_ARCH_ELECTRO_15.AB_NAME</code>.
     */
    public final TableField<GetIntelligentArchElectro_15Record, String> AB_NAME = createField("AB_NAME", org.jooq.impl.SQLDataType.VARCHAR(60), this, "");

    /**
     * Create a <code>GET_INTELLIGENT_ARCH_ELECTRO_15</code> table reference
     */
    public GetIntelligentArchElectro_15() {
        this(DSL.name("GET_INTELLIGENT_ARCH_ELECTRO_15"), null);
    }

    /**
     * Create an aliased <code>GET_INTELLIGENT_ARCH_ELECTRO_15</code> table reference
     */
    public GetIntelligentArchElectro_15(String alias) {
        this(DSL.name(alias), GET_INTELLIGENT_ARCH_ELECTRO_15);
    }

    /**
     * Create an aliased <code>GET_INTELLIGENT_ARCH_ELECTRO_15</code> table reference
     */
    public GetIntelligentArchElectro_15(Name alias) {
        this(alias, GET_INTELLIGENT_ARCH_ELECTRO_15);
    }

    private GetIntelligentArchElectro_15(Name alias, Table<GetIntelligentArchElectro_15Record> aliased) {
        this(alias, aliased, new Field[5]);
    }

    private GetIntelligentArchElectro_15(Name alias, Table<GetIntelligentArchElectro_15Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GetIntelligentArchElectro_15(Table<O> child, ForeignKey<O, GetIntelligentArchElectro_15Record> key) {
        super(child, key, GET_INTELLIGENT_ARCH_ELECTRO_15);
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
    public GetIntelligentArchElectro_15 as(String alias) {
        return new GetIntelligentArchElectro_15(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetIntelligentArchElectro_15 as(Name alias) {
        return new GetIntelligentArchElectro_15(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetIntelligentArchElectro_15 rename(String name) {
        return new GetIntelligentArchElectro_15(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetIntelligentArchElectro_15 rename(Name name) {
        return new GetIntelligentArchElectro_15(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public GetIntelligentArchElectro_15 call(String login, String pass, Integer cid, Date fromDate, Date toDate) {
        return new GetIntelligentArchElectro_15(DSL.name(getName()), null, new Field[] { 
              DSL.val(login, org.jooq.impl.SQLDataType.VARCHAR(32))
            , DSL.val(pass, org.jooq.impl.SQLDataType.VARCHAR(32))
            , DSL.val(cid, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(fromDate, org.jooq.impl.SQLDataType.DATE)
            , DSL.val(toDate, org.jooq.impl.SQLDataType.DATE)
        });
    }

    /**
     * Call this table-valued function
     */
    public GetIntelligentArchElectro_15 call(Field<String> login, Field<String> pass, Field<Integer> cid, Field<Date> fromDate, Field<Date> toDate) {
        return new GetIntelligentArchElectro_15(DSL.name(getName()), null, new Field[] { 
              login
            , pass
            , cid
            , fromDate
            , toDate
        });
    }
}
