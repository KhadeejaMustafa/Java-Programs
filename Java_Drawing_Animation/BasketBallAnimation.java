// this program uses JPanel, JFrame and the repaint() method to create a ball and animate it.
// in such a way that the ball moves as the mouse is dragged. 

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyPanel extends JPanel {

    int mx = 20; // position of ball on x-axis
    int my = 20; // position of ball on y-axis

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.orange);
        g2.fillOval(mx, my, 50, 50);

    }

}

public class BasketBallAnimation {

    // declare and create JFrame, and MyPanel objects
    static JFrame F = new JFrame();
    static MyPanel P = new MyPanel();

    public static void main(String args[]) {
        F.setTitle("The BasketBall");
        F.setBounds(150, 150, 300, 300);
        F.getContentPane().setLayout(new BorderLayout());
        F.getContentPane().add(P);

        P.addMouseMotionListener(new Event());
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F.setVisible(true);

    }

    static class Event extends MouseMotionAdapter {

        @Override
        public void mouseDragged(MouseEvent me) {
            P.mx = me.getX();
            P.my = me.getY();
            P.repaint();
        }
    }
}
