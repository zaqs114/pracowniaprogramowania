/*
 * This file is generated by jOOQ.
*/
package pl.poznan.uam.tables.pojos;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import pl.poznan.uam.tables.interfaces.ITables;


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
public class Tables implements ITables {

    private static final long serialVersionUID = 366204548;

    private Integer id;
    private Integer height;
    private Integer width;
    private Integer lenght;
    private String  shape;
    private String  name;

    public Tables() {}

    public Tables(Tables value) {
        this.id = value.id;
        this.height = value.height;
        this.width = value.width;
        this.lenght = value.lenght;
        this.shape = value.shape;
        this.name = value.name;
    }

    public Tables(
        Integer id,
        Integer height,
        Integer width,
        Integer lenght,
        String  shape,
        String  name
    ) {
        this.id = id;
        this.height = height;
        this.width = width;
        this.lenght = lenght;
        this.shape = shape;
        this.name = name;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public Tables setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    @Override
    public Integer getHeight() {
        return this.height;
    }

    @Override
    public Tables setHeight(Integer height) {
        this.height = height;
        return this;
    }

    @NotNull
    @Override
    public Integer getWidth() {
        return this.width;
    }

    @Override
    public Tables setWidth(Integer width) {
        this.width = width;
        return this;
    }

    @NotNull
    @Override
    public Integer getLenght() {
        return this.lenght;
    }

    @Override
    public Tables setLenght(Integer lenght) {
        this.lenght = lenght;
        return this;
    }

    @NotNull
    @Size(max = 64)
    @Override
    public String getShape() {
        return this.shape;
    }

    @Override
    public Tables setShape(String shape) {
        this.shape = shape;
        return this;
    }

    @NotNull
    @Size(max = 65)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Tables setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Tables (");

        sb.append(id);
        sb.append(", ").append(height);
        sb.append(", ").append(width);
        sb.append(", ").append(lenght);
        sb.append(", ").append(shape);
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
    public void from(ITables from) {
        setId(from.getId());
        setHeight(from.getHeight());
        setWidth(from.getWidth());
        setLenght(from.getLenght());
        setShape(from.getShape());
        setName(from.getName());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITables> E into(E into) {
        into.from(this);
        return into;
    }
}
