/**
* Crea un ArrayList con los nombres de 6 compañeros de clase. A
* continuación, muestra esos nombres por pantalla. Utiliza para
* ello un bucle for que recorra todo el ArrayList sin usar ningún
* índice.
 */
import java.util.ArrayList;

public class EJ01{
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();

        nombres.add("Sergio");
        nombres.add("Juan Carlos");
        nombres.add("Eva");
        nombres.add("Jorge");
        nombres.add("Nico");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
    }
}