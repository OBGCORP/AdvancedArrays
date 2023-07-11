package com.onurberkgunes;

public class StringArray {

	private String[] stringArr;
	private int lengthC = 0;
	
	
	////////////////////////////////Constructors///////////////////////////////
	
	public StringArray() {
		super();
	}
	
	//////////////////////////////////Methods//////////////////////////////////

	public void push(String... string) {
		this.lengthC += string.length;
		String[] newArr = new String[this.lengthC];
		if(this.stringArr != null) {
			for(int i = 0; i < this.stringArr.length; i++) {
				newArr[i] = this.stringArr[i];
			}		
			int j = 0;
			for(int i = this.stringArr.length; i < newArr.length; i++) {			
				newArr[i] = string[j++];
			}
		}
		else {
			int j = 0;
			for(int i = 0; i < newArr.length; i++) {			
				newArr[i] = string[j++];
			}
		}
		this.stringArr = newArr;		
	}
	
	public void pop(int elementCount) {
		this.lengthC -= elementCount;
		String[] newArr = new String[this.lengthC];
		for(int i = 0; i < lengthC; i++) {
			newArr[i] = this.stringArr[i];
		}
		this.stringArr = newArr;
	}
	
	public void pop() {
		this.lengthC--;
		String[] newArr = new String[this.lengthC];
		for(int i = 0; i < lengthC; i++) {
			newArr[i] = this.stringArr[i];
		}
		this.stringArr = newArr;
	}
		
	public void addTheseAtIndex(int index, String... string) {
		this.lengthC += string.length;
		String[] newArr = new String[this.lengthC];
		if(this.stringArr != null) {
			for(int i = 0; i < index; i++) {
				newArr[i] = this.stringArr[i];
			}
			for(int i = index, j = 0; i < (index + string.length); i++ ) {
				newArr[i] = string[j++];
			}			
			for(int i = index; i < this.stringArr.length; i++) {
				newArr[i + string.length] = this.stringArr[i];
			}
		}
		else {
			for(int i = 0; i < lengthC; i++) {
				newArr[i] = string[i];
			}
		}
		this.stringArr = newArr;
	}
														
	public void addThisAtEachIndex(String string, int... index) {
		this.lengthC += index.length;
		String[] newArr = new String[this.lengthC];
			for(int i = 0, k = 0; i < this.stringArr.length; i++, k++) {
				for(int j = 0; j < index.length; j++) {
					if(i == index[j]) {
						newArr[k] = string;
						k++;
					}
					if(j == index.length - 1) {
						newArr[k] = this.stringArr[i];
					}
				}
			}
		this.stringArr = newArr;
	}
									
	public void removeAtIndexes(int... index) {
		this.lengthC -= index.length;
		String[] newArr = new String[lengthC];
		for(int i = 0; i < this.stringArr.length; i++) {
			for(int j = 0; j < index.length; j++) {
				if(i == index[j]) {
					this.stringArr[i] = null;
				}
			}
		}
		int k = 0;
		for(String string : stringArr) {
			if(string != null) {
				newArr[k] = string;
				k++;
			}
		}
		this.stringArr = newArr;
	}
	
	public String toString() {
		for(String string : this.stringArr) {
			System.out.println(string);
		}
		return null;
	}
	
//	replace, reset
	/////////////////////////////Getters & Setters/////////////////////////////
	
	public String[] getStringArr() {
		return stringArr;
	}
}
