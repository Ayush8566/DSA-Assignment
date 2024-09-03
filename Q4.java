import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a productno. and price:");
		 product  p[]= new product [5];
		 int pid;
		 double price;
		 for(int i=0;i<p.length;i++) {
			 p[i]= new product( sc.nextInt(), sc.nextDouble());
		 }
		 for( int i=0;i<p.length;i++) {
			 p[i].display();
		 }
		 double total_price= product.totalAmount(p);
		 
		 System.out.println(" the total price is"+total_price);
		
		
	}

}
class product{
	int pid;//product_id
	double price;//Product price
	static double tot_price=0;//total price
	 product( int pid,double price){
		super();
		 this.pid= pid;
		 this.price=price;
		 
	 }
	 void  display() {
		
		 System.out.println(pid+" "+ price);
	 }
	
	 static double  totalAmount(product[]prod) {
		  for( int i=0;i< prod.length;i++) {
			  tot_price+=prod[i].price;
		  }
		  return tot_price;
	 }
}