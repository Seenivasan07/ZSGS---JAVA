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

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//8. Design a login system that throws AuthenticationException if the username or password is incorrect. Handle it and display a login failure message.

class AuthenticationException extends RuntimeException
{
	public AuthenticationException(String message)
	{
		super(message);
	}
}

class Login
{
	private String[]username;
	private String[]password;
	private int count = 0;
	
	public Login(int size)
	{
		username = new String[size];
		password = new String[size];
	}

	private void setUser(String usernamE)
	{
		username[count] = usernamE;
		return;
	}
	private void setPwd(String pwD)
	{
		password[count] = pwD;
		count++;
		return;
	}
		
	public void setCredentials(String userName, String pwd)
	{
		if(count == username.length)
		{
			System.out.println(".....Storagee.. is.. Full.....\n\n");
			return;
		}
		setUser(userName);
		setPwd(pwd);
		System.out.println("...........Account Created.... Successfully.........\n\n");
		return;
	}

	public void login(String name, String passWord)
	{
		checkUser(name, passWord);
		return;
	}

	private void checkUser(String uname, String upwd)
	{
		if(count == 0)
		{
			throw new AuthenticationException("......Try to signIn First.......\n\n");
		}
		else
		{
			boolean val = false;
			check:
			for(int i = 0;i<count;i++)
			{
				if(username[i].equals(uname))
				{
					if(password[i].equals(upwd))
					{
						val = true;
						System.out.println(".....Welcomee... Welcomee...You are Logged in.....\n\n");
						break check;
					}
					else
					{
						throw new AuthenticationException("........The Password entered is incorrect!!!........\n\n");
					}
				}
			}
			if(!val)
			{
				throw new AuthenticationException("........The UserName or Password entered is incorrect or not Found........\n.........If you are new.... Sign In First..or....Enter Correctly!!!!!......\n\n");
			}
		}
		return;
	}
}

class LoginSystem
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		Login log = new Login(3);
		System.out.println("\n....................LOGIN SYSTEM....................\n");
		while(true)
		{
			System.out.println("Choose the Option: ");
			System.out.println("1. New User - Sign In");
			System.out.println("2. Login - In");
			System.out.println("3. To Exit");
			int option = java.nextInt();
			java.nextLine();
			switch(option)
			{
					
				case 1: 
					System.out.println("\nEnter the Username: ");
					String newUser = java.nextLine();
					System.out.println("Enter the Password: ");
					String passWord = java.nextLine();
					System.out.println("Repeat the Password: ");
					String repeatPwd = java.nextLine();						
					if(passWord.equals(repeatPwd))
					{	
						log.setCredentials(newUser, passWord);
						break;
					}
					else
					{
						System.out.println("Password is MisMatching.... Repeat it Correctly....");
					}
					System.out.println("\n\n");
					break;

				case 2:

					try
					{
						System.out.println("\nEnter the UserName: ");
						String name = java.nextLine();
						System.out.println("Enter the Password: ");
						String password = java.nextLine();
						log.login(name, password);
						break;
					}
					catch(AuthenticationException e)
					{
						System.out.println(e.getMessage());
						break;
					}

				case 3:
					System.out.println("\n\n...........................We'll Meet Soon..... :) ....................");
					return;

				default:
					System.out.println("Please... Choose only the given OPTIONS........");			
			}
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//9. Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally.

class FileIoException
{
	public void handleFNFE()
	{
		try
		{
			Scanner read = new Scanner(new File("Hello.txt"));
			while(read.hasNextLine())
			{
				System.out.println(read.nextLine());
			}
			read.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("\n"+e.getMessage());
		} 
		return;
	}

	public void handleIO()
	{
		try
		{
			FileWriter fw = new FileWriter("Hi.txt");
			fw.write("Hi, I am Moon..");
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println("\n"+e.getMessage());
		}
		return;
	}

	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		FileIoException fi = new FileIoException();
		while(true)
		{
			System.out.println("\nChoose the option: \n1. To handle FileNotFoundException \n2. To handle IOException \n3. To Exit3");
			int option = java.nextInt();
			switch(option)
			{
				case 1: 
					fi.handleFNFE();
					break;
			
				case 2:
					fi.handleIO();
					break;
	
				case 3:
					System.out.println("Closing Downn.......");
					return;

				default:	
					System.out.println("Enter the correct option....");
			}
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*10. Write a Java program to manage a voting system where a person must be at least 18 years old to be eligible to vote. Use a custom exception to handle the scenario when an ineligible person tries to register for voting. Display appropriate messages for eligible and ineligible voters.*/

class AgeException extends RuntimeException
{
	public AgeException(String message)
	{
		super(message);
	}
}

class VotingSystem
{
	public static void ageCheck(String name, int age)
	{
		if(age>=18)
		{
			System.out.println(name + " is eligible to vote.....");
		}
		else
		{
			throw new AgeException(name + " is not eligible to vote.....");
		}
	}
	
	public static void main(String[]args)	
	{
		try
		{
			Scanner java = new Scanner(System.in);
			System.out.println("Enter your name: ");
			String name = java.nextLine();
			System.out.println("Enter the age: ");
			int age = java.nextInt();
			ageCheck(name, age);
		}
		catch(AgeException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

















