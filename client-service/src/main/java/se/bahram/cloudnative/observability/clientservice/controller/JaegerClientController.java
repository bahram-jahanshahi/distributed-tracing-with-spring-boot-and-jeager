package se.bahram.cloudnative.observability.clientservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import se.bahram.cloudnative.observability.clientservice.services.JaegerClientService;

@RestController
@RequestMapping("/jaeger/client")
public class JaegerClientController {


    private final JaegerClientService jaegerClientService;

    public JaegerClientController(JaegerClientService jaegerClientService) {
        this.jaegerClientService = jaegerClientService;
    }

    @GetMapping("/{id}")
    public Mono<String> get(@PathVariable("id") Integer id) {
        return jaegerClientService.get(id);
    }
}
