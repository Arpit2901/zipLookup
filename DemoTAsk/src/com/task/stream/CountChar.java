package com.task.stream;

public class CountChar {
	public static void main(String arg[]) throws Exception {
	
			
			check();
		
	}
		
	public static void check() throws Exception {
		try{
		String s="";
		s.charAt(0);
		
		}
		catch(Exception e){
			System.out.println("INSIDE catch");
			
			throw new Exception();
		}
		finally{
		System.out.println("INSIDE finally");
		
		}
	}


	
	
		public static void count(String s,char ch) {
		int n=(int) s.chars().filter(c->c==ch).count();
		System.out.println(n);
		}
		
}
