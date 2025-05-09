import greenfoot.*;

public class MyWorld extends World {
    public int scoreCount = 0;
    Label score;
    
    public MyWorld() {
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        
        score = new Label(0,100);
        addObject(score, 40, 50);
        
        createApple();
    }
    
    public void increaseScore() {
        scoreCount++;
        score.setValue(scoreCount);
    }
    
    public void createApple() {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        addObject(apple, x, 0);
    }
}
