package com.onurberkgunes;

public class Tests {

	public static void main(String[] args) {
		StringArray stringArray = new StringArray();
		stringArray.push("deneme1");
		stringArray.push("deneme2");
		stringArray.push("deneme3");
		for(String string : stringArray.getStringArr()) {
			System.out.println(string);
		}
		System.out.println("1* * * * * * * * * * * * * * * * *");
		stringArray.push("deneme4");
		stringArray.push("deneme5");
		stringArray.push("deneme6");
		for(String string : stringArray.getStringArr()) {
			System.out.println(string);
		}
		System.out.println("2* * * * * * * * * * * * * * * * *");
		stringArray.push("hello1");
		stringArray.push("hello2");
		stringArray.push("hello3");
		stringArray.push("hello4");
		for(String string : stringArray.getStringArr()) {
			System.out.println(string);
		}
		System.out.println("3* * * * * * * * * * * * * * * * *");		
		stringArray.pop(3);
		for(String string : stringArray.getStringArr()) {
			System.out.println(string);
		}
		
		System.out.println("4* * * * * * * * * * * * * * * * *");		
		stringArray.pop();
		for(String string : stringArray.getStringArr()) {
			System.out.println(string);
		}
		System.out.println("5* * * * * * * * * * * * * * * * *");
		stringArray.push("hello1");
		stringArray.push("hello2");
		stringArray.push("hello3");
		stringArray.push("hello4");
		for(String string : stringArray.getStringArr()) {
			System.out.println(string);
		}
		System.out.println("6* * * * * * * * * * * * * * * * *");
		stringArray.pop(1);
		for(String string : stringArray.getStringArr()) {
			System.out.println(string);
		}
		System.out.println("7* * * * * * * * * * * * * * * * *");
		stringArray.push("hello5", "hello6", "hello7");
		for(String string : stringArray.getStringArr()) {
			System.out.println(string);
		}
		
		System.out.println("8* * * * * * * * * * * * * * * * *");
		System.out.println(stringArray.getStringArr().length);
		
		System.out.println("9* * * * * * * * * * * * * * * * *");
		stringArray.addAtIndex(3, "added1", "added2");
		for(String string : stringArray.getStringArr()) {
			System.out.println(string);
		}
		
		System.out.println("10* * * * * * * * * * * * * * * * *");
		stringArray.removeAtIndexes(3, 9, 5);
		for(String string : stringArray.getStringArr()) {
			System.out.println(string);
		}
		
	}
}
