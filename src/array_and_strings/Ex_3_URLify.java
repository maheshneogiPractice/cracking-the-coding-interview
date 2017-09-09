package array_and_strings;

public class Ex_3_URLify {

	public static void urlify(String inputString,int trueLength) {
		char[] input = inputString.toCharArray();
		int spaceCount = 0;
		for(int i=0; i<trueLength; i++)
		{
			if(input[i] ==' ')
			{
				spaceCount++;
			}
		}
		int index = trueLength + (2*spaceCount);
		
		for(int i=trueLength-1; i>=0; i--)
		{
			if(input[i]== ' ')
			{
				input[index-1] = '0';
				input[index-2] = '2';
				input[index-3] = '%';
				index = index-3;
			}
			else
			{
				input[index-1]=input[i];
				index--;
			}
		}
		System.out.println(input);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		urlify("Mr John Smith    ", 13);

	}

}
