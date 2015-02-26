package com.chan.stanley;

public class DogTestDrive {

	public static void main(String[]args){
		Dog doggy = new Dog();
		doggy.setSize(10);
		doggy.setName("Fido");
		System.out.println(doggy.getSize());
		System.out.println(doggy.getName());
		//doggy.size = 11; 					// will only work if the instance variable size is public and set-able without the use of a setter
		//System.out.println(doggy.size); 	// will only work if the instance variable size is public and set-able without the use of a setter
		//doggy.name = "Fidor";				// will only work if the instance variable size is public and set-able without the use of a setter
		//System.out.println(doggy.name);	// will only work if the instance variable size is public and set-able without the use of a setter
		
		doggy.bark();
		
	}
}
