package com.dayeight;

public class EmployeeWageUsingClass {

	static int Wage_Per_Hour = 20;
	static int Full_Time = 8;
	static int Part_Time = 4;
	static int Emp_Wage = 0;
	static int day = 0;
	static int Total_Day = 20;
	static int ToltalWage = 0;
	static int empHrs = 0;
	static int Total_Hrs = 0;
	static int Today_income = 0;

	public void MonthWage()
	{
		
		while (day < Total_Day)
		{
			int empCheck = (int) Math.floor(Math.random()*10%3);
		
			switch(empCheck) {
				case 1:
					//Emp_Wage = Wage_Per_Hour * Full_Time;
					empHrs = 8;
					Today_income = empHrs * Wage_Per_Hour;
					System.out.println(" Employee is Present\t =\t His Today's Income is : "+Today_income);
					break;
			
				case 2:
					//Emp_Wage = Wage_Per_Hour * Part_Time;
					empHrs = 4;
					Today_income = empHrs * Wage_Per_Hour;
					System.out.println(" Employee is Part-Time\t =\t His Today's Income is : "+Today_income);
					break;
				
				
				case 0:
					empHrs = 0;
					Today_income = empHrs * Wage_Per_Hour;
					System.out.println(" Employee is Absent\t =\t His Today's Income is : "+Today_income);
					break;
			}
			day++;
			Total_Hrs += empHrs;
			//System.out.println(Total_Hrs);
			ToltalWage = Wage_Per_Hour * Total_Hrs;
			
		}
		System.out.println("===============================================================");
		System.out.println(" Employee Total Wage For a Month is\t =\t\t"+ToltalWage);
	}
	
	public static void main(String[] args) {
		
		System.out.println("\n\t ***** Welcome to EMP Wage Calculator !!! ***** \n");

		EmployeeWageUsingClass wage = new EmployeeWageUsingClass();
		wage.MonthWage();
	}
}