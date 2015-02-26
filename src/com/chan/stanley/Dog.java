package com.chan.stanley;

public class Dog {

	private String name;
	private int size;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) { // always remember to set a type(String) as well as a name(name)
		this.name = name; // this.name is used to refer to this instance of name
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public void bark(){
		System.out.println("woof");
	}
	
}