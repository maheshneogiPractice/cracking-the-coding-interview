package array_and_strings;

public class Ex_4_Palindrome_Permutation {

	public static boolean isPermutationPalindrome(String input)
	{
		int table[] = getCharFrequencyTable(input);
		return checkMaxOneOdd(table);
	}
	
	
	public static boolean checkMaxOneOdd(int[] table)
	{
		boolean foundOdd = false;
		
		for(int num : table)
		{
			if(num%2>0) {
				
				if(foundOdd)
				{
					//second odd occurance
					return false;
				}
				//first odd occurance
				foundOdd = true;
			}
		}
		return true;
	}
	
	public static int[] getCharFrequencyTable(String input)
	{
		int[] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
		for(char c : input.toCharArray())
		{
			int i = getCharNumber(c);
			if(i!=-1)
			{
				table[i]++;
			}
		}
		return table;
	}
	
	public static int getCharNumber(char c)
	{
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		
		if(val>=a && val<=z)
		{
			return val-a;
		}
		return -1;
	}
	
	public static void main(String[] args) {
	
		String input = "Tact Coa";
		System.out.println(isPermutationPalindrome(input));

	}

}
