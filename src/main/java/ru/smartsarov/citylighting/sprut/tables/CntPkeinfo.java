/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables;


import java.math.BigDecimal;
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
import ru.smartsarov.citylighting.sprut.tables.records.CntPkeinfoRecord;


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
public class CntPkeinfo extends TableImpl<CntPkeinfoRecord> {

    private static final long serialVersionUID = -806312578;

    /**
     * The reference instance of <code>CNT_PKEINFO</code>
     */
    public static final CntPkeinfo CNT_PKEINFO = new CntPkeinfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CntPkeinfoRecord> getRecordType() {
        return CntPkeinfoRecord.class;
    }

    /**
     * The column <code>CNT_PKEINFO.PKE_CID</code>.
     */
    public final TableField<CntPkeinfoRecord, Integer> PKE_CID = createField("PKE_CID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CNT_PKEINFO.PKE_V_MIN_CRIT</code>.
     */
    public final TableField<CntPkeinfoRecord, BigDecimal> PKE_V_MIN_CRIT = createField("PKE_V_MIN_CRIT", org.jooq.impl.SQLDataType.DECIMAL(5, 2), this, "");

    /**
     * The column <code>CNT_PKEINFO.PKE_V_MIN</code>.
     */
    public final TableField<CntPkeinfoRecord, BigDecimal> PKE_V_MIN = createField("PKE_V_MIN", org.jooq.impl.SQLDataType.DECIMAL(5, 2), this, "");

    /**
     * The column <code>CNT_PKEINFO.PKE_V_MAX</code>.
     */
    public final TableField<CntPkeinfoRecord, BigDecimal> PKE_V_MAX = createField("PKE_V_MAX", org.jooq.impl.SQLDataType.DECIMAL(5, 2), this, "");

    /**
     * The column <code>CNT_PKEINFO.PKE_V_MAX_CRIT</code>.
     */
    public final TableField<CntPkeinfoRecord, BigDecimal> PKE_V_MAX_CRIT = createField("PKE_V_MAX_CRIT", org.jooq.impl.SQLDataType.DECIMAL(5, 2), this, "");

    /**
     * The column <code>CNT_PKEINFO.PKE_F_MIN_CRIT</code>.
     */
    public final TableField<CntPkeinfoRecord, BigDecimal> PKE_F_MIN_CRIT = createField("PKE_F_MIN_CRIT", org.jooq.impl.SQLDataType.DECIMAL(5, 2), this, "");

    /**
     * The column <code>CNT_PKEINFO.PKE_F_MIN</code>.
     */
    public final TableField<CntPkeinfoRecord, BigDecimal> PKE_F_MIN = createField("PKE_F_MIN", org.jooq.impl.SQLDataType.DECIMAL(5, 2), this, "");

    /**
     * The column <code>CNT_PKEINFO.PKE_F_MAX</code>.
     */
    public final TableField<CntPkeinfoRecord, BigDecimal> PKE_F_MAX = createField("PKE_F_MAX", org.jooq.impl.SQLDataType.DECIMAL(5, 2), this, "");

    /**
     * The column <code>CNT_PKEINFO.PKE_F_MAX_CRIT</code>.
     */
    public final TableField<CntPkeinfoRecord, BigDecimal> PKE_F_MAX_CRIT = createField("PKE_F_MAX_CRIT", org.jooq.impl.SQLDataType.DECIMAL(5, 2), this, "");

    /**
     * Create a <code>CNT_PKEINFO</code> table reference
     */
    public CntPkeinfo() {
        this(DSL.name("CNT_PKEINFO"), null);
    }

    /**
     * Create an aliased <code>CNT_PKEINFO</code> table reference
     */
    public CntPkeinfo(String alias) {
        this(DSL.name(alias), CNT_PKEINFO);
    }

    /**
     * Create an aliased <code>CNT_PKEINFO</code> table reference
     */
    public CntPkeinfo(Name alias) {
        this(alias, CNT_PKEINFO);
    }

    private CntPkeinfo(Name alias, Table<CntPkeinfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private CntPkeinfo(Name alias, Table<CntPkeinfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CntPkeinfo(Table<O> child, ForeignKey<O, CntPkeinfoRecord> key) {
        super(child, key, CNT_PKEINFO);
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
    public UniqueKey<CntPkeinfoRecord> getPrimaryKey() {
        return Keys.PK_CNT_PKEINFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CntPkeinfoRecord>> getKeys() {
        return Arrays.<UniqueKey<CntPkeinfoRecord>>asList(Keys.PK_CNT_PKEINFO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeinfo as(String alias) {
        return new CntPkeinfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeinfo as(Name alias) {
        return new CntPkeinfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CntPkeinfo rename(String name) {
        return new CntPkeinfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CntPkeinfo rename(Name name) {
        return new CntPkeinfo(name, null);
    }
}
