/*
 * This file is generated by jOOQ.
*/
package pl.poznan.uam.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import pl.poznan.uam.tables.Sets;
import pl.poznan.uam.tables.interfaces.ISets;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SetsRecord extends UpdatableRecordImpl<SetsRecord> implements Record4<Integer, Integer, Integer, String>, ISets {

    private static final long serialVersionUID = 1179204265;

    /**
     * Setter for <code>public.sets.id</code>.
     */
    @Override
    public SetsRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.sets.id</code>.
     */
    @Override
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.sets.chair_id</code>.
     */
    @Override
    public SetsRecord setChairId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.sets.chair_id</code>.
     */
    @NotNull
    @Override
    public Integer getChairId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.sets.table_id</code>.
     */
    @Override
    public SetsRecord setTableId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.sets.table_id</code>.
     */
    @NotNull
    @Override
    public Integer getTableId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.sets.name</code>.
     */
    @Override
    public SetsRecord setName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.sets.name</code>.
     */
    @NotNull
    @Size(max = 64)
    @Override
    public String getName() {
        return (String) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Sets.SETS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Sets.SETS.CHAIR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Sets.SETS.TABLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Sets.SETS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getChairId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getTableId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetsRecord value2(Integer value) {
        setChairId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetsRecord value3(Integer value) {
        setTableId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetsRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetsRecord values(Integer value1, Integer value2, Integer value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ISets from) {
        setId(from.getId());
        setChairId(from.getChairId());
        setTableId(from.getTableId());
        setName(from.getName());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISets> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SetsRecord
     */
    public SetsRecord() {
        super(Sets.SETS);
    }

    /**
     * Create a detached, initialised SetsRecord
     */
    public SetsRecord(Integer id, Integer chairId, Integer tableId, String name) {
        super(Sets.SETS);

        set(0, id);
        set(1, chairId);
        set(2, tableId);
        set(3, name);
    }
}
