package com.String;

public class StringMethods {

	public static void main(String[] args) {
		
		String st = "I Me Myself";
		
		// Using length method
		System.out.println("String Length is : "+st.length());		//to calculate number of character in String
		
		
		// Using charAt method
		System.out.println("at index Position 7 : "+st.charAt(7));	//it gives specific index character from String
		
		System.out.println("at last index Position : "+st.charAt(st.length()-1));
		
		
		// Using substring method
		// print 2(inclusive)-3-4-5-6-7-8 i.e upto 9-1=8(exclusive)
		System.out.println("Characters are : "+st.substring(2, 9));	//prints character in between that index
		
		
		// Using contains method
		System.out.println("Contains or Not : "+st.contains("Mys"));	// gives true or false value whether that words is present or not in String
		
		
		// Using indexOf method
		System.out.println("Strting Index is : "+st.indexOf("self"));
		
		System.out.println("Index is : "+st.indexOf('M'));	// it gives first occurrence of that specific character if it present & if it is not present then it gives -1 value
		
		System.out.println("Index are : "+st.indexOf('e', 2));	//searching e from 2 index
		System.out.println("Index are : "+st.indexOf('e', 5));	//searching e from 5 index
		
		System.out.println("Index are : "+st.lastIndexOf('M'));	//searching starts from last index
		System.out.println("Index are : "+st.lastIndexOf("M", 4));	//searching starts from 9 index or specific index which we give to 2nd parameter of the method
		
		
		// Using UpperCase & LowerCase method
		System.out.println("Original String : "+st);
		System.out.println("In UpperCase : "+st.toUpperCase());
		
		System.out.println("In LowerCase : "+st.toLowerCase());
		
		
		//Using isEmpty method
		System.out.println("Empty or Not : "+st.isEmpty());
		
		//String s2 = null;	//Such String is not allowed
		
		String s = "";
		System.out.println("Empty or Not : "+s.isEmpty());
		
		
		// Using replace method
		System.out.println("After Replace : "+st.replace('s', 'p'));	// gives I Me Mypelf
		System.out.println(st);											// gives I Me Myself i.e nothing changes
		
	}

}
