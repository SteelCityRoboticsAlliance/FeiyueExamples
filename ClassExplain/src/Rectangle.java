import javax.swing.*;
import java.awt.*;

/**
 * This program demonstrates how to rectangles using Graphics2D object.
 * @author www.codejava.net
 *
 */
public class Rectangle extends JFrame {
    private Color m_color;
    private double m_width;
    private double m_height;

    public Rectangle(double width, double height, Color color) {
        super("Rectangles Drawing Demo");

        m_width = width;
        m_height = height;
        m_color = color;

        getContentPane().setBackground(Color.WHITE);
        setSize(480, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setVisible(true);
    }

    void drawRectangles(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // code to draw rectangles goes here...
        g2d.setColor(m_color);
        g2d.setStroke(new BasicStroke(6.0F));
        g2d.drawRect(60, 60, (int) m_width, (int) m_height);

    }

    public void paint(Graphics g) {
        super.paint(g);
        drawRectangles(g);
    }

    public static void main(String[] args) {
        new Rectangle(300, 60, Color.GREEN);
    }
}
