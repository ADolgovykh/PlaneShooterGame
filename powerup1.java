import greenfoot.*;  

/**
 * this class handles the sheild powerup
 * This class was mainly designed by Andrew Stroz and Anton Dolgovykh
 * @author (Andrew Stroz, Anton Dolgovykh) 
 * @version (March 7th, 2013)
 */
public class powerup1 extends counter
{

    public void act() {
        setLocation(getX(), getY() -2);
        Actor plane = getOneObjectAtOffset(0, 0, plane.class);

        if (atWorldEdge()) {
            getWorld().removeObject(this);
        }
        if (plane != null) {
            getWorld().removeObject(this);
            superPower();
            setCounterTime();
            bumpCount(500);

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
