/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.ListHome;


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
public class ListHomeRecord extends TableRecordImpl<ListHomeRecord> implements Record10<Integer, Integer, Integer, Integer, String, String, String, String, String, String> {

    private static final long serialVersionUID = 682241992;

    /**
     * Setter for <code>LIST_HOME.RGN_ID</code>.
     */
    public void setRgnId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>LIST_HOME.RGN_ID</code>.
     */
    public Integer getRgnId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>LIST_HOME.SITY_ID</code>.
     */
    public void setSityId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>LIST_HOME.SITY_ID</code>.
     */
    public Integer getSityId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>LIST_HOME.STRT_ID</code>.
     */
    public void setStrtId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>LIST_HOME.STRT_ID</code>.
     */
    public Integer getStrtId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>LIST_HOME.HOME_ID</code>.
     */
    public void setHomeId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>LIST_HOME.HOME_ID</code>.
     */
    public Integer getHomeId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>LIST_HOME.HOME_NUMBER</code>.
     */
    public void setHomeNumber(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>LIST_HOME.HOME_NUMBER</code>.
     */
    public String getHomeNumber() {
        return (String) get(4);
    }

    /**
     * Setter for <code>LIST_HOME.HOME_STR</code>.
     */
    public void setHomeStr(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>LIST_HOME.HOME_STR</code>.
     */
    public String getHomeStr() {
        return (String) get(5);
    }

    /**
     * Setter for <code>LIST_HOME.HOME_KORP</code>.
     */
    public void setHomeKorp(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>LIST_HOME.HOME_KORP</code>.
     */
    public String getHomeKorp() {
        return (String) get(6);
    }

    /**
     * Setter for <code>LIST_HOME.STRT_NAME</code>.
     */
    public void setStrtName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>LIST_HOME.STRT_NAME</code>.
     */
    public String getStrtName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>LIST_HOME.FNAME1</code>.
     */
    public void setFname1(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>LIST_HOME.FNAME1</code>.
     */
    public String getFname1() {
        return (String) get(8);
    }

    /**
     * Setter for <code>LIST_HOME.FNAME2</code>.
     */
    public void setFname2(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>LIST_HOME.FNAME2</code>.
     */
    public String getFname2() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, Integer, Integer, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, Integer, Integer, String, String, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ListHome.LIST_HOME.RGN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ListHome.LIST_HOME.SITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ListHome.LIST_HOME.STRT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ListHome.LIST_HOME.HOME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ListHome.LIST_HOME.HOME_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ListHome.LIST_HOME.HOME_STR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ListHome.LIST_HOME.HOME_KORP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ListHome.LIST_HOME.STRT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ListHome.LIST_HOME.FNAME1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ListHome.LIST_HOME.FNAME2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getRgnId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getSityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getStrtId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getHomeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getHomeNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getHomeStr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getHomeKorp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getStrtName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getFname1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getFname2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRgnId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getSityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getStrtId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getHomeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getHomeNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getHomeStr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getHomeKorp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getStrtName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getFname1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getFname2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ListHomeRecord value1(Integer value) {
        setRgnId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ListHomeRecord value2(Integer value) {
        setSityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ListHomeRecord value3(Integer value) {
        setStrtId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ListHomeRecord value4(Integer value) {
        setHomeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ListHomeRecord value5(String value) {
        setHomeNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ListHomeRecord value6(String value) {
        setHomeStr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ListHomeRecord value7(String value) {
        setHomeKorp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ListHomeRecord value8(String value) {
        setStrtName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ListHomeRecord value9(String value) {
        setFname1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ListHomeRecord value10(String value) {
        setFname2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ListHomeRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, String value6, String value7, String value8, String value9, String value10) {
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
     * Create a detached ListHomeRecord
     */
    public ListHomeRecord() {
        super(ListHome.LIST_HOME);
    }

    /**
     * Create a detached, initialised ListHomeRecord
     */
    public ListHomeRecord(Integer rgnId, Integer sityId, Integer strtId, Integer homeId, String homeNumber, String homeStr, String homeKorp, String strtName, String fname1, String fname2) {
        super(ListHome.LIST_HOME);

        set(0, rgnId);
        set(1, sityId);
        set(2, strtId);
        set(3, homeId);
        set(4, homeNumber);
        set(5, homeStr);
        set(6, homeKorp);
        set(7, strtName);
        set(8, fname1);
        set(9, fname2);
    }
}
