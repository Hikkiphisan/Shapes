package HInhchunhatreal;
public class Rectangle extends HinhDang.Shape {
    private double width;
    private double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }
    public Rectangle() {
        width = length = 1.0;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getPerimeter() {
        return (this.length + this.width)*2 ;
    }
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "A Rectangle with width " + this.width + " and length= " + this.length  +", which is a subclass of yyy";
    }
}
