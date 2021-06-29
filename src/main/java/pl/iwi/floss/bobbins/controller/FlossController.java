package pl.iwi.floss.bobbins.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.iwi.floss.bobbins.model.Bobbin;
import pl.iwi.floss.bobbins.model.Floss;
import pl.iwi.floss.bobbins.service.BobbinService;
import pl.iwi.floss.bobbins.service.FlossService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class FlossController {

    private final FlossService flossColorService;
    private final BobbinService bobbinService;

    @GetMapping("/bobbins")
    public List<Bobbin> getAllBobbins() {
        return bobbinService.getAllBobbins();
    }

    @GetMapping("/flosses")
    public List<Floss> getAllFlosses() {
        return flossColorService.getAllFlosses();
    }

    @GetMapping("/flosses/{id}")
    public Floss getFloss(@PathVariable Long id) {
        return flossColorService.getFloss(id);
    }

//    @GetMapping("/flosses/{flossType}/{color}")
//    public FlossColor getFloss(@PathVariable String flossType, String flossColor) {
//        return flossColorService.getFloss(flossType, flossColor);
//    }

}
