/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.CntPkeTmpJoined;


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
public class CntPkeTmpJoinedRecord extends TableRecordImpl<CntPkeTmpJoinedRecord> implements Record13<Integer, Timestamp, Timestamp, Timestamp, Timestamp, Timestamp, Timestamp, Timestamp, Timestamp, Short, Short, Short, Short> {

    private static final long serialVersionUID = 1840745920;

    /**
     * Setter for <code>CNT_PKE_TMP_JOINED.PKE_RECNO</code>.
     */
    public void setPkeRecno(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>CNT_PKE_TMP_JOINED.PKE_RECNO</code>.
     */
    public Integer getPkeRecno() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>CNT_PKE_TMP_JOINED.PKE_IN1</code>.
     */
    public void setPkeIn1(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>CNT_PKE_TMP_JOINED.PKE_IN1</code>.
     */
    public Timestamp getPkeIn1() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>CNT_PKE_TMP_JOINED.PKE_OUT1</code>.
     */
    public void setPkeOut1(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>CNT_PKE_TMP_JOINED.PKE_OUT1</code>.
     */
    public Timestamp getPkeOut1() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>CNT_PKE_TMP_JOINED.PKE_IN2</code>.
     */
    public void setPkeIn2(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>CNT_PKE_TMP_JOINED.PKE_IN2</code>.
     */
    public Timestamp getPkeIn2() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>CNT_PKE_TMP_JOINED.PKE_OUT2</code>.
     */
    public void setPkeOut2(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>CNT_PKE_TMP_JOINED.PKE_OUT2</code>.
     */
    public Timestamp getPkeOut2() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>CNT_PKE_TMP_JOINED.PKE_IN3</code>.
     */
    public void setPkeIn3(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>CNT_PKE_TMP_JOINED.PKE_IN3</code>.
     */
    public Timestamp getPkeIn3() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>CNT_PKE_TMP_JOINED.PKE_OUT3</code>.
     */
    public void setPkeOut3(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>CNT_PKE_TMP_JOINED.PKE_OUT3</code>.
     */
    public Timestamp getPkeOut3() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>CNT_PKE_TMP_JOINED.PKE_IN4</code>.
     */
    public void setPkeIn4(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>CNT_PKE_TMP_JOINED.PKE_IN4</code>.
     */
    public Timestamp getPkeIn4() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>CNT_PKE_TMP_JOINED.PKE_OUT4</code>.
     */
    public void setPkeOut4(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>CNT_PKE_TMP_JOINED.PKE_OUT4</code>.
     */
    public Timestamp getPkeOut4() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>CNT_PKE_TMP_JOINED.PKE_INDEX1</code>.
     */
    public void setPkeIndex1(Short value) {
        set(9, value);
    }

    /**
     * Getter for <code>CNT_PKE_TMP_JOINED.PKE_INDEX1</code>.
     */
    public Short getPkeIndex1() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>CNT_PKE_TMP_JOINED.PKE_INDEX2</code>.
     */
    public void setPkeIndex2(Short value) {
        set(10, value);
    }

    /**
     * Getter for <code>CNT_PKE_TMP_JOINED.PKE_INDEX2</code>.
     */
    public Short getPkeIndex2() {
        return (Short) get(10);
    }

    /**
     * Setter for <code>CNT_PKE_TMP_JOINED.PKE_INDEX3</code>.
     */
    public void setPkeIndex3(Short value) {
        set(11, value);
    }

    /**
     * Getter for <code>CNT_PKE_TMP_JOINED.PKE_INDEX3</code>.
     */
    public Short getPkeIndex3() {
        return (Short) get(11);
    }

    /**
     * Setter for <code>CNT_PKE_TMP_JOINED.PKE_INDEX4</code>.
     */
    public void setPkeIndex4(Short value) {
        set(12, value);
    }

    /**
     * Getter for <code>CNT_PKE_TMP_JOINED.PKE_INDEX4</code>.
     */
    public Short getPkeIndex4() {
        return (Short) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, Timestamp, Timestamp, Timestamp, Timestamp, Timestamp, Timestamp, Timestamp, Timestamp, Short, Short, Short, Short> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, Timestamp, Timestamp, Timestamp, Timestamp, Timestamp, Timestamp, Timestamp, Timestamp, Short, Short, Short, Short> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CntPkeTmpJoined.CNT_PKE_TMP_JOINED.PKE_RECNO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return CntPkeTmpJoined.CNT_PKE_TMP_JOINED.PKE_IN1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CntPkeTmpJoined.CNT_PKE_TMP_JOINED.PKE_OUT1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return CntPkeTmpJoined.CNT_PKE_TMP_JOINED.PKE_IN2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return CntPkeTmpJoined.CNT_PKE_TMP_JOINED.PKE_OUT2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return CntPkeTmpJoined.CNT_PKE_TMP_JOINED.PKE_IN3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return CntPkeTmpJoined.CNT_PKE_TMP_JOINED.PKE_OUT3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return CntPkeTmpJoined.CNT_PKE_TMP_JOINED.PKE_IN4;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return CntPkeTmpJoined.CNT_PKE_TMP_JOINED.PKE_OUT4;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field10() {
        return CntPkeTmpJoined.CNT_PKE_TMP_JOINED.PKE_INDEX1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field11() {
        return CntPkeTmpJoined.CNT_PKE_TMP_JOINED.PKE_INDEX2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field12() {
        return CntPkeTmpJoined.CNT_PKE_TMP_JOINED.PKE_INDEX3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field13() {
        return CntPkeTmpJoined.CNT_PKE_TMP_JOINED.PKE_INDEX4;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getPkeRecno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getPkeIn1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getPkeOut1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getPkeIn2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getPkeOut2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getPkeIn3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getPkeOut3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getPkeIn4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getPkeOut4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component10() {
        return getPkeIndex1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component11() {
        return getPkeIndex2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component12() {
        return getPkeIndex3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component13() {
        return getPkeIndex4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPkeRecno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getPkeIn1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getPkeOut1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getPkeIn2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getPkeOut2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getPkeIn3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getPkeOut3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getPkeIn4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getPkeOut4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value10() {
        return getPkeIndex1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value11() {
        return getPkeIndex2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value12() {
        return getPkeIndex3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value13() {
        return getPkeIndex4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeTmpJoinedRecord value1(Integer value) {
        setPkeRecno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeTmpJoinedRecord value2(Timestamp value) {
        setPkeIn1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeTmpJoinedRecord value3(Timestamp value) {
        setPkeOut1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeTmpJoinedRecord value4(Timestamp value) {
        setPkeIn2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeTmpJoinedRecord value5(Timestamp value) {
        setPkeOut2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeTmpJoinedRecord value6(Timestamp value) {
        setPkeIn3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeTmpJoinedRecord value7(Timestamp value) {
        setPkeOut3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeTmpJoinedRecord value8(Timestamp value) {
        setPkeIn4(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeTmpJoinedRecord value9(Timestamp value) {
        setPkeOut4(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeTmpJoinedRecord value10(Short value) {
        setPkeIndex1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeTmpJoinedRecord value11(Short value) {
        setPkeIndex2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeTmpJoinedRecord value12(Short value) {
        setPkeIndex3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeTmpJoinedRecord value13(Short value) {
        setPkeIndex4(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntPkeTmpJoinedRecord values(Integer value1, Timestamp value2, Timestamp value3, Timestamp value4, Timestamp value5, Timestamp value6, Timestamp value7, Timestamp value8, Timestamp value9, Short value10, Short value11, Short value12, Short value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CntPkeTmpJoinedRecord
     */
    public CntPkeTmpJoinedRecord() {
        super(CntPkeTmpJoined.CNT_PKE_TMP_JOINED);
    }

    /**
     * Create a detached, initialised CntPkeTmpJoinedRecord
     */
    public CntPkeTmpJoinedRecord(Integer pkeRecno, Timestamp pkeIn1, Timestamp pkeOut1, Timestamp pkeIn2, Timestamp pkeOut2, Timestamp pkeIn3, Timestamp pkeOut3, Timestamp pkeIn4, Timestamp pkeOut4, Short pkeIndex1, Short pkeIndex2, Short pkeIndex3, Short pkeIndex4) {
        super(CntPkeTmpJoined.CNT_PKE_TMP_JOINED);

        set(0, pkeRecno);
        set(1, pkeIn1);
        set(2, pkeOut1);
        set(3, pkeIn2);
        set(4, pkeOut2);
        set(5, pkeIn3);
        set(6, pkeOut3);
        set(7, pkeIn4);
        set(8, pkeOut4);
        set(9, pkeIndex1);
        set(10, pkeIndex2);
        set(11, pkeIndex3);
        set(12, pkeIndex4);
    }
}
