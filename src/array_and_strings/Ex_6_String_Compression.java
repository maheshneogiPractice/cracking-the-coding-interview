package array_and_strings;

public class Ex_6_String_Compression {
	static String stringCompressor(String input)
	{
		StringBuilder sb = new StringBuilder();
		int countConsecutive = 0;
		for(int i=0;i<input.length();i++)
		{
		countConsecutive++;
		if(i+1>=input.length() || input.charAt(i)!=input.charAt(i+1))
		{
			sb.append(input.charAt(i));
			sb.append(countConsecutive);
			countConsecutive = 0;
		}
		}
		
		return sb.length()<input.length()? sb.toString() : input;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(stringCompressor("aabcccccaa"));

	}

}
