package method_overriding;

public class Test {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Alice";
        t1.age = 30;
        t1.subject = "Mathematics";
        t1.displayInfo();

        Person p1 = new Person();
        p1.name = "Bob";
        p1.age = 40;
        p1.displayInfo();
    }
}
