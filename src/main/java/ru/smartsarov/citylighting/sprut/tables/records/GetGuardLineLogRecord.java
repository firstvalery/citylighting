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

import ru.smartsarov.citylighting.sprut.tables.GetGuardLineLog;


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
public class GetGuardLineLogRecord extends TableRecordImpl<GetGuardLineLogRecord> implements Record14<Integer, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Short, Integer> {

    private static final long serialVersionUID = 1793090436;

    /**
     * Setter for <code>GET_GUARD_LINE_LOG.GRDLG_LID</code>.
     */
    public void setGrdlgLid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>GET_GUARD_LINE_LOG.GRDLG_LID</code>.
     */
    public Integer getGrdlgLid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>GET_GUARD_LINE_LOG.GRDLG_ZNAME</code>.
     */
    public void setGrdlgZname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>GET_GUARD_LINE_LOG.GRDLG_ZNAME</code>.
     */
    public String getGrdlgZname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>GET_GUARD_LINE_LOG.GRDLG_ZADR</code>.
     */
    public void setGrdlgZadr(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>GET_GUARD_LINE_LOG.GRDLG_ZADR</code>.
     */
    public String getGrdlgZadr() {
        return (String) get(2);
    }

    /**
     * Setter for <code>GET_GUARD_LINE_LOG.GRDLG_USKIP</code>.
     */
    public void setGrdlgUskip(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>GET_GUARD_LINE_LOG.GRDLG_USKIP</code>.
     */
    public String getGrdlgUskip() {
        return (String) get(3);
    }

    /**
     * Setter for <code>GET_GUARD_LINE_LOG.GRDLG_EVENT</code>.
     */
    public void setGrdlgEvent(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>GET_GUARD_LINE_LOG.GRDLG_EVENT</code>.
     */
    public String getGrdlgEvent() {
        return (String) get(4);
    }

    /**
     * Setter for <code>GET_GUARD_LINE_LOG.GRDLG_SSOSTNAME</code>.
     */
    public void setGrdlgSsostname(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>GET_GUARD_LINE_LOG.GRDLG_SSOSTNAME</code>.
     */
    public String getGrdlgSsostname() {
        return (String) get(5);
    }

    /**
     * Setter for <code>GET_GUARD_LINE_LOG.GRDLG_SSOSTSNAME</code>.
     */
    public void setGrdlgSsostsname(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>GET_GUARD_LINE_LOG.GRDLG_SSOSTSNAME</code>.
     */
    public String getGrdlgSsostsname() {
        return (String) get(6);
    }

    /**
     * Setter for <code>GET_GUARD_LINE_LOG.GRDLG_LSOST</code>.
     */
    public void setGrdlgLsost(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>GET_GUARD_LINE_LOG.GRDLG_LSOST</code>.
     */
    public String getGrdlgLsost() {
        return (String) get(7);
    }

    /**
     * Setter for <code>GET_GUARD_LINE_LOG.GRDLG_PERSON</code>.
     */
    public void setGrdlgPerson(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>GET_GUARD_LINE_LOG.GRDLG_PERSON</code>.
     */
    public String getGrdlgPerson() {
        return (String) get(8);
    }

    /**
     * Setter for <code>GET_GUARD_LINE_LOG.GRDLG_BUTTON</code>.
     */
    public void setGrdlgButton(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>GET_GUARD_LINE_LOG.GRDLG_BUTTON</code>.
     */
    public String getGrdlgButton() {
        return (String) get(9);
    }

    /**
     * Setter for <code>GET_GUARD_LINE_LOG.GRDLG_DATETIME</code>.
     */
    public void setGrdlgDatetime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>GET_GUARD_LINE_LOG.GRDLG_DATETIME</code>.
     */
    public Timestamp getGrdlgDatetime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>GET_GUARD_LINE_LOG.GRDLG_SDATETIME</code>.
     */
    public void setGrdlgSdatetime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>GET_GUARD_LINE_LOG.GRDLG_SDATETIME</code>.
     */
    public Timestamp getGrdlgSdatetime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>GET_GUARD_LINE_LOG.GRDLG_DELAY</code>.
     */
    public void setGrdlgDelay(Short value) {
        set(12, value);
    }

    /**
     * Getter for <code>GET_GUARD_LINE_LOG.GRDLG_DELAY</code>.
     */
    public Short getGrdlgDelay() {
        return (Short) get(12);
    }

    /**
     * Setter for <code>GET_GUARD_LINE_LOG.GRDLG_EID</code>.
     */
    public void setGrdlgEid(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>GET_GUARD_LINE_LOG.GRDLG_EID</code>.
     */
    public Integer getGrdlgEid() {
        return (Integer) get(13);
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Short, Integer> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp, Short, Integer> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return GetGuardLineLog.GET_GUARD_LINE_LOG.GRDLG_LID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GetGuardLineLog.GET_GUARD_LINE_LOG.GRDLG_ZNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GetGuardLineLog.GET_GUARD_LINE_LOG.GRDLG_ZADR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return GetGuardLineLog.GET_GUARD_LINE_LOG.GRDLG_USKIP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return GetGuardLineLog.GET_GUARD_LINE_LOG.GRDLG_EVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return GetGuardLineLog.GET_GUARD_LINE_LOG.GRDLG_SSOSTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return GetGuardLineLog.GET_GUARD_LINE_LOG.GRDLG_SSOSTSNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return GetGuardLineLog.GET_GUARD_LINE_LOG.GRDLG_LSOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return GetGuardLineLog.GET_GUARD_LINE_LOG.GRDLG_PERSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return GetGuardLineLog.GET_GUARD_LINE_LOG.GRDLG_BUTTON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return GetGuardLineLog.GET_GUARD_LINE_LOG.GRDLG_DATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return GetGuardLineLog.GET_GUARD_LINE_LOG.GRDLG_SDATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field13() {
        return GetGuardLineLog.GET_GUARD_LINE_LOG.GRDLG_DELAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return GetGuardLineLog.GET_GUARD_LINE_LOG.GRDLG_EID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getGrdlgLid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getGrdlgZname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getGrdlgZadr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getGrdlgUskip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getGrdlgEvent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getGrdlgSsostname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getGrdlgSsostsname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getGrdlgLsost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getGrdlgPerson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getGrdlgButton();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getGrdlgDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getGrdlgSdatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component13() {
        return getGrdlgDelay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getGrdlgEid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getGrdlgLid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGrdlgZname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGrdlgZadr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getGrdlgUskip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getGrdlgEvent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getGrdlgSsostname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getGrdlgSsostsname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getGrdlgLsost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getGrdlgPerson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getGrdlgButton();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getGrdlgDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getGrdlgSdatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value13() {
        return getGrdlgDelay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getGrdlgEid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetGuardLineLogRecord value1(Integer value) {
        setGrdlgLid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetGuardLineLogRecord value2(String value) {
        setGrdlgZname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetGuardLineLogRecord value3(String value) {
        setGrdlgZadr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetGuardLineLogRecord value4(String value) {
        setGrdlgUskip(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetGuardLineLogRecord value5(String value) {
        setGrdlgEvent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetGuardLineLogRecord value6(String value) {
        setGrdlgSsostname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetGuardLineLogRecord value7(String value) {
        setGrdlgSsostsname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetGuardLineLogRecord value8(String value) {
        setGrdlgLsost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetGuardLineLogRecord value9(String value) {
        setGrdlgPerson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetGuardLineLogRecord value10(String value) {
        setGrdlgButton(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetGuardLineLogRecord value11(Timestamp value) {
        setGrdlgDatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetGuardLineLogRecord value12(Timestamp value) {
        setGrdlgSdatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetGuardLineLogRecord value13(Short value) {
        setGrdlgDelay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetGuardLineLogRecord value14(Integer value) {
        setGrdlgEid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetGuardLineLogRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, Timestamp value11, Timestamp value12, Short value13, Integer value14) {
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
     * Create a detached GetGuardLineLogRecord
     */
    public GetGuardLineLogRecord() {
        super(GetGuardLineLog.GET_GUARD_LINE_LOG);
    }

    /**
     * Create a detached, initialised GetGuardLineLogRecord
     */
    public GetGuardLineLogRecord(Integer grdlgLid, String grdlgZname, String grdlgZadr, String grdlgUskip, String grdlgEvent, String grdlgSsostname, String grdlgSsostsname, String grdlgLsost, String grdlgPerson, String grdlgButton, Timestamp grdlgDatetime, Timestamp grdlgSdatetime, Short grdlgDelay, Integer grdlgEid) {
        super(GetGuardLineLog.GET_GUARD_LINE_LOG);

        set(0, grdlgLid);
        set(1, grdlgZname);
        set(2, grdlgZadr);
        set(3, grdlgUskip);
        set(4, grdlgEvent);
        set(5, grdlgSsostname);
        set(6, grdlgSsostsname);
        set(7, grdlgLsost);
        set(8, grdlgPerson);
        set(9, grdlgButton);
        set(10, grdlgDatetime);
        set(11, grdlgSdatetime);
        set(12, grdlgDelay);
        set(13, grdlgEid);
    }
}