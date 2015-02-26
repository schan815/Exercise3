package com.chan.stanley;

public class Mix4 {
	
	private int counter = 0;
	
	public int maybeNew(int index){
		if (index < 7){ //however many times x is passed into method maybeNew(int index) and also satisfies the requirement of "index <" is how many times the returned value 1 will be added to int count 
			Mix4 m4 = new Mix4();
			m4.counter = m4.counter + 1;
			return 1;
		
		}
		return 0;
	}
	
	public static void main(String[]args){
		
		int count = 0;
		
		Mix4[]m4a = new Mix4[20];
		
		int x = 0;
		
		while(x < 7){ //dictates how many times the loop will run
			m4a[x] = new Mix4();
			m4a[x].counter = m4a[x].counter + 1;
			count = count + 1; // important step, it makes int count add 1 to its value == to however many times it runs through the loop
			count = count + m4a[x].maybeNew(x); // will change by however many times method maybeNew successfully returns 1
			x = x + 1;
		}
		System.out.println(count + " " + m4a[1].counter);
	}
}

	