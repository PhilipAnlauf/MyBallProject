import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Array;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
public class BallPanel extends JPanel{
    ArrayList<Ball> balls = new ArrayList<>();

    int height;
    int width;
    public BallPanel(){
        setFocusable(true);
        setBackground(Color.RED);

        this.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                for(Ball item: balls) {
                    if(item.checkIfClicked(e.getX(), e.getY())){
                        balls.remove(item);
                    }
                }
            }
        });
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