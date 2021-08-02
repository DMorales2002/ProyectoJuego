import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Puntaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puntaje extends Actor
{
    /**
     * Act - do whatever the Puntaje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score;
    public void act()
    {
        
    }
    public void puntaje(int paso){
        score = paso;
        setImage(new GreenfootImage("Puntaje: "+ score,24, Color.BLUE, Color.BLACK));
    }
}
