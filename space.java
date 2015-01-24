import greenfoot.*;  
import java.util.List; 
import java.awt.Color;
/**
 * space class is an extention of world class and handles the world in wich the actors "live"
 * This class was mainly designed by Andrew Stroz
 * @author (Andrew Stroz, Anton Dolgovykh) 
 * @version (March 7th, 2013)
 */

public class space extends World {
    private counter theCounter;  
    public scoreEndText scoreEnd; 
    public int levelCounter = 0; 
    public int level = 0; 
    public int levelTime =0; 
    public int counterTime = 0;
    GreenfootSound backgroundMusic = new GreenfootSound("trogdor.mp3");
    GreenfootSound gameover = new GreenfootSound("gameover.mp3");
    GreenfootSound level1 = new GreenfootSound("level1.mp3");
    public int stopped = 0;
    public int title = 0;
    public int counterTimeStart = 0;
    public int startTime = 0;
    public int levelStartSwitch = 0;

    public space()   
    {    
        super(800, 600, 1);
        stopped = 0;
        setPaintOrder(timeStartText.class, plane.class, rpgs.class, planebullet.class, counter.class, powerup1.class, bomb.class, scoreEndText.class);
        theCounter = new counter();
        if (levelStartSwitch == 0) {
            addObject(new timeStartText(), 500, 200);
            levelStartSwitch = 1;
        }

    }

    public void populate(){        
        addObject(new levelCounterText(), 320, 30);
        addObject(new levelTime(), 150, 30);
        addObject(theCounter, 550, 30);
        plane planes = new plane();
        addObject(planes, 326, 100);
    }

    public void act() 
    {
        level1.playLoop();
        if (title == 0){
            getStartTime();
            setBackground("startmenu.png");
            if (getStartTime() <= 0){       
                title = 1;
                populate();
                setBackground("space.jpg");
            }
        } else {
            if (stopped == 0) {
                explosion.initialiseImages();
                if(levelCounter <= 2500) {            
                    level1();
                } else if (levelCounter > 2500 && levelCounter <= 4900){
                    level2();
                } else if (levelCounter > 4900 && levelCounter <= 7300){
                    level3();
                } else if (levelCounter > 7300 && levelCounter <= 9700){
                    level4();
                } else if (levelCounter > 9700 && levelCounter <= 12100){
                    level5();
                } else if (levelCounter > 12100){
                    level6();
                }
                if(Greenfoot.getRandomNumber(1000) == 3) {
                    addObject(new powerup1(), Greenfoot.getRandomNumber(790), Greenfoot.getRandomNumber(590));
                }
                if(Greenfoot.getRandomNumber(10000) == 2) {
                    addObject(new bomb(), Greenfoot.getRandomNumber(790), Greenfoot.getRandomNumber(590));
                }
            } else {
                setBackground("images.jpg");
                gameover.play();
                stopper();
            }
        }

    }

    public void level1() {
        if(Greenfoot.getRandomNumber(100) < 3) {
            addObject(new rpgs(), Greenfoot.getRandomNumber(800), 600);
        }
        level = 1;
        levelCounterSet();
    }

    public void level2(){
        if(Greenfoot.getRandomNumber(100) < 7) {
            addObject(new rpgs(), Greenfoot.getRandomNumber(800), 600);
        }
        level = 2;
        levelCounterSet();
    }

    public void level3(){
        if(Greenfoot.getRandomNumber(100) < 10) {
            addObject(new rpgs(), Greenfoot.getRandomNumber(800), 600);
        }
        level1.stop();
        backgroundMusic.playLoop();
        level = 3;
        levelCounterSet();
    }

    public void level4(){
        if(Greenfoot.getRandomNumber(100) < 15) {
            addObject(new rpgs(), Greenfoot.getRandomNumber(800), 600);
        }
        level = 4;
        levelCounterSet();
    }

    public void level5(){
        if(Greenfoot.getRandomNumber(100) < 20) {
            addObject(new rpgs(), Greenfoot.getRandomNumber(800), 600);
        }
        level = 5;
        levelCounterSet();
    }

    public void level6(){
        if(Greenfoot.getRandomNumber(100) < 30) {
            addObject(new rpgs(), Greenfoot.getRandomNumber(800), 600);
        }
        level = 6;
        levelCounterSet();
    }

    public void levelCounterSet(){
        levelCounter += 1;
    }

    public int getLevel(){
        return level;
    }

    public int getTime(){
        counterTime = counterTime + 1;
        if (counterTime==70){
            levelTime = levelTime + 1;
            counterTime = 0;
            if (levelTime >= 36) {
                levelTime = 0;
            } 
        }
        return (36 - levelTime);
    }

    public int getStartTime(){
        counterTimeStart = counterTimeStart + 1;
        if (counterTimeStart == 250){
            startTime = startTime + 1;
            counterTimeStart = 0;
            if (startTime > 15) {
                startTime = 0;
            } 
        }
        return (15 - startTime);
    }

    public void gameOver() 
    {
        List objects = getObjects(null);
        if (objects != null) { 
            removeObjects(objects);        
        }
        level1.stop();
        backgroundMusic.stop();
        stopped = 1;
    }

    public void stopper(){  
        level1.stop();
        backgroundMusic.stop();
        addObject(new scoreEndText(), 600, 30);
        addObject(new levelTimeEnd(), 120, 30);
        addObject(new levelEnd(), 370, 30);
        Greenfoot.stop();
        stopped = 0;

    }    

}