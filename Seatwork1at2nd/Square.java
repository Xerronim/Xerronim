package Seatwork1at2nd;

public class Square
{
	private double height;
	private double width;
	private double surfaceArea;
	
	public Square(double h, double w)
	{
		height = h;
		width = w;
	}
	
	public void setHeight(double h)
	{
		height = h;
	}
	public double getHeight()
	{
		return height;
	}
	
	public void setWidth(double w)
	{
		width = w;
	}
	public double getWidth()
	{
		return width;
	}
	
	public double computeSurfaceArea()
	{
		surfaceArea = height * width;
		
		return surfaceArea;
	}
        
	public static void main(String[] args)
	{

		double height = 10.0;
		double width = 8.0;
		double depth = 13.0;
		
		Square aSquare = new Square(10.0, 8.0);
		Cube aCube = new Cube(12.0, 10.0, 13.0);
		
		System.out.println("The square has the following values: ");
		System.out.println("Height: " + aSquare.getHeight());
		System.out.println("Width: " + aSquare.getWidth());
		System.out.println("Surface Area: " + aSquare.computeSurfaceArea());
		
		System.out.println("\nThe cube has the following values: ");
		System.out.println("Height: " + aCube.getHeight());
		System.out.println("Width: " + aCube.getWidth());
		System.out.println("Depth: " + aCube.getDepth());
		System.out.println("Surface Area: " + aCube.computeSurfaceArea());
	}
}