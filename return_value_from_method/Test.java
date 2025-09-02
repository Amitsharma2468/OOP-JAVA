package return_value_from_method;

public class Test {

    public static void main(String[] args) {
        ReturnValue ob1 = new ReturnValue();
        System.out.println("Square of 5: " + ob1.square(5));
        ReturnValue ob2 = new ReturnValue();
        System.out.println("Square of 10: " + ob2.square(10));
    }
}
