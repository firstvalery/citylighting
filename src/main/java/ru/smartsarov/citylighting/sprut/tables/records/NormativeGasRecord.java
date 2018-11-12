/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.NormativeGas;


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
public class NormativeGasRecord extends UpdatableRecordImpl<NormativeGasRecord> implements Record8<Integer, Integer, Short, Short, Short, Short, Double, Double> {

    private static final long serialVersionUID = 1064701841;

    /**
     * Setter for <code>NORMATIVE_GAS.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>NORMATIVE_GAS.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>NORMATIVE_GAS.NORM_ID</code>.
     */
    public void setNormId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>NORMATIVE_GAS.NORM_ID</code>.
     */
    public Integer getNormId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>NORMATIVE_GAS.TYPE1</code>.
     */
    public void setType1(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>NORMATIVE_GAS.TYPE1</code>.
     */
    public Short getType1() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>NORMATIVE_GAS.TYPE2</code>.
     */
    public void setType2(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>NORMATIVE_GAS.TYPE2</code>.
     */
    public Short getType2() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>NORMATIVE_GAS.TYPE3</code>.
     */
    public void setType3(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>NORMATIVE_GAS.TYPE3</code>.
     */
    public Short getType3() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>NORMATIVE_GAS.TYPE4</code>.
     */
    public void setType4(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>NORMATIVE_GAS.TYPE4</code>.
     */
    public Short getType4() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>NORMATIVE_GAS.V1</code>.
     */
    public void setV1(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>NORMATIVE_GAS.V1</code>.
     */
    public Double getV1() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>NORMATIVE_GAS.GV1</code>.
     */
    public void setGv1(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>NORMATIVE_GAS.GV1</code>.
     */
    public Double getGv1() {
        return (Double) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Short, Short, Short, Short, Double, Double> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Short, Short, Short, Short, Double, Double> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return NormativeGas.NORMATIVE_GAS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return NormativeGas.NORMATIVE_GAS.NORM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return NormativeGas.NORMATIVE_GAS.TYPE1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return NormativeGas.NORMATIVE_GAS.TYPE2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return NormativeGas.NORMATIVE_GAS.TYPE3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return NormativeGas.NORMATIVE_GAS.TYPE4;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return NormativeGas.NORMATIVE_GAS.V1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return NormativeGas.NORMATIVE_GAS.GV1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getNormId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getType1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getType2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getType3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getType4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component7() {
        return getV1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component8() {
        return getGv1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getNormId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getType1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getType2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getType3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getType4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getV1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getGv1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NormativeGasRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NormativeGasRecord value2(Integer value) {
        setNormId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NormativeGasRecord value3(Short value) {
        setType1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NormativeGasRecord value4(Short value) {
        setType2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NormativeGasRecord value5(Short value) {
        setType3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NormativeGasRecord value6(Short value) {
        setType4(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NormativeGasRecord value7(Double value) {
        setV1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NormativeGasRecord value8(Double value) {
        setGv1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NormativeGasRecord values(Integer value1, Integer value2, Short value3, Short value4, Short value5, Short value6, Double value7, Double value8) {
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
     * Create a detached NormativeGasRecord
     */
    public NormativeGasRecord() {
        super(NormativeGas.NORMATIVE_GAS);
    }

    /**
     * Create a detached, initialised NormativeGasRecord
     */
    public NormativeGasRecord(Integer id, Integer normId, Short type1, Short type2, Short type3, Short type4, Double v1, Double gv1) {
        super(NormativeGas.NORMATIVE_GAS);

        set(0, id);
        set(1, normId);
        set(2, type1);
        set(3, type2);
        set(4, type3);
        set(5, type4);
        set(6, v1);
        set(7, gv1);
    }
}