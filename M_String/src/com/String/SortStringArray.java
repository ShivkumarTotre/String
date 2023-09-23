package com.String;

import java.util.Arrays;

public class SortStringArray {
	
	public static void sortArray(String str[])
	{
		String temp = "";
		
		for(int i = 0; i < str.length; i++)
		{
			for(int j = i+1; j < str.length; j++)
			{
				if((str[i].compareTo(str[j]))> 0)
				{
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		
		System.out.println("After Sorting : \n"+Arrays.toString(str));
	}

	public static void main(String[] args) {

		String s1[] = {"C","C++","Java","Angular","Python"};
		
		System.out.println("Before Sort : \n"+Arrays.toString(s1));
		
		SortStringArray.sortArray(s1);
	}

}
