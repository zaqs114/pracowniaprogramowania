/*
 * This file is generated by jOOQ.
*/
package pl.poznan.uam;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import pl.poznan.uam.tables.Chairs;
import pl.poznan.uam.tables.Sets;
import pl.poznan.uam.tables.Tables;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1245296020;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.chairs</code>.
     */
    public final Chairs CHAIRS = pl.poznan.uam.tables.Chairs.CHAIRS;

    /**
     * The table <code>public.sets</code>.
     */
    public final Sets SETS = pl.poznan.uam.tables.Sets.SETS;

    /**
     * The table <code>public.tables</code>.
     */
    public final Tables TABLES = pl.poznan.uam.tables.Tables.TABLES;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.CHAIRS_ID_SEQ,
            Sequences.SETS_ID_SEQ,
            Sequences.TABLES_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Chairs.CHAIRS,
            Sets.SETS,
            Tables.TABLES);
    }
}
