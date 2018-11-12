/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;

import ru.smartsarov.citylighting.sprut.tables.Mon$ioStats;


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
public class Mon$ioStatsRecord extends TableRecordImpl<Mon$ioStatsRecord> implements Record6<Integer, Short, Long, Long, Long, Long> {

    private static final long serialVersionUID = -1801970283;

    /**
     * Setter for <code>MON$IO_STATS.MON$STAT_ID</code>.
     */
    public void setMon$statId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>MON$IO_STATS.MON$STAT_ID</code>.
     */
    public Integer getMon$statId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>MON$IO_STATS.MON$STAT_GROUP</code>.
     */
    public void setMon$statGroup(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>MON$IO_STATS.MON$STAT_GROUP</code>.
     */
    public Short getMon$statGroup() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>MON$IO_STATS.MON$PAGE_READS</code>.
     */
    public void setMon$pageReads(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>MON$IO_STATS.MON$PAGE_READS</code>.
     */
    public Long getMon$pageReads() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>MON$IO_STATS.MON$PAGE_WRITES</code>.
     */
    public void setMon$pageWrites(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>MON$IO_STATS.MON$PAGE_WRITES</code>.
     */
    public Long getMon$pageWrites() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>MON$IO_STATS.MON$PAGE_FETCHES</code>.
     */
    public void setMon$pageFetches(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>MON$IO_STATS.MON$PAGE_FETCHES</code>.
     */
    public Long getMon$pageFetches() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>MON$IO_STATS.MON$PAGE_MARKS</code>.
     */
    public void setMon$pageMarks(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>MON$IO_STATS.MON$PAGE_MARKS</code>.
     */
    public Long getMon$pageMarks() {
        return (Long) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Short, Long, Long, Long, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Short, Long, Long, Long, Long> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Mon$ioStats.MON$IO_STATS.MON$STAT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return Mon$ioStats.MON$IO_STATS.MON$STAT_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Mon$ioStats.MON$IO_STATS.MON$PAGE_READS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Mon$ioStats.MON$IO_STATS.MON$PAGE_WRITES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Mon$ioStats.MON$IO_STATS.MON$PAGE_FETCHES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return Mon$ioStats.MON$IO_STATS.MON$PAGE_MARKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getMon$statId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component2() {
        return getMon$statGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getMon$pageReads();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getMon$pageWrites();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getMon$pageFetches();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getMon$pageMarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getMon$statId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getMon$statGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getMon$pageReads();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getMon$pageWrites();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getMon$pageFetches();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getMon$pageMarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$ioStatsRecord value1(Integer value) {
        setMon$statId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$ioStatsRecord value2(Short value) {
        setMon$statGroup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$ioStatsRecord value3(Long value) {
        setMon$pageReads(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$ioStatsRecord value4(Long value) {
        setMon$pageWrites(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$ioStatsRecord value5(Long value) {
        setMon$pageFetches(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$ioStatsRecord value6(Long value) {
        setMon$pageMarks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mon$ioStatsRecord values(Integer value1, Short value2, Long value3, Long value4, Long value5, Long value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Mon$ioStatsRecord
     */
    public Mon$ioStatsRecord() {
        super(Mon$ioStats.MON$IO_STATS);
    }

    /**
     * Create a detached, initialised Mon$ioStatsRecord
     */
    public Mon$ioStatsRecord(Integer mon$statId, Short mon$statGroup, Long mon$pageReads, Long mon$pageWrites, Long mon$pageFetches, Long mon$pageMarks) {
        super(Mon$ioStats.MON$IO_STATS);

        set(0, mon$statId);
        set(1, mon$statGroup);
        set(2, mon$pageReads);
        set(3, mon$pageWrites);
        set(4, mon$pageFetches);
        set(5, mon$pageMarks);
    }
}