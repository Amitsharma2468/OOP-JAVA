package polymorphism_two;

public class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        System.out.print("Area of rectangle: ");
        return length * width;
    }
}
