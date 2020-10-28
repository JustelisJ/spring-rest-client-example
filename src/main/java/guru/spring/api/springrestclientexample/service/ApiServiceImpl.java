package guru.spring.api.springrestclientexample.service;

import guru.spring.api.domain.Pokemon;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;
    private final String apiUrl;

    public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String apiUrl) {
        this.restTemplate = restTemplate;
        this.apiUrl = apiUrl;
    }

    @Override
    public Pokemon getPokemon(int id) {
        Pokemon pokemon = restTemplate.getForObject(apiUrl + id, Pokemon.class);
        return pokemon;
    }

    @Override
    //TODO
    public Mono<Pokemon> getPokemon(Mono<Integer> id) {
//        return WebClient
//                .create(apiUrl + id.block())//fix blocking
//                .get()
//                .accept(MediaType.APPLICATION_JSON)
//                .exchange()
//                .flatMap(clientResponse -> clientResponse.bodyToMono(Pokemon.class));
        return null;
    }
}
