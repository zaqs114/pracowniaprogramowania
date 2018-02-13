package pl.poznan.uam;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import static pl.poznan.uam.tables.Chairs.CHAIRS;


@RestController
public class ChairController {

    @Autowired
    private DSLContext jooq;

    @GetMapping("chair")
    public List<Chair> chair(String color) {
        return jooq.select().from(CHAIRS)
                .fetchInto(Chair.class);
    }
}
