package Pokemonster;
public interface Flyable {
//    public Flyable(){
//
//    }

    //Pokemon pokemon;

    //void fly();
    default void fly(){
        System.out.println("날아 갑니다!");
    }
}