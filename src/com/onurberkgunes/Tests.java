package com.onurberkgunes;

public class Tests {

	public static void main(String[] args) {
		StringArray stringArray = new StringArray();
		stringArray.push("onur");
		stringArray.push("berk");
		stringArray.push("gunes");
		for(String string : stringArray.getStringArr()) {
			System.out.println(string);
		}
		System.out.println("* * * * * * * * * * * * * * * * *");
		stringArray.push("deneme");
		stringArray.push("deneme");
		stringArray.push("berk");
		for(String string : stringArray.getStringArr()) {
			System.out.println(string);
		}
		System.out.println("* * * * * * * * * * * * * * * * *");
		stringArray.push("hello1");
		stringArray.push("hello2");
		stringArray.push("hello3");
		stringArray.push("hello4");
		for(String string : stringArray.getStringArr()) {
			System.out.println(string);
		}
		System.out.println("* * * * * * * * * * * * * * * * *");		
		stringArray.pop(3);
		for(String string : stringArray.getStringArr()) {
			System.out.println(string);
		}
		System.out.println("* * * * * * * * * * * * * * * * *");
		stringArray.push("hello2");
		stringArray.push("hello3");
		stringArray.push("hello4");
		for(String string : stringArray.getStringArr()) {
			System.out.println(string);
		}
		System.out.println("* * * * * * * * * * * * * * * * *");
		stringArray.pop(1);
		for(String string : stringArray.getStringArr()) {
			System.out.println(string);
		}
		System.out.println("* * * * * * * * * * * * * * * * *");
		stringArray.push("hello5", "hello6", "hello7");
		for(String string : stringArray.getStringArr()) {
			System.out.println(string);
		}
		
		System.out.println("* * * * * * * * * * * * * * * * *");
		System.out.println(stringArray.getStringArr().length);
	}

}
