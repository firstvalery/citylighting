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
import ru.smartsarov.citylighting.sprut.tables.records.GetGuardLogMonthRecord;


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
public class GetGuardLogMonth extends TableImpl<GetGuardLogMonthRecord> {

    private static final long serialVersionUID = 409085257;

    /**
     * The reference instance of <code>GET_GUARD_LOG_MONTH</code>
     */
    public static final GetGuardLogMonth GET_GUARD_LOG_MONTH = new GetGuardLogMonth();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetGuardLogMonthRecord> getRecordType() {
        return GetGuardLogMonthRecord.class;
    }

    /**
     * The column <code>GET_GUARD_LOG_MONTH.GLM_ID</code>.
     */
    public final TableField<GetGuardLogMonthRecord, Integer> GLM_ID = createField("GLM_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_GUARD_LOG_MONTH.GLM_NAME</code>.
     */
    public final TableField<GetGuardLogMonthRecord, String> GLM_NAME = createField("GLM_NAME", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>GET_GUARD_LOG_MONTH.GLM_MIN</code>.
     */
    public final TableField<GetGuardLogMonthRecord, Timestamp> GLM_MIN = createField("GLM_MIN", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_GUARD_LOG_MONTH.GLM_MAX</code>.
     */
    public final TableField<GetGuardLogMonthRecord, Timestamp> GLM_MAX = createField("GLM_MAX", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>GET_GUARD_LOG_MONTH</code> table reference
     */
    public GetGuardLogMonth() {
        this(DSL.name("GET_GUARD_LOG_MONTH"), null);
    }

    /**
     * Create an aliased <code>GET_GUARD_LOG_MONTH</code> table reference
     */
    public GetGuardLogMonth(String alias) {
        this(DSL.name(alias), GET_GUARD_LOG_MONTH);
    }

    /**
     * Create an aliased <code>GET_GUARD_LOG_MONTH</code> table reference
     */
    public GetGuardLogMonth(Name alias) {
        this(alias, GET_GUARD_LOG_MONTH);
    }

    private GetGuardLogMonth(Name alias, Table<GetGuardLogMonthRecord> aliased) {
        this(alias, aliased, new Field[0]);
    }

    private GetGuardLogMonth(Name alias, Table<GetGuardLogMonthRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GetGuardLogMonth(Table<O> child, ForeignKey<O, GetGuardLogMonthRecord> key) {
        super(child, key, GET_GUARD_LOG_MONTH);
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
    public GetGuardLogMonth as(String alias) {
        return new GetGuardLogMonth(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetGuardLogMonth as(Name alias) {
        return new GetGuardLogMonth(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetGuardLogMonth rename(String name) {
        return new GetGuardLogMonth(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetGuardLogMonth rename(Name name) {
        return new GetGuardLogMonth(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public GetGuardLogMonth call() {
        return new GetGuardLogMonth(DSL.name(getName()), null, new Field[] { 
        });
    }
}
