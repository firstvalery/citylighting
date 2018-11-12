/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.ServiceCur;


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
public class ServiceCurRecord extends UpdatableRecordImpl<ServiceCurRecord> implements Record6<Integer, String, Integer, Timestamp, Integer, String> {

    private static final long serialVersionUID = 498610442;

    /**
     * Setter for <code>SERVICE_CUR.SERVICE_ID</code>.
     */
    public void setServiceId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>SERVICE_CUR.SERVICE_ID</code>.
     */
    public Integer getServiceId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>SERVICE_CUR.NAME</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>SERVICE_CUR.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>SERVICE_CUR.TIMEOUT_SEC</code>.
     */
    public void setTimeoutSec(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>SERVICE_CUR.TIMEOUT_SEC</code>.
     */
    public Integer getTimeoutSec() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>SERVICE_CUR.STIME</code>.
     */
    public void setStime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>SERVICE_CUR.STIME</code>.
     */
    public Timestamp getStime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>SERVICE_CUR.STATE</code>.
     */
    public void setState(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>SERVICE_CUR.STATE</code>.
     */
    public Integer getState() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>SERVICE_CUR.COMMENTARY</code>.
     */
    public void setCommentary(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SERVICE_CUR.COMMENTARY</code>.
     */
    public String getCommentary() {
        return (String) get(5);
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
    public Row6<Integer, String, Integer, Timestamp, Integer, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, Integer, Timestamp, Integer, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ServiceCur.SERVICE_CUR.SERVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ServiceCur.SERVICE_CUR.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ServiceCur.SERVICE_CUR.TIMEOUT_SEC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return ServiceCur.SERVICE_CUR.STIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ServiceCur.SERVICE_CUR.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ServiceCur.SERVICE_CUR.COMMENTARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getTimeoutSec();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getStime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCommentary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getTimeoutSec();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getStime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCommentary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceCurRecord value1(Integer value) {
        setServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceCurRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceCurRecord value3(Integer value) {
        setTimeoutSec(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceCurRecord value4(Timestamp value) {
        setStime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceCurRecord value5(Integer value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceCurRecord value6(String value) {
        setCommentary(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceCurRecord values(Integer value1, String value2, Integer value3, Timestamp value4, Integer value5, String value6) {
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
     * Create a detached ServiceCurRecord
     */
    public ServiceCurRecord() {
        super(ServiceCur.SERVICE_CUR);
    }

    /**
     * Create a detached, initialised ServiceCurRecord
     */
    public ServiceCurRecord(Integer serviceId, String name, Integer timeoutSec, Timestamp stime, Integer state, String commentary) {
        super(ServiceCur.SERVICE_CUR);

        set(0, serviceId);
        set(1, name);
        set(2, timeoutSec);
        set(3, stime);
        set(4, state);
        set(5, commentary);
    }
}
