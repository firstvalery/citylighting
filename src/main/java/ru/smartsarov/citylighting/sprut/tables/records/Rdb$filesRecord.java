/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.Rdb$files;


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
public class Rdb$filesRecord extends TableRecordImpl<Rdb$filesRecord> implements Record6<String, Short, Integer, Integer, Short, Short> {

    private static final long serialVersionUID = 1684817301;

    /**
     * Setter for <code>RDB$FILES.RDB$FILE_NAME</code>.
     */
    public void setRdb$fileName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>RDB$FILES.RDB$FILE_NAME</code>.
     */
    public String getRdb$fileName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>RDB$FILES.RDB$FILE_SEQUENCE</code>.
     */
    public void setRdb$fileSequence(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>RDB$FILES.RDB$FILE_SEQUENCE</code>.
     */
    public Short getRdb$fileSequence() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>RDB$FILES.RDB$FILE_START</code>.
     */
    public void setRdb$fileStart(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>RDB$FILES.RDB$FILE_START</code>.
     */
    public Integer getRdb$fileStart() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>RDB$FILES.RDB$FILE_LENGTH</code>.
     */
    public void setRdb$fileLength(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>RDB$FILES.RDB$FILE_LENGTH</code>.
     */
    public Integer getRdb$fileLength() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>RDB$FILES.RDB$FILE_FLAGS</code>.
     */
    public void setRdb$fileFlags(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>RDB$FILES.RDB$FILE_FLAGS</code>.
     */
    public Short getRdb$fileFlags() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>RDB$FILES.RDB$SHADOW_NUMBER</code>.
     */
    public void setRdb$shadowNumber(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>RDB$FILES.RDB$SHADOW_NUMBER</code>.
     */
    public Short getRdb$shadowNumber() {
        return (Short) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, Short, Integer, Integer, Short, Short> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, Short, Integer, Integer, Short, Short> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Rdb$files.RDB$FILES.RDB$FILE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return Rdb$files.RDB$FILES.RDB$FILE_SEQUENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Rdb$files.RDB$FILES.RDB$FILE_START;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Rdb$files.RDB$FILES.RDB$FILE_LENGTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return Rdb$files.RDB$FILES.RDB$FILE_FLAGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return Rdb$files.RDB$FILES.RDB$SHADOW_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getRdb$fileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component2() {
        return getRdb$fileSequence();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getRdb$fileStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getRdb$fileLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getRdb$fileFlags();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getRdb$shadowNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getRdb$fileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getRdb$fileSequence();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getRdb$fileStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getRdb$fileLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getRdb$fileFlags();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getRdb$shadowNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$filesRecord value1(String value) {
        setRdb$fileName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$filesRecord value2(Short value) {
        setRdb$fileSequence(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$filesRecord value3(Integer value) {
        setRdb$fileStart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$filesRecord value4(Integer value) {
        setRdb$fileLength(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$filesRecord value5(Short value) {
        setRdb$fileFlags(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$filesRecord value6(Short value) {
        setRdb$shadowNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$filesRecord values(String value1, Short value2, Integer value3, Integer value4, Short value5, Short value6) {
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
     * Create a detached Rdb$filesRecord
     */
    public Rdb$filesRecord() {
        super(Rdb$files.RDB$FILES);
    }

    /**
     * Create a detached, initialised Rdb$filesRecord
     */
    public Rdb$filesRecord(String rdb$fileName, Short rdb$fileSequence, Integer rdb$fileStart, Integer rdb$fileLength, Short rdb$fileFlags, Short rdb$shadowNumber) {
        super(Rdb$files.RDB$FILES);

        set(0, rdb$fileName);
        set(1, rdb$fileSequence);
        set(2, rdb$fileStart);
        set(3, rdb$fileLength);
        set(4, rdb$fileFlags);
        set(5, rdb$shadowNumber);
    }
}
