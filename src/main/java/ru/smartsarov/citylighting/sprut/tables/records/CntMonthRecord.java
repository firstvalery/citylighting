/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.CntMonth;


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
public class CntMonthRecord extends UpdatableRecordImpl<CntMonthRecord> implements Record21<Integer, Integer, Timestamp, Timestamp, Timestamp, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double> {

    private static final long serialVersionUID = 171497000;

    /**
     * Setter for <code>CNT_MONTH.CNTM_ID</code>.
     */
    public void setCntmId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_ID</code>.
     */
    public Integer getCntmId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>CNT_MONTH.CNTM_CID</code>.
     */
    public void setCntmCid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_CID</code>.
     */
    public Integer getCntmCid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>CNT_MONTH.CNTM_DATE</code>.
     */
    public void setCntmDate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_DATE</code>.
     */
    public Timestamp getCntmDate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>CNT_MONTH.CNTM_SDATE</code>.
     */
    public void setCntmSdate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_SDATE</code>.
     */
    public Timestamp getCntmSdate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>CNT_MONTH.CNTM_EDATE</code>.
     */
    public void setCntmEdate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_EDATE</code>.
     */
    public Timestamp getCntmEdate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>CNT_MONTH.CNTM_SVALUE</code>.
     */
    public void setCntmSvalue(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_SVALUE</code>.
     */
    public Double getCntmSvalue() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>CNT_MONTH.CNTM_SVALUE1</code>.
     */
    public void setCntmSvalue1(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_SVALUE1</code>.
     */
    public Double getCntmSvalue1() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>CNT_MONTH.CNTM_SVALUE2</code>.
     */
    public void setCntmSvalue2(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_SVALUE2</code>.
     */
    public Double getCntmSvalue2() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>CNT_MONTH.CNTM_SVALUE3</code>.
     */
    public void setCntmSvalue3(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_SVALUE3</code>.
     */
    public Double getCntmSvalue3() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>CNT_MONTH.CNTM_SVALUE4</code>.
     */
    public void setCntmSvalue4(Double value) {
        set(9, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_SVALUE4</code>.
     */
    public Double getCntmSvalue4() {
        return (Double) get(9);
    }

    /**
     * Setter for <code>CNT_MONTH.CNTM_DVALUE</code>.
     */
    public void setCntmDvalue(Double value) {
        set(10, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_DVALUE</code>.
     */
    public Double getCntmDvalue() {
        return (Double) get(10);
    }

    /**
     * Setter for <code>CNT_MONTH.CNTM_DVALUE1</code>.
     */
    public void setCntmDvalue1(Double value) {
        set(11, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_DVALUE1</code>.
     */
    public Double getCntmDvalue1() {
        return (Double) get(11);
    }

    /**
     * Setter for <code>CNT_MONTH.CNTM_DVALUE2</code>.
     */
    public void setCntmDvalue2(Double value) {
        set(12, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_DVALUE2</code>.
     */
    public Double getCntmDvalue2() {
        return (Double) get(12);
    }

    /**
     * Setter for <code>CNT_MONTH.CNTM_DVALUE3</code>.
     */
    public void setCntmDvalue3(Double value) {
        set(13, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_DVALUE3</code>.
     */
    public Double getCntmDvalue3() {
        return (Double) get(13);
    }

    /**
     * Setter for <code>CNT_MONTH.CNTM_DVALUE4</code>.
     */
    public void setCntmDvalue4(Double value) {
        set(14, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_DVALUE4</code>.
     */
    public Double getCntmDvalue4() {
        return (Double) get(14);
    }

    /**
     * Setter for <code>CNT_MONTH.CNTM_EVALUE</code>.
     */
    public void setCntmEvalue(Double value) {
        set(15, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_EVALUE</code>.
     */
    public Double getCntmEvalue() {
        return (Double) get(15);
    }

    /**
     * Setter for <code>CNT_MONTH.CNTM_EVALUE1</code>.
     */
    public void setCntmEvalue1(Double value) {
        set(16, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_EVALUE1</code>.
     */
    public Double getCntmEvalue1() {
        return (Double) get(16);
    }

    /**
     * Setter for <code>CNT_MONTH.CNTM_EVALUE2</code>.
     */
    public void setCntmEvalue2(Double value) {
        set(17, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_EVALUE2</code>.
     */
    public Double getCntmEvalue2() {
        return (Double) get(17);
    }

    /**
     * Setter for <code>CNT_MONTH.CNTM_EVALUE3</code>.
     */
    public void setCntmEvalue3(Double value) {
        set(18, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_EVALUE3</code>.
     */
    public Double getCntmEvalue3() {
        return (Double) get(18);
    }

    /**
     * Setter for <code>CNT_MONTH.CNTM_EVALUE4</code>.
     */
    public void setCntmEvalue4(Double value) {
        set(19, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_EVALUE4</code>.
     */
    public Double getCntmEvalue4() {
        return (Double) get(19);
    }

    /**
     * Setter for <code>CNT_MONTH.CNTM_TRANSFORMATION</code>.
     */
    public void setCntmTransformation(Double value) {
        set(20, value);
    }

    /**
     * Getter for <code>CNT_MONTH.CNTM_TRANSFORMATION</code>.
     */
    public Double getCntmTransformation() {
        return (Double) get(20);
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
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Integer, Integer, Timestamp, Timestamp, Timestamp, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Integer, Integer, Timestamp, Timestamp, Timestamp, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CntMonth.CNT_MONTH.CNTM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CntMonth.CNT_MONTH.CNTM_CID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CntMonth.CNT_MONTH.CNTM_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return CntMonth.CNT_MONTH.CNTM_SDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return CntMonth.CNT_MONTH.CNTM_EDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return CntMonth.CNT_MONTH.CNTM_SVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return CntMonth.CNT_MONTH.CNTM_SVALUE1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return CntMonth.CNT_MONTH.CNTM_SVALUE2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field9() {
        return CntMonth.CNT_MONTH.CNTM_SVALUE3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field10() {
        return CntMonth.CNT_MONTH.CNTM_SVALUE4;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field11() {
        return CntMonth.CNT_MONTH.CNTM_DVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field12() {
        return CntMonth.CNT_MONTH.CNTM_DVALUE1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field13() {
        return CntMonth.CNT_MONTH.CNTM_DVALUE2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field14() {
        return CntMonth.CNT_MONTH.CNTM_DVALUE3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field15() {
        return CntMonth.CNT_MONTH.CNTM_DVALUE4;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field16() {
        return CntMonth.CNT_MONTH.CNTM_EVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field17() {
        return CntMonth.CNT_MONTH.CNTM_EVALUE1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field18() {
        return CntMonth.CNT_MONTH.CNTM_EVALUE2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field19() {
        return CntMonth.CNT_MONTH.CNTM_EVALUE3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field20() {
        return CntMonth.CNT_MONTH.CNTM_EVALUE4;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field21() {
        return CntMonth.CNT_MONTH.CNTM_TRANSFORMATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCntmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCntmCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getCntmDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getCntmSdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCntmEdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component6() {
        return getCntmSvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component7() {
        return getCntmSvalue1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component8() {
        return getCntmSvalue2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component9() {
        return getCntmSvalue3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component10() {
        return getCntmSvalue4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component11() {
        return getCntmDvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component12() {
        return getCntmDvalue1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component13() {
        return getCntmDvalue2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component14() {
        return getCntmDvalue3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component15() {
        return getCntmDvalue4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component16() {
        return getCntmEvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component17() {
        return getCntmEvalue1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component18() {
        return getCntmEvalue2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component19() {
        return getCntmEvalue3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component20() {
        return getCntmEvalue4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component21() {
        return getCntmTransformation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCntmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCntmCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCntmDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCntmSdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCntmEdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getCntmSvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getCntmSvalue1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getCntmSvalue2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value9() {
        return getCntmSvalue3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value10() {
        return getCntmSvalue4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value11() {
        return getCntmDvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value12() {
        return getCntmDvalue1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value13() {
        return getCntmDvalue2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value14() {
        return getCntmDvalue3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value15() {
        return getCntmDvalue4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value16() {
        return getCntmEvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value17() {
        return getCntmEvalue1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value18() {
        return getCntmEvalue2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value19() {
        return getCntmEvalue3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value20() {
        return getCntmEvalue4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value21() {
        return getCntmTransformation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value1(Integer value) {
        setCntmId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value2(Integer value) {
        setCntmCid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value3(Timestamp value) {
        setCntmDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value4(Timestamp value) {
        setCntmSdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value5(Timestamp value) {
        setCntmEdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value6(Double value) {
        setCntmSvalue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value7(Double value) {
        setCntmSvalue1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value8(Double value) {
        setCntmSvalue2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value9(Double value) {
        setCntmSvalue3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value10(Double value) {
        setCntmSvalue4(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value11(Double value) {
        setCntmDvalue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value12(Double value) {
        setCntmDvalue1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value13(Double value) {
        setCntmDvalue2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value14(Double value) {
        setCntmDvalue3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value15(Double value) {
        setCntmDvalue4(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value16(Double value) {
        setCntmEvalue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value17(Double value) {
        setCntmEvalue1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value18(Double value) {
        setCntmEvalue2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value19(Double value) {
        setCntmEvalue3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value20(Double value) {
        setCntmEvalue4(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord value21(Double value) {
        setCntmTransformation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMonthRecord values(Integer value1, Integer value2, Timestamp value3, Timestamp value4, Timestamp value5, Double value6, Double value7, Double value8, Double value9, Double value10, Double value11, Double value12, Double value13, Double value14, Double value15, Double value16, Double value17, Double value18, Double value19, Double value20, Double value21) {
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
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CntMonthRecord
     */
    public CntMonthRecord() {
        super(CntMonth.CNT_MONTH);
    }

    /**
     * Create a detached, initialised CntMonthRecord
     */
    public CntMonthRecord(Integer cntmId, Integer cntmCid, Timestamp cntmDate, Timestamp cntmSdate, Timestamp cntmEdate, Double cntmSvalue, Double cntmSvalue1, Double cntmSvalue2, Double cntmSvalue3, Double cntmSvalue4, Double cntmDvalue, Double cntmDvalue1, Double cntmDvalue2, Double cntmDvalue3, Double cntmDvalue4, Double cntmEvalue, Double cntmEvalue1, Double cntmEvalue2, Double cntmEvalue3, Double cntmEvalue4, Double cntmTransformation) {
        super(CntMonth.CNT_MONTH);

        set(0, cntmId);
        set(1, cntmCid);
        set(2, cntmDate);
        set(3, cntmSdate);
        set(4, cntmEdate);
        set(5, cntmSvalue);
        set(6, cntmSvalue1);
        set(7, cntmSvalue2);
        set(8, cntmSvalue3);
        set(9, cntmSvalue4);
        set(10, cntmDvalue);
        set(11, cntmDvalue1);
        set(12, cntmDvalue2);
        set(13, cntmDvalue3);
        set(14, cntmDvalue4);
        set(15, cntmEvalue);
        set(16, cntmEvalue1);
        set(17, cntmEvalue2);
        set(18, cntmEvalue3);
        set(19, cntmEvalue4);
        set(20, cntmTransformation);
    }
}
