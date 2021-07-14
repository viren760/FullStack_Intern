package com.Banking;

public class Interest {
	
	String loans;
	int interest;
	
	Interest(String loans, int interest){
		this.loans= loans;
		this.interest=interest;
		System.out.println("The interest of "+loans+" is "+interest+"%");
	}

}
