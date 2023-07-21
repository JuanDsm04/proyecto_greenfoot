import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase contiene los metodos de los enemigos del juego (tiburones)
 * 
 * @author (Juan Solis y Gabriel Quan) 
 * @version (1.0.0)
 */
public class tiburon extends Actor
{
    private int velocidad;
    
    // Velocidad de los tiburones
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
        
        if (getY() >= getWorld().getHeight()-1){
            MyWorld game = (MyWorld) getWorld();
            game.removeObject(this);
            
            // Al desaparecer tiburones (es decir que pudo esquivarlos)
            game.incremento_puntuacion(1); // Aumenta la puntuación
            game.disminuir_numero_tiburones();
            game.aumentar_numero_superados();
        
        }
    }
}
