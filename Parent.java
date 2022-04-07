package capgemini;

import java.util.Scanner;

public class Parent {
	public static void main(String[] args) {
		System.out.println("enter values");
	Scanner sc=new Scanner(System.in);
	int w=sc.nextInt();
	int x=sc.nextInt();
	int y=sc.nextInt();
	int z=sc.nextInt();
  multiply(w,x); 
  div(y,z);
	
	}
	
	public static void multiply(int a,int b)
	{
		System.out.println("multipication = "+(a*b));
	}
	
	
	public static void div(int a,int b)
	{
		System.out.println("division = "+(a/b));
	}
	
	
	
}
