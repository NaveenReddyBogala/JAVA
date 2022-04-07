package capgemini;

public class TestInhiritanceInMain 
{
	 object t;
	    
	    public static void main(String[] args) {​​​​​​
	        
	        
	        TestInheritance parent = new TestInheritance();


	        System.out.println("In TestInheritance : "+parent.a);
	        System.out.println("In TestInheritance : "+parent.name);
	        parent.sum(2, 3);
	        
	        TestInheritanceChild child = new TestInheritanceChild();


	        System.out.println("In TestInheritance Child : "+child.a);
	        System.out.println("In TestInheritance Child : "+child.c);
	        System.out.println("In TestInheritance Child : "+child.location);
	        System.out.println("In TestInheritance Child : "+child.name);
	        child.sub(5, 2);
	        child.sum(5, 2);
	        
	        
	    }​​​​​​
	    

}