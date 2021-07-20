package in.ashokit;

import in.ashokit.beans.PasswordService;

public class Test {
	
	

	public static void main(String[] args) {
		PasswordService passwordService = new PasswordService();
		String encodePwd = passwordService.encodePwd("ravali@123");
		System.out.println("encoded ::"+encodePwd);
		String decode = passwordService.decode(encodePwd);
		System.out.println("decoded::"+decode);
		
	}
}
