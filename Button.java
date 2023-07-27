import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase define las funcionalidades (métodos) básicos de un botón dentro 
 * del juego.
 * 
 * @author (Juan Solís y Gabriel Quan)
 * @version (1.0.0)
 */
public class Button extends Actor
{
    // Trasladar a la pantalla del juego si se presiona el botón
    public void click(World oceano){
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld (oceano);
        }
    }
}
