import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
/**
 * Write a description of class Puntos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puntos extends Actor
{
    /**
     * Act - do whatever the Puntos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score =0;
    public void act()
    {
        setImage(new GreenfootImage("Goles: "+ score,24, Color.BLACK, Color.WHITE));    
    }
    public void addScore()
    {
        score++;
    }
    public int getScore(){
        return score;
    }
}
