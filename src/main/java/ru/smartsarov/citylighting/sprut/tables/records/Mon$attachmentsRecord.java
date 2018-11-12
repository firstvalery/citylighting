/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.Mon$attachments;


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
public class Mon$attachmentsRecord extends TableRecordImpl<Mon$attachmentsRecord> implements Record14<Integer, Integer, Short, String, String, String, String, String, Integer, Short, Timestamp, Short, String, Integer> {

    private static final long serialVersionUID = 544405059;

    /**
     * Setter for <code>MON$ATTACHMENTS.MON$ATTACHMENT_ID</code>.
     */
    public void setMon$attachmentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>MON$ATTACHMENTS.MON$ATTACHMENT_ID</code>.
     */
    public Integer getMon$attachmentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>MON$ATTACHMENTS.MON$SERVER_PID</code>.
     */
    public void setMon$serverPid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>MON$ATTACHMENTS.MON$SERVER_PID</code>.
     */
    public Integer getMon$serverPid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>MON$ATTACHMENTS.MON$STATE</code>.
     */
    public void setMon$state(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>MON$ATTACHMENTS.MON$STATE</code>.
     */
    public Short getMon$state() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>MON$ATTACHMENTS.MON$ATTACHMENT_NAME</code>.
     */
    public void setMon$attachmentName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>MON$ATTACHMENTS.MON$ATTACHMENT_NAME</code>.
     */
    public String getMon$attachmentName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>MON$ATTACHMENTS.MON$USER</code>.
     */
    public void setMon$user(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>MON$ATTACHMENTS.MON$USER</code>.
     */
    public String getMon$user() {
        return (String) get(4);
    }

    /**
     * Setter for <code>MON$ATTACHMENTS.MON$ROLE</code>.
     */
    public void setMon$role(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>MON$ATTACHMENTS.MON$ROLE</code>.
     */
    public String getMon$role() {
        return (String) get(5);
    }

    /**
     * Setter for <code>MON$ATTACHMENTS.MON$REMOTE_PROTOCOL</code>.
     */
    public void setMon$remoteProtocol(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>MON$ATTACHMENTS.MON$REMOTE_PROTOCOL</code>.
     */
    public String getMon$remoteProtocol() {
        return (String) get(6);
    }

    /**
     * Setter for <code>MON$ATTACHMENTS.MON$REMOTE_ADDRESS</code>.
     */
    public void setMon$remoteAddress(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>MON$ATTACHMENTS.MON$REMOTE_ADDRESS</code>.
     */
    public String getMon$remoteAddress() {
        return (String) get(7);
    }

    /**
     * Setter for <code>MON$ATTACHMENTS.MON$REMOTE_PID</code>.
     */
    public void setMon$remotePid(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>MON$ATTACHMENTS.MON$REMOTE_PID</code>.
     */
    public Integer getMon$remotePid() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>MON$ATTACHMENTS.MON$CHARACTER_SET_ID</code>.
     */
    public void setMon$characterSetId(Short value) {
        set(9, value);
    }

    /**
     * Getter for <code>MON$ATTACHMENTS.MON$CHARACTER_SET_ID</code>.
     */
    public Short getMon$characterSetId() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>MON$ATTACHMENTS.MON$TIMESTAMP</code>.
     */
    public void setMon$timestamp(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>MON$ATTACHMENTS.MON$TIMESTAMP</code>.
     */
    public Timestamp getMon$timestamp() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>MON$ATTACHMENTS.MON$GARBAGE_COLLECTION</code>.
     */
    public void setMon$garbageCollection(Short value) {
        set(11, value);
    }

    /**
     * Getter for <code>MON$ATTACHMENTS.MON$GARBAGE_COLLECTION</code>.
     */
    public Short getMon$garbageCollection() {
        return (Short) get(11);
    }

    /**
     * Setter for <code>MON$ATTACHMENTS.MON$REMOTE_PROCESS</code>.
     */
    public void setMon$remoteProcess(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>MON$ATTACHMENTS.MON$REMOTE_PROCESS</code>.
     */
    public String getMon$remoteProcess() {
        return (String) get(12);
    }

    /**
     * Setter for <code>MON$ATTACHMENTS.MON$STAT_ID</code>.
     */
    public void setMon$statId(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>MON$ATTACHMENTS.MON$STAT_ID</code>.
     */
    public Integer getMon$statId() {
        return (Integer) get(13);
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Integer, Short, String, String, String, String, String, Integer, Short, Timestamp, Short, String, Integer> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Integer, Short, String, String, String, String, String, Integer, Short, Timestamp, Short, String, Integer> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Mon$attachments.MON$ATTACHMENTS.MON$ATTACHMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Mon$attachments.MON$ATTACHMENTS.MON$SERVER_PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return Mon$attachments.MON$ATTACHMENTS.MON$STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Mon$attachments.MON$ATTACHMENTS.MON$ATTACHMENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Mon$attachments.MON$ATTACHMENTS.MON$USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Mon$attachments.MON$ATTACHMENTS.MON$ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Mon$attachments.MON$ATTACHMENTS.MON$REMOTE_PROTOCOL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Mon$attachments.MON$ATTACHMENTS.MON$REMOTE_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Mon$attachments.MON$ATTACHMENTS.MON$REMOTE_PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field10() {
        return Mon$attachments.MON$ATTACHMENTS.MON$CHARACTER_SET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Mon$attachments.MON$ATTACHMENTS.MON$TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field12() {
        return Mon$attachments.MON$ATTACHMENTS.MON$GARBAGE_COLLECTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Mon$attachments.MON$ATTACHMENTS.MON$REMOTE_PROCESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return Mon$attachments.MON$ATTACHMENTS.MON$STAT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getMon$attachmentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getMon$serverPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getMon$state();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getMon$attachmentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getMon$user();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getMon$role();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getMon$remoteProtocol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getMon$remoteAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getMon$remotePid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component10() {
        return getMon$characterSetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getMon$timestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component12() {
        return getMon$garbageCollection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getMon$remoteProcess();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getMon$statId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getMon$attachmentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getMon$serverPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getMon$state();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMon$attachmentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMon$user();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getMon$role();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMon$remoteProtocol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getMon$remoteAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getMon$remotePid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value10() {
        return getMon$characterSetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getMon$timestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value12() {
        return getMon$garbageCollection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getMon$remoteProcess();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getMon$statId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$attachmentsRecord value1(Integer value) {
        setMon$attachmentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$attachmentsRecord value2(Integer value) {
        setMon$serverPid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$attachmentsRecord value3(Short value) {
        setMon$state(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$attachmentsRecord value4(String value) {
        setMon$attachmentName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$attachmentsRecord value5(String value) {
        setMon$user(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$attachmentsRecord value6(String value) {
        setMon$role(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$attachmentsRecord value7(String value) {
        setMon$remoteProtocol(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$attachmentsRecord value8(String value) {
        setMon$remoteAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$attachmentsRecord value9(Integer value) {
        setMon$remotePid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$attachmentsRecord value10(Short value) {
        setMon$characterSetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$attachmentsRecord value11(Timestamp value) {
        setMon$timestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$attachmentsRecord value12(Short value) {
        setMon$garbageCollection(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$attachmentsRecord value13(String value) {
        setMon$remoteProcess(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$attachmentsRecord value14(Integer value) {
        setMon$statId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$attachmentsRecord values(Integer value1, Integer value2, Short value3, String value4, String value5, String value6, String value7, String value8, Integer value9, Short value10, Timestamp value11, Short value12, String value13, Integer value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Mon$attachmentsRecord
     */
    public Mon$attachmentsRecord() {
        super(Mon$attachments.MON$ATTACHMENTS);
    }

    /**
     * Create a detached, initialised Mon$attachmentsRecord
     */
    public Mon$attachmentsRecord(Integer mon$attachmentId, Integer mon$serverPid, Short mon$state, String mon$attachmentName, String mon$user, String mon$role, String mon$remoteProtocol, String mon$remoteAddress, Integer mon$remotePid, Short mon$characterSetId, Timestamp mon$timestamp, Short mon$garbageCollection, String mon$remoteProcess, Integer mon$statId) {
        super(Mon$attachments.MON$ATTACHMENTS);

        set(0, mon$attachmentId);
        set(1, mon$serverPid);
        set(2, mon$state);
        set(3, mon$attachmentName);
        set(4, mon$user);
        set(5, mon$role);
        set(6, mon$remoteProtocol);
        set(7, mon$remoteAddress);
        set(8, mon$remotePid);
        set(9, mon$characterSetId);
        set(10, mon$timestamp);
        set(11, mon$garbageCollection);
        set(12, mon$remoteProcess);
        set(13, mon$statId);
    }
}