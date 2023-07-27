import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase define las funcionalidades del jugador (pez), como lo son 
 * su velocidad, su jugabilidad y su movilidad dentro del juego.
 * 
 * @author (Juan Solís y Gabriel Quan) 
 * @version (1.0.0)
 */
public class pez extends Actor
{
    // Controlar la velocidad del jugador
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
        // Direcciones hacias las que se puede mover el jugador
        
        // Derecha
        if(Greenfoot.isKeyDown("right")){
            if(getX() < 525){
                setLocation(getX() + velocidad, getY());
            }
        }
        
        // Izquierda
        if(Greenfoot.isKeyDown("left")){
            if(getX() > 180){
                setLocation(getX() - velocidad, getY());
            }
        }
        
        checkMordida();
    }
    
    // Si un tiburon se lo come
    public void checkMordida(){
        Actor mordida = getOneIntersectingObject(tiburon.class);
        
        if(mordida != null){
            getWorld().removeObject(mordida);
            getWorld().removeObject(this);
            Greenfoot.playSound("mordida.wav");
            Greenfoot.stop();
        }
    }
    
    // Aumentar la velocidad del jugador (pez)
    public void aumentar_velocidad(){
        velocidad++;
        
    }
}
