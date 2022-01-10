package com.gretlearning.main;

import java.util.*;
import com.greatlearning.services.*;

public class Main {

	private static Scanner input = new Scanner(System.in); 
	static double[] shareprice;
	static int companies;

	public static void main(String args[]) {

		Mergesort mergeSort = new Mergesort();
		Linearsearch linearSearch = new Linearsearch();

		System.out.println("enter the no of companies");
		companies = input.nextInt();
		boolean status;
		int rose=0, loss =0;
		shareprice= new double[companies];
		
		if(companies == 1)
		{
			System.out.println("Enter current stock price of the Company 1");
			shareprice[0] = input.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday? (Mention True or False)");
			status = input.nextBoolean();
			if(status)
			{
				rose ++;
			}
			if(!status)
			{
				loss ++;
			}
		}
		else
		{
			for(int i=0; i< companies; i++)
			{
				System.out.println("Enter current stock price of the company "+(i+1));
				shareprice[i] = input.nextDouble();
				System.out.println("Whether company's stock price rose today compare to yesterday? (Mention True or False)");
				status = input.nextBoolean();
				if(status)
				{
					rose ++;
				}
				if(!status)
				{
					loss ++;
				}
			}
		}
		
		int option = Integer.MIN_VALUE;
		
		while (option != 0) {
		
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("Enter the operation that you want to perform");
		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("6. press 0 to exit");
		System.out.println("-----------------------------------------------");
		
		option = input.nextInt();
		 
		switch (option) {
			
		case 1:
			mergeSort.sorting(shareprice,0,companies-1,1);
			System.out.println("Stock prices in ascending order are :");
			Main.SOP();
			break;
		
		case 2:
			mergeSort.sorting(shareprice,0,companies-1,2);
			System.out.println("Stock prices in descending order are :");
			Main.SOP();
			break;
		
		case 3:
			System.out.println("Total no of companies whose stock price rose today : " + rose);
			break;
		
		case 4 :
			System.out.println("Total no of companies whose stock price declined today : " + loss);
			break;
		
		case 5 :
			System.out.println("enter the key value");
			double valueToSearch = input.nextDouble();
			int result = linearSearch.searching(valueToSearch,shareprice);
			if(result == -1)
			{
				System.out.println("Value not found");
			}
			else
			{
				System.out.println("Stock of value "+ valueToSearch + " is present");				
			}
			break;
			
		default: System.exit(0);
			break;
			}		
		}
	}			
	
	public static void SOP() {
	
		for(int i=0; i<companies; i++) {
		
			System.out.print(shareprice[i] +" ");
		}
		System.out.println("");
	}	
}