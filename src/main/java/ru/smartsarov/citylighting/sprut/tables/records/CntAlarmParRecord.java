/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.CntAlarmPar;


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
public class CntAlarmParRecord extends UpdatableRecordImpl<CntAlarmParRecord> implements Record6<Integer, String, String, String, String, String> {

    private static final long serialVersionUID = 1154643382;

    /**
     * Setter for <code>CNT_ALARM_PAR.CNTAP_ID</code>.
     */
    public void setCntapId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>CNT_ALARM_PAR.CNTAP_ID</code>.
     */
    public Integer getCntapId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>CNT_ALARM_PAR.CNTAP_NAME</code>.
     */
    public void setCntapName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>CNT_ALARM_PAR.CNTAP_NAME</code>.
     */
    public String getCntapName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>CNT_ALARM_PAR.CNTAP_SNAME</code>.
     */
    public void setCntapSname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>CNT_ALARM_PAR.CNTAP_SNAME</code>.
     */
    public String getCntapSname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>CNT_ALARM_PAR.CNTAP_SDIM</code>.
     */
    public void setCntapSdim(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>CNT_ALARM_PAR.CNTAP_SDIM</code>.
     */
    public String getCntapSdim() {
        return (String) get(3);
    }

    /**
     * Setter for <code>CNT_ALARM_PAR.CNTAP_DIM</code>.
     */
    public void setCntapDim(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>CNT_ALARM_PAR.CNTAP_DIM</code>.
     */
    public String getCntapDim() {
        return (String) get(4);
    }

    /**
     * Setter for <code>CNT_ALARM_PAR.CNTAP_AMSG</code>.
     */
    public void setCntapAmsg(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>CNT_ALARM_PAR.CNTAP_AMSG</code>.
     */
    public String getCntapAmsg() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CntAlarmPar.CNT_ALARM_PAR.CNTAP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CntAlarmPar.CNT_ALARM_PAR.CNTAP_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CntAlarmPar.CNT_ALARM_PAR.CNTAP_SNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CntAlarmPar.CNT_ALARM_PAR.CNTAP_SDIM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CntAlarmPar.CNT_ALARM_PAR.CNTAP_DIM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CntAlarmPar.CNT_ALARM_PAR.CNTAP_AMSG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCntapId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCntapName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCntapSname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCntapSdim();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCntapDim();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCntapAmsg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCntapId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCntapName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCntapSname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCntapSdim();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCntapDim();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCntapAmsg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntAlarmParRecord value1(Integer value) {
        setCntapId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntAlarmParRecord value2(String value) {
        setCntapName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntAlarmParRecord value3(String value) {
        setCntapSname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntAlarmParRecord value4(String value) {
        setCntapSdim(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntAlarmParRecord value5(String value) {
        setCntapDim(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntAlarmParRecord value6(String value) {
        setCntapAmsg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntAlarmParRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CntAlarmParRecord
     */
    public CntAlarmParRecord() {
        super(CntAlarmPar.CNT_ALARM_PAR);
    }

    /**
     * Create a detached, initialised CntAlarmParRecord
     */
    public CntAlarmParRecord(Integer cntapId, String cntapName, String cntapSname, String cntapSdim, String cntapDim, String cntapAmsg) {
        super(CntAlarmPar.CNT_ALARM_PAR);

        set(0, cntapId);
        set(1, cntapName);
        set(2, cntapSname);
        set(3, cntapSdim);
        set(4, cntapDim);
        set(5, cntapAmsg);
    }
}