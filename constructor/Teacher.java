package constructor;

public class Teacher {

    String name, gender;
    int phone;

    public Teacher() {
        System.out.println("No Value");
    }     //default constructor

    public Teacher(String n, String g, int p) {
        name = n;
        gender = g;
        phone = p;
    }     //parameterized constructor

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
        System.out.println("\n");
    }
}
