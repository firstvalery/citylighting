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

import ru.smartsarov.citylighting.sprut.tables.GuardPintype;


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
public class GuardPintypeRecord extends UpdatableRecordImpl<GuardPintypeRecord> implements Record4<Integer, String, String, Double> {

    private static final long serialVersionUID = 1393935744;

    /**
     * Setter for <code>GUARD_PINTYPE.GPINT_ID</code>.
     */
    public void setGpintId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>GUARD_PINTYPE.GPINT_ID</code>.
     */
    public Integer getGpintId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>GUARD_PINTYPE.GPINT_NAME</code>.
     */
    public void setGpintName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>GUARD_PINTYPE.GPINT_NAME</code>.
     */
    public String getGpintName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>GUARD_PINTYPE.GPINT_CHR</code>.
     */
    public void setGpintChr(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>GUARD_PINTYPE.GPINT_CHR</code>.
     */
    public String getGpintChr() {
        return (String) get(2);
    }

    /**
     * Setter for <code>GUARD_PINTYPE.GPINT_MUL</code>.
     */
    public void setGpintMul(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>GUARD_PINTYPE.GPINT_MUL</code>.
     */
    public Double getGpintMul() {
        return (Double) get(3);
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
    public Row4<Integer, String, String, Double> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Double> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return GuardPintype.GUARD_PINTYPE.GPINT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GuardPintype.GUARD_PINTYPE.GPINT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GuardPintype.GUARD_PINTYPE.GPINT_CHR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return GuardPintype.GUARD_PINTYPE.GPINT_MUL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getGpintId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getGpintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getGpintChr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getGpintMul();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getGpintId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGpintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGpintChr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getGpintMul();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardPintypeRecord value1(Integer value) {
        setGpintId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardPintypeRecord value2(String value) {
        setGpintName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardPintypeRecord value3(String value) {
        setGpintChr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardPintypeRecord value4(Double value) {
        setGpintMul(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardPintypeRecord values(Integer value1, String value2, String value3, Double value4) {
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
     * Create a detached GuardPintypeRecord
     */
    public GuardPintypeRecord() {
        super(GuardPintype.GUARD_PINTYPE);
    }

    /**
     * Create a detached, initialised GuardPintypeRecord
     */
    public GuardPintypeRecord(Integer gpintId, String gpintName, String gpintChr, Double gpintMul) {
        super(GuardPintype.GUARD_PINTYPE);

        set(0, gpintId);
        set(1, gpintName);
        set(2, gpintChr);
        set(3, gpintMul);
    }
}