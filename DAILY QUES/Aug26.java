import java.util.*;
/*
Sort a binary array using one traversal and no extra space Given a binary array, sort it using one traversal and no extra space
Examples:
Input: 1,0,0,1,0,1,0,1,1,1,1,1,1,0,0,1,1,0,1,0,0
Output: 000000000111111111111
Input: 1,0,1,0,1,0,1,0
Output: 00001111
*/
class BinaryTraversal
{
	public static void main(String[]args)
	{
		int[]arr = {0,0,1,0,1,0,1,0};
		int i = 0, j = arr.length - 1;
		while(i<j)
		{
			if(arr[i]==0)
			{
				i++;
			}
			else if(arr[i]!=0 && arr[j]==0)
			{
				arr[i] = 0;
				arr[j] = 1;
				i++;
				j--;
			}
			else
			{
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

/*
We are given a char array. We need to compress consecutive repeating characters in place.
We return the length of the compressed array (not the actual string).
4
Test Case 1
Input: ['a','a','b','b','c','c','c'] Compressed array: ["a","2","b","2","c","3"] Return length: 6
Test Case 4 (Mixed digits case)
Input:
['x','x','x','x','x','x','x','x','x','x','x','y']
Compressed array: ["x","1","1","y"] Return length: 4 */


class Compress
{
	public static void main(String[]args)
	{
		char[]arr = {'a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a'};
		int i = 0, j = 0, k = 1, count = 0;
		while(j<arr.length)
		{
			if(arr[i] == arr[j])
			{
				count++;
				j++;
			}
			else if(arr[i] != arr[j])
			{
				if(count>9)
				{
					int m = k;
					while(count>0)
					{
						
						arr[k++] = (char)('0' + count%10);
						count/=10;
					}
					swap(arr, m, k-1);
					arr[k++] = arr[j];
				}
				else if(count>1)
				{
					arr[k++] = (char)('0' + count%10);
					arr[k++] = arr[j];
				}
				else
				{
					arr[k++] = arr[j];
				}
				i = j;
				count = 0;
			}
		}
		
		if(count>9)
		{
			int t = k;
			while(count!=0)
			{
				arr[k++] = (char)('0' + count%10);
				count/=10;	
			}
			swap(arr, t, k-1);
		}
		else if(count > 1)
		{
			arr[k++] = (char)('0' + count%10);
		}

		for(int l = 0;l<k;l++)
		{
			System.out.print(arr[l] + " ");
		}
	}
	public static void swap(char[]arr, int a, int b)
	{
		while(a<=b)
		{
			char ch = arr[a];
			arr[a] = arr[b];
			arr[b] = ch;
			a++;
			b--;
		}
	}
}

/*
Write a program to determine whether a given number can be expressed as sum of two prime numbers or not. For example 34 can be expressed as sum of two prime numbers but 23 cannot be.
Input:
n = 23
Output:
false
Explanation:
23 cannot be written as the sum of two prime numbers.
6
Input:
n = 50
Output:
true
Explanation:
503 + 47, or 7 + 43, etc.
Input:
n = 34
Output:
true
Explanation:
34 = 3 + 31 (both primes) 34 = 5+29 (both primes) 34 = 11 + 23 (both primes) So return true.
*/

class Prime
{
	public static void main(String[]args)
	{
		int n = 50;
		boolean val = false;
		/*for(int i = 2;i<=n-2;i++)
		{
			if(isPrime(i))
			{
				if(isPrime(n-i))
				{
					System.out.println("True..");
					val = true;
					break;
				}	
			}	
		}
		if(!val)
		{
			System.out.println("False..");
		}*/

		int i = 2, j = n-2;
		while(i<=j)
		{
			if(isPrime(i) && isPrime(j))
			{
				val = true;;
				System.out.println("Truee..");
				break;
			}
			i++;
			j--;
		}
		if(!val)
		{
			System.out.println("False..");
		}
	}
	public static boolean isPrime(int n)
	{
		if(n == 2 || n == 3)
		{
			return true;
		}
		for(int i = 2;i<=Math.sqrt(n);i++)
		{
			if(n%i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
























