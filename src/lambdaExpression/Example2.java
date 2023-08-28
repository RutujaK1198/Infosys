package lambdaExpression;


interface cabN
{
	public void bookCabN(String source,String destination);
}

//class OlaN implements cabN
//{

//	@Override
//	public void bookCabN(String source, String destination) {
//		System.out.println("Cab is booked from "+source+" And Cab is going to "+destination);
//		
//	}
//}
public class Example2 {

	public static void main(String[] args) {
	//data type is removed
		cabN C=(source, destination)->System.out.println("Cab is booked from "+source+" And Cab is going to "+destination);
		C.bookCabN("Aurangabad", "Pune");

	}

}
