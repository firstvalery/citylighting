/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.InsXgroup;


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
public class InsXgroupRecord extends TableRecordImpl<InsXgroupRecord> implements Record1<Integer> {

    private static final long serialVersionUID = 979464384;

    /**
     * Setter for <code>INS_XGROUP.RESULT</code>.
     */
    public void setResult(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>INS_XGROUP.RESULT</code>.
     */
    public Integer getResult() {
        return (Integer) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Integer> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Integer> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return InsXgroup.INS_XGROUP.RESULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsXgroupRecord value1(Integer value) {
        setResult(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsXgroupRecord values(Integer value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InsXgroupRecord
     */
    public InsXgroupRecord() {
        super(InsXgroup.INS_XGROUP);
    }

    /**
     * Create a detached, initialised InsXgroupRecord
     */
    public InsXgroupRecord(Integer result) {
        super(InsXgroup.INS_XGROUP);

        set(0, result);
    }
}
