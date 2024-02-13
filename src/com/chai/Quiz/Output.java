package com.chai.Quiz;

public class Output {

	public static void main(String[] args) {
		try {
//			int a=5;//a=0
//			int b=0;//b=5
//			int c=b/a;
			System.out.println("Hello"+" "+1/0);
		}
		catch(Exception e) {
			System.out.println("World");
		}

	}

}
