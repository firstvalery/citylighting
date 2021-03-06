/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.Xuser;


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
public class XuserRecord extends UpdatableRecordImpl<XuserRecord> implements Record8<Integer, Integer, Integer, Integer, String, String, byte[], byte[]> {

    private static final long serialVersionUID = -1434016804;

    /**
     * Setter for <code>XUSER.USER_ID</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>XUSER.USER_ID</code>.
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>XUSER.USER_AB_ID</code>.
     */
    public void setUserAbId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>XUSER.USER_AB_ID</code>.
     */
    public Integer getUserAbId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>XUSER.USER_GRP_ID</code>.
     */
    public void setUserGrpId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>XUSER.USER_GRP_ID</code>.
     */
    public Integer getUserGrpId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>XUSER.USER_TYPE</code>.
     */
    public void setUserType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>XUSER.USER_TYPE</code>.
     */
    public Integer getUserType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>XUSER.USER_NAME</code>.
     */
    public void setUserName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>XUSER.USER_NAME</code>.
     */
    public String getUserName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>XUSER.USER_DESCRIPTION</code>.
     */
    public void setUserDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>XUSER.USER_DESCRIPTION</code>.
     */
    public String getUserDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>XUSER.USER_PASSWORD</code>.
     */
    public void setUserPassword(byte... value) {
        set(6, value);
    }

    /**
     * Getter for <code>XUSER.USER_PASSWORD</code>.
     */
    public byte[] getUserPassword() {
        return (byte[]) get(6);
    }

    /**
     * Setter for <code>XUSER.USER_KEY</code>.
     */
    public void setUserKey(byte... value) {
        set(7, value);
    }

    /**
     * Getter for <code>XUSER.USER_KEY</code>.
     */
    public byte[] getUserKey() {
        return (byte[]) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Integer, String, String, byte[], byte[]> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Integer, String, String, byte[], byte[]> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Xuser.XUSER.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Xuser.XUSER.USER_AB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Xuser.XUSER.USER_GRP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Xuser.XUSER.USER_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Xuser.XUSER.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Xuser.XUSER.USER_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field7() {
        return Xuser.XUSER.USER_PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field8() {
        return Xuser.XUSER.USER_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getUserAbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getUserGrpId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getUserType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getUserDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component7() {
        return getUserPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component8() {
        return getUserKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUserAbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserGrpId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUserType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUserDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value7() {
        return getUserPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value8() {
        return getUserKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XuserRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XuserRecord value2(Integer value) {
        setUserAbId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XuserRecord value3(Integer value) {
        setUserGrpId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XuserRecord value4(Integer value) {
        setUserType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XuserRecord value5(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XuserRecord value6(String value) {
        setUserDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XuserRecord value7(byte... value) {
        setUserPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XuserRecord value8(byte... value) {
        setUserKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XuserRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, String value6, byte[] value7, byte[] value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached XuserRecord
     */
    public XuserRecord() {
        super(Xuser.XUSER);
    }

    /**
     * Create a detached, initialised XuserRecord
     */
    public XuserRecord(Integer userId, Integer userAbId, Integer userGrpId, Integer userType, String userName, String userDescription, byte[] userPassword, byte[] userKey) {
        super(Xuser.XUSER);

        set(0, userId);
        set(1, userAbId);
        set(2, userGrpId);
        set(3, userType);
        set(4, userName);
        set(5, userDescription);
        set(6, userPassword);
        set(7, userKey);
    }
}
