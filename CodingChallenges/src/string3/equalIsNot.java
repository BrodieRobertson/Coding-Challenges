package string3;

public class equalIsNot 
{
	public static void main(String[] args) 
	{
		System.out.println(equalIsNots("This is notnot a dream"));
	}
	
	public static boolean equalIsNots(String str)
	{
		int is = 0;
		int not = 0;
		for(int i = 0; i < str.length() - 1; i++)
		{
			if(str.substring(i, i + 2).equals("is"))
			{
				is++;
			}
			
			if(i < str.length() - 2 && str.substring(i, i + 3).equals("not"))
			{
				not++;
			}
		}
		
		if(is == not)
		{
			return true;
		}
		
		return false;
	}
}
