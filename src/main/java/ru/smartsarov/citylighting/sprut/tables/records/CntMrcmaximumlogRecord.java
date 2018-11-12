/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.CntMrcmaximumlog;


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
public class CntMrcmaximumlogRecord extends UpdatableRecordImpl<CntMrcmaximumlogRecord> implements Record12<Integer, Integer, Timestamp, Double, Double, Double, Double, Double, Double, Double, Double, Timestamp> {

    private static final long serialVersionUID = 101507165;

    /**
     * Setter for <code>CNT_MRCMAXIMUMLOG.CNTMML_ID</code>.
     */
    public void setCntmmlId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>CNT_MRCMAXIMUMLOG.CNTMML_ID</code>.
     */
    public Integer getCntmmlId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>CNT_MRCMAXIMUMLOG.CNTMML_CID</code>.
     */
    public void setCntmmlCid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>CNT_MRCMAXIMUMLOG.CNTMML_CID</code>.
     */
    public Integer getCntmmlCid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>CNT_MRCMAXIMUMLOG.CNTMML_DATE</code>.
     */
    public void setCntmmlDate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>CNT_MRCMAXIMUMLOG.CNTMML_DATE</code>.
     */
    public Timestamp getCntmmlDate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>CNT_MRCMAXIMUMLOG.CNTMML_APM</code>.
     */
    public void setCntmmlApm(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>CNT_MRCMAXIMUMLOG.CNTMML_APM</code>.
     */
    public Double getCntmmlApm() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>CNT_MRCMAXIMUMLOG.CNTMML_APE</code>.
     */
    public void setCntmmlApe(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>CNT_MRCMAXIMUMLOG.CNTMML_APE</code>.
     */
    public Double getCntmmlApe() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>CNT_MRCMAXIMUMLOG.CNTMML_AMM</code>.
     */
    public void setCntmmlAmm(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>CNT_MRCMAXIMUMLOG.CNTMML_AMM</code>.
     */
    public Double getCntmmlAmm() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>CNT_MRCMAXIMUMLOG.CNTMML_AME</code>.
     */
    public void setCntmmlAme(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>CNT_MRCMAXIMUMLOG.CNTMML_AME</code>.
     */
    public Double getCntmmlAme() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>CNT_MRCMAXIMUMLOG.CNTMML_RPM</code>.
     */
    public void setCntmmlRpm(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>CNT_MRCMAXIMUMLOG.CNTMML_RPM</code>.
     */
    public Double getCntmmlRpm() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>CNT_MRCMAXIMUMLOG.CNTMML_RPE</code>.
     */
    public void setCntmmlRpe(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>CNT_MRCMAXIMUMLOG.CNTMML_RPE</code>.
     */
    public Double getCntmmlRpe() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>CNT_MRCMAXIMUMLOG.CNTMML_RMM</code>.
     */
    public void setCntmmlRmm(Double value) {
        set(9, value);
    }

    /**
     * Getter for <code>CNT_MRCMAXIMUMLOG.CNTMML_RMM</code>.
     */
    public Double getCntmmlRmm() {
        return (Double) get(9);
    }

    /**
     * Setter for <code>CNT_MRCMAXIMUMLOG.CNTMML_RME</code>.
     */
    public void setCntmmlRme(Double value) {
        set(10, value);
    }

    /**
     * Getter for <code>CNT_MRCMAXIMUMLOG.CNTMML_RME</code>.
     */
    public Double getCntmmlRme() {
        return (Double) get(10);
    }

    /**
     * Setter for <code>CNT_MRCMAXIMUMLOG.CNTMML_SDATE</code>.
     */
    public void setCntmmlSdate(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>CNT_MRCMAXIMUMLOG.CNTMML_SDATE</code>.
     */
    public Timestamp getCntmmlSdate() {
        return (Timestamp) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, Timestamp, Double, Double, Double, Double, Double, Double, Double, Double, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, Timestamp, Double, Double, Double, Double, Double, Double, Double, Double, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CntMrcmaximumlog.CNT_MRCMAXIMUMLOG.CNTMML_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CntMrcmaximumlog.CNT_MRCMAXIMUMLOG.CNTMML_CID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CntMrcmaximumlog.CNT_MRCMAXIMUMLOG.CNTMML_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return CntMrcmaximumlog.CNT_MRCMAXIMUMLOG.CNTMML_APM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return CntMrcmaximumlog.CNT_MRCMAXIMUMLOG.CNTMML_APE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return CntMrcmaximumlog.CNT_MRCMAXIMUMLOG.CNTMML_AMM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return CntMrcmaximumlog.CNT_MRCMAXIMUMLOG.CNTMML_AME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return CntMrcmaximumlog.CNT_MRCMAXIMUMLOG.CNTMML_RPM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field9() {
        return CntMrcmaximumlog.CNT_MRCMAXIMUMLOG.CNTMML_RPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field10() {
        return CntMrcmaximumlog.CNT_MRCMAXIMUMLOG.CNTMML_RMM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field11() {
        return CntMrcmaximumlog.CNT_MRCMAXIMUMLOG.CNTMML_RME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return CntMrcmaximumlog.CNT_MRCMAXIMUMLOG.CNTMML_SDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCntmmlId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCntmmlCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getCntmmlDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getCntmmlApm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component5() {
        return getCntmmlApe();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component6() {
        return getCntmmlAmm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component7() {
        return getCntmmlAme();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component8() {
        return getCntmmlRpm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component9() {
        return getCntmmlRpe();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component10() {
        return getCntmmlRmm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component11() {
        return getCntmmlRme();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getCntmmlSdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCntmmlId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCntmmlCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCntmmlDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getCntmmlApm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getCntmmlApe();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getCntmmlAmm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getCntmmlAme();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getCntmmlRpm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value9() {
        return getCntmmlRpe();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value10() {
        return getCntmmlRmm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value11() {
        return getCntmmlRme();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getCntmmlSdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcmaximumlogRecord value1(Integer value) {
        setCntmmlId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcmaximumlogRecord value2(Integer value) {
        setCntmmlCid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcmaximumlogRecord value3(Timestamp value) {
        setCntmmlDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcmaximumlogRecord value4(Double value) {
        setCntmmlApm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcmaximumlogRecord value5(Double value) {
        setCntmmlApe(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcmaximumlogRecord value6(Double value) {
        setCntmmlAmm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcmaximumlogRecord value7(Double value) {
        setCntmmlAme(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcmaximumlogRecord value8(Double value) {
        setCntmmlRpm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcmaximumlogRecord value9(Double value) {
        setCntmmlRpe(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcmaximumlogRecord value10(Double value) {
        setCntmmlRmm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcmaximumlogRecord value11(Double value) {
        setCntmmlRme(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcmaximumlogRecord value12(Timestamp value) {
        setCntmmlSdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcmaximumlogRecord values(Integer value1, Integer value2, Timestamp value3, Double value4, Double value5, Double value6, Double value7, Double value8, Double value9, Double value10, Double value11, Timestamp value12) {
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
     * Create a detached CntMrcmaximumlogRecord
     */
    public CntMrcmaximumlogRecord() {
        super(CntMrcmaximumlog.CNT_MRCMAXIMUMLOG);
    }

    /**
     * Create a detached, initialised CntMrcmaximumlogRecord
     */
    public CntMrcmaximumlogRecord(Integer cntmmlId, Integer cntmmlCid, Timestamp cntmmlDate, Double cntmmlApm, Double cntmmlApe, Double cntmmlAmm, Double cntmmlAme, Double cntmmlRpm, Double cntmmlRpe, Double cntmmlRmm, Double cntmmlRme, Timestamp cntmmlSdate) {
        super(CntMrcmaximumlog.CNT_MRCMAXIMUMLOG);

        set(0, cntmmlId);
        set(1, cntmmlCid);
        set(2, cntmmlDate);
        set(3, cntmmlApm);
        set(4, cntmmlApe);
        set(5, cntmmlAmm);
        set(6, cntmmlAme);
        set(7, cntmmlRpm);
        set(8, cntmmlRpe);
        set(9, cntmmlRmm);
        set(10, cntmmlRme);
        set(11, cntmmlSdate);
    }
}