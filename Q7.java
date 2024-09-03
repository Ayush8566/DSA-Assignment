
public class Q7 {

	public static void main(String[] args) {
		Employee a= new Employee("Ayush",21,54646,9012000);
		Employee a2= new Employee("Ayush2",19,78098,9087652);
		System.out.println("name\t"+"age\t"+"Eid\t"+"salary");
		a.empDisplay();
		a2.empDisplay();
	}

}
class Person{
	String name;
	int age;
	Person( String name,int age){
		this. name= name;
		this.age= age;
	}
}
 class Employee extends Person{ 
	 int Eid;
	 double salary;
	 Employee( String name,int age,int Eid,double salary){
		 super( name,age);
		 this.Eid=Eid;
		 this.salary= salary;
	 }
	 void empDisplay(){
		 System.out.println(name+"\t"+age+"\t"+Eid+"\t"+salary);
	 }
}