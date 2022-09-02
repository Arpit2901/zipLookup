package recursion;

public class staticvar {

	final static String company = "BhavnaCorp";
		String name;
		long rollno;
		public static void main(String[] args){
			staticvar ob = new staticvar();
			//  ob.company = "BhavnaCorp India";
			ob.name = "Arpit";
			ob.rollno = 915;
			System.out.println(ob.company);
			System.out.println(ob.name);
			System.out.println(ob.rollno);
			}

}
