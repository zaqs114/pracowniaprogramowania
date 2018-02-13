/*
 * This file is generated by jOOQ.
*/
package pl.poznan.uam.tables.pojos;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
public class Sets implements ISets {

    private static final long serialVersionUID = 186886955;

    private Integer id;
    private Integer chairId;
    private Integer tableId;
    private String  name;

    public Sets() {}

    public Sets(Sets value) {
        this.id = value.id;
        this.chairId = value.chairId;
        this.tableId = value.tableId;
        this.name = value.name;
    }

    public Sets(
        Integer id,
        Integer chairId,
        Integer tableId,
        String  name
    ) {
        this.id = id;
        this.chairId = chairId;
        this.tableId = tableId;
        this.name = name;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public Sets setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    @Override
    public Integer getChairId() {
        return this.chairId;
    }

    @Override
    public Sets setChairId(Integer chairId) {
        this.chairId = chairId;
        return this;
    }

    @NotNull
    @Override
    public Integer getTableId() {
        return this.tableId;
    }

    @Override
    public Sets setTableId(Integer tableId) {
        this.tableId = tableId;
        return this;
    }

    @NotNull
    @Size(max = 64)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Sets setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Sets (");

        sb.append(id);
        sb.append(", ").append(chairId);
        sb.append(", ").append(tableId);
        sb.append(", ").append(name);

        sb.append(")");
        return sb.toString();
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
}
