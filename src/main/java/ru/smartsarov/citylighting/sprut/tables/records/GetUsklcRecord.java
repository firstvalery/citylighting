/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.GetUsklc;


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
public class GetUsklcRecord extends TableRecordImpl<GetUsklcRecord> implements Record13<Integer, Integer, Integer, Integer, String, Integer, Integer, String, String, String, Integer, Integer, Timestamp> {

    private static final long serialVersionUID = 155237042;

    /**
     * Setter for <code>GET_USKLC.USK_AB_ID</code>.
     */
    public void setUskAbId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>GET_USKLC.USK_AB_ID</code>.
     */
    public Integer getUskAbId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>GET_USKLC.ACCESS</code>.
     */
    public void setAccess(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>GET_USKLC.ACCESS</code>.
     */
    public Integer getAccess() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>GET_USKLC.USK_ID</code>.
     */
    public void setUskId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>GET_USKLC.USK_ID</code>.
     */
    public Integer getUskId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>GET_USKLC.USK_UID</code>.
     */
    public void setUskUid(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>GET_USKLC.USK_UID</code>.
     */
    public Integer getUskUid() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>GET_USKLC.USK_IP</code>.
     */
    public void setUskIp(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>GET_USKLC.USK_IP</code>.
     */
    public String getUskIp() {
        return (String) get(4);
    }

    /**
     * Setter for <code>GET_USKLC.USK_TYPE</code>.
     */
    public void setUskType(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>GET_USKLC.USK_TYPE</code>.
     */
    public Integer getUskType() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>GET_USKLC.USK_ADR_ID</code>.
     */
    public void setUskAdrId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>GET_USKLC.USK_ADR_ID</code>.
     */
    public Integer getUskAdrId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>GET_USKLC.USK_ADR</code>.
     */
    public void setUskAdr(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>GET_USKLC.USK_ADR</code>.
     */
    public String getUskAdr() {
        return (String) get(7);
    }

    /**
     * Setter for <code>GET_USKLC.USK_KEY</code>.
     */
    public void setUskKey(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>GET_USKLC.USK_KEY</code>.
     */
    public String getUskKey() {
        return (String) get(8);
    }

    /**
     * Setter for <code>GET_USKLC.OBJ_ACTION_STATE</code>.
     */
    public void setObjActionState(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>GET_USKLC.OBJ_ACTION_STATE</code>.
     */
    public String getObjActionState() {
        return (String) get(9);
    }

    /**
     * Setter for <code>GET_USKLC.OBJ_ACTION_PROGRESS</code>.
     */
    public void setObjActionProgress(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>GET_USKLC.OBJ_ACTION_PROGRESS</code>.
     */
    public Integer getObjActionProgress() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>GET_USKLC.OBJ_STATE</code>.
     */
    public void setObjState(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>GET_USKLC.OBJ_STATE</code>.
     */
    public Integer getObjState() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>GET_USKLC.OBJ_TIME</code>.
     */
    public void setObjTime(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>GET_USKLC.OBJ_TIME</code>.
     */
    public Timestamp getObjTime() {
        return (Timestamp) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, Integer, Integer, Integer, String, Integer, Integer, String, String, String, Integer, Integer, Timestamp> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, Integer, Integer, Integer, String, Integer, Integer, String, String, String, Integer, Integer, Timestamp> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return GetUsklc.GET_USKLC.USK_AB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return GetUsklc.GET_USKLC.ACCESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return GetUsklc.GET_USKLC.USK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return GetUsklc.GET_USKLC.USK_UID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return GetUsklc.GET_USKLC.USK_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return GetUsklc.GET_USKLC.USK_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return GetUsklc.GET_USKLC.USK_ADR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return GetUsklc.GET_USKLC.USK_ADR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return GetUsklc.GET_USKLC.USK_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return GetUsklc.GET_USKLC.OBJ_ACTION_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return GetUsklc.GET_USKLC.OBJ_ACTION_PROGRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return GetUsklc.GET_USKLC.OBJ_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return GetUsklc.GET_USKLC.OBJ_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getUskAbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getAccess();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getUskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getUskUid();
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
    public Integer component6() {
        return getUskType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getUskAdrId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getUskAdr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getUskKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getObjActionState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getObjActionProgress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getObjState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getObjTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUskAbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getAccess();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUskUid();
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
    public Integer value6() {
        return getUskType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getUskAdrId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUskAdr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getUskKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getObjActionState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getObjActionProgress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getObjState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getObjTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUsklcRecord value1(Integer value) {
        setUskAbId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUsklcRecord value2(Integer value) {
        setAccess(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUsklcRecord value3(Integer value) {
        setUskId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUsklcRecord value4(Integer value) {
        setUskUid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUsklcRecord value5(String value) {
        setUskIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUsklcRecord value6(Integer value) {
        setUskType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUsklcRecord value7(Integer value) {
        setUskAdrId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUsklcRecord value8(String value) {
        setUskAdr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUsklcRecord value9(String value) {
        setUskKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUsklcRecord value10(String value) {
        setObjActionState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUsklcRecord value11(Integer value) {
        setObjActionProgress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUsklcRecord value12(Integer value) {
        setObjState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUsklcRecord value13(Timestamp value) {
        setObjTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUsklcRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, Integer value6, Integer value7, String value8, String value9, String value10, Integer value11, Integer value12, Timestamp value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetUsklcRecord
     */
    public GetUsklcRecord() {
        super(GetUsklc.GET_USKLC);
    }

    /**
     * Create a detached, initialised GetUsklcRecord
     */
    public GetUsklcRecord(Integer uskAbId, Integer access, Integer uskId, Integer uskUid, String uskIp, Integer uskType, Integer uskAdrId, String uskAdr, String uskKey, String objActionState, Integer objActionProgress, Integer objState, Timestamp objTime) {
        super(GetUsklc.GET_USKLC);

        set(0, uskAbId);
        set(1, access);
        set(2, uskId);
        set(3, uskUid);
        set(4, uskIp);
        set(5, uskType);
        set(6, uskAdrId);
        set(7, uskAdr);
        set(8, uskKey);
        set(9, objActionState);
        set(10, objActionProgress);
        set(11, objState);
        set(12, objTime);
    }
}
