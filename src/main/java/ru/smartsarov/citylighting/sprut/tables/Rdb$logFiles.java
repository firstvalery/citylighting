/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.sprut.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.smartsarov.citylighting.sprut.DefaultSchema;
import ru.smartsarov.citylighting.sprut.tables.records.Rdb$logFilesRecord;


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
public class Rdb$logFiles extends TableImpl<Rdb$logFilesRecord> {

    private static final long serialVersionUID = 226932269;

    /**
     * The reference instance of <code>RDB$LOG_FILES</code>
     */
    public static final Rdb$logFiles RDB$LOG_FILES = new Rdb$logFiles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Rdb$logFilesRecord> getRecordType() {
        return Rdb$logFilesRecord.class;
    }

    /**
     * The column <code>RDB$LOG_FILES.RDB$FILE_NAME</code>.
     */
    public final TableField<Rdb$logFilesRecord, String> RDB$FILE_NAME = createField("RDB$FILE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>RDB$LOG_FILES.RDB$FILE_SEQUENCE</code>.
     */
    public final TableField<Rdb$logFilesRecord, Short> RDB$FILE_SEQUENCE = createField("RDB$FILE_SEQUENCE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$LOG_FILES.RDB$FILE_LENGTH</code>.
     */
    public final TableField<Rdb$logFilesRecord, Integer> RDB$FILE_LENGTH = createField("RDB$FILE_LENGTH", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>RDB$LOG_FILES.RDB$FILE_PARTITIONS</code>.
     */
    public final TableField<Rdb$logFilesRecord, Short> RDB$FILE_PARTITIONS = createField("RDB$FILE_PARTITIONS", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$LOG_FILES.RDB$FILE_P_OFFSET</code>.
     */
    public final TableField<Rdb$logFilesRecord, Integer> RDB$FILE_P_OFFSET = createField("RDB$FILE_P_OFFSET", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>RDB$LOG_FILES.RDB$FILE_FLAGS</code>.
     */
    public final TableField<Rdb$logFilesRecord, Short> RDB$FILE_FLAGS = createField("RDB$FILE_FLAGS", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>RDB$LOG_FILES</code> table reference
     */
    public Rdb$logFiles() {
        this(DSL.name("RDB$LOG_FILES"), null);
    }

    /**
     * Create an aliased <code>RDB$LOG_FILES</code> table reference
     */
    public Rdb$logFiles(String alias) {
        this(DSL.name(alias), RDB$LOG_FILES);
    }

    /**
     * Create an aliased <code>RDB$LOG_FILES</code> table reference
     */
    public Rdb$logFiles(Name alias) {
        this(alias, RDB$LOG_FILES);
    }

    private Rdb$logFiles(Name alias, Table<Rdb$logFilesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Rdb$logFiles(Name alias, Table<Rdb$logFilesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Rdb$logFiles(Table<O> child, ForeignKey<O, Rdb$logFilesRecord> key) {
        super(child, key, RDB$LOG_FILES);
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
    public Rdb$logFiles as(String alias) {
        return new Rdb$logFiles(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rdb$logFiles as(Name alias) {
        return new Rdb$logFiles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$logFiles rename(String name) {
        return new Rdb$logFiles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$logFiles rename(Name name) {
        return new Rdb$logFiles(name, null);
    }
}
