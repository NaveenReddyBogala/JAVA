package capgemini;

public class Rectangle 
{
	public static void main(String args[])
	{         
	 int peri ,area;
	
	rect r= new rect(10,20);
	area=r.area();
	System.out.println("area is "+area+"\n");
	
	box b = new box(10,20);
	peri=b.perimeter();
	System.out.println("volume is "+peri+"\n");

	}
}

	
class rect
{
int l,b;
public rect(int l,int b)
{          
this.l=l; 
this.b=b;
}


public int area()
{
return l*b;
}
}


class box extends rect
{
public box(int l,int b)
{
super(l,b); 

}
public int perimeter()
{
int peri = 2*(l+b);
return peri;
}

}
