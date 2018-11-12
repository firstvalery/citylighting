/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.Rdb$fieldDimensions;


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
public class Rdb$fieldDimensionsRecord extends TableRecordImpl<Rdb$fieldDimensionsRecord> implements Record4<String, Short, Integer, Integer> {

    private static final long serialVersionUID = 442094820;

    /**
     * Setter for <code>RDB$FIELD_DIMENSIONS.RDB$FIELD_NAME</code>.
     */
    public void setRdb$fieldName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>RDB$FIELD_DIMENSIONS.RDB$FIELD_NAME</code>.
     */
    public String getRdb$fieldName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>RDB$FIELD_DIMENSIONS.RDB$DIMENSION</code>.
     */
    public void setRdb$dimension(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>RDB$FIELD_DIMENSIONS.RDB$DIMENSION</code>.
     */
    public Short getRdb$dimension() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>RDB$FIELD_DIMENSIONS.RDB$LOWER_BOUND</code>.
     */
    public void setRdb$lowerBound(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>RDB$FIELD_DIMENSIONS.RDB$LOWER_BOUND</code>.
     */
    public Integer getRdb$lowerBound() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>RDB$FIELD_DIMENSIONS.RDB$UPPER_BOUND</code>.
     */
    public void setRdb$upperBound(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>RDB$FIELD_DIMENSIONS.RDB$UPPER_BOUND</code>.
     */
    public Integer getRdb$upperBound() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, Short, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, Short, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Rdb$fieldDimensions.RDB$FIELD_DIMENSIONS.RDB$FIELD_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return Rdb$fieldDimensions.RDB$FIELD_DIMENSIONS.RDB$DIMENSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Rdb$fieldDimensions.RDB$FIELD_DIMENSIONS.RDB$LOWER_BOUND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Rdb$fieldDimensions.RDB$FIELD_DIMENSIONS.RDB$UPPER_BOUND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getRdb$fieldName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component2() {
        return getRdb$dimension();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getRdb$lowerBound();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getRdb$upperBound();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getRdb$fieldName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getRdb$dimension();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getRdb$lowerBound();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getRdb$upperBound();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$fieldDimensionsRecord value1(String value) {
        setRdb$fieldName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$fieldDimensionsRecord value2(Short value) {
        setRdb$dimension(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$fieldDimensionsRecord value3(Integer value) {
        setRdb$lowerBound(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$fieldDimensionsRecord value4(Integer value) {
        setRdb$upperBound(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$fieldDimensionsRecord values(String value1, Short value2, Integer value3, Integer value4) {
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
     * Create a detached Rdb$fieldDimensionsRecord
     */
    public Rdb$fieldDimensionsRecord() {
        super(Rdb$fieldDimensions.RDB$FIELD_DIMENSIONS);
    }

    /**
     * Create a detached, initialised Rdb$fieldDimensionsRecord
     */
    public Rdb$fieldDimensionsRecord(String rdb$fieldName, Short rdb$dimension, Integer rdb$lowerBound, Integer rdb$upperBound) {
        super(Rdb$fieldDimensions.RDB$FIELD_DIMENSIONS);

        set(0, rdb$fieldName);
        set(1, rdb$dimension);
        set(2, rdb$lowerBound);
        set(3, rdb$upperBound);
    }
}
