/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Time;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.CntTariff;


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
public class CntTariffRecord extends UpdatableRecordImpl<CntTariffRecord> implements Record6<Integer, Integer, Integer, String, Time, Time> {

    private static final long serialVersionUID = 1124134087;

    /**
     * Setter for <code>CNT_TARIFF.CT_ID</code>.
     */
    public void setCtId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>CNT_TARIFF.CT_ID</code>.
     */
    public Integer getCtId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>CNT_TARIFF.CT_GRID</code>.
     */
    public void setCtGrid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>CNT_TARIFF.CT_GRID</code>.
     */
    public Integer getCtGrid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>CNT_TARIFF.CT_NUM</code>.
     */
    public void setCtNum(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>CNT_TARIFF.CT_NUM</code>.
     */
    public Integer getCtNum() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>CNT_TARIFF.CT_NAME</code>.
     */
    public void setCtName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>CNT_TARIFF.CT_NAME</code>.
     */
    public String getCtName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>CNT_TARIFF.CT_STIME</code>.
     */
    public void setCtStime(Time value) {
        set(4, value);
    }

    /**
     * Getter for <code>CNT_TARIFF.CT_STIME</code>.
     */
    public Time getCtStime() {
        return (Time) get(4);
    }

    /**
     * Setter for <code>CNT_TARIFF.CT_ETIME</code>.
     */
    public void setCtEtime(Time value) {
        set(5, value);
    }

    /**
     * Getter for <code>CNT_TARIFF.CT_ETIME</code>.
     */
    public Time getCtEtime() {
        return (Time) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, String, Time, Time> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, String, Time, Time> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CntTariff.CNT_TARIFF.CT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CntTariff.CNT_TARIFF.CT_GRID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CntTariff.CNT_TARIFF.CT_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CntTariff.CNT_TARIFF.CT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Time> field5() {
        return CntTariff.CNT_TARIFF.CT_STIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Time> field6() {
        return CntTariff.CNT_TARIFF.CT_ETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCtId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCtGrid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCtNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCtName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Time component5() {
        return getCtStime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Time component6() {
        return getCtEtime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCtId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCtGrid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCtNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCtName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Time value5() {
        return getCtStime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Time value6() {
        return getCtEtime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntTariffRecord value1(Integer value) {
        setCtId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntTariffRecord value2(Integer value) {
        setCtGrid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntTariffRecord value3(Integer value) {
        setCtNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntTariffRecord value4(String value) {
        setCtName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntTariffRecord value5(Time value) {
        setCtStime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntTariffRecord value6(Time value) {
        setCtEtime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntTariffRecord values(Integer value1, Integer value2, Integer value3, String value4, Time value5, Time value6) {
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
     * Create a detached CntTariffRecord
     */
    public CntTariffRecord() {
        super(CntTariff.CNT_TARIFF);
    }

    /**
     * Create a detached, initialised CntTariffRecord
     */
    public CntTariffRecord(Integer ctId, Integer ctGrid, Integer ctNum, String ctName, Time ctStime, Time ctEtime) {
        super(CntTariff.CNT_TARIFF);

        set(0, ctId);
        set(1, ctGrid);
        set(2, ctNum);
        set(3, ctName);
        set(4, ctStime);
        set(5, ctEtime);
    }
}
