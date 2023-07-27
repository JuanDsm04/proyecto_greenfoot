import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase define las funcionalidades que tendra el menú de inicio cuando
 * el jugador comience el juego.
 * 
 * @author (Juan Solís y Gabriel Quan) 
 * @version (1.0.0)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Tamaño del mundo
        super(687, 638, 1);
        
        comenzarJuego();
    }
    
    private void comenzarJuego(){
        Jugar jugar = new Jugar();
        addObject(jugar,400 ,450);
    }
}
