package br.com.richardcsantana.sleuthdemo.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
@AllArgsConstructor
public class HelloWorldService {

    private final RestTemplate restTemplate;

    @Async
    public void getHelloWorldAsync() {
        log.info("Hello World");
        restTemplate.getForEntity("http://localhost:8081/async", void.class);
    }

    public void getHelloWorld() {
        log.info("Hello World");
        restTemplate.getForEntity("http://localhost:8081/sync", void.class);
    }
}
