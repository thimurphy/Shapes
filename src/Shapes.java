/*
 *This program shows the use of other shapes in Graphics package.
 */

/**
 *
 * @author thiagomurphy
 */

import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel {
    
    private int choice; //user's choice of which shape to draw
    
    //construct sets he user's choice
    public Shapes(int userChoice){
        choice = userChoice;
    }//end constructor
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        for(int i = 0; i < 10; i++){
            
            //pick the shape based on users choice
            switch(choice){
                case 1://draw rectangles
                    g.drawRect(10 + i * 10, 10 + i * 10, 
                            50 + i * 10, 50 + i * 10);
                    break;
                    
                case 2://draw ovals
                    g.drawOval(10 + i * 10, 10 + i * 10, 
                            50 + i * 10, 50 + i * 10);
                    break;
            }//end switch statement
        }//end if statement
    }//end paintComponent method
    
}// end class Shapes
