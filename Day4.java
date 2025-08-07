/*Day-4 Assignment Questions:

1. We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.
‌
2. Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z. Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"
‌
3. A class Point is declared as follows:
class Point{
public:
Point(){int=0;int=0;} //default constructor
void setPoint(int,int); //set coordinates
int getX() const {return x;} //get x coordinates
int getY() const {return y;} //get y coordinates
void printPoint(); // print (x,y) coordinates
private int x;
private int y;
};
Write the implementation of the class Point in the same file.
Then, declare a class called Circle that is derived from the class Point. The class Circle has public member functions Circle (constructor), setRadius(), getRadius() and area() and one private data member radius. The class Circle indirectly uses private member x and y of class Point to store the coordinate of the center of the circle. The class Circle also checks to make sure the radius value is a positive number, otherwise it is set to default value 1.
Note: The private members of class Point can only be indirectly accessed by class Circle using public methods of class point.
Implement the class Circle and write a driver program to test the class Circle. An example of the output of the driver program is.
Enter x: 2
Enter y: 2
Enter radius: 1
Circle center is (2,2)
Radius is 1
Area is 3.14
4. Write a program to illustrate that Classes cannot be used for multiple Inheritance.
5. Create a class named Shape with a method that prints "This is a shape". Create another class named Polygon inheriting the Shape class with the same method that prints "Polygon is a shape". Create two other classes named Rectangle and Triangle having the same method which prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. Again, make another class named Square having the same method which prints "Square is a rectangle".
Now, try calling the method by the object of each of these classes.
6. Design and implement a custom Java class named MyString that mimics the behavior of Java’s built-in String class. Your class should store character data internally (e.g., using a char[] or String as input) and should provide the following string methods,
1. int length() – Returns the number of characters.
2. char charAt(int index) – Returns the character at the specified index.
3. boolean equals(MyString other) – Checks if two MyString objects are equal.
4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
6. MyString substring(int start, int end) – Returns a substring from start to end-1.
7. MyString concat(MyString other) – Concatenates another string to the current one.
8. boolean contains(MyString sub) – Checks if a substring exists.
9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
* Implement proper constructors, including one that takes a char[] or String as input.
* Avoid using any built-in String methods to perform the operations internally.
* Write a main method to demonstrate the working of your MyString class.                                                                                                                                                                                                             7. Design a calculator application using Java Inheritance.
‌
Create the following class hierarchy:
‌
--->BasicCalculator (Base class):
Implement at least three basic arithmetic methods, such as:
‌
--->add(int a, int b)
--->subtract(int a, int b)
--->multiply(int a, int b)
--->divide(int a, int b)
‌
--->AdvancedCalculator (Inherits from BasicCalculator):
Add 3 to 4 advanced mathematical operations, such as:
‌
--->power(int base, int exponent)
--->modulus(int a, int b)
--->squareRoot(double number)
‌
--->ScientificCalculator (Inherits from AdvancedCalculator):
Add scientific functions, such as:
‌
--->sin(double angle)
--->cos(double angle)
--->log(double value)
--->exp(double value)
* Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three levels of the class hierarchy.
* Use appropriate access specifiers and method overrides where required.
* Add a main() method to test all operations.

*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
public class Day4
{
	public static void main(String[]args)
	{
	}
}

/*
1. We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.
*/

class Vehicles
{
	String mileage;
	double price;
}
class Car extends Vehicles
{
	double cost;
	int warranty;
	int seat;
	String fuel;
}
class Audi extends Car
{
	String modelType;
}
class Ford extends Car
{
	String modelType;
}
class Bike extends Vehicles
{
	int cyclinder;
	int gears;
	String coolingType;
	String wheelType;
	String tankSize;
}
class Bajaj extends Bike
{
	String makeType;
}
class Tvs extends Bike
{
	String makeType;
}

class Motor
{
	public static void displayCar(String model, String mil, double price, int seat, String fuel, int warranty, double cost)
	{
		System.out.println(model +"\t\t\t "+mil+"\t\t\t "+price+"\t\t\t "+seat+"\t\t\t "+fuel+"\t\t\t "+warranty+"\t\t\t "+cost);
		return;
	}

	public static void displayBike(String model, String mil, double price, int cyl, int gear, String cool, String wheel, String tank)
	{
		System.out.println(model+"\t\t\t "+mil+"\t\t\t "+price+"\t\t\t "+cyl+"\t\t\t "+gear+"\t\t\t "+cool+"\t\t\t "+wheel+"\t\t\t "+tank);
		return;
	}
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		Audi a = new Audi();
		Ford d = new Ford();
		Bajaj b = new Bajaj();
		Tvs t = new Tvs();

		a.modelType = "Q7";
		a.mileage = "11KmPl";
		a.price = 9000000;
		a.seat = 7;
		a.fuel = "petrol";
		a.warranty = 2;
		a.cost = 5000000;

		d.modelType = "Endeavour";
		d.mileage = "15KmPl";
		d.price = 3000000;
		d.seat = 7;
		d.fuel = "petrol";
		d.warranty = 2;
		d.cost = 1500000;

		b.makeType = "Bajaj";
		b.mileage = "50KmPl";
		b.price = 50000; 
		b.cyclinder = 1;
		b.gears = 4;
		b.coolingType = "air";
		b.wheelType = "spokes";
		b.tankSize = "5 litre";

		t.makeType = "TVS";
		t.mileage = "45KmPl";
		t.price = 60000; 
		t.cyclinder = 1;
		t.gears = 4;
		t.coolingType = "air";
		t.wheelType = "alloy";
		t.tankSize = "6 litre";

		while(true)
		{
			System.out.println("Enter the choice: \n"+"1. Car\n"+"2. Bike\n"+"3. Exit");
			int choice = java.nextInt();
			switch(choice)
			{
				case 1: 
					System.out.println("Choose the car: \n"+"1. Ford\n"+"2. Audi");
					int option1 = java.nextInt();
					System.out.println("Model\t\t\t Mileage\t\t\t Price\t\t\t Seat\t\t\t Fuel\t\t\t Warranty\t\t\t Cost");
					switch(option1)
					{
						case 1:
							displayCar(d.modelType,d.mileage,d.price,d.seat,d.fuel,d.warranty,d.cost);
							break;
					
						case 2:
							displayCar(a.modelType,a.mileage,a.price,a.seat,a.fuel,a.warranty,a.cost);
							break;
					}
					break;

				case 2: 
					System.out.println("Choose the Bike: \n"+"1. Bajaj\n"+"2. TVS");
					int option2 = java.nextInt();
					System.out.println("Model\t\t\t Mileage\t\t\t Price\t\t\t Cyclinder\t\t\t Gears\t\t\t CoolingType\t\t\t WheelType\t\t\t TankSize");
					switch(option2)
					{
						case 1:
							displayBike(b.makeType,b.mileage,b.price,b.cyclinder,b.gears,b.coolingType,b.wheelType,b.tankSize);
							break;
					
						case 2:
							displayBike(t.makeType,t.mileage,t.price,t.cyclinder,t.gears,t.coolingType,t.wheelType,t.tankSize);
							break;
					}
					break;
				
				case 3:
					System.out.println("Shutting Down!!!");
					return;

				default:
					System.out.println("Enter the valid option!!!!");
								
			}
		}

	}
}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
2. Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z. Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"
*/

class TwoD
{
	private int x;
	private int y;
	
	public TwoD()
	{
		System.out.println("Parent class Empty Constructor");
	}
	public TwoD(int x, int y)
	{
		System.out.println("Parent class Parameterized Constructor to set values");
		setValue(x, y);
	}
	public void setValue(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	
}
class ThreeD extends TwoD
{
	private int z;

	ThreeD()
	{
		super();
		System.out.println("Child Class Empty Constructor");
	}
	ThreeD(int x, int y, int z)
	{
		super(x,y);
		this.z = z;	
	}
	public void setZ(int z)
	{
		this.z = z;
	}
	public int getZ()
	{
		return z;
	}
	public void distance(ThreeD three)
	{	
		int a = this.getX() - three.getX();
		int b = this.getY() - three.getY();
		int c = this.getZ() - three.getZ();
		System.out.println((int)Math.sqrt(a*a+b*b+c*c));
	}
        
}
class Cons
{
	public static void main(String[]args)
	{
		ThreeD td = new ThreeD();
		td.setValue(7,8);
		td.setZ(9);
		td.distance(new ThreeD(4,5,6));
	}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
3. A class Point is declared as follows:
class Point{
public:
Point(){int=0;int=0;} //default constructor
void setPoint(int,int); //set coordinates
int getX() const {return x;} //get x coordinates
int getY() const {return y;} //get y coordinates
void printPoint(); // print (x,y) coordinates
private int x;
private int y;
};
Write the implementation of the class Point in the same file.
Then, declare a class called Circle that is derived from the class Point. The class Circle has public member functions Circle (constructor), setRadius(), getRadius() and area() and one private data member radius. The class Circle indirectly uses private member x and y of class Point to store the coordinate of the center of the circle. The class Circle also checks to make sure the radius value is a positive number, otherwise it is set to default value 1.
Note: The private members of class Point can only be indirectly accessed by class Circle using public methods of class point.
Implement the class Circle and write a driver program to test the class Circle. An example of the output of the driver program is.
Enter x: 2
Enter y: 2
Enter radius: 1
Circle center is (2,2)
Radius is 1
Area is 3.14
*/

class Point
{
	private int x;
	private int y;
	
	public Point()
	{
		this.x = 0;	
		this.y = 0;
		System.out.println("The default value of x and y: "+this.x+", "+this.y);
	}
	public void setPoint(int x, int y)
	{
		this.x = x;
		this.y = y;	
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public void printPoint()
	{
		System.out.println("Circle Center is ("+this.getX()+","+this.getY()+")");
	}
	
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter the x value: ");
		int val1 = java.nextInt();
		System.out.println("Enter the y value: ");
		int val2 = java.nextInt();
		System.out.println("Enter the radius: ");
		int rd = java.nextInt();
		Circle cd = new Circle();
		cd.setPoint(val1, val2);
		cd.printPoint();
		cd.setRadius(rd);
		cd.area();
	}

}
class Circle extends Point
{
	private double radius ;
	public Circle()
	{
   		System.out.println("Circle class default constructor");
	}
	public void setRadius(double radius)
	{
		this.radius = (radius>0)?radius:1;
	}
	public double getRadius()
	{
		return this.radius;
	}
	public void area()
	{
		System.out.println("Radius is :"+this.radius);
		System.out.println("Area is "+(3.14)*this.radius*this.radius);
	}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*4. Write a program to illustrate that Classes cannot be used for multiple Inheritance.

class Square
{
	public void area()
	{
		System.out.println("Area of Square Formula: side * side");
	}
}
class Rectangle
{
	public void area()
	{
		System.out.println("Area of Rectangle Formula: length * breadth");
	}
}
public class Area extends Square,Rectangle
{
	public static void main(String[]args)
	{
		Area a = new Area();
		a.area();              //here, it confuses which area method to call..
	}
}
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
5. Create a class named Shape with a method that prints "This is a shape". Create another class named Polygon inheriting the Shape class with the same method that prints "Polygon is a shape". Create two other classes named Rectangle and Triangle having the same method which prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. Again, make another class named Square having the same method which prints "Square is a rectangle".
Now, try calling the method by the object of each of these classes.
*/

class Shape
{
	public void display()
	{
		System.out.println("This is a Shape");
	}
}
class Polygon extends Shape
{
	public void display()
	{
		System.out.println("Polygon is a shape");
	}
}
class Rectangle extends Shape
{
	public void display()
	{
		System.out.println("Rectangle is a polygon");
	}
}
class Triangle extends Shape
{
	public void display()
	{
		System.out.println("Triangle is a polygon");
	}
}
class Square extends Shape
{
	public void display()
	{
		System.out.println("Square is rectangle");
	}
}
class Inheritance
{
	public static void main(String[]args)
	{
		Shape s = new Shape();
		s.display();
		s = new Polygon();
		s.display();
		s = new Rectangle();
		s.display();
		s = new Triangle();
		s.display();
		s = new Square();
		s.display();
	}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
6. Design and implement a custom Java class named MyString that mimics the behavior of Java’s built-in String class. Your class should store character data internally (e.g., using a char[] or String as input) and should provide the following string methods,
1. int length() – Returns the number of characters.
2. char charAt(int index) – Returns the character at the specified index.
3. boolean equals(MyString other) – Checks if two MyString objects are equal.
4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
6. MyString substring(int start, int end) – Returns a substring from start to end-1.
7. MyString concat(MyString other) – Concatenates another string to the current one.
8. boolean contains(MyString sub) – Checks if a substring exists.
9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
* Implement proper constructors, including one that takes a char[] or String as input.
* Avoid using any built-in String methods to perform the operations internally.
* Write a main method to demonstrate the working of your MyString class. 
*/

class MyString
{
	private char[]arr;
	private String myStr;
	public MyString(String s)
	{
		this.arr = s.toCharArray();
		this.myStr = s;
	}

	//to find length....
	public int length()                                                         
	{
		return arr.length;
	}

	//to find the character in the index....
	public char charAt(int n)                                                                    
	{
		return arr[n-1];
	}

	//to check given string is equal with existing ones....
	public boolean check(String s)                                         
	{
		char[]newarr = s.toCharArray();
		if(newarr.length != arr.length)
		{
			return false;
		}
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]!=newarr[i])
			{
				return false;
			}
		}
		return true;
	}

	//to change into upper case....
	public String toUpperCase()                                               
	{
		String upper = "";
		for(int i = 0;i<arr.length;i++)
		{
			if((arr[i]>=97) && (arr[i]<=122))
			{
				upper +=(char)(arr[i] - 32);
			}
			else
			{
				upper += arr[i];
			}
		}
		return upper;	
	}

	//to change into lower case....
	public String toLowerCase()                                             
	{
		String lower = "";
		for(int i = 0;i<arr.length;i++)
		{
			if((arr[i]>=65) && (arr[i]<=90))
			{
				lower +=(char)(arr[i] + 32);
			}
			else
			{
				lower += arr[i];
			}
		}
		return lower;	
	}

	//to get the substring....
	public String subString(int start, int end)                            
	{
		String substring = "";
		for(int i = start;i<end;i++)
		{
			substring+=arr[i];
		}
		return substring;
	}

	//to concatenate with the new ones....
	public String conCat(String ct)                                       
	{
		return myStr + ct;
	}

	//to check the given substring is the substring of existing ones....
	public boolean checkString(String s)
	{
		char[]ck = s.toCharArray();
		if(ck.length > arr.length)
		{
			return false;
		}
		int j = 0;
		int i = 0;
		boolean b = false;
		while(i<arr.length && j<ck.length)
		{
			if(arr[i]==ck[j])
			{
				b = true;
				j++;
			}
			else if(b && (arr[i]!=ck[j]))
			{
				b = false;
			}
			i++;
		}
		return j==ck.length;
	}

	//To find the firstIndex position of the given char....
	public int firstIndex(char ch)
	{
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]==ch)
			{
				return i;
			}
		}
		return -1;
	}

	//to replace a character
	public String toReplace(char replace, char replaceWith)
	{
		String replaced = "";
		for(int i = 0;i<arr.length;i++)
		{
			replaced+=(arr[i]==replace)?replaceWith:arr[i];
		}
		return replaced;
	}

}
public class WithoutInbuilt
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = java.nextLine();
		MyString m = new MyString(str);
		while(true)
		{
			System.out.println("List of choices: \n1. To find length \n2. To return character at a given index \n3. To check the given string is equal to existing \n4.To turn into UpperCase \n5.To turn into LowerCase");
			System.out.println("6.To get the Substring \n7.To concatenate with the existing ones \n8.To check the given substring is exists \n9.To get the index of first occurence \n10.To replace the given character \n11.To Exit");
			System.out.println("Enter the choice: ");
			int choice = java.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("The length of the given String is: "+m.length());
					System.out.println("\n");
					break;

				case 2:
					System.out.println("Enter the index: ");
					int ind = java.nextInt();
					System.out.println("The Character at the given position is: "+m.charAt(ind));
					System.out.println("\n");
					break;

				case 3:
					java.nextLine();
					System.out.println("Enter the String to check: ");
					String chk = java.nextLine();
					String val = (m.check(chk))?"Equal":"Not Equal";
					System.out.println("The Strings are : "+ val);
					System.out.println("\n");
					break;

				case 4:
					System.out.println("The Upper Case of the given string is: "+m.toUpperCase());
					System.out.println("\n");
					break;

				case 5:
					System.out.println("The Lower Case of the given string is: "+m.toLowerCase());
					System.out.println("\n");
					break;

				case 6:
					System.out.println("Enter the start and end index: ");
					int start = java.nextInt();
					int end = java.nextInt();
					System.out.println("The substring starting from "+start+" and "+end+ " is: "+m.subString(start, end+1));
					System.out.println("\n");
					break;

				case 7:
					java.nextLine();
					System.out.println("Enter the String to concatenate: ");
					String ct = java.nextLine();
					System.out.println("The String after Concatenation: "+m.conCat(ct));
					System.out.println("\n");
					break;

				case 8:
					java.nextLine();
					System.out.println("Enter the String to check: ");
					String ck = java.nextLine();
					String value = (m.checkString(ck))?"Present":"Not Present";
					System.out.println("The given is "+value+" in the "+str);
					System.out.println("\n");
					break;

				case 9:
					System.out.println("Enter the character to find its first occurence in the string \""+str+"\" : ");
					char ch = java.next().charAt(0);
					System.out.println("If -1 arrives then the given char is not in the string!!!!!");
					System.out.println("The first occurence of the given character in the string \""+str+"\" is: "+m.firstIndex(ch));
					System.out.println("\n");
					break;

				case 10:
					System.out.println("Enter the character to replace in the string "+str+": ");
					char replace = java.next().charAt(0);
					System.out.println("Enter the character to replace with: ");
					char replaceWith = java.next().charAt(0);
					System.out.println("The Updated String :"+ m.toReplace(replace, replaceWith));
					break;	

				case 11:
					System.out.println("Shutting Down!!!");
					return;
				
				default:
					System.out.println("Enter the correct choicee...");
		
			}
		}

	}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
7. Design a calculator application using Java Inheritance.
‌
Create the following class hierarchy:
‌
--->BasicCalculator (Base class):
Implement at least three basic arithmetic methods, such as:
‌
--->add(int a, int b)
--->subtract(int a, int b)
--->multiply(int a, int b)
--->divide(int a, int b)
‌
--->AdvancedCalculator (Inherits from BasicCalculator):
Add 3 to 4 advanced mathematical operations, such as:
‌
--->power(int base, int exponent)
--->modulus(int a, int b)
--->squareRoot(double number)
‌
--->ScientificCalculator (Inherits from AdvancedCalculator):
Add scientific functions, such as:
‌
--->sin(double angle)
--->cos(double angle)
--->log(double value)
--->exp(double value)
* Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three levels of the class hierarchy.
* Use appropriate access specifiers and method overrides where required.
* Add a main() method to test all operations.

*/

class BasicCalculator
{
	public int addition(int a, int b)
	{
		return a+b;
	}
	public int subract(int a, int b)
	{
		return a-b;
	}
	public int multiply(int a, int b)
	{
		return a*b;
	}
	public double division(int a, int b)
	{
		return (double)a/b;
	}
}
class AdvancedCalculator extends BasicCalculator
{
	public int power(int base, int exponent)
	{
		return (int)Math.pow(base, exponent);
	}
	public int modulus(int a, int b)
	{
		return a%b;
	}
	public double squareRoot(double number)
	{
		return Math.sqrt(number);
	}
}
class ScientificCalculator extends AdvancedCalculator
{
	public double sin(double angle)
	{
		return Math.sin(angle);
	}
	public double cos(double angle)
	{
		return Math.cos(angle);
	}
	public double log(double value)
	{
		return Math.log(value);
	}
	public double exp(double value)
	{
		return Math.exp(value);
	}
}
class Calculator
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		ScientificCalculator sf = new ScientificCalculator();
		while(true)
		{
			System.out.println("Enter the Calculator type to perform operations: ");
			System.out.println("1. Basic Calculator (add, subract, multiply, division)");
			System.out.println("2. Advanced Calculator (power, modulus, squareroot)");
			System.out.println("3. Scienctific Calculator (sin, cos, log, exp) \n4.To Exit");
			int choice = java.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter two numbers: ");
					int num1 = java.nextInt();
					int num2 = java.nextInt();
     					System.out.println("Select the operation you want to do: ");
					System.out.println("1.Addition \n2.Subraction \n3.Multiplication \n4.Division");
					int opt1 = java.nextInt();
					switch(opt1)
					{
						case 1:
							System.out.println("The sum of given numbers: "+sf.addition(num1, num2));
							break;
						case 2:
							System.out.println("The difference between given numbers: "+sf.subract(num1, num2));
							break;
						case 3:
							System.out.println("The product of given numbers: "+sf.multiply(num1, num2));
							break;
						case 4:
							System.out.println("The division of given numbers: "+sf.division(num1, num2));
							break;
					}
					break;

				case 2:
     					System.out.println("Select the operation you want to do: ");
					System.out.println("1. To find power \n2. Modulus \n3.Square Root");
					int opt2 = java.nextInt();
					switch(opt2)
					{
						case 1:
							System.out.println("Enter the base and exponent: ");
							int base = java.nextInt();
							int exp = java.nextInt();
							System.out.println("The power of given number: "+sf.power(base, exp));
							break;
						case 2:
							System.out.println("Enter two numbers: ");
							int mod1 = java.nextInt();
							int mod2 = java.nextInt();
							System.out.println("The modulus of given number: "+sf.modulus(mod1, mod2));
							break;
						case 3:
							System.out.println("Enter the number: ");
							int sqt = java.nextInt();
							System.out.println("The square root of given number: "+sf.squareRoot(sqt));
							break;

					}
					break;

				case 3:
     					System.out.println("Select the operation you want to calculate: ");
					System.out.println("1. SIN \n2. COS \n3. LOG \n4. EXPONENT");
					int opt3 = java.nextInt();
					switch(opt3)
					{
						case 1:
							System.out.println("Enter the angle: ");
							double angle = java.nextDouble();
							System.out.println("sin("+angle+"): "+ sf.sin(Math.toRadians(angle)));
							break;
						case 2:
							System.out.println("Enter the angle: ");
							double angle2 = java.nextDouble();						
							System.out.println("cos("+angle2+"): "+ sf.cos(Math.toRadians(angle2)));
							break;
						case 3:
							System.out.println("Enter the number: ");
							double lg = java.nextDouble();
							System.out.println("The log value of given number: "+sf.log(lg));
							break;

						case 4:
							System.out.println("Enter the number: ");
							double ep = java.nextDouble();
							System.out.println("The exponent of given number: "+sf.exp(ep));
							break;
					}
					break;

				case 4:
					System.out.println("Shutting Down!!!");
					return;

				default:
					System.out.println("Choose the valid option!!!");
			}
		}
	}
}











































