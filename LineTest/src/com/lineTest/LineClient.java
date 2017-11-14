package com.lineTest;

import javax.swing.JOptionPane;
import java.util.*;

public class LineClient
{
    
    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	
        LineHost line1choice1;
        LineHost line1choice2;
        LineHost line1choice3;
        LineHost line1choice4;
        LineHost line2choice1;
        LineHost line2choice2;
        LineHost line2choice3;
        LineHost line2choice4;
        
        String[] options = new String[] {"Slope and y-intercept", "Two Points", "Slope and Point", "Vertical Line"};
        
        String response  = (String) JOptionPane.showInputDialog(null, "Option Dialog", "Select your option", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        if(response.equals("Slope and y-intercept"))
        {
            System.out.println("Enter the slope of the line: ");
            double slope = in.nextDouble();
            System.out.println("Enter the y-intercept: ");
            double yIntercept = in.nextDouble();
            line1choice1 = new LineHost(slope, yIntercept);
            System.out.println("Your line 1 is y = " + line1choice1.getSlope() + "x + " + line1choice1.getYIntercept());
        }
       
        if(response.equals("Two Points"))
        {
            System.out.println("Enter the two points\nEnter x1: ");
            double x1 = in.nextDouble();
            System.out.println("Enter y1: ");
            double y1 = in.nextDouble();
            System.out.println("Enter x2: ");
            double x2 = in.nextDouble();
            System.out.println("Enter y2: ");
            double y2 = in.nextDouble();
            line1choice2 = new LineHost(x1, y1, x2, y2);
            line1choice2.computeSlope();
            line1choice2.findYInterceot();
            System.out.println("Your line 1 is y = " + line1choice2.getSlope() + "x + " + line1choice2.getYIntercept());
        }
        
        if(response.equals("Slope and Point"))
        {
            System.out.println("Enter the slope of the line: ");
            double slope1 = in.nextDouble();
            System.out.println("Enter the point\nEnter x1: ");
            double secondX1 = in.nextDouble();
            System.out.println("Enter y1: ");
            double secondY1 = in.nextDouble();
            line1choice3 = new LineHost(slope1, secondX1, secondY1);
            System.out.println("Your line 1 is y = " + line1choice3.getSlope() + "x + " + line1choice3.getYIntercept());
        }
        
        if(response.equals("Vertical Line"))
        {
            System.out.println("Enter the equation of vertical line, x = ");
            double verticalLinePoint = in.nextDouble();
            line1choice4 = new LineHost(verticalLinePoint);
            System.out.println("The equation of your second line is x = " + line1choice4.verticalLine());
        }
        
        String response2  = (String) JOptionPane.showInputDialog(null, "Option Dialog", "Select your option", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        if(response2.equals("Slope and y-intercept"))
        {
        	System.out.println("Enter the slope of the line: ");
            double slope = in.nextDouble();
            System.out.println("Enter the y-intercept: ");
            double yIntercept = in.nextDouble();
            line2choice1 = new LineHost(slope, yIntercept);
            System.out.println("Your line 1 is y = " + line2choice1.getSlope() + "x + " + line2choice1.getYIntercept());
        }
       
        if(response2.equals("Two Points"))
        {
        	System.out.println("Enter the two points\nEnter x1: ");
            double x1 = in.nextDouble();
            System.out.println("Enter y1: ");
            double y1 = in.nextDouble();
            System.out.println("Enter x2: ");
            double x2 = in.nextDouble();
            System.out.println("Enter y2: ");
            double y2 = in.nextDouble();
            line2choice2 = new LineHost(x1, y1, x2, y2);
            line2choice2.computeSlope();
            line2choice2.findYInterceot();
            System.out.println("Your line 1 is y = " + line2choice2.getSlope() + "x + " + line2choice2.getYIntercept());

        }
        
        if(response2.equals("Slope and Point"))
        {
            System.out.println("Enter the slope of the line: ");
            double slope1 = in.nextDouble();
            System.out.println("Enter the point\nEnter x1: ");
            double secondX1 = in.nextDouble();
            System.out.println("Enter y1: ");
            double secondY1 = in.nextDouble();
            line2choice3 = new LineHost(slope1, secondX1, secondY1);
            System.out.println("Your line 1 is y = " + line2choice3.getSlope() + "x + " + line2choice3.getYIntercept());
        }
        
        if(response2.equals("Vertical Line"))
        {
            System.out.println("Enter the equation of vertical line, x = ");
            double verticalLinePoint = in.nextDouble();
            line2choice4 = new LineHost(verticalLinePoint);
            System.out.println("The equation of your second line is x = " + line2choice4.verticalLine());
        }
        
    }
    
    
    
 
}
