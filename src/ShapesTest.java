/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thiagomurphy
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {
    
    public static void main (String args[]){
        
        //obtain user's choice
        String input = JOptionPane.showInputDialog(
            "Enter 1 to draw rectangle\n" + 
            "Enter 2 to draw ovals");
        
        int choice = Integer.parseInt(input); //Convert input to int
        
        //create the panel with users input
        Shapes panel = new Shapes(choice);
        
        JFrame app = new JFrame(); //creates a new JFrame
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300,300);
        app.setVisible(true);
        
    }//end main
    
}//end class ShapesTest
