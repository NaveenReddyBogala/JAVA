package capgemini;

import java.util.Scanner;

public class LcmHcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int r1,r2,num1,num2,r,hcf,lcm;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter first number");
	   num1=sc.nextInt();
	   System.out.println("Enter second number");
	   num2=sc.nextInt();
	   r1=num1;
	   r2=num2;
	   while(r2!=0)
	   {
		   r=r2;
		   r2=r1%r2;
		   r1=r;
	   }
	   hcf=r1;
	   lcm=(num1*num2)/hcf;
	   
	   System.out.println("HCF is ="+hcf);
	   System.out.println("LCM is ="+lcm);
	}

}
