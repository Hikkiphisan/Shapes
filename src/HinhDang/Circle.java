package HinhDang;
public class Circle extends HinhDang.Shape {
    private double radius;

    //Gọi la overloading
    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter() {
        return 2*3.14*this.radius;
    }
    public double getArea() {
        return 3.14*this.radius*this.radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + this.radius+ ", which is a subclass of Circle" ;
    }
}
