package com.lineTest;

import javax.swing.JOptionPane;
import java.util.*;

/**
 * A client class for finding if the given two lines by the user are same, parallel, or intersecting
 */
public class LineClient
{
    
    private static Scanner in;

	public static void main(String[] args)
    {
    	in = new Scanner(System.in);
    	
    	//Creating null object reference for later use
        LineHost line1choice1 = null;
        LineHost line1choice2 = null;
        LineHost line1choice3 = null;
        LineHost line1choice4 = null;
        LineHost line2choice1 = null;
        LineHost line2choice2 = null;
        LineHost line2choice3 = null;
        LineHost line2choice4 = null;
        
        int choice = 1;
        int choice2 = 1;
        
        String[] options = new String[] {"Slope and y-intercept", "Two Points", "Slope and Point", "Vertical Line"};
        
        //For drop down selection menu
        String response  = (String) JOptionPane.showInputDialog(null, "Option Dialog", "Select your option", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        if(response.equals("Slope and y-intercept"))
        {
        	choice = 1;
            System.out.println("Enter the slope of the line: ");
            double slope = in.nextDouble();
            System.out.println("Enter the y-intercept: ");
            double yIntercept = in.nextDouble();
            
            //Constructing a line with given slope and y-intercept
            line1choice1 = new LineHost(slope, yIntercept);
            
            System.out.println("Your line 1 is y = " + line1choice1.getSlope() + "x + " + line1choice1.getYIntercept());
        }
       
        if(response.equals("Two Points"))
        {
        	choice = 2;
            System.out.println("Enter the two points\nEnter x1: ");
            double x1 = in.nextDouble();
            System.out.println("Enter y1: ");
            double y1 = in.nextDouble();
            System.out.println("Enter x2: ");
            double x2 = in.nextDouble();
            System.out.println("Enter y2: ");
            double y2 = in.nextDouble();
            
            //Constructing a line with given points
            line1choice2 = new LineHost(x1, y1, x2, y2);
            
            line1choice2.computeSlope();
            line1choice2.findYInterceot();
            System.out.println("Your line 1 is y = " + line1choice2.getSlope() + "x + " + line1choice2.getYIntercept());
        }
        
        if(response.equals("Slope and Point"))
        {
        	choice = 3;
            System.out.println("Enter the slope of the line: ");
            double slope1 = in.nextDouble();
            System.out.println("Enter the point\nEnter x1: ");
            double secondX1 = in.nextDouble();
            System.out.println("Enter y1: ");
            double secondY1 = in.nextDouble();
            
            //Constructing a line with given slope and a point
            line1choice3 = new LineHost(slope1, secondX1, secondY1);
            line1choice3.findYInterceot();
            System.out.println("Your line 1 is y = " + line1choice3.getSlope() + "x + " + line1choice3.getYIntercept());
        }
        
        if(response.equals("Vertical Line"))
        {
        	choice = 4;
            System.out.println("Enter the equation of vertical line, x = ");
            double verticalLinePoint = in.nextDouble();
            
            //Constructing a vertical line
            line1choice4 = new LineHost(verticalLinePoint);
            
            System.out.println("The equation of your second line is x = " + line1choice4.verticalLine());
        }
        
        String response2  = (String) JOptionPane.showInputDialog(null, "Option Dialog", "Select your option", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        if(response2.equals("Slope and y-intercept"))
        {
        	choice2 = 1;
        	System.out.println("Enter the slope of the line: ");
            double slope = in.nextDouble();
            System.out.println("Enter the y-intercept: ");
            double yIntercept = in.nextDouble();
            
            //Constructing a second line with given slope and a y-intercept
            line2choice1 = new LineHost(slope, yIntercept);
            
            System.out.println("Your line 1 is y = " + line2choice1.getSlope() + "x + " + line2choice1.getYIntercept());
        }
       
        if(response2.equals("Two Points"))
        {
        	choice2 = 2;
        	System.out.println("Enter the two points\nEnter x1: ");
            double x1 = in.nextDouble();
            System.out.println("Enter y1: ");
            double y1 = in.nextDouble();
            System.out.println("Enter x2: ");
            double x2 = in.nextDouble();
            System.out.println("Enter y2: ");
            double y2 = in.nextDouble();
            
            //Constructing a second line with two given points
            line2choice2 = new LineHost(x1, y1, x2, y2);
            
            line2choice2.computeSlope();
            line2choice2.findYInterceot();
            System.out.println("Your line 1 is y = " + line2choice2.getSlope() + "x + " + line2choice2.getYIntercept());

        }
        
        if(response2.equals("Slope and Point"))
        {
        	choice2 = 3;
            System.out.println("Enter the slope of the line: ");
            double slope1 = in.nextDouble();
            System.out.println("Enter the point\nEnter x1: ");
            double secondX1 = in.nextDouble();
            System.out.println("Enter y1: ");
            double secondY1 = in.nextDouble();
            
            //Constructing a second line with given slope and a point
            line2choice3 = new LineHost(slope1, secondX1, secondY1);
            
            line2choice3.findYInterceot();
            System.out.println("Your line 1 is y = " + line2choice3.getSlope() + "x + " + line2choice3.getYIntercept());
        }
        
        if(response2.equals("Vertical Line"))
        {
        	choice2 = 4;
            System.out.println("Enter the equation of vertical line, x = ");
            double verticalLinePoint = in.nextDouble();
            
            //Constructing a second vertical line
            line2choice4 = new LineHost(verticalLinePoint);
            System.out.println("The equation of your second line is x = " + line2choice4.verticalLine());
        }
        
        //Checking different choices by the user
        
        if(choice == 1 & choice2 == 1)
        {
        	if(line1choice1.getSlope() == line2choice1.getSlope())
        	{
        		if(line1choice1.getYIntercept() == line2choice1.getYIntercept())
        		{
        			same();
        		}
        		else
        		{
        			parallel();
        		}
        	}
        	else
        	{
        		intersecting();
        	}
        }
        
        if(choice == 1 & choice2 == 2)
        {
        	if(line1choice1.getSlope() == line2choice2.getSlope())
        	{
        		if(line1choice1.getYIntercept() == line2choice2.getYIntercept())
        		{
        			same();
        		}
        		else
        		{
        			parallel();
        		}
        	}
        	else
        	{
        		intersecting();
        	}
        }
        
        if(choice == 1 & choice2 == 3)
        {
        	if(line1choice1.getSlope() == line2choice3.getSlope())
        	{
        		if(line1choice1.getYIntercept() == line2choice3.getYIntercept())
        		{
        			same();
        		}
        		else
        		{
        			parallel();
        		}
        	}
        	else 
        	{
        		intersecting();
        	}
        }
        
        if(choice == 2 & choice2 == 1)
        {
        	if(line1choice2.getSlope() == line2choice1.getSlope())
        	{
        		if(line1choice2.getYIntercept() == line2choice1.getYIntercept())
        		{
        			same();
        		}
        		else
        		{
        			parallel();
        		}
        	}
        	else
        	{
        		intersecting();
        	}
        }
        
        if(choice == 2 & choice2 == 2)
        {
        	if(line1choice2.getSlope() == line2choice2.getSlope())
        	{
        		if(line1choice2.getYIntercept() == line2choice2.getYIntercept())
        		{
        			same();
        		}
        		else
        		{
        			parallel();
        		}
        	}
        	else
        	{
        		intersecting();
        	}
        }
        
        if(choice == 2 & choice2 == 3)
        {
        	if(line1choice2.getSlope() == line2choice3.getSlope())
        	{
        		if(line1choice2.getYIntercept() == line2choice3.getYIntercept())
        		{
        			same();
        		}
        		else
        		{
        			parallel();
        		}
        	}
        	else
        	{
        		intersecting();
        	}
        }
        
        if(choice == 3 & choice2 == 1)
        {
        	if(line1choice3.getSlope() == line2choice1.getSlope())
        	{
        		if(line1choice3.getYIntercept() == line2choice1.getYIntercept())
        		{
        			same();
        		}
        		else
        		{
        			parallel();
        		}
        	}
        	else
        	{
        		intersecting();
        	}
        }
        
        if(choice == 3 & choice2 == 2)
        {
        	if(line1choice3.getSlope() == line2choice2.getSlope())
        	{
        		if(line1choice3.getYIntercept() == line2choice2.getYIntercept())
        		{
        			same();
        		}
        		else
        		{
        			parallel();
        		}
        	}
        	else
        	{
        		intersecting();
        	}
        }
        
        if(choice == 3 & choice2 == 3)
        {
        	if(line1choice3.getSlope() == line2choice3.getSlope())
        	{
        		if(line1choice3.getYIntercept() == line2choice3.getYIntercept())
        		{
        			same();
        		}
        		else
        		{
        			parallel();
        		}
        	}
        	else
        	{
        		intersecting();
        	}
        }
        
        if(choice == 4 & choice2 == 4)
        {
        	if(line1choice4.verticalLine() == line2choice4.verticalLine())
        	{
        		same();
        	}
        	else
        	{
        		parallel();
        	}
        }
        
        if((choice == 4 | choice2 == 4) & (choice == 1 | choice==2 | choice == 3 | choice2 == 1 | choice2 == 2 | choice2 == 3))
        {
        	//Shows error dialog box if the user chooses vertical line with any different combination than itself
        	JOptionPane.showMessageDialog(null, "The selected combinaton of lines does not work, terminate the program and re-rum",null, JOptionPane.ERROR_MESSAGE);
        }
    }
   
	/**
	 * Method to print a String when the given user lines are parallel
	 */
	public static void parallel()
	{
		System.out.println("The lines are parallel");
	}
	
	/**
	 * Method to print a String when the given user lines are intersecting
	 */
	public static void intersecting()
	{
		System.out.println("The lines are intersecting");
	}
	
	/**
	 * Method to print a String when the given user lines are the same 
	 */
	public static void same()
	{
		System.out.println("The lines are same");
	}
	
}
