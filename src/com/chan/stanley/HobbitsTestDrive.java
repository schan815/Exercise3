package com.chan.stanley;

public class HobbitsTestDrive {
	public static void main(String[]args){
		Hobbits[]h = new Hobbits[3];
		int z = 0;
			
		while (z < h.length){ // was originally "z < 4", but this causes the program to attempt to break the given array value of 3 variables
			
			h[z] = new Hobbits();
			h[z].name = "Bilbo";
			if (z == 1){
				h[z].name = "Frodo";
			}
			if (z == 2){
				h[z].name = "Sam";
			}
			System.out.print(h[z].name + " is a ");
			System.out.println("good Hobbit name.");
			z = z + 1; //was originally at the beginning of the loop, causing the array to try to start at 1 rather than 0. This also did not allow the program to print Bilbo.
			
		}
		
				
	}
}
