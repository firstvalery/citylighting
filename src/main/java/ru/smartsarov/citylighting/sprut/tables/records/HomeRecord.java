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

import ru.smartsarov.citylighting.sprut.tables.Home;


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
public class HomeRecord extends UpdatableRecordImpl<HomeRecord> implements Record10<Integer, Integer, String, String, String, Integer, Integer, String, Double, Integer> {

    private static final long serialVersionUID = -1671363326;

    /**
     * Setter for <code>HOME.HOME_ID</code>.
     */
    public void setHomeId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>HOME.HOME_ID</code>.
     */
    public Integer getHomeId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>HOME.HOME_STRT_ID</code>.
     */
    public void setHomeStrtId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>HOME.HOME_STRT_ID</code>.
     */
    public Integer getHomeStrtId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>HOME.HOME_NUMBER</code>.
     */
    public void setHomeNumber(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>HOME.HOME_NUMBER</code>.
     */
    public String getHomeNumber() {
        return (String) get(2);
    }

    /**
     * Setter for <code>HOME.HOME_STR</code>.
     */
    public void setHomeStr(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>HOME.HOME_STR</code>.
     */
    public String getHomeStr() {
        return (String) get(3);
    }

    /**
     * Setter for <code>HOME.HOME_KORP</code>.
     */
    public void setHomeKorp(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>HOME.HOME_KORP</code>.
     */
    public String getHomeKorp() {
        return (String) get(4);
    }

    /**
     * Setter for <code>HOME.HOME_TYPE</code>.
     */
    public void setHomeType(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>HOME.HOME_TYPE</code>.
     */
    public Integer getHomeType() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>HOME.HOME_ETNUM</code>.
     */
    public void setHomeEtnum(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>HOME.HOME_ETNUM</code>.
     */
    public Integer getHomeEtnum() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>HOME.HOME_POST_CODE</code>.
     */
    public void setHomePostCode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>HOME.HOME_POST_CODE</code>.
     */
    public String getHomePostCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>HOME.HOME_SQUARE</code>.
     */
    public void setHomeSquare(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>HOME.HOME_SQUARE</code>.
     */
    public Double getHomeSquare() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>HOME.HOME_NUM_PERSONS</code>.
     */
    public void setHomeNumPersons(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>HOME.HOME_NUM_PERSONS</code>.
     */
    public Integer getHomeNumPersons() {
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
    public Row10<Integer, Integer, String, String, String, Integer, Integer, String, Double, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, String, String, String, Integer, Integer, String, Double, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Home.HOME.HOME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Home.HOME.HOME_STRT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Home.HOME.HOME_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Home.HOME.HOME_STR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Home.HOME.HOME_KORP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Home.HOME.HOME_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Home.HOME.HOME_ETNUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Home.HOME.HOME_POST_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field9() {
        return Home.HOME.HOME_SQUARE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Home.HOME.HOME_NUM_PERSONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getHomeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getHomeStrtId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getHomeNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getHomeStr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getHomeKorp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getHomeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getHomeEtnum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getHomePostCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component9() {
        return getHomeSquare();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getHomeNumPersons();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getHomeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getHomeStrtId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getHomeNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getHomeStr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getHomeKorp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getHomeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getHomeEtnum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getHomePostCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value9() {
        return getHomeSquare();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getHomeNumPersons();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomeRecord value1(Integer value) {
        setHomeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomeRecord value2(Integer value) {
        setHomeStrtId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomeRecord value3(String value) {
        setHomeNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomeRecord value4(String value) {
        setHomeStr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomeRecord value5(String value) {
        setHomeKorp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomeRecord value6(Integer value) {
        setHomeType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomeRecord value7(Integer value) {
        setHomeEtnum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomeRecord value8(String value) {
        setHomePostCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomeRecord value9(Double value) {
        setHomeSquare(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomeRecord value10(Integer value) {
        setHomeNumPersons(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomeRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Integer value6, Integer value7, String value8, Double value9, Integer value10) {
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
     * Create a detached HomeRecord
     */
    public HomeRecord() {
        super(Home.HOME);
    }

    /**
     * Create a detached, initialised HomeRecord
     */
    public HomeRecord(Integer homeId, Integer homeStrtId, String homeNumber, String homeStr, String homeKorp, Integer homeType, Integer homeEtnum, String homePostCode, Double homeSquare, Integer homeNumPersons) {
        super(Home.HOME);

        set(0, homeId);
        set(1, homeStrtId);
        set(2, homeNumber);
        set(3, homeStr);
        set(4, homeKorp);
        set(5, homeType);
        set(6, homeEtnum);
        set(7, homePostCode);
        set(8, homeSquare);
        set(9, homeNumPersons);
    }
}
