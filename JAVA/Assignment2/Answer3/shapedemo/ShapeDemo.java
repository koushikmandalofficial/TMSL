package shapedemo;
import java.util.Scanner;
import mypackage.Circle;
import mypackage.Shape;
import mypackage.Square;

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the shape type (Circle/Square): ");
        String shapeType = scanner.nextLine();

        Shape shape = null;

        if (shapeType.equalsIgnoreCase("Circle")) {
            shape = new Circle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            shape = new Square();
        } else {
            System.out.println("Invalid shape type.");
            System.exit(0);
        }

        shape.draw();
    }
}
