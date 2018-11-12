/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.CntTableSync;


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
public class CntTableSyncRecord extends TableRecordImpl<CntTableSyncRecord> implements Record6<Integer, Integer, Integer, Integer, String, Integer> {

    private static final long serialVersionUID = -648319625;

    /**
     * Setter for <code>CNT_TABLE_SYNC.CNT_ID</code>.
     */
    public void setCntId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>CNT_TABLE_SYNC.CNT_ID</code>.
     */
    public Integer getCntId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>CNT_TABLE_SYNC.CNTB_TYPE</code>.
     */
    public void setCntbType(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>CNT_TABLE_SYNC.CNTB_TYPE</code>.
     */
    public Integer getCntbType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>CNT_TABLE_SYNC.CNT_LAST_EXT_ID</code>.
     */
    public void setCntLastExtId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>CNT_TABLE_SYNC.CNT_LAST_EXT_ID</code>.
     */
    public Integer getCntLastExtId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>CNT_TABLE_SYNC.CNT_CURR_SYNC</code>.
     */
    public void setCntCurrSync(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>CNT_TABLE_SYNC.CNT_CURR_SYNC</code>.
     */
    public Integer getCntCurrSync() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>CNT_TABLE_SYNC.CNT_TABLE</code>.
     */
    public void setCntTable(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>CNT_TABLE_SYNC.CNT_TABLE</code>.
     */
    public String getCntTable() {
        return (String) get(4);
    }

    /**
     * Setter for <code>CNT_TABLE_SYNC.CNT_LOG_SYNC</code>.
     */
    public void setCntLogSync(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>CNT_TABLE_SYNC.CNT_LOG_SYNC</code>.
     */
    public Integer getCntLogSync() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, String, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, String, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CntTableSync.CNT_TABLE_SYNC.CNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CntTableSync.CNT_TABLE_SYNC.CNTB_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CntTableSync.CNT_TABLE_SYNC.CNT_LAST_EXT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return CntTableSync.CNT_TABLE_SYNC.CNT_CURR_SYNC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CntTableSync.CNT_TABLE_SYNC.CNT_TABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return CntTableSync.CNT_TABLE_SYNC.CNT_LOG_SYNC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCntId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCntbType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCntLastExtId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getCntCurrSync();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCntTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getCntLogSync();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCntId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCntbType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCntLastExtId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getCntCurrSync();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCntTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getCntLogSync();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntTableSyncRecord value1(Integer value) {
        setCntId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntTableSyncRecord value2(Integer value) {
        setCntbType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntTableSyncRecord value3(Integer value) {
        setCntLastExtId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntTableSyncRecord value4(Integer value) {
        setCntCurrSync(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntTableSyncRecord value5(String value) {
        setCntTable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntTableSyncRecord value6(Integer value) {
        setCntLogSync(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntTableSyncRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CntTableSyncRecord
     */
    public CntTableSyncRecord() {
        super(CntTableSync.CNT_TABLE_SYNC);
    }

    /**
     * Create a detached, initialised CntTableSyncRecord
     */
    public CntTableSyncRecord(Integer cntId, Integer cntbType, Integer cntLastExtId, Integer cntCurrSync, String cntTable, Integer cntLogSync) {
        super(CntTableSync.CNT_TABLE_SYNC);

        set(0, cntId);
        set(1, cntbType);
        set(2, cntLastExtId);
        set(3, cntCurrSync);
        set(4, cntTable);
        set(5, cntLogSync);
    }
}
