/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Record4;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.ElementSlot;


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
public class ElementSlotRecord extends UpdatableRecordImpl<ElementSlotRecord> implements Record12<Integer, Integer, Integer, Integer, Short, Integer, Integer, Integer, Short, String, String, String> {

    private static final long serialVersionUID = 467921497;

    /**
     * Setter for <code>ELEMENT_SLOT.ETYPE</code>.
     */
    public void setEtype(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ELEMENT_SLOT.ETYPE</code>.
     */
    public Integer getEtype() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ELEMENT_SLOT.ATYPE</code>.
     */
    public void setAtype(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>ELEMENT_SLOT.ATYPE</code>.
     */
    public Integer getAtype() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ELEMENT_SLOT.BTYPE</code>.
     */
    public void setBtype(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>ELEMENT_SLOT.BTYPE</code>.
     */
    public Integer getBtype() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>ELEMENT_SLOT.SLOT_NUM</code>.
     */
    public void setSlotNum(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>ELEMENT_SLOT.SLOT_NUM</code>.
     */
    public Integer getSlotNum() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>ELEMENT_SLOT.ALLOW_MULTIPLE_LINK</code>.
     */
    public void setAllowMultipleLink(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>ELEMENT_SLOT.ALLOW_MULTIPLE_LINK</code>.
     */
    public Short getAllowMultipleLink() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>ELEMENT_SLOT.CAN_LINK_ETYPE</code>.
     */
    public void setCanLinkEtype(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>ELEMENT_SLOT.CAN_LINK_ETYPE</code>.
     */
    public Integer getCanLinkEtype() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ELEMENT_SLOT.CAN_LINK_ATYPE</code>.
     */
    public void setCanLinkAtype(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>ELEMENT_SLOT.CAN_LINK_ATYPE</code>.
     */
    public Integer getCanLinkAtype() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>ELEMENT_SLOT.CAN_LINK_BTYPE</code>.
     */
    public void setCanLinkBtype(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>ELEMENT_SLOT.CAN_LINK_BTYPE</code>.
     */
    public Integer getCanLinkBtype() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>ELEMENT_SLOT.ENABLED</code>.
     */
    public void setEnabled(Short value) {
        set(8, value);
    }

    /**
     * Getter for <code>ELEMENT_SLOT.ENABLED</code>.
     */
    public Short getEnabled() {
        return (Short) get(8);
    }

    /**
     * Setter for <code>ELEMENT_SLOT.NAME</code>.
     */
    public void setName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>ELEMENT_SLOT.NAME</code>.
     */
    public String getName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ELEMENT_SLOT.MEMO</code>.
     */
    public void setMemo(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>ELEMENT_SLOT.MEMO</code>.
     */
    public String getMemo() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ELEMENT_SLOT.SLOT_GUI_SETTINGS</code>.
     */
    public void setSlotGuiSettings(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>ELEMENT_SLOT.SLOT_GUI_SETTINGS</code>.
     */
    public String getSlotGuiSettings() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record4<Integer, Integer, Integer, Integer> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, Integer, Integer, Short, Integer, Integer, Integer, Short, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, Integer, Integer, Short, Integer, Integer, Integer, Short, String, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ElementSlot.ELEMENT_SLOT.ETYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ElementSlot.ELEMENT_SLOT.ATYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ElementSlot.ELEMENT_SLOT.BTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ElementSlot.ELEMENT_SLOT.SLOT_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return ElementSlot.ELEMENT_SLOT.ALLOW_MULTIPLE_LINK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ElementSlot.ELEMENT_SLOT.CAN_LINK_ETYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ElementSlot.ELEMENT_SLOT.CAN_LINK_ATYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ElementSlot.ELEMENT_SLOT.CAN_LINK_BTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field9() {
        return ElementSlot.ELEMENT_SLOT.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ElementSlot.ELEMENT_SLOT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ElementSlot.ELEMENT_SLOT.MEMO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ElementSlot.ELEMENT_SLOT.SLOT_GUI_SETTINGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getEtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getAtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getBtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getSlotNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getAllowMultipleLink();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getCanLinkEtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getCanLinkAtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getCanLinkBtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component9() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getMemo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getSlotGuiSettings();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getEtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getAtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getBtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getSlotNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getAllowMultipleLink();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getCanLinkEtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getCanLinkAtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getCanLinkBtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value9() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getMemo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getSlotGuiSettings();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ElementSlotRecord value1(Integer value) {
        setEtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ElementSlotRecord value2(Integer value) {
        setAtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ElementSlotRecord value3(Integer value) {
        setBtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ElementSlotRecord value4(Integer value) {
        setSlotNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ElementSlotRecord value5(Short value) {
        setAllowMultipleLink(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ElementSlotRecord value6(Integer value) {
        setCanLinkEtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ElementSlotRecord value7(Integer value) {
        setCanLinkAtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ElementSlotRecord value8(Integer value) {
        setCanLinkBtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ElementSlotRecord value9(Short value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ElementSlotRecord value10(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ElementSlotRecord value11(String value) {
        setMemo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ElementSlotRecord value12(String value) {
        setSlotGuiSettings(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ElementSlotRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Short value5, Integer value6, Integer value7, Integer value8, Short value9, String value10, String value11, String value12) {
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
     * Create a detached ElementSlotRecord
     */
    public ElementSlotRecord() {
        super(ElementSlot.ELEMENT_SLOT);
    }

    /**
     * Create a detached, initialised ElementSlotRecord
     */
    public ElementSlotRecord(Integer etype, Integer atype, Integer btype, Integer slotNum, Short allowMultipleLink, Integer canLinkEtype, Integer canLinkAtype, Integer canLinkBtype, Short enabled, String name, String memo, String slotGuiSettings) {
        super(ElementSlot.ELEMENT_SLOT);

        set(0, etype);
        set(1, atype);
        set(2, btype);
        set(3, slotNum);
        set(4, allowMultipleLink);
        set(5, canLinkEtype);
        set(6, canLinkAtype);
        set(7, canLinkBtype);
        set(8, enabled);
        set(9, name);
        set(10, memo);
        set(11, slotGuiSettings);
    }
}
