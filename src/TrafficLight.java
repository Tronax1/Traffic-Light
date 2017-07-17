
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class TrafficLight extends JPanel implements MouseListener {

 //Que trabajo tan poopy XD

    private JPanel panel;
    private int status;
    private Color offRed;
    private Color offYellow;
    private Color offGreen;

 

    public TrafficLight() {

        panel = new JPanel(new FlowLayout());
        panel.setSize(100, 100);
        panel.setBackground(Color.LIGHT_GRAY);

        addMouseListener(this);

        offRed = new Color(128, 0, 0);
        offYellow = new Color(192, 192, 0);
        offGreen = new Color(0, 96, 0);
        status = 0;
    }
    @Override

    public void paintComponent(Graphics g) {

        drawBackground(g);
        drawIlluminatedLights(g);

    }

   
    private void drawBackground(Graphics g) {

        g.setColor(offRed);
        g.fillOval(10, 10, 70, 70);
        g.setColor(Color.BLACK);
        g.drawOval(10, 10, 70, 70);

        // insert "off" yellow light

        g.setColor(offYellow);
        g.fillOval(10, 90, 70, 70);
        g.setColor(Color.BLACK);
        g.drawOval(10, 90, 70, 70);

 
    // insert "off" green light

        g.setColor(offGreen);
        g.fillOval(10, 170, 70, 70);
        g.setColor(Color.BLACK);
        g.drawOval(10, 170, 70, 70);
    }


    private void drawIlluminatedLights(Graphics g) {

        // traffic light is entirely "off"

        if (status == 0) {

            // turn "on" red light
            g.setColor(Color.RED);
            g.fillOval(10, 10, 70, 70);
            g.setColor(Color.BLACK);
            g.drawOval(10, 10, 70, 70);
            
        } else if (status == 1) { // red light is "on"

            // turn "off" red light

            g.setColor(offRed);
            g.fillOval(10, 10, 70, 70);
            g.setColor(Color.BLACK);
            g.drawOval(10, 10, 70, 70);

            // turn "on" yellow light

            g.setColor(Color.YELLOW);
            g.fillOval(10, 90, 70, 70);
            g.setColor(Color.BLACK);
            g.drawOval(10, 90, 70, 70);
            
        } else if (status == 2) { // yellow light is "on"

            // turn "off" yellow light
            g.setColor(offYellow);
            g.fillOval(10, 90, 70, 70);
            g.setColor(Color.BLACK);
            g.drawOval(10, 90, 70, 70);

            // turn "on" green light

            g.setColor(Color.GREEN);
            g.fillOval(10, 170, 70, 70);
            g.setColor(Color.BLACK);
            g.drawOval(10, 170, 70, 70);

        } else if (status == 3) { // green light is "on"

            // turn "off" green light
            g.setColor(offGreen);
            g.fillOval(10, 170, 70, 70);
            g.setColor(Color.BLACK);
            g.drawOval(10, 170, 70, 70);

            // turn "on" red light

            g.setColor(Color.RED);
            g.fillOval(10, 10, 70, 70);
            g.setColor(Color.BLACK);
            g.drawOval(10, 10, 70, 70);
        }

    }
    @Override

    public void mouseClicked(MouseEvent event) {

        // traffic light is entirely "off"

        if (status == 0) {

            status = 1;

        } else if (status == 1) { // red light is "on"

            status = 2;

        } else if (status == 2) { // yellow light is "on"

            status = 3;

        } else if (status == 3) { // green light is "on"

            status = 1;
        }

        repaint();

    }
    @Override

    public void mouseEntered(MouseEvent event) {

    }
    @Override

    public void mouseExited(MouseEvent event) {

    }
    @Override

    public void mousePressed(MouseEvent event) {

    }

    @Override

    public void mouseReleased(MouseEvent event) {

    }

    public static void main(String[] args) {

        JFrame win = new JFrame("Traffic Light");

        win.setSize(600, 600);
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        win.add(new TrafficLight());
        win.pack();
        win.setVisible(true);
    }
}
