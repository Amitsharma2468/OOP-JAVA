package method;

public class Test {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.name = "Alice";
        teacher1.gender = "Female";
        teacher1.phone = 987654321;
        teacher1.displayInfo();

        Teacher teacher2 = new Teacher();
        teacher2.name = "Bob";
        teacher2.gender = "Male";
        teacher2.phone = 123456789;
        teacher2.displayInfo();
    }
}
