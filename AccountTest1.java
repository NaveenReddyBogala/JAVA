package capgemini;
import java.util.Scanner;
public class AccountTest1 {
	public static int Accnum; 
	public static String name;
	public static int balance;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter account number");
		Accnum=sc.nextInt();
		System.out.println("enter account holder name");
		name=sc.nextLine();
		System.out.println("enter balance amount");
		balance=sc.nextInt();*/
		Account test=new Account(421, "naveen", 100000);
		String x=test.details();
		System.out.println("original bank details :"+x);
		test.deposit(10000);
		System.out.println("after deposti :"+test.details());
		test.withdraw(20000);
		System.out.println("after withdraw :"+test.details());
		String y=test.details();
		System.out.println("final details :"+y);
	}

}
class Account{
	int Accnum;
	String name;
	int balance;
	public Account(int a,String n,int amount)
	{
	 this.Accnum=a;
	this.name=n;
	this.balance=amount;
	}
	public String details()
	{
		return("Account number: "+this.Accnum +",Name: "+this.name +",balance: "+this.balance);          
	}
	public void deposit(int amount)
	{
		this.balance +=amount;
	}
	public void withdraw(int amount)
	{
		this.balance -=amount;
	}
}
