package q4;

public class tv implements smartTVremote{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tv obj=new tv();
		obj.work();
		obj.show();
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("working");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show channels");
	}

}
