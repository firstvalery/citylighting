/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.Cntb;


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
public class CntbRecord extends UpdatableRecordImpl<CntbRecord> implements Record7<Integer, Integer, String, Integer, Double, Double, Double> {

    private static final long serialVersionUID = -1201776850;

    /**
     * Setter for <code>CNTB.CNTB_ID</code>.
     */
    public void setCntbId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>CNTB.CNTB_ID</code>.
     */
    public Integer getCntbId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>CNTB.CNTB_CNTA_ID</code>.
     */
    public void setCntbCntaId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>CNTB.CNTB_CNTA_ID</code>.
     */
    public Integer getCntbCntaId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>CNTB.CNTB_NAME</code>.
     */
    public void setCntbName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>CNTB.CNTB_NAME</code>.
     */
    public String getCntbName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>CNTB.CNTB_TYPE</code>.
     */
    public void setCntbType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>CNTB.CNTB_TYPE</code>.
     */
    public Integer getCntbType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>CNTB.CNTB_PARAM1</code>.
     */
    public void setCntbParam1(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>CNTB.CNTB_PARAM1</code>.
     */
    public Double getCntbParam1() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>CNTB.CNTB_PARAM2</code>.
     */
    public void setCntbParam2(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>CNTB.CNTB_PARAM2</code>.
     */
    public Double getCntbParam2() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>CNTB.CNTB_PARAM3</code>.
     */
    public void setCntbParam3(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>CNTB.CNTB_PARAM3</code>.
     */
    public Double getCntbParam3() {
        return (Double) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Integer, Double, Double, Double> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Integer, Double, Double, Double> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Cntb.CNTB.CNTB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Cntb.CNTB.CNTB_CNTA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Cntb.CNTB.CNTB_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Cntb.CNTB.CNTB_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return Cntb.CNTB.CNTB_PARAM1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return Cntb.CNTB.CNTB_PARAM2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return Cntb.CNTB.CNTB_PARAM3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCntbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCntbCntaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCntbName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getCntbType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component5() {
        return getCntbParam1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component6() {
        return getCntbParam2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component7() {
        return getCntbParam3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCntbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCntbCntaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCntbName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getCntbType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getCntbParam1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getCntbParam2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getCntbParam3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntbRecord value1(Integer value) {
        setCntbId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntbRecord value2(Integer value) {
        setCntbCntaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntbRecord value3(String value) {
        setCntbName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntbRecord value4(Integer value) {
        setCntbType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntbRecord value5(Double value) {
        setCntbParam1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntbRecord value6(Double value) {
        setCntbParam2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntbRecord value7(Double value) {
        setCntbParam3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntbRecord values(Integer value1, Integer value2, String value3, Integer value4, Double value5, Double value6, Double value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CntbRecord
     */
    public CntbRecord() {
        super(Cntb.CNTB);
    }

    /**
     * Create a detached, initialised CntbRecord
     */
    public CntbRecord(Integer cntbId, Integer cntbCntaId, String cntbName, Integer cntbType, Double cntbParam1, Double cntbParam2, Double cntbParam3) {
        super(Cntb.CNTB);

        set(0, cntbId);
        set(1, cntbCntaId);
        set(2, cntbName);
        set(3, cntbType);
        set(4, cntbParam1);
        set(5, cntbParam2);
        set(6, cntbParam3);
    }
}
