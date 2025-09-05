package polymorphism;

public class Test {

    public static void main(String[] args) {
        Person p = new Person();
        p.displayInfo();
        p = new Student();
        p.displayInfo();
        p = new Teacher();
        p.displayInfo();
    }
}
