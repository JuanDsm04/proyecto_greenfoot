import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase define los métodos básicos de un botón con la funcionalidad
 * de iniciar el juego para comenzar a jugar.
 * 
 * @author (Juan Solís y Gabriel Quan)  
 * @version (1.0.0)
 */
public class Jugar extends Button
{
    public void act()
    {
        // Al presionar el botón
        click(new MyWorld());
    }
    
    // Botón para jugar
    public Jugar(){
        // Instancia y posición del botón
        GreenfootImage botonJugar = new GreenfootImage(265, 60);
        
        // Características del botón
        botonJugar.setFont(new Font(true, false, 50));
        botonJugar.setColor(Color.WHITE);
        botonJugar.drawString("Jugar", 0, 40);
        setImage(botonJugar);
    }
}
