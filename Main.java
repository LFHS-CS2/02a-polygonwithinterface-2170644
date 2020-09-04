import java.util.*;

class Main {
  public static void main(String[] args) {

  }
public static Shape2D[] getShapes() {
  Triangle triangle = new Triangle(1,2,3);
  Rectangle rectangle = new Rectangle(5,4);
  Circle circle = new Circle(5.0);
  Shape2D[] shapes = new Shape2D[3];
  shapes[0] = triangle;
  shapes[1] = rectangle;
  shapes[2] = circle;
  return shapes;
}

}
