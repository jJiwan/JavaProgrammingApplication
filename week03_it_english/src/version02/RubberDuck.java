package version02;

public class RubberDuck extends Duck{
    @Override
    public void fly() {
        // do nothing
    }
    //    @Override
//    public void fly() {
//        System.out.print(this.name + "이 날다");
//    }

    public RubberDuck() { // Art + insert
        this.name = "러버덕";
    }

    @Override
    public void quack() {
        super.quack();
    }

    @Override
    public void display() {

    }
}
