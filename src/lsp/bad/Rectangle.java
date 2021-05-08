package lsp.bad;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle() {
    }

    public double getArea() {
        return width * height;
    }

    public void setWidth(final double width) {
        this.width = width;
    }

    public void setHeight(final double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
