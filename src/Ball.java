import java.awt.*;
import javax.swing.*;
public class Ball{
    private int x;
    private int y;
    private int size;
    private int xSpeed;
    private int ySpeed;
  
    Ball(){
        x = (int)(Math.random()*490+10);
        y = (int)(Math.random()*490+10);
        size = (int)(Math.random()*50+5);
        xSpeed = (int)(Math.random()*8+2);
        ySpeed = 10;
    }
  
    public void drawBall(Graphics newBall){
        newBall.fillOval(x,y,size,size);
    }

    public void moveBall(){
        x = x+=xSpeed;
        y = y+=ySpeed;
    }

    public void checkBoundries(){
        if(x>525 || x<-25){
            xSpeed = xSpeed*-1;
        }
        if(y>525 || y < -25){
            ySpeed = ySpeed*-1;
        }
    }
}