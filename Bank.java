package p1;

public class Bank
{
private String emailname;
private int password;
private String createname;
public String getsName()
{
	return emailname;
}
public void setsName(String sName)
{
	this.emailname=sName;
}
public int getsId()
{ 
	return password;
}
public void Setsid(int password)
{
	System.out.println("good morning");
	this.password=password;
}
public String  getBranchName()
{
	return createname;
}
public void SetBranchname(String Branchname)
{
	this.createname=Branchname;
}       
public static void main(String[] args)
{
	 Bank obj=new Bank();
	 obj.getsId();
}
}
	  
	  
	  
	  
	  
	