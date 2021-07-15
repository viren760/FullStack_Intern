package com.Banking;

import java.util.Scanner;

public class RBI{

	public void ShowAllBanks() {
		System.out.println("1. SBI (State Bank Of India)");
		System.out.println("2. HDFC (Housing Development Finance Corporation)");
		System.out.println("3. KOTAK (KOTAK Mahindra)");
		System.out.println("4. PNB (Punjab National Bank)");
	}
	
	public static void main(String[] args) throws PageNotFoundExp {
		RBI r = new RBI();
		SBI s = new SBI();
		HDFC h = new HDFC();
		KOTAK k = new KOTAK();
		PNB p = new PNB();

		
		System.out.println("================= WELCOME TO THE BANK APP =====================");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.println("Do you know your bank ? ");
		String val = sc.nextLine();
		System.out.println();
		if(val.equalsIgnoreCase("Yes"))
		{
			while(true) {
				if(val.equalsIgnoreCase("YES")) {
					
					System.out.println("Search for your Bank :");
					String value = sc.nextLine();
					System.out.println();
					try {
						if (value.equalsIgnoreCase("SBI")) {
							s.Name();
							s.Loans();
						} else if (value.equalsIgnoreCase("HDFC")) {
							h.Name();
							h.Loans();
						} else if (value.equalsIgnoreCase("KOTAK")) {
							k.Name();
							k.Loans();
						} else if (value.equalsIgnoreCase("PNB")) {
							p.Name();
							p.Loans();
						}
						else {
							throw new PageNotFoundExp("Information not found 404");
						}

					} catch (PageNotFoundExp e) {
						System.out.println("Information not found 404");
						
					}

					if (value.equalsIgnoreCase("SBI") || value.equalsIgnoreCase("HDFC") || value.equalsIgnoreCase("KOTAK")
							|| value.equalsIgnoreCase("PNB")) {

						System.out.println();
						System.out.println("========================================");

						System.out.println("Check the interest on Loans : ");

						int value2 = sc.nextInt();
						System.out.println();

						try {

							if (value2 == 1) {
								Interest i = new Interest("Personal loans", 6);
								break;
							} else if (value2 == 2) {
								Interest i1 = new Interest("Home loans", 10);
								break;
							} else if (value2 == 3) {
								Interest i2 = new Interest("Educational loans", 12);
								break;
							} else if (value2 == 4) {
								Interest i3 = new Interest("Car loans", 5);
								break;
							} else if (value2 == 5) {
								Interest i4 = new Interest("two-Wheller loans", 7);
								break;
							} else if (value2 == 6) {
								Interest i5 = new Interest("Financial loans", 15);
								break;
							} else {
								throw new PageNotFoundExp("Information not found 404");
							}

						} catch (PageNotFoundExp e) {
							System.out.println("Information not found 404");
							break;
						}

					} else {
						
						
					}

					
					
				}else {
					
				}
			}

		}else if (val.equalsIgnoreCase("Show")) {
			r.ShowAllBanks();
		}
		else if(val.equalsIgnoreCase("NO")) {
			System.out.println("Thankyou for visiting .. please come with your details");
		}else {
			System.out.println("Please Enter your Bank Details .....");
		}
				
	
	
	}

}
