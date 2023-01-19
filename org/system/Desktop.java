package org.system;

public class Desktop extends Computer
{
	public void DesktopSize()
	{
		System.out.println("my desktop size is 3.5 inches");
	}

	public static void main(String[] args)
	{
		Desktop call=new Desktop();
		call.DesktopSize();
		call.ComputerModel();
	 }

}
