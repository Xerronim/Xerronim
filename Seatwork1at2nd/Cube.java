package Seatwork1at2nd;

public class Cube extends Square
{
	private double height;
	private double width;
	private double depth;
	private double surfaceArea;
	
	public Cube(double h, double w, double d)
	{
		super(h, w);
		depth = d;
	}
	
	public void setDepth(double d)
	{
		depth = d;
	}
	public double getDepth()
	{
		return depth;
	}
	
	public double computeSurfaceArea()
	{
		height = super.getHeight();
		width = super.getWidth();

		surfaceArea = (2 * height * width) + (2 * width * depth) + (2 * height * depth);
		
		return surfaceArea;
	}
}
