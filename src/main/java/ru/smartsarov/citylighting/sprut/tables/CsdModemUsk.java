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
import ru.smartsarov.citylighting.sprut.tables.records.CsdModemUskRecord;


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
public class CsdModemUsk extends TableImpl<CsdModemUskRecord> {

    private static final long serialVersionUID = 233949065;

    /**
     * The reference instance of <code>CSD_MODEM_USK</code>
     */
    public static final CsdModemUsk CSD_MODEM_USK = new CsdModemUsk();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CsdModemUskRecord> getRecordType() {
        return CsdModemUskRecord.class;
    }

    /**
     * The column <code>CSD_MODEM_USK.USK_ID</code>.
     */
    public final TableField<CsdModemUskRecord, Integer> USK_ID = createField("USK_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CSD_MODEM_USK.DIAL_PHONE</code>.
     */
    public final TableField<CsdModemUskRecord, String> DIAL_PHONE = createField("DIAL_PHONE", org.jooq.impl.SQLDataType.VARCHAR(12), this, "");

    /**
     * The column <code>CSD_MODEM_USK.CNT_SPEED</code>.
     */
    public final TableField<CsdModemUskRecord, Integer> CNT_SPEED = createField("CNT_SPEED", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CSD_MODEM_USK.CNT_DATA_BITS</code>.
     */
    public final TableField<CsdModemUskRecord, Integer> CNT_DATA_BITS = createField("CNT_DATA_BITS", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CSD_MODEM_USK.CNT_PARITY</code>.
     */
    public final TableField<CsdModemUskRecord, String> CNT_PARITY = createField("CNT_PARITY", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>CSD_MODEM_USK.CNT_STOP_BITS</code>.
     */
    public final TableField<CsdModemUskRecord, Float> CNT_STOP_BITS = createField("CNT_STOP_BITS", org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>CSD_MODEM_USK.DIAL_TIMEOUT</code>.
     */
    public final TableField<CsdModemUskRecord, Short> DIAL_TIMEOUT = createField("DIAL_TIMEOUT", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>CSD_MODEM_USK.LINE_HOLD_TIME</code>.
     */
    public final TableField<CsdModemUskRecord, Short> LINE_HOLD_TIME = createField("LINE_HOLD_TIME", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>CSD_MODEM_USK.DESCRIPTION</code>.
     */
    public final TableField<CsdModemUskRecord, String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * Create a <code>CSD_MODEM_USK</code> table reference
     */
    public CsdModemUsk() {
        this(DSL.name("CSD_MODEM_USK"), null);
    }

    /**
     * Create an aliased <code>CSD_MODEM_USK</code> table reference
     */
    public CsdModemUsk(String alias) {
        this(DSL.name(alias), CSD_MODEM_USK);
    }

    /**
     * Create an aliased <code>CSD_MODEM_USK</code> table reference
     */
    public CsdModemUsk(Name alias) {
        this(alias, CSD_MODEM_USK);
    }

    private CsdModemUsk(Name alias, Table<CsdModemUskRecord> aliased) {
        this(alias, aliased, null);
    }

    private CsdModemUsk(Name alias, Table<CsdModemUskRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CsdModemUsk(Table<O> child, ForeignKey<O, CsdModemUskRecord> key) {
        super(child, key, CSD_MODEM_USK);
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
    public UniqueKey<CsdModemUskRecord> getPrimaryKey() {
        return Keys.PK_CSD_MODEM_USK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CsdModemUskRecord>> getKeys() {
        return Arrays.<UniqueKey<CsdModemUskRecord>>asList(Keys.PK_CSD_MODEM_USK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CsdModemUskRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CsdModemUskRecord, ?>>asList(Keys.FK_CSD_MODEM_USK);
    }

    public Usk usk() {
        return new Usk(this, Keys.FK_CSD_MODEM_USK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemUsk as(String alias) {
        return new CsdModemUsk(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CsdModemUsk as(Name alias) {
        return new CsdModemUsk(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CsdModemUsk rename(String name) {
        return new CsdModemUsk(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CsdModemUsk rename(Name name) {
        return new CsdModemUsk(name, null);
    }
}