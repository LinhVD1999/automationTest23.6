package day5_abstract;

public abstract class Shape {
	private String color = "red";

	public String getColor() {
		return color;
	}

	public abstract void draw();
	
}
