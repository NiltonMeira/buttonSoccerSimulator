import javax.swing.JFrame;


public class Field extends JFrame {

    Field() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(1400, 800);

        DrawField drawField = new DrawField();
        this.add(drawField);



    }

    

}
