package com.chan.stanley;

public class TriangleTestDrive {
	public static void main(String[]args){
		int x = 0;
		Triangle [] ta = new Triangle[4];
		while (x < 4){
			ta[x] = new Triangle();
			ta[x].height = (x + 1) * 2; // this line assigns a value to "int height"
			ta[x].length = x + 4; // this line assigns a value to "int length"
			ta[x].setArea(); // this line tells the program to invoke method setArea(), which assigns a value to "double area", then ta[x].area has a value to display
			System.out.print("triangle "+x+", area");
			System.out.println(" = " + ta[x].area);
			x = x + 1;
		}
		int y = x;
		x = 27;
		Triangle t5 = ta[2];
		ta[2].area = 343;
		System.out.print("y = "+ y);
		System.out.println(", t5 area = " + t5.area);
		

				
	}

}
