/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.CntMrcenergylog;


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
public class CntMrcenergylogRecord extends UpdatableRecordImpl<CntMrcenergylogRecord> implements Record9<Integer, Integer, Integer, Timestamp, Double, Double, Double, Double, Timestamp> {

    private static final long serialVersionUID = 347977234;

    /**
     * Setter for <code>CNT_MRCENERGYLOG.CNTMEL_ID</code>.
     */
    public void setCntmelId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>CNT_MRCENERGYLOG.CNTMEL_ID</code>.
     */
    public Integer getCntmelId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>CNT_MRCENERGYLOG.CNTMEL_CID</code>.
     */
    public void setCntmelCid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>CNT_MRCENERGYLOG.CNTMEL_CID</code>.
     */
    public Integer getCntmelCid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>CNT_MRCENERGYLOG.CNTMEL_TARIFF</code>.
     */
    public void setCntmelTariff(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>CNT_MRCENERGYLOG.CNTMEL_TARIFF</code>.
     */
    public Integer getCntmelTariff() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>CNT_MRCENERGYLOG.CNTMEL_DATE</code>.
     */
    public void setCntmelDate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>CNT_MRCENERGYLOG.CNTMEL_DATE</code>.
     */
    public Timestamp getCntmelDate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>CNT_MRCENERGYLOG.CNTMEL_AP</code>.
     */
    public void setCntmelAp(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>CNT_MRCENERGYLOG.CNTMEL_AP</code>.
     */
    public Double getCntmelAp() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>CNT_MRCENERGYLOG.CNTMEL_AM</code>.
     */
    public void setCntmelAm(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>CNT_MRCENERGYLOG.CNTMEL_AM</code>.
     */
    public Double getCntmelAm() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>CNT_MRCENERGYLOG.CNTMEL_RP</code>.
     */
    public void setCntmelRp(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>CNT_MRCENERGYLOG.CNTMEL_RP</code>.
     */
    public Double getCntmelRp() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>CNT_MRCENERGYLOG.CNTMEL_RM</code>.
     */
    public void setCntmelRm(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>CNT_MRCENERGYLOG.CNTMEL_RM</code>.
     */
    public Double getCntmelRm() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>CNT_MRCENERGYLOG.CNTMEL_SDATE</code>.
     */
    public void setCntmelSdate(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>CNT_MRCENERGYLOG.CNTMEL_SDATE</code>.
     */
    public Timestamp getCntmelSdate() {
        return (Timestamp) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, Timestamp, Double, Double, Double, Double, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, Timestamp, Double, Double, Double, Double, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CntMrcenergylog.CNT_MRCENERGYLOG.CNTMEL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CntMrcenergylog.CNT_MRCENERGYLOG.CNTMEL_CID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CntMrcenergylog.CNT_MRCENERGYLOG.CNTMEL_TARIFF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return CntMrcenergylog.CNT_MRCENERGYLOG.CNTMEL_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return CntMrcenergylog.CNT_MRCENERGYLOG.CNTMEL_AP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return CntMrcenergylog.CNT_MRCENERGYLOG.CNTMEL_AM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return CntMrcenergylog.CNT_MRCENERGYLOG.CNTMEL_RP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return CntMrcenergylog.CNT_MRCENERGYLOG.CNTMEL_RM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return CntMrcenergylog.CNT_MRCENERGYLOG.CNTMEL_SDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCntmelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCntmelCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCntmelTariff();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getCntmelDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component5() {
        return getCntmelAp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component6() {
        return getCntmelAm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component7() {
        return getCntmelRp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component8() {
        return getCntmelRm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCntmelSdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCntmelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCntmelCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCntmelTariff();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCntmelDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getCntmelAp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getCntmelAm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getCntmelRp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getCntmelRm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCntmelSdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcenergylogRecord value1(Integer value) {
        setCntmelId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcenergylogRecord value2(Integer value) {
        setCntmelCid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcenergylogRecord value3(Integer value) {
        setCntmelTariff(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcenergylogRecord value4(Timestamp value) {
        setCntmelDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcenergylogRecord value5(Double value) {
        setCntmelAp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcenergylogRecord value6(Double value) {
        setCntmelAm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcenergylogRecord value7(Double value) {
        setCntmelRp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcenergylogRecord value8(Double value) {
        setCntmelRm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcenergylogRecord value9(Timestamp value) {
        setCntmelSdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntMrcenergylogRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4, Double value5, Double value6, Double value7, Double value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CntMrcenergylogRecord
     */
    public CntMrcenergylogRecord() {
        super(CntMrcenergylog.CNT_MRCENERGYLOG);
    }

    /**
     * Create a detached, initialised CntMrcenergylogRecord
     */
    public CntMrcenergylogRecord(Integer cntmelId, Integer cntmelCid, Integer cntmelTariff, Timestamp cntmelDate, Double cntmelAp, Double cntmelAm, Double cntmelRp, Double cntmelRm, Timestamp cntmelSdate) {
        super(CntMrcenergylog.CNT_MRCENERGYLOG);

        set(0, cntmelId);
        set(1, cntmelCid);
        set(2, cntmelTariff);
        set(3, cntmelDate);
        set(4, cntmelAp);
        set(5, cntmelAm);
        set(6, cntmelRp);
        set(7, cntmelRm);
        set(8, cntmelSdate);
    }
}
