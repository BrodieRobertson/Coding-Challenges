package other;

import java.util.StringTokenizer;

public class wordsGreaterThanSize 
{
	public static void main(String[] args)
	{
		String[] test = wordGreaterThanSize("Stop sending me programming problems I want to go watch some anime", 3);
		for(int i = 0; i < test.length; i++)
		{
			System.out.println(test[i]);
		}
	}
	
	public static String[] wordGreaterThanSize(String string, int size)
	{
		StringTokenizer tokens = new StringTokenizer(string, " ");
		String[] initial = new String[tokens.countTokens()];
		int count = 0;
		
		while(tokens.hasMoreTokens())
		{
			String token = tokens.nextToken();
			if(token.length() > size)
			{
				initial[count] = token;
				count++;
			}
		}
		
		String[] returned = new String[count];
		for(int i = 0; i < count; i++)
		{
			returned[i] = initial[i];
		}
		
		return returned;
	}
}
