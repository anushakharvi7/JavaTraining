package utilityDemo;

class Circle {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
	setRadius(radius);
	}
	
}

class UtilityOfCircle{
	public static double diameter(Circle r) {
		return r.getRadius()*2;
		
	}
	public static double area(Circle r) {
		return (22.0/7.0)*(r.getRadius()*r.getRadius());
	}
}


public class Driver {

	public static void main(String[] args) {
		
		Circle r1 = new Circle(10);
		System.out.println(UtilityOfCircle.diameter(r1));
		System.out.println(UtilityOfCircle.area(r1));
		
		Circle r2 = new Circle(20);
		System.out.println(UtilityOfCircle.diameter(r2));
		System.out.println(UtilityOfCircle.area(r2));
	}
	}


