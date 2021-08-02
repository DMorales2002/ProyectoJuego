import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vidas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vidas extends Actor
{
    /**
     * Act - do whatever the vidas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int cont =1;
    public void act()
    {
        setImage(new GreenfootImage("Vidas: "+ cont,24, Color.BLACK, Color.WHITE)); 
    }
    public void addvidas()
    {
        cont++;
    }
    public void deletevidas()
    {
        cont--;
    }
    public int getCont(){
        return cont;
    }
}
