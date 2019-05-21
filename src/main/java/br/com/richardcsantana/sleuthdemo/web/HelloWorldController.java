package br.com.richardcsantana.sleuthdemo.web;

import br.com.richardcsantana.sleuthdemo.services.HelloWorldService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class HelloWorldController {

    private final HelloWorldService service;

    @GetMapping(path = "/async")
    public void getHelloWorldAsync(){
        log.info("teste");
        service.getHelloWorldAsync();
    }

    @GetMapping(path = "/sync")
    public void getHelloWorld(){
        log.info("teste");
        service.getHelloWorld();
    }
}
