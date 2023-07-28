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
    public GreenfootSound musica_fondo = new GreenfootSound("musica_fondo.mp3");
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Tamaño del mundo
        super(687, 638, 1);
        
        comenzarJuego();
        musica();
    }
    
    private void comenzarJuego(){
        Jugar jugar = new Jugar();
        addObject(jugar,400 ,450);
    }
    
    public void musica(){
        musica_fondo.playLoop();
        musica_fondo.setVolume(45);
    }
}
