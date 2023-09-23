package com.AssStringKA;

public class Abbrevation {
	
	public void abbrevate(String s1)
	{
		String st[] = s1.split(" ");
		
		String s2 = "";
		
		for(int i = 0; i < st.length; i++)
		{
			if(i!=st.length-1)
			{
				s2 = s2+st[i].charAt(0)+".";
			}
		}
		
		System.out.println(s2+st[st.length-1]);
	}

	public static void main(String[] args) {
		
		Abbrevation a = new Abbrevation();

		String str = "Shivkumar Navnath Totre";
		
		a.abbrevate(str);
	}

}
