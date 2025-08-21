/*
*Day-11 Assignment Questions:*
1. Write a Java program to read the contents of a text file and display it on the console.
2. Write a Menu driven Java program a) to read content from the user and write it into another file and b) from the file to another file c) to modify the content of a file d) to search for a particular word in a file and display how many times it appears e) read the content(List of Electronic Products) of a .txt file and copy them to the .csv file.
3. Write a Java program that reads a file and prints the number of lines, words, and characters.
4. Write a Java program to append a text read from the user to an existing file without overwriting the original content.
5. Design a Java application to manage a product inventory system using file handling and object serialization.
Create a class Product with the following attributes:
--->int productId
--->String name
--->double price
--->int quantity
a. Ensure the class implements the Serializable interface.
b. Methods:
--->Add a Product: Accept product details from the user and write the object to a file (products.dat).
--->View All Products: Read all product objects from the file and display them.
--->Search Product by ID: Search for a product by productId in the file and display its details if found.
--->Update Product: Locate a product in the file using the ID, update its price or quantity, and save the changes back to the file.
--->Delete Product: Remove a product object from the file by ID (involves rewriting the file).
--->Use proper exception handling and ensure that object serialization and deserialization are handled safely and efficiently.
/*

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//1. Write a Java program to read the contents of a text file and display it on the console.

class Ques1
{
	public static void main(String[]args)
	{
		try
		{
			BufferedReader fr = new BufferedReader(new FileReader("File.txt"));
			String line;
			while((line = fr.readLine())!= null)
			{
				System.out.println(line);
			}
			fr.close();			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//2. Write a Menu driven Java program a) to read content from the user and write it into another file and b) from the file to another file c) to modify the content of a file d) to search for a particular word in a file and display how many times it appears e) read the content(List of Electronic Products) of a .txt file and copy them to the .csv file.

class Ques2
{
	public static void main(String[]args)
	{
		
	//a) to read content from the user and write it into another file
		try
		{	
			String line;	
			Scanner input = new Scanner(System.in);
		
			BufferedWriter bw = new BufferedWriter(new FileWriter("File.txt"));

			System.out.println("Enter something: ");
			line = input.nextLine();
			bw.write(line);
			bw.close();
			System.out.println("\n\n");
			
			BufferedReader br = new BufferedReader(new FileReader("File.txt"));
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
			}
			br.close();
			System.out.println("\n\n");

	//b) from the file to another file 	
		
			File file = new File("File1.txt");
	3		file.createNewFile();
			bw = new BufferedWriter(new FileWriter("File1.txt"));
			br = new BufferedReader(new FileReader("File.txt"));

			while((line = br.readLine())!=null)
			{
				bw.write(line);
			}
			bw.close();
			br.close();

			br= new BufferedReader(new FileReader("File1.txt"));
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
			}	
			br.close();
			System.out.println("\n\n");

	//c) to modify the content of a file

			bw = new BufferedWriter(new FileWriter("File1.txt"));
			System.out.println("Enter something to modify the content: ");
			line = input.nextLine();
			bw.write(line);
			bw.close();

			br = new BufferedReader(new FileReader("File1.txt"));
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
			}
			br.close();
			System.out.println("\n\n");

	//d) to search for a particular word in a file and display how many times it appears 

			String word = "java";
			int count = 0;
			br = new BufferedReader(new FileReader("File.txt"));
			while((line = br.readLine())!=null)
			{
				String[]words = line.split("\\s+");
				for(String str:words)
				{
					if(str.equalsIgnoreCase(word))
					{
						count++;
					}
				}
			}
			br.close();
			System.out.println("The presence of the given word in the file is: "+count+" times...");
			System.out.println("\n\n");

	//e) read the content(List of Electronic Products) of a .txt file and copy them to the .csv file.
			
			file = new File("products.csv");
			bw = new BufferedWriter(new FileWriter("products.csv"));
			br = new BufferedReader(new FileReader("elecproducts.txt"));
			while((line = br.readLine())!=null)
			{
				String newLine = line.replaceAll("\\s+", ", ");
				bw.write(newLine);
			}
			bw.close();
			br.close();

			br = new BufferedReader(new FileReader("products.csv"));
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
			}
			br.close();
			input.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}	
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//3. Write a Java program that reads a file and prints the number of lines, words, and characters.

class Ques3
{
	public static void main(String[]args)
	{
		try
		{
			int wordCount = 0, characterCount = 0, lineCount = 0;
			BufferedReader br = new BufferedReader(new FileReader("File.txt"));
			String line;
			while((line = br.readLine())!=null)
			{
				String[]words = line.split("\\s+");
				wordCount += words.length;

				for(char c: line.toCharArray())
				{
					if(Character.isLetter(c))
					{
						characterCount++;
					}
				}
		
				lineCount++;
			}
		
			System.out.println("No of lines in the file: " + lineCount);
			System.out.println("No of words in the file: " + wordCount);
			System.out.println("No of characters in the file: " + characterCount);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//4. Write a Java program to append a text read from the user to an existing file without overwriting the original content.

class Ques4
{
	public static void main(String[]args)
	{
		try
		{
			String line;
			BufferedReader br = new BufferedReader(new FileReader("File1.txt"));
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
			}
			System.out.println("\n\n");

			Scanner input = new Scanner(System.in);
			BufferedWriter bw = new BufferedWriter(new FileWriter("File1.txt", true));
			System.out.println("Enter something to append: ");
			line = input.nextLine();
			bw.write(line);
			bw.close();
			input.close();
			System.out.println("\n\n");	

			br = new BufferedReader(new FileReader("File1.txt"));
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
			}
			br.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*5. Design a Java application to manage a product inventory system using file handling and object serialization.
Create a class Product with the following attributes:
--->int productId
--->String name
--->double price
--->int quantity
a. Ensure the class implements the Serializable interface.
b. Methods:
--->Add a Product: Accept product details from the user and write the object to a file (products.dat).
--->View All Products: Read all product objects from the file and display them.
--->Search Product by ID: Search for a product by productId in the file and display its details if found.
--->Update Product: Locate a product in the file using the ID, update its price or quantity, and save the changes back to the file.
--->Delete Product: Remove a product object from the file by ID (involves rewriting the file).
--->Use proper exception handling and ensure that object serialization and deserialization are handled safely and efficiently.
/*

class Product implements Serializable
{
    int productId;
    String name;
    double price;
    int quantity;

    public Product(int productId, String name, double price, int quantity)
    {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display()
    {
        System.out.println("... Product Details ... \n");
        System.out.println("Product ID = "+productId);
        System.out.println("Product Name = "+name);
        System.out.println("Product Price = "+price);
        System.out.println("Product Quantity = "+quantity+"\n\n");
    }
}

class ProductInventorySystem
{
    public static void main(String[] args) 
	{
        Product p1 = new Product(121,"KeyBoard",1200,10);
        Product p2 = new Product(122,"Mouse",1400,10);
        Product p3 = new Product(123,"Laptop",140000,10);
        Product p4 = new Product(124,"Mobile",14000,10);

        ArrayList<Product> lists=new ArrayList<>();
        lists.add(p1);  
		lists.add(p2);
		lists.add(p3);  
		lists.add(p4);
 
        addProd(false,lists);
		System.out.println("-----Product Added Successfully-----\n\n");

        System.out.println("-----Reading File-----\n");
		
        try
        {
            ArrayList<Product> product = readProd("Product.ser");
            for(Product obj:product)
            {
                obj.display();
            }
        }
        catch (IOException  | ClassNotFoundException e)
        {
            System.out.println("Exception Occur \n\n");
            e.printStackTrace();
        }

        System.out.println("-----Searching Product to PID is 122-----\n");

        try 
		{
            Product ser = searchProd("Product.ser", 122);
            ser.display();
        } 
		catch (IOException |ClassNotFoundException e) 
		{
            e.printStackTrace();
        }

        System.out.println("-----Update Product Price and Quantity to PID is 123-----\n");

        try
		{
            if(updateProd("Product.ser",123,1200000,20))
            {
                try
                {
                    ArrayList<Product> product = readProd("Product.ser");
                    for(Product obj:product)
                    {
                        obj.display();
                    }
                }
                catch (IOException  | ClassNotFoundException e)
                {
                    System.out.println("Exception Occur ");
                }
            }
            else
		    {
                System.out.println("Updation Failed");
            }
        }
        catch (Exception e) 
		{
            e.printStackTrace();
        }

        System.out.println("-----Delete Product to PID 123-----\n");

        if(deleteProd("Product.ser",123))
        {
            try
            {
                ArrayList<Product> product = readProd("Product.ser");
                for(Product obj:product)
                {
                    obj.display();
                }
            }
            catch (IOException  | ClassNotFoundException e)
            {
                System.out.println("Exception Occur ");
            }
        }
    }

    public static boolean addProd(boolean append,ArrayList<Product> list)
    {
        try(FileOutputStream file=new FileOutputStream("Product.ser",append);
            ObjectOutputStream out =new ObjectOutputStream(file))
        {
            for(Product p:list) 
			{
                out.writeObject(p);
            }
        }
        catch(IOException e)
        {
            return  false;
        }
        return true;
    }

    public static ArrayList<Product> readProd(String fileName) throws IOException,ClassNotFoundException
    {
        try(FileInputStream file=new FileInputStream(fileName);
        ObjectInputStream input=new ObjectInputStream(file))
        {
            ArrayList<Product> list=new ArrayList<>();
			
            try 
		    {
                while (true) 
			    {
                    Product p = (Product) input.readObject();
                    list.add(p);
                }
            }
            catch (EOFException e)
            {
                return list;
            }
        }
    }

    public static Product searchProd(String fileName,int id) throws IOException,ClassNotFoundException
    {
        Product p=null;

        try(FileInputStream file=new FileInputStream(fileName);
            ObjectInputStream input=new ObjectInputStream(file))
        {
            try 
			{
                while (true) 
				{
                    p = (Product) input.readObject();
                    if(p.productId==id)
                    {
                        return p;
                    }
                }
            }
            catch (EOFException e)
            {
                throw new EOFException("Not  Available ");
            }
        }
    }

    public static  boolean  updateProd(String fileName,int id,int  newQuantity,int newPrice)
    {
        try 
	    {
            ArrayList<Product> list = readProd(fileName);
            ArrayList<Product>updated=new ArrayList<>();
            for(Product p:list)
            {
                if(p.productId==id)
                {
                    p.price=newPrice;
                    p.quantity=newQuantity;
                }
                updated.add(p);
            }
            addProd(false,list);
            return true;
        }  
	    catch (Exception e) 
	    {
            return false;
        }
    }

    public static  boolean  deleteProd(String fileName,int id)
    {
        try 
		{
            boolean b=false;
            ArrayList<Product> list = readProd(fileName);
            ArrayList<Product>updated=new ArrayList<>();
            for(Product p:list)
            {
                if(p.productId==id)
                {
                    continue;
                }
                updated.add(p);
            }
            addProd(false,updated);
            return true;
        }
		catch (Exception e) 
		{
            return false;
        }
    }
}

































