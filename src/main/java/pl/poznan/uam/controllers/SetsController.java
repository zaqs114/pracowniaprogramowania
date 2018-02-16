package pl.poznan.uam.controllers;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.poznan.uam.Sets;
import pl.poznan.uam.tables.records.SetsRecord;

import java.util.List;


import static pl.poznan.uam.tables.Sets.SETS;

@RestController
@CrossOrigin(origins = "http://localhost:63343")
public class SetsController {
    @Autowired
    private DSLContext jooq;

    @GetMapping("/sets")
    public List<Sets> sets(){
        return jooq.select().from(SETS).fetchInto(Sets.class);
    }

    @PostMapping("/sets")
    public void sets(@RequestBody Sets sets) {
        SetsRecord sr = jooq.newRecord(SETS);
        sr.setName(sets.name);
        sr.setChairId(sets.chair_id);
        sr.setTableId(sets.table_id);
        sr.store();
    }

    @PostMapping("sets/{id}")
    public void delete(@PathVariable Integer id) {
        SetsRecord sr = jooq.fetchOne(SETS, SETS.ID.eq(id));
        sr.delete();
    }
}
