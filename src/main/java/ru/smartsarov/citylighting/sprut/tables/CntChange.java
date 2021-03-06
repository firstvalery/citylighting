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
import ru.smartsarov.citylighting.sprut.tables.records.CntChangeRecord;


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
public class CntChange extends TableImpl<CntChangeRecord> {

    private static final long serialVersionUID = 2067420583;

    /**
     * The reference instance of <code>CNT_CHANGE</code>
     */
    public static final CntChange CNT_CHANGE = new CntChange();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CntChangeRecord> getRecordType() {
        return CntChangeRecord.class;
    }

    /**
     * The column <code>CNT_CHANGE.CNTC_ID</code>.
     */
    public final TableField<CntChangeRecord, Integer> CNTC_ID = createField("CNTC_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CNT_CHANGE.CNTC_CNT_ID</code>.
     */
    public final TableField<CntChangeRecord, Integer> CNTC_CNT_ID = createField("CNTC_CNT_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CNT_CHANGE.CNTC_TYPE</code>.
     */
    public final TableField<CntChangeRecord, Integer> CNTC_TYPE = createField("CNTC_TYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CNT_CHANGE.CNTC_XUSER_ID</code>.
     */
    public final TableField<CntChangeRecord, Integer> CNTC_XUSER_ID = createField("CNTC_XUSER_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CNT_CHANGE.CNTC_DATE</code>.
     */
    public final TableField<CntChangeRecord, Timestamp> CNTC_DATE = createField("CNTC_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>CNT_CHANGE</code> table reference
     */
    public CntChange() {
        this(DSL.name("CNT_CHANGE"), null);
    }

    /**
     * Create an aliased <code>CNT_CHANGE</code> table reference
     */
    public CntChange(String alias) {
        this(DSL.name(alias), CNT_CHANGE);
    }

    /**
     * Create an aliased <code>CNT_CHANGE</code> table reference
     */
    public CntChange(Name alias) {
        this(alias, CNT_CHANGE);
    }

    private CntChange(Name alias, Table<CntChangeRecord> aliased) {
        this(alias, aliased, null);
    }

    private CntChange(Name alias, Table<CntChangeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CntChange(Table<O> child, ForeignKey<O, CntChangeRecord> key) {
        super(child, key, CNT_CHANGE);
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
    public UniqueKey<CntChangeRecord> getPrimaryKey() {
        return Keys.INTEG_27;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CntChangeRecord>> getKeys() {
        return Arrays.<UniqueKey<CntChangeRecord>>asList(Keys.INTEG_27);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntChange as(String alias) {
        return new CntChange(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntChange as(Name alias) {
        return new CntChange(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CntChange rename(String name) {
        return new CntChange(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CntChange rename(Name name) {
        return new CntChange(name, null);
    }
}
