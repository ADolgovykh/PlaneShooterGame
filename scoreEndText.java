import greenfoot.*; 
import java.awt.Color;

/**
 * handles the printing of the score at the end of the game
 * @author (Anton Dolgovykh, Andrew Stroz) 
 * @version (March 7th, 2013)
 */
public class scoreEndText extends counter
{

    public void act() 
    {
        setImage(new GreenfootImage("Final Score: " + totalCountFinal, 20, Color.BLACK, Color.WHITE));
    }    
}
