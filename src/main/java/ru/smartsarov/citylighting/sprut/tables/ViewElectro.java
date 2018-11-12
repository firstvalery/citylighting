/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables;


import java.sql.Date;
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
import ru.smartsarov.citylighting.sprut.tables.records.ViewElectroRecord;


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
public class ViewElectro extends TableImpl<ViewElectroRecord> {

    private static final long serialVersionUID = -994713765;

    /**
     * The reference instance of <code>VIEW_ELECTRO</code>
     */
    public static final ViewElectro VIEW_ELECTRO = new ViewElectro();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewElectroRecord> getRecordType() {
        return ViewElectroRecord.class;
    }

    /**
     * The column <code>VIEW_ELECTRO.CID</code>.
     */
    public final TableField<ViewElectroRecord, Integer> CID = createField("CID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>VIEW_ELECTRO.IP</code>.
     */
    public final TableField<ViewElectroRecord, String> IP = createField("IP", org.jooq.impl.SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>VIEW_ELECTRO.UID</code>.
     */
    public final TableField<ViewElectroRecord, Integer> UID = createField("UID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>VIEW_ELECTRO.USN</code>.
     */
    public final TableField<ViewElectroRecord, Integer> USN = createField("USN", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>VIEW_ELECTRO.UT</code>.
     */
    public final TableField<ViewElectroRecord, Integer> UT = createField("UT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>VIEW_ELECTRO.UST</code>.
     */
    public final TableField<ViewElectroRecord, Integer> UST = createField("UST", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>VIEW_ELECTRO.CST</code>.
     */
    public final TableField<ViewElectroRecord, Integer> CST = createField("CST", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>VIEW_ELECTRO.LASTPOLL</code>.
     */
    public final TableField<ViewElectroRecord, Timestamp> LASTPOLL = createField("LASTPOLL", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>VIEW_ELECTRO.LASTCLOG</code>.
     */
    public final TableField<ViewElectroRecord, Timestamp> LASTCLOG = createField("LASTCLOG", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>VIEW_ELECTRO.LASTDLOG</code>.
     */
    public final TableField<ViewElectroRecord, Date> LASTDLOG = createField("LASTDLOG", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>VIEW_ELECTRO.LASTMLOG</code>.
     */
    public final TableField<ViewElectroRecord, Date> LASTMLOG = createField("LASTMLOG", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>VIEW_ELECTRO.LASTPROF</code>.
     */
    public final TableField<ViewElectroRecord, Timestamp> LASTPROF = createField("LASTPROF", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>VIEW_ELECTRO.CTIME</code>.
     */
    public final TableField<ViewElectroRecord, Timestamp> CTIME = createField("CTIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>VIEW_ELECTRO.CNAME</code>.
     */
    public final TableField<ViewElectroRecord, String> CNAME = createField("CNAME", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>VIEW_ELECTRO.CTYPE</code>.
     */
    public final TableField<ViewElectroRecord, String> CTYPE = createField("CTYPE", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>VIEW_ELECTRO.TID</code>.
     */
    public final TableField<ViewElectroRecord, Integer> TID = createField("TID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>VIEW_ELECTRO.SN</code>.
     */
    public final TableField<ViewElectroRecord, String> SN = createField("SN", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>VIEW_ELECTRO.NADR</code>.
     */
    public final TableField<ViewElectroRecord, String> NADR = createField("NADR", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>VIEW_ELECTRO.COM</code>.
     */
    public final TableField<ViewElectroRecord, Integer> COM = createField("COM", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>VIEW_ELECTRO.POLL</code>.
     */
    public final TableField<ViewElectroRecord, Integer> POLL = createField("POLL", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>VIEW_ELECTRO.ABID</code>.
     */
    public final TableField<ViewElectroRecord, Integer> ABID = createField("ABID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>VIEW_ELECTRO.UABID</code>.
     */
    public final TableField<ViewElectroRecord, Integer> UABID = createField("UABID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>VIEW_ELECTRO.ADRID</code>.
     */
    public final TableField<ViewElectroRecord, Integer> ADRID = createField("ADRID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>VIEW_ELECTRO</code> table reference
     */
    public ViewElectro() {
        this(DSL.name("VIEW_ELECTRO"), null);
    }

    /**
     * Create an aliased <code>VIEW_ELECTRO</code> table reference
     */
    public ViewElectro(String alias) {
        this(DSL.name(alias), VIEW_ELECTRO);
    }

    /**
     * Create an aliased <code>VIEW_ELECTRO</code> table reference
     */
    public ViewElectro(Name alias) {
        this(alias, VIEW_ELECTRO);
    }

    private ViewElectro(Name alias, Table<ViewElectroRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewElectro(Name alias, Table<ViewElectroRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ViewElectro(Table<O> child, ForeignKey<O, ViewElectroRecord> key) {
        super(child, key, VIEW_ELECTRO);
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
    public ViewElectro as(String alias) {
        return new ViewElectro(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewElectro as(Name alias) {
        return new ViewElectro(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewElectro rename(String name) {
        return new ViewElectro(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewElectro rename(Name name) {
        return new ViewElectro(name, null);
    }
}