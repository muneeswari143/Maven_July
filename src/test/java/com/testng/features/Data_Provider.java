package com.testng.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
@DataProvider
public String[][] test_Data() {
String[][]data= {
		{"starc","starc@123"},
		{"smith","smith@123"},
		{"watson","wetto"}
};
return data;
}
//@Test(dataProvider="test_Data")
//private void credentials_Login(String email,String password){ {
//System.out.println(email);
//System.out.println(password);
//System.out.println("product search");
//System.out.println("Add to cart");
//}
//System.out.println();
}
