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
import ru.smartsarov.citylighting.sprut.tables.records.ObjArchivePeriodAvailableRecord;


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
public class ObjArchivePeriodAvailable extends TableImpl<ObjArchivePeriodAvailableRecord> {

    private static final long serialVersionUID = -1988626828;

    /**
     * The reference instance of <code>OBJ_ARCHIVE_PERIOD_AVAILABLE</code>
     */
    public static final ObjArchivePeriodAvailable OBJ_ARCHIVE_PERIOD_AVAILABLE = new ObjArchivePeriodAvailable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ObjArchivePeriodAvailableRecord> getRecordType() {
        return ObjArchivePeriodAvailableRecord.class;
    }

    /**
     * The column <code>OBJ_ARCHIVE_PERIOD_AVAILABLE.OBJ_TYPE</code>.
     */
    public final TableField<ObjArchivePeriodAvailableRecord, Integer> OBJ_TYPE = createField("OBJ_TYPE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>OBJ_ARCHIVE_PERIOD_AVAILABLE.OBJ_BTYPE</code>.
     */
    public final TableField<ObjArchivePeriodAvailableRecord, Integer> OBJ_BTYPE = createField("OBJ_BTYPE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>OBJ_ARCHIVE_PERIOD_AVAILABLE.OBJ_ARCH_RERIOD</code>.
     */
    public final TableField<ObjArchivePeriodAvailableRecord, Integer> OBJ_ARCH_RERIOD = createField("OBJ_ARCH_RERIOD", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>OBJ_ARCHIVE_PERIOD_AVAILABLE</code> table reference
     */
    public ObjArchivePeriodAvailable() {
        this(DSL.name("OBJ_ARCHIVE_PERIOD_AVAILABLE"), null);
    }

    /**
     * Create an aliased <code>OBJ_ARCHIVE_PERIOD_AVAILABLE</code> table reference
     */
    public ObjArchivePeriodAvailable(String alias) {
        this(DSL.name(alias), OBJ_ARCHIVE_PERIOD_AVAILABLE);
    }

    /**
     * Create an aliased <code>OBJ_ARCHIVE_PERIOD_AVAILABLE</code> table reference
     */
    public ObjArchivePeriodAvailable(Name alias) {
        this(alias, OBJ_ARCHIVE_PERIOD_AVAILABLE);
    }

    private ObjArchivePeriodAvailable(Name alias, Table<ObjArchivePeriodAvailableRecord> aliased) {
        this(alias, aliased, null);
    }

    private ObjArchivePeriodAvailable(Name alias, Table<ObjArchivePeriodAvailableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ObjArchivePeriodAvailable(Table<O> child, ForeignKey<O, ObjArchivePeriodAvailableRecord> key) {
        super(child, key, OBJ_ARCHIVE_PERIOD_AVAILABLE);
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
    public UniqueKey<ObjArchivePeriodAvailableRecord> getPrimaryKey() {
        return Keys.OBJ_ARCH_PERIOD_AVAILABLE_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ObjArchivePeriodAvailableRecord>> getKeys() {
        return Arrays.<UniqueKey<ObjArchivePeriodAvailableRecord>>asList(Keys.OBJ_ARCH_PERIOD_AVAILABLE_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjArchivePeriodAvailable as(String alias) {
        return new ObjArchivePeriodAvailable(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjArchivePeriodAvailable as(Name alias) {
        return new ObjArchivePeriodAvailable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ObjArchivePeriodAvailable rename(String name) {
        return new ObjArchivePeriodAvailable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ObjArchivePeriodAvailable rename(Name name) {
        return new ObjArchivePeriodAvailable(name, null);
    }
}