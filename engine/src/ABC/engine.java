package ABC;

public class engine {
	public void engine(){
		System.out.print("parent class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		engine a,a1,a2,a3;
		a=new bike();
		a1=new aeroplane();
		a2=new car();
		a3=new scooter();
		a.engine();
		a1.engine();
		a2.engine();
		a3.engine();
	}

}
