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
import ru.smartsarov.citylighting.sprut.tables.records.SetCntControlRecord;


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
public class SetCntControl extends TableImpl<SetCntControlRecord> {

    private static final long serialVersionUID = -1987142477;

    /**
     * The reference instance of <code>SET_CNT_CONTROL</code>
     */
    public static final SetCntControl SET_CNT_CONTROL = new SetCntControl();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SetCntControlRecord> getRecordType() {
        return SetCntControlRecord.class;
    }

    /**
     * The column <code>SET_CNT_CONTROL.OK</code>.
     */
    public final TableField<SetCntControlRecord, Integer> OK = createField("OK", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>SET_CNT_CONTROL</code> table reference
     */
    public SetCntControl() {
        this(DSL.name("SET_CNT_CONTROL"), null);
    }

    /**
     * Create an aliased <code>SET_CNT_CONTROL</code> table reference
     */
    public SetCntControl(String alias) {
        this(DSL.name(alias), SET_CNT_CONTROL);
    }

    /**
     * Create an aliased <code>SET_CNT_CONTROL</code> table reference
     */
    public SetCntControl(Name alias) {
        this(alias, SET_CNT_CONTROL);
    }

    private SetCntControl(Name alias, Table<SetCntControlRecord> aliased) {
        this(alias, aliased, new Field[5]);
    }

    private SetCntControl(Name alias, Table<SetCntControlRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SetCntControl(Table<O> child, ForeignKey<O, SetCntControlRecord> key) {
        super(child, key, SET_CNT_CONTROL);
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
    public SetCntControl as(String alias) {
        return new SetCntControl(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetCntControl as(Name alias) {
        return new SetCntControl(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public SetCntControl rename(String name) {
        return new SetCntControl(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public SetCntControl rename(Name name) {
        return new SetCntControl(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public SetCntControl call(Integer cntid, Integer cntAction, Integer cntLimit, String login, String pass) {
        return new SetCntControl(DSL.name(getName()), null, new Field[] { 
              DSL.val(cntid, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(cntAction, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(cntLimit, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(login, org.jooq.impl.SQLDataType.VARCHAR(32))
            , DSL.val(pass, org.jooq.impl.SQLDataType.VARCHAR(32))
        });
    }

    /**
     * Call this table-valued function
     */
    public SetCntControl call(Field<Integer> cntid, Field<Integer> cntAction, Field<Integer> cntLimit, Field<String> login, Field<String> pass) {
        return new SetCntControl(DSL.name(getName()), null, new Field[] { 
              cntid
            , cntAction
            , cntLimit
            , login
            , pass
        });
    }
}
