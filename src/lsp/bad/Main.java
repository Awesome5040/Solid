package lsp.bad;

public class Main {

    public static void main(String[] args) {
        Rectangle square = new Square();
        square.setHeight(10);
        square.setWidth(15);
        System.out.println(square.getHeight() + " " + square.getWidth() + " " + square.getArea());
    }
}
