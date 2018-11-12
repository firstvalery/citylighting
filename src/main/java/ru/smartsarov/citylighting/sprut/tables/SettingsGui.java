/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.smartsarov.citylighting.sprut.DefaultSchema;
import ru.smartsarov.citylighting.sprut.Keys;
import ru.smartsarov.citylighting.sprut.tables.records.SettingsGuiRecord;


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
public class SettingsGui extends TableImpl<SettingsGuiRecord> {

    private static final long serialVersionUID = -1414830853;

    /**
     * The reference instance of <code>SETTINGS_GUI</code>
     */
    public static final SettingsGui SETTINGS_GUI = new SettingsGui();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SettingsGuiRecord> getRecordType() {
        return SettingsGuiRecord.class;
    }

    /**
     * The column <code>SETTINGS_GUI.USER_ID</code>.
     */
    public final TableField<SettingsGuiRecord, Integer> USER_ID = createField("USER_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>SETTINGS_GUI.APPLICATION_ID</code>.
     */
    public final TableField<SettingsGuiRecord, Integer> APPLICATION_ID = createField("APPLICATION_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>SETTINGS_GUI.SECTION</code>.
     */
    public final TableField<SettingsGuiRecord, String> SECTION = createField("SECTION", org.jooq.impl.SQLDataType.VARCHAR(250).nullable(false), this, "");

    /**
     * The column <code>SETTINGS_GUI.SETTINGS</code>.
     */
    public final TableField<SettingsGuiRecord, byte[]> SETTINGS = createField("SETTINGS", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * Create a <code>SETTINGS_GUI</code> table reference
     */
    public SettingsGui() {
        this(DSL.name("SETTINGS_GUI"), null);
    }

    /**
     * Create an aliased <code>SETTINGS_GUI</code> table reference
     */
    public SettingsGui(String alias) {
        this(DSL.name(alias), SETTINGS_GUI);
    }

    /**
     * Create an aliased <code>SETTINGS_GUI</code> table reference
     */
    public SettingsGui(Name alias) {
        this(alias, SETTINGS_GUI);
    }

    private SettingsGui(Name alias, Table<SettingsGuiRecord> aliased) {
        this(alias, aliased, null);
    }

    private SettingsGui(Name alias, Table<SettingsGuiRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SettingsGui(Table<O> child, ForeignKey<O, SettingsGuiRecord> key) {
        super(child, key, SETTINGS_GUI);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SettingsGuiRecord> getPrimaryKey() {
        return Keys.SETTINGS_GUI_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SettingsGuiRecord>> getKeys() {
        return Arrays.<UniqueKey<SettingsGuiRecord>>asList(Keys.SETTINGS_GUI_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SettingsGui as(String alias) {
        return new SettingsGui(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SettingsGui as(Name alias) {
        return new SettingsGui(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SettingsGui rename(String name) {
        return new SettingsGui(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SettingsGui rename(Name name) {
        return new SettingsGui(name, null);
    }
}
