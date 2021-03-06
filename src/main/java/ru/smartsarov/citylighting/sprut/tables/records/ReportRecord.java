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

import ru.smartsarov.citylighting.sprut.tables.Report;


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
public class ReportRecord extends UpdatableRecordImpl<ReportRecord> implements Record7<Integer, Integer, String, Integer, String, byte[], Integer> {

    private static final long serialVersionUID = -901645085;

    /**
     * Setter for <code>REPORT.RPT_ID</code>.
     */
    public void setRptId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>REPORT.RPT_ID</code>.
     */
    public Integer getRptId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>REPORT.RPT_PARENT_ID</code>.
     */
    public void setRptParentId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>REPORT.RPT_PARENT_ID</code>.
     */
    public Integer getRptParentId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>REPORT.RPT_NAME</code>.
     */
    public void setRptName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>REPORT.RPT_NAME</code>.
     */
    public String getRptName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>REPORT.RPT_TYPE</code>.
     */
    public void setRptType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>REPORT.RPT_TYPE</code>.
     */
    public Integer getRptType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>REPORT.RPT_MEMO</code>.
     */
    public void setRptMemo(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>REPORT.RPT_MEMO</code>.
     */
    public String getRptMemo() {
        return (String) get(4);
    }

    /**
     * Setter for <code>REPORT.RPT_DATA</code>.
     */
    public void setRptData(byte... value) {
        set(5, value);
    }

    /**
     * Getter for <code>REPORT.RPT_DATA</code>.
     */
    public byte[] getRptData() {
        return (byte[]) get(5);
    }

    /**
     * Setter for <code>REPORT.RPT_RECUCLE</code>.
     */
    public void setRptRecucle(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>REPORT.RPT_RECUCLE</code>.
     */
    public Integer getRptRecucle() {
        return (Integer) get(6);
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
    public Row7<Integer, Integer, String, Integer, String, byte[], Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Integer, String, byte[], Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Report.REPORT.RPT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Report.REPORT.RPT_PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Report.REPORT.RPT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Report.REPORT.RPT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Report.REPORT.RPT_MEMO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field6() {
        return Report.REPORT.RPT_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Report.REPORT.RPT_RECUCLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getRptId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getRptParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getRptName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getRptType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getRptMemo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component6() {
        return getRptData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getRptRecucle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRptId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getRptParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRptName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getRptType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRptMemo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value6() {
        return getRptData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getRptRecucle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportRecord value1(Integer value) {
        setRptId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportRecord value2(Integer value) {
        setRptParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportRecord value3(String value) {
        setRptName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportRecord value4(Integer value) {
        setRptType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportRecord value5(String value) {
        setRptMemo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportRecord value6(byte... value) {
        setRptData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportRecord value7(Integer value) {
        setRptRecucle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportRecord values(Integer value1, Integer value2, String value3, Integer value4, String value5, byte[] value6, Integer value7) {
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
     * Create a detached ReportRecord
     */
    public ReportRecord() {
        super(Report.REPORT);
    }

    /**
     * Create a detached, initialised ReportRecord
     */
    public ReportRecord(Integer rptId, Integer rptParentId, String rptName, Integer rptType, String rptMemo, byte[] rptData, Integer rptRecucle) {
        super(Report.REPORT);

        set(0, rptId);
        set(1, rptParentId);
        set(2, rptName);
        set(3, rptType);
        set(4, rptMemo);
        set(5, rptData);
        set(6, rptRecucle);
    }
}
