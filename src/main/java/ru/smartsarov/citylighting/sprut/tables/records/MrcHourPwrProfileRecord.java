/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.MrcHourPwrProfile;


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
public class MrcHourPwrProfileRecord extends TableRecordImpl<MrcHourPwrProfileRecord> implements Record8<Integer, Timestamp, Integer, Integer, Double, Double, Double, Double> {

    private static final long serialVersionUID = 1106786873;

    /**
     * Setter for <code>MRC_HOUR_PWR_PROFILE.CNTMPL_ID</code>.
     */
    public void setCntmplId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>MRC_HOUR_PWR_PROFILE.CNTMPL_ID</code>.
     */
    public Integer getCntmplId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>MRC_HOUR_PWR_PROFILE.CNTMPL_DATE</code>.
     */
    public void setCntmplDate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>MRC_HOUR_PWR_PROFILE.CNTMPL_DATE</code>.
     */
    public Timestamp getCntmplDate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>MRC_HOUR_PWR_PROFILE.CNTMPL_ERR</code>.
     */
    public void setCntmplErr(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>MRC_HOUR_PWR_PROFILE.CNTMPL_ERR</code>.
     */
    public Integer getCntmplErr() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>MRC_HOUR_PWR_PROFILE.CNTMPL_T</code>.
     */
    public void setCntmplT(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>MRC_HOUR_PWR_PROFILE.CNTMPL_T</code>.
     */
    public Integer getCntmplT() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>MRC_HOUR_PWR_PROFILE.CNTMPL_PP</code>.
     */
    public void setCntmplPp(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>MRC_HOUR_PWR_PROFILE.CNTMPL_PP</code>.
     */
    public Double getCntmplPp() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>MRC_HOUR_PWR_PROFILE.CNTMPL_PM</code>.
     */
    public void setCntmplPm(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>MRC_HOUR_PWR_PROFILE.CNTMPL_PM</code>.
     */
    public Double getCntmplPm() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>MRC_HOUR_PWR_PROFILE.CNTMPL_QP</code>.
     */
    public void setCntmplQp(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>MRC_HOUR_PWR_PROFILE.CNTMPL_QP</code>.
     */
    public Double getCntmplQp() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>MRC_HOUR_PWR_PROFILE.CNTMPL_QM</code>.
     */
    public void setCntmplQm(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>MRC_HOUR_PWR_PROFILE.CNTMPL_QM</code>.
     */
    public Double getCntmplQm() {
        return (Double) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Timestamp, Integer, Integer, Double, Double, Double, Double> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Timestamp, Integer, Integer, Double, Double, Double, Double> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MrcHourPwrProfile.MRC_HOUR_PWR_PROFILE.CNTMPL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return MrcHourPwrProfile.MRC_HOUR_PWR_PROFILE.CNTMPL_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return MrcHourPwrProfile.MRC_HOUR_PWR_PROFILE.CNTMPL_ERR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return MrcHourPwrProfile.MRC_HOUR_PWR_PROFILE.CNTMPL_T;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return MrcHourPwrProfile.MRC_HOUR_PWR_PROFILE.CNTMPL_PP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return MrcHourPwrProfile.MRC_HOUR_PWR_PROFILE.CNTMPL_PM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return MrcHourPwrProfile.MRC_HOUR_PWR_PROFILE.CNTMPL_QP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return MrcHourPwrProfile.MRC_HOUR_PWR_PROFILE.CNTMPL_QM;
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
    public Timestamp component2() {
        return getCntmplDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCntmplErr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getCntmplT();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component5() {
        return getCntmplPp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component6() {
        return getCntmplPm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component7() {
        return getCntmplQp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component8() {
        return getCntmplQm();
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
    public Timestamp value2() {
        return getCntmplDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCntmplErr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getCntmplT();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getCntmplPp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getCntmplPm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getCntmplQp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getCntmplQm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MrcHourPwrProfileRecord value1(Integer value) {
        setCntmplId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MrcHourPwrProfileRecord value2(Timestamp value) {
        setCntmplDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MrcHourPwrProfileRecord value3(Integer value) {
        setCntmplErr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MrcHourPwrProfileRecord value4(Integer value) {
        setCntmplT(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MrcHourPwrProfileRecord value5(Double value) {
        setCntmplPp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MrcHourPwrProfileRecord value6(Double value) {
        setCntmplPm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MrcHourPwrProfileRecord value7(Double value) {
        setCntmplQp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MrcHourPwrProfileRecord value8(Double value) {
        setCntmplQm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MrcHourPwrProfileRecord values(Integer value1, Timestamp value2, Integer value3, Integer value4, Double value5, Double value6, Double value7, Double value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MrcHourPwrProfileRecord
     */
    public MrcHourPwrProfileRecord() {
        super(MrcHourPwrProfile.MRC_HOUR_PWR_PROFILE);
    }

    /**
     * Create a detached, initialised MrcHourPwrProfileRecord
     */
    public MrcHourPwrProfileRecord(Integer cntmplId, Timestamp cntmplDate, Integer cntmplErr, Integer cntmplT, Double cntmplPp, Double cntmplPm, Double cntmplQp, Double cntmplQm) {
        super(MrcHourPwrProfile.MRC_HOUR_PWR_PROFILE);

        set(0, cntmplId);
        set(1, cntmplDate);
        set(2, cntmplErr);
        set(3, cntmplT);
        set(4, cntmplPp);
        set(5, cntmplPm);
        set(6, cntmplQp);
        set(7, cntmplQm);
    }
}
