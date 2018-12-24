/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.GetAdress;


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
public class GetAdressRecord extends TableRecordImpl<GetAdressRecord> implements Record1<String> {

    private static final long serialVersionUID = 206210292;

    /**
     * Setter for <code>GET_ADRESS.ADR_STR</code>.
     */
    public void setAdrStr(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>GET_ADRESS.ADR_STR</code>.
     */
    public String getAdrStr() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return GetAdress.GET_ADRESS.ADR_STR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getAdrStr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getAdrStr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetAdressRecord value1(String value) {
        setAdrStr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetAdressRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetAdressRecord
     */
    public GetAdressRecord() {
        super(GetAdress.GET_ADRESS);
    }

    /**
     * Create a detached, initialised GetAdressRecord
     */
    public GetAdressRecord(String adrStr) {
        super(GetAdress.GET_ADRESS);

        set(0, adrStr);
    }
}