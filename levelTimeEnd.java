import greenfoot.*;
import java.awt.Color;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * levelTimeEnd handles the time on the ending screen
 * This class was mainly designed by Andrew Stroz
 * @author (Andrew Stroz, Anton Dolgovykh) 
 * @version (March 7th, 2013)
 */
public class levelTimeEnd extends counter
{
    public void act() 
    {
        double levelTime = ((space) getWorld()).getTime();
        setImage(new GreenfootImage("Time Until Next Level: " + levelTime, 20, Color.BLACK, Color.WHITE));
    }    
}
