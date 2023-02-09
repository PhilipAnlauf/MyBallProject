import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Array;
import java.util.ArrayList;
import javax.swing.*;
public class BallPanel extends JPanel{
    ArrayList<Ball> balls = new ArrayList<>();

    int height;
    int width;
    public BallPanel(){
        setFocusable(true);
        setBackground(Color.RED);
    }

    @Override
    protected void paintComponent(Graphics g){
        height = getHeight();
        width = getWidth();
        super.paintComponent(g);
        for(Ball item: balls) {
            item.moveBall();
            item.drawBall(g);
            item.checkBoundries(height, width);
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