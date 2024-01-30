import java.util.ArrayList;
import java.util.Collections;

/**
* Realiza un programa equivalente al anterior pero en esta ocasión,
* el programa debe ordenar palabras en lugar de números.
*/
public class EJ04 {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<String>();

        System.out.println("Introduce 10 palabras: ");

        for (int i = 0; i < 10; i++) {
            palabras.add(System.console().readLine());
        }

        System.out.println("Lista: " + palabras);
        Collections.sort(palabras);
        System.out.println("Palabras ordenadas alfabeticamente: " + palabras);
    }
}
