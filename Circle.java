public class Circle implements Shape2D {
  double radius = 0.0;

  public Circle(double inputRadius) {
    this.radius = inputRadius;
  }

  public double getArea() {
    return Shape2D.PI * (this.radius * this.radius);
  }

  public double getPerimeter(){
    return 2 * Shape2D.PI * this.radius;
  }  
}
