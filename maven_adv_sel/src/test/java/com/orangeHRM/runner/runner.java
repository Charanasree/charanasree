package com.orangeHRM.runner;

import org.testng.annotations.Test;

public class runner {
	@Test
	public void login(String un,String pwd)
	{
		pom p=new pom(driver);
		p.getuser().sendkeys(un);
		Thread.sleep(2000);
		p.getpass().sendkeys(pwd);
		Thread.sleep(2000);
		p.getloginbtn().click();
		Thread.sleep(2000);
		p.getadmin().click();
		Thread.sleep(2000);
		p.get_user().click();
		Thread.sleep(2000);
		p.getlogout().click();
		Thread.sleep(2000);
		
	}
@DataProvider(name="logincred")
public object[][] data(){
	return new object[][] {
		{"admin","admin123"}
	
}
}
