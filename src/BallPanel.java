import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
public class BallPanel extends JPanel{
    public BallPanel(){
        setFocusable(true);
        setBackground(Color.RED);
    }
    Ball[] balls = new Ball[2];
    balls[0] = new Ball();
    balls[1] = new Ball();
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i< 2; i++)
        balls[0].moveBall();
        balls[0].drawBall(g);
        balls[0].checkBoundries();

        balls[1].moveBall();
        balls[1].drawBall(g);
        balls[1].checkBoundries();

        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        }

        repaint();
    }
}