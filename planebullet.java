import greenfoot.*; 

/**
 * planeBullet class handles the bullet that exits the plane and destroys the rpgs
 * This class was mainly designed by Anton Dolgovykh
 * @author (Andrew Stroz, Anton Dolgovykh) 
 * @version (March 7th, 2013)
 * Sources: The Blast Sound was from http://soundbible.com/tags-explosion.html
 */
public class planebullet extends counter
{
    private plane plan;
    GreenfootSound blast = new GreenfootSound("blast.mp3");
    public void act() 
    {
        int y = getY();
        y = y+7;
        setLocation(getX(), y);
        rpgs rpg = (rpgs) getOneObjectAtOffset(0 , 0, rpgs.class);

        if (atWorldEdge()) {
            getWorld().removeObject(this);
            setCounter();
        }

        if(rpg != null) {
            bumpCount(100);
            blast.play();
            rpg.blowup();
            getWorld().removeObject(this);
            setCounter();
        }
    }

    public planebullet(){
        setImage("bullet.png");
    }

    public boolean atWorldEdge() {
        if( getX() > getWorld().getWidth()-4)
            return true;
        if(getY() > getWorld().getHeight()-4)
            return true;
        else
            return false;
    }
}
