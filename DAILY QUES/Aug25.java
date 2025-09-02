/*
75 - colours...

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue. We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
Example 1:
Input: nums = [2,0,2,2,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]
*/

class Colour
{
	public static void main(String[]args)
	{
		int[]nums = {2,0,2,1,1,0,2,0,2,2,2,1,1,0};
		int zeros = 0;
		int ones = 0;
		int twos = 0;
		for(int i = 0;i<nums.length;i++)
		{
			if(nums[i] == 0)
			{
				zeros++;
			}
			else if(nums[i] == 1)
			{
				ones++;
			}
			else
			{
				twos++;
			}
		}

		for(int i = 0;i<nums.length;i++)
		{
			if(zeros!=0)
			{
				System.out.print(0 + " ");
				zeros--;
			}
			else if(ones != 0)
			{
				System.out.print(1 + " ");
				ones--;
			}
			else
			{
				System.out.print(2 + " ");
				twos--;
			}
		}
	}
}

/*
455 - leetcode...

Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.
 
Example 1:
Input: g = [1,2,3], s = [1,1]
Output: 1

*/

class Cookie
{
	public static void main(String[]args)
	{
		int[]g = {7};
		int[]s = {5, 6, 7};
		int i = 0;
		int j = 0;
		int count = 0;	
		
		while(i<g.length && j<s.length)
		{
			if(g[i] <= s[j])
			{
				count++;
				i++;
				j++;
			}
			else
			{
				j++;
			}
		}
		System.out.println(count);
	}
}

/*
557. Reverse Words in a String

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 
Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:
Input: s = "Mr Ding"
Output: "rM gniD"
*/

class Reverse
{
	public static void main(String[]args)
	{
		String s = "Let's take LeetCode contest";
		String[]arr = s.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<arr.length;i++)
		{
			sb.append(rev(arr[i].toCharArray())).append(" ");
		}
		System.out.println(sb.toString());
	}
	public static String rev(char[]ch)
	{
		int i = 0, j = ch.length-1;
		while(i<j)
		{
			char c = ch[i];
			ch[i] = ch[j];
			ch[j] = c;
			i++;
			j--;
		}
		return String.valueOf(ch);
	}
}































