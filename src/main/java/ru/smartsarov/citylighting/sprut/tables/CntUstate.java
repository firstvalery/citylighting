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
import ru.smartsarov.citylighting.sprut.tables.records.CntUstateRecord;


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
public class CntUstate extends TableImpl<CntUstateRecord> {

    private static final long serialVersionUID = -1071203142;

    /**
     * The reference instance of <code>CNT_USTATE</code>
     */
    public static final CntUstate CNT_USTATE = new CntUstate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CntUstateRecord> getRecordType() {
        return CntUstateRecord.class;
    }

    /**
     * The column <code>CNT_USTATE.CNTUS_ID</code>.
     */
    public final TableField<CntUstateRecord, Integer> CNTUS_ID = createField("CNTUS_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CNT_USTATE.CNTUS_STATE</code>.
     */
    public final TableField<CntUstateRecord, Integer> CNTUS_STATE = createField("CNTUS_STATE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>CNT_USTATE</code> table reference
     */
    public CntUstate() {
        this(DSL.name("CNT_USTATE"), null);
    }

    /**
     * Create an aliased <code>CNT_USTATE</code> table reference
     */
    public CntUstate(String alias) {
        this(DSL.name(alias), CNT_USTATE);
    }

    /**
     * Create an aliased <code>CNT_USTATE</code> table reference
     */
    public CntUstate(Name alias) {
        this(alias, CNT_USTATE);
    }

    private CntUstate(Name alias, Table<CntUstateRecord> aliased) {
        this(alias, aliased, null);
    }

    private CntUstate(Name alias, Table<CntUstateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CntUstate(Table<O> child, ForeignKey<O, CntUstateRecord> key) {
        super(child, key, CNT_USTATE);
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
    public UniqueKey<CntUstateRecord> getPrimaryKey() {
        return Keys.INTEG_39;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CntUstateRecord>> getKeys() {
        return Arrays.<UniqueKey<CntUstateRecord>>asList(Keys.INTEG_39);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntUstate as(String alias) {
        return new CntUstate(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntUstate as(Name alias) {
        return new CntUstate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CntUstate rename(String name) {
        return new CntUstate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CntUstate rename(Name name) {
        return new CntUstate(name, null);
    }
}