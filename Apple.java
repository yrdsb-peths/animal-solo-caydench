import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The apple, food for elephant.
 * 
 * @author Chiu 
 * @version April 2025
 */
public class Apple extends Actor
{
    int speed = 3;
    GreenfootImage apple = new GreenfootImage("images/apple.png");
    public Apple() {
        setImage(apple);
        apple.scale(40, 40);
    }
    
    public void act()
    {
        setLocation(getX(), getY() + speed);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight()) {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd) {
        speed = spd;
    }
}
