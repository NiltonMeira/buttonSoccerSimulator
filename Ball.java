import java.awt.*;
import javax.swing.*;

public class Ball extends JComponent 
{
    private Point position = new Point(1400/2 -1300/2,800/2 - (650/2)-25);;
    private int radius = 20;

    Ball()
    {
        this.position = new Point();
        
    }

    public Point getPosition()
    {
        return position;
    }

    public int getRadius()
    {
        return radius;
    }

    public void setPosition(int posX, int posY)
    {
        this.position = new Point(posX,posY);
    }
    

}




