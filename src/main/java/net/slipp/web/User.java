package net.slipp.web;

public class User {
	private String userId;
	private String password;
	private String name;
	private String email;
 //ctrl+shift+f : method 간 한 줄 띄움
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}
}
