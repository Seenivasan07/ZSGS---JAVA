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
6. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
Create two classes:
---Store
---Product
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
Task: Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
Also Check how many .class files are generated.
*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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

//----------------------------------------------------------------------------------------------------------------------------------------------------------
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

		System.out.println("Circle Center is ("+this.getX()+","+this.getY()+")");
		System.out.println("Radius is :"+this.radius);
		System.out.println("Area is "+(3.14)*this.radius*this.radius);
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

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
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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
	}
}











































