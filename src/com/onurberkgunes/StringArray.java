package com.onurberkgunes;

public class StringArray {

	private String[] stringArr;
	private int lengthC = 0;
	
	
	////////////////////////////////Constructors///////////////////////////////
	
	public StringArray() {
		super();
		this.stringArr = new String[1];
	}
	
	//////////////////////////////////Methods//////////////////////////////////

	public void push(String string) {
		this.lengthC++;
		String[] newArr = new String[this.lengthC];
		if (this.stringArr.length >= 1) {
			for(int i = 0; i < this.stringArr.length; i++) {
				newArr[i] = this.stringArr[i];
			}
		newArr[lengthC - 1] = string;
		this.stringArr = newArr;
		}
	}
	
	public void push(String... string) {
		this.lengthC += string.length;
		String[] newArr = new String[this.lengthC];
		if (this.stringArr.length >= 1) {
			for(int i = 0; i < this.stringArr.length; i++) {
				newArr[i] = this.stringArr[i];
			}
		int j= string.length - 1;
		for(int i = this.lengthC -1; i >= this.stringArr.length; i--) {			
			newArr[i] = string[j--];
		}		
		this.stringArr = newArr;
		}
	}
	
	public void pop(int elementCount) {
		this.lengthC -= elementCount;
		String[] newArr = new String[this.lengthC];
		if (this.stringArr.length > 0) {
			for(int i = 0; i < lengthC; i++) {
				newArr[i] = this.stringArr[i];
			}
		this.stringArr = newArr;
		}
	}
	
	public void pop() {
		this.lengthC--;
		String[] newArr = new String[this.lengthC];
		if (this.stringArr.length > 0) {
			for(int i = 0; i < lengthC; i++) {
				newArr[i] = this.stringArr[i];
			}
		this.stringArr = newArr;
		}
	}
		
	/////////////////////////////Getters & Setters/////////////////////////////
	
	public String[] getStringArr() {
		return stringArr;
	}
}
