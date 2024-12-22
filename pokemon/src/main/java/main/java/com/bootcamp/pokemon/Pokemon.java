package main.java.com.bootcamp.pokemon;

import java.util.HashSet;
import java.util.Set;
import main.java.com.bootcamp.pokemon.Moves.Moves;

public abstract class Pokemon<T extends Moves>{
  private String name;
  private PokemonType pokemonType;
  private Set<T> moves;

  public Pokemon(String name, PokemonType pokemonType){
    this.name = name;
    this.pokemonType = pokemonType;
    this.moves = new HashSet<>();
  }

  public String getName(){
    return this.name;
  }

  public PokemonType getPorPokemonType(){
    return this.pokemonType;
  }

  public boolean learnMove(T move){
    if (moves.size() < 4 && !moves.contains(move)){
      moves.add(move);
      return true;
    }
    return false;
  }

  public boolean forgetMove(T move){
    if (!moves.contains(move)){
      throw new RuntimeException("Move cannot found");
    }
    moves.remove(move);
  return true;
  }
  
  public Set<T> getMoves(){
    return this.moves;
  }
  public String getType(){
    return this.pokemonType.name();
  }
  public abstract String specialAbility();
}
