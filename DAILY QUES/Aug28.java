import java.util.*;
/*
You're given a number n. If write all the numbers from 1 to n in a paper, we have to find the number of characters written on the paper.
For example if n = 13 , the output should be 17
if n = 101 , the output should be 195
if n = 200 the output should be 492
*/

class Charac
{
	public static void main(String[]args)
	{
		int n = 13;
		int size = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 1;i<=n;i++)
		{
			sb.append(i);
		}
		System.out.println(sb.length());
	}
}

/*
You're given an array. Print the elements of the array which are greater than its previous elements in the array.
Input: 2, -3, -4, 5, 9, 7, 8
12
Output: 2 5 9
You should solve this question in O(n) time.
Input: 5, 4, 3, 2, 1
Output:
5

class Previous
{
	public static void main(String[]args)
	{
		HashSet<Integer>st = new HashSet<>();
		int val = Integer.MIN_VALUE;
		int[]arr = {2, -3, -4, 5, 9, 7, 8};
		for(int i = 0;i<arr.length;i++)
		{
			val = Math.max(val, arr[i]);
			st.add(val);
		}
		System.out.println(st);
	}
}*/

class Previous
{
	public static void main(String[]args)
	{
		int[]arr = {10, 2, -3, -4, 5, 9, 7, 8, 100};
		int i = 0, j = 1;

		System.out.println(arr[i] + " ");
		while(j<arr.length)
		{	
			if(arr[i] < arr[j])
			{
				i = j;
				System.out.println(arr[i] + " ");
			}
			j++;
		}
	}
}

/*
You are given n numbers...
intput = 4

4444
4334
4334
4444

666666
655556
654456
654456
655556
666666

class Pattern
{
	public static void main(String[]args)
	{
		int n = 6;
		int val = n;
		int a = 0;
		int b = n-1;
		int count = 0;
	
		while(count<n*n)
		{
			for(int i = a;i<=b;i++)
			{
				for(int j = a;j<=b;j++)
				{
					if(i==a || i==b || j==a || j==b)
					{
						System.out.print(val + " ");
						count++;
					}
					else
					{
						System.out.print("  ");
					}		
				}
				System.out.println();
			}
			a++;
			b--;
			val--;
		}
	}
}

class Pattern
{
	public static void main(String[]args)
	{
		int n = 6;
		int val = n;
		
		for(int i = 0;i<n;i++)
		{
			int top=i;
			int bottom=n-i-1;
			for(int j = 0;j<n;j++)
			{
				int left=j;
				int right=n-j-1;

				int res=Math.min((Math.min(top,left)),(Math.min(right,bottom)));
				System.out.print(n-res + " ");
			}
			System.out.println();
		}
	}
}*/




















