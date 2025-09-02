import java.util.*;
/*
sort numbers based on digits starting from most significant numbers.
Eg:
input-100
1 11
21
2
3.
Output-1
100
11
2
21
3
*/

class Sort
{
	public static void main(String[]args)
	{
		int[]arr = {100, 11, 1, 21, 2, 3};
		int ind = -1;
		for(int i = 0;i<arr.length;i++)
		{
			int small = arr[i];
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[j]/10 < small/10)
				{
					ind = arr[j]<arr[i]?j:i;
					small = arr[j]<arr[i]?arr[j]:arr[i];
				}
			}
			int temp = arr[i];
			arr[i] = arr[ind];
			arr[ind] = temp;
		}
		System.out.println(Arrays.toString(arr));	
	}
}