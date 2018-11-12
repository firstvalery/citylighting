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
import ru.smartsarov.citylighting.sprut.tables.records.XuserRecord;


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
public class Xuser extends TableImpl<XuserRecord> {

    private static final long serialVersionUID = -279449843;

    /**
     * The reference instance of <code>XUSER</code>
     */
    public static final Xuser XUSER = new Xuser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<XuserRecord> getRecordType() {
        return XuserRecord.class;
    }

    /**
     * The column <code>XUSER.USER_ID</code>.
     */
    public final TableField<XuserRecord, Integer> USER_ID = createField("USER_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>XUSER.USER_AB_ID</code>.
     */
    public final TableField<XuserRecord, Integer> USER_AB_ID = createField("USER_AB_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>XUSER.USER_GRP_ID</code>.
     */
    public final TableField<XuserRecord, Integer> USER_GRP_ID = createField("USER_GRP_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>XUSER.USER_TYPE</code>.
     */
    public final TableField<XuserRecord, Integer> USER_TYPE = createField("USER_TYPE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>XUSER.USER_NAME</code>.
     */
    public final TableField<XuserRecord, String> USER_NAME = createField("USER_NAME", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>XUSER.USER_DESCRIPTION</code>.
     */
    public final TableField<XuserRecord, String> USER_DESCRIPTION = createField("USER_DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>XUSER.USER_PASSWORD</code>.
     */
    public final TableField<XuserRecord, byte[]> USER_PASSWORD = createField("USER_PASSWORD", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>XUSER.USER_KEY</code>.
     */
    public final TableField<XuserRecord, byte[]> USER_KEY = createField("USER_KEY", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * Create a <code>XUSER</code> table reference
     */
    public Xuser() {
        this(DSL.name("XUSER"), null);
    }

    /**
     * Create an aliased <code>XUSER</code> table reference
     */
    public Xuser(String alias) {
        this(DSL.name(alias), XUSER);
    }

    /**
     * Create an aliased <code>XUSER</code> table reference
     */
    public Xuser(Name alias) {
        this(alias, XUSER);
    }

    private Xuser(Name alias, Table<XuserRecord> aliased) {
        this(alias, aliased, null);
    }

    private Xuser(Name alias, Table<XuserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Xuser(Table<O> child, ForeignKey<O, XuserRecord> key) {
        super(child, key, XUSER);
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
    public UniqueKey<XuserRecord> getPrimaryKey() {
        return Keys.INTEG_106;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<XuserRecord>> getKeys() {
        return Arrays.<UniqueKey<XuserRecord>>asList(Keys.INTEG_106);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<XuserRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<XuserRecord, ?>>asList(Keys.INTEG_107);
    }

    public Xgroup xgroup() {
        return new Xgroup(this, Keys.INTEG_107);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Xuser as(String alias) {
        return new Xuser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Xuser as(Name alias) {
        return new Xuser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Xuser rename(String name) {
        return new Xuser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Xuser rename(Name name) {
        return new Xuser(name, null);
    }
}
