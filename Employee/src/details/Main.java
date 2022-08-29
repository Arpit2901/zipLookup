package details;

public class Main {

	public static void main(String[] args) {
		
		employee obj =new employee(912,"Arpit verma","BhavnaCorps",999715571);
		obj.working();
		System.out.println("uid \t Name \t  ");
		System.out.print(obj.getUid()+"\t");
		System.out.println(obj.getMobile());
		obj.display();

	}

}
