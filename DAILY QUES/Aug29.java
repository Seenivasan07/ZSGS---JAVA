/*
Given an array of numbers and a window of size k. Print the maximum of numbers inside the window for each step as the window moves from the beginning of the array.
15
INPUT:
Enter the array size : 8
Enter the elements : 1,3,5,2,1,8,6,9
Enter the window size: 3
OUTPUT:555889
*/

class Window
{
	public static void main(String[]args)
	{
		int[]arr = {1,3,5,2,1,8,6,9};
		int win = 8, i = 0, j = 0, count = 0, max = Integer.MIN_VALUE;
		
		while(j<arr.length)
		{
			if(count<win)
			{	
				max = Math.max(max, arr[j]);
				count++;
				//System.out.println(max);
			}
			if(count == win)
			{
				arr[i] = max;
				count--;
				i++;
			}
			j++;
		}

		for(int k = 0;k<i;k++)
		{
			System.out.print(arr[k] + " ");
		}
	}
}

/*
Problem:
You are given a 2 or 3 digit number.
Reverse the digits of the number and add it to the original.
Repeat until:
The obtained number is a palindrome OR
5 iterations are completed.
Output the final palindrome if found, else the number after 5 iterations.
Test Case 1
Input: 32
output: 55

Test Case 2
Input: 39
Output: 363*/

class Palindrome
{
	public static void main(String[]args)
	{
		int iter = 5;
		int num = 89;
		int chk = num;
		
		palindrome:
		while(iter > 0)
		{
			int val = 0;
			while(chk != 0)
			{
				val = (val*10) + (chk%10);
				chk/=10;
			}
			chk = num + val;
			
			if(palin(chk))
			{
				System.out.println(chk);
				break palindrome;
			}
			else
			{
				num = chk;
			}
			iter--;
		}
		if(iter == 0)
		{
			System.out.println(chk);
		}
	}
	
	public static boolean palin(int chk)
	{
		int num = chk;
		int val = 0;
		while(num != 0)
		{
			val = (val*10) + (num%10);
			num/=10;
		}
		if(chk == val)
		{
			return true;
		}
		return false;
	}
}

/*
to print pattern with the following words
1. Program

G 
G R 
G R A 
G R A M
G R A M P
G R A M P R
G R A M P R O
*/

class Pattern123
{
	public static void main(String[]args)
	{
		String str = "ANDROID";
		if(str.length()/2 == 0)
		{
			System.out.println("The even digit length word is not possible....");
			return;
		}

		int val = str.length()/2;
		String newstr = str.substring(val)+str.substring(0, val);
		
		for(int i = 0;i<str.length();i++)
		{
			for(int j = 0;j<(i+1);j++)
			{
				System.out.print(newstr.charAt(j) + " ");
			}
			System.out.println();
		}
	}
}




















