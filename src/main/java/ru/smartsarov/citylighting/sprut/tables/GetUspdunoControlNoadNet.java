/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables;


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
import ru.smartsarov.citylighting.sprut.tables.records.GetUspdunoControlNoadNetRecord;


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
public class GetUspdunoControlNoadNet extends TableImpl<GetUspdunoControlNoadNetRecord> {

    private static final long serialVersionUID = -1839815355;

    /**
     * The reference instance of <code>GET_USPDUNO_CONTROL_NOAD_NET</code>
     */
    public static final GetUspdunoControlNoadNet GET_USPDUNO_CONTROL_NOAD_NET = new GetUspdunoControlNoadNet();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetUspdunoControlNoadNetRecord> getRecordType() {
        return GetUspdunoControlNoadNetRecord.class;
    }

    /**
     * The column <code>GET_USPDUNO_CONTROL_NOAD_NET.USK_ID</code>.
     */
    public final TableField<GetUspdunoControlNoadNetRecord, Integer> USK_ID = createField("USK_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USPDUNO_CONTROL_NOAD_NET.USK_AB_ID</code>.
     */
    public final TableField<GetUspdunoControlNoadNetRecord, Integer> USK_AB_ID = createField("USK_AB_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USPDUNO_CONTROL_NOAD_NET.USK_UID</code>.
     */
    public final TableField<GetUspdunoControlNoadNetRecord, Integer> USK_UID = createField("USK_UID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USPDUNO_CONTROL_NOAD_NET.USK_TYPE_ID</code>.
     */
    public final TableField<GetUspdunoControlNoadNetRecord, Integer> USK_TYPE_ID = createField("USK_TYPE_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USPDUNO_CONTROL_NOAD_NET.USK_IP</code>.
     */
    public final TableField<GetUspdunoControlNoadNetRecord, String> USK_IP = createField("USK_IP", org.jooq.impl.SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>GET_USPDUNO_CONTROL_NOAD_NET.USK_KEY</code>.
     */
    public final TableField<GetUspdunoControlNoadNetRecord, String> USK_KEY = createField("USK_KEY", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>GET_USPDUNO_CONTROL_NOAD_NET.ADR_ID</code>.
     */
    public final TableField<GetUspdunoControlNoadNetRecord, Integer> ADR_ID = createField("ADR_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USPDUNO_CONTROL_NOAD_NET.PIN_NET_STATE</code>.
     */
    public final TableField<GetUspdunoControlNoadNetRecord, Integer> PIN_NET_STATE = createField("PIN_NET_STATE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USPDUNO_CONTROL_NOAD_NET.LINKED_ID</code>.
     */
    public final TableField<GetUspdunoControlNoadNetRecord, Integer> LINKED_ID = createField("LINKED_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_USPDUNO_CONTROL_NOAD_NET.CNT_BTYPE</code>.
     */
    public final TableField<GetUspdunoControlNoadNetRecord, Integer> CNT_BTYPE = createField("CNT_BTYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>GET_USPDUNO_CONTROL_NOAD_NET</code> table reference
     */
    public GetUspdunoControlNoadNet() {
        this(DSL.name("GET_USPDUNO_CONTROL_NOAD_NET"), null);
    }

    /**
     * Create an aliased <code>GET_USPDUNO_CONTROL_NOAD_NET</code> table reference
     */
    public GetUspdunoControlNoadNet(String alias) {
        this(DSL.name(alias), GET_USPDUNO_CONTROL_NOAD_NET);
    }

    /**
     * Create an aliased <code>GET_USPDUNO_CONTROL_NOAD_NET</code> table reference
     */
    public GetUspdunoControlNoadNet(Name alias) {
        this(alias, GET_USPDUNO_CONTROL_NOAD_NET);
    }

    private GetUspdunoControlNoadNet(Name alias, Table<GetUspdunoControlNoadNetRecord> aliased) {
        this(alias, aliased, new Field[2]);
    }

    private GetUspdunoControlNoadNet(Name alias, Table<GetUspdunoControlNoadNetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GetUspdunoControlNoadNet(Table<O> child, ForeignKey<O, GetUspdunoControlNoadNetRecord> key) {
        super(child, key, GET_USPDUNO_CONTROL_NOAD_NET);
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
    public GetUspdunoControlNoadNet as(String alias) {
        return new GetUspdunoControlNoadNet(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUspdunoControlNoadNet as(Name alias) {
        return new GetUspdunoControlNoadNet(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetUspdunoControlNoadNet rename(String name) {
        return new GetUspdunoControlNoadNet(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetUspdunoControlNoadNet rename(Name name) {
        return new GetUspdunoControlNoadNet(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public GetUspdunoControlNoadNet call(String login, String pass) {
        return new GetUspdunoControlNoadNet(DSL.name(getName()), null, new Field[] { 
              DSL.val(login, org.jooq.impl.SQLDataType.VARCHAR(32))
            , DSL.val(pass, org.jooq.impl.SQLDataType.VARCHAR(32))
        });
    }

    /**
     * Call this table-valued function
     */
    public GetUspdunoControlNoadNet call(Field<String> login, Field<String> pass) {
        return new GetUspdunoControlNoadNet(DSL.name(getName()), null, new Field[] { 
              login
            , pass
        });
    }
}
