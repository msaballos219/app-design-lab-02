package shapeProcess;

import shapePack.*;
import java.util.Scanner;

public class ShapeExecute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the side of the square:");
        double side = scanner.nextDouble();
        
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        double breadth = scanner.nextDouble();
        
        Square square = new Square();
        square.setSide(side);
        double squareArea = square.calculateArea();
        
        Rectangle rectangle = new Rectangle();
        rectangle.setDimensions(length, breadth);
        double rectangleArea = rectangle.calculateArea();
        
        System.out.println("RESULT: Area of Square= " + squareArea);
        System.out.println("RESULT: Area of Rectangle= " + rectangleArea);
        
        scanner.close();
    }
}
