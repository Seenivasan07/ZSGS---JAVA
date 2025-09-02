/*18. Given two dates, find total number of days between them.

Input: dt * 1 = {10, 2, 2014} dt * 2 = {10, 3, 2015}
Output: 393

Input:
dt * 1 = {10, 2, 2000} ...............dt * 2 = {10, 3, 2000}
Output: 29
Note that 2000 is a leap year

Input:
dt * 1 = {10, 2, 2000} ................dt * 2 = {10, 2,2000}
Output: 0
Both dates are same

Input:
dt * 1 = {1, 2, 2000}................ dt * 2 = {1, 2,2004};
Output: 1461

*/

class Days
{
	public static void main(String[]args)
	{
		String[]d1 = {"1", "8", "2025"};
		String[]d2 = {"28", "8", "2025"};
		
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
