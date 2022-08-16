package com.testng.features;

import org.testng.annotations.Test;

public class Depends_Alwaysrun {
	@Test(alwaysRun = true,enabled = false)
	private void zeb() {
System.out.println("zebronics");
	}

}
