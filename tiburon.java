import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tiburon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tiburon extends Actor
{
    private int velocidad;
    
    public tiburon(int v){
        velocidad = v;
    }
    
    /**
     * Act - do whatever the tiburon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() + velocidad);
        
        if (getY() > getWorld().getHeight() ){
            MyWorld game = (MyWorld) getWorld();
            game.removeObject(this);
        }
    }
}
