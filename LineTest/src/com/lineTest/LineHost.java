package com.lineTest;

/**
 * A Host class that supports the constructed lines in the Client class
 */
public class LineHost{
	
	double hSlope = 0;
	double hX1 = 0;
	double hY1 = 0;
	double hX2 = 0;
	double hY2 = 0;
	double hYIntercept = 0;
	double hVerticalLinePoint = 0;
	
	/**
	 * Constructs a line of a given slope and a y-intercept
	 * @param slope 
	 * @param yIntercept
	 */
	public LineHost(double slope, double yIntercept)
	{
		hSlope = slope;
		hYIntercept = yIntercept;
	}
	
	/**
	 * Constructs a line joining given two points
	 * @param x1 x-coordinate of the first point
	 * @param y1 y-coordinate of the first point
	 * @param x2 x-coordinate of the second point
	 * @param y2 y-coordinate of the second point
	 */
	public LineHost(double x1, double y1, double x2, double y2) 
	{
		hX1 = x1;
		hY1 = y1;
		hX2 = x2;
		hY2 = y2;
	}
	
	/**
	 * Constructs a line of a given slope and a point
	 * @param slope
	 * @param x x-coordinate of the point
	 * @param y y-coordinate of the point
	 */
	public LineHost(double slope, double x, double y)
	{
		hSlope = slope;
		hX1 = x;
		hY1 = y;
	}
	
	/**
	 * Constructs a vertical line with a given x-coordinate
	 * @param verticalLinePoint
	 */
	public LineHost(double verticalLinePoint)
	{
		hVerticalLinePoint = verticalLinePoint;
	}
	
	/**
	 * Method to find the slope from given two points
	 */
	public void computeSlope()
	{
		hSlope = (hY2 - hY1)/(hX2 - hX1);
	}
	
	/**
	 * Gets the slope of the line
	 * @return slope of the line
	 */
	public double getSlope() 
	{
		return hSlope;
	}
	
	/**
	 * Method to find the y-intercept of a given line
	 */
	public void findYInterceot()
	{
		hYIntercept = hY1 - (hSlope * hX1);
	}
	
	/**
	 * Gets the y-intercept of the line
	 * @return y-intercept of the line
	 */
	public double getYIntercept()
	{
		return hYIntercept;
	}
	
	/**
	 * Gets the equation of vertical line in the form of x = expression 
	 * @return x value of the vertical line
	 */
	public double verticalLine()
	{
		return hVerticalLinePoint;
	}
	
}