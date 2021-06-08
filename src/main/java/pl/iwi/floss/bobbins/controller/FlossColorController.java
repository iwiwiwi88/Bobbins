package pl.iwi.floss.bobbins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.iwi.floss.bobbins.service.FlossColorService;

@RestController
public class FlossColorController {

    private FlossColorService flossColorService;

    public FlossColorController(FlossColorService flossColorService) {
        this.flossColorService = flossColorService;
    }

    @GetMapping("/flosses")
    public String getFlosses() {
        return flossColorService.getAllFlosses();
    }

}
