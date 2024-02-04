package EJ12;
/*Escribe un programa que genere una secuencia de 5 cartas de la
* baraja española y que sume los puntos según el juego de la
* brisca. El valor de las cartas se debe guardar en una estructura
* <code>HashMap</code> que debe contener parejas (figura, valor),
* por ejemplo ("caballo", 3).
* <p>
* La secuencia de cartas debe ser una estructura de la clase <code>
* ArrayList</code> que contiene objetos de la clase <code>Carta
* </code>. El valor de las cartas es el siguiente: as ￿ 11, tres ￿
* 10, sota ￿ 2, caballo ￿ 3, rey ￿ 4; el resto de cartas no vale
* nada.
* <p>
* <code>
* <pre>
* Ejemplo:
* as de oros
* cinco de bastos
* caballo de espadas
* sota de copas
* tres de oros
* Tienes 26 puntos */

import java.util.ArrayList;
import java.util.HashMap;

import EJ12.carta.Carta;

public class EJ12 {
    public static void main(String[] args) {
        ArrayList<Carta> baraja = new ArrayList<Carta>();
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        int puntos = 0;

        h.put("as", 11);
        h.put("dos", 2);
        h.put("tres", 10);
        h.put("cuatro", 0);
        h.put("cinco", 0);
        h.put("seis", 0);
        h.put("siete", 7);
        h.put("sota", 2);
        h.put("caballo", 3);
        h.put("rey", 4);

        Carta cartaAux = new Carta();

        baraja.add(cartaAux);

        for (int i = 0; i < 5; i++) {
            do {
                cartaAux = new Carta();
            } while (baraja.contains(cartaAux));
            baraja.add(cartaAux);
        }
        for (Carta miCarta : baraja) {
            System.out.println(miCarta);
            puntos += h.get(miCarta.getFigura());
        }
        System.out.println("Tienes " + puntos + " puntos.");
    }  
}
