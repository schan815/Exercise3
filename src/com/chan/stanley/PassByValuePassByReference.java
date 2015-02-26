package com.chan.stanley;


public class PassByValuePassByReference {

	public static void incrementPrimitiveType(int x){
		System.out.println("Before increment pass by value " + x); // for primitive variables and strings, pass by value means pass by copy. 
		x = x + 1;
		System.out.println("After increment pass by value " + x);
	}
	 // this means that whatever int arg is used in the place of int x for the method will remain the same as x is now a copy of y, but not actually y.

	public static void incrementObject(int[] listArg){
		System.out.println("Before increment pass by reference " + listArg[0]); // arrays are objects and will be pass by reference
		listArg[0] = listArg[0] + 1;
		System.out.println("After increment pass by reference " + listArg[0]); 
	}
	
	public static void swap(Integer a, Integer b){
		Integer placeholder = a;
		a = b;
		b = placeholder;
	}
	
	public static void main(String[]args){

		int y = 5;
		System.out.println(y);
		incrementPrimitiveType(y);
		System.out.println(y); // here we see that, despite the method including x = x + 1, y will remain the same when printed because it is pass by value/copy.
		
		System.out.println("");
		
		int[] list = new int[1]; // array of int named list containing one int
		list[0] = 5; // new list object reference designated to position 0
		System.out.println(list[0]);
		incrementObject(list);
		System.out.println(list[0]); // because we are dealing with an object, it is pass by reference and keeps the changed value of list[0] = list[0] + 1
		
		Integer a = 5;
		Integer b = 10;
		swap(a, b);
		System.out.println(a + " " + b);
	}
}
/*
technically, the Java spec explicitly states that Java is pass by value only. This is explained by saying that references themselves are not being passed, but copies of the references are.
to be specific, if an object reference variable "a" were passed into a method as an argument to be used as a method local variable, then you're actually creating a copy of "a" as a method local variable "b".
in this case, you're actually passing the reference by value as "b" is a copy of "a". "b" is NOT "a" (which is the key difference) but the value of "b" is the same as the value of "a".
yes, both references will refer to the same object and invoking changes to the object from either reference will be reflected in the object but it still stands that the reference itself was passed by value,
even if it looks like the object was passed by reference.

a more concise explanation for object references being pass by value is that a reference is just a remote control for an object stored somewhere in memory. If you want to control that object from somewhere else,
a copy of the remote must be made. You cannot just bring the remote somewhere else. The remote is being copied so the reference is pass by value.

an easy way to test this is to have a method that takes the passed by value arg and null it. 
once the method returns, null check the original reference that was passed in and you can see that the original reference is still referring to whatever object it was referring to before invoking the method.
the local reference doesn't even need to be nulled, it can just refer to something else and you can see that the original reference will still be pointing to the original object.
if it were truly pass by reference, nulling the local variable would be the same as nulling the original variable used as an argument.
*/