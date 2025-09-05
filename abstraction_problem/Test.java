package abstraction_problem;

public class Test {

    public static void main(String[] args) {
        Shape s;
        s = new Circle(5);
        s.area();
        s = new Rectangle(4, 6);
        s.area();
        s = new Triangle(4, 6);
        s.area();
    }
}
