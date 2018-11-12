/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables;


import java.sql.Timestamp;
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
import ru.smartsarov.citylighting.sprut.tables.records.GuardAlarmProcessRecord;


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
public class GuardAlarmProcess extends TableImpl<GuardAlarmProcessRecord> {

    private static final long serialVersionUID = -1665673771;

    /**
     * The reference instance of <code>GUARD_ALARM_PROCESS</code>
     */
    public static final GuardAlarmProcess GUARD_ALARM_PROCESS = new GuardAlarmProcess();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GuardAlarmProcessRecord> getRecordType() {
        return GuardAlarmProcessRecord.class;
    }

    /**
     * The column <code>GUARD_ALARM_PROCESS.GRDAP_ID</code>.
     */
    public final TableField<GuardAlarmProcessRecord, Integer> GRDAP_ID = createField("GRDAP_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>GUARD_ALARM_PROCESS.GRDAP_LOG_ID</code>.
     */
    public final TableField<GuardAlarmProcessRecord, Integer> GRDAP_LOG_ID = createField("GRDAP_LOG_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GUARD_ALARM_PROCESS.GRDAP_DATETIME</code>.
     */
    public final TableField<GuardAlarmProcessRecord, Timestamp> GRDAP_DATETIME = createField("GRDAP_DATETIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GUARD_ALARM_PROCESS.GRDAP_STATE</code>.
     */
    public final TableField<GuardAlarmProcessRecord, Short> GRDAP_STATE = createField("GRDAP_STATE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>GUARD_ALARM_PROCESS.GRDAP_MCHS_TIME</code>.
     */
    public final TableField<GuardAlarmProcessRecord, Timestamp> GRDAP_MCHS_TIME = createField("GRDAP_MCHS_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GUARD_ALARM_PROCESS.GRDAP_MCHS_COUNT</code>.
     */
    public final TableField<GuardAlarmProcessRecord, Integer> GRDAP_MCHS_COUNT = createField("GRDAP_MCHS_COUNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GUARD_ALARM_PROCESS.GRDAP_POLICE_TIME</code>.
     */
    public final TableField<GuardAlarmProcessRecord, Timestamp> GRDAP_POLICE_TIME = createField("GRDAP_POLICE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GUARD_ALARM_PROCESS.GRDAP_POLICE_COUNT</code>.
     */
    public final TableField<GuardAlarmProcessRecord, Integer> GRDAP_POLICE_COUNT = createField("GRDAP_POLICE_COUNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GUARD_ALARM_PROCESS.GRDAP_AMBUL_TIME</code>.
     */
    public final TableField<GuardAlarmProcessRecord, Timestamp> GRDAP_AMBUL_TIME = createField("GRDAP_AMBUL_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GUARD_ALARM_PROCESS.GRDAP_AMBUL_COUNT</code>.
     */
    public final TableField<GuardAlarmProcessRecord, Integer> GRDAP_AMBUL_COUNT = createField("GRDAP_AMBUL_COUNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GUARD_ALARM_PROCESS.GRDAP_GAZ_TIME</code>.
     */
    public final TableField<GuardAlarmProcessRecord, Timestamp> GRDAP_GAZ_TIME = createField("GRDAP_GAZ_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GUARD_ALARM_PROCESS.GRDAP_GAZ_COUNT</code>.
     */
    public final TableField<GuardAlarmProcessRecord, Integer> GRDAP_GAZ_COUNT = createField("GRDAP_GAZ_COUNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>GUARD_ALARM_PROCESS.GRDAP_OTHER_TIME</code>.
     */
    public final TableField<GuardAlarmProcessRecord, Timestamp> GRDAP_OTHER_TIME = createField("GRDAP_OTHER_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>GUARD_ALARM_PROCESS.GRDAP_OTHER_COUNT</code>.
     */
    public final TableField<GuardAlarmProcessRecord, Integer> GRDAP_OTHER_COUNT = createField("GRDAP_OTHER_COUNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>GUARD_ALARM_PROCESS</code> table reference
     */
    public GuardAlarmProcess() {
        this(DSL.name("GUARD_ALARM_PROCESS"), null);
    }

    /**
     * Create an aliased <code>GUARD_ALARM_PROCESS</code> table reference
     */
    public GuardAlarmProcess(String alias) {
        this(DSL.name(alias), GUARD_ALARM_PROCESS);
    }

    /**
     * Create an aliased <code>GUARD_ALARM_PROCESS</code> table reference
     */
    public GuardAlarmProcess(Name alias) {
        this(alias, GUARD_ALARM_PROCESS);
    }

    private GuardAlarmProcess(Name alias, Table<GuardAlarmProcessRecord> aliased) {
        this(alias, aliased, null);
    }

    private GuardAlarmProcess(Name alias, Table<GuardAlarmProcessRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GuardAlarmProcess(Table<O> child, ForeignKey<O, GuardAlarmProcessRecord> key) {
        super(child, key, GUARD_ALARM_PROCESS);
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
    public UniqueKey<GuardAlarmProcessRecord> getPrimaryKey() {
        return Keys.PK_GUARD_ALARM_PROCESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GuardAlarmProcessRecord>> getKeys() {
        return Arrays.<UniqueKey<GuardAlarmProcessRecord>>asList(Keys.PK_GUARD_ALARM_PROCESS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardAlarmProcess as(String alias) {
        return new GuardAlarmProcess(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardAlarmProcess as(Name alias) {
        return new GuardAlarmProcess(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GuardAlarmProcess rename(String name) {
        return new GuardAlarmProcess(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GuardAlarmProcess rename(Name name) {
        return new GuardAlarmProcess(name, null);
    }
}
