package com.infosys.PolyMorphism;

public class Shape_OL 
{
  public float CalculateArea(float radius)
  {
	  return 3.14f*radius*radius;
  }
  
  public float CalculateArea(float length, float breadth)
  {
	  return length*breadth;
  }
}
