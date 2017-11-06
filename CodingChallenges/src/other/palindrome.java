package other;

public class palindrome 
{

	public static void main(String[] args) 
	{
		System.out.println(isPalindrome(56));
	}
	
	public static boolean isPalindrome(int number)
	{
		String str = String.valueOf(number);
		String backwards = "";
		for(int i = str.length() - 1; i >= 0; i--)
		{
			backwards += str.substring(i, i + 1);
		}
		if(backwards.equals(str))
		{
			return true;
		}
		return false;
	}

}
