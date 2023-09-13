package version03;

public class RubberDuck extends Duck implements Quackable{

    public RubberDuck() { // Art + insert
        this.name = "러버덕";
    }

    @Override
    public void quack() {
        System.out.println("삑삑");
    }

    @Override
    public void display() {

    }
}
