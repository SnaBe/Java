
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simon
 */
public class KeyInput extends KeyAdapter 
{
    //Vi laver ikke en ny handler, da vi ønsker at beholde vores GameObject liste, ikke lave en ny.
    Handler handler;
    
    public KeyInput(Handler handler)
    {
        this.handler = handler;
    }
    
    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();
        
        for(int i = 0; i < handler.object.size(); i++)
        {
            GameObject tempObject = handler.object.get(i);
            
            if(tempObject.getID() == ID.Player)
            {
                if(key == KeyEvent.VK_W) handler.setUp(true);
                if(key == KeyEvent.VK_S) handler.setDown(true);
                if(key == KeyEvent.VK_D) handler.setRight(true);
                if(key == KeyEvent.VK_A) handler.setLeft(true);
            }
        }
    }
    
    public void keyReleased(KeyEvent e)
    {
        int key = e.getKeyCode();
        
        for(int i = 0; i < handler.object.size(); i++)
        {
            GameObject tempObject = handler.object.get(i);
            
            if(tempObject.getID() == ID.Player)
            {
                if(key == KeyEvent.VK_W) handler.setUp(false);
                if(key == KeyEvent.VK_S) handler.setDown(false);
                if(key == KeyEvent.VK_D) handler.setRight(false);
                if(key == KeyEvent.VK_A) handler.setLeft(false);
            }
        }
    }
}
