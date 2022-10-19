package classes.rect;

public class Rectangle {
    // Define properties here
    private int length;
    private int breadth;

    // Define constructor here
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int perimeter() {
        // Complete the function
        return (2 * (this.length + this.breadth));
    }

    int area() {
        // Complete the function
        return this.length * this.breadth;
    }

    boolean isSquare() {
        return this.length == this.breadth;
    }
}