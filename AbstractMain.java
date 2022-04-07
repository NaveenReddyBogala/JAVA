package capgemini;

public class AbstractMain extends Circle{
	void triaarea(int a,int b) {
		System.out.println("area of triangle "+((a*b)/2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractMain test=new AbstractMain();
		test.triaarea(4,6);
		test.area(4,6);

	}

}
