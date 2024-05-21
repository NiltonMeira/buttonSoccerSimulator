import java.awt.*;
import javax.swing.*;

public class Ball extends JComponent 
{
    private Point position;
    private int radius = 20;

    Ball()
    {
        this.position = new Point();
        
    }

    public Point getPosition()
    {
        return position;
    }
    

}




