package Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Impls.CalendarImpl;

@Component
public class User extends CalendarImpl{
	
	@Autowired
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String userInfo() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	/*
	 *  This is an example for converting password to md5 for our db and front-end security.
		MessageDigest digest=MessageDigest.getInstance("MD5");
		String test="test";
		digest.update(test.getBytes());
		byte hash[]=digest.digest();
	 */

	
}
