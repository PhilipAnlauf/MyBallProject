import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Main{
    public static void main(String[] args){
        //======================================
        System.out.println("From IntJ to Replit");
        JFrame guess = new JFrame();
        guess.setSize(500,500);

        BallPanel ball1 = new BallPanel();

        JButton addButton = new JButton("Add a ball");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ball1.balls.add(new Ball());
            }
        });

        ball1.add(addButton);

        guess.add(ball1);
        guess.setVisible(true);

    }
}