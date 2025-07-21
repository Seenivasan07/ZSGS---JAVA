/*
*Day-3 Assignment Questions:*

1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
2. Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the details for two students having names "Sam" and "John" respectively.
3. Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees.
4. Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, such that it can internally keep track of how many vehicles have been created so far, without requiring manual counting from outside the class.
5. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated.
‌
6. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output.
*/


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;

public class Day3
{
	public static void main(String[]args)
	{
	}
}

/*1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.*/
class Student
{
	String name;
	int roll_no;
	public static void main(String[]args)
	{
		Student st = new Student();
		st.name = "John";
		st.roll_no = 2;
		System.out.println("The name of the student: "+st.name);
		System.out.println("The roll_no of the student: "+st.roll_no);
	}
}

/*
2. Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the details for two students having names "Sam" and "John" respectively.
*/
class Student1
{
	String name;
	int roll_no;
	int phone_no;
	String address;

	public Student1(String name, int roll_no, int phone_no, String address)
	{
		this.name = name;
		this.roll_no = roll_no;
		this.phone_no = phone_no;
		this.address = address;

		System.out.println("Student name: "+name+"\nStudent roll_no: "+roll_no+"\nStudent phone_no: "+phone_no+"\nStudent address: "+address);
	}
	public static void main(String[]args)
	{
		Student1 s1 = new Student1("John", 01, 9876510, "US");
		Student1 s2 = new Student1("Sam", 02, 8765490, "UK");	
	}
}

/*
3. Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees.
*/
class Employee
{
	String emp_Name;
	int emp_Id;
	String designation;
	double salary;

	public Employee()                                               //Default Constructor
	{
		System.out.println("Object has been creaeted");
		emp_Name = "james";
		emp_Id = 01;
		designation = "Software Developer";
		salary = 50000;
		System.out.println("Employee name: "+emp_Name+"\nEmployee ID: "+emp_Id+"\nDesignation: "+designation+"\nSalary: "+salary);
		System.out.println("\n");
	}
	
	public Employee(String name, int id, String designation, double salary)        //Parameterized Constructor
	{
		this.emp_Name = name;
		this.emp_Id = id;
		this.designation = designation;
		this.salary = salary;
		System.out.println("Employee name: "+emp_Name+"\nEmployee ID: "+emp_Id+"\nDesignation: "+designation+"\nSalary: "+salary);
		System.out.println("\n");
	}

	public Employee(Employee e)                                      //Copy Constructor
	{
		System.out.println("Copies the values from the another object...");
		this.emp_Name = e.emp_Name;
		this.emp_Id = e.emp_Id;
		this.designation = e.designation;
		this.salary = e.salary;
		System.out.println("Employee name: "+emp_Name+"\nEmployee ID: "+emp_Id+"\nDesignation: "+designation+"\nSalary: "+salary);
	}

	public static void main(String[]args)
	{
		Employee E1 = new Employee();
		Employee E2 = new Employee("John", 02, "Security Analyst",50000);
		Employee E3 = new Employee(E2);
	}
}

/*
4. Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, such that it can internally keep track of how many vehicles have been created so far, without requiring manual counting from outside the class.
*/
class Vehicle
{
	int[]vehicle_Id;
	String[]brand_Name;
	double[]price;
	int count = 0;

	public Vehicle(int size)
	{
		vehicle_Id = new int[size];
		brand_Name = new String[size];
		price = new double[size];
	}
	
	public void addVehicle(int id, String brand, double rate)
	{
		if(count<price.length)
		{
			vehicle_Id[count] = id;
			brand_Name[count] = brand;
			price[count] = rate;
			count++;
		}
		else
		{
			System.out.println("Storage is Full!!!");
		}
	}
	
	public void list_Vehicles()
	{
		System.out.println("Number of cars: "+count);
		System.out.println("VEHICLE_ID "+"\tBRAND_NAME "+"\tPRICE");
		for(int i = 0;i<=count;i++)
		{
			System.out.println(vehicle_Id[i] + "\t\t" + brand_Name[i] + "\t\t" + price[i]);
		}
		return;
	}
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter the storage size: ");
		int size = java.nextInt();
  		Vehicle vc = new Vehicle(size);
		while(true)
		{
			System.out.println("Enter the choice \"1\" for add vehicle or Enter the choice \"2\" to list vehicles or Enter the choice \"3\" to exit: ");
			int choice = java.nextInt();
			java.nextLine();
			switch(choice)
			{
				case 1: 
					System.out.println("Enter the vehicle id: ");
					int id = java.nextInt();
					java.nextLine();
					System.out.println("Enter the vehicle brand: ");
					String brand = java.nextLine();
					System.out.println("Enter the price: ");
					double price = java.nextDouble();
					vc.addVehicle(id, brand, price);
					break;

				case 2: 
					vc.list_Vehicles();
					break;

				case 3: 
					System.out.println("Shutting Down!!");
					return;
				default:
					System.out.println("Enter the right choice!!!!");
			}
		}
	}
}

/*
5. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated.
*/
class Store
{
}
class Product
{
}
class Inventory
{
}

/*
6. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output.
*/
class Employee1
{
	String name;
	int year;
	String address;
	public Employee1(String name, int year, String address)                                             
	{
		this.name = name;
		this.year = year;
		this.address = address;
		System.out.println(name + "\t"+ year + "\t\t\tL;" + address);
	}
	public static void main(String[]args)
	{
		System.out.println("Name"+"\tYear of joining  "+"\tAddress");
		Employee1 E1 = new Employee1("Robert",1994,"64C - WallsStreet");
		Employee1 E2 = new Employee1("sam",2000, "68D - WallsStreet");
		Employee1 E3 = new Employee1("john",1999,"26B - WallsStreet");
	}
}















