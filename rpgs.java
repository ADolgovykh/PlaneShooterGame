import greenfoot.*;  

/**
 * this class handles the death of the plane by contancting a "rpgs" and the rpgs itself (upwards movement and removal of actor)
 * This class was mainly designed by Andrew Stroz
 * @author (Andrew Stroz, Anton Dolgovykh) 
 * @version (March 7th, 2013)
 */
public class rpgs extends counter
{
    public void act() 
    {
        setLocation(getX(), getY() - 3);
        Actor plane = getOneObjectAtOffset(0, 0, plane.class);
        if (atWorldEdge()) {
            getWorld().removeObject(this);
            bumpCount(-10);
        }

        if (plane != null) {
            if (counter1 == 0){
                totalCountFinal = totalCount;
                totalCount200();
                setCounter();
                counter5 = 1;
                ((space) getWorld()).gameOver();
            }
            if (counter1 == 1){
                this.blowup();       
            }
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
