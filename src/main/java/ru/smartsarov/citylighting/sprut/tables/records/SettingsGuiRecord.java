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

import ru.smartsarov.citylighting.sprut.tables.SettingsGui;


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
public class SettingsGuiRecord extends UpdatableRecordImpl<SettingsGuiRecord> implements Record4<Integer, Integer, String, byte[]> {

    private static final long serialVersionUID = -1192493301;

    /**
     * Setter for <code>SETTINGS_GUI.USER_ID</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>SETTINGS_GUI.USER_ID</code>.
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>SETTINGS_GUI.APPLICATION_ID</code>.
     */
    public void setApplicationId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>SETTINGS_GUI.APPLICATION_ID</code>.
     */
    public Integer getApplicationId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>SETTINGS_GUI.SECTION</code>.
     */
    public void setSection(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>SETTINGS_GUI.SECTION</code>.
     */
    public String getSection() {
        return (String) get(2);
    }

    /**
     * Setter for <code>SETTINGS_GUI.SETTINGS</code>.
     */
    public void setSettings(byte... value) {
        set(3, value);
    }

    /**
     * Getter for <code>SETTINGS_GUI.SETTINGS</code>.
     */
    public byte[] getSettings() {
        return (byte[]) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<Integer, Integer, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, byte[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, byte[]> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SettingsGui.SETTINGS_GUI.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return SettingsGui.SETTINGS_GUI.APPLICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SettingsGui.SETTINGS_GUI.SECTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field4() {
        return SettingsGui.SETTINGS_GUI.SETTINGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getApplicationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component4() {
        return getSettings();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getApplicationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value4() {
        return getSettings();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SettingsGuiRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SettingsGuiRecord value2(Integer value) {
        setApplicationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SettingsGuiRecord value3(String value) {
        setSection(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SettingsGuiRecord value4(byte... value) {
        setSettings(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SettingsGuiRecord values(Integer value1, Integer value2, String value3, byte[] value4) {
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
     * Create a detached SettingsGuiRecord
     */
    public SettingsGuiRecord() {
        super(SettingsGui.SETTINGS_GUI);
    }

    /**
     * Create a detached, initialised SettingsGuiRecord
     */
    public SettingsGuiRecord(Integer userId, Integer applicationId, String section, byte[] settings) {
        super(SettingsGui.SETTINGS_GUI);

        set(0, userId);
        set(1, applicationId);
        set(2, section);
        set(3, settings);
    }
}
