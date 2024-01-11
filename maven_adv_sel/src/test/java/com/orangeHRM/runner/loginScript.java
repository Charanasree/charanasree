package com.orangeHRM.runner;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class loginScript {
	@Test
	public void login() 
	{
		driver.findelement(By.name("username")).sendkeys("admin");
		
	}

}
