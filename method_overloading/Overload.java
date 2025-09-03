package method_overloading;

public class Overload {

    void add(int a, int b) {
        System.out.println("Sum of integers: " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Sum of doubles: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of integers: " + (a + b + c));
    }

    void add() {
        System.out.println("Nothing to add");
    }
}
