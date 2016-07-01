package com.java24hours;

public class ModemTester {
	public static void main(String[]args){
		CableModem surfBoard = new CableModem();
		DslModem gateway = new DslModem();
		AcousticModem guitar = new AcousticModem();
		surfBoard.speed = 500_000;
		gateway.speed = 400_000;
		guitar.speed = 300;
		System.out.println("Trying the cable modem:");
		surfBoard.displaySpeed();
		surfBoard.connect();
		System.out.println("Trying the DSL modem:");
		gateway.displaySpeed();
		gateway.connect();
		System.out.println("Trying the Acoustic modem:");
		guitar.displaySpeed();
		guitar.connect();
	}

}
