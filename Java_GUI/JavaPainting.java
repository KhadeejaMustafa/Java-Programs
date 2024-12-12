// In this program, we're performing painting through Java classes.

import java.awt.*;
import javax.swing.*;

class Mypanel extends JPanel{
@Override
public void paintComponent(Graphics g){
super.paintComponent(g);
Graphics2D g2D = (Graphics2D) g;
g2D.drawRect(20, 20, 22, 25);
g2D.setColor(Color.pink);
g2D.fillOval(30, 30, 33, 37);
}

}
public class JavaPainting {

    public static void main(String args[]) {
       JFrame F = new JFrame();
       JPanel P = new JPanel();
       F.setTitle("My first java painting");
       F.setBounds(100, 100, 300, 300);
       F.getContentPane().setLayout(new BorderLayout());
       
       F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       F.setVisible(true);
       
       F.getContentPane().add(P);
    }
}
