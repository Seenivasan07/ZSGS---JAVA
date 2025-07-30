/*Day-2 Assignment Questions: Part-1

1. Write a program that uses if statement to find the minimum of three numbers.
2. Write a program to do the following patterns using for loop?
a) 1 1 R R R R
1 1 R R
1 R R R R
1 1 R R
1 1 R R
3. Write a program to do the following patterns using while loop?
a) 1 b) w
2 3 w w
4 5 6 w w w
7 8 w w
9 w
4. Write a program to do the following patterns using do...while loop?
a) Pascal Triangle
b) ZOHO
CORP
ORAT
IONS
‌
5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.
6. Define a method to convert the decimal number to a binary number?
7. Use both if and switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail” */
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;

public class Day2
{
	public static void main(String[]args)
	{
	}
}

//1. Write a program that uses if statement to find the minimum of three numbers.
class Minimum
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter the value for number 1: ");
		int num1 = java.nextInt();
		System.out.println("Enter the value for number 2: ");
		int num2 = java.nextInt();
		System.out.println("Enter the value for number 3: ");
		int num3 = java.nextInt();

		if((num1 > num2) && (num1 > num3))
		{
			System.out.println("The Biggest number among three is: "+num1);
		}
		else if((num2 > num1) && (num2 > num3))
		{
			System.out.println("The Biggest number among three is: "+num2);
		}
		else
		{
			System.out.println("The Biggest number among three is: "+num3);
		}
	}
}

//2. Write a program to do the following patterns using for loop
/*
1   1
 1 1
  1
 1 1
1   1*/
class Pat1
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = java.nextInt();
		for(int i = 0;i<row;i++)
		{
			for(int j = 0;j<row;j++)
			{
				if( (i==j) || (i+j==row-1))
				{
					System.out.print(1+" ");
				}
				else
      				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}

/* R R R R
   R     R
   R R R R
   R   R
   R     R */
class Pat2
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = java.nextInt();
		for(int i = 0;i<row;i++)
		{
			for(int j = 0;j<row;j++)
			{
		 		if(i==0 || i ==2)
				{
                    			if(j!=row-1)
					{
                        			System.out.print("R ");
                    			}
                    			else
					{
                        			System.out.print("  ");
                   	 		}
                		}
                		if(i==1 || i==row-1)
				{
                    			if(j==0 || j==row-2)
					{
                        			System.out.print("R ");
                    			}
                    			else
					{
                        			System.out.print("  ");
                    			}
                		}
                		if(i==3)
				{
                    			if(j== 0 || j==row-3)
					{
                        			System.out.print("R ");
                    			}
                    			else
					{
                        			System.out.print("  ");
                    			}
                		}
            		}

			System.out.println("");
		}

	}
}

//3. Write a program to do the following patterns using while loop
/* 1
  2 3
 4 5 6
  7 8
   9*/
class Pat3
 {
    	public static void main(String[] args) 
    	{
      		Scanner java = new Scanner(System.in);
      		System.out.println("Enter the number of rows: ");
      		int n = java.nextInt();
      		int count = 1;
      		int l = 0;
      		int i = -n+1;
      		while(i<n)
      		{
        		if(i<=0)
        		{
          			l = -i;
        		}
        		else
        		{
          			l = i;
        		}
			int j = 0;
        		while(j<n)
        		{
          			if(j<l)
          		{
            			System.out.print(" ");
          		}
          		else
          		{
            			System.out.print(count++ +" ");
          		}
				j++;
        		}
			i++;
        		System.out.println("");
      		}
  	}
}

/* w
   w w
   w w w
   w w
   w*/
class Pat4
 {
    	public static void main(String[] args) 
    	{
     		 Scanner java = new Scanner(System.in);
     		 System.out.println("Enter the number of rows: ");
    		 int n = java.nextInt();
     		 int l = 0;
     		 int i = -n+1;
     		 while(i<n)
     		 {
       			 if(i<=0)
       			 {
         			 l = -i;
       			 }
       			 else
       			 {
          			l = i;
        		 }
			int j = 0;
        		while(j<n)
       			{
         			 if(j<(n-l))
          			 {
            				System.out.print("w ");
          			 }
          			 else
         			 {
            				System.out.print("  ");
          			 }
				 j++;
        		}
			i++;
        		System.out.println("");
      		}
  	}
}

//4. Write a program to do the following patterns using do...while loop
//a. Pascal Triangle
class Pascal
{
	public static void main(String[] args)
	{
		Scanner java = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = java.nextInt();
        	int temp = row;
        	int i = 0;
        	do 
		{
            		int val = i;
            		while (row-val-1>0)
			{
                		System.out.print(" ");
                		val++;
            		}
            		int j = 0;
            		int num = 1;
            		while (j<=i)
			{
                		System.out.print(num+" ");
                		num = num * (i-j)/(j+1);
                		j++;
            		}
            		i++;
            		temp--;
            		System.out.println();
        	}
		while (temp>0);
    	}
}

/*b.ZOHO
    CORP
    ORAT
    IONS*/
class Pat6
{
    	public static void main(String[]args)
    	{
        	Scanner java = new Scanner(System.in);
        	System.out.println("Enter the string: ");
        	String str = java.nextLine();
        	str = str.replaceAll(" ", "");

        	int ind = 0;
        	int size = (int)Math.ceil(Math.sqrt(str.length()));              //ceil - used to get a large nearest value of the square root
        	char[][]mat = new char[size][size];
		int i = 0;

        	do
       	        {
	    		int j = 0;
            		do
            		{
                		mat[i][j] = str.charAt(ind++);
                		System.out.print(mat[i][j] + " ");
				j++;
            		}
			while(j<mat[0].length && ind<str.length());

	    		i++;
            		System.out.println();
        	}
		while(i<mat.length && ind<str.length());
	}

}

//5.Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.
class Even
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = java.nextInt();
		System.out.println("The sum of all even numbers inside "+num+" is: "+ sumOfEven(num));
	}
		
	static int sumOfEven(int num)
	{
		int sum = 0;
		int i = 1;
		while(i<=num)
		{
			if(i%2!=0)
			{
				i++;
				continue;
			}
			sum+=i;
			i++;
		}
		return sum;
	}
}


//6. Define a method to convert the decimal number to a binary number?
class Tobinary
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter any decimal number: ");
		int dec = java.nextInt();
		decToBin(dec);
	
	}

        static void decToBin(int dec)
   	{
    		String S = "";
    		while(dec!=0)
    		{
        		S = (dec%2)+ S;
        		dec/=2;
    		}
    		System.out.println("The Binary Value of the given decimal number is: "+ S);
   	} 
}

/* 7. Use both if and switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail” */
class Grade
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter the percent: ");
		int percent = java.nextInt();
		int mark=1;
		if(percent>100 || percent<0)
		{
			System.out.println("Enter a valid percentage!!!");
		}
		else if((percent>=85)&&(percent<=100))
		{
			System.out.print("The Grade for the given percent "+percent+" is: ");
			mark = 85;
		}
		else if(percent>=70)
		{
			System.out.print("The Grade for the given percent "+percent+" is: ");
			mark = 70;
		}
		else if(percent>=50)
		{
			System.out.print("The Grade for the given percent "+percent+" is: ");
			mark = 50;
		}
      		else
		{
			System.out.print("The Grade for the given percent "+percent+" is: ");
			mark = 0;
		}
		switch(mark)
		{
			case 85:
				System.out.print("A");
				break;
			case 70:
				System.out.print("B");
				break;
			case 50:
				System.out.print("C");
				break;
			case 0:
				System.out.print("Fail");
				break;
			default: 
				break;
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/* Day-2 Assignment Questions: Part-2 Arrays

1. Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.
2. Write a program to take in 10 values and print only those numbers which are prime.
3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.
4. Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( ).
5. Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
X[] =('m', 'n', 'o', 'p'} and
Y[] =('m', 'n', 'o', 'p' }
6. Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}
7. Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique.
8. Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.
9. Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total marks and average for all students in a table form.
10. Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x m */



//1. Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers
class ArraySum
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		int sum = 0;
		int[]arr = new int[10];
		System.out.println("Enter the numbers: ");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = java.nextInt();
			if(arr[i]%2 != 0)
			{
				sum+=arr[i];
			}
 		}
		System.out.println("The sum of all odd numbers in the array: "+sum);			
	}
}

//2. Write a program to take in 10 values and print only those numbers which are prime
class Prime
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		int[]arr = new int[10];
		System.out.println("Enter the values: ");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = java.nextInt();
		}
		int j = 0;
		System.out.println("The Prime Numbers in the given array: ");
		while(j<arr.length)
		{
			if(toCheckPrime(arr[j]))
			{
				System.out.println(arr[j]);
			}
			j++;
		}
	}
	
	static boolean toCheckPrime(int n)
	{
		for(int i = 2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
			   return false;	
			} 
		}
		return true;
	}
}

//3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it
class Fibonacci
{
	public static void main(String[]args)
	{
		int[]arr = new int[30];
		arr[0] = 0;
  		arr[1] = 1;
		for(int i=2;i<arr.length;i++)
		{
			arr[i] = arr[i-1]+arr[i-2];	
		}
		int j = 0;
		while(j<arr.length)
		{
			System.out.println(arr[j++]);
		}
	}
}

/*4. Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( )*/
class Singledim
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = java.nextInt();	
		int[]arr = new int[n];
		System.out.println("Enter the values: ");
		for(int i = 0;i<n;i++)
		{
			arr[i] = java.nextInt();
		}
		print(arr, n);
	}
	static void print(int[]x, int n)
	{
		int sumsingle = 0;
		int sumdouble = 0; 
		for(int i = 0;i<n;i++)
		{
	        	if(x[i]>=0 && x[i]<=9)
			{
				sumsingle += x[i];
			}
			else if(x[i]>=10 && x[i]<100)
			{
				sumdouble += x[i];
			}
		}
		System.out.println("The sum of single digits: "+sumsingle);
		System.out.println("The sum of double digits: "+sumdouble);
	}
}

/*5. Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }*/
class Identical
{
	public static void main(String[]args)
	{
		char[]x = {'m','n','o','p'};
    		char[]y = {'m','n','o','p'}; 
		boolean val = true;
		for(int i = 0;i<x.length;i++)
		{
			if(x[i]!=y[i])
			{
				val = false;
				break;
			}
		}
		if(val)
		{
			System.out.println("The given array is identical..");
		}
		else
		{
			System.out.println("The given array is not identical..");
		}	
	}
}

/*6. Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}*/
class Binsearch
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		int[]arr = {1982,1987, 1993, 1996, 1999, 2002, 2003, 2006, 2007, 2009, 2010, 2016};
		System.out.println("Enter the year to check: ");
		int year = java.nextInt();	
        	int left = 0, right = arr.length-1;
        	boolean val = false;
		while(left<=right)
		{
            		int mid = (left + right)/2;
            		if(arr[mid] == year)
            		{
                		System.out.println("Record Exist..");
                		val = true;
                		break;
            		}
            		else if(arr[mid]>year)
            		{
                		right = mid-1;
            		}
            		else
            		{
                		left = mid+1;
            		}
		}
        	if(!val)
        	{
            		System.out.println("Record doesn't exist");
        	}
	}
}

//7. Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique
class Selsearch
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		int[]arr = new int[10];
		System.out.println("Enter the weight of ten peoples: ");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = java.nextInt();
		}

		for(int i = 0;i<arr.length;i++)
		{
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp; 
				}
			}
		}

		for(int i:arr)
		{
			System.out.print(i + " ");
		}
	}
}

//8. Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60
class Peopleage
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		int[]age= new int[10];
		System.out.println("Enter the age of the Ten people's: ");
		for(int i = 0;i<age.length;i++)
		{
			age[i] = java.nextInt();
		}
		
		int j = 0;
		while(j<age.length)
		{
			if(age[j]<18)
			{
				System.out.println("The age of people "+j+" is less than 18");
			}
			else if(age[j]>=18 && age[j]<=60)
			{
				System.out.println("The age of people "+j+" is between 18 and 60");
			}
			else
			{
				System.out.println("The age of people "+j+" is greater than 60");
			}
		j++;		
		}
	}
}

//9. Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total marks and average for all students in a table form
class Mark
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		int[]roll_no = new int[10];
		int[] marks = new int[10];
		int i = 0;
		while(i<marks.length)
		{
			System.out.println("Enter the roll_no of the student "+i+": ");
			roll_no[i] = java.nextInt();
			System.out.println("Enter the mark1: ");
			int m1 = java.nextInt();
			System.out.println("Enter the mark2: ");
			int m2 = java.nextInt();
			System.out.println("Enter the mark3: ");
			int m3 = java.nextInt();
			marks[i] = m1+m2+m3;
			i++;
		}

		System.out.println("Roll_No" +"\t"+"Marks"+"\t"+"Average");
		int j = 0;
		while(j<marks.length)
		{
			System.out.println(roll_no[j] +"\t"+marks[j]+"\t"+marks[j]/3);
			j++;
		}
	}
}

/*10. Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x m
*/
class Matrix
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter the row size: ");
		int row = java.nextInt();
		System.out.println("Enter the col size: ");
		int col = java.nextInt();
		int[][]arr = new int[row][col];

		System.out.println("Enter the values for the matrix: ");
		for(int i = 0;i<row;i++)                                //To input elements into matrix of size m x n
		{
			for(int j = 0;j<col;j++)
			{
				arr[i][j] = java.nextInt();
			}
		}
		System.out.println("");
		
		for(int i = 0;i<row;i++)                                //To display elements of matrix of size m x n
		{
			for(int j = 0;j<col;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		int sum = 0;
		for(int i = 0;i<row;i++)                                 //Sum of all elements of matrix of size m x n
		{
			for(int j = 0;j<col;j++)
			{
				sum+=arr[i][j];
			}
		}
		System.out.println("The sum of all elements of this matrix: "+sum);
		System.out.println("");
		
		for(int i = 0;i<row;i++)                                  //To display row-wise sum of matrix of size m x n
		{
			int rowsum = 0;
			for(int j = 0;j<col;j++)
			{
				rowsum+=arr[i][j];
			}
			System.out.println("The sum of row "+i+": "+rowsum);
		}
		System.out.println("");
	

		for(int j = 0;j<col;j++)				//To display column-wise sum of matrix of size m x n
		{
			int colsum = 0;
			for(int i = 0;i<row;i++)
			{
				colsum+=arr[i][j];
			}
			System.out.println("The sum of column "+j+": "+colsum);
		}
		System.out.println("");

		System.out.println("Transpose of the given matrix: ");
		for(int j = 0;j<col;j++)				//To create transpose of matrix of size n x m				
		{
			for(int i = 0;i<row;i++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Day-2 Assignment Questions: Part-3 Strings

/*
1. Given two binary strings a and b, return their sum as a binary string.
Input: a = "11", b = "1"
Output: "100"
‌
Input: a = "1010", b = "1011"
Output: "10101"
‌
Constraints:
1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
‌
*/
class Binary
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter two binary strings: ");
		String a = java.nextLine();
		String b = java.nextLine();
		String result = "";
		int i = a.length()-1;
		int j = b.length()-1;
		int val1 = 0, val2 = 0, rem = 0;
		while(i>=0 || j>=0)
		{
		    val1 = 0;
		    val2 = 0;
		    if(i>=0)
		    {
			val1 = a.charAt(i) - '0';
			i--;
		    }
		    if(j>=0)
		    {
			val2 = b.charAt(j) - '0';
			j--;
		    }
            	    int res = rem + val1 + val2;
                    if((res==0)||(res==2))
                    {
                        result = 0+result;
                    }
                    else
                    {
                        result= 1+result;    
                    }
		    rem = (rem + val1 + val2)>1?1:0;
		}
		if(rem==1)
		{
			result = rem + result;
		}
		System.out.println("The sum of the given binary values are: "+result);
	}
}

/*
2. Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
‌
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
*/
class Excel
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String exl = java.nextLine();
		int res = 0, i = 0;
		while(i<exl.length())
		{
			res = res * 26 + ((exl.charAt(i)-'A')+1);
			i++;
		}
		System.out.println("The integer column number of the given column title"+ res);	
	}
}

/*
3. Given a string s, reverse only all the vowels in the string and return it.
‌
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
‌
Example 1:
Input: s = "hello"
Output: "holle"
‌
Example 2:
Input: s = "leetcode"
Output: "leotcede"
*/
class Reverse
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = java.nextLine();
		        
		char[]arr = s.toCharArray();
        	int i = 0, j=s.length()-1;
        	while(i<j)
        	{
            		if(!vowel(arr[i]))
            		{
                		i++;
            		}
            		if(!vowel(arr[j]))
            		{
                		j--;
            		}
            		else if(vowel(arr[i]) && vowel(arr[j]))
            		{
                		char temp = arr[i];
                		arr[i] = arr[j];
                		arr[j] = temp;
                		i++;
                		j--;
            		}
		}
		System.out.println(new String(arr));	 
	}
	static boolean vowel(char a)
    	{
        	return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'||a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U';      
        }
}


/*
4. You are given two strings s and t.
‌
String t is generated by random shuffling string s and then add one more letter at a random position.
‌
Return the letter that was added to t.
‌
Example 1:
Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
‌
Example 2:
Input: s = "", t = "y"
Output: "y"
*/
class Shuffle
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter the string s: ");
		String s = java.nextLine();
		System.out.println("Enter the string t: ");
		String t = java.nextLine();
		boolean val = false;
		for(int i = 0;i<t.length();i++)
		{
			if(!s.contains(t.substring(i,i+1)))
			{
				System.out.println(t.charAt(i) + " is the letter that was added");
				val = true;
				break;
			}
		}
		if(!val)
		{
			System.out.println("Nothing is added");
		}
	}
}

/*
5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
‌
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
‌
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
‌
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
*/
class Subsequence
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter s value: ");
		String s = java.nextLine();
		System.out.println("Enter t value: ");
		String t = java.nextLine();

		int i = 0, j = 0;
        	while(i<s.length() && j<t.length())
        	{
            		if(s.charAt(i) == t.charAt(j))
            		{
                		i++;
            		}
            		j++;
            
                }
        	if(i == s.length())
        	{
            		System.out.println("true");
        	}
		else
		{
        		System.out.println("false");
		}
	}
}

/*
6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
‌
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
‌
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
‌
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
‌
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
*/
class Stringadd
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter two strings to get added: ");
		String num1 = java.nextLine();
		String num2 = java.nextLine();

		int i = num1.length()-1;
        	int j = num2.length()-1;
        	int carry = 0;
        	int val1 = 0, val2 = 0;
        	String res = "";

        	while(i>=0 || j>=0)
       		{
            	 	val1 = 0;
            	    	val2 = 0;
            		if(i>=0)
            		{
                		val1 = num1.charAt(i)-'0';
                		i--;
            		}
            		if(j>=0)
            		{
                		val2 = num2.charAt(j)-'0';
                		j--;
            		}
            		res = (val1 + val2 + carry)%10 + res;
            		carry = (val1 + val2 + carry)/10;
        	}
        	if(carry>0)
        	{
            		res = carry + res;
        	}
		System.out.println(res);
	}
} 

/*
7. Given a string s, return the number of segments in the string.
‌
A segment is defined to be a contiguous sequence of non-space characters.
‌
Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
‌
Example 2:
Input: s = "Hello"
Output: 1
*/
class Segment
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String s = java.nextLine();
		String[]str = s.split("\\s+");
		System.out.println(str.length);
	}
}

/*
8. We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "USA"
Output: true
‌
Example 2:
Input: word = "FlaG"
Output: false
*/
class Capital
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String str = java.nextLine();

		if(str.equals(str.toUpperCase()))
            	{	
                	System.out.println("true");
            	}
            	else if(str.equals(str.toLowerCase()))
            	{
                	System.out.println("true");
            	}
            	else if(str.charAt(0)>='A' && str.charAt(0)<='Z')
            	{
			boolean val = true;
                	for(int i = 1;i<str.length();i++)
                	{
                    		if(!(str.charAt(i)>='a' && str.charAt(i)<='z'))
                    		{
                       			val = false;
					break;
                    		}
                	}
                	System.out.println(val);
            	}
	}
}














