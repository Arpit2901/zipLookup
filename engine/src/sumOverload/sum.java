package sumOverload;

public class sum {
	public int sum(int a) {
		a++;
		return a;
	}
	public int sum(int a,int b) {
		return a+b;
	}
	public int sum(int a,int b,int c) {
		return a+b+c;
	}
}
