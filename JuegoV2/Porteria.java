import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Porteria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Porteria extends Actor
{
    /**
     * Act - do whatever the Porteria wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Porteria (){
        GreenfootImage tporteria = getImage();
        int nuevoAlto = (int)tporteria.getHeight()/6;
        int nuevoAncho = (int)tporteria.getWidth()/6;
        tporteria.scale(nuevoAncho, nuevoAlto);
    }
    public void act()
    {
        // Add your action code here.
    }
}
