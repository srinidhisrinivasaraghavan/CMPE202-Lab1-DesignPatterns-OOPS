import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/** 
 * @author SrinidhiS 
 * @version 1.0
 */
public class RandomPicker extends Picker
{
     public void pickRandom() 
    {  
     int choice =0;//Greenfoot.getRandomNumber(3);  
     switch(choice)  
     {  
         case 0:  addBlue();   break;
         case 1:  addRed();    break;
         case 2:  addGreen("Random picker",720,150);  break;        
     }  
    }  

}

