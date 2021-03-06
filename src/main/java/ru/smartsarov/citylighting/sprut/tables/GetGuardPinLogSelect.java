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
import ru.smartsarov.citylighting.sprut.tables.records.GetGuardPinLogSelectRecord;


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
public class GetGuardPinLogSelect extends TableImpl<GetGuardPinLogSelectRecord> {

    private static final long serialVersionUID = 1890029445;

    /**
     * The reference instance of <code>GET_GUARD_PIN_LOG_SELECT</code>
     */
    public static final GetGuardPinLogSelect GET_GUARD_PIN_LOG_SELECT = new GetGuardPinLogSelect();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetGuardPinLogSelectRecord> getRecordType() {
        return GetGuardPinLogSelectRecord.class;
    }

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.USK_ID</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Integer> USK_ID = createField("USK_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.LOG_DATE</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Timestamp> LOG_DATE = createField("LOG_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GUARD_PIN_ID</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Integer> GUARD_PIN_ID = createField("GUARD_PIN_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GUARD_PIN_NAME</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, String> GUARD_PIN_NAME = createField("GUARD_PIN_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPLG_ID</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Integer> GPLG_ID = createField("GPLG_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPLG_PIN_ID</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Integer> GPLG_PIN_ID = createField("GPLG_PIN_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPLG_TYPE</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Integer> GPLG_TYPE = createField("GPLG_TYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPLG_AVALUE</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Double> GPLG_AVALUE = createField("GPLG_AVALUE", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPLG_DVALUE</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Integer> GPLG_DVALUE = createField("GPLG_DVALUE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPLG_STATE</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Integer> GPLG_STATE = createField("GPLG_STATE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPLG_LDATE</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Timestamp> GPLG_LDATE = createField("GPLG_LDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPLG_SDATE</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Timestamp> GPLG_SDATE = createField("GPLG_SDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPLG_USK_ID</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Integer> GPLG_USK_ID = createField("GPLG_USK_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPLG_EVENT</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Integer> GPLG_EVENT = createField("GPLG_EVENT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPLG_ACTION</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Integer> GPLG_ACTION = createField("GPLG_ACTION", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPIN_ID</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Integer> GPIN_ID = createField("GPIN_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPIN_ZID</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Integer> GPIN_ZID = createField("GPIN_ZID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPIN_UNK_ID</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Integer> GPIN_UNK_ID = createField("GPIN_UNK_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPIN_TYPE</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Integer> GPIN_TYPE = createField("GPIN_TYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPIN_DEVTYPE</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Integer> GPIN_DEVTYPE = createField("GPIN_DEVTYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPIN_ENTRY</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Integer> GPIN_ENTRY = createField("GPIN_ENTRY", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPIN_NETADR</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Integer> GPIN_NETADR = createField("GPIN_NETADR", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPIN_NAME</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, String> GPIN_NAME = createField("GPIN_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPIN_DELAY</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Integer> GPIN_DELAY = createField("GPIN_DELAY", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPIN_ATYPE</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Integer> GPIN_ATYPE = createField("GPIN_ATYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPIN_ON</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, Integer> GPIN_ON = createField("GPIN_ON", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LOG_SELECT.GPIN_REM</code>.
     */
    public final TableField<GetGuardPinLogSelectRecord, String> GPIN_REM = createField("GPIN_REM", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * Create a <code>GET_GUARD_PIN_LOG_SELECT</code> table reference
     */
    public GetGuardPinLogSelect() {
        this(DSL.name("GET_GUARD_PIN_LOG_SELECT"), null);
    }

    /**
     * Create an aliased <code>GET_GUARD_PIN_LOG_SELECT</code> table reference
     */
    public GetGuardPinLogSelect(String alias) {
        this(DSL.name(alias), GET_GUARD_PIN_LOG_SELECT);
    }

    /**
     * Create an aliased <code>GET_GUARD_PIN_LOG_SELECT</code> table reference
     */
    public GetGuardPinLogSelect(Name alias) {
        this(alias, GET_GUARD_PIN_LOG_SELECT);
    }

    private GetGuardPinLogSelect(Name alias, Table<GetGuardPinLogSelectRecord> aliased) {
        this(alias, aliased, new Field[4]);
    }

    private GetGuardPinLogSelect(Name alias, Table<GetGuardPinLogSelectRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GetGuardPinLogSelect(Table<O> child, ForeignKey<O, GetGuardPinLogSelectRecord> key) {
        super(child, key, GET_GUARD_PIN_LOG_SELECT);
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
    public GetGuardPinLogSelect as(String alias) {
        return new GetGuardPinLogSelect(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetGuardPinLogSelect as(Name alias) {
        return new GetGuardPinLogSelect(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetGuardPinLogSelect rename(String name) {
        return new GetGuardPinLogSelect(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetGuardPinLogSelect rename(Name name) {
        return new GetGuardPinLogSelect(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public GetGuardPinLogSelect call(String login, String pass, Timestamp datetimeStart, Timestamp datetimeEnd) {
        return new GetGuardPinLogSelect(DSL.name(getName()), null, new Field[] { 
              DSL.val(login, org.jooq.impl.SQLDataType.VARCHAR(32))
            , DSL.val(pass, org.jooq.impl.SQLDataType.VARCHAR(32))
            , DSL.val(datetimeStart, org.jooq.impl.SQLDataType.TIMESTAMP)
            , DSL.val(datetimeEnd, org.jooq.impl.SQLDataType.TIMESTAMP)
        });
    }

    /**
     * Call this table-valued function
     */
    public GetGuardPinLogSelect call(Field<String> login, Field<String> pass, Field<Timestamp> datetimeStart, Field<Timestamp> datetimeEnd) {
        return new GetGuardPinLogSelect(DSL.name(getName()), null, new Field[] { 
              login
            , pass
            , datetimeStart
            , datetimeEnd
        });
    }
}
