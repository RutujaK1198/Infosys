package com.infosys.practise;

//Attribute1--- billId=1001; customerId=101; discount=2%; billAmount=199.99
//Attribute2--- billId=1002; customerId=102; discount=4%; billAmount=210.5

//discountedBillAmount = billAmount - billAmount * (discount/100)
//Note: the data type of billId, customerId, and discount are int, and billAmount, discountedBillAmount are double.

public class TypeCasting 
    {
      int billId;
      int customerId;
      int discount;
      double billAmount;
      //double discountedBillAmount;
      double discountedBillAmount= billAmount-billAmount*(discount/100);
      
      public void custInfo()
      {
    	 System.out.println(discountedBillAmount);
      }
	}


