package HinhDang;

public class Square extends HInhchunhatreal.Rectangle {
    private double width;

    public Square(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
    }
    public Square() {
        width = 1.0;
    }
    public Square(double width, double length) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double getPerimeter() {
        return this.width*4 ;
    }
    public double getArea() {
        return this.width * this.width;
    }

    @Override
    public String toString() {
        return "A Rectangle with width " + this.width + ", which is a subclass of yyy";
    }
}
