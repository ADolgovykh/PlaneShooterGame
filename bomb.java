import greenfoot.*; 

/**
 * bomb class handles the bomb power up (spawing and location)
 * @author (Anton Dolgovykh, Andrew Stroz) 
 * @version (March 7th, 2013)
 */
public class bomb extends counter
{
    public void act() 
    {
        setLocation(getX(), getY());
        Actor plane = getOneObjectAtOffset(0, 0, plane.class);

        if (atWorldEdge()) {
            getWorld().removeObject(this);
        }
        if (plane != null) {
            getWorld().removeObject(this);
            addBomb();
        }    
    }

    public boolean atWorldEdge() {
        if(getX() < 10 )
            return true;
        if(getY() < 10 )
            return true;
        else
            return false;
    }
}