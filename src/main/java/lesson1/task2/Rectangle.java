package lesson1.task2;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }

    public double calculateArea() {
        return this.width * this.height;
    }

    public boolean perimeterMoreArea() {
        return this.calculateArea() > this.calculatePerimeter();
    }
}
