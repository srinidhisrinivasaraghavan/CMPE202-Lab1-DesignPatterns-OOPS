import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/** 
 * @author SrinidhiS 
 * @version 1.0
 */
public class Picker extends Alien
{
     void addRed()
    {
        RedGumball rg=new RedGumball();
        getWorld().addObject(rg,365,380);
        getWorld().addObject(new Message("Random picker:\npicked red \ngumball!"),720,150);//750,150
    }
     void addBlue()
    {
         BlueGumball bg = new BlueGumball();  
         getWorld().addObject(bg, 365, 380);
         getWorld().addObject(new Message("Random picker:\npicked blue\n gumball!"),720,150);
    }
     public  void addGreen(String name,int x,int y)
    {
        GreenGumball gg=new GreenGumball();
         getWorld().addObject(gg,365,380);
         getWorld().addObject(new Message(name+"\npicked green\n gumball!"),x,y);
    }
   
}
