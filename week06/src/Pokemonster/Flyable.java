package Pokemonster;

public interface Flyable {
//    public Flyable(){
//    public Pokemonster.Flyable(){
//
//    }

    //Pokemon pokemon;
    //Pokemonster.Pokemon pokemon;

    //void fly();
    default void fly(){
        System.out.println("날아 갑니다!");
    }
}