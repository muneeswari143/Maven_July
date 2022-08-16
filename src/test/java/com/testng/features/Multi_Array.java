package com.testng.features;

public class Multi_Array {
	public static void main(String[] args) {
		String[][]data= {
			{"starc","Aus","56"},
			{"kane","Nz","49"},
			{"smith","Ind","59"}
			
	};
System.out.println(data[1][1]);
System.out.println("length:"+data.length);
for (int i = 0; i < data.length; i++) {
	for (int j = 0; j < data.length; j++) {
		System.out.print(data[i][j]+" ");
	}
	System.out.println();
}
}

}