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

import ru.smartsarov.citylighting.sprut.tables.City;


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
public class CityRecord extends UpdatableRecordImpl<CityRecord> implements Record4<Integer, Integer, String, Integer> {

    private static final long serialVersionUID = 1389003613;

    /**
     * Setter for <code>CITY.CITY_ID</code>.
     */
    public void setCityId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>CITY.CITY_ID</code>.
     */
    public Integer getCityId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>CITY.CITY_RGN_ID</code>.
     */
    public void setCityRgnId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>CITY.CITY_RGN_ID</code>.
     */
    public Integer getCityRgnId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>CITY.CITY_NAME</code>.
     */
    public void setCityName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>CITY.CITY_NAME</code>.
     */
    public String getCityName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>CITY.CITY_TYPE</code>.
     */
    public void setCityType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>CITY.CITY_TYPE</code>.
     */
    public Integer getCityType() {
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
    public Row4<Integer, Integer, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return City.CITY.CITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return City.CITY.CITY_RGN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return City.CITY.CITY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return City.CITY.CITY_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCityRgnId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCityName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getCityType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCityRgnId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCityName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getCityType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CityRecord value1(Integer value) {
        setCityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CityRecord value2(Integer value) {
        setCityRgnId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CityRecord value3(String value) {
        setCityName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CityRecord value4(Integer value) {
        setCityType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CityRecord values(Integer value1, Integer value2, String value3, Integer value4) {
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
     * Create a detached CityRecord
     */
    public CityRecord() {
        super(City.CITY);
    }

    /**
     * Create a detached, initialised CityRecord
     */
    public CityRecord(Integer cityId, Integer cityRgnId, String cityName, Integer cityType) {
        super(City.CITY);

        set(0, cityId);
        set(1, cityRgnId);
        set(2, cityName);
        set(3, cityType);
    }
}
