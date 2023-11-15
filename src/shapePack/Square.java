package shapePack;

public class Square extends Rectangle {
	
    public Square() {
        // Implicit call to superclass (Rectangle) constructor
    }

    public void setSide(double side) {
        // Set both the width and height to the given side value
        this.width = side;
        this.height = side;
    }

    @Override
    public double calculateArea() {
        // Since width and height are the same, we could just return width * width
        return width * width;
    }
	
	
    public void printSquare() {
        System.out.println("This is Square. Subclass of Rectangle");
    }
}
