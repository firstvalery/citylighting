/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.Rdb$characterSets;


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
public class Rdb$characterSetsRecord extends TableRecordImpl<Rdb$characterSetsRecord> implements Record9<String, String, Integer, String, Short, Short, String, String, Short> {

    private static final long serialVersionUID = -577176409;

    /**
     * Setter for <code>RDB$CHARACTER_SETS.RDB$CHARACTER_SET_NAME</code>.
     */
    public void setRdb$characterSetName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>RDB$CHARACTER_SETS.RDB$CHARACTER_SET_NAME</code>.
     */
    public String getRdb$characterSetName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>RDB$CHARACTER_SETS.RDB$FORM_OF_USE</code>.
     */
    public void setRdb$formOfUse(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>RDB$CHARACTER_SETS.RDB$FORM_OF_USE</code>.
     */
    public String getRdb$formOfUse() {
        return (String) get(1);
    }

    /**
     * Setter for <code>RDB$CHARACTER_SETS.RDB$NUMBER_OF_CHARACTERS</code>.
     */
    public void setRdb$numberOfCharacters(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>RDB$CHARACTER_SETS.RDB$NUMBER_OF_CHARACTERS</code>.
     */
    public Integer getRdb$numberOfCharacters() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>RDB$CHARACTER_SETS.RDB$DEFAULT_COLLATE_NAME</code>.
     */
    public void setRdb$defaultCollateName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>RDB$CHARACTER_SETS.RDB$DEFAULT_COLLATE_NAME</code>.
     */
    public String getRdb$defaultCollateName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>RDB$CHARACTER_SETS.RDB$CHARACTER_SET_ID</code>.
     */
    public void setRdb$characterSetId(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>RDB$CHARACTER_SETS.RDB$CHARACTER_SET_ID</code>.
     */
    public Short getRdb$characterSetId() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>RDB$CHARACTER_SETS.RDB$SYSTEM_FLAG</code>.
     */
    public void setRdb$systemFlag(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>RDB$CHARACTER_SETS.RDB$SYSTEM_FLAG</code>.
     */
    public Short getRdb$systemFlag() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>RDB$CHARACTER_SETS.RDB$DESCRIPTION</code>.
     */
    public void setRdb$description(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>RDB$CHARACTER_SETS.RDB$DESCRIPTION</code>.
     */
    public String getRdb$description() {
        return (String) get(6);
    }

    /**
     * Setter for <code>RDB$CHARACTER_SETS.RDB$FUNCTION_NAME</code>.
     */
    public void setRdb$functionName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>RDB$CHARACTER_SETS.RDB$FUNCTION_NAME</code>.
     */
    public String getRdb$functionName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>RDB$CHARACTER_SETS.RDB$BYTES_PER_CHARACTER</code>.
     */
    public void setRdb$bytesPerCharacter(Short value) {
        set(8, value);
    }

    /**
     * Getter for <code>RDB$CHARACTER_SETS.RDB$BYTES_PER_CHARACTER</code>.
     */
    public Short getRdb$bytesPerCharacter() {
        return (Short) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, Integer, String, Short, Short, String, String, Short> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, Integer, String, Short, Short, String, String, Short> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Rdb$characterSets.RDB$CHARACTER_SETS.RDB$CHARACTER_SET_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Rdb$characterSets.RDB$CHARACTER_SETS.RDB$FORM_OF_USE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Rdb$characterSets.RDB$CHARACTER_SETS.RDB$NUMBER_OF_CHARACTERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Rdb$characterSets.RDB$CHARACTER_SETS.RDB$DEFAULT_COLLATE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return Rdb$characterSets.RDB$CHARACTER_SETS.RDB$CHARACTER_SET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return Rdb$characterSets.RDB$CHARACTER_SETS.RDB$SYSTEM_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Rdb$characterSets.RDB$CHARACTER_SETS.RDB$DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Rdb$characterSets.RDB$CHARACTER_SETS.RDB$FUNCTION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field9() {
        return Rdb$characterSets.RDB$CHARACTER_SETS.RDB$BYTES_PER_CHARACTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getRdb$characterSetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getRdb$formOfUse();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getRdb$numberOfCharacters();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRdb$defaultCollateName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getRdb$characterSetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getRdb$systemFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getRdb$description();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getRdb$functionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component9() {
        return getRdb$bytesPerCharacter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getRdb$characterSetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRdb$formOfUse();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getRdb$numberOfCharacters();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRdb$defaultCollateName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getRdb$characterSetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getRdb$systemFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getRdb$description();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRdb$functionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value9() {
        return getRdb$bytesPerCharacter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$characterSetsRecord value1(String value) {
        setRdb$characterSetName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$characterSetsRecord value2(String value) {
        setRdb$formOfUse(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$characterSetsRecord value3(Integer value) {
        setRdb$numberOfCharacters(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$characterSetsRecord value4(String value) {
        setRdb$defaultCollateName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$characterSetsRecord value5(Short value) {
        setRdb$characterSetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$characterSetsRecord value6(Short value) {
        setRdb$systemFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$characterSetsRecord value7(String value) {
        setRdb$description(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$characterSetsRecord value8(String value) {
        setRdb$functionName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$characterSetsRecord value9(Short value) {
        setRdb$bytesPerCharacter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$characterSetsRecord values(String value1, String value2, Integer value3, String value4, Short value5, Short value6, String value7, String value8, Short value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Rdb$characterSetsRecord
     */
    public Rdb$characterSetsRecord() {
        super(Rdb$characterSets.RDB$CHARACTER_SETS);
    }

    /**
     * Create a detached, initialised Rdb$characterSetsRecord
     */
    public Rdb$characterSetsRecord(String rdb$characterSetName, String rdb$formOfUse, Integer rdb$numberOfCharacters, String rdb$defaultCollateName, Short rdb$characterSetId, Short rdb$systemFlag, String rdb$description, String rdb$functionName, Short rdb$bytesPerCharacter) {
        super(Rdb$characterSets.RDB$CHARACTER_SETS);

        set(0, rdb$characterSetName);
        set(1, rdb$formOfUse);
        set(2, rdb$numberOfCharacters);
        set(3, rdb$defaultCollateName);
        set(4, rdb$characterSetId);
        set(5, rdb$systemFlag);
        set(6, rdb$description);
        set(7, rdb$functionName);
        set(8, rdb$bytesPerCharacter);
    }
}