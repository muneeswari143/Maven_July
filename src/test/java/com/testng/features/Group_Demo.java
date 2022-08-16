package com.testng.features;

import org.testng.annotations.Test;

public class Group_Demo {
	@Test(groups = "music")
	private void spotify() {
System.out.println("spotify");
	}
	@Test(groups = "music")
	private void wynk() {
System.out.println("wynk");
	}
	@Test(groups = "social media")
	private void reddit() {
		System.out.println("reddit");
}
	@Test(groups = "social media")
	private void facebook() {
System.out.println("facebook");
	}
	@Test(groups = "news")
	private void cricbuzz() {
System.out.println("cricbuzz");
	}

}
