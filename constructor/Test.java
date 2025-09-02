package constructor;

public class Test {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("John Doe", "Male", 123456789);
        teacher1.displayInfo();
        Teacher teacher2 = new Teacher("Jane Smith", "Female", 987654321);
        teacher2.displayInfo();
        Teacher teacher3 = new Teacher();
        teacher3.displayInfo();
    }
}
