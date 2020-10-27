package guru.spring.api.springrestclientexample.service;

import guru.spring.api.domain.Pokemon;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Pokemon getPokemon(int id) {
        Pokemon pokemon = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon/" + id + "/", Pokemon.class);
        return pokemon;
    }
}
