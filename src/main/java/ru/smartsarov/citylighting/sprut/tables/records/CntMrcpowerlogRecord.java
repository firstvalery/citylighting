/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.CntMrcpowerlog;


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
public class CntMrcpowerlogRecord extends UpdatableRecordImpl<CntMrcpowerlogRecord> implements Record11<Integer, Integer, Timestamp, Integer, Integer, Double, Double, Double, Double, Timestamp, Integer> {

    private static final long serialVersionUID = 670480961;

    /**
     * Setter for <code>CNT_MRCPOWERLOG.CNTMPL_ID</code>.
     */
    public void setCntmplId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>CNT_MRCPOWERLOG.CNTMPL_ID</code>.
     */
    public Integer getCntmplId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>CNT_MRCPOWERLOG.CNTMPL_CID</code>.
     */
    public void setCntmplCid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>CNT_MRCPOWERLOG.CNTMPL_CID</code>.
     */
    public Integer getCntmplCid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>CNT_MRCPOWERLOG.CNTMPL_DATE</code>.
     */
    public void setCntmplDate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>CNT_MRCPOWERLOG.CNTMPL_DATE</code>.
     */
    public Timestamp getCntmplDate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>CNT_MRCPOWERLOG.CNTMPL_ERR</code>.
     */
    public void setCntmplErr(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>CNT_MRCPOWERLOG.CNTMPL_ERR</code>.
     */
    public Integer getCntmplErr() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>CNT_MRCPOWERLOG.CNTMPL_T</code>.
     */
    public void setCntmplT(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>CNT_MRCPOWERLOG.CNTMPL_T</code>.
     */
    public Integer getCntmplT() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>CNT_MRCPOWERLOG.CNTMPL_PP</code>.
     */
    public void setCntmplPp(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>CNT_MRCPOWERLOG.CNTMPL_PP</code>.
     */
    public Double getCntmplPp() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>CNT_MRCPOWERLOG.CNTMPL_PM</code>.
     */
    public void setCntmplPm(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>CNT_MRCPOWERLOG.CNTMPL_PM</code>.
     */
    public Double getCntmplPm() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>CNT_MRCPOWERLOG.CNTMPL_QP</code>.
     */
    public void setCntmplQp(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>CNT_MRCPOWERLOG.CNTMPL_QP</code>.
     */
    public Double getCntmplQp() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>CNT_MRCPOWERLOG.CNTMPL_QM</code>.
     */
    public void setCntmplQm(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>CNT_MRCPOWERLOG.CNTMPL_QM</code>.
     */
    public Double getCntmplQm() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>CNT_MRCPOWERLOG.CNTMPL_SDATE</code>.
     */
    public void setCntmplSdate(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>CNT_MRCPOWERLOG.CNTMPL_SDATE</code>.
     */
    public Timestamp getCntmplSdate() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>CNT_MRCPOWERLOG.CNTMPL_MEM_IND</code>.
     */
    public void setCntmplMemInd(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>CNT_MRCPOWERLOG.CNTMPL_MEM_IND</code>.
     */
    public Integer getCntmplMemInd() {
        return (Integer) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, Timestamp, Integer, Integer, Double, Double, Double, Double, Timestamp, Integer> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, Timestamp, Integer, Integer, Double, Double, Double, Double, Timestamp, Integer> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CntMrcpowerlog.CNT_MRCPOWERLOG.CNTMPL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CntMrcpowerlog.CNT_MRCPOWERLOG.CNTMPL_CID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CntMrcpowerlog.CNT_MRCPOWERLOG.CNTMPL_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return CntMrcpowerlog.CNT_MRCPOWERLOG.CNTMPL_ERR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return CntMrcpowerlog.CNT_MRCPOWERLOG.CNTMPL_T;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return CntMrcpowerlog.CNT_MRCPOWERLOG.CNTMPL_PP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return CntMrcpowerlog.CNT_MRCPOWERLOG.CNTMPL_PM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return CntMrcpowerlog.CNT_MRCPOWERLOG.CNTMPL_QP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field9() {
        return CntMrcpowerlog.CNT_MRCPOWERLOG.CNTMPL_QM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return CntMrcpowerlog.CNT_MRCPOWERLOG.CNTMPL_SDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return CntMrcpowerlog.CNT_MRCPOWERLOG.CNTMPL_MEM_IND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCntmplId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCntmplCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getCntmplDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getCntmplErr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getCntmplT();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component6() {
        return getCntmplPp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component7() {
        return getCntmplPm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component8() {
        return getCntmplQp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component9() {
        return getCntmplQm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getCntmplSdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getCntmplMemInd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCntmplId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCntmplCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCntmplDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getCntmplErr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCntmplT();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getCntmplPp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getCntmplPm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getCntmplQp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value9() {
        return getCntmplQm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCntmplSdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getCntmplMemInd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcpowerlogRecord value1(Integer value) {
        setCntmplId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcpowerlogRecord value2(Integer value) {
        setCntmplCid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcpowerlogRecord value3(Timestamp value) {
        setCntmplDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcpowerlogRecord value4(Integer value) {
        setCntmplErr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcpowerlogRecord value5(Integer value) {
        setCntmplT(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcpowerlogRecord value6(Double value) {
        setCntmplPp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcpowerlogRecord value7(Double value) {
        setCntmplPm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcpowerlogRecord value8(Double value) {
        setCntmplQp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcpowerlogRecord value9(Double value) {
        setCntmplQm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcpowerlogRecord value10(Timestamp value) {
        setCntmplSdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcpowerlogRecord value11(Integer value) {
        setCntmplMemInd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcpowerlogRecord values(Integer value1, Integer value2, Timestamp value3, Integer value4, Integer value5, Double value6, Double value7, Double value8, Double value9, Timestamp value10, Integer value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CntMrcpowerlogRecord
     */
    public CntMrcpowerlogRecord() {
        super(CntMrcpowerlog.CNT_MRCPOWERLOG);
    }

    /**
     * Create a detached, initialised CntMrcpowerlogRecord
     */
    public CntMrcpowerlogRecord(Integer cntmplId, Integer cntmplCid, Timestamp cntmplDate, Integer cntmplErr, Integer cntmplT, Double cntmplPp, Double cntmplPm, Double cntmplQp, Double cntmplQm, Timestamp cntmplSdate, Integer cntmplMemInd) {
        super(CntMrcpowerlog.CNT_MRCPOWERLOG);

        set(0, cntmplId);
        set(1, cntmplCid);
        set(2, cntmplDate);
        set(3, cntmplErr);
        set(4, cntmplT);
        set(5, cntmplPp);
        set(6, cntmplPm);
        set(7, cntmplQp);
        set(8, cntmplQm);
        set(9, cntmplSdate);
        set(10, cntmplMemInd);
    }
}
