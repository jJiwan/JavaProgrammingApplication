package pattern;
import midterm.Pokemon;
class Singleton{
    private static Singleton s = new Singleton();  // 정적 객체 생성

    //public Singleton() {
    private Singleton() {  // 생성자 캡슐화, 외부 클래스에서 객체 생성 불가
        System.out.println("Only One!");
    }

    //public static Singleton getS() {
    public static Singleton getInstance() {
        return s;
    }

    @Override
    public String toString() {
        return "싱글톤 객체 (해시코드 값 : " + Integer.toHexString(hashCode()) + ")";
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
//        Singleton singleton1 = new Singleton();  // private access
//        Singleton singleton2 = new Singleton();  // private access
        System.out.println(Singleton.getInstance());
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1.toString());
        System.out.println(s2);
        Pokemon p1 = new Pokemon();
        Pokemon p2 = new Pokemon();
        Pokemon p3 = new Pokemon();
        System.out.println(p1);
        System.out.println(p2.toString());
        System.out.println(p3);
    }
}
