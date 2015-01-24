import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * timeStartText handles the time counting down at the start of the game
 * This class was mainly designed by Andrew Stroz
 * @author (Andrew Stroz, Anton Dolgovykh) 
 * @version (March 7th, 2013)
 */
public class timeStartText extends counter
{
    public void act() 
    {
        int time = ((space) getWorld()).getStartTime();
        setImage(new GreenfootImage(time + " Seconds", 20, Color.BLACK, Color.WHITE));
        if (time <= 0){
            getWorld().removeObject(this);
        }

    }        
}
