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
import ru.smartsarov.citylighting.sprut.tables.records.ExmoduleTypeRecord;


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
public class ExmoduleType extends TableImpl<ExmoduleTypeRecord> {

    private static final long serialVersionUID = 1469519209;

    /**
     * The reference instance of <code>EXMODULE_TYPE</code>
     */
    public static final ExmoduleType EXMODULE_TYPE = new ExmoduleType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExmoduleTypeRecord> getRecordType() {
        return ExmoduleTypeRecord.class;
    }

    /**
     * The column <code>EXMODULE_TYPE.EXTYPE_ID</code>.
     */
    public final TableField<ExmoduleTypeRecord, Integer> EXTYPE_ID = createField("EXTYPE_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>EXMODULE_TYPE.EXTYPE_NAME</code>.
     */
    public final TableField<ExmoduleTypeRecord, String> EXTYPE_NAME = createField("EXTYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * Create a <code>EXMODULE_TYPE</code> table reference
     */
    public ExmoduleType() {
        this(DSL.name("EXMODULE_TYPE"), null);
    }

    /**
     * Create an aliased <code>EXMODULE_TYPE</code> table reference
     */
    public ExmoduleType(String alias) {
        this(DSL.name(alias), EXMODULE_TYPE);
    }

    /**
     * Create an aliased <code>EXMODULE_TYPE</code> table reference
     */
    public ExmoduleType(Name alias) {
        this(alias, EXMODULE_TYPE);
    }

    private ExmoduleType(Name alias, Table<ExmoduleTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private ExmoduleType(Name alias, Table<ExmoduleTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ExmoduleType(Table<O> child, ForeignKey<O, ExmoduleTypeRecord> key) {
        super(child, key, EXMODULE_TYPE);
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
    public UniqueKey<ExmoduleTypeRecord> getPrimaryKey() {
        return Keys.INTEG_101;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ExmoduleTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<ExmoduleTypeRecord>>asList(Keys.INTEG_101);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExmoduleType as(String alias) {
        return new ExmoduleType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExmoduleType as(Name alias) {
        return new ExmoduleType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ExmoduleType rename(String name) {
        return new ExmoduleType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ExmoduleType rename(Name name) {
        return new ExmoduleType(name, null);
    }
}
