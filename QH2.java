
public class QH2 {

	public static void main(String[] args) {
		
		
		Book b1[]= new Book[5];
		b1[0]=  new Book("java",2019,678.99);
		b1[1]=new Book("Science",2020,99.99);
		b1[2]=new Book("Math",2016,6778.88);
		b1[3]=new Book("sst",2014,890.99);
		b1[4]=new Book("igt",2024,1567.987);
		System.out.println("Book name\tEditiion\tBook price");
		 Book max= b1[0];
		for( int j=0;j<b1.length;j++){
			b1[j].display();
			if(b1[j].getPrice()>max.getPrice()) {
				max= b1[j];
			}}
			max.displaymax();
		}
	}


class Book{
	String BName;
	 int  BEdition;
	double BPrice;
	Book(String bname, int bedition,double bprice){
		this.BName=bname;
		this.BEdition= bedition;
		this.BPrice= bprice;
	}
	void display() { 
		System.out.println(BName+"\t\t"+BEdition+"\t\t"+BPrice);
	}
	 public double getPrice() {
		return this.BPrice;
	 }
	 void displaymax() {
		 System.out.println("the maximum price of book"+this.BPrice);
	 }
}