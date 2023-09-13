package book;

public class AnimalDemo {
    public static void main(String[] args) {
        Eagle e1 = new Eagle();
        Tiger t1 = new Tiger();
        Eagle e2 = new Eagle();
        Goldfish g1 = new Goldfish();

        g1.swim();
        g1.sleep();
        t1.run();
        t1.eat(("멧돼지"));
        e1.sleep();
        e2.fly();
        e2.eat("쥐");
    }
}
