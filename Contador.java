import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase de contador enfocada para mostrar los datos de nivel y puntaje
 * que el usuario va obteniendo en el juego.
 * 
 * @author (Juan Solís y Gabriel Quan) 
 * @version (1.0.0)
 */
public class Contador extends Actor
{
    private int valor = 0;
    private int card = 0;
    private String texto;
    private int longitudTexto;

    public Contador(){
        this("");
    }
    
    public Contador(String prefix)
    {
        texto = prefix;
        longitudTexto = (texto.length() + 1) * 15;

        setImage(new GreenfootImage(longitudTexto, 20));
        GreenfootImage image = getImage();

        Font font = image.getFont();
        image.setFont(new Font("OptimusPrinceps", false, false , 20));
        image.setColor(Color.WHITE);
        
        actualizarContador();
    }

    public void act() {

        if(valor < card) {
            valor++;
            actualizarContador();
        }

        else if(valor > card) {
            valor--;
            actualizarContador();
        }

    }

    private void actualizarContador(){
        GreenfootImage imagen = getImage();
        imagen.clear();
        imagen.drawString(texto + valor, 1, 18);
    }
    
    public void add(int puntos){
        card += puntos;
    }

    public void subtract(int puntos){
        card -= puntos;
    }

    public int getValue(){
        return valor;
    }

}