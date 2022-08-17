package Talller.ProgramacionFuncional.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;
@Document(collation = "pokemones")
public class Pokemon {
    @Id
    private Integer pokemonID;
    private String name;
    private String type;

    public Pokemon() {

    }
    public Integer getPokemonID() {
        return pokemonID;
    }
    public Pokemon(Integer pokemonID, String name, String type) {
        this.pokemonID = pokemonID;
        this.name = name;
        this.type = type;
    }

    public Pokemon( String name, String type) {
        this.name = name;
        this.type = type;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(pokemonID, pokemon.pokemonID) && Objects.equals(name, pokemon.name) && Objects.equals(type, pokemon.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(pokemonID, name, type);
    }
    public void setPokemonID(Integer pokemonID) {
        this.pokemonID = pokemonID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "pokemonID=" + pokemonID +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
