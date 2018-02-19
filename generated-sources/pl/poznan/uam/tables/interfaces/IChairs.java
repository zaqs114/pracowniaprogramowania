/*
 * This file is generated by jOOQ.
*/
package pl.poznan.uam.tables.interfaces;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
public interface IChairs extends Serializable {

    /**
     * Setter for <code>public.chairs.id</code>.
     */
    public IChairs setId(Integer value);

    /**
     * Getter for <code>public.chairs.id</code>.
     */
    public Integer getId();

    /**
     * Setter for <code>public.chairs.height</code>.
     */
    public IChairs setHeight(Integer value);

    /**
     * Getter for <code>public.chairs.height</code>.
     */
    @NotNull
    public Integer getHeight();

    /**
     * Setter for <code>public.chairs.width</code>.
     */
    public IChairs setWidth(Integer value);

    /**
     * Getter for <code>public.chairs.width</code>.
     */
    @NotNull
    public Integer getWidth();

    /**
     * Setter for <code>public.chairs.color</code>.
     */
    public IChairs setColor(String value);

    /**
     * Getter for <code>public.chairs.color</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getColor();

    /**
     * Setter for <code>public.chairs.name</code>.
     */
    public IChairs setName(String value);

    /**
     * Getter for <code>public.chairs.name</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getName();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IChairs
     */
    public void from(pl.poznan.uam.tables.interfaces.IChairs from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IChairs
     */
    public <E extends pl.poznan.uam.tables.interfaces.IChairs> E into(E into);
}
