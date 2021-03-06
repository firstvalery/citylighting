/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.Rdb$logFiles;


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
public class Rdb$logFilesRecord extends TableRecordImpl<Rdb$logFilesRecord> implements Record6<String, Short, Integer, Short, Integer, Short> {

    private static final long serialVersionUID = -1226608506;

    /**
     * Setter for <code>RDB$LOG_FILES.RDB$FILE_NAME</code>.
     */
    public void setRdb$fileName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>RDB$LOG_FILES.RDB$FILE_NAME</code>.
     */
    public String getRdb$fileName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>RDB$LOG_FILES.RDB$FILE_SEQUENCE</code>.
     */
    public void setRdb$fileSequence(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>RDB$LOG_FILES.RDB$FILE_SEQUENCE</code>.
     */
    public Short getRdb$fileSequence() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>RDB$LOG_FILES.RDB$FILE_LENGTH</code>.
     */
    public void setRdb$fileLength(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>RDB$LOG_FILES.RDB$FILE_LENGTH</code>.
     */
    public Integer getRdb$fileLength() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>RDB$LOG_FILES.RDB$FILE_PARTITIONS</code>.
     */
    public void setRdb$filePartitions(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>RDB$LOG_FILES.RDB$FILE_PARTITIONS</code>.
     */
    public Short getRdb$filePartitions() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>RDB$LOG_FILES.RDB$FILE_P_OFFSET</code>.
     */
    public void setRdb$filePOffset(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>RDB$LOG_FILES.RDB$FILE_P_OFFSET</code>.
     */
    public Integer getRdb$filePOffset() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>RDB$LOG_FILES.RDB$FILE_FLAGS</code>.
     */
    public void setRdb$fileFlags(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>RDB$LOG_FILES.RDB$FILE_FLAGS</code>.
     */
    public Short getRdb$fileFlags() {
        return (Short) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, Short, Integer, Short, Integer, Short> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, Short, Integer, Short, Integer, Short> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Rdb$logFiles.RDB$LOG_FILES.RDB$FILE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return Rdb$logFiles.RDB$LOG_FILES.RDB$FILE_SEQUENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Rdb$logFiles.RDB$LOG_FILES.RDB$FILE_LENGTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return Rdb$logFiles.RDB$LOG_FILES.RDB$FILE_PARTITIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Rdb$logFiles.RDB$LOG_FILES.RDB$FILE_P_OFFSET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return Rdb$logFiles.RDB$LOG_FILES.RDB$FILE_FLAGS;
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
        return getRdb$fileLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getRdb$filePartitions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getRdb$filePOffset();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getRdb$fileFlags();
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
        return getRdb$fileLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getRdb$filePartitions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getRdb$filePOffset();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getRdb$fileFlags();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$logFilesRecord value1(String value) {
        setRdb$fileName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$logFilesRecord value2(Short value) {
        setRdb$fileSequence(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$logFilesRecord value3(Integer value) {
        setRdb$fileLength(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$logFilesRecord value4(Short value) {
        setRdb$filePartitions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$logFilesRecord value5(Integer value) {
        setRdb$filePOffset(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$logFilesRecord value6(Short value) {
        setRdb$fileFlags(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$logFilesRecord values(String value1, Short value2, Integer value3, Short value4, Integer value5, Short value6) {
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
     * Create a detached Rdb$logFilesRecord
     */
    public Rdb$logFilesRecord() {
        super(Rdb$logFiles.RDB$LOG_FILES);
    }

    /**
     * Create a detached, initialised Rdb$logFilesRecord
     */
    public Rdb$logFilesRecord(String rdb$fileName, Short rdb$fileSequence, Integer rdb$fileLength, Short rdb$filePartitions, Integer rdb$filePOffset, Short rdb$fileFlags) {
        super(Rdb$logFiles.RDB$LOG_FILES);

        set(0, rdb$fileName);
        set(1, rdb$fileSequence);
        set(2, rdb$fileLength);
        set(3, rdb$filePartitions);
        set(4, rdb$filePOffset);
        set(5, rdb$fileFlags);
    }
}
