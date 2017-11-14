package com.lineTest;

public class LineHost{
	
	double hSlope = 0;
	double hX1 = 0;
	double hY1 = 0;
	double hX2 = 0;
	double hY2 = 0;
	double hYIntercept = 0;
	double hVerticalLinePoint = 0;
	
	public LineHost(double slope, double yIntercept)
	{
		hSlope = slope;
		hYIntercept = yIntercept;
	}
	
	public LineHost(double x1, double y1, double x2, double y2) 
	{
		
	}
	
	public LineHost(double slope, double x, double y)
	{
		
	}
	
	public LineHost(double verticalLinePoint)
	{
		hVerticalLinePoint = verticalLinePoint;
	}
	
	public void computeSlope()
	{
		hSlope = (hY2 - hY1)/(hX2 - hX1);
	}
	
	public double getSlope() 
	{
		return hSlope;
	}
	
	public void findYInterceot()
	{
		hYIntercept = hY1 - (hSlope * hX1);
	}
	
	public double getYIntercept()
	{
		return hYIntercept;
	}
	
	public double verticalLine()
	{
		return hVerticalLinePoint;
	}
	
}