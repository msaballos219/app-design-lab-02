package shapePack;


public class Rectangle extends Shape {
	
    protected double width;
    protected double height;

    public Rectangle() {
    }

    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
	
	
	
    public void printRectangle() {
        System.out.println("This is Rectangle. Subclass of Shape");
    }
}