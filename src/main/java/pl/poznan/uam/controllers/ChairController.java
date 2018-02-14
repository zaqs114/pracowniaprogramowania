package pl.poznan.uam.controllers;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.poznan.uam.Chair;
import pl.poznan.uam.tables.records.ChairsRecord;

import java.util.List;

import static pl.poznan.uam.Tables.CHAIRS;


@RestController
public class ChairController {

    @Autowired
    private DSLContext jooq;

    @GetMapping("/chair")
    public List<Chair> chair() {
        return jooq.select().from(CHAIRS).fetchInto(Chair.class);
    }

    @PostMapping("/chair")
    public void chair(@RequestBody Chair chair) {
        ChairsRecord cr = jooq.newRecord(CHAIRS);
        cr.setName(chair.name);
        cr.setHeight(chair.height);
        cr.setWidth(chair.width);
        cr.setColor(chair.color);
        cr.store();
    }

    @DeleteMapping("/chair/{id}")
    public void delete(@PathVariable Integer id) {
        ChairsRecord cr = jooq.fetchOne(CHAIRS, CHAIRS.ID.eq(id));
        cr.delete();
    }

}
