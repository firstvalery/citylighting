/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.citylighting.localData;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import ru.smartsarov.citylighting.localData.tables.ClustersTable;
import ru.smartsarov.citylighting.localData.tables.SqliteSequence;


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
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = 257271064;

    /**
     * The reference instance of <code></code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>clusters_table</code>.
     */
    public final ClustersTable CLUSTERS_TABLE = ru.smartsarov.citylighting.localData.tables.ClustersTable.CLUSTERS_TABLE;

    /**
     * The table <code>sqlite_sequence</code>.
     */
    public final SqliteSequence SQLITE_SEQUENCE = ru.smartsarov.citylighting.localData.tables.SqliteSequence.SQLITE_SEQUENCE;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            ClustersTable.CLUSTERS_TABLE,
            SqliteSequence.SQLITE_SEQUENCE);
    }
}
