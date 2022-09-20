package main.com.dphone.service;

public class Registration {
	    private String name;
	    private String email;
	    private long phoneNo;
	    
	    
	    public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public long getPhoneNo() {
			return phoneNo;
		}


		public void setPhoneNo(long phoneNo) {
			this.phoneNo = phoneNo;
		}


		@Override
		public String toString() {
			return "Registration [name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + "]";
		}


		public Registration(String name, String email, long phoneNo) {
			super();
			this.name = name;
			this.email = email;
			this.phoneNo = phoneNo;
		}


}
