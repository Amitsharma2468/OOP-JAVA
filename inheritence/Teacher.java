package inheritence;

public class Teacher extends Person {

    String subject;

    void displayInfo2() {
        displayInfo1();
        System.out.println("Subject: " + subject);
    }
}
