package lambdaExpression;

public class FunctionInterface {

	@FunctionalInterface
	interface cab
	{
		public void bookCab();
	}




		public static void main(String[] args) {
			cab o= ()-> System.out.println("Ola is booked...");
			o.bookCab();		
		
					

		}

	}


