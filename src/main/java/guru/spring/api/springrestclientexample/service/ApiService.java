package guru.spring.api.springrestclientexample.service;

import guru.spring.api.domain.Pokemon;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ApiService {

    Pokemon getPokemon(int id);

    Mono<Pokemon> getPokemon(Mono<Integer> id);

}
