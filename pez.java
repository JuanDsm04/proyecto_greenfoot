import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pez here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pez extends Actor
{
    private int velocidad;
    
    public pez(int rapidez){
        velocidad = rapidez;
    }
    
    /**
     * Act - do whatever the pez wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("right")){
            if(getX() < 650){
                setLocation(getX() + velocidad, getY());
            }
        }
        
        if(Greenfoot.isKeyDown("left")){
            if(getX() > 200){
                setLocation(getX() - velocidad, getY());
            }
        }
        
        if(Greenfoot.isKeyDown("up")){
            if(getY() > 150){
                setLocation(getX(), getY() - velocidad);
            }
        }
        
        if(Greenfoot.isKeyDown("down")){
            if(getY() < 550){
                setLocation(getX(), getY() + velocidad);
            }
        }
    }
    
    public void checkMordida(){
        Actor mordida = getOneIntersectingObject(tiburon.class);
        
        if(mordida != null){
            getWorld().removeObject(mordida);
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
}
