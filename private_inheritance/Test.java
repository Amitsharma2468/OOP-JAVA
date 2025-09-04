package private_inheritance;

public class Test {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("Alice");
        t1.setAge(30);
        t1.setSubject("Mathematics");
        t1.displayInfo();

        Teacher t2 = new Teacher();
        t2.setName("Bob");
        t2.setAge(40);
        t2.setSubject("Physics");
        t2.displayInfo();
    }
}
