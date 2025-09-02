package staticvariable_one;

public class Student {

    String name;
    int id;
    static String university = "SUST";

    Student(String n, int i) {
        name = n;
        id = i;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("University: " + university);
    }

}
