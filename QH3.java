
public class QH3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Distance d1= new Distance(5,00);
		Distance d2= new Distance(2,000);
		System.out.println("two distnce are: ");
		d1.display();
		d2.display();
		Distance d3= d1.Sum(d1, d2);
		System.out.println("the sum is : ");
		d3.display();
	}

}

class Distance{
	int meters;
	double centimeters;
	Distance( int meters,double centimeters){
		if( centimeters>=100) {
			meters+= centimeters/100;
			centimeters%= centimeters;
		}
		this.meters= meters;
		this.centimeters= centimeters;
	}
	 void display() {
		 System.out.println("meter is="+ meters+"centimeters is"+ centimeters);
		 
	 }
	 Distance Sum( Distance d1,Distance d2) {
		 int meter= d1.meters+d2.meters;
		 double centimeter=d1.centimeters+d2.centimeters;
		 return  new Distance( meter,centimeter);
		 
	 }
	
}