import greenfoot.*;  

/**
 * Plane class controls the plane actor. The plane actor is the main actor in the game that the player moves
 * @author (Anton Dolgovykh, Andrew Stroz) 
 * @version (March 7th, 2013)
 */
public class plane extends counter
{
    public static int speedHorizonatlly = 4;
    public static int speedVertically = 4;

    public plane(){
        setRotation(90);
    }    

    public void act() 
    {

        processKeys();
        if (superPower()) {
            setImage("planesheild.png");
        } else {
            setImage("airplane.png");
        }
        if (counter5==1){
            this.blowup();

        }
    }

    private void processKeys() {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("right")) {
            x = x + speedHorizonatlly;
            setLocation(x, getY());
        }
        if(Greenfoot.isKeyDown("b")) {
            if (bombCount>0){
                useBomb();  
            }
            else{}
        }
        if(Greenfoot.isKeyDown("left")) {
            x = x - speedHorizonatlly;
            setLocation(x, getY());
        }
        if (Greenfoot.isKeyDown("up")) {
            y = y - speedVertically;
            setLocation(getX(), y);
        }
        if (Greenfoot.isKeyDown("down")) {
            y = y + speedVertically;
            setLocation(getX(), y);
        }  
        if (Greenfoot.isKeyDown("space")) {
            shoot();
        }
    }   

    public void shoot() {
        if (counter == 0){
            getWorld().addObject(new planebullet(), getX(), getY());
            counter = 1;
        }
    }

}
