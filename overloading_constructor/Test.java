package overloading_constructor;

public class Test {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("Alice", "Female");
        Teacher teacher3 = new Teacher("Bob", "Male", 1234567890);

        teacher1.displayInfo();
        teacher2.displayInfo();
        teacher3.displayInfo();
    }
}
