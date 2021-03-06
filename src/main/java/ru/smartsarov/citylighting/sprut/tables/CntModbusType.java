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
import ru.smartsarov.citylighting.sprut.tables.records.CntModbusTypeRecord;


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
public class CntModbusType extends TableImpl<CntModbusTypeRecord> {

    private static final long serialVersionUID = 201745736;

    /**
     * The reference instance of <code>CNT_MODBUS_TYPE</code>
     */
    public static final CntModbusType CNT_MODBUS_TYPE = new CntModbusType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CntModbusTypeRecord> getRecordType() {
        return CntModbusTypeRecord.class;
    }

    /**
     * The column <code>CNT_MODBUS_TYPE.ID</code>.
     */
    public final TableField<CntModbusTypeRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CNT_MODBUS_TYPE.CNT_ATYPE</code>.
     */
    public final TableField<CntModbusTypeRecord, Integer> CNT_ATYPE = createField("CNT_ATYPE", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("DEFAULT 0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>CNT_MODBUS_TYPE.CNT_BTYPE</code>.
     */
    public final TableField<CntModbusTypeRecord, Integer> CNT_BTYPE = createField("CNT_BTYPE", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("DEFAULT 0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>CNT_MODBUS_TYPE.CNT_ID</code>.
     */
    public final TableField<CntModbusTypeRecord, Integer> CNT_ID = createField("CNT_ID", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("DEFAULT 0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>CNT_MODBUS_TYPE.MODBUS_ADDRESS</code>.
     */
    public final TableField<CntModbusTypeRecord, Long> MODBUS_ADDRESS = createField("MODBUS_ADDRESS", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>CNT_MODBUS_TYPE.MODBUS_TYPE</code>.
     */
    public final TableField<CntModbusTypeRecord, Integer> MODBUS_TYPE = createField("MODBUS_TYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>CNT_MODBUS_TYPE.MODBUS_READ_WRITE</code>.
     */
    public final TableField<CntModbusTypeRecord, Integer> MODBUS_READ_WRITE = createField("MODBUS_READ_WRITE", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("DEFAULT 1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>CNT_MODBUS_TYPE.GROUP_NAME</code>.
     */
    public final TableField<CntModbusTypeRecord, String> GROUP_NAME = createField("GROUP_NAME", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>CNT_MODBUS_TYPE.NAME</code>.
     */
    public final TableField<CntModbusTypeRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>CNT_MODBUS_TYPE.MEMO</code>.
     */
    public final TableField<CntModbusTypeRecord, String> MEMO = createField("MEMO", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * Create a <code>CNT_MODBUS_TYPE</code> table reference
     */
    public CntModbusType() {
        this(DSL.name("CNT_MODBUS_TYPE"), null);
    }

    /**
     * Create an aliased <code>CNT_MODBUS_TYPE</code> table reference
     */
    public CntModbusType(String alias) {
        this(DSL.name(alias), CNT_MODBUS_TYPE);
    }

    /**
     * Create an aliased <code>CNT_MODBUS_TYPE</code> table reference
     */
    public CntModbusType(Name alias) {
        this(alias, CNT_MODBUS_TYPE);
    }

    private CntModbusType(Name alias, Table<CntModbusTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private CntModbusType(Name alias, Table<CntModbusTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CntModbusType(Table<O> child, ForeignKey<O, CntModbusTypeRecord> key) {
        super(child, key, CNT_MODBUS_TYPE);
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
    public UniqueKey<CntModbusTypeRecord> getPrimaryKey() {
        return Keys.PK_CNT_MODBUS_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CntModbusTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<CntModbusTypeRecord>>asList(Keys.PK_CNT_MODBUS_TYPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntModbusType as(String alias) {
        return new CntModbusType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntModbusType as(Name alias) {
        return new CntModbusType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CntModbusType rename(String name) {
        return new CntModbusType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CntModbusType rename(Name name) {
        return new CntModbusType(name, null);
    }
}
