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
import ru.smartsarov.citylighting.sprut.tables.records.GetGuardLineCurrRecord;


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
public class GetGuardLineCurr extends TableImpl<GetGuardLineCurrRecord> {

    private static final long serialVersionUID = -1636100851;

    /**
     * The reference instance of <code>GET_GUARD_LINE_CURR</code>
     */
    public static final GetGuardLineCurr GET_GUARD_LINE_CURR = new GetGuardLineCurr();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetGuardLineCurrRecord> getRecordType() {
        return GetGuardLineCurrRecord.class;
    }

    /**
     * The column <code>GET_GUARD_LINE_CURR.GLC_LINE_ID</code>.
     */
    public final TableField<GetGuardLineCurrRecord, Integer> GLC_LINE_ID = createField("GLC_LINE_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_LINE_CURR.GLC_LINE_NUM</code>.
     */
    public final TableField<GetGuardLineCurrRecord, Integer> GLC_LINE_NUM = createField("GLC_LINE_NUM", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_LINE_CURR.GLC_ZONE_ID</code>.
     */
    public final TableField<GetGuardLineCurrRecord, Integer> GLC_ZONE_ID = createField("GLC_ZONE_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_LINE_CURR.GLC_LINE_NAME</code>.
     */
    public final TableField<GetGuardLineCurrRecord, String> GLC_LINE_NAME = createField("GLC_LINE_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>GET_GUARD_LINE_CURR.GLC_ZONE_NAME</code>.
     */
    public final TableField<GetGuardLineCurrRecord, String> GLC_ZONE_NAME = createField("GLC_ZONE_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>GET_GUARD_LINE_CURR.GLC_ZONE_ADR</code>.
     */
    public final TableField<GetGuardLineCurrRecord, String> GLC_ZONE_ADR = createField("GLC_ZONE_ADR", org.jooq.impl.SQLDataType.VARCHAR(250), this, "");

    /**
     * The column <code>GET_GUARD_LINE_CURR.GLC_LINE_ON</code>.
     */
    public final TableField<GetGuardLineCurrRecord, Integer> GLC_LINE_ON = createField("GLC_LINE_ON", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_LINE_CURR.GLC_LINE_TYPE_ID</code>.
     */
    public final TableField<GetGuardLineCurrRecord, Integer> GLC_LINE_TYPE_ID = createField("GLC_LINE_TYPE_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_LINE_CURR.GLC_LINE_STATE</code>.
     */
    public final TableField<GetGuardLineCurrRecord, Integer> GLC_LINE_STATE = createField("GLC_LINE_STATE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_LINE_CURR.GLC_LINE_STATE_STR</code>.
     */
    public final TableField<GetGuardLineCurrRecord, String> GLC_LINE_STATE_STR = createField("GLC_LINE_STATE_STR", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>GET_GUARD_LINE_CURR.GLC_ZONE_STATE</code>.
     */
    public final TableField<GetGuardLineCurrRecord, Integer> GLC_ZONE_STATE = createField("GLC_ZONE_STATE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_LINE_CURR.GLC_ZONE_STATE_STR</code>.
     */
    public final TableField<GetGuardLineCurrRecord, String> GLC_ZONE_STATE_STR = createField("GLC_ZONE_STATE_STR", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>GET_GUARD_LINE_CURR.GLC_USK_IP</code>.
     */
    public final TableField<GetGuardLineCurrRecord, String> GLC_USK_IP = createField("GLC_USK_IP", org.jooq.impl.SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>GET_GUARD_LINE_CURR.GLC_USK_ACCESS</code>.
     */
    public final TableField<GetGuardLineCurrRecord, String> GLC_USK_ACCESS = createField("GLC_USK_ACCESS", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>GET_GUARD_LINE_CURR.GLC_USK_TIME</code>.
     */
    public final TableField<GetGuardLineCurrRecord, Timestamp> GLC_USK_TIME = createField("GLC_USK_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_GUARD_LINE_CURR.GLC_LINE_TIME</code>.
     */
    public final TableField<GetGuardLineCurrRecord, Timestamp> GLC_LINE_TIME = createField("GLC_LINE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_GUARD_LINE_CURR.GLC_D_USK_LINE_SEC_INT</code>.
     */
    public final TableField<GetGuardLineCurrRecord, Integer> GLC_D_USK_LINE_SEC_INT = createField("GLC_D_USK_LINE_SEC_INT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_LINE_CURR.GLC_D_USK_LINE_SEC_TEXT</code>.
     */
    public final TableField<GetGuardLineCurrRecord, String> GLC_D_USK_LINE_SEC_TEXT = createField("GLC_D_USK_LINE_SEC_TEXT", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * Create a <code>GET_GUARD_LINE_CURR</code> table reference
     */
    public GetGuardLineCurr() {
        this(DSL.name("GET_GUARD_LINE_CURR"), null);
    }

    /**
     * Create an aliased <code>GET_GUARD_LINE_CURR</code> table reference
     */
    public GetGuardLineCurr(String alias) {
        this(DSL.name(alias), GET_GUARD_LINE_CURR);
    }

    /**
     * Create an aliased <code>GET_GUARD_LINE_CURR</code> table reference
     */
    public GetGuardLineCurr(Name alias) {
        this(alias, GET_GUARD_LINE_CURR);
    }

    private GetGuardLineCurr(Name alias, Table<GetGuardLineCurrRecord> aliased) {
        this(alias, aliased, new Field[2]);
    }

    private GetGuardLineCurr(Name alias, Table<GetGuardLineCurrRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GetGuardLineCurr(Table<O> child, ForeignKey<O, GetGuardLineCurrRecord> key) {
        super(child, key, GET_GUARD_LINE_CURR);
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
    public GetGuardLineCurr as(String alias) {
        return new GetGuardLineCurr(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetGuardLineCurr as(Name alias) {
        return new GetGuardLineCurr(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetGuardLineCurr rename(String name) {
        return new GetGuardLineCurr(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetGuardLineCurr rename(Name name) {
        return new GetGuardLineCurr(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public GetGuardLineCurr call(String login, String pass) {
        return new GetGuardLineCurr(DSL.name(getName()), null, new Field[] { 
              DSL.val(login, org.jooq.impl.SQLDataType.VARCHAR(32))
            , DSL.val(pass, org.jooq.impl.SQLDataType.VARCHAR(32))
        });
    }

    /**
     * Call this table-valued function
     */
    public GetGuardLineCurr call(Field<String> login, Field<String> pass) {
        return new GetGuardLineCurr(DSL.name(getName()), null, new Field[] { 
              login
            , pass
        });
    }
}
