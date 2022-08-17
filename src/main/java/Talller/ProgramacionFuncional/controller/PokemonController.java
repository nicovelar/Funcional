package Talller.ProgramacionFuncional.controller;
import Talller.ProgramacionFuncional.model.Pokemon;
import Talller.ProgramacionFuncional.repository.IPokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
@CrossOrigin("*")
public class PokemonController {
    @Autowired
    private IPokemonRepository repo;

    @GetMapping
    public Flux<Pokemon> list() {
        return repo.list();
    }

    @GetMapping("/fire")
    public Flux<Pokemon> fireList() {
        return repo.fireList();
    }

    @GetMapping("/pikachu")
    public String pikachu() {
        return repo.pikachu();
    }

    @GetMapping("/plantListNoID")
    public Flux<Pokemon> plantListNoID() {
        return repo.plantListNoID();
    }

    @GetMapping("/waterfire")
    public Flux<Pokemon> waterFireList() {
        return repo.waterFireList();
    }

    @GetMapping("/lastPokemon")
    public Mono<Pokemon> lastPokemonInPokedex() {
        return repo.lastPokemonInPokedex();
    }

    @PostMapping
    public Mono<Pokemon> register(@RequestBody Pokemon pokemon) {
        return repo.register(pokemon);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable("id") Integer id) {
        return  repo.delete(id);
    }

    @GetMapping("/pokemongo")
    public Flux<Pokemon> allMongoPokemons() {
        return repo.findAll();
    }

    @PostMapping("/pokemongo")
    public void addPokemongo(@RequestBody final List<Pokemon> pokemons) {
        repo.saveAll(pokemons);
    }


}
