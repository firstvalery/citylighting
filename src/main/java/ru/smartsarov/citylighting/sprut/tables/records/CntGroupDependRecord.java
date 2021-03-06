/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.CntGroupDepend;


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
public class CntGroupDependRecord extends UpdatableRecordImpl<CntGroupDependRecord> implements Record4<Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = -771180836;

    /**
     * Setter for <code>CNT_GROUP_DEPEND.GROUP_ID</code>.
     */
    public void setGroupId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>CNT_GROUP_DEPEND.GROUP_ID</code>.
     */
    public Integer getGroupId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>CNT_GROUP_DEPEND.ELEMENT_ID</code>.
     */
    public void setElementId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>CNT_GROUP_DEPEND.ELEMENT_ID</code>.
     */
    public Integer getElementId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>CNT_GROUP_DEPEND.ELEMENT_TYPE</code>.
     */
    public void setElementType(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>CNT_GROUP_DEPEND.ELEMENT_TYPE</code>.
     */
    public Integer getElementType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>CNT_GROUP_DEPEND.BALANCE_TYPE</code>.
     */
    public void setBalanceType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>CNT_GROUP_DEPEND.BALANCE_TYPE</code>.
     */
    public Integer getBalanceType() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<Integer, Integer, Integer> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CntGroupDepend.CNT_GROUP_DEPEND.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CntGroupDepend.CNT_GROUP_DEPEND.ELEMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CntGroupDepend.CNT_GROUP_DEPEND.ELEMENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return CntGroupDepend.CNT_GROUP_DEPEND.BALANCE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getElementId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getElementType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getBalanceType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getElementId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getElementType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getBalanceType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntGroupDependRecord value1(Integer value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntGroupDependRecord value2(Integer value) {
        setElementId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntGroupDependRecord value3(Integer value) {
        setElementType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntGroupDependRecord value4(Integer value) {
        setBalanceType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CntGroupDependRecord values(Integer value1, Integer value2, Integer value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CntGroupDependRecord
     */
    public CntGroupDependRecord() {
        super(CntGroupDepend.CNT_GROUP_DEPEND);
    }

    /**
     * Create a detached, initialised CntGroupDependRecord
     */
    public CntGroupDependRecord(Integer groupId, Integer elementId, Integer elementType, Integer balanceType) {
        super(CntGroupDepend.CNT_GROUP_DEPEND);

        set(0, groupId);
        set(1, elementId);
        set(2, elementType);
        set(3, balanceType);
    }
}
