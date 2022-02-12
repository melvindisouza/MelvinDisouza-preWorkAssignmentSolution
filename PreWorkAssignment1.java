package PreWorkAssignment;

import java.util.Scanner;

public class PreWorkAssignment1 
{
	public static boolean checkPalindrome(int number) 
	{
		
		int remainder;
		int sum=0;
		int n = number;
		
		do 
		
		{
			remainder = number % 10;
			
			sum = (sum *10) + remainder;
			
			number = number/10;
					
		}
		while(number > 0);
		
		if(sum==n) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static boolean checkPrime(int number) 
	{
	
		int i=2;
		int c=0;
		do
		{
			if(number%i==0) 
			{
				c++;
			}
			if(c>0) 
			{
				break;
			}
			i++;
		}
		while(i<number);
		
		if(c>0) 
		{
			return false;
			
		}
		else 
		{
			return true;
			
		}
		
	}
	
	public static void starPattern(int num) 
	{
		int i=1;
		do {
			System.out.print("*");
			i++;
			if(i>num) 
			{
				num--;
				i=1;
				System.out.println();
			}
		}while(i<=num);
	}
	
	public static void fibonacciSeries (int num) 
	{
		int num1=0;
		int num2=1;
		int sum;
		System.out.print(num1+" , "+num2);
		int counter=num-2;
		do 
		{
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.print(" , "+num2);
			counter--;
		} while(counter>0);
	}
	
	public static void main(String args[]) 
	{
		int inputnum;
		Scanner sc= new Scanner(System.in);
		do 
			{
				System.out.println("**************************MAIN MENU***************************");
				System.out.println("/"+"************************************************************"+"/");
				System.out.println("Please choose what function you wish to carry out");
				System.out.println("Enter 1 to choose Palindrome function");
				System.out.println("Enter 2 to choose Prime number check function");
				System.out.println("Enter 3 to choose Star Pattern function");
				System.out.println("Enter 4 to choose Fibonacci series function");
				System.out.println("Enter 0 to Exit");
				System.out.println("/"+"************************************************************"+"/");
				
				inputnum = sc.nextInt();
				
				switch(inputnum)
				{
				
					case 0:
					{
						break;
					}
				
					case 1:
					{
						System.out.println("Please enter the number you wish to check as Palindrome");
						int inputnumber= sc.nextInt();
						boolean result= checkPalindrome(inputnumber);
						if(result==true) 
						{
							System.out.println(inputnumber+" is a Palindrome number");
						}
						else 
						{
							System.out.println(inputnumber+ " is not a Palindrome number");
						}
						break;
				    }
					case 2:
					{
						System.out.println("Please enter the number you wish to check as Prime");
						int inputnumber= sc.nextInt();
						boolean result= checkPrime(inputnumber);
						if(result==true) 
						{
							System.out.println(inputnumber+" is a Prime number");
						}
						else 
						{
							System.out.println(inputnumber+ " is not a Prime number");
						}
						break;
					}
					case 3:
					{
						System.out.println("Please enter the number to print Star Pattern");
						int inputnumber= sc.nextInt();
						starPattern(inputnumber);
						break;
					}
					case 4:
					{
						System.out.println("Please enter the count till which you want to print the fibonacci series");
						int inputnumber= sc.nextInt();
						fibonacciSeries(inputnumber);
						break;
					}
					default: System.out.println("Invalid input, Please choose from the available options");
		}
				System.out.println("/"+"************************************************************"+"/");
	}while(inputnum!=0);
		sc.close();
		System.out.println("Program ended successfully");
		System.out.println("/"+"************************************************************"+"/");
	}
}
