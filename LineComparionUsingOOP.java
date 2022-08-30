package com.dayeight;

public class LineComparionUsingOOP {

	public static int compareTo(double length1, double length2){
		
		if (length1 == length2)
		{
			return 0;
		}
		else if(length1 > length2)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

	public static void main(String[] args) {
		
		System.out.println("\n * * WelCome to Line Comparion Simulator * * \n");
		
		//Line One
		int x1 = 10;
		int x2 = 20;
		int y1 = 30;
		int y2 = 40;
		System.out.println(" Line 1 Co-ordinates are : ("+x1+", "+x2+")  ("+y1+", "+y2+")");
		double line1 = 0;
		line1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)); 
		System.out.println(" Line 1 Lenght is \t : "+line1+"\n");
	
		//Line Two
		int p1 = 10;
		int p2 = 20;
		int q1 = 30;
		int q2 = 40;
		System.out.println(" Line 1 Co-ordinates are : ("+p1+", "+p2+")  ("+q1+", "+q2+")");
		double line2 = 0;
		line2 = Math.sqrt(Math.pow((p2 - p1), 2) + Math.pow((q2 - q1), 2)); 
		System.out.println(" Line 2 Lenght is \t : "+line2+"\n");
		
		System.out.println("==============================================");
		int com = compareTo(line1,line2);
		
		switch (com)
		{
		case 0:
				System.out.println(" * Result  =  Line 1 and Line 2 are Same * ");
				break;
		
		case 1:
				System.out.println(" * Result  =  Line 1 is Greater than Line 2 * ");
				break;
				
		case -1:
				System.out.println(" * Result  =  Line 2 is Greater than Line 1 * ");
				break;
		
		}
		System.out.println("==============================================");

	}

}
