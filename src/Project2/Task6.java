package Project2;

import java.awt.*;

public interface Task6 {
    /*
Task 6:

Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimiter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code.
*/

    double calculateArea();

    double calculatePerimeter();
}
class Circle implements Task6 {

    private double circleRadius;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * circleRadius * circleRadius;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * Math.PI * circleRadius;
        return perimeter;
    }

    public static void main(String[] args) {

        Circle obj = new Circle(10);
        System.out.println(obj.calculateArea());
        System.out.println(obj.calculatePerimeter());


    }
}
class Square implements Task6 {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        double area = sideLength * sideLength;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 4 * sideLength;
        return perimeter;
    }

    public static void main(String[] args) {


        Square obj = new Square(7);
        System.out.println(obj.calculateArea());
        System.out.println(obj.calculatePerimeter());


    }
}
