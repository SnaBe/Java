
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simon
 */
public class Character extends GameObject 
{
    Handler handler;
    
    public Character(int x, int y, ID id, Handler handler) 
    {
        super(x, y, id);
        this.handler = handler;
    }

    public void tick() 
    {
        x += velX;
        y += velY;
        
        //Vi flytter vores karakter, på bagrund af hvilket knapper vi trypper på
        if(handler.isUp()) velY = -5;
        else if(!handler.isDown()) velY = 0;
        
        if(handler.isDown()) velY = 5;
        else if(!handler.isUp()) velY = 0;
        
        if(handler.isRight()) velX = 5;
        else if(!handler.isLeft()) velX =  0;

        if(handler.isLeft()) velX = -5;
        else if(!handler.isRight()) velX =  0;
    }

    public void render(Graphics g) 
    {
        //Tegn vores spiller på vores vindue
        g.setColor(Color.ORANGE);
        g.fillRect(x,y,32,48);
    }

    public Rectangle getBounds() 
    {
        //Bruges til at chekce for modstander eller skade
        return new Rectangle(x,y,32,48);
    }   
}
