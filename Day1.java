/*1. Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?
2. Write a program in which, declare all data types like integer, double, float, long integer, character and byte data and print them.
3. Write a program to find the maximum of two numbers using ternary operator.
4. Write a program to check whether the given two numbers are equal or not w/o using comparison operator?
5. Write a program that illustrate the execution order of static block and initializer block?
6. Write a program that illustrate the Explicit type casting?
7. Write a program to check if a number is a power of 2?
8. Write a program to find the first set bit of a number?
9. Write a class Employee with attributes empId, name, department and salary and define a parametrized constructor Employee(int empId, String name, String department, double salary) and assign these variables to instance variables accordingly and display them?
10. Write a program to check whether the object is an instance of a particular class?*/
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;

public class Day1
{
	public static void main(String[]args)
	{
	}
}
//1. Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?
class Variable
{
	int inst;                                     //instance variable
	static int st;                                //static variable
	public static void main(String[]args)
	{
		int bl = 10;                          //block variable
		final int fin = 7;                    //final variable
		Variable.st = 8;                      //static variable initialization
		
		Variable in1 = new Variable();
		Variable in2 = new Variable();
		in1.inst = 18;                        //Here, using instance we can setup different values for different objects;
		in2.inst = 45;

		System.out.println("Block variable: "+bl);
		System.out.println("Final variable: "+fin);
		System.out.println("Static variable: "+st);
		System.out.println("Instance variable1: "+in1.inst);
		System.out.println("Instance variable2"+in2.inst);
	}
}

//2. Write a program in which, declare all data types like integer, double, float, long integer, character and byte data and print them
class DataTypes
{
	public static void main(String[]args)
	{
		int num = 7;
		float dec1 = (float)9876543/7777;
		double dec2 = 9876543/7777;
		long numlong = 9876543210L;
		char c = 'D';
		byte b = 07;

		System.out.print("Integer value: "+ num + "\n Double value: "+dec2+ "\n Float value: "+dec1+ "\n Long value: "+numlong+"\n char value: "+c+"\n Byte value: "+b);
	}
}

//3. Write a program to find the maximum of two numbers using ternary operator.
class Ternary
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter value 1: ");
		int val1 = java.nextInt();
		System.out.println("Enter value 2: ");
		int val2 = java.nextInt();
		System.out.println("The Maximum number is: "+(val1>val2?val1:val2));
	}
}

//4. Write a program to check whether the given two numbers are equal or not w/o using comparison operator.
class Equal
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter value 1: ");
		int val1 = java.nextInt();
		System.out.println("Enter value2: ");
		int val2 = java.nextInt();
		int res = val1^val2;
		boolean[]arr = new boolean[res + 1];
		arr[res] = true;
		if(arr[0])
		{
			System.out.println("Given Numbers are equal..");
		}
		else
		{
			System.out.println("Given Numbers are not equal...");
		}
	}
}

//5. Write a program that illustrate the execution order of static block and initializer block.
class Initialize
{
	{
		System.out.println("Instance Initializer block will run when a object for the class is created.\n If we create 2 objects for a class then, it will get initialize for 2 times");
	}
	static
	{
		System.out.println("This will get initialize first in a program. \n Static block will executes only once during the class loading.");
	}
	public static void main(String[]args)
	{
		Initialize obj1 = new Initialize();
		Initialize obj2 = new Initialize();
	}
}

//6. Write a program that illustrate the Explicit type casting?
class Explicit
{
	public static void main(String[]args)
	{
		float ft = 7.77f;
		int i = (int)ft;
		System.out.println("The float number: "+ft);
		System.out.println("The integer number: "+i);
	}		
}

//7. Write a program to check if a number is a power of 2.
class Power
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is a power of 2: ");
		int num = java.nextInt();
		int res = 1;
                while(res<=num)
  		{
			res = res*2;                                                      //(num&(num-1))==0
			if(res == num)
			{
				break;
			}
		}
		if(res == num)
		{
			System.out.println("The given number is the power of 2.");
		}
		else
		{
			System.out.println("The given number is not the power of 2.");
		}
	}
}

//8. Write a program to find the first set bit of a number
class SetBit
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = java.nextInt();
		String bin = "";
		while(num!=0)
		{
			bin = bin + (num%2);
			num/=2;
		}
		for(int i = 0;i<bin.length();i++)
		{
			if(bin.charAt(i) == '1')
			{
				System.out.println("The first set bit of the given number is present in the position: "+(i+1));
				break;
			}
 		}	
	}
}

// 9. Write a class Employee with attributes empId, name, department and salary and define a parametrized constructor Employee(int empId, String name, String department, double salary) and assign these variables to instance variables accordingly and display them
class Employee
{
	int empId;
	String name;
	String department;
	double salary;

	public Employee(int empId, String name, String department, double salary)
	{
		this.empId = empId;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public static void main(String[]args)
	{
		Employee emp = new Employee(007, "Seenivasan S", "SoftwareDeveloper", 50000);
		System.out.println("Employee_Name: "+emp.name+"\nEmployee_Id: "+emp.empId+"\nDepartment: "+emp.department+"\nSalary: "+emp.salary);
	}
}

//10. Write a program to check whether the object is an instance of a particular class
class Parent
{	
}
class Main
{
	public static void main(String[]args)
	{
		Parent pt = new Parent();
		
		System.out.println(pt instanceof Parent);
			
	}
}
