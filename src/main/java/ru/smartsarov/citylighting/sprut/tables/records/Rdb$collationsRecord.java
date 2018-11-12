/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.Rdb$collations;


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
public class Rdb$collationsRecord extends TableRecordImpl<Rdb$collationsRecord> implements Record9<String, Short, Short, Short, Short, String, String, String, String> {

    private static final long serialVersionUID = 218293140;

    /**
     * Setter for <code>RDB$COLLATIONS.RDB$COLLATION_NAME</code>.
     */
    public void setRdb$collationName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>RDB$COLLATIONS.RDB$COLLATION_NAME</code>.
     */
    public String getRdb$collationName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>RDB$COLLATIONS.RDB$COLLATION_ID</code>.
     */
    public void setRdb$collationId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>RDB$COLLATIONS.RDB$COLLATION_ID</code>.
     */
    public Short getRdb$collationId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>RDB$COLLATIONS.RDB$CHARACTER_SET_ID</code>.
     */
    public void setRdb$characterSetId(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>RDB$COLLATIONS.RDB$CHARACTER_SET_ID</code>.
     */
    public Short getRdb$characterSetId() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>RDB$COLLATIONS.RDB$COLLATION_ATTRIBUTES</code>.
     */
    public void setRdb$collationAttributes(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>RDB$COLLATIONS.RDB$COLLATION_ATTRIBUTES</code>.
     */
    public Short getRdb$collationAttributes() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>RDB$COLLATIONS.RDB$SYSTEM_FLAG</code>.
     */
    public void setRdb$systemFlag(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>RDB$COLLATIONS.RDB$SYSTEM_FLAG</code>.
     */
    public Short getRdb$systemFlag() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>RDB$COLLATIONS.RDB$DESCRIPTION</code>.
     */
    public void setRdb$description(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>RDB$COLLATIONS.RDB$DESCRIPTION</code>.
     */
    public String getRdb$description() {
        return (String) get(5);
    }

    /**
     * Setter for <code>RDB$COLLATIONS.RDB$FUNCTION_NAME</code>.
     */
    public void setRdb$functionName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>RDB$COLLATIONS.RDB$FUNCTION_NAME</code>.
     */
    public String getRdb$functionName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>RDB$COLLATIONS.RDB$BASE_COLLATION_NAME</code>.
     */
    public void setRdb$baseCollationName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>RDB$COLLATIONS.RDB$BASE_COLLATION_NAME</code>.
     */
    public String getRdb$baseCollationName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>RDB$COLLATIONS.RDB$SPECIFIC_ATTRIBUTES</code>.
     */
    public void setRdb$specificAttributes(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>RDB$COLLATIONS.RDB$SPECIFIC_ATTRIBUTES</code>.
     */
    public String getRdb$specificAttributes() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, Short, Short, Short, Short, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, Short, Short, Short, Short, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Rdb$collations.RDB$COLLATIONS.RDB$COLLATION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return Rdb$collations.RDB$COLLATIONS.RDB$COLLATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return Rdb$collations.RDB$COLLATIONS.RDB$CHARACTER_SET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return Rdb$collations.RDB$COLLATIONS.RDB$COLLATION_ATTRIBUTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return Rdb$collations.RDB$COLLATIONS.RDB$SYSTEM_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Rdb$collations.RDB$COLLATIONS.RDB$DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Rdb$collations.RDB$COLLATIONS.RDB$FUNCTION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Rdb$collations.RDB$COLLATIONS.RDB$BASE_COLLATION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Rdb$collations.RDB$COLLATIONS.RDB$SPECIFIC_ATTRIBUTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getRdb$collationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component2() {
        return getRdb$collationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getRdb$characterSetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getRdb$collationAttributes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getRdb$systemFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getRdb$description();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getRdb$functionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getRdb$baseCollationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getRdb$specificAttributes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getRdb$collationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getRdb$collationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getRdb$characterSetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getRdb$collationAttributes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getRdb$systemFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRdb$description();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getRdb$functionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRdb$baseCollationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getRdb$specificAttributes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$collationsRecord value1(String value) {
        setRdb$collationName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$collationsRecord value2(Short value) {
        setRdb$collationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$collationsRecord value3(Short value) {
        setRdb$characterSetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$collationsRecord value4(Short value) {
        setRdb$collationAttributes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$collationsRecord value5(Short value) {
        setRdb$systemFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$collationsRecord value6(String value) {
        setRdb$description(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$collationsRecord value7(String value) {
        setRdb$functionName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$collationsRecord value8(String value) {
        setRdb$baseCollationName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$collationsRecord value9(String value) {
        setRdb$specificAttributes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$collationsRecord values(String value1, Short value2, Short value3, Short value4, Short value5, String value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Rdb$collationsRecord
     */
    public Rdb$collationsRecord() {
        super(Rdb$collations.RDB$COLLATIONS);
    }

    /**
     * Create a detached, initialised Rdb$collationsRecord
     */
    public Rdb$collationsRecord(String rdb$collationName, Short rdb$collationId, Short rdb$characterSetId, Short rdb$collationAttributes, Short rdb$systemFlag, String rdb$description, String rdb$functionName, String rdb$baseCollationName, String rdb$specificAttributes) {
        super(Rdb$collations.RDB$COLLATIONS);

        set(0, rdb$collationName);
        set(1, rdb$collationId);
        set(2, rdb$characterSetId);
        set(3, rdb$collationAttributes);
        set(4, rdb$systemFlag);
        set(5, rdb$description);
        set(6, rdb$functionName);
        set(7, rdb$baseCollationName);
        set(8, rdb$specificAttributes);
    }
}
