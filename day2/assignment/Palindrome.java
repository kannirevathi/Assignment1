package week1.day2.assignment;

public class Palindrome {

	public static void main(String[] args) 
	{
	  int num=34343;
	  int revnum;
	  int tempnum=0;
	 
	for(num=34343;num!=0;num=num/10)
	{
		revnum=num%10;
		tempnum=(tempnum*10)+revnum;
	  
	}
	  
           if(tempnum==num)
            {
        	   System.out.println( " is a palindrome");
            }
             
          else
           {
	             System.out.println( " is not a palindrome");
           }
         
	}
}


