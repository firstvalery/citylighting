/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.smartsarov.citylighting.sprut.DefaultSchema;
import ru.smartsarov.citylighting.sprut.Keys;
import ru.smartsarov.citylighting.sprut.tables.records.ServiceStateRecord;


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
public class ServiceState extends TableImpl<ServiceStateRecord> {

    private static final long serialVersionUID = -977538710;

    /**
     * The reference instance of <code>SERVICE_STATE</code>
     */
    public static final ServiceState SERVICE_STATE = new ServiceState();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ServiceStateRecord> getRecordType() {
        return ServiceStateRecord.class;
    }

    /**
     * The column <code>SERVICE_STATE.ID</code>.
     */
    public final TableField<ServiceStateRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>SERVICE_STATE.CAPTION</code>.
     */
    public final TableField<ServiceStateRecord, String> CAPTION = createField("CAPTION", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>SERVICE_STATE.SCAPTION</code>.
     */
    public final TableField<ServiceStateRecord, String> SCAPTION = createField("SCAPTION", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * Create a <code>SERVICE_STATE</code> table reference
     */
    public ServiceState() {
        this(DSL.name("SERVICE_STATE"), null);
    }

    /**
     * Create an aliased <code>SERVICE_STATE</code> table reference
     */
    public ServiceState(String alias) {
        this(DSL.name(alias), SERVICE_STATE);
    }

    /**
     * Create an aliased <code>SERVICE_STATE</code> table reference
     */
    public ServiceState(Name alias) {
        this(alias, SERVICE_STATE);
    }

    private ServiceState(Name alias, Table<ServiceStateRecord> aliased) {
        this(alias, aliased, null);
    }

    private ServiceState(Name alias, Table<ServiceStateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ServiceState(Table<O> child, ForeignKey<O, ServiceStateRecord> key) {
        super(child, key, SERVICE_STATE);
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
    public UniqueKey<ServiceStateRecord> getPrimaryKey() {
        return Keys.INTEG_125;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ServiceStateRecord>> getKeys() {
        return Arrays.<UniqueKey<ServiceStateRecord>>asList(Keys.INTEG_125);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceState as(String alias) {
        return new ServiceState(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceState as(Name alias) {
        return new ServiceState(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ServiceState rename(String name) {
        return new ServiceState(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ServiceState rename(Name name) {
        return new ServiceState(name, null);
    }
}
