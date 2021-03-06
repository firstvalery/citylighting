/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.ReportStruct;


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
public class ReportStructRecord extends UpdatableRecordImpl<ReportStructRecord> implements Record9<Integer, Integer, Integer, Integer, String, Integer, Integer, Integer, Short> {

    private static final long serialVersionUID = 560856595;

    /**
     * Setter for <code>REPORT_STRUCT.STRUCT_ID</code>.
     */
    public void setStructId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>REPORT_STRUCT.STRUCT_ID</code>.
     */
    public Integer getStructId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>REPORT_STRUCT.STRUCT_PARENT_ID</code>.
     */
    public void setStructParentId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>REPORT_STRUCT.STRUCT_PARENT_ID</code>.
     */
    public Integer getStructParentId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>REPORT_STRUCT.STRUCT_VER</code>.
     */
    public void setStructVer(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>REPORT_STRUCT.STRUCT_VER</code>.
     */
    public Integer getStructVer() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>REPORT_STRUCT.STRUCT_TYPE</code>.
     */
    public void setStructType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>REPORT_STRUCT.STRUCT_TYPE</code>.
     */
    public Integer getStructType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>REPORT_STRUCT.STRUCT_NAME</code>.
     */
    public void setStructName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>REPORT_STRUCT.STRUCT_NAME</code>.
     */
    public String getStructName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>REPORT_STRUCT.REPORT_DATA_ID</code>.
     */
    public void setReportDataId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>REPORT_STRUCT.REPORT_DATA_ID</code>.
     */
    public Integer getReportDataId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>REPORT_STRUCT.AB_ID</code>.
     */
    public void setAbId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>REPORT_STRUCT.AB_ID</code>.
     */
    public Integer getAbId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>REPORT_STRUCT.ACCESS_TYPE</code>.
     */
    public void setAccessType(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>REPORT_STRUCT.ACCESS_TYPE</code>.
     */
    public Integer getAccessType() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>REPORT_STRUCT.PROGTECH</code>.
     */
    public void setProgtech(Short value) {
        set(8, value);
    }

    /**
     * Getter for <code>REPORT_STRUCT.PROGTECH</code>.
     */
    public Short getProgtech() {
        return (Short) get(8);
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
    public Row9<Integer, Integer, Integer, Integer, String, Integer, Integer, Integer, Short> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, Integer, String, Integer, Integer, Integer, Short> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReportStruct.REPORT_STRUCT.STRUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReportStruct.REPORT_STRUCT.STRUCT_PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ReportStruct.REPORT_STRUCT.STRUCT_VER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ReportStruct.REPORT_STRUCT.STRUCT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ReportStruct.REPORT_STRUCT.STRUCT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ReportStruct.REPORT_STRUCT.REPORT_DATA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ReportStruct.REPORT_STRUCT.AB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ReportStruct.REPORT_STRUCT.ACCESS_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field9() {
        return ReportStruct.REPORT_STRUCT.PROGTECH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getStructId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getStructParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getStructVer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getStructType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getStructName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getReportDataId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getAbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getAccessType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component9() {
        return getProgtech();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getStructId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getStructParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getStructVer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getStructType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getStructName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getReportDataId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getAbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getAccessType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value9() {
        return getProgtech();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportStructRecord value1(Integer value) {
        setStructId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportStructRecord value2(Integer value) {
        setStructParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportStructRecord value3(Integer value) {
        setStructVer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportStructRecord value4(Integer value) {
        setStructType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportStructRecord value5(String value) {
        setStructName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportStructRecord value6(Integer value) {
        setReportDataId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportStructRecord value7(Integer value) {
        setAbId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportStructRecord value8(Integer value) {
        setAccessType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportStructRecord value9(Short value) {
        setProgtech(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportStructRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, Integer value6, Integer value7, Integer value8, Short value9) {
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
     * Create a detached ReportStructRecord
     */
    public ReportStructRecord() {
        super(ReportStruct.REPORT_STRUCT);
    }

    /**
     * Create a detached, initialised ReportStructRecord
     */
    public ReportStructRecord(Integer structId, Integer structParentId, Integer structVer, Integer structType, String structName, Integer reportDataId, Integer abId, Integer accessType, Short progtech) {
        super(ReportStruct.REPORT_STRUCT);

        set(0, structId);
        set(1, structParentId);
        set(2, structVer);
        set(3, structType);
        set(4, structName);
        set(5, reportDataId);
        set(6, abId);
        set(7, accessType);
        set(8, progtech);
    }
}
