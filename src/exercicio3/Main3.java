package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(5,10));
        shapes.add(new Square(4));

        for (Shape shape : shapes){
            System.out.println("Área: " + shape.getArea());
        }
    }
}
