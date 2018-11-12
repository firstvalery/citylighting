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
import ru.smartsarov.citylighting.sprut.tables.records.CityTypeRecord;


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
public class CityType extends TableImpl<CityTypeRecord> {

    private static final long serialVersionUID = 94439148;

    /**
     * The reference instance of <code>CITY_TYPE</code>
     */
    public static final CityType CITY_TYPE = new CityType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CityTypeRecord> getRecordType() {
        return CityTypeRecord.class;
    }

    /**
     * The column <code>CITY_TYPE.CITYT_ID</code>.
     */
    public final TableField<CityTypeRecord, Integer> CITYT_ID = createField("CITYT_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CITY_TYPE.CITYT_NAME</code>.
     */
    public final TableField<CityTypeRecord, String> CITYT_NAME = createField("CITYT_NAME", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>CITY_TYPE.CITYT_SNAME</code>.
     */
    public final TableField<CityTypeRecord, String> CITYT_SNAME = createField("CITYT_SNAME", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * Create a <code>CITY_TYPE</code> table reference
     */
    public CityType() {
        this(DSL.name("CITY_TYPE"), null);
    }

    /**
     * Create an aliased <code>CITY_TYPE</code> table reference
     */
    public CityType(String alias) {
        this(DSL.name(alias), CITY_TYPE);
    }

    /**
     * Create an aliased <code>CITY_TYPE</code> table reference
     */
    public CityType(Name alias) {
        this(alias, CITY_TYPE);
    }

    private CityType(Name alias, Table<CityTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private CityType(Name alias, Table<CityTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CityType(Table<O> child, ForeignKey<O, CityTypeRecord> key) {
        super(child, key, CITY_TYPE);
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
    public UniqueKey<CityTypeRecord> getPrimaryKey() {
        return Keys.INTEG_14;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CityTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<CityTypeRecord>>asList(Keys.INTEG_14);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CityType as(String alias) {
        return new CityType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CityType as(Name alias) {
        return new CityType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CityType rename(String name) {
        return new CityType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CityType rename(Name name) {
        return new CityType(name, null);
    }
}
