package schoolmanagement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj1=new firstyear();
		obj1.print();
		student obj2=new secondyear();
		obj2.print();
		student obj=new finalyear();
		obj.print();
		course a=new bca();
		a.courses();
		course b=new bsc();
		b.courses();
	}

}
