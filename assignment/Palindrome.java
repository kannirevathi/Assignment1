package week3.assignment;

public class Palindrome {

	public static void main(String[] args) 
	{
		String value="madam";
		String rev="";
		char ch;
		char[] charArray = value.toCharArray();
		for(int i=0;i<charArray.length;i++)
			{
			ch=charArray[i];
			rev=ch+rev;
		
	}
	if(value.equals(rev))
	{
		System.out.println("Given string is: "+value);
		System.out.println("Reversed string is: "+rev);
	}
	else
	{
		System.out.println("Given string is not a palindrome");
	}

}
}
