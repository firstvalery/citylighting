/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables;


import java.sql.Timestamp;
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
import ru.smartsarov.citylighting.sprut.tables.records.CsdModemLocalStateRecord;


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
public class CsdModemLocalState extends TableImpl<CsdModemLocalStateRecord> {

    private static final long serialVersionUID = -1716484421;

    /**
     * The reference instance of <code>CSD_MODEM_LOCAL_STATE</code>
     */
    public static final CsdModemLocalState CSD_MODEM_LOCAL_STATE = new CsdModemLocalState();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CsdModemLocalStateRecord> getRecordType() {
        return CsdModemLocalStateRecord.class;
    }

    /**
     * The column <code>CSD_MODEM_LOCAL_STATE.MODEM_ID</code>.
     */
    public final TableField<CsdModemLocalStateRecord, Integer> MODEM_ID = createField("MODEM_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CSD_MODEM_LOCAL_STATE.LAST_SESS_ID</code>.
     */
    public final TableField<CsdModemLocalStateRecord, Integer> LAST_SESS_ID = createField("LAST_SESS_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CSD_MODEM_LOCAL_STATE.LAST_OPEN</code>.
     */
    public final TableField<CsdModemLocalStateRecord, Timestamp> LAST_OPEN = createField("LAST_OPEN", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>CSD_MODEM_LOCAL_STATE.LAST_STATE</code>.
     */
    public final TableField<CsdModemLocalStateRecord, Short> LAST_STATE = createField("LAST_STATE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>CSD_MODEM_LOCAL_STATE</code> table reference
     */
    public CsdModemLocalState() {
        this(DSL.name("CSD_MODEM_LOCAL_STATE"), null);
    }

    /**
     * Create an aliased <code>CSD_MODEM_LOCAL_STATE</code> table reference
     */
    public CsdModemLocalState(String alias) {
        this(DSL.name(alias), CSD_MODEM_LOCAL_STATE);
    }

    /**
     * Create an aliased <code>CSD_MODEM_LOCAL_STATE</code> table reference
     */
    public CsdModemLocalState(Name alias) {
        this(alias, CSD_MODEM_LOCAL_STATE);
    }

    private CsdModemLocalState(Name alias, Table<CsdModemLocalStateRecord> aliased) {
        this(alias, aliased, null);
    }

    private CsdModemLocalState(Name alias, Table<CsdModemLocalStateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CsdModemLocalState(Table<O> child, ForeignKey<O, CsdModemLocalStateRecord> key) {
        super(child, key, CSD_MODEM_LOCAL_STATE);
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
    public UniqueKey<CsdModemLocalStateRecord> getPrimaryKey() {
        return Keys.PK_CSD_MODEM_LOCAL_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CsdModemLocalStateRecord>> getKeys() {
        return Arrays.<UniqueKey<CsdModemLocalStateRecord>>asList(Keys.PK_CSD_MODEM_LOCAL_STATE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CsdModemLocalStateRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CsdModemLocalStateRecord, ?>>asList(Keys.FK_CSD_MODEM_LOCAL_STATE);
    }

    public CsdModemLocal csdModemLocal() {
        return new CsdModemLocal(this, Keys.FK_CSD_MODEM_LOCAL_STATE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemLocalState as(String alias) {
        return new CsdModemLocalState(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemLocalState as(Name alias) {
        return new CsdModemLocalState(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CsdModemLocalState rename(String name) {
        return new CsdModemLocalState(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CsdModemLocalState rename(Name name) {
        return new CsdModemLocalState(name, null);
    }
}
