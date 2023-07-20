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
    
    private int velocidad_pez;
    private int tiburones_superados;
    private int tiburones_superados_nivel;
    private pez jugador;
    private int cantidad_tiburones;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Tamaño del mundo
        super(855, 638, 1);
        
        // Valores iniciales del juego
        tiburones_superados = 0;
        tiburones_superados_nivel = 0;
        velocidad_pez = 2;
        
        // Contadores
        puntaje = new contador("Puntos: ");
        nivel = new contador("Nivel: ");
        
        // Agregar nivel inicial (1)
        nivel.add(1);
        
        // Pez jugador con la velocidad inicial 
        jugador = new pez(velocidad_pez);
        
        // Agregar al jugador y los contadores en el mundo
        addObject(jugador, 440, 550);
        addObject(nivel, 90, 40);
        addObject(puntaje, 100, 80);
        
    }
    
    // Comportamientos del jugador y contadores
    public void act(){
        aumentar_dificultad();
        //agregar_tiburones();
    }
    
    // Generar números aleatorios
    public int getNumeroRandom(int start,int end){
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    
    // Aumentar la puntuación del jugador
    public void incremento_puntuacion(int valor){
        puntaje.add(valor);
    }
    
    // Aumentar el numero de tiburones superados
    public void aumentar_numero_superados(){
        tiburones_superados_nivel++;
    }
    
    // Disminuir el numero de los tiburones
    public void disminuir_numero_tiburones(){
        cantidad_tiburones--;
    }
    
    public void aumentar_dificultad(){
        if(tiburones_superados == tiburones_superados_nivel){
            
            // Reinicio de tiburones superados por nivel
            tiburones_superados = 0;
            
            // Cantidad tiburones superados para aumentar nivel
            tiburones_superados_nivel = tiburones_superados + 2;
            
            // Aumenta la velocidad del pez y el nivel aumenta en uno
            velocidad_pez++;
            nivel.add(1);
            
            jugador.aumentar_velocidad();
        }
    }
}
