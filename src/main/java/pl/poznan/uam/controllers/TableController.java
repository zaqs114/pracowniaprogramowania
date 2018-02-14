package pl.poznan.uam.controllers;


import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.poznan.uam.Table;
import pl.poznan.uam.tables.records.TablesRecord;

import java.util.List;

import static pl.poznan.uam.Tables.TABLES;

@RestController
public class TableController {

    @Autowired
    private DSLContext jooq;

    @GetMapping("/table")
    public List<Table> table() {
        return jooq.select().from(TABLES).fetchInto(Table.class);
    }

    @PostMapping("/table")
    public void table(@RequestBody Table table) {
        TablesRecord tr = jooq.newRecord(TABLES);
        tr.setName(table.name);
        tr.setHeight(table.height);
        tr.setLenght(table.lenght);
        tr.setWidth(table.width);
        tr.setShape(table.shape);
        tr.store();
    }

    @DeleteMapping("/table/{id}")
    public void delete(@PathVariable Integer id) {
        TablesRecord tr = jooq.fetchOne(TABLES, TABLES.ID.eq(id));
        tr.delete();
    }
}
