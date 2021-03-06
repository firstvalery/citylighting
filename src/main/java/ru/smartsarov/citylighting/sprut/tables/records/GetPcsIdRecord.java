/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.GetPcsId;


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
public class GetPcsIdRecord extends TableRecordImpl<GetPcsIdRecord> implements Record1<Integer> {

    private static final long serialVersionUID = 721622797;

    /**
     * Setter for <code>GET_PCS_ID.RESULT</code>.
     */
    public void setResult(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>GET_PCS_ID.RESULT</code>.
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
        return GetPcsId.GET_PCS_ID.RESULT;
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
    public GetPcsIdRecord value1(Integer value) {
        setResult(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetPcsIdRecord values(Integer value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetPcsIdRecord
     */
    public GetPcsIdRecord() {
        super(GetPcsId.GET_PCS_ID);
    }

    /**
     * Create a detached, initialised GetPcsIdRecord
     */
    public GetPcsIdRecord(Integer result) {
        super(GetPcsId.GET_PCS_ID);

        set(0, result);
    }
}
