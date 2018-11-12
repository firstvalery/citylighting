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
import ru.smartsarov.citylighting.sprut.tables.records.Mon$transactionsRecord;


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
public class Mon$transactions extends TableImpl<Mon$transactionsRecord> {

    private static final long serialVersionUID = -1798328079;

    /**
     * The reference instance of <code>MON$TRANSACTIONS</code>
     */
    public static final Mon$transactions MON$TRANSACTIONS = new Mon$transactions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Mon$transactionsRecord> getRecordType() {
        return Mon$transactionsRecord.class;
    }

    /**
     * The column <code>MON$TRANSACTIONS.MON$TRANSACTION_ID</code>.
     */
    public final TableField<Mon$transactionsRecord, Integer> MON$TRANSACTION_ID = createField("MON$TRANSACTION_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>MON$TRANSACTIONS.MON$ATTACHMENT_ID</code>.
     */
    public final TableField<Mon$transactionsRecord, Integer> MON$ATTACHMENT_ID = createField("MON$ATTACHMENT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>MON$TRANSACTIONS.MON$STATE</code>.
     */
    public final TableField<Mon$transactionsRecord, Short> MON$STATE = createField("MON$STATE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>MON$TRANSACTIONS.MON$TIMESTAMP</code>.
     */
    public final TableField<Mon$transactionsRecord, Timestamp> MON$TIMESTAMP = createField("MON$TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>MON$TRANSACTIONS.MON$TOP_TRANSACTION</code>.
     */
    public final TableField<Mon$transactionsRecord, Integer> MON$TOP_TRANSACTION = createField("MON$TOP_TRANSACTION", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>MON$TRANSACTIONS.MON$OLDEST_TRANSACTION</code>.
     */
    public final TableField<Mon$transactionsRecord, Integer> MON$OLDEST_TRANSACTION = createField("MON$OLDEST_TRANSACTION", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>MON$TRANSACTIONS.MON$OLDEST_ACTIVE</code>.
     */
    public final TableField<Mon$transactionsRecord, Integer> MON$OLDEST_ACTIVE = createField("MON$OLDEST_ACTIVE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>MON$TRANSACTIONS.MON$ISOLATION_MODE</code>.
     */
    public final TableField<Mon$transactionsRecord, Short> MON$ISOLATION_MODE = createField("MON$ISOLATION_MODE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>MON$TRANSACTIONS.MON$LOCK_TIMEOUT</code>.
     */
    public final TableField<Mon$transactionsRecord, Short> MON$LOCK_TIMEOUT = createField("MON$LOCK_TIMEOUT", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>MON$TRANSACTIONS.MON$READ_ONLY</code>.
     */
    public final TableField<Mon$transactionsRecord, Short> MON$READ_ONLY = createField("MON$READ_ONLY", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>MON$TRANSACTIONS.MON$AUTO_COMMIT</code>.
     */
    public final TableField<Mon$transactionsRecord, Short> MON$AUTO_COMMIT = createField("MON$AUTO_COMMIT", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>MON$TRANSACTIONS.MON$AUTO_UNDO</code>.
     */
    public final TableField<Mon$transactionsRecord, Short> MON$AUTO_UNDO = createField("MON$AUTO_UNDO", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>MON$TRANSACTIONS.MON$STAT_ID</code>.
     */
    public final TableField<Mon$transactionsRecord, Integer> MON$STAT_ID = createField("MON$STAT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>MON$TRANSACTIONS</code> table reference
     */
    public Mon$transactions() {
        this(DSL.name("MON$TRANSACTIONS"), null);
    }

    /**
     * Create an aliased <code>MON$TRANSACTIONS</code> table reference
     */
    public Mon$transactions(String alias) {
        this(DSL.name(alias), MON$TRANSACTIONS);
    }

    /**
     * Create an aliased <code>MON$TRANSACTIONS</code> table reference
     */
    public Mon$transactions(Name alias) {
        this(alias, MON$TRANSACTIONS);
    }

    private Mon$transactions(Name alias, Table<Mon$transactionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Mon$transactions(Name alias, Table<Mon$transactionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Mon$transactions(Table<O> child, ForeignKey<O, Mon$transactionsRecord> key) {
        super(child, key, MON$TRANSACTIONS);
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
    public Mon$transactions as(String alias) {
        return new Mon$transactions(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$transactions as(Name alias) {
        return new Mon$transactions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Mon$transactions rename(String name) {
        return new Mon$transactions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Mon$transactions rename(Name name) {
        return new Mon$transactions(name, null);
    }
}