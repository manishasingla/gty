 class bankaccount
{
 	String name;
  	String acc_no;
  	int acc_balance;
  	void setdetails(String n,String a,int b)
	{
  		name=n;
  		acc_no=a;
  		acc_balance=b;
	}
       void deposit(int b)
	{
 		acc_balance=acc_balance+b;
  		System.out.print("acc_balance="+acc_balance);
	}
       void withdraw(int b)
	{
  		if(b>acc_balance)
		{
  		System.out.print("unsufficent");
 		return;
		}
	}
 
 	void getdetails()
	{
 		System.out.println("name =" +name);
 		System.out.println("accno= " +acc_no);
 		System.out.println("accbalance =" +acc_balance);
	}
	void changename(String n)
	{
 		name=n;
		System.out.print("name="+name);
	}
}
public class bankaccountt
{
 	public static void main(String[] args)
	{
 		bankaccount p= new bankaccount();
		p.setdetails("manisha","sbi",5000);
		p.getdetails();
                p.deposit(5000);
		p.changename("sakshi");

	}
}