import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase define las funcionalidades del jugador (pez), como lo son 
 * su velocidad, su jugabilidad y su movilidad dentro del juego.
 * 
 * @author (Juan Solís y Gabriel Quan) 
 * @version (a version number or a date)
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
            if(getX() < 650){
                setLocation(getX() + velocidad, getY());
            }
        }
        
        // Izquierda
        if(Greenfoot.isKeyDown("left")){
            if(getX() > 200){
                setLocation(getX() - velocidad, getY());
            }
        }
        
        // Arriba
        if(Greenfoot.isKeyDown("up")){
            if(getY() > 150){
                setLocation(getX(), getY() - velocidad);
            }
        }
        
        // Abajo
        if(Greenfoot.isKeyDown("down")){
            if(getY() < 550){
                setLocation(getX(), getY() + velocidad);
            }
        }
    }
    
    // Si un tiburon se lo come
    public void checkMordida(){
        Actor mordida = getOneIntersectingObject(tiburon.class);
        
        if(mordida != null){
            getWorld().removeObject(mordida);
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
    
    // Aumentar la velocidad del jugador (pez)
    public void aumentar_velocidad(){
        velocidad++;
    }
}
