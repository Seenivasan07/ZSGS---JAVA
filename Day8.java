/* DAY 8 - ASSIGNMENT.....

1. Illustrates with an example of using Singleton class.
2. Develop a Java program which illustrates the usage of Comparator Interface.
3. Develop a Java program which illustrates the usage of Comparable Interface.
4. Get some strings through the command-line prompt and use an array to store and display them.
5. Write a program to illustrate the usage of clone() and find out what kind of copy it will make.
6. Develop a Java program to illustrate pass-by-value.
7. Develop a Java program to illustrate the usage of toString() method.
8. Write a Java program to demonstrate the concept of object cloning using the clone() method.
--->Create a class Student with fields like name, rollNo, and department.
--->Attempt to clone an object of this class using the clone() method.
--->Catch and handle the CloneNotSupportedException if thrown.
***Also find out and explain why the class must implement the Cloneable interface to avoid CloneNotSupportedException.
-->Your program should clearly illustrate:
a. What happens if Cloneable is not implemented
b. How the error is resolved by implementing Cloneable */

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;

public class Day8
{
	public static void main(String[]args)
	{
	}
}

//1. Illustrates with an example of using Singleton class.

class SingleTon
{
	public static SingleTon obj;
	
	Private SingleTon()
	{
		System.out.println("->Constructor is set to private, so that no other instances can be created outside the class. \n->It will be called only ones...);
	}
	public static synchronized SingleTon getObject()
	{
		if(obj == null)
		{
			obj = new SingleTon();
		}
		return obj;
	}
}

class SingletonMain
{
	public static void main(String[]args)
	{
		SingleTon object1 = SingleTon.getObject();
		SingleTon object2 = SingleTon.getObject();

		if(object1 == object2)
		{
			System.out.println("The Object will get created only once, and for the remains it will get assigned by the first created ones...");
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//2. Develop a Java program which illustrates the usage of Comparator Interface.

class Student
{
	String name;
	int age;

	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String toString()
	{
		return "Student [ Name: "+this.name+" ,Age: "+this.age+" ]";
	}
}

class Demo
{
	public static void main(String[]args)
	{
		Comparator<Student>cmp = new Comparator<Student>()
		{
			public int compare(Student i, Student j)
			{
				return i.age - j.age;
			}
		};

		List<Student> studs = new ArrayList<Student>();
		studs.add(new Student("java", 25));
		studs.add(new Student("python", 15));
		studs.add(new Student("javascript", 24));
	
		Collections.sort(studs, cmp);
			
		for(Student s: studs)
		{
			System.out.println(s);
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//3. Develop a Java program which illustrates the usage of Comparable Interface.

class Student implements Comparable<Student>
{
	String name;
	int age;

	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String toString()
	{
		return "Student [ Name: "+this.name+" ,Age: "+this.age+" ]";
	}
	
	public int compareTo(Student that)
	{
		return this.age - that.age;
	}
}

class Demo
{
	public static void main(String[]args)
	{

		List<Student> studs = new ArrayList<Student>();
		studs.add(new Student("java", 25));
		studs.add(new Student("python", 15));
		studs.add(new Student("sql", 24));

		Collections.sort(studs);
	
		for(Student s: studs)
		{
			System.out.println(s);
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//4. Get some strings through the command-line prompt and use an array to store and display them.

class CommandLineArgs
{
	public static void main(String[]args)
	{
		System.out.println("The Command Line Arguments are as follows: ");
		for(int i = 0;i<args.length;i++)
		{
			System.out.print(args[i] + " ");
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//5. Write a program to illustrate the usage of clone() and find out what kind of copy it will make.

class Bike implements Cloneable
{
	String bike;
	int year;
	
	public Student(String name, int year)
	{
		this.bike = name;	
		this.year = year;
	}

	protected Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}

	public String toString()
	{
		return "\n Bike ModelName: "+this.bike+"\nLaunched Year: "+this.year;  
	}
}

class ToClone 
{
	public static void main(String[]args) throws CloneNotSupportedException
	{
		Bike b1 = new Bike("Royal Enfield Hunter", 2022);
		Bike b2 = (Bike)s1.clone();

		System.out.println("Original Cloning: "+b1);
		System.out.println("\nAfter Cloning: "+b2);
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//6. Develop a Java program to illustrate pass-by-value.

class PassByValue
{
	public static void changeValue(int x)
	{
		x = 10;
	}
	public static void main(String[]args)
	{
		int a = 7;
		changeValue(a);
		System.out.println("The value of a: "+a);
		System.out.println(".....The value will not change outside the method, cause java only sends the copy of its value not the actual varibale.....");
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//7. Develop a Java program to illustrate the usage of toString() method.

class Language
{
	String lang;
	public Language(String lang)
	{
		this.lang = lang;
	}

	public String toString()
	{
		return lang + " is one of the Most Powerfull Programming Language.....";
	}
}

class Demo
{
	public static void main(String[]args)
	{
		Language l = new Language("Java");			//Before Overriding -> Language@372f7a8d
		System.out.println(l);	            			//After Overriding  -> Java is one of the Most Powerfull Programming Language..... 
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*8. Write a Java program to demonstrate the concept of object cloning using the clone() method.
--->Create a class Student with fields like name, rollNo, and department.
--->Attempt to clone an object of this class using the clone() method.
--->Catch and handle the CloneNotSupportedException if thrown.
***Also find out and explain why the class must implement the Cloneable interface to avoid CloneNotSupportedException.
-->Your program should clearly illustrate:
a. What happens if Cloneable is not implemented
b. How the error is resolved by implementing Cloneable */

class Year implements Cloneable
{
	String month;
	int year;

	public Year(String month, int year)
	{
		this.month = month;
		this.year = year;
	}

	protected Object clone()throws CloneNotSupportedException 
	{
		return super.clone();
	}

	public void display()
	{
		System.out.println("Launched Month: "+this.month);
		System.out.println("Launched Year: "+this.year);
	}
}

class Car implements Cloneable
{
	String brandName;
	String modelName;
	Year y;
	
	public Car(String brandName, String modelName, Year y)
	{
		this.brandName = brandName;
		this.modelName = modelName;
		this.y = y;
	}

	protected Object clone()throws CloneNotSupportedException
	{
		Car c = (Car)super.clone();
		c.y = (Year)c.y.clone();
		return c;
	}

	public void display()
	{
		System.out.println("Car Brand Name: "+this.brandName);
		System.out.println("Car Model Name: "+this.modelName);
		y.display();
	}
}

class CarDetails
{
	public static void main(String[]args)
	{
		try
		{
			Year yr = new Year("August", 2024);
			Car c1 = new Car("Mahindra", "Thar Roxx", yr);
			Car c2 = (Car)c1.clone();
			c2.display();
			System.out.println();
			
			yr.year = 2025;
			c1.display();
			System.out.println();
			c2.display();

		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}

//a. Clone Not Support Exception will be thrown...
//b. Implementing Cloneable, says that "The class is ready to clone.."

















	