package lsp.good;

public class Rectangle implements Shape{

    private double width;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    private double height;

    @Override
    public double getArea() {
        return width * height;
    }
}
