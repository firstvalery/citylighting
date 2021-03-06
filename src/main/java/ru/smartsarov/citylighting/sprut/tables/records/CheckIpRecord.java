/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.CheckIp;


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
public class CheckIpRecord extends TableRecordImpl<CheckIpRecord> implements Record1<Integer> {

    private static final long serialVersionUID = 966176212;

    /**
     * Setter for <code>CHECK_IP.CNT</code>.
     */
    public void setCnt(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>CHECK_IP.CNT</code>.
     */
    public Integer getCnt() {
        return (Integer) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Integer> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Integer> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CheckIp.CHECK_IP.CNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCnt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCnt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CheckIpRecord value1(Integer value) {
        setCnt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CheckIpRecord values(Integer value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CheckIpRecord
     */
    public CheckIpRecord() {
        super(CheckIp.CHECK_IP);
    }

    /**
     * Create a detached, initialised CheckIpRecord
     */
    public CheckIpRecord(Integer cnt) {
        super(CheckIp.CHECK_IP);

        set(0, cnt);
    }
}
