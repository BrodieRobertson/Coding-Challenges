package string3;

public class countYZ 
{
	public static void main(String[] args) 
	{

	}
	
	public static int countYZ(String str)
	{
		int count = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if(!Character.isLetter(str.charAt(i)) && i != 0)
			{
				if(str.charAt(i - 1) == 'y' || str.charAt(i - 1) == 'Y' ||
						str.charAt(i - 1) == 'z' || str.charAt(i - 1) == 'Z')
				{
					count++;
				}
			}
		}
		
		if(str.charAt(str.length() - 1) == 'y' || str.charAt(str.length() - 1) == 'Y' ||
			str.charAt(str.length() - 1) == 'z' || str.charAt(str.length() - 1) == 'Z')
		{
			count++;
		}
		
		return count;
	}
}
