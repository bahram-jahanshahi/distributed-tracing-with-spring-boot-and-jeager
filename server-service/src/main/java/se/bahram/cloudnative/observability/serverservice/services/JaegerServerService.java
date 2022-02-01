package se.bahram.cloudnative.observability.serverservice.services;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class JaegerServerService {

    final WebClient webClient;

    public JaegerServerService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<String> get(Integer id) {
        // http://numbersapi.com/11
        return webClient.get()
                .uri("http://numbersapi.com/" + id)
                .retrieve()
                .bodyToMono(String.class);
    }
}
