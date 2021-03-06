package capgemini;
import java.util.TreeSet;
import java.util.EnumSet;
import java.util.Set;
import java.util.LinkedHashSet; 
import java.util.HashSet;
import java.util.Stack;
import java.util.List; 
import java.util.Vector;
import java.util.LinkedList;
import java.util.ArrayList;

public class Main {

	
	
	 
	 enum Size
	{
	 FIVE,SIX,SEVEN,EIGHT
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet<Integer> evenNumbers=new TreeSet<>(); 
		evenNumbers.add(2);
		 evenNumbers.add(6); 
		evenNumbers.add(4);
		evenNumbers.add(10);
		 System.out.println(evenNumbers);
		
		 //enum  
		 EnumSet<Size> sizes=EnumSet.allOf(Size.class);
		 EnumSet<Size> sizes2=EnumSet.noneOf(Size.class);
		 sizes2.add(Size.SEVEN);
		 System.out.println(sizes2); 
		 
		 //linked hash set
		 LinkedHashSet<Integer> primeNumber=new LinkedHashSet<>(); 
		 primeNumber.add(2); 
		 primeNumber.add(3);
		  LinkedHashSet<Integer> evenNumber=new LinkedHashSet<>();
		  evenNumber.add(2);
		  evenNumber.add(4);
		  // Intersection 
		 evenNumber.addAll(primeNumber);
		  System.out.println("union is:"+evenNumber); 
		 
		 //hash set
		  HashSet<Integer> primeNumbers=new HashSet<>();
		  primeNumbers.add(2);
		  primeNumbers.add(3);
		  HashSet<Integer> evenNumbe=new HashSet<>(); 
		  evenNumbe.add(2);
		  evenNumbe.add(4);
		  // Intersection 
		 evenNumbe.retainAll(primeNumbers);
		  System.out.println("union is:"+evenNumbe);
		  
		  
		  //mammals
		  
		  Stack<String> mammals=new Stack<>(); 
		  mammals.push("Dog"); 
		  mammals.push("Cat"); 
		  System.out.println("Animals are:"+" "+mammals);
		  
		  //animals
		  Vector<String> mammal=new Vector<>();
		  mammal.add("Dog"); 
		 mammal.add("Cat");
		  Vector<String> animals=new Vector<>(); 
		 animals.addAll(mammal);
		  System.out.println("Animals are:"+" "+animals);
		  
		  
		  //linked list
		  List<Integer> numbers=new LinkedList<>(); 
		  numbers.add(1); 
		  numbers.add(2); 
		  numbers.add(3); 
		  numbers.add(4); 
		  int index=numbers.indexOf(2); 
		  System.out.println("position is"+" "+index);
		  
		  
		  //removed numbers
		// ArrayList Creation
		  ArrayList<Integer> num=new ArrayList<>();
		  // Adding Elements to the List
		  num.add(1); 
		 num.add(2);
		  num.add(3);
		  num.add(4); 
		 System.out.println("List is:"+ " "+num); 
		 // Accessing the elements in the list 
		 int number=num.get(1);
		  System.out.println("Number is:"+ " "+number); 
		 // Removing element from the list
		  int removedNumber=num.remove(2);
		  System.out.println("Removed number is:"+ " "+removedNumber);
		
	}

}
