import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pelota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelota extends Actor
{
    /**
     * Act - do whatever the Pelota wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pelota (){
        GreenfootImage tpelota = getImage();
        int nuevoAlto = (int)tpelota.getHeight()/10;
        int nuevoAncho = (int)tpelota.getWidth()/10;
        tpelota.scale(nuevoAncho, nuevoAlto);
    }
    public void act()
    {
        mover();
        gol();
    }
    public void mover(){
        int avanzar =5;
        if(Greenfoot.isKeyDown("Right"))
        {
            Greenfoot.start();
            setRotation(0);
            move(avanzar);
        }
        if(Greenfoot.isKeyDown("Left"))
        {
            Greenfoot.start();
            setRotation(180);
            move(avanzar);
        }
        if(Greenfoot.isKeyDown("Down"))
        {
            Greenfoot.start();
            setRotation(90);
            move(avanzar);
        }
        if(Greenfoot.isKeyDown("Up"))
        {
            Greenfoot.start();
            setRotation(270);
            move(avanzar);
        }
    }
    public void gol(){
        Actor porteria;
        porteria = getOneObjectAtOffset(0,0, Porteria.class);
        if(porteria != null){
            World world = getWorld();
            world.removeObject(porteria);
            MyWorld mundo = (MyWorld)world;
            Puntos puntos = mundo.getPuntos();
            puntos.addScore();
            
            //poner sonido de gol
            int goles = puntos.getScore();
            boolean bandera= true;
            while (bandera){
                int x=Greenfoot.getRandomNumber(720);
                int y=Greenfoot.getRandomNumber(410);
                    if (x>=20 && y>=20)
                    {
                        getWorld().addObject(new Porteria(), x, y);
                        bandera=false;
                    }
                }                  
            if (goles%5 == 0)
            {
                int x2=Greenfoot.getRandomNumber(720);
                int y2=Greenfoot.getRandomNumber(410);
                getWorld().addObject(new Portero(),x2,y2);    
            }
            
            }            
        }
    }

