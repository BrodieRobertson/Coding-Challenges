package string3;

public class sameEnds 
{

	public static void main(String[] args) 
	{
		System.out.println(sameEnds("javaXYZjava"));
	}
	
	public static String sameEnds(String string) 
	{
		String subString = "";
		int i = 0;
		while(i <= string.length()/ 2)
		{
			if(string.substring(0, i).equals(string.substring(string.length() - i)))
			{
				subString = string.substring(0, i);
			}
			i++;
		}
		
		return subString;
	}
}
