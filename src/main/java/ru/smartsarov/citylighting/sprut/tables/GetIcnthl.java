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
import ru.smartsarov.citylighting.sprut.tables.records.GetIcnthlRecord;


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
public class GetIcnthl extends TableImpl<GetIcnthlRecord> {

    private static final long serialVersionUID = -574607213;

    /**
     * The reference instance of <code>GET_ICNTHL</code>
     */
    public static final GetIcnthl GET_ICNTHL = new GetIcnthl();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetIcnthlRecord> getRecordType() {
        return GetIcnthlRecord.class;
    }

    /**
     * The column <code>GET_ICNTHL.GIH_CID</code>.
     */
    public final TableField<GetIcnthlRecord, Integer> GIH_CID = createField("GIH_CID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_ICNTHL.GIH_LTIME</code>.
     */
    public final TableField<GetIcnthlRecord, Timestamp> GIH_LTIME = createField("GIH_LTIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_ICNTHL.GIH_TIME</code>.
     */
    public final TableField<GetIcnthlRecord, String> GIH_TIME = createField("GIH_TIME", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>GET_ICNTHL.GIH_PULSE</code>.
     */
    public final TableField<GetIcnthlRecord, Float> GIH_PULSE = createField("GIH_PULSE", org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>GET_ICNTHL.GIH_ENRGY</code>.
     */
    public final TableField<GetIcnthlRecord, Float> GIH_ENRGY = createField("GIH_ENRGY", org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>GET_ICNTHL.GIH_POWER</code>.
     */
    public final TableField<GetIcnthlRecord, Float> GIH_POWER = createField("GIH_POWER", org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>GET_ICNTHL.GIH_TWORK</code>.
     */
    public final TableField<GetIcnthlRecord, Float> GIH_TWORK = createField("GIH_TWORK", org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>GET_ICNTHL.GIH_TERROR</code>.
     */
    public final TableField<GetIcnthlRecord, Float> GIH_TERROR = createField("GIH_TERROR", org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>GET_ICNTHL.GIH_ERRCNT</code>.
     */
    public final TableField<GetIcnthlRecord, Integer> GIH_ERRCNT = createField("GIH_ERRCNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>GET_ICNTHL</code> table reference
     */
    public GetIcnthl() {
        this(DSL.name("GET_ICNTHL"), null);
    }

    /**
     * Create an aliased <code>GET_ICNTHL</code> table reference
     */
    public GetIcnthl(String alias) {
        this(DSL.name(alias), GET_ICNTHL);
    }

    /**
     * Create an aliased <code>GET_ICNTHL</code> table reference
     */
    public GetIcnthl(Name alias) {
        this(alias, GET_ICNTHL);
    }

    private GetIcnthl(Name alias, Table<GetIcnthlRecord> aliased) {
        this(alias, aliased, new Field[2]);
    }

    private GetIcnthl(Name alias, Table<GetIcnthlRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GetIcnthl(Table<O> child, ForeignKey<O, GetIcnthlRecord> key) {
        super(child, key, GET_ICNTHL);
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
    public GetIcnthl as(String alias) {
        return new GetIcnthl(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetIcnthl as(Name alias) {
        return new GetIcnthl(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetIcnthl rename(String name) {
        return new GetIcnthl(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetIcnthl rename(Name name) {
        return new GetIcnthl(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public GetIcnthl call(Integer cid, Timestamp fdate) {
        return new GetIcnthl(DSL.name(getName()), null, new Field[] { 
              DSL.val(cid, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(fdate, org.jooq.impl.SQLDataType.TIMESTAMP)
        });
    }

    /**
     * Call this table-valued function
     */
    public GetIcnthl call(Field<Integer> cid, Field<Timestamp> fdate) {
        return new GetIcnthl(DSL.name(getName()), null, new Field[] { 
              cid
            , fdate
        });
    }
}
