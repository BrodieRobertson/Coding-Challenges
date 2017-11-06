package array3;

public class linearIn 
{
	public static void main(String[] args) 
	{

	}
	
	public boolean linearIn2(int[] outer, int[] inner)
	{
		int i = 0;
		int count = 0;
		if(inner.length != 0)
		{
			while(i < outer.length && count < inner.length)
			{
				if(outer[i] == inner[count])
				{
					count++;
				}
				i++;
			}
		}
		else
		{
			return true;
		}
		
		if(count == inner.length)
		{
			return true;
		}
		
		return false;
	}
}
