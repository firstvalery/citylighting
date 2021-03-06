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
import ru.smartsarov.citylighting.sprut.tables.records.GetPkeLogJoinedRecord;


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
public class GetPkeLogJoined extends TableImpl<GetPkeLogJoinedRecord> {

    private static final long serialVersionUID = -1049522494;

    /**
     * The reference instance of <code>GET_PKE_LOG_JOINED</code>
     */
    public static final GetPkeLogJoined GET_PKE_LOG_JOINED = new GetPkeLogJoined();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetPkeLogJoinedRecord> getRecordType() {
        return GetPkeLogJoinedRecord.class;
    }

    /**
     * The column <code>GET_PKE_LOG_JOINED.PKL_RECNO</code>.
     */
    public final TableField<GetPkeLogJoinedRecord, Integer> PKL_RECNO = createField("PKL_RECNO", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GET_PKE_LOG_JOINED.PKL_IN1</code>.
     */
    public final TableField<GetPkeLogJoinedRecord, Timestamp> PKL_IN1 = createField("PKL_IN1", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_PKE_LOG_JOINED.PKL_OUT1</code>.
     */
    public final TableField<GetPkeLogJoinedRecord, Timestamp> PKL_OUT1 = createField("PKL_OUT1", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_PKE_LOG_JOINED.PKL_IN2</code>.
     */
    public final TableField<GetPkeLogJoinedRecord, Timestamp> PKL_IN2 = createField("PKL_IN2", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_PKE_LOG_JOINED.PKL_OUT2</code>.
     */
    public final TableField<GetPkeLogJoinedRecord, Timestamp> PKL_OUT2 = createField("PKL_OUT2", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_PKE_LOG_JOINED.PKL_IN3</code>.
     */
    public final TableField<GetPkeLogJoinedRecord, Timestamp> PKL_IN3 = createField("PKL_IN3", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_PKE_LOG_JOINED.PKL_OUT3</code>.
     */
    public final TableField<GetPkeLogJoinedRecord, Timestamp> PKL_OUT3 = createField("PKL_OUT3", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_PKE_LOG_JOINED.PKL_IN4</code>.
     */
    public final TableField<GetPkeLogJoinedRecord, Timestamp> PKL_IN4 = createField("PKL_IN4", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_PKE_LOG_JOINED.PKL_OUT4</code>.
     */
    public final TableField<GetPkeLogJoinedRecord, Timestamp> PKL_OUT4 = createField("PKL_OUT4", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GET_PKE_LOG_JOINED.PKL_INDEX1</code>.
     */
    public final TableField<GetPkeLogJoinedRecord, Short> PKL_INDEX1 = createField("PKL_INDEX1", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>GET_PKE_LOG_JOINED.PKL_INDEX2</code>.
     */
    public final TableField<GetPkeLogJoinedRecord, Short> PKL_INDEX2 = createField("PKL_INDEX2", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>GET_PKE_LOG_JOINED.PKL_INDEX3</code>.
     */
    public final TableField<GetPkeLogJoinedRecord, Short> PKL_INDEX3 = createField("PKL_INDEX3", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>GET_PKE_LOG_JOINED.PKL_INDEX4</code>.
     */
    public final TableField<GetPkeLogJoinedRecord, Short> PKL_INDEX4 = createField("PKL_INDEX4", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>GET_PKE_LOG_JOINED</code> table reference
     */
    public GetPkeLogJoined() {
        this(DSL.name("GET_PKE_LOG_JOINED"), null);
    }

    /**
     * Create an aliased <code>GET_PKE_LOG_JOINED</code> table reference
     */
    public GetPkeLogJoined(String alias) {
        this(DSL.name(alias), GET_PKE_LOG_JOINED);
    }

    /**
     * Create an aliased <code>GET_PKE_LOG_JOINED</code> table reference
     */
    public GetPkeLogJoined(Name alias) {
        this(alias, GET_PKE_LOG_JOINED);
    }

    private GetPkeLogJoined(Name alias, Table<GetPkeLogJoinedRecord> aliased) {
        this(alias, aliased, new Field[4]);
    }

    private GetPkeLogJoined(Name alias, Table<GetPkeLogJoinedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GetPkeLogJoined(Table<O> child, ForeignKey<O, GetPkeLogJoinedRecord> key) {
        super(child, key, GET_PKE_LOG_JOINED);
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
    public GetPkeLogJoined as(String alias) {
        return new GetPkeLogJoined(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetPkeLogJoined as(Name alias) {
        return new GetPkeLogJoined(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetPkeLogJoined rename(String name) {
        return new GetPkeLogJoined(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetPkeLogJoined rename(Name name) {
        return new GetPkeLogJoined(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public GetPkeLogJoined call(Integer cid, Integer kind, Date sdate, Date edate) {
        return new GetPkeLogJoined(DSL.name(getName()), null, new Field[] { 
              DSL.val(cid, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(kind, org.jooq.impl.SQLDataType.INTEGER)
            , DSL.val(sdate, org.jooq.impl.SQLDataType.DATE)
            , DSL.val(edate, org.jooq.impl.SQLDataType.DATE)
        });
    }

    /**
     * Call this table-valued function
     */
    public GetPkeLogJoined call(Field<Integer> cid, Field<Integer> kind, Field<Date> sdate, Field<Date> edate) {
        return new GetPkeLogJoined(DSL.name(getName()), null, new Field[] { 
              cid
            , kind
            , sdate
            , edate
        });
    }
}
