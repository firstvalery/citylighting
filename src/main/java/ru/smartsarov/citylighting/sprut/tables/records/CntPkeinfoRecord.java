/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.CntPkeinfo;


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
public class CntPkeinfoRecord extends UpdatableRecordImpl<CntPkeinfoRecord> implements Record9<Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = 2124367781;

    /**
     * Setter for <code>CNT_PKEINFO.PKE_CID</code>.
     */
    public void setPkeCid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>CNT_PKEINFO.PKE_CID</code>.
     */
    public Integer getPkeCid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>CNT_PKEINFO.PKE_V_MIN_CRIT</code>.
     */
    public void setPkeVMinCrit(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>CNT_PKEINFO.PKE_V_MIN_CRIT</code>.
     */
    public BigDecimal getPkeVMinCrit() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>CNT_PKEINFO.PKE_V_MIN</code>.
     */
    public void setPkeVMin(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>CNT_PKEINFO.PKE_V_MIN</code>.
     */
    public BigDecimal getPkeVMin() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>CNT_PKEINFO.PKE_V_MAX</code>.
     */
    public void setPkeVMax(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>CNT_PKEINFO.PKE_V_MAX</code>.
     */
    public BigDecimal getPkeVMax() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>CNT_PKEINFO.PKE_V_MAX_CRIT</code>.
     */
    public void setPkeVMaxCrit(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>CNT_PKEINFO.PKE_V_MAX_CRIT</code>.
     */
    public BigDecimal getPkeVMaxCrit() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>CNT_PKEINFO.PKE_F_MIN_CRIT</code>.
     */
    public void setPkeFMinCrit(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>CNT_PKEINFO.PKE_F_MIN_CRIT</code>.
     */
    public BigDecimal getPkeFMinCrit() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>CNT_PKEINFO.PKE_F_MIN</code>.
     */
    public void setPkeFMin(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>CNT_PKEINFO.PKE_F_MIN</code>.
     */
    public BigDecimal getPkeFMin() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>CNT_PKEINFO.PKE_F_MAX</code>.
     */
    public void setPkeFMax(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>CNT_PKEINFO.PKE_F_MAX</code>.
     */
    public BigDecimal getPkeFMax() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>CNT_PKEINFO.PKE_F_MAX_CRIT</code>.
     */
    public void setPkeFMaxCrit(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>CNT_PKEINFO.PKE_F_MAX_CRIT</code>.
     */
    public BigDecimal getPkeFMaxCrit() {
        return (BigDecimal) get(8);
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
    public Row9<Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CntPkeinfo.CNT_PKEINFO.PKE_CID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return CntPkeinfo.CNT_PKEINFO.PKE_V_MIN_CRIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return CntPkeinfo.CNT_PKEINFO.PKE_V_MIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return CntPkeinfo.CNT_PKEINFO.PKE_V_MAX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return CntPkeinfo.CNT_PKEINFO.PKE_V_MAX_CRIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return CntPkeinfo.CNT_PKEINFO.PKE_F_MIN_CRIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return CntPkeinfo.CNT_PKEINFO.PKE_F_MIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return CntPkeinfo.CNT_PKEINFO.PKE_F_MAX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return CntPkeinfo.CNT_PKEINFO.PKE_F_MAX_CRIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getPkeCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component2() {
        return getPkeVMinCrit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getPkeVMin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getPkeVMax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getPkeVMaxCrit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getPkeFMinCrit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getPkeFMin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getPkeFMax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getPkeFMaxCrit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPkeCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value2() {
        return getPkeVMinCrit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getPkeVMin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getPkeVMax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getPkeVMaxCrit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getPkeFMinCrit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getPkeFMin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getPkeFMax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getPkeFMaxCrit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeinfoRecord value1(Integer value) {
        setPkeCid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeinfoRecord value2(BigDecimal value) {
        setPkeVMinCrit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeinfoRecord value3(BigDecimal value) {
        setPkeVMin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeinfoRecord value4(BigDecimal value) {
        setPkeVMax(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeinfoRecord value5(BigDecimal value) {
        setPkeVMaxCrit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeinfoRecord value6(BigDecimal value) {
        setPkeFMinCrit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeinfoRecord value7(BigDecimal value) {
        setPkeFMin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeinfoRecord value8(BigDecimal value) {
        setPkeFMax(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeinfoRecord value9(BigDecimal value) {
        setPkeFMaxCrit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeinfoRecord values(Integer value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, BigDecimal value5, BigDecimal value6, BigDecimal value7, BigDecimal value8, BigDecimal value9) {
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
     * Create a detached CntPkeinfoRecord
     */
    public CntPkeinfoRecord() {
        super(CntPkeinfo.CNT_PKEINFO);
    }

    /**
     * Create a detached, initialised CntPkeinfoRecord
     */
    public CntPkeinfoRecord(Integer pkeCid, BigDecimal pkeVMinCrit, BigDecimal pkeVMin, BigDecimal pkeVMax, BigDecimal pkeVMaxCrit, BigDecimal pkeFMinCrit, BigDecimal pkeFMin, BigDecimal pkeFMax, BigDecimal pkeFMaxCrit) {
        super(CntPkeinfo.CNT_PKEINFO);

        set(0, pkeCid);
        set(1, pkeVMinCrit);
        set(2, pkeVMin);
        set(3, pkeVMax);
        set(4, pkeVMaxCrit);
        set(5, pkeFMinCrit);
        set(6, pkeFMin);
        set(7, pkeFMax);
        set(8, pkeFMaxCrit);
    }
}
