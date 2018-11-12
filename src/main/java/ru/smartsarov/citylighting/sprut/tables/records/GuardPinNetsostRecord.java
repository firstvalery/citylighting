/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.GuardPinNetsost;


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
public class GuardPinNetsostRecord extends UpdatableRecordImpl<GuardPinNetsostRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 173018650;

    /**
     * Setter for <code>GUARD_PIN_NETSOST.GRDPN_ID</code>.
     */
    public void setGrdpnId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>GUARD_PIN_NETSOST.GRDPN_ID</code>.
     */
    public Integer getGrdpnId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>GUARD_PIN_NETSOST.GRDPN_NAME</code>.
     */
    public void setGrdpnName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>GUARD_PIN_NETSOST.GRDPN_NAME</code>.
     */
    public String getGrdpnName() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return GuardPinNetsost.GUARD_PIN_NETSOST.GRDPN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GuardPinNetsost.GUARD_PIN_NETSOST.GRDPN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getGrdpnId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getGrdpnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getGrdpnId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGrdpnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardPinNetsostRecord value1(Integer value) {
        setGrdpnId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardPinNetsostRecord value2(String value) {
        setGrdpnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuardPinNetsostRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GuardPinNetsostRecord
     */
    public GuardPinNetsostRecord() {
        super(GuardPinNetsost.GUARD_PIN_NETSOST);
    }

    /**
     * Create a detached, initialised GuardPinNetsostRecord
     */
    public GuardPinNetsostRecord(Integer grdpnId, String grdpnName) {
        super(GuardPinNetsost.GUARD_PIN_NETSOST);

        set(0, grdpnId);
        set(1, grdpnName);
    }
}
