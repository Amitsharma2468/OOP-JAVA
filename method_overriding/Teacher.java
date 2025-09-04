package method_overriding;

public class Teacher extends Person {

    String subject;

    @Override
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}
