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
import ru.smartsarov.citylighting.sprut.tables.records.CntMoTypesRecord;


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
public class CntMoTypes extends TableImpl<CntMoTypesRecord> {

    private static final long serialVersionUID = -1693313839;

    /**
     * The reference instance of <code>CNT_MO_TYPES</code>
     */
    public static final CntMoTypes CNT_MO_TYPES = new CntMoTypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CntMoTypesRecord> getRecordType() {
        return CntMoTypesRecord.class;
    }

    /**
     * The column <code>CNT_MO_TYPES.ID</code>.
     */
    public final TableField<CntMoTypesRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CNT_MO_TYPES.NAME</code>.
     */
    public final TableField<CntMoTypesRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * Create a <code>CNT_MO_TYPES</code> table reference
     */
    public CntMoTypes() {
        this(DSL.name("CNT_MO_TYPES"), null);
    }

    /**
     * Create an aliased <code>CNT_MO_TYPES</code> table reference
     */
    public CntMoTypes(String alias) {
        this(DSL.name(alias), CNT_MO_TYPES);
    }

    /**
     * Create an aliased <code>CNT_MO_TYPES</code> table reference
     */
    public CntMoTypes(Name alias) {
        this(alias, CNT_MO_TYPES);
    }

    private CntMoTypes(Name alias, Table<CntMoTypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private CntMoTypes(Name alias, Table<CntMoTypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CntMoTypes(Table<O> child, ForeignKey<O, CntMoTypesRecord> key) {
        super(child, key, CNT_MO_TYPES);
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
    public UniqueKey<CntMoTypesRecord> getPrimaryKey() {
        return Keys.PK_CNT_MO_TYPES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CntMoTypesRecord>> getKeys() {
        return Arrays.<UniqueKey<CntMoTypesRecord>>asList(Keys.PK_CNT_MO_TYPES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMoTypes as(String alias) {
        return new CntMoTypes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMoTypes as(Name alias) {
        return new CntMoTypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CntMoTypes rename(String name) {
        return new CntMoTypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CntMoTypes rename(Name name) {
        return new CntMoTypes(name, null);
    }
}
