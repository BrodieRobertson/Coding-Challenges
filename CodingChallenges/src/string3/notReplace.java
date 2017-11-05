package string3;

public class notReplace 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(notReplace("iss"));
	}
	
	public static String notReplace(String str)
	{
		String notReplace = "";
		
		for(int i = 0; i < str.length(); i++)
		{
			if(i > 1 && i < 3)
			{
				if(str.substring(i - 2, i).equals("is") && !Character.isLetter(str.charAt(i)))
				{
					notReplace += " not";
				}
			}
			else if(i >= 4)
			{
				if(str.substring(i - 2, i).equals("is") && (!Character.isLetter(str.charAt(i - 3)) && !Character.isLetter(str.charAt(i))))
				{
					notReplace += " not";
				}
			}
			notReplace += str.substring(i, i + 1);
		}
		
		if(str.length() >= 3 && str.substring(str.length() - 2, str.length()).equals("is") && (!Character.isLetter(str.charAt(str.length() - 3))))
		{
			notReplace += " not";
			
		}
		else if(str.length() == 2 && str.substring(str.length() - 2, str.length()).equals("is"))
		{
			notReplace += " not";
		}
		
		return notReplace;
	}

}
