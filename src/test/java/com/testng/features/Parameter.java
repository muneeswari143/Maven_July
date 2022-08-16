package com.testng.features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Parameters({"id","pass"})
	@Test
	private void credential_Data(@Optional ("smith")String email, String password) {
System.out.println("email:"+email);
System.out.println("password:"+password);
	}

}
