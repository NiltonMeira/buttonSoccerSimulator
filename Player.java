import java.awt.Color;
import java.awt.Point;

public class Player {

    private int radius = 40;
    private Point position;
    private Color color;

    public Player(int posX, int posY, Color color)
   {   
        this.position = new Point(posX,posY);
        this.color = color;
   }

   public Point getPosition()
   {
        return position;
   }

   public void setPosition(int posX,int poxy)
   {
        this.position = new Point(posX,poxy);
   }
}
