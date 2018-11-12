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
import ru.smartsarov.citylighting.sprut.tables.records.CheckIpRecord;


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
public class CheckIp extends TableImpl<CheckIpRecord> {

    private static final long serialVersionUID = 238611528;

    /**
     * The reference instance of <code>CHECK_IP</code>
     */
    public static final CheckIp CHECK_IP = new CheckIp();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CheckIpRecord> getRecordType() {
        return CheckIpRecord.class;
    }

    /**
     * The column <code>CHECK_IP.CNT</code>.
     */
    public final TableField<CheckIpRecord, Integer> CNT = createField("CNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>CHECK_IP</code> table reference
     */
    public CheckIp() {
        this(DSL.name("CHECK_IP"), null);
    }

    /**
     * Create an aliased <code>CHECK_IP</code> table reference
     */
    public CheckIp(String alias) {
        this(DSL.name(alias), CHECK_IP);
    }

    /**
     * Create an aliased <code>CHECK_IP</code> table reference
     */
    public CheckIp(Name alias) {
        this(alias, CHECK_IP);
    }

    private CheckIp(Name alias, Table<CheckIpRecord> aliased) {
        this(alias, aliased, new Field[5]);
    }

    private CheckIp(Name alias, Table<CheckIpRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CheckIp(Table<O> child, ForeignKey<O, CheckIpRecord> key) {
        super(child, key, CHECK_IP);
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
    public CheckIp as(String alias) {
        return new CheckIp(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CheckIp as(Name alias) {
        return new CheckIp(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public CheckIp rename(String name) {
        return new CheckIp(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public CheckIp rename(Name name) {
        return new CheckIp(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public CheckIp call(String ip, Integer id, Timestamp fsdate, Timestamp fedate, Timestamp fndate) {
        return new CheckIp(DSL.name(getName()), null, new Field[] { 
              DSL.val(ip, org.jooq.impl.SQLDataType.VARCHAR(30))
            , DSL.val(id, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(fsdate, org.jooq.impl.SQLDataType.TIMESTAMP)
            , DSL.val(fedate, org.jooq.impl.SQLDataType.TIMESTAMP)
            , DSL.val(fndate, org.jooq.impl.SQLDataType.TIMESTAMP)
        });
    }

    /**
     * Call this table-valued function
     */
    public CheckIp call(Field<String> ip, Field<Integer> id, Field<Timestamp> fsdate, Field<Timestamp> fedate, Field<Timestamp> fndate) {
        return new CheckIp(DSL.name(getName()), null, new Field[] { 
              ip
            , id
            , fsdate
            , fedate
            , fndate
        });
    }
}