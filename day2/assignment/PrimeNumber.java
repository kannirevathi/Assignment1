package week1.day2.assignment;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int input=13;
		boolean flag=false;
		for(int i=2;input%i!=0;i++)
	
		{
			flag=true;
			break;
		}
if(flag==true)
{System.out.println(input+ " is a prime number ");
}

else
	{System.out.println(input+ " is not a prime number");
}

}
}