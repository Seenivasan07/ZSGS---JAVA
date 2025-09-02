/*
Given an array with repeated numbers, Find the top three repeated numbers.
input: array[]={1,3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3,768}
output: 3, 16, 15
*/

class Repeated
{
	public static void main(String[]args)
	{
		int[]arr = {1,3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3};

		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for(int i = 0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
			if(min>arr[i])
			{
				min = arr[i];
			}
		}
		
		int val = -(min);
		int[]freq = new int[max - min + 1];
	
		for(int num : arr)
		{
			freq[num + val]++;
		}

		for(int j = 0;j<freq.length;j++)
		{
			if(freq[j] >= 3)
			{
				System.out.println( (j-val) + " -> " + freq[j]);
			}
		}
	}
}

/*
18. Given two dates, find total number of days between them.
Input: dt * 1 = {10, 2, 2014} dt * 2 = {10, 3, 2015}
Output: 393
dt1 represents " 10 - Feb -2014" and dt2 represents 10 - Mar -2015^ prime prime The difference is 365 + 28
Input:
dt * 1 = {10, 2, 2000} dt * 2 =
{10, 3, 2000}
Output: 29
Note that 2000 is a leap year
Input:
dt * 1 = {10, 2, 2000} dt * 2 = {10, 2,
2000}
Output: 0
Both dates are same
Input:
dt * 1 = {1, 2, 2000}; dt * 2 = {1, 2,
2004};
Output: 1461
Number of days is 365^ * 4 + 1
*/

class Days
{
	public static void main(String[]args)
	{
		String[]d1 = {"10", "2", "2000"};
		String[]d2 = {"10", "3", "2000"};
		System.out.println(dates(d1));
		System.out.println(dates(d2));
		System.out.println(Math.abs(dates(d1) - dates(d2)));
	}

	public static int dates(String[]d)
	{
		int[]arr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year = Integer.parseInt(d[2]);
		int month = Integer.parseInt(d[1]);
		int day = Integer.parseInt(d[0]);
		int days = 0;

		for(int i = 1971;i<year;i++)
		{
			if((i%4==0 && i%100!=0) || (i%400==0))
			{
				days+=366;
			}
			else
			{
				days+=365;
			}
		}

		for(int i = 0;i<month;i++)
		{
			days+=arr[i];
		}
		if((month > 2) && ((year%4==0 && year%100!=0) || (year%400==0)))
		{
			days+=1;
		}

		days+=day;
		
		return days;
	}
}

/*
Sort the array elements in descending order according to their frequency of occurrence
Input: [2 2 3 4 5 12 2 3 3 3 12]
Output: 3 3 3 3 2 2 2 12 12 4 5
Explanation: 3 occurred 4 times, 2 occurred 3 times, 12 occurred 2 times, 4 occurred 1 time, 5 occurred 1 time
Input: [0 -1 2 1 0]
Output: 0 0 -1 1 2
sort single occurrence elements in ascending order
*/

class Sort
{
	public static void main(String[]args)
	{
		int[]arr = {2, 2, 3, 4, 5, 12, 2, 3, 3, 3, 12};
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for(int i = 0;i<arr.length;i++)
		{
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}

		int val = -(min);
		int[]freq = new int[max - min + 1];

		for(int num:arr)
		{
			freq[num + val]++;
		}
		
		print(freq, val, arr.length);
	}
	public static void print(int[]freq, int val, int count)
	{
		//System.out.println(count);
		if(count == 0)
		{
			return;
		}
		int max = Integer.MIN_VALUE;
		int j = 0;
		for(int i = 0;i<freq.length;i++)
		{
			if(max < freq[i])
			{
				max = freq[i];
				j = i;
			}
		}
		//System.out.println(max);

		for(int i = 0;i<max;i++)
		{
			System.out.print((j-val) + " ");
		}
		
		freq[j] = 0;
		//System.out.println(count - max);
		print(freq, val, count-max);
	}
}

/*
Using java program Print pattern like this
Example:
Input: 2
Output:
00

Input: 1
01
Output:
10
0
11

Input: 3
Output:
000
001
010
011
100
101
110
111
*/

class Pattern1
{
	public static void main(String[]args)
	{
		int n = 1;
		int till = (int)Math.pow(2, n);
		
		for(int i = 0;i<till;i++)
		{
			print(i, n);
		}
	}
	public static void print(int i, int n)
	{
		while(n>0)
		{
			System.out.print( i % 2 + " ");
			i/=2;
			n--;
		}
		System.out.println();
		return;
	}
}

/*
Insert 0 after consecutive (K times) of 1 is found. 
Example: 
Input:
Number of bits: 12 Bits: 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1 
Consecutive K: 2 
Output: 1 0 1 1 0 0 1 1 0 0 1 1 0 1 1 0
*/

class Insert
{
	public static void main(String[]args)
	{
		int[]arr = {1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1};
		int count = 0;
		int k = 3;
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
			if(arr[i] == 1)
			{
				count++;
				if(count == k)
				{
					System.out.print(0 + " ");
					count = 0;	
				}
			}
			else
			{
				count = 0;
			}
		}
	}
}

/*
1. array of numbers were given to find a number which has same sum of numbers in it’s 
either side. 
I/p 1, 2, 3, 7, 6 
O/p 7(has 1+ 2+3 in left 6 in right)
*/

class Find
{
	public static void main(String[]args)
	{
		int[]arr = {1, 2, 3, 7, 6};

		int i = 1, j = arr.length - 2;
		int left = arr[i-1];
		int right = arr[j+1];
		while(i<j)
		{
			if(left < right)
			{
				left+=arr[i];
				i++;
			}
			else if(left > right)
			{
				right+=arr[j];
				j--;
			}
		        else if(left == right)
			{
				System.out.print(arr[i]);	
				break;
			}		
		}
	}
}











