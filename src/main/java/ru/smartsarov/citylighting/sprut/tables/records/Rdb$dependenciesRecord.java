/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.Rdb$dependencies;


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
public class Rdb$dependenciesRecord extends TableRecordImpl<Rdb$dependenciesRecord> implements Record5<String, String, String, Short, Short> {

    private static final long serialVersionUID = 1287808380;

    /**
     * Setter for <code>RDB$DEPENDENCIES.RDB$DEPENDENT_NAME</code>.
     */
    public void setRdb$dependentName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>RDB$DEPENDENCIES.RDB$DEPENDENT_NAME</code>.
     */
    public String getRdb$dependentName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>RDB$DEPENDENCIES.RDB$DEPENDED_ON_NAME</code>.
     */
    public void setRdb$dependedOnName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>RDB$DEPENDENCIES.RDB$DEPENDED_ON_NAME</code>.
     */
    public String getRdb$dependedOnName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>RDB$DEPENDENCIES.RDB$FIELD_NAME</code>.
     */
    public void setRdb$fieldName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>RDB$DEPENDENCIES.RDB$FIELD_NAME</code>.
     */
    public String getRdb$fieldName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>RDB$DEPENDENCIES.RDB$DEPENDENT_TYPE</code>.
     */
    public void setRdb$dependentType(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>RDB$DEPENDENCIES.RDB$DEPENDENT_TYPE</code>.
     */
    public Short getRdb$dependentType() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>RDB$DEPENDENCIES.RDB$DEPENDED_ON_TYPE</code>.
     */
    public void setRdb$dependedOnType(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>RDB$DEPENDENCIES.RDB$DEPENDED_ON_TYPE</code>.
     */
    public Short getRdb$dependedOnType() {
        return (Short) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, Short, Short> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, Short, Short> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Rdb$dependencies.RDB$DEPENDENCIES.RDB$DEPENDENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Rdb$dependencies.RDB$DEPENDENCIES.RDB$DEPENDED_ON_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Rdb$dependencies.RDB$DEPENDENCIES.RDB$FIELD_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return Rdb$dependencies.RDB$DEPENDENCIES.RDB$DEPENDENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return Rdb$dependencies.RDB$DEPENDENCIES.RDB$DEPENDED_ON_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getRdb$dependentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getRdb$dependedOnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getRdb$fieldName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getRdb$dependentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getRdb$dependedOnType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getRdb$dependentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRdb$dependedOnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRdb$fieldName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getRdb$dependentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getRdb$dependedOnType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$dependenciesRecord value1(String value) {
        setRdb$dependentName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$dependenciesRecord value2(String value) {
        setRdb$dependedOnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$dependenciesRecord value3(String value) {
        setRdb$fieldName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$dependenciesRecord value4(Short value) {
        setRdb$dependentType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$dependenciesRecord value5(Short value) {
        setRdb$dependedOnType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$dependenciesRecord values(String value1, String value2, String value3, Short value4, Short value5) {
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
     * Create a detached Rdb$dependenciesRecord
     */
    public Rdb$dependenciesRecord() {
        super(Rdb$dependencies.RDB$DEPENDENCIES);
    }

    /**
     * Create a detached, initialised Rdb$dependenciesRecord
     */
    public Rdb$dependenciesRecord(String rdb$dependentName, String rdb$dependedOnName, String rdb$fieldName, Short rdb$dependentType, Short rdb$dependedOnType) {
        super(Rdb$dependencies.RDB$DEPENDENCIES);

        set(0, rdb$dependentName);
        set(1, rdb$dependedOnName);
        set(2, rdb$fieldName);
        set(3, rdb$dependentType);
        set(4, rdb$dependedOnType);
    }
}
