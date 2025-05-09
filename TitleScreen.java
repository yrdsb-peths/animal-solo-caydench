import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label ("Hungry Elephant", 70);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen() {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 85);
        prepare();
        
        setBackground("images/background.jpg");
    }

    public void act() {
        if(Greenfoot.isKeyDown("space")) {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,549,87);
        elephant.setLocation(495,86);
        elephant.setLocation(517,83);
        Label label = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label,310,202);
        label.setLocation(327,202);
        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2,289,287);
        label2.setLocation(384,287);
        label2.setLocation(283,284);
        label.setLocation(305,209);
        label.setLocation(284,186);
        label.setLocation(295,189);
        elephant.setLocation(530,209);
        label.setLocation(385,194);
        label2.setLocation(368,273);
        label.setLocation(249,202);
        label2.setLocation(203,293);
        label2.setLocation(318,309);
        label2.setLocation(284,299);
        label2.setLocation(252,292);
        label2.setLocation(248,291);
        elephant.setLocation(495,253);
        elephant.setLocation(523,255);
        elephant.setLocation(519,253);
    }
}
