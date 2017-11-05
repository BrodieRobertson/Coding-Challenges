package string3;

public class sumNumbers 
{

	public static void main(String[] args) 
	{
		System.out.println(sumNumbers("abc123xyz"));

	}
	
	public static int sumNumbers(String str)
	{
		String number = "";
		int sum = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				number += str.substring(i, i + 1);
			}
			else if(!Character.isDigit(str.charAt(i)) && number.length() > 0)
			{
				sum += Integer.parseInt(number);
				number = "";
			}
		}
		
		if(number.length() > 0)
		{
			sum += Integer.parseInt(number);
		}
		
		return sum;
	}

}
