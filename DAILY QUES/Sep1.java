/*
Split Array Elements by Threshold
Description:
You are given an integer array nums and an integer threshold. For each element x in nums, split it into parts such that no part is greater than threshold. Count how many parts are formed for all elements and return the total count.

Example 1
Input:
nums = [5, 8, 10, 13, 6, 2]
threshold = 3
Output:
17
Explanation:
5→ {3,2} → 2 parts
8→ {3,3,2} → 3 parts
10 → 3,3,3,1} → 4 parts
13 (3,3,3,3,1} → 5 parts
6→ {3,3} → 2 parts
2 → {2} → 1 part
Total = 2+3+4+5+2+1 = 17

Example 2
Input:
nums = [4, 9]
threshold = 2
Output: 7
Explanation: 4→ {2,2} → 2 parts 9 → {2,2,2,2,1} → 5 parts Total = 7

*/

class Threshold
{
	public static void main(String[]args)
	{
		int[]arr = {4,9};
		int thold = 2;
		int sum = 0;
		for(int i = 0;i<arr.length;i++)
		{
			sum+=thres(arr[i], thold);	
		}
		System.out.println(sum);
	}
	
	public static int thres(int n, int thold)
	{
		int count = 0;
		while(n>0)
		{
			n-=thold;
			count++;
		}
		return count;
	} 
}

/*
Add Two Numbers in Base-n
Description:
You are given two numbers a and b represented as strings, and an integer n representing the base. Your task is to return the sum of the two numbers, also as a string in base n. The digits in the strings are valid for base n (i.e., between 0 and n-1).The base n will be between 2 and 10 (so digits are 0-9 only).

Example 1 Input:
a = "1010" b = "11001" n=2
Output: "100011"
Explanation: Binary addition: 1010 (10) + 11001 (25) = 100011 (35).

Example 2
Input: a = "123" b = "13" n = 4
Output: "202"
Explanation: Base-4 addition:
123 (base-4) = 1*16 + 2*4 + 3 = 27 (decimal) 13 (base-4) = 1*4 + 3 = 7 (decimal) Sum = 34 (decimal) → 202 (base-4).
*/

class Base
{
	public static void main(String[]args)
	{
		String a = "123";
		String b = "13";
		int n = 4;
		int sum = findBase(a, n) + findBase(b, n);
		StringBuilder res = new StringBuilder();
		while(sum!=0)
		{
			res.append(sum%n);
			sum/=n;	
		}
		System.out.println(res.reverse().toString());
	}
	public static int findBase(String val, int base)
	{
		int i = 0;
		int num = Integer.parseInt(val);
		int sum = 0;
		while(i<val.length())
		{
			sum+=num%10 * Math.pow(base, i++);
			num/=10;
		}
		return sum;
	}
}
























