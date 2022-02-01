package se.bahram.cloudnative.observability.serverservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import se.bahram.cloudnative.observability.serverservice.services.JaegerServerService;

@RestController
@RequestMapping("/jaeger/server")
public class JaegerServerController {

    private final JaegerServerService jaegerServerService;

    public JaegerServerController(JaegerServerService jaegerServerService) {
        this.jaegerServerService = jaegerServerService;
    }

    @GetMapping("/{id}")
    public Mono<String> get(@PathVariable("id") Integer id) {
        return this.jaegerServerService.get(id);
    }
}
