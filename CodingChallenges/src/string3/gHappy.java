package string3;

public class gHappy 
{
	public static void main(String[] args) 
	{
		System.out.println(gHappys("g"));
	}
	
	public static boolean gHappys(String str)
	{
		if(str.length() > 1)
		{
			if(str.substring(0, 1).equals("g") && !str.substring(1, 2).equals("g"))
			{
				return false;
			}
			
			for(int i = 1; i < str.length() - 1; i++)
			{
				if(str.substring(i, i + 1).equals("g") && (!((str.substring(i - 1, i).equals("g") || (str.substring(i + 1 , i + 2).equals("g"))))))
				{
					return false;
				}
			}
			
			if(str.substring(str.length() - 1, str.length()).equals("g") && !str.substring(str.length() - 2, str.length() - 1).equals("g"))
			{
				return false;
			}
		}
		else if(str.length() == 1)
		{
			return false;
		}
		return true;
	}

}
