import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase define los métodos básicos de un botón con la funcionalidad
 * de volver a jugar el juego.
 * 
 * @author (Juan Solís y Gabriel Quan)  
 * @version (1.0.0)
 */
public class Volver extends Button
{
    public void act()
    {
        // Al presionar el botón
        click(new MyWorld());
    }
    
    // Botón para volver a jugar
    public Volver(){
        // Instancia y posición del botón
        GreenfootImage botonVolver = new GreenfootImage(450, 400);
        
        // Características del botón
        botonVolver.setFont(new Font(true, false, 50));
        botonVolver.setColor(Color.WHITE);
        botonVolver.drawString("Volver a jugar", 100, 148);
        setImage(botonVolver);
    }
}