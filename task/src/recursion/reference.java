package recursion;

import java.util.Scanner;

public class reference {
	private int id;
	private String name;
	private static String company ="BHavnaCorps";
	public void show() {
		System.out.println("id="+id+"name="+name+"company="+company);
	}
	public reference(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public static void showObject(reference obj) {
		
		System.out.println("id="+obj.id+"name="+obj.name+"company="+company);
	}
	public static reference details() {
		Scanner sc= new Scanner(System.in);
		System.out.println("in reference return function");
		System.out.println("enter id and name");
		int id1=sc.nextInt();
		String name1=sc.next();
		return new reference(id1,name1);
	}

}
