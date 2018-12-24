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
import ru.smartsarov.citylighting.sprut.tables.records.GetGuardPinLastEventAllzRecord;


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
public class GetGuardPinLastEventAllz extends TableImpl<GetGuardPinLastEventAllzRecord> {

    private static final long serialVersionUID = 1982160022;

    /**
     * The reference instance of <code>GET_GUARD_PIN_LAST_EVENT_ALLZ</code>
     */
    public static final GetGuardPinLastEventAllz GET_GUARD_PIN_LAST_EVENT_ALLZ = new GetGuardPinLastEventAllz();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetGuardPinLastEventAllzRecord> getRecordType() {
        return GetGuardPinLastEventAllzRecord.class;
    }

    /**
     * The column <code>GET_GUARD_PIN_LAST_EVENT_ALLZ.USK_ID</code>.
     */
    public final TableField<GetGuardPinLastEventAllzRecord, Integer> USK_ID = createField("USK_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LAST_EVENT_ALLZ.GPLG_EVENT</code>.
     */
    public final TableField<GetGuardPinLastEventAllzRecord, Integer> GPLG_EVENT = createField("GPLG_EVENT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LAST_EVENT_ALLZ.GPLG_ACTION</code>.
     */
    public final TableField<GetGuardPinLastEventAllzRecord, Integer> GPLG_ACTION = createField("GPLG_ACTION", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LAST_EVENT_ALLZ.GPLG_LDATE</code>.
     */
    public final TableField<GetGuardPinLastEventAllzRecord, Timestamp> GPLG_LDATE = createField("GPLG_LDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LAST_EVENT_ALLZ.GPLG_SDATE</code>.
     */
    public final TableField<GetGuardPinLastEventAllzRecord, Timestamp> GPLG_SDATE = createField("GPLG_SDATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LAST_EVENT_ALLZ.CNT_BTYPE</code>.
     */
    public final TableField<GetGuardPinLastEventAllzRecord, Integer> CNT_BTYPE = createField("CNT_BTYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_PIN_LAST_EVENT_ALLZ.LINKED_ID</code>.
     */
    public final TableField<GetGuardPinLastEventAllzRecord, Integer> LINKED_ID = createField("LINKED_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>GET_GUARD_PIN_LAST_EVENT_ALLZ</code> table reference
     */
    public GetGuardPinLastEventAllz() {
        this(DSL.name("GET_GUARD_PIN_LAST_EVENT_ALLZ"), null);
    }

    /**
     * Create an aliased <code>GET_GUARD_PIN_LAST_EVENT_ALLZ</code> table reference
     */
    public GetGuardPinLastEventAllz(String alias) {
        this(DSL.name(alias), GET_GUARD_PIN_LAST_EVENT_ALLZ);
    }

    /**
     * Create an aliased <code>GET_GUARD_PIN_LAST_EVENT_ALLZ</code> table reference
     */
    public GetGuardPinLastEventAllz(Name alias) {
        this(alias, GET_GUARD_PIN_LAST_EVENT_ALLZ);
    }

    private GetGuardPinLastEventAllz(Name alias, Table<GetGuardPinLastEventAllzRecord> aliased) {
        this(alias, aliased, new Field[2]);
    }

    private GetGuardPinLastEventAllz(Name alias, Table<GetGuardPinLastEventAllzRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GetGuardPinLastEventAllz(Table<O> child, ForeignKey<O, GetGuardPinLastEventAllzRecord> key) {
        super(child, key, GET_GUARD_PIN_LAST_EVENT_ALLZ);
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
    public GetGuardPinLastEventAllz as(String alias) {
        return new GetGuardPinLastEventAllz(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetGuardPinLastEventAllz as(Name alias) {
        return new GetGuardPinLastEventAllz(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetGuardPinLastEventAllz rename(String name) {
        return new GetGuardPinLastEventAllz(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetGuardPinLastEventAllz rename(Name name) {
        return new GetGuardPinLastEventAllz(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public GetGuardPinLastEventAllz call(String login, String pass) {
        return new GetGuardPinLastEventAllz(DSL.name(getName()), null, new Field[] { 
              DSL.val(login, org.jooq.impl.SQLDataType.VARCHAR(32))
            , DSL.val(pass, org.jooq.impl.SQLDataType.VARCHAR(32))
        });
    }

    /**
     * Call this table-valued function
     */
    public GetGuardPinLastEventAllz call(Field<String> login, Field<String> pass) {
        return new GetGuardPinLastEventAllz(DSL.name(getName()), null, new Field[] { 
              login
            , pass
        });
    }
}
