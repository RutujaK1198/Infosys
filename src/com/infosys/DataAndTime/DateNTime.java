package com.infosys.DataAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateNTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LocalTime time= LocalTime.now();
  System.out.println(time);
  
  LocalDate date=LocalDate.now();
  System.out.println(date);
  
  LocalDateTime LDT=LocalDateTime.now();
  System.out.println(LDT);
  
  DateTimeFormatter formatted= DateTimeFormatter.ofPattern(" dd/MM/yyyy HH:mm:ss");
  
  String formatteddate=LDT.format(formatted);
  System.out.println(formatteddate);
	}

}
