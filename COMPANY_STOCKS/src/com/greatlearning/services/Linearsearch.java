package com.greatlearning.services;

public class Linearsearch {

	public int searching(double value,double array[]) {
		
		for(int i=0; i<array.length;i++)
		{
			if(array[i] == value)
			return i;
		}
		return -1;
	}	
}