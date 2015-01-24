import greenfoot.*;  

/**
 * explosion class handles the explosion animation when the "rpgs" die
 * This class was mainly designed by Anton Dolgovykh
 * @author (Andrew Stroz, Anton Dolgovykh) 
 * @version (March 7th, 2013)
 * Source: The Greenfoot lunarlander tutorial project was referenced for this code
 */

public class explosion extends counter
{
    private final static int IMAGE_COUNT= 3;

    private static GreenfootImage[] exp;
    private int sizeImg=0;

    private int growth=1;    
    public explosion()
    {
        initialiseImages();
        setImage(exp[0]);        

    }    

    public synchronized static void initialiseImages()
    {
        if(exp == null) {
            GreenfootImage baseImage = new GreenfootImage("explosion.png");
            int maxSize = baseImage.getWidth()*2;
            int delta = maxSize / (IMAGE_COUNT+1);
            int sizeImg = 0;
            exp = new GreenfootImage[IMAGE_COUNT];
            for(int i=0; i < IMAGE_COUNT; i++) {
                sizeImg = sizeImg + delta;
                exp[i] = new GreenfootImage(baseImage);
                exp[i].scale(sizeImg, sizeImg);
            }
        }
    }

    /**
     * EXPLODE!
     */
    public void act()
    { 
        setImage(exp[sizeImg]);

        sizeImg += growth;
        if(sizeImg>=IMAGE_COUNT) {
            growth = -growth;
            sizeImg += growth;
        }

        if(sizeImg <= 0) {
            getWorld().removeObject(this);
        }
    }
}
