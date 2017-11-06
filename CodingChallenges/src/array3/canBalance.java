package array3;

public class canBalance 
{
	public static void main(String[] args)
	{
		
	}
	
	public static boolean canBalance(int[] nums)
	{
		int total = 0;
		int half = 0;
		for(int i = 0; i < nums.length; i++)
		{
			total += nums[i];
		}
		
		half = total/2;
		
		int[] halfCounts = new int[2];
		for(int i = 0; i < nums.length; i++)
		{
			if(halfCounts[0] < half)
			{
				halfCounts[0] += nums[i];
			}
			else
			{
				halfCounts[1] += nums[i];
			}
		}
		
		if(halfCounts[0] == halfCounts[1])
		{
			return true;
		}
		return false;
	}
}
