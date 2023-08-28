package com.infosys.SupplierLambda;

import java.util.Date;
import java.util.function.Supplier;

public class Demo1 {

	public static void main(String[] args) {

		Supplier<Date> s=()->new Date(); //in < > we have given output datatype
		
		System.out.println(s.get());
	
	}

}
