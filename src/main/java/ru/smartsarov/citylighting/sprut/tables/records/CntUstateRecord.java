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

import ru.smartsarov.citylighting.sprut.tables.CntUstate;


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
public class CntUstateRecord extends UpdatableRecordImpl<CntUstateRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = -574894494;

    /**
     * Setter for <code>CNT_USTATE.CNTUS_ID</code>.
     */
    public void setCntusId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>CNT_USTATE.CNTUS_ID</code>.
     */
    public Integer getCntusId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>CNT_USTATE.CNTUS_STATE</code>.
     */
    public void setCntusState(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>CNT_USTATE.CNTUS_STATE</code>.
     */
    public Integer getCntusState() {
        return (Integer) get(1);
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
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CntUstate.CNT_USTATE.CNTUS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CntUstate.CNT_USTATE.CNTUS_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCntusId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCntusState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCntusId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCntusState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntUstateRecord value1(Integer value) {
        setCntusId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntUstateRecord value2(Integer value) {
        setCntusState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntUstateRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CntUstateRecord
     */
    public CntUstateRecord() {
        super(CntUstate.CNT_USTATE);
    }

    /**
     * Create a detached, initialised CntUstateRecord
     */
    public CntUstateRecord(Integer cntusId, Integer cntusState) {
        super(CntUstate.CNT_USTATE);

        set(0, cntusId);
        set(1, cntusState);
    }
}
