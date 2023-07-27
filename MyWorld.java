import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase define las funcionalidades del jugador (pez), tiburones,
 * puntajes y niveles dentro del juego.
 * 
 * @author (Juan Solís y Gabriel Quan) 
 * @version (1.0.0)
 */
public class MyWorld extends World
{
    // Inicializar variables
    private contador puntaje;
    private contador nivel;
    private pez jugador;
    
    private int tiburones_superados;
    private int velocidad_pez;
    private int cantidad_tiburones;
    private int tiburones_superados_nivel;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Tamaño del mundo
        super(689, 638, 1);
        
        // Valores iniciales del juego
        tiburones_superados = 0;
        tiburones_superados_nivel = 4;
        velocidad_pez = 2;
        
        // Contadores
        puntaje = new contador("Puntos: ");
        nivel = new contador("Nivel: ");
        
        // Agregar nivel inicial (1)
        nivel.add(1);
        
        // Pez jugador con la velocidad inicial 
        jugador = new pez(velocidad_pez+6);
        
        // Agregar al jugador y los contadores en el mundo
        addObject(jugador, 440, 550);
        addObject(nivel, 90, 40);
        addObject(puntaje, 98, 80);
        
    }
    
    public void musica_fondo(){
        
    }
    
    // Comportamientos del jugador y contadores
    public void act(){
        aumentar_dificultad();
        agregar_tiburones();
    }
    
    // Aumentar la puntuación del jugador
    public void incremento_puntuacion(int valor){
        puntaje.add(valor);
    }
    
    // Aumentar el numero de tiburones superados
    public void aumentar_numero_superados(){
        tiburones_superados++;
    }
    
    // Disminuir el numero de los tiburones
    public void disminuir_numero_tiburones(){
        cantidad_tiburones--;
    }
    
    // Generar números aleatorios
    public int getNumeroRandom(int start,int end){
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    
    // Agregar nuevo tiburones por cada nivel
    public void agregar_tiburones(){
        // Si aun no hay tiburones
        if (cantidad_tiburones == 0){
            
            // Agregarlos aleatoriamente en las tres corrientes de agua
            int corriente_agua = getNumeroRandom (0, 3);
            
            // Agregar el primer tiburon en una corriente random
            if(corriente_agua == 0){
                // Agregar al tiburon con la misma velocidad del jugador
                addObject(new tiburon(velocidad_pez), 175, 80);
                
            }else if (corriente_agua == 1){
                addObject(new tiburon(velocidad_pez), 355, 80);
                
            }else{
                addObject(new tiburon(velocidad_pez), 520, 80);
                
            }
            
            // Agregar al segundo tiburon en una corriente diferente al primero
            corriente_agua++;
            corriente_agua = corriente_agua % 3;
            
            if(corriente_agua == 0){
                // Agregar al tiburon con la misma velocidad del jugador
                addObject(new tiburon(velocidad_pez), 175, 80);
                
            }else if (corriente_agua == 1){
                addObject(new tiburon(velocidad_pez), 355, 80);
                
            }else{
                addObject(new tiburon(velocidad_pez), 520, 80);
                
            }
            
            // Ahora la cantidad de tiburones es 2
            cantidad_tiburones = 2;
        }
        
    }
    
    // Aumentar la dificultad del juego
    public void aumentar_dificultad(){
        if(tiburones_superados == tiburones_superados_nivel){
            
            // Reinicio de tiburones superados por nivel
            tiburones_superados = 0;
            
            // Cantidad tiburones superados para aumentar nivel
            tiburones_superados_nivel = tiburones_superados_nivel + 2;
            
            // Aumenta la velocidad del pez y el nivel aumenta en uno
            velocidad_pez++;
            nivel.add(1);
            Greenfoot.playSound("nuevo_nivel.wav");
            
            jugador.aumentar_velocidad();
            
        }
    }
}
