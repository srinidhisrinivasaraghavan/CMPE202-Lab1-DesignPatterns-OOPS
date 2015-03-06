import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/** 
 * @author SrinidhiS 
 * @version 1.0
 */
public class Inspector extends Alien
{
    public void inspect(String coin)
    {
  
        if(coin=="Quarter")
        {
              getWorld().addObject(new Message("Inspector:\ngood you inserted\n a quarter"),655,310);//655,310
              Greenfoot.delay(40);
              pickAlien();
        }
        else if(coin=="Penny")
        {
             getWorld().addObject(new Message("Inspector:\nU have inserted\n a Penny"),655,310); 
        }
        else if(coin=="FakeQuarter")
        {
            getWorld().addObject(new Message("Inspector:\nU have inserted a\n fake Quarter"),655,310);
        }
    }
    public void pickAlien()
    {
        int choice=0;//Greenfoot.getRandomNumber(2);
        if(choice==1)
        {
            RandomPicker random=new RandomPicker();
            getWorld().addObject(random,655,94);
            random.pickRandom();
        }
        else
        {   GreenPicker green=new GreenPicker();
            getWorld().addObject(green,669,456);
            green.pickGreen();
        }
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
