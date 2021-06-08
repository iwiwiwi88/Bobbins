package pl.iwi.floss.bobbins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.iwi.floss.bobbins.service.HelloService;

@RestController
public class HelloController {

    private HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/")
    public String hello() {
        return helloService.hello();
    }

}
