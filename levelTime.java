import greenfoot.*;
import java.awt.Color;  

/**
 * levelTime handles the time counting down
 * This class was mainly designed by Andrew Stroz
 * @author (Andrew Stroz, Anton Dolgovykh) 
 * @version (March 7th, 2013)
 */
public class levelTime extends counter
{
    public void act() 
    {
        double levelTime = ((space) getWorld()).getTime();
        setImage(new GreenfootImage("Time Until Next Level: " + levelTime, 20, Color.BLACK, Color.WHITE));

    }    
}

