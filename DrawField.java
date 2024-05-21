import javax.swing.JPanel;
import java.awt.*;


public class DrawField extends JPanel {
    private int widthFrame = 1400;
    private int heightFrame = 800;
    private int witdhField = 1300;
    private int heightField = 650;
    private Ball ball = new Ball();

    private Point startPoint = new Point(widthFrame/2 -witdhField/2,heightFrame/2 - (heightField/2)-25);;

    public void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        float thickness = 5.0f;

        g2d.setStroke(new BasicStroke(thickness));

        g.setColor(new Color(27,65, 25));
        g.fillRect((int)(startPoint.getX()), (int)(startPoint.getY()), 1300,650 ); // Draw on g here e.g.
        
        g2d.setColor(new Color(255,255,255));
        g2d.drawRect((int)(startPoint.getX()), (int)(startPoint.getY() + 175), 150, 300);
        g2d.drawRect((int)(startPoint.getX()) + (witdhField-150), (int)(startPoint.getY() + 175), 150, 300);
        g2d.drawLine((int)((startPoint.getX()+witdhField/2)), (int)(startPoint.getY()), (int)(startPoint.getX()+witdhField/2), (int)(startPoint.getY()+heightField));
        
        int radius = 250;
        int radius2 = 30    ;
        g2d.drawOval((int)(startPoint.getX() + witdhField/2 - radius/2), (int)(startPoint.getY() + heightField/2 - radius/2), radius, radius);
        g2d.fillOval((int)(startPoint.getX() + witdhField/2 - radius2/2), (int)(startPoint.getY() + heightField/2 - radius2/2), radius2, radius2);
        
        g.setColor(new Color(255,0, 0));
        g2d.fillRect((int)(startPoint.getX())+3, (int)(startPoint.getY() + 275), 10, 100);
        g2d.fillRect((int)(startPoint.getX())+1300-13, (int)(startPoint.getY() + 275), 10, 100);

        g2d.setColor(new Color(0,0,255));
        g2d.fillOval((int)(startPoint.getX() + witdhField/2 - ball.getRadius()/2), (int)(startPoint.getY() + heightField/2 - ball.getRadius()/2), ball.getRadius(), ball.getRadius());
        
    }
    
}
