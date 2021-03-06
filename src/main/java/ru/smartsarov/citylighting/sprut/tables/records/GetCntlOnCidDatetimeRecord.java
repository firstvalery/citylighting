/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.GetCntlOnCidDatetime;


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
public class GetCntlOnCidDatetimeRecord extends TableRecordImpl<GetCntlOnCidDatetimeRecord> implements Record21<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double> {

    private static final long serialVersionUID = -699981422;

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_ID</code>.
     */
    public void setCntlId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_ID</code>.
     */
    public Integer getCntlId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_TYPE</code>.
     */
    public void setCntlType(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_TYPE</code>.
     */
    public Integer getCntlType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_STATE</code>.
     */
    public void setCntlState(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_STATE</code>.
     */
    public Integer getCntlState() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_CID</code>.
     */
    public void setCntlCid(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_CID</code>.
     */
    public Integer getCntlCid() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_PID</code>.
     */
    public void setCntlPid(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_PID</code>.
     */
    public Integer getCntlPid() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_AB_ID</code>.
     */
    public void setCntlAbId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_AB_ID</code>.
     */
    public Integer getCntlAbId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_UNK_ID</code>.
     */
    public void setCntlUnkId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_UNK_ID</code>.
     */
    public Integer getCntlUnkId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_ATYPE</code>.
     */
    public void setCntlAtype(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_ATYPE</code>.
     */
    public Integer getCntlAtype() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_BTYPE</code>.
     */
    public void setCntlBtype(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_BTYPE</code>.
     */
    public Integer getCntlBtype() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_DATE</code>.
     */
    public void setCntlDate(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_DATE</code>.
     */
    public Timestamp getCntlDate() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_SDATE</code>.
     */
    public void setCntlSdate(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_SDATE</code>.
     */
    public Timestamp getCntlSdate() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_VALUE1</code>.
     */
    public void setCntlValue1(Double value) {
        set(11, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_VALUE1</code>.
     */
    public Double getCntlValue1() {
        return (Double) get(11);
    }

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_VALUE2</code>.
     */
    public void setCntlValue2(Double value) {
        set(12, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_VALUE2</code>.
     */
    public Double getCntlValue2() {
        return (Double) get(12);
    }

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_VALUE3</code>.
     */
    public void setCntlValue3(Double value) {
        set(13, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_VALUE3</code>.
     */
    public Double getCntlValue3() {
        return (Double) get(13);
    }

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_VALUE4</code>.
     */
    public void setCntlValue4(Double value) {
        set(14, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_VALUE4</code>.
     */
    public Double getCntlValue4() {
        return (Double) get(14);
    }

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_VALUE5</code>.
     */
    public void setCntlValue5(Double value) {
        set(15, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_VALUE5</code>.
     */
    public Double getCntlValue5() {
        return (Double) get(15);
    }

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_VALUE6</code>.
     */
    public void setCntlValue6(Double value) {
        set(16, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_VALUE6</code>.
     */
    public Double getCntlValue6() {
        return (Double) get(16);
    }

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_VALUE7</code>.
     */
    public void setCntlValue7(Double value) {
        set(17, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_VALUE7</code>.
     */
    public Double getCntlValue7() {
        return (Double) get(17);
    }

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_VALUE8</code>.
     */
    public void setCntlValue8(Double value) {
        set(18, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_VALUE8</code>.
     */
    public Double getCntlValue8() {
        return (Double) get(18);
    }

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_VALUE9</code>.
     */
    public void setCntlValue9(Double value) {
        set(19, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_VALUE9</code>.
     */
    public Double getCntlValue9() {
        return (Double) get(19);
    }

    /**
     * Setter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_VALUE10</code>.
     */
    public void setCntlValue10(Double value) {
        set(20, value);
    }

    /**
     * Getter for <code>GET_CNTL_ON_CID_DATETIME.CNTL_VALUE10</code>.
     */
    public Double getCntlValue10() {
        return (Double) get(20);
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_CID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_AB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_UNK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_ATYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_BTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_SDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field12() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_VALUE1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field13() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_VALUE2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field14() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_VALUE3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field15() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_VALUE4;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field16() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_VALUE5;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field17() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_VALUE6;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field18() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_VALUE7;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field19() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_VALUE8;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field20() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_VALUE9;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field21() {
        return GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME.CNTL_VALUE10;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCntlId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCntlType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCntlState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getCntlCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getCntlPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getCntlAbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getCntlUnkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getCntlAtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getCntlBtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getCntlDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCntlSdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component12() {
        return getCntlValue1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component13() {
        return getCntlValue2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component14() {
        return getCntlValue3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component15() {
        return getCntlValue4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component16() {
        return getCntlValue5();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component17() {
        return getCntlValue6();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component18() {
        return getCntlValue7();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component19() {
        return getCntlValue8();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component20() {
        return getCntlValue9();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component21() {
        return getCntlValue10();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCntlId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCntlType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCntlState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getCntlCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCntlPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getCntlAbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getCntlUnkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getCntlAtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getCntlBtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCntlDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCntlSdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value12() {
        return getCntlValue1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value13() {
        return getCntlValue2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value14() {
        return getCntlValue3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value15() {
        return getCntlValue4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value16() {
        return getCntlValue5();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value17() {
        return getCntlValue6();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value18() {
        return getCntlValue7();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value19() {
        return getCntlValue8();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value20() {
        return getCntlValue9();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value21() {
        return getCntlValue10();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value1(Integer value) {
        setCntlId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value2(Integer value) {
        setCntlType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value3(Integer value) {
        setCntlState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value4(Integer value) {
        setCntlCid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value5(Integer value) {
        setCntlPid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value6(Integer value) {
        setCntlAbId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value7(Integer value) {
        setCntlUnkId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value8(Integer value) {
        setCntlAtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value9(Integer value) {
        setCntlBtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value10(Timestamp value) {
        setCntlDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value11(Timestamp value) {
        setCntlSdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value12(Double value) {
        setCntlValue1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value13(Double value) {
        setCntlValue2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value14(Double value) {
        setCntlValue3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value15(Double value) {
        setCntlValue4(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value16(Double value) {
        setCntlValue5(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value17(Double value) {
        setCntlValue6(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value18(Double value) {
        setCntlValue7(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value19(Double value) {
        setCntlValue8(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value20(Double value) {
        setCntlValue9(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord value21(Double value) {
        setCntlValue10(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetCntlOnCidDatetimeRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8, Integer value9, Timestamp value10, Timestamp value11, Double value12, Double value13, Double value14, Double value15, Double value16, Double value17, Double value18, Double value19, Double value20, Double value21) {
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
     * Create a detached GetCntlOnCidDatetimeRecord
     */
    public GetCntlOnCidDatetimeRecord() {
        super(GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME);
    }

    /**
     * Create a detached, initialised GetCntlOnCidDatetimeRecord
     */
    public GetCntlOnCidDatetimeRecord(Integer cntlId, Integer cntlType, Integer cntlState, Integer cntlCid, Integer cntlPid, Integer cntlAbId, Integer cntlUnkId, Integer cntlAtype, Integer cntlBtype, Timestamp cntlDate, Timestamp cntlSdate, Double cntlValue1, Double cntlValue2, Double cntlValue3, Double cntlValue4, Double cntlValue5, Double cntlValue6, Double cntlValue7, Double cntlValue8, Double cntlValue9, Double cntlValue10) {
        super(GetCntlOnCidDatetime.GET_CNTL_ON_CID_DATETIME);

        set(0, cntlId);
        set(1, cntlType);
        set(2, cntlState);
        set(3, cntlCid);
        set(4, cntlPid);
        set(5, cntlAbId);
        set(6, cntlUnkId);
        set(7, cntlAtype);
        set(8, cntlBtype);
        set(9, cntlDate);
        set(10, cntlSdate);
        set(11, cntlValue1);
        set(12, cntlValue2);
        set(13, cntlValue3);
        set(14, cntlValue4);
        set(15, cntlValue5);
        set(16, cntlValue6);
        set(17, cntlValue7);
        set(18, cntlValue8);
        set(19, cntlValue9);
        set(20, cntlValue10);
    }
}
