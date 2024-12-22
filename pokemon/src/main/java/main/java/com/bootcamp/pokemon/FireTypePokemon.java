package main.java.com.bootcamp.pokemon;

import java.util.HashSet;
import java.util.Set;
import main.java.com.bootcamp.pokemon.Moves.FireMove;

public class FireTypePokemon extends Pokemon<FireMove>{
  private Set<FireMove> moves;

  public FireTypePokemon(String name){
    super(name, PokemonType.FIRE);
    this.moves = new HashSet<>();
  }

  @Override
  public boolean learnMove(FireMove move){
    if (moves.size() < 4 && !moves.contains(move)){
      moves.add(move);
      return true;
    }
    return false;
  }

  @Override
  public boolean forgetMove(FireMove move){
    if (!moves.contains(move)){
      throw new RuntimeException("Move cannot found");
    }
    moves.remove(move);
  return true;
  }


  @Override
  public String specialAbility(){
    return this.getName() + "Heat up the area";
  }
  public static void main(String[] args) {
    FireTypePokemon pokemon1 = new FireTypePokemon("FirePokemon 1");
    System.out.println("Name: " + pokemon1.getName());
    System.out.println("Type: " + pokemon1.getType().toLowerCase());
    pokemon1.moves.add(FireMove.FIRE_BALL);
    pokemon1.moves.forEach(move -> System.out.println(move));
  }
}
