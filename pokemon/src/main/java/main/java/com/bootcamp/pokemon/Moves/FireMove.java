package main.java.com.bootcamp.pokemon.Moves;

public enum FireMove implements Moves{
  FIRE_BALL("Fire ball", MoveCategory.SPECIAL, 20, 1);

  private final String name;
  private final MoveCategory category;
  private final int power;
  private final int generation;

  private FireMove(String name, MoveCategory category, int power, int generation){
    this.name = name;
    this.category = category;
    this.power = power;
    this.generation = generation;
  }
  @Override
  public String getName(){
    return this.name;
  }

  @Override
  public MoveCategory getCategory(){
    return this.category;
  }

  @Override
  public int getPower(){
    return this.power;

  }

  @Override
  public int getGeneration(){
    return this.generation;
  }
}
