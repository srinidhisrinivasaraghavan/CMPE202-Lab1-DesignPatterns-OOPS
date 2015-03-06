import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/** 
 * @author SrinidhiS
 * @version 1.0
 */
public class GumballMachine extends Actor
{
    public String coin_class=new String();
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }
    public void act() 
    {
        Actor coin;
        Actor haveCoin;
        coin = getOneObjectAtOffset(0, 0,Coin.class );
            if ( coin != null )
           {
            World world = getWorld() ;
            getWorld().addObject(new Message("Have coin!"),367,180);//msg.ImageLabel();
            Greenfoot.delay(100);
            coin_class=coin.getClass().getName(); 
            world.removeObject(coin) ;
         }
         if(Greenfoot.mousePressed(this))
               {
                 getWorld().addObject(new Message("Crank turned!"),367,180);
                 Inspector ins=new Inspector();
                 getWorld().addObject(ins,533,291);
                 if(coin_class!=null)
                 {
                   ins.inspect(coin_class);
                }
           }
        }
    }    
   
