package com.lineTest;

import java.util.*;
import javax.swing.JOptionPane;

public class LineHost
{
    Scanner in = new Scanner(System.in);
    public double slope = 0;
    public double secondSlope = 0;
    public double yInt1 = 0;
    public double secondYInt1 = 0;
    public double slope2 = 0;
    public double secondSlope2 = 0;
    public double x1 = 0;
    public double secondX1 = 0;
    public double x2 = 0;
    public double secondX2 = 0;
    public double y1 = 0;
    public double secondY1 = 0;
    public double y2 = 0;
    public double secondY2 = 0;
    public double slope3 = 0;
    public double secondSlope3 = 0;
    public double x13 = 0;
    public double y13 = 0;
    public double secondX13 = 0;
    public double secondY13 = 0;
    public double verticalLinePoint = 0;
    public double secondVerticalLinePoint = 0;
    public int flag = 0;
    public int flag2 = 0;
    public int flag3 = 0;
    public int flag4 = 0;
    public int choice1call1 = 0;
    public int choice1call2 = 0;
    public int choice2call1 = 0;
    public int choice2call2 = 0;
    public int choice3call1 = 0;
    public int choice3call2 = 0;
    public int choice4call1 = 0;
    public int choice4call2 = 0;
    
    public LineHost()
    {
        
        
    }
    
    public void choice1()
    {
        
        if(flag == 0)
        {
            flag =1;
            choice1call1 = 1;
            print("Enter slope of the line: ");
            slope = in.nextDouble();
            print("Enter the y coordinate of the y-intercept: ");
            yInt1 = in.nextDouble();
        }
        else
        {
        	choice1call2 = 1;
            print("Enter slope of the line: ");
            secondSlope = in.nextDouble();
            print("Enter the y coordinate of the y-intercept: ");
            secondYInt1 = in.nextDouble();
        }

  
    }

    public void choice2()
    {
        if(flag2 == 0)
        {
            flag2 = 1;
            choice2call1 = 1;
            print("Enter the first x-coordinate: "); 
            x1 = in.nextDouble();
            print("Enter the first y-coordinate: "); 
            y1 = in.nextDouble();
            print("Enter the second x-coorinate: ");
            x2 = in.nextDouble();
            print("Enter the second y-coordinate: ");
            y2 = in.nextDouble();
            slope2 = (y2 - y1)/(x2 - x1);
        }
        else
        {
        	choice2call2 = 1;
            print("Enter the first x-coordinate: "); 
            secondX1 = in.nextDouble();
            print("Enter the first y-coordinate: "); 
            secondY1 = in.nextDouble();
            print("Enter the second x-coorinate: ");
            secondX2 = in.nextDouble();
            print("Enter the second y-coordinate: ");
            secondY2 = in.nextDouble();
            secondSlope2 = (secondY2 - secondY1)/(secondX2 - secondX1);
        }
        
    }
    
    public void choice3()
    {

        if(flag3 == 0)
        {
            flag3 = 1;
            choice3call1 = 1;
            print("Enter slope of the line: ");
            slope3 = in.nextDouble();
            print("Enter the point's x-coordinate: ");
            x13 = in.nextDouble();
            print("Enter the point's y-coordinate: ");
            y13 = in.nextDouble();
        }
        else
        {
        	choice3call2 = 1;
            print("Enter slope of the line: ");
            secondSlope3 = in.nextDouble();
            print("Enter the other point's x-coordinate: ");
            secondX13 = in.nextDouble();
            print("Enter the other point's y-coordinate: ");
            secondY13 = in.nextDouble();
        }
        
    }
    
    public void choice4()
    {   
        if(flag4 == 0)
        {
            flag4 = 1;
            choice4call1 = 1;
            print("Enter the equation of vertical line as x = ");
            verticalLinePoint = in.nextDouble();
        }
        
        else
        {
        	choice4call2 = 1;
            print("Enter the second equation of vertical line as x = ");
            secondVerticalLinePoint = in.nextDouble();
        }

    }
    
    public void calculations()
    {
    	if(choice1call1 == 1 && choice1call2 ==  1)
    	{
    		if(slope != secondSlope)
    		{
    			intersecting();
    		}
    		if(slope == secondSlope && yInt1 == secondYInt1)
    		{
    			same();
    		}
    	}
    	if(choice1call1 == 1 && choice2call1 ==  1)
    	{
    		if(slope != slope2)
    		{
    			intersecting();
    		}
    		if(slope == slope2 && (x1 == 0 && yInt1 == y1) || (x1 == 0 && yInt1 == y2))
    		{
    			same();
    		}
    	}
    	if(choice1call1 == 1 && choice3call1 ==  1)
    	{
    		if(slope != slope3)
    		{
    			intersecting();
    		}
    		if(slope == slope3 && (x13 == 0 && yInt1 == y13))
    		{
    			same();
    		}
    	}
    	if((choice1call1 == 1 || choice1call2 == 1 || choice3call1 == 1 || choice3call2 == 1) && (choice4call1 ==  1 || choice4call2 == 1))
    	{
    		JOptionPane.showMessageDialog(null, "Selected options do not comply, terminate the program and re-run!", null, JOptionPane.ERROR_MESSAGE);
    	}
    	if(choice1call2 == 1 && choice2call1 ==  1)
    	{
    		if(secondSlope != slope2)
    		{
    			intersecting();
    		}
    		if((secondSlope == slope2) && (x1 == 0 && secondYInt1 == y1) || (x1 == 0 && secondYInt1 == y2))
    		{
    			same();
    		}
    	}
    	if(choice1call2 == 1 && choice2call2 ==  1)
    	{
    		if(secondSlope != secondSlope2)
    		{
    			intersecting();
    		}
    		if((secondSlope == secondSlope2) && (secondX1 == 0 && secondYInt1 == secondY1) || (secondX1 == 0 && secondYInt1 == secondY2))
    		{
    			same();
    		}
    	}
    	if(choice1call2 == 1 && choice3call1 ==  1)
    	{
    		if(secondSlope != slope3)
    		{
    			intersecting();
    		}
    		if(secondSlope == slope3 && (x13 == 0 && secondYInt1 == y13))
    		{
    			same();
    		}
    	}
    	if(choice1call2 == 1 && choice3call2 ==  1)
    	{
    		if(secondSlope != secondSlope3)
    		{
    			intersecting();
    		}
    		if(secondSlope == secondSlope3 && (secondX13 == 0 && secondYInt1 == secondY13))
    		{
    			same();
    		}
    	}
    	if(choice2call1 == 1 && choice2call2 ==  1)
    	{
    		if(slope2 != secondSlope2)
    		{
    			intersecting();
    		}
    		if((slope2 == secondSlope2) && (x1 == secondX1 || x1 == secondX2 || x1 == x2))
    		{
    			same();
    		}
    	}
    	if(choice2call1 == 1 && choice3call1 ==  1)
    	{
    		if(slope2 != slope3)
    		{
    			intersecting();
    		}
    		if((slope2 == slope3) && (x1 == x13 || x2 == x13))
    		{
    			same();
    		}
    	}
    	if(choice2call1 == 1 && choice3call2 ==  1)
    	{
    		if(slope2 != secondSlope3)
    		{
    			intersecting();
    		}
    		if((slope2 == secondSlope3) && (x1 == secondX13 || x2 == secondX13))
    		{
    			same();
    		}
    	}
    	if(choice2call1 == 1 && choice4call1 ==  1)
    	{
    		if(x1 != verticalLinePoint || x2 != verticalLinePoint)
    		{
    			print("Second line is not vertical");
    		}
    		if(x1 == verticalLinePoint && x2 == verticalLinePoint)
    		{
    			same();
    		}
    	}
    	if(choice2call1 == 1 && choice4call2 ==  1)
    	{
    		if(x1 != verticalLinePoint || x2 != secondVerticalLinePoint)
    		{
    			print("Second line is not vertical");
    		}
    		if(x1 == verticalLinePoint && x2 == secondVerticalLinePoint)
    		{
    			same();
    		}
    	}
    	if(choice2call2 == 1 && choice3call1 ==  1)
    	{
    		if(secondSlope2 != slope3)
    		{
    			intersecting();
    		}
    		if((secondSlope2 == slope3) && (secondX1 == x13 || secondX2 == x13))
    		{
    			same();
    		}
    	}
    	if(choice2call2 == 1 && choice3call2 ==  1)
    	{
    		if(secondSlope2 != secondSlope3)
    		{
    			intersecting();
    		}
    		if((secondSlope2 == secondSlope3) && (secondX1 == secondX13 || secondX2 == secondX13))
    		{
    			same();
    		}
    	}
    	if(choice2call2 == 1 && choice4call1 ==  1)
    	{
    		if(secondX1 != verticalLinePoint || secondX2 != verticalLinePoint)
    		{
    			print("Second line is not vertical");
    		}
    		if(secondX1 == verticalLinePoint && secondX2 == verticalLinePoint)
    		{
    			same();
    		}
    	}
    	if(choice2call2 == 1 && choice4call2 ==  1)
    	{
    		if(secondX1 != verticalLinePoint || secondX2 != secondVerticalLinePoint)
    		{
    			print("Second line is not vertical");
    		}
    		if(secondX1 == verticalLinePoint && secondX2 == secondVerticalLinePoint)
    		{
    			same();
    		}
    	}
    	if(choice3call1 == 1 && choice3call2 ==  1)
    	{
    		if(slope3 != secondSlope3)
    		{
    			intersecting();
    		}
    		if(slope3 == secondSlope3 && y13 == secondY13)
    		{
    			same();
    		}
    	}

    }
    
    public void print(String msg)
    {
    	System.out.println(msg);
    }
    
    public void intersecting()
    {
    	System.out.println("The lines are intersecting");
    }
    
    public void same()
    {
    	System.out.println("The lines are same");
    }
    
}