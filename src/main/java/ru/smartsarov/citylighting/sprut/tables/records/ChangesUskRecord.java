/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.ChangesUsk;


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
public class ChangesUskRecord extends UpdatableRecordImpl<ChangesUskRecord> implements Record15<Integer, String, Timestamp, Integer, Integer, Integer, Integer, Integer, String, String, Integer, Timestamp, Timestamp, Integer, String> {

    private static final long serialVersionUID = 839558172;

    /**
     * Setter for <code>CHANGES_USK.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>CHANGES_USK.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>CHANGES_USK.LOGIN</code>.
     */
    public void setLogin(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>CHANGES_USK.LOGIN</code>.
     */
    public String getLogin() {
        return (String) get(1);
    }

    /**
     * Setter for <code>CHANGES_USK.CHANGE_TIME</code>.
     */
    public void setChangeTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>CHANGES_USK.CHANGE_TIME</code>.
     */
    public Timestamp getChangeTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>CHANGES_USK.CHANGE_TYPE</code>.
     */
    public void setChangeType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>CHANGES_USK.CHANGE_TYPE</code>.
     */
    public Integer getChangeType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>CHANGES_USK.USK_ID</code>.
     */
    public void setUskId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>CHANGES_USK.USK_ID</code>.
     */
    public Integer getUskId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>CHANGES_USK.USK_AB_ID</code>.
     */
    public void setUskAbId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>CHANGES_USK.USK_AB_ID</code>.
     */
    public Integer getUskAbId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>CHANGES_USK.USK_UID</code>.
     */
    public void setUskUid(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>CHANGES_USK.USK_UID</code>.
     */
    public Integer getUskUid() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>CHANGES_USK.USK_TYPE</code>.
     */
    public void setUskType(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>CHANGES_USK.USK_TYPE</code>.
     */
    public Integer getUskType() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>CHANGES_USK.USK_IP</code>.
     */
    public void setUskIp(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>CHANGES_USK.USK_IP</code>.
     */
    public String getUskIp() {
        return (String) get(8);
    }

    /**
     * Setter for <code>CHANGES_USK.USK_NAME</code>.
     */
    public void setUskName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>CHANGES_USK.USK_NAME</code>.
     */
    public String getUskName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>CHANGES_USK.USK_ADR_ID</code>.
     */
    public void setUskAdrId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>CHANGES_USK.USK_ADR_ID</code>.
     */
    public Integer getUskAdrId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>CHANGES_USK.USK_SDATE</code>.
     */
    public void setUskSdate(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>CHANGES_USK.USK_SDATE</code>.
     */
    public Timestamp getUskSdate() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>CHANGES_USK.USK_EDATE</code>.
     */
    public void setUskEdate(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>CHANGES_USK.USK_EDATE</code>.
     */
    public Timestamp getUskEdate() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>CHANGES_USK.USK_SOST</code>.
     */
    public void setUskSost(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>CHANGES_USK.USK_SOST</code>.
     */
    public Integer getUskSost() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>CHANGES_USK.USK_PASS2</code>.
     */
    public void setUskPass2(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>CHANGES_USK.USK_PASS2</code>.
     */
    public String getUskPass2() {
        return (String) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, String, Timestamp, Integer, Integer, Integer, Integer, Integer, String, String, Integer, Timestamp, Timestamp, Integer, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, String, Timestamp, Integer, Integer, Integer, Integer, Integer, String, String, Integer, Timestamp, Timestamp, Integer, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ChangesUsk.CHANGES_USK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ChangesUsk.CHANGES_USK.LOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return ChangesUsk.CHANGES_USK.CHANGE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ChangesUsk.CHANGES_USK.CHANGE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ChangesUsk.CHANGES_USK.USK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ChangesUsk.CHANGES_USK.USK_AB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ChangesUsk.CHANGES_USK.USK_UID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ChangesUsk.CHANGES_USK.USK_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ChangesUsk.CHANGES_USK.USK_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ChangesUsk.CHANGES_USK.USK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return ChangesUsk.CHANGES_USK.USK_ADR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return ChangesUsk.CHANGES_USK.USK_SDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return ChangesUsk.CHANGES_USK.USK_EDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return ChangesUsk.CHANGES_USK.USK_SOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return ChangesUsk.CHANGES_USK.USK_PASS2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getChangeTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getChangeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getUskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getUskAbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getUskUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getUskType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getUskIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getUskName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getUskAdrId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getUskSdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getUskEdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getUskSost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getUskPass2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getChangeTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getChangeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getUskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getUskAbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getUskUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getUskType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getUskIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getUskName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getUskAdrId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getUskSdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getUskEdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getUskSost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getUskPass2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangesUskRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangesUskRecord value2(String value) {
        setLogin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangesUskRecord value3(Timestamp value) {
        setChangeTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangesUskRecord value4(Integer value) {
        setChangeType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangesUskRecord value5(Integer value) {
        setUskId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangesUskRecord value6(Integer value) {
        setUskAbId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangesUskRecord value7(Integer value) {
        setUskUid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangesUskRecord value8(Integer value) {
        setUskType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangesUskRecord value9(String value) {
        setUskIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangesUskRecord value10(String value) {
        setUskName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangesUskRecord value11(Integer value) {
        setUskAdrId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangesUskRecord value12(Timestamp value) {
        setUskSdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangesUskRecord value13(Timestamp value) {
        setUskEdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangesUskRecord value14(Integer value) {
        setUskSost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangesUskRecord value15(String value) {
        setUskPass2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChangesUskRecord values(Integer value1, String value2, Timestamp value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8, String value9, String value10, Integer value11, Timestamp value12, Timestamp value13, Integer value14, String value15) {
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
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ChangesUskRecord
     */
    public ChangesUskRecord() {
        super(ChangesUsk.CHANGES_USK);
    }

    /**
     * Create a detached, initialised ChangesUskRecord
     */
    public ChangesUskRecord(Integer id, String login, Timestamp changeTime, Integer changeType, Integer uskId, Integer uskAbId, Integer uskUid, Integer uskType, String uskIp, String uskName, Integer uskAdrId, Timestamp uskSdate, Timestamp uskEdate, Integer uskSost, String uskPass2) {
        super(ChangesUsk.CHANGES_USK);

        set(0, id);
        set(1, login);
        set(2, changeTime);
        set(3, changeType);
        set(4, uskId);
        set(5, uskAbId);
        set(6, uskUid);
        set(7, uskType);
        set(8, uskIp);
        set(9, uskName);
        set(10, uskAdrId);
        set(11, uskSdate);
        set(12, uskEdate);
        set(13, uskSost);
        set(14, uskPass2);
    }
}
