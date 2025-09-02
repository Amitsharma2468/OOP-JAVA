package staticvariable_two;

public class Test {

    public static void main(String[] args) {
        Student ob = new Student();
        System.out.println("University: " + ob.University);

        System.out.println("College: " + Student.College);
    }
}
