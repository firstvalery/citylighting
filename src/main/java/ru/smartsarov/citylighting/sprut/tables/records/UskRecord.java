/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.Usk;


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
public class UskRecord extends UpdatableRecordImpl<UskRecord> implements Record12<Integer, Integer, Integer, Integer, String, String, byte[], Integer, Timestamp, Timestamp, Integer, String> {

    private static final long serialVersionUID = -2108016643;

    /**
     * Setter for <code>USK.USK_ID</code>.
     */
    public void setUskId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>USK.USK_ID</code>.
     */
    public Integer getUskId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>USK.USK_AB_ID</code>.
     */
    public void setUskAbId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>USK.USK_AB_ID</code>.
     */
    public Integer getUskAbId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>USK.USK_UID</code>.
     */
    public void setUskUid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>USK.USK_UID</code>.
     */
    public Integer getUskUid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>USK.USK_TYPE</code>.
     */
    public void setUskType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>USK.USK_TYPE</code>.
     */
    public Integer getUskType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>USK.USK_IP</code>.
     */
    public void setUskIp(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>USK.USK_IP</code>.
     */
    public String getUskIp() {
        return (String) get(4);
    }

    /**
     * Setter for <code>USK.USK_NAME</code>.
     */
    public void setUskName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>USK.USK_NAME</code>.
     */
    public String getUskName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>USK.USK_PASSWORD</code>.
     */
    public void setUskPassword(byte... value) {
        set(6, value);
    }

    /**
     * Getter for <code>USK.USK_PASSWORD</code>.
     */
    public byte[] getUskPassword() {
        return (byte[]) get(6);
    }

    /**
     * Setter for <code>USK.USK_ADR_ID</code>.
     */
    public void setUskAdrId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>USK.USK_ADR_ID</code>.
     */
    public Integer getUskAdrId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>USK.USK_SDATE</code>.
     */
    public void setUskSdate(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>USK.USK_SDATE</code>.
     */
    public Timestamp getUskSdate() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>USK.USK_EDATE</code>.
     */
    public void setUskEdate(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>USK.USK_EDATE</code>.
     */
    public Timestamp getUskEdate() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>USK.USK_SOST</code>.
     */
    public void setUskSost(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>USK.USK_SOST</code>.
     */
    public Integer getUskSost() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>USK.USK_PASS2</code>.
     */
    public void setUskPass2(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>USK.USK_PASS2</code>.
     */
    public String getUskPass2() {
        return (String) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, Integer, Integer, String, String, byte[], Integer, Timestamp, Timestamp, Integer, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, Integer, Integer, String, String, byte[], Integer, Timestamp, Timestamp, Integer, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Usk.USK.USK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Usk.USK.USK_AB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Usk.USK.USK_UID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Usk.USK.USK_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Usk.USK.USK_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Usk.USK.USK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field7() {
        return Usk.USK.USK_PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Usk.USK.USK_ADR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return Usk.USK.USK_SDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return Usk.USK.USK_EDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Usk.USK.USK_SOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Usk.USK.USK_PASS2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getUskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getUskAbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getUskUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getUskType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUskIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getUskName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component7() {
        return getUskPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getUskAdrId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getUskSdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getUskEdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getUskSost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getUskPass2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUskAbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUskUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUskType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUskIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUskName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value7() {
        return getUskPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getUskAdrId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUskSdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUskEdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getUskSost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getUskPass2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskRecord value1(Integer value) {
        setUskId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskRecord value2(Integer value) {
        setUskAbId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskRecord value3(Integer value) {
        setUskUid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskRecord value4(Integer value) {
        setUskType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskRecord value5(String value) {
        setUskIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskRecord value6(String value) {
        setUskName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskRecord value7(byte... value) {
        setUskPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskRecord value8(Integer value) {
        setUskAdrId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskRecord value9(Timestamp value) {
        setUskSdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskRecord value10(Timestamp value) {
        setUskEdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskRecord value11(Integer value) {
        setUskSost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskRecord value12(String value) {
        setUskPass2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UskRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, String value6, byte[] value7, Integer value8, Timestamp value9, Timestamp value10, Integer value11, String value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UskRecord
     */
    public UskRecord() {
        super(Usk.USK);
    }

    /**
     * Create a detached, initialised UskRecord
     */
    public UskRecord(Integer uskId, Integer uskAbId, Integer uskUid, Integer uskType, String uskIp, String uskName, byte[] uskPassword, Integer uskAdrId, Timestamp uskSdate, Timestamp uskEdate, Integer uskSost, String uskPass2) {
        super(Usk.USK);

        set(0, uskId);
        set(1, uskAbId);
        set(2, uskUid);
        set(3, uskType);
        set(4, uskIp);
        set(5, uskName);
        set(6, uskPassword);
        set(7, uskAdrId);
        set(8, uskSdate);
        set(9, uskEdate);
        set(10, uskSost);
        set(11, uskPass2);
    }
}