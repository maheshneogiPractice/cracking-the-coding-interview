package array_and_strings;

public class Ex_2_is_permutation {
	
	static String isPermutation(String input)
	{
		char[] charArray = input.toCharArray();
		java.util.Arrays.sort(charArray);		
		return new String(charArray);
		
	}
	static boolean isPermutation(String input1, String input2)
	{
		int [] intArray = new int[128];
		char[] input1CharArray = input1.toCharArray();
		for(char c : input1CharArray)
		{
			intArray[c]++;
		}	
		char[] input2CharArray = input2.toCharArray();
		for(char c : input2CharArray)
		{
			intArray[c]--;
			if(intArray[c]<0)
			{
				return false;
			}
		}	
		return true;
	}
	
	public static void main(String[] args) {
		
		String input1 = "mahesh";
		String input2 = "mhaseh";
		
		if(isPermutation(input1).equals(isPermutation(input2)))
		{
			System.out.println("method 1 : " + true);
		}
		else 
			System.out.println("method 1 : " + false);
		
		System.out.println("method 2 : " + isPermutation(input1, input2));
		
	}

}
