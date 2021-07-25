import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portero extends Actor
{
    /**
     * Act - do whatever the Portero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Portero (){
        GreenfootImage tportero = getImage();
        int nuevoAlto = (int)tportero.getHeight()/17;
        int nuevoAncho = (int)tportero.getWidth()/17;
        tportero.scale(nuevoAncho, nuevoAlto);
    }
    public void act()
    {
        // Add your action code here.
        mover();
        perder();
    }
    public void mover(){
        move(3);
        if (Greenfoot.getRandomNumber(10)<1)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        if (isAtEdge()){
            turn(180);
        }
        
    }
    public void perder(){
        Actor pelota;
        pelota = getOneObjectAtOffset(0,0, Pelota.class);
        if(pelota != null){
            World world = getWorld();
            world.removeObject(pelota);
            MyWorld mundo = (MyWorld)world;
            int x = 742/2;
            int y = 444/2;
            //getWorld().addObject(new Pelota(), x, y);
        }
    }
}
