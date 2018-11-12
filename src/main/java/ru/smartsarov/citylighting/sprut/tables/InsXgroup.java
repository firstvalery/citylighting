/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables;


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
import ru.smartsarov.citylighting.sprut.tables.records.InsXgroupRecord;


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
public class InsXgroup extends TableImpl<InsXgroupRecord> {

    private static final long serialVersionUID = 819972633;

    /**
     * The reference instance of <code>INS_XGROUP</code>
     */
    public static final InsXgroup INS_XGROUP = new InsXgroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InsXgroupRecord> getRecordType() {
        return InsXgroupRecord.class;
    }

    /**
     * The column <code>INS_XGROUP.RESULT</code>.
     */
    public final TableField<InsXgroupRecord, Integer> RESULT = createField("RESULT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>INS_XGROUP</code> table reference
     */
    public InsXgroup() {
        this(DSL.name("INS_XGROUP"), null);
    }

    /**
     * Create an aliased <code>INS_XGROUP</code> table reference
     */
    public InsXgroup(String alias) {
        this(DSL.name(alias), INS_XGROUP);
    }

    /**
     * Create an aliased <code>INS_XGROUP</code> table reference
     */
    public InsXgroup(Name alias) {
        this(alias, INS_XGROUP);
    }

    private InsXgroup(Name alias, Table<InsXgroupRecord> aliased) {
        this(alias, aliased, new Field[7]);
    }

    private InsXgroup(Name alias, Table<InsXgroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InsXgroup(Table<O> child, ForeignKey<O, InsXgroupRecord> key) {
        super(child, key, INS_XGROUP);
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
    public InsXgroup as(String alias) {
        return new InsXgroup(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsXgroup as(Name alias) {
        return new InsXgroup(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public InsXgroup rename(String name) {
        return new InsXgroup(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public InsXgroup rename(Name name) {
        return new InsXgroup(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public InsXgroup call(Integer grpId, String grpName, String grpDescription, Integer grpType, Integer grpAccess, String grpDbUname, String grpDbPassword) {
        return new InsXgroup(DSL.name(getName()), null, new Field[] { 
              DSL.val(grpId, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(grpName, org.jooq.impl.SQLDataType.VARCHAR(30))
            , DSL.val(grpDescription, org.jooq.impl.SQLDataType.VARCHAR(30))
            , DSL.val(grpType, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(grpAccess, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(grpDbUname, org.jooq.impl.SQLDataType.VARCHAR(30))
            , DSL.val(grpDbPassword, org.jooq.impl.SQLDataType.VARCHAR(16))
        });
    }

    /**
     * Call this table-valued function
     */
    public InsXgroup call(Field<Integer> grpId, Field<String> grpName, Field<String> grpDescription, Field<Integer> grpType, Field<Integer> grpAccess, Field<String> grpDbUname, Field<String> grpDbPassword) {
        return new InsXgroup(DSL.name(getName()), null, new Field[] { 
              grpId
            , grpName
            , grpDescription
            , grpType
            , grpAccess
            , grpDbUname
            , grpDbPassword
        });
    }
}
