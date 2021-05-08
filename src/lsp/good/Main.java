package lsp.good;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(10, 15));
        shapes.add(new Square(10));
        shapes.forEach(shape -> System.out.println(shape.getArea()));
    }

}
