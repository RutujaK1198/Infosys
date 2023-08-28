package com.infosys.Clone;

public class Bittoo implements Cloneable{

	 String hair;
	 String eyes;
	 String face;
	 
	public static void main(String[] args) throws CloneNotSupportedException {

     Bittoo b1= new Bittoo();
     b1.eyes="Brown";
     b1.face="Round";
     b1.hair="Black";
     
     Bittoo b2=(Bittoo) b1.clone();
      System.out.println(b2.eyes);
      System.out.println(b2.face);
      System.out.println(b2.hair);
	}

}
