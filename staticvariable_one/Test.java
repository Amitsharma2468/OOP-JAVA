package staticvariable_one;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 1);
        Student s2 = new Student("Bob", 2);

        s1.displayInfo();
        s2.displayInfo();
    }
}
