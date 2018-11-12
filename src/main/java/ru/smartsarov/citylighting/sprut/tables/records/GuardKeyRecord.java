/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.GuardKey;


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
public class GuardKeyRecord extends UpdatableRecordImpl<GuardKeyRecord> implements Record7<Integer, Integer, Integer, byte[], String, Integer, String> {

    private static final long serialVersionUID = -391240073;

    /**
     * Setter for <code>GUARD_KEY.GRDK_ID</code>.
     */
    public void setGrdkId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>GUARD_KEY.GRDK_ID</code>.
     */
    public Integer getGrdkId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>GUARD_KEY.GRDK_GRDG_ID</code>.
     */
    public void setGrdkGrdgId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>GUARD_KEY.GRDK_GRDG_ID</code>.
     */
    public Integer getGrdkGrdgId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>GUARD_KEY.GRDK_UNK_ID</code>.
     */
    public void setGrdkUnkId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>GUARD_KEY.GRDK_UNK_ID</code>.
     */
    public Integer getGrdkUnkId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>GUARD_KEY.GRDK_KEY</code>.
     */
    public void setGrdkKey(byte... value) {
        set(3, value);
    }

    /**
     * Getter for <code>GUARD_KEY.GRDK_KEY</code>.
     */
    public byte[] getGrdkKey() {
        return (byte[]) get(3);
    }

    /**
     * Setter for <code>GUARD_KEY.GRDK_NAME</code>.
     */
    public void setGrdkName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>GUARD_KEY.GRDK_NAME</code>.
     */
    public String getGrdkName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>GUARD_KEY.GRDK_ON</code>.
     */
    public void setGrdkOn(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>GUARD_KEY.GRDK_ON</code>.
     */
    public Integer getGrdkOn() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>GUARD_KEY.GRDK_REM</code>.
     */
    public void setGrdkRem(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>GUARD_KEY.GRDK_REM</code>.
     */
    public String getGrdkRem() {
        return (String) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, byte[], String, Integer, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, byte[], String, Integer, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return GuardKey.GUARD_KEY.GRDK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return GuardKey.GUARD_KEY.GRDK_GRDG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return GuardKey.GUARD_KEY.GRDK_UNK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field4() {
        return GuardKey.GUARD_KEY.GRDK_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return GuardKey.GUARD_KEY.GRDK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return GuardKey.GUARD_KEY.GRDK_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return GuardKey.GUARD_KEY.GRDK_REM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getGrdkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getGrdkGrdgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getGrdkUnkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component4() {
        return getGrdkKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getGrdkName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getGrdkOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getGrdkRem();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getGrdkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getGrdkGrdgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getGrdkUnkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value4() {
        return getGrdkKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getGrdkName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getGrdkOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getGrdkRem();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardKeyRecord value1(Integer value) {
        setGrdkId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardKeyRecord value2(Integer value) {
        setGrdkGrdgId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardKeyRecord value3(Integer value) {
        setGrdkUnkId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardKeyRecord value4(byte... value) {
        setGrdkKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardKeyRecord value5(String value) {
        setGrdkName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardKeyRecord value6(Integer value) {
        setGrdkOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardKeyRecord value7(String value) {
        setGrdkRem(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardKeyRecord values(Integer value1, Integer value2, Integer value3, byte[] value4, String value5, Integer value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GuardKeyRecord
     */
    public GuardKeyRecord() {
        super(GuardKey.GUARD_KEY);
    }

    /**
     * Create a detached, initialised GuardKeyRecord
     */
    public GuardKeyRecord(Integer grdkId, Integer grdkGrdgId, Integer grdkUnkId, byte[] grdkKey, String grdkName, Integer grdkOn, String grdkRem) {
        super(GuardKey.GUARD_KEY);

        set(0, grdkId);
        set(1, grdkGrdgId);
        set(2, grdkUnkId);
        set(3, grdkKey);
        set(4, grdkName);
        set(5, grdkOn);
        set(6, grdkRem);
    }
}