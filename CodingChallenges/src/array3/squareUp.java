package array3;

public class squareUp 
{
	public static void main(String[] args) 
	{

	}
	
	public int[] squareUp(int n)
	{
		int[] squaredUp = new int[n * n];
		int m = 1;
		int blockLength = n;
		int numbersAdded = 0;
		for(int i = squaredUp.length - 1; i >= 0; i--)
		{
			if(numbersAdded >= blockLength)
			{
				if(numbersAdded >= n)
				{
					numbersAdded = 0;
					blockLength -= 1;
					m = 1;
					
				}
				else if(numbersAdded < n)
				{
					m = 0;
				}
			}
			squaredUp[i] = m;
			numbersAdded++;
			m++;
		}
		return squaredUp;
	}

}
