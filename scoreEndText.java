import greenfoot.*; 
import java.awt.Color;

/**
 * handles the printing of the score at the end of the game
 * This class was mainly designed by Andrew Stroz
 * @author (Andrew Stroz, Anton Dolgovykh) 
 * @version (March 7th, 2013)
 */
public class scoreEndText extends counter
{

    public void act() 
    {
        setImage(new GreenfootImage("Final Score: " + totalCountFinal, 20, Color.BLACK, Color.WHITE));
    }    
}
