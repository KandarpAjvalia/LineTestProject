package com.lineTest;

import javax.swing.JOptionPane;

public class LineClient
{
    
    public static void main(String[] args)
    {
        LineHost host = new LineHost();

        // TODO Auto-generated method stub
        String[] options = new String[] {"Slope and y-intercept", "Two Points", "Slope and Point", "Vertical Line"};
        String[] options2 = options;
        
        String response  = (String) JOptionPane.showInputDialog(null, "Option Dialog", "Select your option", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
       
        
        if(response.equals("Slope and y-intercept"))
        {
            host.choice1();
        }
       
        if(response.equals("Two Points"))
        {
            host.choice2();
        }
        
        if(response.equals("Slope and Point"))
        {
            host.choice3();
        }
        
        if(response.equals("Vertical Line"))
        {
            host.choice4();
        }
        
        String response2  = (String) JOptionPane.showInputDialog(null, "Option Dialog", "Select your option", JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
        
        if(response2.equals("Slope and y-intercept"))
        {
            host.choice1();
        }
       
        if(response2.equals("Two Points"))
        {
            host.choice2();
        }
        
        if(response2.equals("Slope and Point"))
        {
            host.choice3();
        }
        
        if(response2.equals("Vertical Line"))
        {
            host.choice4();
        }
        
        host.calculations();
    }
    
    
    
 
}
