/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.UskExtChange;


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
public class UskExtChangeRecord extends UpdatableRecordImpl<UskExtChangeRecord> implements Record5<Integer, Integer, Integer, Integer, Timestamp> {

    private static final long serialVersionUID = 171602561;

    /**
     * Setter for <code>USK_EXT_CHANGE.USKEC_ID</code>.
     */
    public void setUskecId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>USK_EXT_CHANGE.USKEC_ID</code>.
     */
    public Integer getUskecId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>USK_EXT_CHANGE.USKEC_USK_EXT_ID</code>.
     */
    public void setUskecUskExtId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>USK_EXT_CHANGE.USKEC_USK_EXT_ID</code>.
     */
    public Integer getUskecUskExtId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>USK_EXT_CHANGE.USKEC_TYPE</code>.
     */
    public void setUskecType(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>USK_EXT_CHANGE.USKEC_TYPE</code>.
     */
    public Integer getUskecType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>USK_EXT_CHANGE.USKEC_XUSER_ID</code>.
     */
    public void setUskecXuserId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>USK_EXT_CHANGE.USKEC_XUSER_ID</code>.
     */
    public Integer getUskecXuserId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>USK_EXT_CHANGE.USKEC_DATE</code>.
     */
    public void setUskecDate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>USK_EXT_CHANGE.USKEC_DATE</code>.
     */
    public Timestamp getUskecDate() {
        return (Timestamp) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Integer, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Integer, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UskExtChange.USK_EXT_CHANGE.USKEC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UskExtChange.USK_EXT_CHANGE.USKEC_USK_EXT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return UskExtChange.USK_EXT_CHANGE.USKEC_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return UskExtChange.USK_EXT_CHANGE.USKEC_XUSER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return UskExtChange.USK_EXT_CHANGE.USKEC_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getUskecId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getUskecUskExtId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getUskecType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getUskecXuserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getUskecDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUskecId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUskecUskExtId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUskecType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUskecXuserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUskecDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskExtChangeRecord value1(Integer value) {
        setUskecId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskExtChangeRecord value2(Integer value) {
        setUskecUskExtId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskExtChangeRecord value3(Integer value) {
        setUskecType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskExtChangeRecord value4(Integer value) {
        setUskecXuserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskExtChangeRecord value5(Timestamp value) {
        setUskecDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskExtChangeRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UskExtChangeRecord
     */
    public UskExtChangeRecord() {
        super(UskExtChange.USK_EXT_CHANGE);
    }

    /**
     * Create a detached, initialised UskExtChangeRecord
     */
    public UskExtChangeRecord(Integer uskecId, Integer uskecUskExtId, Integer uskecType, Integer uskecXuserId, Timestamp uskecDate) {
        super(UskExtChange.USK_EXT_CHANGE);

        set(0, uskecId);
        set(1, uskecUskExtId);
        set(2, uskecType);
        set(3, uskecXuserId);
        set(4, uskecDate);
    }
}
