package guru.spring.api.springrestclientexample.controllers;

import guru.spring.api.springrestclientexample.service.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import static java.lang.Integer.parseInt;

@Slf4j
@Controller
public class PokemonController {

    private ApiService apiService;

    public PokemonController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping({"", "/", "index"})
    public String index(){
        return "index";
    }

    @PostMapping("/pokemon")
    public String formPost(Model model, ServerWebExchange serverWebExchange){

//        MultiValueMap<String, String> map = serverWebExchange.getFormData().block();
//
//        Integer id = new Integer(map.get("id").get(0));
//
//        log.debug("Received pokemon id: " + id.intValue());
//        //default if null or zero
//        if(id == null || id == 0){
//            log.debug("Setting id to default of 1");
//            id = 1;
//        }
        model.addAttribute("pokemon", apiService.getPokemon(
                serverWebExchange.getFormData()
                        .map(data -> new Integer(data.getFirst("id")))));

        return "pokemon";
    }
}
