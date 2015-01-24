import greenfoot.*;  
import java.awt.Color;
/**
 * levelCounterText class handeles the actor that prints the level
 * @author (Anton Dolgovykh, Andrew Stroz)  
 * @version (March 7th, 2013)
 */
public class levelCounterText extends counter
{
    public void act() 
    {
        int level = ((space) getWorld()).getLevel();
        setImage(new GreenfootImage("Level: " + level, 20, Color.BLACK, Color.WHITE));

    }    
}
