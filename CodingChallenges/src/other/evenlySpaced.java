package other;

public class evenlySpaced 
{

	public static void main(String[] args) 
	{
		evenlySpacedMuliplication(40, 50, 2);
	}
	
	public static void evenlySpacedMuliplication(int row, int col, int padding)
	{
		String[][] evenlySpaced = new String[row][col];
		for(int i = 0; i < evenlySpaced[0].length; i++)
		{
			if(String.valueOf(i * evenlySpaced.length).length() > "0".length())
			{
				padding += String.valueOf(i * evenlySpaced.length).length() - 1;
			}
			
			for(int j = 0; j < evenlySpaced.length; j++)
			{
				evenlySpaced[j][i] = String.valueOf(i * j);
				
				if(j > 0 && String.valueOf(i * j).length() > String.valueOf(i * (j - 1)).length())
				{
					padding--;
				}
				
				for(int spaceCount = 0; spaceCount < padding; spaceCount++)
				{
					evenlySpaced[j][i] += " ";
				}
			}
		}
		
		for(int i = 0; i < evenlySpaced.length; i++)
		{
			for(int j = 0; j < evenlySpaced[i].length; j++)
			{
				System.out.print(evenlySpaced[i][j]);
			}
			System.out.println();
		}
	}

}
