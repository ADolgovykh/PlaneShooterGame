import greenfoot.*;  
import java.awt.Color;
import java.util.List; 
/**
 * counter class controls a number of variables including a score counter as it can be accessed by all of the actor subclasses
 * @author (Anton Dolgovykh, Andrew Stroz) 
 * @version (March 7th, 2013)
 */
public class counter extends Actor
{
    public static int counter = 0;
    public static int totalCount = 200;
    public static int totalCountFinal = 0;
    public static int bombCount = 0; 
    public static int counter1 = 0;
    public static int countertime = 0;
    public static int counter5 =0;

    public void act() {
        setImage(new GreenfootImage("Score: " + totalCount, 20, Color.BLACK, Color.WHITE));
        counter1 = 0;
        counter5 = 0;

        if (superPower()){
            setCounter2(); 
        } else {
            counter1 = 0;
        }
        if (totalCount < 0){
            totalCountFinal = totalCount;
            totalCount200();
            ((space) getWorld()).gameOver();
        }

    }    

    public void setCounter(){
        counter = 0;

    }

    public void blowup(){

        getWorld().addObject(new explosion(), getX(), getY());
        getWorld().removeObject(this);
    }

    public void addBomb(){
        bombCount++;
    }

    public void useBomb(){
        List<rpgs> objectr = getWorld().getObjects(rpgs.class);  
        getWorld().removeObjects(objectr);
        bombCount += -1;   
    }

    public boolean superPower() {
        if (countertime >= 500 || countertime == 0){
            counter1 = 0;
            countertime = 0;
            return false;
        } 
        setCounterTime();
        return true;
    }

    public void setCounterTime(){
        countertime += 1;
    }

    public void setCounter2(){
        counter1 = 1;
    }

    public void bumpCount(int amount) {
        totalCount += amount;
    }

    public int getCount(){
        return totalCount;
    }

    public void totalCount200(){
        totalCount = 200;
    }
}
