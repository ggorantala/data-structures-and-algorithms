package classes;

public class Rectangle {
  // Define properties here
  int l;
  int b;

  // Define constructor here
  public Rectangle(int l, int b) {
    this.l = l;
    this.b = b;
  }

  public static void main(String[] args) {
    Rectangle a = new Rectangle(2, 3);  // Length = 2, Breadth = 3
    System.out.println(a.perimeter()); // Should give 10
    System.out.println(a.area()); // Should give 6
  }

  int perimeter() {
    // Complete the function
    return (2 * (this.l + this.b));
  }

  int area() {
    // Complete the function
    return this.l * this.b;
  }
}