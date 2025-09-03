package method_overloading;

public class Test {

    public static void main(String[] args) {
        Overload ob = new Overload();
        ob.add(5, 10);
        ob.add(5.5, 10.5);
        ob.add(5, 10, 15);
        ob.add();
    }
}
