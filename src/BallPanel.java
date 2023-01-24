import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
public class BallPanel extends JPanel{
    Ball b1 = new Ball();

    Ball phil;
    public BallPanel(){
        setFocusable(true);

        setBackground(Color.RED);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                int keyPressed = e.getKeyCode();
                if(keyPressed == 68){
                    b1.moveRight();
                }
                if(keyPressed == 87){
                    b1.moveUp();
                }
                if(keyPressed == 65){
                    b1.moveLeft();
                }
                if(keyPressed == 83){
                    b1.moveDown();
                }

            }

            @Override
            public void keyReleased(KeyEvent e){
                int keyReleased = e.getKeyCode();
                if(keyReleased == 68 || keyReleased == 65){
                    b1.stopX();
                }

                if(keyReleased == 87 || keyReleased == 83) {
                    b1.stopY();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g){
        b1.moveBall();
        super.paintComponent(g);
        b1.drawBall(g);
        b1.checkBoundries();

        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        }

        repaint();
    }
}