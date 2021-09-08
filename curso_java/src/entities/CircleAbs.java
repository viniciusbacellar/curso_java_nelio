package entities;

import entities.enums.Color;

public class CircleAbs extends Shape {

	
	private Double radius;
	
	public CircleAbs() {
		super();
	}
	
	public CircleAbs(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}



	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

}
