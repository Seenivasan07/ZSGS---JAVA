import java.util.*;
/*
Write a program to print the below pattern
For n=6
1 2 4 7 11 16
3 5 8 12 17
6 9 13 18
10 14 19
15 20
21
*/
class Pattern
{
	public static void main(String[]args)
	{
		int n = 5;
		int count = 1;
		int m = 1;
		for(int i = 1;i<=n;i++)
		{
			int ct = i;
			int k = count;	
			for(int j = 0;j<(n-i+1);j++)
			{
				System.out.print(count+ " ");
				count+=ct++;
			}
			count = ++m + k;
			System.out.println();
		}
	}
}

/*
Given two arrays. Find its union.
8
Input:
Enter size of first array: 6
Enter the elements: 123453
Enter size of second array: 4
Enter the elements 1275
OUTPUT:123457
Input:
Enter size of first array: 3
Enter the elements :-1-2-3
Enter size of second array: 4
Enter the elements :-3-4-50
Output: -1-2-3-4-50
*/
class Union
{
	public static void main(String[]args)
	{
		int[]a = {1,2,3,4,5,3};
		int[]b = {1,2,7,5};
		int i = 0, j = 0;
		Set<Integer>ts = new TreeSet<>();
		while(i<a.length || j<b.length)
		{
			if(i<a.length)
			{
				ts.add(a[i]);
				i++;
			}
			if(j<b.length)
			{
				ts.add(b[j]);
				j++;
			}
		}
		System.out.println(ts);
	}
}

/*
349. Intersection of two arrayss...
Input:  nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
*/

class Intersection
{
	public static void main(String[]args)
	{
		int[]nums1 = {1,2,2,1};
		int[]nums2 = {2,2};

		int[]small;
		int[]large;

		if(nums1.length<=nums2.length)
		{
			small = nums1;
			large = nums2;
		}			
		else
		{
			small = nums2;
			large = nums1;
		}

		boolean[]chk = new boolean[small.length];
		int count = 0;

		for(int i = 0;i<small.length;i++)
		{
			if(present(small[i], large))
			{
				count++;
				chk[i]=true;
			}
		}

		int[]res = new int[count];
		int j = 0;

		for(int i = 0;i<small.length;i++)
		{
			if(chk[i])
			{
				res[j++] = small[i]; 
			}
		}

		System.out.println(Arrays.toString(res));	
	}
		
	public static boolean present(int val, int[]arr)
	{
		int count = 0;
		boolean chk = false;
		for(int i = 0;i<arr.length;i++)
		{
			if(val == arr[i])
			{
				if(count < 1)
				{
					arr[i] = -1;
					chk = true;
					count++;
				}
				else
				{
					arr[i] = -1;
				} 
			}
		}
		System.out.println(Arrays.toString(arr));
		return chk;
	}
}

/*
128. Longest Consecutive Sequence
Input: nums = [100,4,200,1,3,2]
Output: 4
*/





