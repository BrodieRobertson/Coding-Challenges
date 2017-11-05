package string3;

public class maxBlock 
{
	public static void main(String[] args) 
	{
		System.out.println(maxBlock("hoopla"));

	}
	
	public static int maxBlock(String str)
	{
		int topCount = 0;
		int count = 0;
		String value = "";
		for(int i = 0; i < str.length(); i++)
		{
			if(str.substring(i, i + 1).equals(value))
			{
				count++;
			}
			else if(!str.substring(i, i + 1).equals(value))
			{
				if(count > topCount)
				{
					topCount = count;
					count = 0;
				}
				
				value = str.substring(i, i + 1);
				count = 1;
			}
			
			if(count > topCount)
			{
				topCount = count;
			}
		}
		
		return topCount;
	}

}
