package employee;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		employee ob=new employee(101,"Arpit",45000.0);
		ob.display();
		employee obj=new employee(102,"Mohit",55000.0);
		obj.display();
		obj.countObjects();
	}

}
