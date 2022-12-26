package week1.day1;

public class Mobile {
	public void makeCall()
	{
		String mobileModel="oneplus";
		float mobileWeight= 0.50f;
	    System.out.println(mobileModel);
	    System.out.println(mobileWeight);
	}
	public void sendMsg()
	{
		boolean fullyCharged= true;
		int mobileCost= 8000;
		System.out.println(fullyCharged);
		System.out.println(mobileCost);
	}
	public static void main(String[] args) {
        Mobile mb=new Mobile();
        mb.makeCall();
        mb.sendMsg();
        System.out.println("This is my mobile");
	}

}
