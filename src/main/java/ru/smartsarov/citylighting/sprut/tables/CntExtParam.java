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
import ru.smartsarov.citylighting.sprut.tables.records.CntExtParamRecord;


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
public class CntExtParam extends TableImpl<CntExtParamRecord> {

    private static final long serialVersionUID = -162602539;

    /**
     * The reference instance of <code>CNT_EXT_PARAM</code>
     */
    public static final CntExtParam CNT_EXT_PARAM = new CntExtParam();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CntExtParamRecord> getRecordType() {
        return CntExtParamRecord.class;
    }

    /**
     * The column <code>CNT_EXT_PARAM.PARAM_ID</code>.
     */
    public final TableField<CntExtParamRecord, Integer> PARAM_ID = createField("PARAM_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CNT_EXT_PARAM.PARAM_TYPE</code>.
     */
    public final TableField<CntExtParamRecord, Integer> PARAM_TYPE = createField("PARAM_TYPE", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("DEFAULT 0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>CNT_EXT_PARAM.PARAM_NAME</code>.
     */
    public final TableField<CntExtParamRecord, String> PARAM_NAME = createField("PARAM_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>CNT_EXT_PARAM.PARAM_DESC</code>.
     */
    public final TableField<CntExtParamRecord, String> PARAM_DESC = createField("PARAM_DESC", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * Create a <code>CNT_EXT_PARAM</code> table reference
     */
    public CntExtParam() {
        this(DSL.name("CNT_EXT_PARAM"), null);
    }

    /**
     * Create an aliased <code>CNT_EXT_PARAM</code> table reference
     */
    public CntExtParam(String alias) {
        this(DSL.name(alias), CNT_EXT_PARAM);
    }

    /**
     * Create an aliased <code>CNT_EXT_PARAM</code> table reference
     */
    public CntExtParam(Name alias) {
        this(alias, CNT_EXT_PARAM);
    }

    private CntExtParam(Name alias, Table<CntExtParamRecord> aliased) {
        this(alias, aliased, null);
    }

    private CntExtParam(Name alias, Table<CntExtParamRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CntExtParam(Table<O> child, ForeignKey<O, CntExtParamRecord> key) {
        super(child, key, CNT_EXT_PARAM);
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
    public UniqueKey<CntExtParamRecord> getPrimaryKey() {
        return Keys.CNT_EP_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CntExtParamRecord>> getKeys() {
        return Arrays.<UniqueKey<CntExtParamRecord>>asList(Keys.CNT_EP_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntExtParam as(String alias) {
        return new CntExtParam(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntExtParam as(Name alias) {
        return new CntExtParam(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CntExtParam rename(String name) {
        return new CntExtParam(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CntExtParam rename(Name name) {
        return new CntExtParam(name, null);
    }
}