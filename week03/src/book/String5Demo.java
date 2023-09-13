package book;

public class String5Demo {
    public static void main(String[] args) {
        // Class method (Static method)
        String version = String.format("%s %d", "JDK", 14);
        System.out.println(version);

        String fruits = String.join(" / ", "apple", "banana", "cherry", "durian");
        System.out.println(fruits);

        String pi = String.valueOf(3.14);
        System.out.println(pi);

        System.out.println(3.14 + 1.7);
        System.out.println(String.valueOf(3.14) + 1.7);

        // Class field (Static field)
        System.out.println(Math.PI);
    }
}
