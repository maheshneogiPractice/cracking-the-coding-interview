package array_and_strings;

public class Ex_1__Is_Unique {

	private static boolean isUnique(String input) {
		
		//Assuming ASCII string (128)
		if(input.length()>128)
		{
			return false;
		}
		else
		{
			boolean[] checkArray = new boolean[128];
			int val = 0;
			for(int i=0; i<input.length(); i++)
			{
				val = input.charAt(i);
				if(checkArray[val])
				{
					return false;
				}
				else
				{
					checkArray[val] = true;
				}
			}
			return true;
		}
	}
	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();*/
		
		String input="mahesh";
		System.out.println(isUnique(input));

	}

}



/*The time complexity for this code is O( n), where n is the length of the string. The space complexity is O( 1).
(You could also argue the time complexity is O( 1), since the for loop will never iterate through more than
128 characters.} If you didn't want to assume the character set is fixed, you could express the complexity as
(c) space and 0 (min (c, n)) or 0 ( c) time, where c is the size of the character set*/