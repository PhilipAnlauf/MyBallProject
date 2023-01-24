import java.awt.*;
import javax.swing.*;

public class Main{
    public static void main(String[] args){
        JFrame guess = new JFrame();
        guess.setSize(500,500);

        DrawPanel stuff = new DrawPanel();
        BallPanel ball1 = new BallPanel();

        guess.add(ball1);
        guess.setVisible(true);
    }
}