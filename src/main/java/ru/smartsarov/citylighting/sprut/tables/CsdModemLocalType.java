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
import ru.smartsarov.citylighting.sprut.tables.records.CsdModemLocalTypeRecord;


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
public class CsdModemLocalType extends TableImpl<CsdModemLocalTypeRecord> {

    private static final long serialVersionUID = -1054883054;

    /**
     * The reference instance of <code>CSD_MODEM_LOCAL_TYPE</code>
     */
    public static final CsdModemLocalType CSD_MODEM_LOCAL_TYPE = new CsdModemLocalType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CsdModemLocalTypeRecord> getRecordType() {
        return CsdModemLocalTypeRecord.class;
    }

    /**
     * The column <code>CSD_MODEM_LOCAL_TYPE.MDM_TYPE_ID</code>.
     */
    public final TableField<CsdModemLocalTypeRecord, Integer> MDM_TYPE_ID = createField("MDM_TYPE_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CSD_MODEM_LOCAL_TYPE.MODEL</code>.
     */
    public final TableField<CsdModemLocalTypeRecord, String> MODEL = createField("MODEL", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>CSD_MODEM_LOCAL_TYPE.INIT_STR</code>.
     */
    public final TableField<CsdModemLocalTypeRecord, String> INIT_STR = createField("INIT_STR", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * Create a <code>CSD_MODEM_LOCAL_TYPE</code> table reference
     */
    public CsdModemLocalType() {
        this(DSL.name("CSD_MODEM_LOCAL_TYPE"), null);
    }

    /**
     * Create an aliased <code>CSD_MODEM_LOCAL_TYPE</code> table reference
     */
    public CsdModemLocalType(String alias) {
        this(DSL.name(alias), CSD_MODEM_LOCAL_TYPE);
    }

    /**
     * Create an aliased <code>CSD_MODEM_LOCAL_TYPE</code> table reference
     */
    public CsdModemLocalType(Name alias) {
        this(alias, CSD_MODEM_LOCAL_TYPE);
    }

    private CsdModemLocalType(Name alias, Table<CsdModemLocalTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private CsdModemLocalType(Name alias, Table<CsdModemLocalTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CsdModemLocalType(Table<O> child, ForeignKey<O, CsdModemLocalTypeRecord> key) {
        super(child, key, CSD_MODEM_LOCAL_TYPE);
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
    public UniqueKey<CsdModemLocalTypeRecord> getPrimaryKey() {
        return Keys.PK_CSD_MODEM_LOCAL_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CsdModemLocalTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<CsdModemLocalTypeRecord>>asList(Keys.PK_CSD_MODEM_LOCAL_TYPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemLocalType as(String alias) {
        return new CsdModemLocalType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemLocalType as(Name alias) {
        return new CsdModemLocalType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CsdModemLocalType rename(String name) {
        return new CsdModemLocalType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CsdModemLocalType rename(Name name) {
        return new CsdModemLocalType(name, null);
    }
}
