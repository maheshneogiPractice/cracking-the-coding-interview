package array_and_strings;

public class Ex_5_One_Edit {

	static boolean isOneEdit(String input1, String input2)
	{
		int input1Len = input1.length();
		int input2Len = input2.length();
		
		if( input1Len == input2Len)
		{
			return oneEditReplacement(input1, input2);
		}
		else if(input1Len+1 == input2Len)
		{
			return oneEditInsert(input1, input2);
		}
		else if(input1Len-1 == input2Len)
		{
			return oneEditInsert(input2, input1);
		}
		
		return false;
	}
	
	static boolean oneEditReplacement(String s1, String s2)
	{
		boolean foundDiff = false;
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)!= s2.charAt(i))
			{
				if(foundDiff)
				{
					return false;
				}
				foundDiff = true;
			}
		}
		
		return true;
	}
	
	static boolean oneEditInsert(String s1, String s2)
	{
		int index1 = 0;
		int index2 = 0;
		
		while(index1<s1.length() && index2<s2.length())
		{
			if(s1.charAt(index1)!=s2.charAt(index2))
			{
				if(index1!=index2)
				{
					return false;
				}
				index2++;
			}
			else
			{
				index1++;
				index2++;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
	String input1="pale";
	String input2 = "bale";
	
	System.out.println(isOneEdit(input1, input2));

	}

}
