import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The apple, food for elephant.
 * 
 * @author Chiu 
 * @version April 2025
 */
public class Apple extends Actor
{
    public Apple() {
        setImage("images/apple1.png");
    }
    
    public void act()
    {
        setLocation(getX(), getY() + 2);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight()) {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
