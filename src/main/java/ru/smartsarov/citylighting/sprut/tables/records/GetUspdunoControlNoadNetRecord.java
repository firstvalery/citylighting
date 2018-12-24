/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.GetUspdunoControlNoadNet;


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
public class GetUspdunoControlNoadNetRecord extends TableRecordImpl<GetUspdunoControlNoadNetRecord> implements Record10<Integer, Integer, Integer, Integer, String, String, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = -290498357;

    /**
     * Setter for <code>GET_USPDUNO_CONTROL_NOAD_NET.USK_ID</code>.
     */
    public void setUskId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>GET_USPDUNO_CONTROL_NOAD_NET.USK_ID</code>.
     */
    public Integer getUskId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>GET_USPDUNO_CONTROL_NOAD_NET.USK_AB_ID</code>.
     */
    public void setUskAbId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>GET_USPDUNO_CONTROL_NOAD_NET.USK_AB_ID</code>.
     */
    public Integer getUskAbId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>GET_USPDUNO_CONTROL_NOAD_NET.USK_UID</code>.
     */
    public void setUskUid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>GET_USPDUNO_CONTROL_NOAD_NET.USK_UID</code>.
     */
    public Integer getUskUid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>GET_USPDUNO_CONTROL_NOAD_NET.USK_TYPE_ID</code>.
     */
    public void setUskTypeId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>GET_USPDUNO_CONTROL_NOAD_NET.USK_TYPE_ID</code>.
     */
    public Integer getUskTypeId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>GET_USPDUNO_CONTROL_NOAD_NET.USK_IP</code>.
     */
    public void setUskIp(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>GET_USPDUNO_CONTROL_NOAD_NET.USK_IP</code>.
     */
    public String getUskIp() {
        return (String) get(4);
    }

    /**
     * Setter for <code>GET_USPDUNO_CONTROL_NOAD_NET.USK_KEY</code>.
     */
    public void setUskKey(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>GET_USPDUNO_CONTROL_NOAD_NET.USK_KEY</code>.
     */
    public String getUskKey() {
        return (String) get(5);
    }

    /**
     * Setter for <code>GET_USPDUNO_CONTROL_NOAD_NET.ADR_ID</code>.
     */
    public void setAdrId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>GET_USPDUNO_CONTROL_NOAD_NET.ADR_ID</code>.
     */
    public Integer getAdrId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>GET_USPDUNO_CONTROL_NOAD_NET.PIN_NET_STATE</code>.
     */
    public void setPinNetState(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>GET_USPDUNO_CONTROL_NOAD_NET.PIN_NET_STATE</code>.
     */
    public Integer getPinNetState() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>GET_USPDUNO_CONTROL_NOAD_NET.LINKED_ID</code>.
     */
    public void setLinkedId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>GET_USPDUNO_CONTROL_NOAD_NET.LINKED_ID</code>.
     */
    public Integer getLinkedId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>GET_USPDUNO_CONTROL_NOAD_NET.CNT_BTYPE</code>.
     */
    public void setCntBtype(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>GET_USPDUNO_CONTROL_NOAD_NET.CNT_BTYPE</code>.
     */
    public Integer getCntBtype() {
        return (Integer) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, Integer, Integer, String, String, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, Integer, Integer, String, String, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return GetUspdunoControlNoadNet.GET_USPDUNO_CONTROL_NOAD_NET.USK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return GetUspdunoControlNoadNet.GET_USPDUNO_CONTROL_NOAD_NET.USK_AB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return GetUspdunoControlNoadNet.GET_USPDUNO_CONTROL_NOAD_NET.USK_UID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return GetUspdunoControlNoadNet.GET_USPDUNO_CONTROL_NOAD_NET.USK_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return GetUspdunoControlNoadNet.GET_USPDUNO_CONTROL_NOAD_NET.USK_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return GetUspdunoControlNoadNet.GET_USPDUNO_CONTROL_NOAD_NET.USK_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return GetUspdunoControlNoadNet.GET_USPDUNO_CONTROL_NOAD_NET.ADR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return GetUspdunoControlNoadNet.GET_USPDUNO_CONTROL_NOAD_NET.PIN_NET_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return GetUspdunoControlNoadNet.GET_USPDUNO_CONTROL_NOAD_NET.LINKED_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return GetUspdunoControlNoadNet.GET_USPDUNO_CONTROL_NOAD_NET.CNT_BTYPE;
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
        return getUskTypeId();
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
        return getUskKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getAdrId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getPinNetState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getLinkedId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getCntBtype();
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
        return getUskTypeId();
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
        return getUskKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getAdrId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getPinNetState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getLinkedId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getCntBtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUspdunoControlNoadNetRecord value1(Integer value) {
        setUskId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUspdunoControlNoadNetRecord value2(Integer value) {
        setUskAbId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUspdunoControlNoadNetRecord value3(Integer value) {
        setUskUid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUspdunoControlNoadNetRecord value4(Integer value) {
        setUskTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUspdunoControlNoadNetRecord value5(String value) {
        setUskIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUspdunoControlNoadNetRecord value6(String value) {
        setUskKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUspdunoControlNoadNetRecord value7(Integer value) {
        setAdrId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUspdunoControlNoadNetRecord value8(Integer value) {
        setPinNetState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUspdunoControlNoadNetRecord value9(Integer value) {
        setLinkedId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUspdunoControlNoadNetRecord value10(Integer value) {
        setCntBtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetUspdunoControlNoadNetRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, String value6, Integer value7, Integer value8, Integer value9, Integer value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetUspdunoControlNoadNetRecord
     */
    public GetUspdunoControlNoadNetRecord() {
        super(GetUspdunoControlNoadNet.GET_USPDUNO_CONTROL_NOAD_NET);
    }

    /**
     * Create a detached, initialised GetUspdunoControlNoadNetRecord
     */
    public GetUspdunoControlNoadNetRecord(Integer uskId, Integer uskAbId, Integer uskUid, Integer uskTypeId, String uskIp, String uskKey, Integer adrId, Integer pinNetState, Integer linkedId, Integer cntBtype) {
        super(GetUspdunoControlNoadNet.GET_USPDUNO_CONTROL_NOAD_NET);

        set(0, uskId);
        set(1, uskAbId);
        set(2, uskUid);
        set(3, uskTypeId);
        set(4, uskIp);
        set(5, uskKey);
        set(6, adrId);
        set(7, pinNetState);
        set(8, linkedId);
        set(9, cntBtype);
    }
}