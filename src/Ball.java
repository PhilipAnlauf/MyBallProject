import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Ball{
    private int x;
    private int y;
    private int size;
    private int xSpeed;
    private int ySpeed;
    private Color ballColor;
    public Ball(){
        x = 250;
        y = 250;
        size = (int)(Math.random()*75+25);
        xSpeed = (int)(Math.random()*15-15);
        ySpeed = (int)(Math.random()*15-15);
        ballColor = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));


    }

    public void drawBall(Graphics newBall){
        newBall.fillOval(x,y,size,size);
        newBall.setColor(ballColor);
    }

    public boolean checkIfClicked(int inx, int iny){
        int xbound = x+size;
        int ybound = y+size;
        return(x<=inx && inx <= xbound && y<=iny && iny <= ybound);
    }

    public void moveBall(){
        x = x+=xSpeed;
        y = y+=ySpeed;
    }

    void checkBoundries(int inHeight, int inWidth){
        if(x>(inWidth-size)){
            xSpeed = (int)(Math.random()*-15-5);
            ySpeed = (int)(Math.random()*15-15);
        }
        if(x<0){
            xSpeed = (int)(Math.random()*15+5);
            ySpeed = (int)(Math.random()*15-15);
        }

        if(y>(inHeight-size)){
            ySpeed = (int)(Math.random()*-15-5);
            xSpeed = (int)(Math.random()*15-15);
        }
        if(y<0){
            ySpeed = (int)(Math.random()*15+5);
            xSpeed = (int)(Math.random()*15-15);
        }
    }
}