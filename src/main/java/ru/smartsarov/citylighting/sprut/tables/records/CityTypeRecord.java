/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.CityType;


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
public class CityTypeRecord extends UpdatableRecordImpl<CityTypeRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = -824029808;

    /**
     * Setter for <code>CITY_TYPE.CITYT_ID</code>.
     */
    public void setCitytId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>CITY_TYPE.CITYT_ID</code>.
     */
    public Integer getCitytId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>CITY_TYPE.CITYT_NAME</code>.
     */
    public void setCitytName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>CITY_TYPE.CITYT_NAME</code>.
     */
    public String getCitytName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>CITY_TYPE.CITYT_SNAME</code>.
     */
    public void setCitytSname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>CITY_TYPE.CITYT_SNAME</code>.
     */
    public String getCitytSname() {
        return (String) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CityType.CITY_TYPE.CITYT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CityType.CITY_TYPE.CITYT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CityType.CITY_TYPE.CITYT_SNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCitytId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCitytName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCitytSname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCitytId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCitytName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCitytSname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CityTypeRecord value1(Integer value) {
        setCitytId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CityTypeRecord value2(String value) {
        setCitytName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CityTypeRecord value3(String value) {
        setCitytSname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CityTypeRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CityTypeRecord
     */
    public CityTypeRecord() {
        super(CityType.CITY_TYPE);
    }

    /**
     * Create a detached, initialised CityTypeRecord
     */
    public CityTypeRecord(Integer citytId, String citytName, String citytSname) {
        super(CityType.CITY_TYPE);

        set(0, citytId);
        set(1, citytName);
        set(2, citytSname);
    }
}
