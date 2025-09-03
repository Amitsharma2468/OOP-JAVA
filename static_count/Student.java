package static_count;

public class Student {

    static int count = 0;

    Student() {
        count++;
    }

    void display() {
        System.out.println("Number of Student objects created: " + count);
    }
}
