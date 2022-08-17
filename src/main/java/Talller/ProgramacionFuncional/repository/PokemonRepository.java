package Talller.ProgramacionFuncional.repository;
import Talller.ProgramacionFuncional.model.Pokemon;
import org.reactivestreams.Publisher;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class PokemonRepository implements IPokemonRepository {
    @Override
    public Flux<Pokemon> list() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1,"Pikachu", "Eléctrico"));
        pokemons.add(new Pokemon(2,"Charmander", "Fuego"));
        pokemons.add(new Pokemon(3,"Blastoise", "Agua"));
        pokemons.add(new Pokemon(4,"Metapod", "Bicho"));
        return Flux.fromIterable(pokemons);
    }

    @Override
    public Mono<Pokemon> register(Pokemon pokemon) {
        return Mono.just(pokemon);
    }

    @Override
    public Flux<Pokemon> fireList(){
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1,"Pikachu", "Eléctrico"));
        pokemons.add(new Pokemon(2,"Charmander", "Fuego"));
        pokemons.add(new Pokemon(3,"Blastoise", "Agua"));
        pokemons.add(new Pokemon(4,"Metapod", "Bicho"));
        return Flux.fromIterable(pokemons).filter(pokemon -> pokemon.getType().equals("Fuego"));
    }

    @Override
    public String pikachu(){
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1,"Pikachu", "Eléctrico"));
        pokemons.add(new Pokemon(2,"Charmander", "Fuego"));
        pokemons.add(new Pokemon(3,"Blastoise", "Agua"));
        pokemons.add(new Pokemon(4,"Metapod", "Bicho"));

        String pikachu = pokemons.stream()
                .map(pokemon -> (pokemon.getName())).collect(Collectors.toList()).get(0);
        return pikachu;
    }

    @Override
    public Flux<Pokemon> plantListNoID(){
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon("Bulbasaur", "Planta"));
        pokemons.add(new Pokemon("Charmander", "Fuego"));
        pokemons.add(new Pokemon("Blastoise", "Agua"));
        pokemons.add(new Pokemon("Bellsprout", "Planta"));
        return Flux.fromIterable(pokemons).filter(pokemon -> pokemon.getType().equals("Planta"));
    }

    @Override
    public Flux<Pokemon> waterFireList() {
        List<Pokemon> pokemons1 = new ArrayList<>();
        pokemons1.add(new Pokemon(1,"TalonFlame", "Fuego"));
        pokemons1.add(new Pokemon(2,"Charmander", "Fuego"));
        Flux<Pokemon> fluxpokemons1 = Flux.fromIterable(pokemons1);


        List<Pokemon> pokemons2 = new ArrayList<>();
        pokemons2.add(new Pokemon(3,"Blastoise", "Agua"));
        pokemons2.add(new Pokemon(4,"Lapras", "Agua"));
        Flux<Pokemon> fluxpokemons2 = Flux.fromIterable(pokemons2);

        return Flux.merge(fluxpokemons1,fluxpokemons2);
        }

    @Override
    public Mono<Void> delete(Integer id) {
        return Mono.empty();
    }

    @Override
    public Mono<Pokemon> lastPokemonInPokedex() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1,"Bulbasaur", "Planta"));
        pokemons.add(new Pokemon(2,"Charmander", "Fuego"));
        pokemons.add(new Pokemon(3,"Blastoise", "Agua"));
        pokemons.add(new Pokemon(4,"Bellsprout", "Planta"));
        return Flux.fromIterable(pokemons).reduce((pokemonid1,pokemonid2) -> pokemonid1.getPokemonID() > pokemonid2.getPokemonID() ? pokemonid1:pokemonid2);
    }


    @Override
    public <S extends Pokemon> Mono<S> insert(S entity) {
        return null;
    }

    @Override
    public <S extends Pokemon> Flux<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends Pokemon> Flux<S> insert(Publisher<S> entities) {
        return null;
    }

    @Override
    public <S extends Pokemon> Mono<S> findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Pokemon> Flux<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Pokemon> Flux<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Pokemon> Mono<Long> count(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Pokemon> Mono<Boolean> exists(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Pokemon, R, P extends Publisher<R>> P findBy(Example<S> example, Function<FluentQuery.ReactiveFluentQuery<S>, P> queryFunction) {
        return null;
    }

    @Override
    public Flux<Pokemon> findAll(Sort sort) {
        return null;
    }

    @Override
    public <S extends Pokemon> Mono<S> save(S entity) {
        return null;
    }

    @Override
    public <S extends Pokemon> Flux<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends Pokemon> Flux<S> saveAll(Publisher<S> entityStream) {
        return null;
    }

    @Override
    public Mono<Pokemon> findById(Integer integer) {
        return null;
    }

    @Override
    public Mono<Pokemon> findById(Publisher<Integer> id) {
        return null;
    }

    @Override
    public Mono<Boolean> existsById(Integer integer) {
        return null;
    }

    @Override
    public Mono<Boolean> existsById(Publisher<Integer> id) {
        return null;
    }

    @Override
    public Flux<Pokemon> findAll() {
        return null;
    }

    @Override
    public Flux<Pokemon> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public Flux<Pokemon> findAllById(Publisher<Integer> idStream) {
        return null;
    }

    @Override
    public Mono<Long> count() {
        return null;
    }

    @Override
    public Mono<Void> deleteById(Integer integer) {
        return null;
    }

    @Override
    public Mono<Void> deleteById(Publisher<Integer> id) {
        return null;
    }

    @Override
    public Mono<Void> delete(Pokemon entity) {
        return null;
    }

    @Override
    public Mono<Void> deleteAllById(Iterable<? extends Integer> integers) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll(Iterable<? extends Pokemon> entities) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll(Publisher<? extends Pokemon> entityStream) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll() {
        return null;
    }
}

