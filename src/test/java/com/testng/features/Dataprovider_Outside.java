package com.testng.features;

import org.testng.annotations.Test;

public class Dataprovider_Outside extends Data_Provider {
@Test(dataProvider="test_Data")
private void Demo(String username,String password) {
System.out.println(username);
System.out.println(password);
}
}
