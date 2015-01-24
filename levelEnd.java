import greenfoot.*;  
import java.awt.Color;

/**
 * levelEnd handles the ending level text
 * This class was mainly designed by Andrew Stroz
 * @author (Andrew Stroz, Anton Dolgovykh) 
 * @version (March 7th, 2013)
 */
public class levelEnd extends counter
{
    public void act() 
    {
        int level = ((space) getWorld()).getLevel();
        setImage(new GreenfootImage("Final Level Reached: " + level, 20, Color.BLACK, Color.WHITE));
    }    
}
