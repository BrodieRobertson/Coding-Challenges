package array3;

public class fix34 
{
	public static void main(String[] args)
	{
		
	}
	
	public static int[] fix34(int[] nums)
	{
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] == 3)
			{
				boolean found4 = false;
				int j = 0;
				while(!found4 && j < nums.length)
				{
					if((j == 0 && nums[j] == 4) ||(nums[j] == 4 && nums[j - 1] != 3))
					{
						int temp = nums[j];
						nums[j] = nums[i + 1];
						nums[i + 1] = temp;
						found4 = true;
					}
					j++;
				}
			}
		}
		return nums;
	}
}
