package lambdaExpression;

import java.util.function.Predicate;

// JOIN two predicate- OR,AND, Negate
// P1----Check whether number is even
//P2---Check whether number is >50

public class Demo3 {

	public static void main(String[] args) 
	{
		int a[]= {5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80};
		
	Predicate<Integer>p1= s-> s%2==0;
	Predicate<Integer>p2=s-> s>50;
	
	System.out.println("Even numbers which are greater by 50");
	for(int n:a)
	{
		//if (p1.test(n) && p2.test(n))
		if(p1.and(p2).test(n))
		{
			System.out.println(n);
		}
	}
	//OR 
	System.out.println("Either even or greater by 50");
	for(int n:a)
	{
		//if (p1.test(n) && p2.test(n))
		if(p1.or(p2).test(n))
		{
			System.out.println(n);
		}
	}

	//NEGATE- Opposite result will print
	System.out.println("Negate for p1");
	for(int n:a)
	{
		//if (p1.test(n) && p2.test(n))
		if(p1.negate().test(n))
		{
			System.out.println(n);
		}
	}
	}

}
