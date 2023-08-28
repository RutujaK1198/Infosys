package com.infosys.practise;

import java.util.Scanner;

/*A retail store management wants to provide a discount on the bill amount for its customers. 
 * The bill details of the customer are as given below. Print the bill id, customer id, and the discounted bill amount for the customers.
 */
//discountedBillAmount = billAmount - billAmount * (discount/100)

//Attribute1--- billId=1001; customerId=101; discount=2%; billAmount=199.99
//Attribute2--- billId=1002; customerId=102; discount=4%; billAmount=210.5

//Note: the data type of billId, customerId, and discount are int, and billAmount, discountedBillAmount are double.
public class TypeCasting_Scanner
{
 public static void main(String[] args) 
 {
   Scanner s= new Scanner(System.in);
   System.out.println("Print first billAmount");
   double a = s.nextDouble();
   System.out.println("Print second BillAmount");
   double c=s.nextDouble();
   System.out.println("Print first discount");
   int b = s.nextInt();
   System.out.println("Print second discount");
   int d=s.nextInt();
   
   double DiscBill;
   DiscBill=a-a*((double)b/100);
   System.out.println("Your discount Bill amount for first input is= "+DiscBill);
   DiscBill=c-c*((double)d/100);
   System.out.println("Your discount bill amount for second input is= "+DiscBill);
	}
}

