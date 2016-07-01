package com.java24hours;

public class Changer {

	public static void main(String[] args) {
		if (args.length > 0){
			System.out.println("The original value: "
					+ args[0]); // prints original value of string element 0 in args array
			float num1 = new Float(args[0]); // casts args array element 0 to float variable num1?
			float num2 = num1.floatValue(); // creates float variable num2 and sets
			int num3 = (int)num2; //
			System.out.println("The final value: " + num3);
			
		}

	}

}
