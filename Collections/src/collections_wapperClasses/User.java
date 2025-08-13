package collections_wapperClasses;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	   String username;
	   String email;
	   int age;
	   String dept;
	   public User(String username, String email, int age, String dept) {
	       this.username = username;
	       this.email = email;
	       this.age = age;
	       this.dept = dept;
	   }
	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", age=" + age + ", dept=" + dept + "]";
	}
	}