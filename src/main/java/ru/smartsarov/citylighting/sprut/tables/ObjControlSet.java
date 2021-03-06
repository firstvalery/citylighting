/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables;


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
import ru.smartsarov.citylighting.sprut.tables.records.ObjControlSetRecord;


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
public class ObjControlSet extends TableImpl<ObjControlSetRecord> {

    private static final long serialVersionUID = -1674159859;

    /**
     * The reference instance of <code>OBJ_CONTROL_SET</code>
     */
    public static final ObjControlSet OBJ_CONTROL_SET = new ObjControlSet();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ObjControlSetRecord> getRecordType() {
        return ObjControlSetRecord.class;
    }

    /**
     * The column <code>OBJ_CONTROL_SET.RESULT</code>.
     */
    public final TableField<ObjControlSetRecord, Integer> RESULT = createField("RESULT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>OBJ_CONTROL_SET</code> table reference
     */
    public ObjControlSet() {
        this(DSL.name("OBJ_CONTROL_SET"), null);
    }

    /**
     * Create an aliased <code>OBJ_CONTROL_SET</code> table reference
     */
    public ObjControlSet(String alias) {
        this(DSL.name(alias), OBJ_CONTROL_SET);
    }

    /**
     * Create an aliased <code>OBJ_CONTROL_SET</code> table reference
     */
    public ObjControlSet(Name alias) {
        this(alias, OBJ_CONTROL_SET);
    }

    private ObjControlSet(Name alias, Table<ObjControlSetRecord> aliased) {
        this(alias, aliased, new Field[12]);
    }

    private ObjControlSet(Name alias, Table<ObjControlSetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ObjControlSet(Table<O> child, ForeignKey<O, ObjControlSetRecord> key) {
        super(child, key, OBJ_CONTROL_SET);
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
    public ObjControlSet as(String alias) {
        return new ObjControlSet(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjControlSet as(Name alias) {
        return new ObjControlSet(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public ObjControlSet rename(String name) {
        return new ObjControlSet(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public ObjControlSet rename(Name name) {
        return new ObjControlSet(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public ObjControlSet call(String login, String pass, Integer objId, Integer objType, Integer objAction, Integer objActionType, Integer paramInt, Double paramDouble, String paramStr, String commentUser, Timestamp commentDatetime, String commentIp) {
        return new ObjControlSet(DSL.name(getName()), null, new Field[] { 
              DSL.val(login, org.jooq.impl.SQLDataType.VARCHAR(32))
            , DSL.val(pass, org.jooq.impl.SQLDataType.VARCHAR(32))
            , DSL.val(objId, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(objType, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(objAction, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(objActionType, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(paramInt, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(paramDouble, org.jooq.impl.SQLDataType.DOUBLE)
            , DSL.val(paramStr, org.jooq.impl.SQLDataType.VARCHAR(200))
            , DSL.val(commentUser, org.jooq.impl.SQLDataType.VARCHAR(32))
            , DSL.val(commentDatetime, org.jooq.impl.SQLDataType.TIMESTAMP)
            , DSL.val(commentIp, org.jooq.impl.SQLDataType.VARCHAR(100))
        });
    }

    /**
     * Call this table-valued function
     */
    public ObjControlSet call(Field<String> login, Field<String> pass, Field<Integer> objId, Field<Integer> objType, Field<Integer> objAction, Field<Integer> objActionType, Field<Integer> paramInt, Field<Double> paramDouble, Field<String> paramStr, Field<String> commentUser, Field<Timestamp> commentDatetime, Field<String> commentIp) {
        return new ObjControlSet(DSL.name(getName()), null, new Field[] { 
              login
            , pass
            , objId
            , objType
            , objAction
            , objActionType
            , paramInt
            , paramDouble
            , paramStr
            , commentUser
            , commentDatetime
            , commentIp
        });
    }
}
