import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, our hero.
 * 
 * @author Chiu 
 * @version April 2025
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    
    public Elephant() {
        setImage("images/elephant2.png");
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left")) {
            move (-3);
        } else if (Greenfoot.isKeyDown("right")) {
            move(3);
        }
        
        eat();
    }
    
    public void eat() {
        if(isTouching(Apple.class)) {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld)getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }
    }
}
