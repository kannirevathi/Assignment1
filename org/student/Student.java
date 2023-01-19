package org.student;
import org.college.*;
import org.department.*;
public class Student extends Department
{
	public void StudentName()
	{
		System.out.println("kannirevathi");
	}
public void StudentDept()
{
	System.out.println("cse");
}
public void StudentId()
{
	System.out.println("0040");
}	

	
public static void main(String[] args) 
{
		Student call=new Student();
		call.StudentName();
		call.StudentId();
		call.StudentDept();
		call.DeptName();
		call.CollegeName();
		call.CollegeCode();
		call.CollegeRank();
		

}}


