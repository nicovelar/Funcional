package Talller.ProgramacionFuncional.repository;
import Talller.ProgramacionFuncional.model.Pokemon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Repository
public interface IPokemonRepository extends ReactiveMongoRepository<Pokemon,Integer> {

    Flux<Pokemon> list();
    Mono<Pokemon> register(Pokemon pokemon);
    Flux<Pokemon> fireList();
    String pikachu();
    Flux<Pokemon> plantListNoID();
    Flux<Pokemon> waterFireList();
    Mono<Void> delete(Integer id);
    Mono<Pokemon> lastPokemonInPokedex();


}
