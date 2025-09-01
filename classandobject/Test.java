package classandobject;

public class Test {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.name = "Alice";
        teacher1.gender = "Female";
        teacher1.phone = 987654321;

        System.out.println("Name: " + teacher1.name);
        System.out.println("Gender: " + teacher1.gender);
        System.out.println("Phone: " + teacher1.phone);

        Teacher teacher2 = new Teacher();
        teacher2.name = "Bob";
        teacher2.gender = "Male";
        teacher2.phone = 123456789;

        System.out.println("Name: " + teacher2.name);
        System.out.println("Gender: " + teacher2.gender);
        System.out.println("Phone: " + teacher2.phone);
    }
}
