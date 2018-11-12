/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.Abonent;


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
public class AbonentRecord extends UpdatableRecordImpl<AbonentRecord> implements Record10<Integer, Integer, Integer, String, String, String, Integer, String, Integer, Integer> {

    private static final long serialVersionUID = 1776895672;

    /**
     * Setter for <code>ABONENT.AB_ID</code>.
     */
    public void setAbId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ABONENT.AB_ID</code>.
     */
    public Integer getAbId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ABONENT.AB_NUM</code>.
     */
    public void setAbNum(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>ABONENT.AB_NUM</code>.
     */
    public Integer getAbNum() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ABONENT.AB_TYPE</code>.
     */
    public void setAbType(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>ABONENT.AB_TYPE</code>.
     */
    public Integer getAbType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>ABONENT.AB_NAME</code>.
     */
    public void setAbName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ABONENT.AB_NAME</code>.
     */
    public String getAbName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ABONENT.AB_NAME1</code>.
     */
    public void setAbName1(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>ABONENT.AB_NAME1</code>.
     */
    public String getAbName1() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ABONENT.AB_NAME2</code>.
     */
    public void setAbName2(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>ABONENT.AB_NAME2</code>.
     */
    public String getAbName2() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ABONENT.AB_ADR_ID</code>.
     */
    public void setAbAdrId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>ABONENT.AB_ADR_ID</code>.
     */
    public Integer getAbAdrId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>ABONENT.AB_REM</code>.
     */
    public void setAbRem(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>ABONENT.AB_REM</code>.
     */
    public String getAbRem() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ABONENT.AB_TARPLAN</code>.
     */
    public void setAbTarplan(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>ABONENT.AB_TARPLAN</code>.
     */
    public Integer getAbTarplan() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>ABONENT.AB_RECUCLE</code>.
     */
    public void setAbRecucle(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>ABONENT.AB_RECUCLE</code>.
     */
    public Integer getAbRecucle() {
        return (Integer) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, Integer, String, String, String, Integer, String, Integer, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, Integer, String, String, String, Integer, String, Integer, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Abonent.ABONENT.AB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Abonent.ABONENT.AB_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Abonent.ABONENT.AB_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Abonent.ABONENT.AB_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Abonent.ABONENT.AB_NAME1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Abonent.ABONENT.AB_NAME2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Abonent.ABONENT.AB_ADR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Abonent.ABONENT.AB_REM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Abonent.ABONENT.AB_TARPLAN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Abonent.ABONENT.AB_RECUCLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getAbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getAbNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getAbType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAbName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getAbName1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getAbName2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getAbAdrId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getAbRem();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getAbTarplan();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getAbRecucle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getAbNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAbType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAbName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAbName1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAbName2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getAbAdrId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getAbRem();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getAbTarplan();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getAbRecucle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbonentRecord value1(Integer value) {
        setAbId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbonentRecord value2(Integer value) {
        setAbNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbonentRecord value3(Integer value) {
        setAbType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbonentRecord value4(String value) {
        setAbName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbonentRecord value5(String value) {
        setAbName1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbonentRecord value6(String value) {
        setAbName2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbonentRecord value7(Integer value) {
        setAbAdrId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbonentRecord value8(String value) {
        setAbRem(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbonentRecord value9(Integer value) {
        setAbTarplan(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbonentRecord value10(Integer value) {
        setAbRecucle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbonentRecord values(Integer value1, Integer value2, Integer value3, String value4, String value5, String value6, Integer value7, String value8, Integer value9, Integer value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AbonentRecord
     */
    public AbonentRecord() {
        super(Abonent.ABONENT);
    }

    /**
     * Create a detached, initialised AbonentRecord
     */
    public AbonentRecord(Integer abId, Integer abNum, Integer abType, String abName, String abName1, String abName2, Integer abAdrId, String abRem, Integer abTarplan, Integer abRecucle) {
        super(Abonent.ABONENT);

        set(0, abId);
        set(1, abNum);
        set(2, abType);
        set(3, abName);
        set(4, abName1);
        set(5, abName2);
        set(6, abAdrId);
        set(7, abRem);
        set(8, abTarplan);
        set(9, abRecucle);
    }
}
