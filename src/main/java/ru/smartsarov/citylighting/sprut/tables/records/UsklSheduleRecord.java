/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.UsklShedule;


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
public class UsklSheduleRecord extends UpdatableRecordImpl<UsklSheduleRecord> implements Record4<Integer, byte[], String, Integer> {

    private static final long serialVersionUID = 936275006;

    /**
     * Setter for <code>USKL_SHEDULE.USKLS_ID</code>.
     */
    public void setUsklsId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>USKL_SHEDULE.USKLS_ID</code>.
     */
    public Integer getUsklsId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>USKL_SHEDULE.USKLS_CRONTAB</code>.
     */
    public void setUsklsCrontab(byte... value) {
        set(1, value);
    }

    /**
     * Getter for <code>USKL_SHEDULE.USKLS_CRONTAB</code>.
     */
    public byte[] getUsklsCrontab() {
        return (byte[]) get(1);
    }

    /**
     * Setter for <code>USKL_SHEDULE.USKLS_PARAM</code>.
     */
    public void setUsklsParam(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>USKL_SHEDULE.USKLS_PARAM</code>.
     */
    public String getUsklsParam() {
        return (String) get(2);
    }

    /**
     * Setter for <code>USKL_SHEDULE.USKLS_SYNC</code>.
     */
    public void setUsklsSync(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>USKL_SHEDULE.USKLS_SYNC</code>.
     */
    public Integer getUsklsSync() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, byte[], String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, byte[], String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UsklShedule.USKL_SHEDULE.USKLS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field2() {
        return UsklShedule.USKL_SHEDULE.USKLS_CRONTAB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UsklShedule.USKL_SHEDULE.USKLS_PARAM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return UsklShedule.USKL_SHEDULE.USKLS_SYNC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getUsklsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component2() {
        return getUsklsCrontab();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getUsklsParam();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getUsklsSync();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUsklsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value2() {
        return getUsklsCrontab();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUsklsParam();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUsklsSync();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsklSheduleRecord value1(Integer value) {
        setUsklsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsklSheduleRecord value2(byte... value) {
        setUsklsCrontab(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsklSheduleRecord value3(String value) {
        setUsklsParam(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsklSheduleRecord value4(Integer value) {
        setUsklsSync(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsklSheduleRecord values(Integer value1, byte[] value2, String value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsklSheduleRecord
     */
    public UsklSheduleRecord() {
        super(UsklShedule.USKL_SHEDULE);
    }

    /**
     * Create a detached, initialised UsklSheduleRecord
     */
    public UsklSheduleRecord(Integer usklsId, byte[] usklsCrontab, String usklsParam, Integer usklsSync) {
        super(UsklShedule.USKL_SHEDULE);

        set(0, usklsId);
        set(1, usklsCrontab);
        set(2, usklsParam);
        set(3, usklsSync);
    }
}
