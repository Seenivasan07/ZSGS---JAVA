import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.*;

/* Day - 10 ASSIGNMENT
*Day-10 Assignment Questions:*
1. Write a Java program
a. to create a new array list, add some colours (string) and print out the collection.
b. to iterate through all elements in an array list.
c. to insert an element into the array list at the first position.
d. to retrieve an element (at a specified index) from a given array list.
e. to update specific array element by given element.
f. to remove the third element from an array list.
g. to search an element in an array list.
h. to sort a given array list.
i. to copy one array list into another.
j. to shuffle elements in an array list.
‌
2. Write a Java program to,
a. append the specified element to the end of a linked list.
b. iterate through all elements in a linked list.
c. iterate through all elements in a linked list starting at the specified position.
d. iterate a linked list in reverse order.
e. insert the specified element at the specified position in the linked list.
f. insert elements into the linked list at the first and last position.
g. insert the specified element at the front of a linked list.
h. insert the specified element at the end of a linked list.
i. insert some elements at the specified position into a linked list.
j. get the first and last occurrence of the specified elements in a linked list.
‌
3. Write a Java program to,
a. append the specified element to the end of a hash set.
b. iterate through all elements in a hash list.
c. get the number of elements in a hash set.
d. empty the hash set.
e. test a hash set is empty or not.
f. clone a hash set to another hash set.
g. convert a hash set to an array.
h. convert a hash set to a tree set.
i. convert a hash set to a List/ArrayList.
j. compare two hash set.
‌
4. Write a Java program to,
a. create a new tree set, add some colours (string) and print out the tree set.
b. iterate through all elements in a tree set.
c. add all the elements of a specified tree set to another tree set.
d. create a reverse order view of the elements contained in a given tree set.
e. get the first and last elements in a tree set.
f. clone a tree set list to another tree set.
g. get the number of elements in a tree set.
h. compare two tree sets.
Create a TreeSet that stores a set of numbers,   
i. find the numbers less than 7 in a tree set.
j. get the element in a tree set which is greater than or equal to the given element.
k. get the element in a tree set which is less than or equal to the given element.
l. get the element in a tree set which is strictly greater than or equal to the given element.
m. get an element in a tree set which is strictly less than the given element.
n. retrieve and remove the first element of a tree set.
o. retrieve and remove the last element of a tree set.
p. remove a given element from a tree set.
‌
5. Write a Java program to,
1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
2. iterate through all elements in priority queue.
3. add all the elements of a priority queue to another priority queue.
4. insert a given element into a priority queue.
5. remove all the elements from a priority queue.
6. count the number of elements in a priority queue.
7. compare two priority queues.
8. retrieve the first element of the priority queue.
9. retrieve and remove the first element.
10. convert a priority queue to an array containing all of the elements of the queue.
‌
6. Write a Java program to,
1. associate the specified value with the specified key in a Tree Map.
2. copy a Tree Map content to another Tree Map.
3. search a key in a Tree Map.
4. search a value in a Tree Map.
5. get all keys from the given a Tree Map.
6. delete all elements from a given Tree Map.
7. sort keys in Tree Map by using comparator.
8. get a key-value mapping associated with the greatest key and the least key in a map.
9. get the first (lowest) key and the last (highest) key currently in a map.
10. get a reverse order view of the keys contained in a given map.
‌
7. Write a Java program to,
1. associate the specified value with the specified key in a HashMap.
2. count the number of key-value (size) mappings in a map.
3. copy all of the mappings from the specified map to another map.
4. remove all of the mappings from a map.
5. check whether a map contains key-value mappings (empty) or not.
6. get a shallow copy of a HashMap instance.
7. test if a map contains a mapping for the specified key.
8. test if a map contains a mapping for the specified value.
9. create a set view of the mappings contained in a map.
10. get the value of a specified key in a map.
‌
8. Develop a Java program to manage a list of bank accounts using ArrayList.
--->Create an Account class with the following attributes:
a. accountNumber (int)
b. holderName (String)
c. balance (double)
--->Use autoboxing to store the balance and interest as Double wrapper objects.
--->Use manual boxing to convert a primitive interest rate into a Double object.
--->Unbox the values (both automatic and manual) to calculate and update the new balance.
--->Add at least three Account objects to an ArrayList<Account>.
--->For each account:
a. Display the holder name, account number, original balance
b. Apply 5% interest
c. Show the new balance using primitive values (unboxed).


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class Day10
{
	public static void main(String[]args)
	{
	}
}

/*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. Write a Java program
a. to create a new array list, add some colours (string) and print out the collection.
b. to iterate through all elements in an array list.
c. to insert an element into the array list at the first position.
d. to retrieve an element (at a specified index) from a given array list.
e. to update specific array element by given element.
f. to remove the third element from an array list.
g. to search an element in an array list.
h. to sort a given array list.
i. to copy one array list into another.
j. to shuffle elements in an array list.*/

class Ques1
{
	public static void main(String[]args)
	{

	//a. to create a new array list, add some colours (string) and print out the collection.
		ArrayList<String>colours = new ArrayList<>();
		colours.add("blue");
		colours.add("brown");
		colours.add("black");
		System.out.println(colours +"\n\n");

	//b. to iterate through all elements in an array list.
		for(String c:colours)
		{
			System.out.println(c);
		}

	//c. to insert an element into the array list at the first position.
		colours.add(0, "white");
		System.out.println(colours+"\n\n");

	//d. to retrieve an element (at a specified index) from a given array list.
		System.out.println(colours.get(0)+"\n\n");

	//e. to update specific array element by given element.
		colours.set(1, "grey");
		System.out.println(colours+"\n\n");

	//f. to remove the third element from an array list.
		colours.remove(3);

	//g. to search an element in an array list.
		if(colours.contains("brown"))
		{
			System.out.println(colours.indexOf("brown")+"\n\n");
		}
	//h. to sort a given array list.
		Collections.sort(colours);
		System.out.println(colours+"\n\n");

	//i. to copy one array list into another.
		List<String>colour = new ArrayList<>(colours);
		System.out.println(colour +"\n\n");

	//j. to shuffle elements in an array list.
		Collections.shuffle(colour);
		System.out.println(colour);
		
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*2. Write a Java program to,
a. append the specified element to the end of a linked list.
b. iterate through all elements in a linked list.
c. iterate through all elements in a linked list starting at the specified position.
d. iterate a linked list in reverse order.
e. insert the specified element at the specified position in the linked list.
f. insert elements into the linked list at the first and last position.
g. insert the specified element at the front of a linked list.
h. insert the specified element at the end of a linked list.
i. insert some elements at the specified position into a linked list.
j. get the first and last occurrence of the specified elements in a linked list.
*/

class Ques2
{
	public static void main(String[]args)
	{
		List<String>list = new LinkedList<>();
		list.add("java");
		list.add("python");
		list.add("javascript");
	
	//a. append the specified element to the end of a linked list.
		list.addLast("reactnative");
		System.out.println(list+"\n\n");

	//b. iterate through all elements in a linked list.
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("\n\n");

	//c. iterate through all elements in a linked list starting at the specified position.
		for(int i = 2;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}		
		System.out.println("\n\n");

	//d. iterate a linked list in reverse order.
		ListIterator lt = list.listIterator();
		while(lt.hasPrevious())
		{
			System.out.println(lt.next());
		}
		System.out.println("\n\n");

	//e. insert the specified element at the specified position in the linked list.
		list.add(2, "c");
		System.out.println(list + "\n\n");

	//f. insert elements into the linked list at the first and last position.
		list.add(0,"c++");
		list.add(list.size(),"android");
		System.out.println(list + "\n\n");

	//g. insert the specified element at the front of a linked list.
		list.addFirst("sql");
		System.out.println(list + "\n\n");

	//h. insert the specified element at the end of a linked list.
		list.addLast("mysql");
		System.out.println(list + "\n\n");
		

	//i. insert some elements at the specified position into a linked list.
		list.add(1, "html");
		list.add(3, "css");	
		System.out.println(list + "\n\n");

	//j. get the first and last occurrence of the specified elements in a linked list.
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*3. Write a Java program to,
a. append the specified element to the end of a hash set.
b. iterate through all elements in a hash list.
c. get the number of elements in a hash set.
d. empty the hash set.
e. test a hash set is empty or not.
f. clone a hash set to another hash set.
g. convert a hash set to an array.
h. convert a hash set to a tree set.
i. convert a hash set to a List/ArrayList.
j. compare two hash set.
*/

class Ques3
{
	public static void main(String[]args)
	{
		HashSet<String>hs = new HashSet<>();
		
	//a. append the specified element to the end of a hash set.
		hs.add("gopalan");
		hs.add("java");
		hs.add("dhoni");
		System.out.println(hs);

	//b. iterate through all elements in a hash list.
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	//c. get the number of elements in a hash set.
		System.out.println("Number of Elements: "+hs.size());
		

	//f. clone a hash set to another hash set.
		//HashSet<String>sh = (HashSet<String>)hs.clone();
                  HashSet<String>sh = new HashSet<>(hs);
		  System.out.println(sh);

	//d. empty the hash set.
		hs.clear();

	//e. test a hash set is empty or not.
		if(!hs.isEmpty())
		{
			System.out.println("Hash set is not empty");
		}
		else
		{
			System.out.println("Hash set is empty....");
		}

	//g. convert a hash set to an array.
		String[]arr = new String[sh.size()];
		sh.toArray(arr);
		System.out.println(Arrays.toString(arr));

	//h. convert a hash set to an array.
		TreeSet<String>ts = new TreeSet<>(sh);
		System.out.println(ts);
	
	//i. convert a hash set to an array.
		List<String>list = new ArrayList<>(sh);
		System.out.println(sh);
	
	//j.compare two hash set.
		System.out.println(hs.equals(sh));

	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
4. Write a Java program to,
a. create a new tree set, add some colours (string) and print out the tree set.
b. iterate through all elements in a tree set.
c. add all the elements of a specified tree set to another tree set.
d. create a reverse order view of the elements contained in a given tree set.
e. get the first and last elements in a tree set.
f. clone a tree set list to another tree set.
g. get the number of elements in a tree set.
h. compare two tree sets.
Create a TreeSet that stores a set of numbers,   
i. find the numbers less than 7 in a tree set.
j. get the element in a tree set which is greater than or equal to the given element.
k. get the element in a tree set which is less than or equal to the given element.
l. get the element in a tree set which is strictly greater than or equal to the given element.
m. get an element in a tree set which is strictly less than the given element.
n. retrieve and remove the first element of a tree set.
o. retrieve and remove the last element of a tree set.
p. remove a given element from a tree set.
*/

class Ques4
{
	public static void main(String[]args)
	{
	
	//a. create a new tree set, add some colours (string) and print out the tree set.
		TreeSet<String> colours = new TreeSet<>();
		colours.add("black");
		colours.add("grey");
		colours.add("white");
		System.out.println(colours+"\n\n");

	//b. iterate through all elements in a tree set.
		Iterator it = colours.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("\n\n");

	//c. add all the elements of a specified tree set to another tree set.
		TreeSet<String> colour = new TreeSet<>();
		colour.addAll(colours);
		System.out.println(colour+"\n\n");

	//d. create a reverse order view of the elements contained in a given tree set.
		Iterator<String> itr = colours.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("\n\n");

	//e. get the first and last elements in a tree set.
		System.out.println(colours.getFirst());
		System.out.println(colours.getLast());
		System.out.println("\n\n");

	//f. clone a tree set list to another tree set.
		TreeSet<String> clr = new TreeSet<>(colours);
		System.out.println(clr+"\n\n");

	//g. get the number of elements in a tree set.
		System.out.println(colours.size()+"\n\n");

	//h. compare two tree sets.
		System.out.println(colour.equals(colours)+"\n\n");

	//Create a TreeSet that stores a set of numbers
		TreeSet<Integer>ts = new TreeSet<>();
		for(int i = 1;i<=10;i++)
		{
			ts.add(i);
		}

	/*i. find the numbers less than 7 in a tree set.
		for(Integer s:ts)
		{
			if(s<7)
			{
				System.out.println(s);
			}	
		}*/
		System.out.println(ts.headSet(7)+"\n\n");

	//j. get the element in a tree set which is greater than or equal to the given element.
		System.out.println(ts.ceiling(7)+"\n\n");

	//k. get the element in a tree set which is less than or equal to the given element.
		System.out.println(ts.floor(7)+"\n\n");

	//l. get the element in a tree set which is strictly greater than or equal to the given element.	
		System.out.println(ts.higher(7)+"\n\n");

	//m. get an element in a tree set which is strictly less than the given element.
		System.out.println(ts.lower(7)+"\n\n");

	//n. retrieve and remove the first element of a tree set.
		System.out.println(ts.pollFirst());
		System.out.println(ts+"\n\n");
		
	//o. retrieve and remove the last element of a tree set.
		System.out.println(ts.pollLast());
		System.out.println(ts+"\n\n");
	
	//p. remove a given element from a tree set.
		ts.remove(4);
		System.out.println(ts);
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*5. Write a Java program to,
1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
2. iterate through all elements in priority queue.
3. add all the elements of a priority queue to another priority queue.
4. insert a given element into a priority queue.
5. remove all the elements from a priority queue.
6. count the number of elements in a priority queue.
7. compare two priority queues.
8. retrieve the first element of the priority queue.
9. retrieve and remove the first element.
10. convert a priority queue to an array containing all of the elements of the queue.

class Ques5
{
	public static void main(String[]args)
	{
	
	//1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
		PriorityQueue<String>colours = new PriorityQueue<>();
		colours.offer("blue");
		colours.offer("brown");
		colours.add("black");
		System.out.println(colours +"\n\n");

	//2. iterate through all elements in priority queue.
		Iterator it = colours.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("\n\n");

	//3. add all the elements of a priority queue to another priority queue.
		PriorityQueue<String>colour = new PriorityQueue<>();
		colour.addAll(colours);
		System.out.println(colour+"\n\n");

	//4. insert a given element into a priority queue.
	        colours.offer("grey");

	//5. remove all the elements from a priority queue.
		colour.clear();
		System.out.println(colour+"\n\n");

	//6. count the number of elements in a priority queue.
		System.out.println(colours.size());

	//7. compare two priority queues.
		System.out.println(colours.equals(colour)+"\n\n");

	//8. retrieve the first element of the priority queue.
		System.out.println(colours.peek()+"\n\n");

	//9. retrieve and remove the first element.
		System.out.println(colours.poll());
		System.out.println(colours + "\n\n");

	//10. convert a priority queue to an array containing all of the elements of the queue.
		String[]arr = new String[colours.size()];
		colours.toArray(arr);
		System.out.println(Arrays.toString(arr));	
	
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
6. Write a Java program to,
1. associate the specified value with the specified key in a Tree Map.
2. copy a Tree Map content to another Tree Map.
3. search a key in a Tree Map.
4. search a value in a Tree Map.
5. get all keys from the given a Tree Map.
6. delete all elements from a given Tree Map.
7. sort keys in Tree Map by using comparator.
8. get a key-value mapping associated with the greatest key and the least key in a map.
9. get the first (lowest) key and the last (highest) key currently in a map.
10. get a reverse order view of the keys contained in a given map.
*/

class Ques6
{
	public static void main(String[]args)
	{
		TreeMap<Integer, String>ts = new TreeMap<>();
	
	//1. associate the specified value with the specified key in a Tree Map.
		ts.put(1, "java");
		ts.put(2, "javascript");
		System.out.println(ts + "\n\n");

	//2. copy a Tree Map content to another Tree Map.
		TreeMap<Integer, String>st = new TreeMap<>();
		st.putAll(ts);

	//3. search a key in a Tree Map.
		if(st.containsKey(2))
		{
			System.out.println(st.get(2) +"\n\n");
		}

	//4. search a value in a Tree Map.
		if(st.containsValue("java"))
		{
			System.out.println("The given value is present..");
		}

	//5. get all keys from the given a Tree Map
		//Set<Integer>key = ts.keySet();
		ArrayList<Integer>keys = new ArrayList<>(ts.keySet());
		System.out.println(keys+ "\n\n");

	//6. delete all elements from a given Tree Map.
		st.clear();
		System.out.println(st+"/n/n");

	//7. sort keys in Tree Map by using comparator.
		

	//8. get a key-value mapping associated with the greatest key and the least key in a map.	
		System.out.println(ts.firstEntry());
		System.out.println(ts.lastEntry() + "\n\n");

	//9. get the first (lowest) key and the last (highest) key currently in a map.
		System.out.println(ts.firstKey());
		System.out.println(ts.lastKey()+ "\n\n");

	//
	
	}
}



//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*7. Write a Java program to,
1. associate the specified value with the specified key in a HashMap.
2. count the number of key-value (size) mappings in a map.
3. copy all of the mappings from the specified map to another map.
4. remove all of the mappings from a map.
5. check whether a map contains key-value mappings (empty) or not.
6. get a shallow copy of a HashMap instance.
7. test if a map contains a mapping for the specified key.
8. test if a map contains a mapping for the specified value.
9. create a set view of the mappings contained in a map.
10. get the value of a specified key in a map.*/

class Ques7
{
	public static void main(String[]args)
	{

	//1. associate the specified value with the specified key in a HashMap.
		HashMap<Integer, String>hm = new HashMap<>();
		hm.put(1, "gopal");
		hm.put(2, "udhaya");
		hm.put(3, "jena");
		hm.put(4, "raja");
		
	//2. count the number of key-value (size) mappings in a map.
		System.out.println(hm.size());

	//3. copy all of the mappings from the specified map to another map.
		HashMap<Integer, String>copy = new HashMap<>();
		copy.putAll(hm);
		System.out.println(copy);

	//4. remove all of the mappings from a map.
		hm.clear();
		System.out.println(hm);

	//5. check whether a map contains key-value mappings (empty) or not.		
		if(!hm.isEmpty())
		{
			System.out.println("is not empty");
		}
		else
		{
			System.out.println("is empty");
		}

	//6. get a shallow copy of a HashMap instance.
		HashMap<Integer, String>mh = new HashMap<>(copy);
		System.out.println(mh);

	//7. test if a map contains a mapping for the specified key.
		System.out.println(mh.containsKey(2));

	
	//8. test if a map contains a mapping for the specified value.
		System.out.println(mh.containsValue("udhaya"));
	
	//9. create a set view of the mappings contained in a map.
		Set<Map.Entry<Integer, String>> e = mh.entrySet();
		System.out.println(e);

	//10. get the value of a specified key in a map
		System.out.println(mh.get(3));

	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
8. Develop a Java program to manage a list of bank accounts using ArrayList.
--->Create an Account class with the following attributes:
a. accountNumber (int)
b. holderName (String)
c. balance (double)
--->Use autoboxing to store the balance and interest as Double wrapper objects.
--->Use manual boxing to convert a primitive interest rate into a Double object.
--->Unbox the values (both automatic and manual) to calculate and update the new balance.
--->Add at least three Account objects to an ArrayList<Account>.
--->For each account:
a. Display the holder name, account number, original balance
b. Apply 5% interest
c. Show the new balance using primitive values (unboxed).
/*

class Account
{
	private int accountNumber;
	private String holderName;
	private Double balance;
	
	public void setAccNumber(int num)
	{
		this.accountNumber = num;
		return;
	}
	public int getAccNumber()
	{
		return this.accountNumber;
	}

	public void setHoldName(String name)
	{
		this.holderName = name;
		return;
	}
	public String getHoldName()
	{
		return this.holderName;
	}

	public void setBalance(Double bce)
	{
		this.balance = bce;
		return;	
	}
	public Double getBalance()
	{
		return balance;
	}	
}

class BankAccount
{
	public static void main(String[]args)
	{
		ArrayList<Account>accounts= new ArrayList<>();
		Account acc1 = new Account();
		acc1.setAccNumber(1234);
		acc1.setHoldName("Java");
		acc1.setBalance(20000.00);
		accounts.add(acc1);	

		Account acc2 = new Account();
		acc2.setAccNumber(1235);
		acc2.setHoldName("Python");
		acc2.setBalance(30000.00);
		accounts.add(acc2);

		Account acc3 = new Account();
		acc3.setAccNumber(1236);
		acc3.setHoldName("JavaScript");
		acc3.setBalance(40000.00);
		accounts.add(acc3);

		Double primitiveInterestRate = Double.valueOf(5.00);

		for(Account acc:accounts)
		{
			System.out.println("Account HolderName: "+ acc.getHoldName());
			System.out.println("Account HolderNumber: " + acc.getAccNumber());
			System.out.println("Current Balance: "+ acc.getBalance() + "\n");

			double balance = acc.getBalance().doubleValue();
			double rate = primitiveInterestRate.doubleValue();

			double newBalance = (balance * (rate/100)) + balance;
			acc.setBalance(newBalance);
			System.out.println("Balance after 5% Interest: " + newBalance + "\n\n");
		}
	}
}


















