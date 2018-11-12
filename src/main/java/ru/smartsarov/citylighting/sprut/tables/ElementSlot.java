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
import ru.smartsarov.citylighting.sprut.tables.records.ElementSlotRecord;


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
public class ElementSlot extends TableImpl<ElementSlotRecord> {

    private static final long serialVersionUID = 563748816;

    /**
     * The reference instance of <code>ELEMENT_SLOT</code>
     */
    public static final ElementSlot ELEMENT_SLOT = new ElementSlot();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ElementSlotRecord> getRecordType() {
        return ElementSlotRecord.class;
    }

    /**
     * The column <code>ELEMENT_SLOT.ETYPE</code>.
     */
    public final TableField<ElementSlotRecord, Integer> ETYPE = createField("ETYPE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ELEMENT_SLOT.ATYPE</code>.
     */
    public final TableField<ElementSlotRecord, Integer> ATYPE = createField("ATYPE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ELEMENT_SLOT.BTYPE</code>.
     */
    public final TableField<ElementSlotRecord, Integer> BTYPE = createField("BTYPE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ELEMENT_SLOT.SLOT_NUM</code>.
     */
    public final TableField<ElementSlotRecord, Integer> SLOT_NUM = createField("SLOT_NUM", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ELEMENT_SLOT.ALLOW_MULTIPLE_LINK</code>.
     */
    public final TableField<ElementSlotRecord, Short> ALLOW_MULTIPLE_LINK = createField("ALLOW_MULTIPLE_LINK", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ELEMENT_SLOT.CAN_LINK_ETYPE</code>.
     */
    public final TableField<ElementSlotRecord, Integer> CAN_LINK_ETYPE = createField("CAN_LINK_ETYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ELEMENT_SLOT.CAN_LINK_ATYPE</code>.
     */
    public final TableField<ElementSlotRecord, Integer> CAN_LINK_ATYPE = createField("CAN_LINK_ATYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ELEMENT_SLOT.CAN_LINK_BTYPE</code>.
     */
    public final TableField<ElementSlotRecord, Integer> CAN_LINK_BTYPE = createField("CAN_LINK_BTYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ELEMENT_SLOT.ENABLED</code>.
     */
    public final TableField<ElementSlotRecord, Short> ENABLED = createField("ENABLED", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ELEMENT_SLOT.NAME</code>.
     */
    public final TableField<ElementSlotRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>ELEMENT_SLOT.MEMO</code>.
     */
    public final TableField<ElementSlotRecord, String> MEMO = createField("MEMO", org.jooq.impl.SQLDataType.VARCHAR(512), this, "");

    /**
     * The column <code>ELEMENT_SLOT.SLOT_GUI_SETTINGS</code>.
     */
    public final TableField<ElementSlotRecord, String> SLOT_GUI_SETTINGS = createField("SLOT_GUI_SETTINGS", org.jooq.impl.SQLDataType.VARCHAR(512), this, "");

    /**
     * Create a <code>ELEMENT_SLOT</code> table reference
     */
    public ElementSlot() {
        this(DSL.name("ELEMENT_SLOT"), null);
    }

    /**
     * Create an aliased <code>ELEMENT_SLOT</code> table reference
     */
    public ElementSlot(String alias) {
        this(DSL.name(alias), ELEMENT_SLOT);
    }

    /**
     * Create an aliased <code>ELEMENT_SLOT</code> table reference
     */
    public ElementSlot(Name alias) {
        this(alias, ELEMENT_SLOT);
    }

    private ElementSlot(Name alias, Table<ElementSlotRecord> aliased) {
        this(alias, aliased, null);
    }

    private ElementSlot(Name alias, Table<ElementSlotRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ElementSlot(Table<O> child, ForeignKey<O, ElementSlotRecord> key) {
        super(child, key, ELEMENT_SLOT);
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
    public UniqueKey<ElementSlotRecord> getPrimaryKey() {
        return Keys.PK_ELEMENT_SLOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ElementSlotRecord>> getKeys() {
        return Arrays.<UniqueKey<ElementSlotRecord>>asList(Keys.PK_ELEMENT_SLOT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ElementSlot as(String alias) {
        return new ElementSlot(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ElementSlot as(Name alias) {
        return new ElementSlot(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ElementSlot rename(String name) {
        return new ElementSlot(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ElementSlot rename(Name name) {
        return new ElementSlot(name, null);
    }
}