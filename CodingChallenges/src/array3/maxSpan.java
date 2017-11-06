package array3;

public class maxSpan 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}
	
	public int maxSpan(int[] nums)
	{
		int maxSpan = 0;
		
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = i; j < nums.length; j++)
			{
				if(j == nums.length - 1)
				{
					int endSpan = j;
					while(nums[endSpan] != nums[i])
					{
						endSpan--;
					}
					
					if(i == 0)
					{
						if(endSpan < nums.length && endSpan + 1 > maxSpan)
						{
							maxSpan = endSpan + 1;
						}
					}
					else
					{
						if(endSpan == nums.length - 1 && nums.length - 1 > maxSpan)
						{
							maxSpan = nums.length - 1;
						}
					}

				}
			}
		}
		return maxSpan;
	}

}
