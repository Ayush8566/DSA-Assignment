 abstract class Shape{ 
	 abstract double  getArea();
 }
 class Square extends Shape{
	 double side;
	 Square(double s){
		 this.side=s;
		 
	 }
	 double getArea() {
		 return side*side;
	 }
 }
 class  Triangle extends Shape{
	 double base,height;
	 Triangle( double b,double h){
		this. base=b;
		 height=h;
	 }
	 double getArea() {
		 return 0.5*base*height;
	 }
 }
 class Circle extends Shape{
	double  radius;
	 Circle( double r){
		 this.radius=r;
	 }
	  double getArea() {
		 return (3.14*radius*radius);
	 }
 }
public class Q6 {

	public static void main(String[] args) {
		Shape  s1= new Triangle(4,3);
		Shape  s2= new Square(4);
	    Shape  s3= new Circle(4.5);
		
		System.out.println("Area of traingle  "+s1.getArea());
		System.out.println("Area of Square    "+s2.getArea());
		System.out.println("Area of cirle     "+s3.getArea());
	}

}
