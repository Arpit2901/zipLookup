package com.jdbc.service;

public class ReferTo {
		String name;
		String mobile;
		String email;
		public ReferTo(String name, String mobile, String email) {
			super();
			this.name = name;
			this.mobile = mobile;
			this.email = email;
		}
//		public ReferTo() {
//			// TODO Auto-generated constructor stub
//		}
		public String nameCheck(String name) {
			name="";
			return name;
			
		}
		@Override
		public String toString() {
			return " [name=" + name + ", mobile=" + mobile + ", email=" + email + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}

}
