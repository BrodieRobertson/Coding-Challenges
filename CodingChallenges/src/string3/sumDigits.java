package string3;

public class sumDigits 
{
	public static void main(String[] args) 
	{
		System.out.println(sumDigits("dgd5g"));
	}
	
	public static int sumDigits(String str)
	{
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				sum += Integer.parseInt(str.substring(i, i + 1));
			}
		}
		return sum;
	}

}
