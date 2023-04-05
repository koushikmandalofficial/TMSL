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

        Shape s1 = getShape(shapeType);
        s1.draw();
        
    }

    private static Shape getShape(String str) {
        Shape s = null;
        if (str.equalsIgnoreCase("Circle")) {
            s = new Circle();
        } else if (str.equalsIgnoreCase("Square")) {
            s = new Square();
        } else {
            System.out.println("Invalid shape type.");
            System.exit(0);
        }
        return s;
    }
}
