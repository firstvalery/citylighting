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
import ru.smartsarov.citylighting.sprut.tables.records.GetArchGasImpls_15Record;


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
public class GetArchGasImpls_15 extends TableImpl<GetArchGasImpls_15Record> {

    private static final long serialVersionUID = 2143190635;

    /**
     * The reference instance of <code>GET_ARCH_GAS_IMPLS_15</code>
     */
    public static final GetArchGasImpls_15 GET_ARCH_GAS_IMPLS_15 = new GetArchGasImpls_15();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetArchGasImpls_15Record> getRecordType() {
        return GetArchGasImpls_15Record.class;
    }

    /**
     * The column <code>GET_ARCH_GAS_IMPLS_15.ID</code>.
     */
    public final TableField<GetArchGasImpls_15Record, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_ARCH_GAS_IMPLS_15.N</code>.
     */
    public final TableField<GetArchGasImpls_15Record, Integer> N = createField("N", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_ARCH_GAS_IMPLS_15.V1</code>.
     */
    public final TableField<GetArchGasImpls_15Record, Double> V1 = createField("V1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_ARCH_GAS_IMPLS_15.IV1</code>.
     */
    public final TableField<GetArchGasImpls_15Record, Double> IV1 = createField("IV1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_ARCH_GAS_IMPLS_15.GV1</code>.
     */
    public final TableField<GetArchGasImpls_15Record, Double> GV1 = createField("GV1", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_ARCH_GAS_IMPLS_15.GV1_5</code>.
     */
    public final TableField<GetArchGasImpls_15Record, Double> GV1_5 = createField("GV1_5", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_ARCH_GAS_IMPLS_15.LDATE</code>.
     */
    public final TableField<GetArchGasImpls_15Record, Timestamp> LDATE = createField("LDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_ARCH_GAS_IMPLS_15.TDELTA</code>.
     */
    public final TableField<GetArchGasImpls_15Record, Double> TDELTA = createField("TDELTA", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>GET_ARCH_GAS_IMPLS_15</code> table reference
     */
    public GetArchGasImpls_15() {
        this(DSL.name("GET_ARCH_GAS_IMPLS_15"), null);
    }

    /**
     * Create an aliased <code>GET_ARCH_GAS_IMPLS_15</code> table reference
     */
    public GetArchGasImpls_15(String alias) {
        this(DSL.name(alias), GET_ARCH_GAS_IMPLS_15);
    }

    /**
     * Create an aliased <code>GET_ARCH_GAS_IMPLS_15</code> table reference
     */
    public GetArchGasImpls_15(Name alias) {
        this(alias, GET_ARCH_GAS_IMPLS_15);
    }

    private GetArchGasImpls_15(Name alias, Table<GetArchGasImpls_15Record> aliased) {
        this(alias, aliased, new Field[5]);
    }

    private GetArchGasImpls_15(Name alias, Table<GetArchGasImpls_15Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GetArchGasImpls_15(Table<O> child, ForeignKey<O, GetArchGasImpls_15Record> key) {
        super(child, key, GET_ARCH_GAS_IMPLS_15);
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
    public GetArchGasImpls_15 as(String alias) {
        return new GetArchGasImpls_15(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetArchGasImpls_15 as(Name alias) {
        return new GetArchGasImpls_15(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetArchGasImpls_15 rename(String name) {
        return new GetArchGasImpls_15(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetArchGasImpls_15 rename(Name name) {
        return new GetArchGasImpls_15(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public GetArchGasImpls_15 call(String login, String pass, Integer cid, Date fromDate, Date toDate) {
        return new GetArchGasImpls_15(DSL.name(getName()), null, new Field[] { 
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
    public GetArchGasImpls_15 call(Field<String> login, Field<String> pass, Field<Integer> cid, Field<Date> fromDate, Field<Date> toDate) {
        return new GetArchGasImpls_15(DSL.name(getName()), null, new Field[] { 
              login
            , pass
            , cid
            , fromDate
            , toDate
        });
    }
}
