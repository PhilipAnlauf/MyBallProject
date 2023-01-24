import java.awt.*;
import javax.swing.*;
public class Ball{
    private int x;
    private int y;
    private int size;
    private int xSpeed;
    private int ySpeed;
    Ball(int inx, int iny, int inSize, int inXSpeed, int inYSpeed){
        x = inx;
        y = iny;
        size = inSize;
        xSpeed = inXSpeed;
        ySpeed = inYSpeed;
    }
    Ball(){
        x = 0;
        y = 0;
        size = 25;
        xSpeed = 0;
        ySpeed = 0;
    }
    public void drawBall(Graphics newBall){
        newBall.fillOval(x,y,size,size);
    }

    public void moveBall(){
        x = x+=xSpeed;
        y = y+=ySpeed;
    }
    public void moveRight(){
        xSpeed = 10;
    }

    public void moveLeft(){
        xSpeed = -10;
    }

    public void moveUp(){
        ySpeed = -10;
    }

    public void moveDown(){
        ySpeed = 10;
    }

   public void stopX(){
        xSpeed = 0;
   }

    public void stopY(){
        ySpeed = 0;
    }

    public void checkBoundries(){
        if(x>525){
            x = -25;
        }
        if(x<-25){
            x = 525;
        }
        if(y>525){
            y = -25;
        }
        if(y<-25){
            y = 525;
        }
    }
}