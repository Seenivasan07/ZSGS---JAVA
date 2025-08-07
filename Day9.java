/* Day - 9 ASSIGNMENT..

1. int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution.
‌
2. Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers, and perform division, and catch the following exceptions: InputMismatchException, NumberFormatException, ArithmeticException and Exception.
‌
3. Write a program to illustrate how to throw a ClassNotFoundException.
‌
4. Write a method to parse a string to an integer. Throw an exception if the string is not a valid number. Handle it using try-catch.
‌
5. Create a program where try block contains a return statement. Ensure that finally block executes before the method returns. Show this with output.
‌
6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid.
‌
7. Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls method3, which throws the exception). Handle the exception in method1.
‌
8. Design a login system that throws AuthenticationException if the username or password is incorrect. Handle it and display a login failure message.
‌
9. Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally.
‌
10. Write a Java program to manage a voting system where a person must be at least 18 years old to be eligible to vote. Use a custom exception to handle the scenario when an ineligible person tries to register for voting. Display appropriate messages for eligible and ineligible voters.
*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
1. int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution.
*/

class ArrayException
{
	public static int arrExp(int[]arr)
	{
		return (int)arr[7]/arr[4];
	}

	public static void main(String[]args)
	{
		try
		{
			int[]arr = {2,5,1,4,0,7};
			System.out.println(arrExp(arr));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Message: "+e.getMessage());
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*2. Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers, and perform division, and catch the following exceptions: InputMismatchException, NumberFormatException, ArithmeticException and Exception.*/

class Exceptions
{
	public static int division(int a, int b)
	{
		return a/b;
	}

	public static void main(String[]args)
	{
		try
		{
			Scanner java = new Scanner(System.in);
			System.out.println("Enter how many times you want to run the program....");
			int i = java.nextInt();
			java.nextLine();
			while(i>0)
			{
				System.out.println("Enter a string A: ");
				String A = java.nextLine();
	
				System.out.println("Enter a string B: ");  					                        String B = java.nextLine();

				System.out.println(division(Integer.parseInt(A), Integer.parseInt(B)));
			       	i--;
			}	
		}

		catch(InputMismatchException e)
		{
			System.out.println("InputMismatchException Exception: "+e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException Exception: "+e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException Exception: "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured: "+e.getMessage());
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//3. Write a program to illustrate how to throw a ClassNotFoundException.

class ClassNotFound
{
	public static void main(String[]args)
	{
		try
		{
			System.out.println(Class.forName("ClassNotFound"));
		}
		catch(ClassNotFoundException e)	
		{
			System.out.println("Class Not Found: "+e.getMessage());
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//4. Write a method to parse a string to an integer. Throw an exception if the string is not a valid number. Handle it using try-catch.

class ValidNumber
{
	public static void main(String[]args)
	{
		try
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the String: ");
			String s = java.nextLine();
			System.out.println(Integer.parseInt(s));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}	
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//5. Create a program where try block contains a return statement. Ensure that finally block executes before the method returns. Show this with output.

class Finally
{
	public static int display(int n)
	{
		try
		{
			return n*n;
		}
		finally
		{
			System.out.println("Finally Executed before the return statement....");
		}		
	}

	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = java.nextInt();
		System.out.println(display(n));
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid.*/

class Pin
{
	public static void checkPin(int pin)
	{
		if((pin>=1000) && (pin<=9999))
		{
			System.out.println("The Given pin is validd....");
		}
		else
		{
			throw new IllegalArgumentException("Enter four digit valid pin and (NOTE: Your Pin Must not start with 0....");	
		}
	}
	public static void main(String[]args)
	{
		try
		{
			Scanner java = new Scanner(System.in);
			System.out.println("Enter the pin: ");
			int pin = java.nextInt();
			checkPin(pin);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter only the 4 digit numeric values.....");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Invalid Pin: "+e.getMessage());
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//7. Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls method3, which throws the exception). Handle the exception in method1.

class Propagation
{
	static int method3()
	{
		String s = null;
		return s.length();
	}

	static int method2()
	{
		return method3();
	}
	
	static int method1()
	{
		try
		{
			return method2();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return -1;
	}

	public static void main(String[]args)
	{
		method1();
	}
}





























