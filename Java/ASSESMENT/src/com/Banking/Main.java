package com.Banking;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SBI s = new SBI();
		HDFC h = new HDFC();
		KOTAK k = new KOTAK ();
		PNB p = new PNB();
		
		System.out.println("================= WELCOME TO THE BANK APP =====================");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Search for your Bank :");
		String value = sc.nextLine();
	   System.out.println();
         
		if(value.equalsIgnoreCase("SBI")) {
		    s.Name();
		    s.Loans();
		}else if(value.equalsIgnoreCase("HDFC")){
			h.Name();
			h.Loans();
		}else if(value.equalsIgnoreCase("KOTAK")) {
			k.Name();
			k.Loans();
		}else if(value.equalsIgnoreCase("PNB")) {
			p.Name();
			p.Loans();
		}
		
		System.out.println();
		System.out.println("========================================");
	   
		System.out.println("Check the interest on Loans : ");
		int value2 = sc.nextInt();
		System.out.println();
		
		if(value2 ==1) {
			Interest i = new Interest("Personal loans",6);
		}else if(value2==2) {
			Interest i1 = new Interest("Home loans",10);
		}else if(value2==3) {
			Interest i2 = new Interest("Educational loans",12);
		}else if(value2==4) {
			Interest i3 = new Interest("Car loans",5);
		}else if(value2==5) {
			Interest i4 = new Interest("two-Wheller loans",7);
		}else if(value2==6) {
			Interest i5 = new Interest("Financial loans",15);
		}
		
		

	}

}
