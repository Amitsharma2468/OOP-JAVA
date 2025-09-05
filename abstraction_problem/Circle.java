package abstraction_problem;

public class Circle extends Shape {

    Circle(double radius) {
        super(radius, radius);
    }

    @Override
    void area() {
        System.out.println("Area of Circle: " + (Math.PI * dim1 * dim1));
    }

}
