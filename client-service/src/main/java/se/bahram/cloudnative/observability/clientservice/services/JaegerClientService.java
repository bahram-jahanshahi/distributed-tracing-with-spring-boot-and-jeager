package se.bahram.cloudnative.observability.clientservice.services;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class JaegerClientService {

    final WebClient webClient;

    public JaegerClientService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<String> get(Integer id) {
        return webClient.get()
                .uri("http://localhost:8082/jaeger/server/" + id)
                .retrieve()
                .bodyToMono(String.class);
    }
}
