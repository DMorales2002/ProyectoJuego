import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Puntos points = new Puntos();
    vidas vida =new vidas();
    Puntaje puntaje = new Puntaje();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(742, 444, 1); 
        prepare();
        boolean bandera= true;
            while (bandera){
                int x=Greenfoot.getRandomNumber(720);
                int y=Greenfoot.getRandomNumber(410);
                    if (x>=20 && y>=20)
                    {
                        addObject(new Porteria(), x, y);
                        bandera=false;
                    }
                }
         
    
    }    
    public Puntos getPuntos()
    {
        return points;         
    }
    public vidas getVidas(){
        return vida;
    }
    public Puntaje getPuntaje(){
        return puntaje;
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(points, 40,15);
        addObject(vida, 690,15);
        Pelota pelota = new Pelota();
        addObject(pelota,384,225);
        pelota.setLocation(368,224);
        Porteria porteria = new Porteria();
        addObject(porteria,391,116);
        porteria.setLocation(636,170);
        removeObject(porteria);
        addObject(porteria,665,207);
        porteria.setLocation(637,75);
        pelota.setLocation(380,215);
        pelota.setLocation(370,222);
        Puntos puntos = new Puntos();
        addObject(puntos,38,22);
        removeObject(puntos);
        removeObject(porteria);
        
        
    }
}
