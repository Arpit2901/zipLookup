package com.demo.overriding;

public class UserTaskAssign {
	
	public static void main(String args[])
	{
		Task t=new Task();
		User u=new User();
		
		u.setTaskName(t.getTaskName());
		System.out.println("User Task Details  -----");
	}

}
