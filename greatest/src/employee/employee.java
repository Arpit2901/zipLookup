package employee;

public class employee {
private int id;
private String name;
private double salary;
private static String company="BhavnaCorp";
private static int ctr=0;
public employee(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public void display() {
	ctr++;
	if(this.salary>50000.0)
		System.out.println("id  "+id+"name  "+name+"salary  "+salary+"company  "+company);
	else 
		System.out.println("salary less than 50 k");
	
}
public void countObjects() {
	System.out.println("coount =="+this.ctr);
}

}
