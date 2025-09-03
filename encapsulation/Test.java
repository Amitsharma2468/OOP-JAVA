package encapsulation;

public class Test {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("John");
        p.setAge(30);
        System.out.println("Name: " + p.getName() + ", Age: " + p.getAge());
    }
}
