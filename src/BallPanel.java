import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
public class BallPanel extends JPanel{
   Ball[] balls = new Ball[20];
  
    public BallPanel(){
        setFocusable(true);
        setBackground(Color.RED);
        for(int i = 0; i<20; i++){
          balls[i] = new Ball();
        }
    }
   

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i<20; i++){
          balls[i].moveBall();
          balls[i].drawBall(g);
          balls[i].checkBoundries();
        }

        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        }

        repaint();
    }
}