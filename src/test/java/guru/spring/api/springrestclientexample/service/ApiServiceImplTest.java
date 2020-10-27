package guru.spring.api.springrestclientexample.service;

import guru.spring.api.domain.Pokemon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getPokemon() {
        Pokemon bulbosaur = apiService.getPokemon(1);

        assertEquals("bulbasaur", bulbosaur.getName());
    }
}