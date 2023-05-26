package oops;

interface Shape
{
	double PI=3.14;
	public void getArea();
}

class Circle implements Shape
{
	double r;
	public Circle(double r) {
		this.r = r;
	}
	
	
	@Override
	public void getArea() {
		
		double area = PI * r * r;
		System.out.println("Area of Circle is : "+area);
	}
	
}
class Triangle implements Shape
{
	
	double base;
	double height;
	
	public Triangle(double base, double height) {
		
		this.base = base;
		this.height=height;
		
	}
	
	@Override
	public void getArea() {
		
		double area = 0.5 * base* height;
		System.out.println("Area of Traingle is : "+area);
	}
}

class Square implements Shape
{

	double length;
	
	public Square(double length) {
		this.length=length;
	}
	
	@Override
	public void getArea() {
		double area = 2 * length;
		System.out.println("Area of square is : "+area);
	}
	
}



public class O013_AreaFinder {
	public static void main(String[] args) {
		
		Circle c = new Circle(12);
		c.getArea();
		Triangle t = new Triangle(10, 20);
		t.getArea();
		Square sq = new Square(10);
		sq.getArea();
		
	}
}
