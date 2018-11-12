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
import ru.smartsarov.citylighting.sprut.tables.records.InsGuardLogRecord;


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
public class InsGuardLog extends TableImpl<InsGuardLogRecord> {

    private static final long serialVersionUID = 1237575753;

    /**
     * The reference instance of <code>INS_GUARD_LOG</code>
     */
    public static final InsGuardLog INS_GUARD_LOG = new InsGuardLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InsGuardLogRecord> getRecordType() {
        return InsGuardLogRecord.class;
    }

    /**
     * The column <code>INS_GUARD_LOG.RESULT</code>.
     */
    public final TableField<InsGuardLogRecord, Integer> RESULT = createField("RESULT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>INS_GUARD_LOG</code> table reference
     */
    public InsGuardLog() {
        this(DSL.name("INS_GUARD_LOG"), null);
    }

    /**
     * Create an aliased <code>INS_GUARD_LOG</code> table reference
     */
    public InsGuardLog(String alias) {
        this(DSL.name(alias), INS_GUARD_LOG);
    }

    /**
     * Create an aliased <code>INS_GUARD_LOG</code> table reference
     */
    public InsGuardLog(Name alias) {
        this(alias, INS_GUARD_LOG);
    }

    private InsGuardLog(Name alias, Table<InsGuardLogRecord> aliased) {
        this(alias, aliased, new Field[12]);
    }

    private InsGuardLog(Name alias, Table<InsGuardLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InsGuardLog(Table<O> child, ForeignKey<O, InsGuardLogRecord> key) {
        super(child, key, INS_GUARD_LOG);
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
    public InsGuardLog as(String alias) {
        return new InsGuardLog(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsGuardLog as(Name alias) {
        return new InsGuardLog(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public InsGuardLog rename(String name) {
        return new InsGuardLog(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public InsGuardLog rename(Name name) {
        return new InsGuardLog(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public InsGuardLog call(Integer grdlgAbId, Integer grdlgUnkId, Integer grdlgZid, Integer grdlgLid, Short grdlgEvent, Short grdlgSsost, Short grdlgDsost, Short grdlgLsost, Timestamp grdlgDatetime, Short grdlgDelay, String grdlgIbutton, Integer grdlgEid) {
        return new InsGuardLog(DSL.name(getName()), null, new Field[] { 
              DSL.val(grdlgAbId, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(grdlgUnkId, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(grdlgZid, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(grdlgLid, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(grdlgEvent, org.jooq.impl.SQLDataType.SMALLINT)
            , DSL.val(grdlgSsost, org.jooq.impl.SQLDataType.SMALLINT)
            , DSL.val(grdlgDsost, org.jooq.impl.SQLDataType.SMALLINT)
            , DSL.val(grdlgLsost, org.jooq.impl.SQLDataType.SMALLINT)
            , DSL.val(grdlgDatetime, org.jooq.impl.SQLDataType.TIMESTAMP)
            , DSL.val(grdlgDelay, org.jooq.impl.SQLDataType.SMALLINT)
            , DSL.val(grdlgIbutton, org.jooq.impl.SQLDataType.VARCHAR(20))
            , DSL.val(grdlgEid, org.jooq.impl.SQLDataType.INTEGER)
        });
    }

    /**
     * Call this table-valued function
     */
    public InsGuardLog call(Field<Integer> grdlgAbId, Field<Integer> grdlgUnkId, Field<Integer> grdlgZid, Field<Integer> grdlgLid, Field<Short> grdlgEvent, Field<Short> grdlgSsost, Field<Short> grdlgDsost, Field<Short> grdlgLsost, Field<Timestamp> grdlgDatetime, Field<Short> grdlgDelay, Field<String> grdlgIbutton, Field<Integer> grdlgEid) {
        return new InsGuardLog(DSL.name(getName()), null, new Field[] { 
              grdlgAbId
            , grdlgUnkId
            , grdlgZid
            , grdlgLid
            , grdlgEvent
            , grdlgSsost
            , grdlgDsost
            , grdlgLsost
            , grdlgDatetime
            , grdlgDelay
            , grdlgIbutton
            , grdlgEid
        });
    }
}