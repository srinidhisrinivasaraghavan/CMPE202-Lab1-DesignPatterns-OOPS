import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/** Message class has a constructor and when this message class is called from other classes,
 * it displays an appropriate message that is received in the string msg
 * @author SrinidhiS 
 * @version 1.0
 */
public class Message extends Actor
{
    public Message(String msg)
    {       GreenfootImage gi;
            gi = new GreenfootImage(msg,30,java.awt.Color.BLACK ,java.awt.Color.YELLOW );//java.lang.String string, int size, java.awt.Color foreground, java.awt.Color background//120,70
           // gi.setFont(20);
           // gi.setColor( java.awt.Color.YELLOW ) ;
            //gi.fill() ;
            //gi.setColor( java.awt.Color.BLACK ) ;
           // gi.drawString( msg, 0, 50 );
            setImage(gi);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}