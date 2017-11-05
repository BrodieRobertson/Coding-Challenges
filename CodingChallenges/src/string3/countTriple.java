package string3;

public class countTriple 
{
	public static void main(String[] args) 
	{
		System.out.println(countTriple("ssssdsfff"));
	}
	
	public static int countTriple(String str)
	{
		int count = 0;
		
		if(str.length() >= 3)
		{
			for(int i = 0; i < str.length() - 2; i++)
			{
				String value = str.substring(i, i + 1);
				if(str.substring(i + 1, i + 2).equals(value) && str.substring(i + 2, i + 3).equals(value))
				{
					count++;
				}
			}
		}
		
		return count;
	}

}
