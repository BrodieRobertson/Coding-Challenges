package string3;

public class withoutString 
{

	public static void main(String[] args) 
	{
		System.out.println(withoutString("xyzzy", "y"));

	}
	
	public static String withoutString(String base, String remove)
	{
		String without = "";
		
		for(int i = 0; i < base.length(); i++)
		{
			if(i < base.length())
			{
				while(i + remove.length() <= base.length() && base.substring(i, i + remove.length()).equalsIgnoreCase(remove))
				{		
					i += remove.length();
				}
			}
			
			if(i < base.length())
			{
				without += base.substring(i, i + 1);
			}
		}
		return without;
	}

}
