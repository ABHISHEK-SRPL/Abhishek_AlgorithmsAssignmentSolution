package com.greatlearning.services;

public class Mergesort {

	public void sorting(double array[], int left, int right,int flag)
	{
		if(left < right) {
		int mid = (left+right)/2;
		sorting(array, left, mid, flag);
		sorting(array, mid+1, right, flag);
		
		merge(array,left,mid,right,flag);
		}
	}
	
	public void merge(double array[], int left, int mid, int right, int flag) {
		
		int L1 = mid-left +1;
		int L2 = right-mid;
		
		double leftarr[] = new double[L1];
		double rightarr[] = new double[L2];
		for(int i=0; i<L1; i++)
		{
			leftarr[i] = array[left+i];
		}
		for(int j=0; j<L2; j++)
		{
			rightarr[j] = array[mid+1+j];
		}
		
		int i, j, k;
		i = 0;
		j = 0;
		k = left;
		
		while (i<L1 && j<L2)
		{
			if((leftarr[i]<rightarr[j] && flag == 1) || (leftarr[i]>=rightarr[j] && flag == 2))
			{
		  		array[k] = leftarr[i];
						i++;
			}
			else
			{
				array[k] = rightarr[j];
						j++;
			}
			k++;
		}
		while(i <L1)
		{
			array[k] = leftarr[i];
			i++;
			k++;
		}
		while(j <L2)
		{
			array[k] = rightarr[j];
			j++;
			k++;
		}
	}	
}