package string3;

public class mirrorEnds 
{

	public static void main(String[] args) 
	{
		System.out.println(mirrorEnds("aba"));
	}
	
	public static String mirrorEnds(String string)
	{
		String mirrored = "";
		int i = 0;
		
		while(i < string.length() && string.substring(i, i + 1).equals(string.substring(string.length() - i - 1, string.length() - i)))
		{
			mirrored += string.substring(i, i + 1);
			i++;
		}

		return mirrored;
	}
}
