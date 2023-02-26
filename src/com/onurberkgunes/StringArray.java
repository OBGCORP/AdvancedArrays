package com.onurberkgunes;

public class StringArray {

	private String[] stringArr;
	private int lengthC = 0;
	
	
	////////////////////////////////Constructors///////////////////////////////
	
	public StringArray() {
		super();
		this.stringArr = null;
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
		
	public void addAtIndex(int index, String... string) {
		this.lengthC += string.length;
		String[] newArr = new String[this.lengthC];
		if(this.stringArr != null) {
			for(int i = 0; i < index; i++) {
				newArr[i] = this.stringArr[i];
			}
			for(int i = index, j = 0; i < (index + string.length); i++) {
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
	
	/////////////////////////////Getters & Setters/////////////////////////////
	
	public String[] getStringArr() {
		return stringArr;
	}
}
