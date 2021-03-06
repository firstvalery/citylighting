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
import ru.smartsarov.citylighting.sprut.tables.records.Mon$callStackRecord;


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
public class Mon$callStack extends TableImpl<Mon$callStackRecord> {

    private static final long serialVersionUID = -1952080859;

    /**
     * The reference instance of <code>MON$CALL_STACK</code>
     */
    public static final Mon$callStack MON$CALL_STACK = new Mon$callStack();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Mon$callStackRecord> getRecordType() {
        return Mon$callStackRecord.class;
    }

    /**
     * The column <code>MON$CALL_STACK.MON$CALL_ID</code>.
     */
    public final TableField<Mon$callStackRecord, Integer> MON$CALL_ID = createField("MON$CALL_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>MON$CALL_STACK.MON$STATEMENT_ID</code>.
     */
    public final TableField<Mon$callStackRecord, Integer> MON$STATEMENT_ID = createField("MON$STATEMENT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>MON$CALL_STACK.MON$CALLER_ID</code>.
     */
    public final TableField<Mon$callStackRecord, Integer> MON$CALLER_ID = createField("MON$CALLER_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>MON$CALL_STACK.MON$OBJECT_NAME</code>.
     */
    public final TableField<Mon$callStackRecord, String> MON$OBJECT_NAME = createField("MON$OBJECT_NAME", org.jooq.impl.SQLDataType.CHAR, this, "");

    /**
     * The column <code>MON$CALL_STACK.MON$OBJECT_TYPE</code>.
     */
    public final TableField<Mon$callStackRecord, Short> MON$OBJECT_TYPE = createField("MON$OBJECT_TYPE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>MON$CALL_STACK.MON$TIMESTAMP</code>.
     */
    public final TableField<Mon$callStackRecord, Timestamp> MON$TIMESTAMP = createField("MON$TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>MON$CALL_STACK.MON$SOURCE_LINE</code>.
     */
    public final TableField<Mon$callStackRecord, Integer> MON$SOURCE_LINE = createField("MON$SOURCE_LINE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>MON$CALL_STACK.MON$SOURCE_COLUMN</code>.
     */
    public final TableField<Mon$callStackRecord, Integer> MON$SOURCE_COLUMN = createField("MON$SOURCE_COLUMN", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>MON$CALL_STACK.MON$STAT_ID</code>.
     */
    public final TableField<Mon$callStackRecord, Integer> MON$STAT_ID = createField("MON$STAT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>MON$CALL_STACK</code> table reference
     */
    public Mon$callStack() {
        this(DSL.name("MON$CALL_STACK"), null);
    }

    /**
     * Create an aliased <code>MON$CALL_STACK</code> table reference
     */
    public Mon$callStack(String alias) {
        this(DSL.name(alias), MON$CALL_STACK);
    }

    /**
     * Create an aliased <code>MON$CALL_STACK</code> table reference
     */
    public Mon$callStack(Name alias) {
        this(alias, MON$CALL_STACK);
    }

    private Mon$callStack(Name alias, Table<Mon$callStackRecord> aliased) {
        this(alias, aliased, null);
    }

    private Mon$callStack(Name alias, Table<Mon$callStackRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Mon$callStack(Table<O> child, ForeignKey<O, Mon$callStackRecord> key) {
        super(child, key, MON$CALL_STACK);
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
    public Mon$callStack as(String alias) {
        return new Mon$callStack(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$callStack as(Name alias) {
        return new Mon$callStack(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Mon$callStack rename(String name) {
        return new Mon$callStack(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Mon$callStack rename(Name name) {
        return new Mon$callStack(name, null);
    }
}
