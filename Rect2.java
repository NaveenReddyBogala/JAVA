package capgemini;

public class Rect2
{
 
		public static void main(String arg[])    
		 {    
		    Exa r = new Exa();    
		    Per c = new Per();    
		    area a;    

		    a = r;    
		    System.out.println("\nArea of Rectangle is : " +a.calc(10,20));    

		    a = c;    
		    System.out.println("\nPerimeter of Rectangle : " +a.calc(15,15));    
		  }    
		 
	

}
interface area    
{        
    double calc(double x,double y);    
 }    

class Exa implements area    
{    
public double calc(double x,double y)    
  {    
      return(x*y);    
   }    
}    

class Per implements area    
{    
public double calc(double x,double y)    
  {    
      return(2*(x+y));    
   }    
}    

 