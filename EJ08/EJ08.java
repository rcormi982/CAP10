/*Realiza un programa que escoja al azar 10 cartas de la baraja
* española (10 objetos de la clase <code>Carta</code>). Emplea un
* objeto de la clase <code>ArrayList</code> para almacenarlas y
* asegúrate de que no se repite ninguna. */
package EJ08;

import java.util.ArrayList;

import EJ08.carta.Carta;

public class EJ08 {
    public static void main(String[] args) {
        ArrayList<Carta> cartas = new ArrayList<Carta>();

        Carta cartaAux = new Carta();

        cartas.add(cartaAux);
        for (int i = 0; i < 9; i++) {
            do {
                cartaAux = new Carta();
            } while (cartas.contains(cartaAux));
            
            cartas.add(cartaAux);
        }
        for (Carta ca : cartas) {
            System.out.println(ca);
        }
    }
}
