import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase define las funcionalidades que tendra el menú que se mostrará
 * al momento de que el jugador pierda en el juego, permitiendole volver a
 * jugar.
 * 
 * @author (Juan Solís y Gabriel Quan) 
 * @version (1.0.0)
 */
public class MenuFin extends World
{

    /**
     * Constructor for objects of class MenuFin.
     * 
     */
    public MenuFin()
    {    
        // Tamaño del mundo
        super(687, 638, 1);
        volverJugar();
    }
    
    private void volverJugar(){
        Volver volver = new Volver();
        addObject(volver,400 ,450);
    }
}
