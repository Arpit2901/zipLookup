package details;

public class employee implements emp {
	private int uid;
	private String name;
	private String company;
	private long mobile;
	public employee(int uid, String name, String company, long mobile) {
		super();
		this.uid = uid;
		this.name = name;
		this.company = company;
		this.mobile = mobile;
	}
	public void display(){
		System.out.println("the employee is not working");
	}
	public void working(){
		System.out.println("the employee is working");
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
}
