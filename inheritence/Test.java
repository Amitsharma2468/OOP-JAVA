package inheritence;

public class Test {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Alice";
        t1.age = 30;
        t1.subject = "Mathematics";
        t1.displayInfo2();

        Teacher t2 = new Teacher();
        t2.name = "Bob";
        t2.age = 40;
        t2.subject = "Physics";
        t2.displayInfo2();
    }
}
