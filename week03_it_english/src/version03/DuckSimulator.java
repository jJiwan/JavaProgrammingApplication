package version03;

public class DuckSimulator {
    public static void main(String[] args) {
        ReadHeadDuck readHeadDuck = new ReadHeadDuck();
        readHeadDuck.fly();

        DecoyDuck decoyDuck= new DecoyDuck();
//        decoyDuck.fly(); // 없는 기능
//        decoyDuck.quack(); // 없는 기능

        RubberDuck rubberDuck = new RubberDuck();
        MallardDuck mallardDuck = new MallardDuck();
        rubberDuck.quack();

//        rubberDuck.fly(); // 없는 기능
        mallardDuck.swim();

        mallardDuck.fly();
        mallardDuck.quack();
    }
}
