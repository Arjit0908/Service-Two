package com.example.microservicetwo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class ServiceOneController {

    private WebClient webClient;

    public ServiceOneController(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8000").build();
    }

    @GetMapping("/apiv1")
    public String getName() throws Exception {

        // Send audit data to http://localhost:7000/api/data
//        ServiceTwoEntity serviceTwoEntity = new ServiceTwoEntity(); // Create audit data object
//        webClient.post()
//                .uri("/api/data")
//                .bodyValue(serviceTwoEntity)
//                .retrieve()
//                .bodyToMono(String.class)
//                .block(); // Send POST request

        return "Arjit hai Don toh Tejas hai kaun " ;
    }

    @GetMapping("/api2")
    public String getPost(){
        return "Tejas hai Don toh Yuvi hai kaun";
    }
}
