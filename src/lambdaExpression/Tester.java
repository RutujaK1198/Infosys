package lambdaExpression;

interface cab
{
	public void bookCab();
}


//Normal method
class Ola implements cab
{
	public void bookCab()
	{
		System.out.println("Ola cab is booked...");
	}
}

public class Tester {

	public static void main(String[] args) {
		cab o= new Ola();
			o.bookCab();	
	
				

	}

}
