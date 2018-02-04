//Importer vores Java klasser
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
/**
 *
 * @author Simon Snabe Sørensen
 */
public class Game extends Canvas implements Runnable 
{
    //Private variabler
    private boolean isRunning = false;
    private Thread thread;
    private Handler handler;
    
    //Vores spil konstruktør
    public Game()
    {
        //Lav et nyt vindue med givne værdier.
        Window Window = new Window(1000, 563, "Top Down Shooter", this);
        //Kør vores start metode.
        start();
        
        handler = new Handler();
        this.addKeyListener(new KeyInput(handler));
        
        handler.addObject(new Character(100,100,ID.Player,handler));
    }
    //Start metode
    private void start()
    {
        isRunning = true;
        thread = new Thread(this); //This, kalder vores run metode
        thread.start(); //Start vores thread
    }
    //Stop metode
    private void stop()
    {
        isRunning = false;
        try 
        {
            thread.join();
        } 
        catch (Exception e) 
        {
            System.out.println("ERROR" + e);
        }
    }
    //Run metode
    public void run() {
        //Credit til run metode, Markus Persson
        this.requestFocus();
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while(isRunning) {
            long now = System.nanoTime();
            delta += (now -lastTime) / ns;
            lastTime = now;
            while(delta >= 1) {
                tick();
                //Updates++
                delta--;
            }
            render();
            frames++;
            
            if(System.currentTimeMillis() -timer > 1000) {
                timer += 1000;
                frames = 0;
                
            }
        }
        stop();
    }
    
    //Vi bruger vores tick metode til at updatere vores spil.
    //Checker 60 gange i sekundet.
    private void tick() 
    {
      handler.tick();
    }     
    
    //Vi bruger vores render metode til at 'reander' alt vores grafik osv.
    //Checker flere tusind gange i sekundet.
    public void render() 
    {
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null)
        {
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();
        //Efter denne kommentar kan vi 'tegne' alt vores grafik.
        
        g.setColor(Color.darkGray); //Vores baggrunds farve.
        g.fillRect(0,0,1000,563); //Hvor meget af vores vindue skal fyldes.
        
        handler.render(g);
        
        //Efter denne kommentar kan vi ikke længere 'tegne' noget grafisk.
        g.dispose(); 
        bs.show();
    }
    //Vores main metode, starter vores spil (Game)
    public static void main(String args[]) 
    {
        //Når filen køres, start vores spil
        new Game();
    }
}

