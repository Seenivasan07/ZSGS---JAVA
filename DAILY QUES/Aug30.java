import java.util.*;
/*
Spiral Fibonacci Matrix
You are given two integers M and N, representing the number of rows and columns of a matrix. Your task is to fill the matrix with Fibonacci numbers in spiral order (clockwise), starting from the top-left cell (0,0).
Input:
M = 2, N = 3
Output:
0 1 1
5 3 2
*/

class Spiral
{
	public static void main(String[]args)
	{
		int m = 3, n = 4;
		int[]fib = new int[m*n];
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i = 2;i<fib.length;i++)
		{
			fib[i] = fib[i-1] + fib[i-2];
		}
		System.out.println(Arrays.toString(fib));
		
		int[][]mat = new int[m][n];
		int count = 0;
		int minrow = 0, mincol = 0, maxrow = m-1, maxcol = n-1;
		
		while(count < m*n)
		{
			for(int j=mincol;j<=maxcol && count<m*n;j++)
			{
				mat[minrow][j] = fib[count++];	
			}
		
			minrow++;

			for(int i=minrow;i<=maxrow && count<m*n;i++)
			{
				mat[i][maxcol] = fib[count++];
			}
			
			maxcol--;

			for(int j=maxcol;j>=mincol && count<m*n;j--)
			{
				mat[maxrow][j] = fib[count++];
			}

			maxrow--;

			for(int i=maxrow;i>=minrow && count<m*n;i--)
			{
				mat[i][mincol] = fib[count++];
			}

			mincol++;
		}

		for(int i = 0;i<m;i++)
		{
			for(int j = 0;j<n;j++)	
			{
				System.out.print(mat[i][j] + "  ");
			}
			System.out.println();
		}
		
	}
}

/*
You are asked to form a number system using only digits 3 and 4. The numbers are ordered in increasing sequence as follows: 3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444, ...
Given an integer n, return the n-th number in this number system.
*/

class Number
{
	public static void main(String[]args)
	{
		int n = 6, num = 1, count = 0;

		while(true)
		{
			if(check(num))
			{
				count++;
				if(count == n)
				{
					System.out.println(num);
					return;
				}
			}
			num++;
		}
	}

	public static boolean check(int num)
	{
		while(num!=0)
		{
			if(num%10 != 3 && num%10 !=4)
			{
				return false;
			}
			num/=10;
		}
		return true;
	}
}











