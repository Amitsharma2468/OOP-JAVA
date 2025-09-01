package parameterisedmethod;

public class Test {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.setInfo("Alice", "Female", 987654321);
        teacher1.displayInfo();

        Teacher teacher2 = new Teacher();
        teacher2.setInfo("Bob", "Male", 123456789);
        teacher2.displayInfo();
    }
}
