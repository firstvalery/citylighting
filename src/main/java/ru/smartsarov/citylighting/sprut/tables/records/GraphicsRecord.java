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

import ru.smartsarov.citylighting.sprut.tables.Graphics;


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
public class GraphicsRecord extends UpdatableRecordImpl<GraphicsRecord> implements Record7<Integer, Integer, String, String, byte[], Integer, Long> {

    private static final long serialVersionUID = 734337430;

    /**
     * Setter for <code>GRAPHICS.GRPH_ID</code>.
     */
    public void setGrphId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>GRAPHICS.GRPH_ID</code>.
     */
    public Integer getGrphId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>GRAPHICS.GRPH_AB_ID</code>.
     */
    public void setGrphAbId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>GRAPHICS.GRPH_AB_ID</code>.
     */
    public Integer getGrphAbId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>GRAPHICS.GRPH_NAME</code>.
     */
    public void setGrphName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>GRAPHICS.GRPH_NAME</code>.
     */
    public String getGrphName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>GRAPHICS.GRPH_MEMO</code>.
     */
    public void setGrphMemo(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>GRAPHICS.GRPH_MEMO</code>.
     */
    public String getGrphMemo() {
        return (String) get(3);
    }

    /**
     * Setter for <code>GRAPHICS.GRPH_DATA</code>.
     */
    public void setGrphData(byte... value) {
        set(4, value);
    }

    /**
     * Getter for <code>GRAPHICS.GRPH_DATA</code>.
     */
    public byte[] getGrphData() {
        return (byte[]) get(4);
    }

    /**
     * Setter for <code>GRAPHICS.GRPH_RECUCLE</code>.
     */
    public void setGrphRecucle(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>GRAPHICS.GRPH_RECUCLE</code>.
     */
    public Integer getGrphRecucle() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>GRAPHICS.GRPH_VERSION</code>.
     */
    public void setGrphVersion(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>GRAPHICS.GRPH_VERSION</code>.
     */
    public Long getGrphVersion() {
        return (Long) get(6);
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
    public Row7<Integer, Integer, String, String, byte[], Integer, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, String, byte[], Integer, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Graphics.GRAPHICS.GRPH_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Graphics.GRAPHICS.GRPH_AB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Graphics.GRAPHICS.GRPH_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Graphics.GRAPHICS.GRPH_MEMO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field5() {
        return Graphics.GRAPHICS.GRPH_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Graphics.GRAPHICS.GRPH_RECUCLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return Graphics.GRAPHICS.GRPH_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getGrphId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getGrphAbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getGrphName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getGrphMemo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component5() {
        return getGrphData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getGrphRecucle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getGrphVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getGrphId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getGrphAbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGrphName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getGrphMemo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value5() {
        return getGrphData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getGrphRecucle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getGrphVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraphicsRecord value1(Integer value) {
        setGrphId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraphicsRecord value2(Integer value) {
        setGrphAbId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraphicsRecord value3(String value) {
        setGrphName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraphicsRecord value4(String value) {
        setGrphMemo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraphicsRecord value5(byte... value) {
        setGrphData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraphicsRecord value6(Integer value) {
        setGrphRecucle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraphicsRecord value7(Long value) {
        setGrphVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraphicsRecord values(Integer value1, Integer value2, String value3, String value4, byte[] value5, Integer value6, Long value7) {
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
     * Create a detached GraphicsRecord
     */
    public GraphicsRecord() {
        super(Graphics.GRAPHICS);
    }

    /**
     * Create a detached, initialised GraphicsRecord
     */
    public GraphicsRecord(Integer grphId, Integer grphAbId, String grphName, String grphMemo, byte[] grphData, Integer grphRecucle, Long grphVersion) {
        super(Graphics.GRAPHICS);

        set(0, grphId);
        set(1, grphAbId);
        set(2, grphName);
        set(3, grphMemo);
        set(4, grphData);
        set(5, grphRecucle);
        set(6, grphVersion);
    }
}
