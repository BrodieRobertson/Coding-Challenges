package array3;

public class seriesUp 
{

	public static void main(String[] args) 
	{

	}
	
	public static int[] seriesUp(int n)
	{
		int[] seriesUpped = new int[n * (n + 1) / 2];
		int currentNumber = 1;
		int length = 1;
		for(int i = 0; i < seriesUpped.length; i++)
		{
			if(i > 0 && currentNumber > length)
			{
				currentNumber = 1;
				length++;
			}
			seriesUpped[i] = currentNumber;
			currentNumber++;
		}
		
		return seriesUpped;
	}

}
