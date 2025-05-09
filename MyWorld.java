import greenfoot.*;

public class MyWorld extends World {
    public int scoreCount = 0;
    Label score;
    int level = 1; 
    
    public MyWorld() {
        super(600, 400, 1, false);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        score = new Label(0,100);
        addObject(score, getWidth()/2, 50);
        
        createApple();
        setBackground("images/background.jpg");
    }
    
    public void gameOver() {
        Label gameOver = new Label("Game Over", 100);
        addObject(gameOver, 300, 200);
    }
    
    public void increaseScore() {
        scoreCount++;
        score.setValue(scoreCount);
        
        if(scoreCount % 5 == 0) {
            level++;
        }
    }
    
    public void createApple() {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        addObject(apple, x, 0);
    }
}
