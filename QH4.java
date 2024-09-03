
public class QH4 {

	public static void main(String[] args) {
		 PointType  point= new PointType(1,2);
		 System.out.println("points:");
		 point.printCoordinates();
		 point.setCoordinate(5, 7);
		 System.out.println("now the new point is ");
		 System.out.println("("+point.x()+","+point.y()+")");
		 CircleType circle= new CircleType(1,3,4);
		 circle.printRadius();
	   circle.setRadius(15);
	   System.out.println("updated ");
	   circle.printRadius();
	   System.out.println("Circle aea is"+ circle.getArea());
	   System.out.println("the circle circumference is :"+circle.getCircumference());
		 

	}

}
 class PointType{
	 double x,y;
	 PointType( double x,double y){
		 this.x= x;
		 this.y= y;
	 }
	  public void printCoordinates() {
		// TODO Auto-generated method stub
		
	}
	void setCoordinate( double x,double y) {
		  this.x= x;
			 this.y= y;
	  }
	   void printCordinate() {
		   System.out.println("center"+"("+x+","+y+")");
		   
	   }
	   double x() {
		   return this.x;
	   }
	   double y() {
		   return this.y;
	   }
 }
  class CircleType extends PointType{
	  
	double radius;
	CircleType(double x, double y, double radius) {
		super(x, y);
		this.radius= radius;
	}
	void setRadius( double radius) {
		this.radius= radius;
	}
	void printRadius() {
		System.out.println("Radius is: "+radius);
	}
	 void printCenter() {
		 System.out.println("Center is"+ this.x+" "+ this.y);
	 }
	 double getArea() {
		 return (3.14*this.radius*this.radius);
	 }
	 double getCircumference() {
		 return 2*3.14*this.radius;
	 }

  }