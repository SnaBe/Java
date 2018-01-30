//Importe andre klasser i Java
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Simon Snabe Sørensen
 */
public class Window 
{
    //Vores vindue konstruktør
    public Window(int width, int heigth, String title, Game game)
    {
        //Lav en Java JFrame med swing, giv den frame værdien fra vores title værdi.
        JFrame frame = new JFrame(title);
        
        //Størrelsen på vores vindue, bredde og højde
        frame.setPreferredSize(new Dimension(width, heigth)); //Vores foretrukken vindue størrelse
        frame.setMaximumSize(new Dimension(width, heigth)); //Vores maximum vindue størrelse
        frame.setMinimumSize(new Dimension(width, heigth)); //Vores minimum vindue størrelse
        
        //Set vores værdier til vores vindue, synlig, redigerbar osv.
        frame.add(game);
        frame.setResizable(false); //Kan vinduets dimensioner ændres ude fra
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Luk vinduet med default funktionen EXIT_ON_CLOSE
        frame.setLocationRelativeTo(null); //Placer vinduet i midten
        frame.setVisible(true); //Skal vinduet kunne ses
        
    }
}
