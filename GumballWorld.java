import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class GumballWorld here.
 * 
 * @author srinidhis
 * @version (a version number or a date)
 */
public class GumballWorld extends World
{
 GumballMachine gumballmachine = new GumballMachine();
 Inspector inspector = new Inspector();
 RandomPicker randompicker = new RandomPicker();
 GreenPicker greenpicker = new GreenPicker();
 public GumballWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
 private void prepare()
    {
        
        addObject(gumballmachine, 367, 237);
        addObject( new Penny(), 57, 71 ) ;
        addObject( new Quarter(), 68, 156 ) ;
        addObject( new FakeQuarter(), 66, 248 ) ;
        
        addObject(inspector, 533, 291);
        
        addObject(randompicker, 643, 104);
        randompicker.setLocation(655, 94);
        
        addObject(greenpicker, 686, 454);
        greenpicker.setLocation(669, 456);
      }
}