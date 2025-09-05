package polymorphism_two;

public class Triangle extends Shape {

    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        System.out.print("Area of triangle: ");
        return 0.5 * base * height;
    }

}
