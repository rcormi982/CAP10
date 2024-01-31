/*Modifica el programa anterior de tal forma que las cartas se
* muestren ordenadas. Primero se ordenarán por palo: bastos,
* copas, espadas, oros. Cuando coincida el palo, se ordenará por
* número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
* */
package EJ09;

import java.util.ArrayList;
import java.util.Collections;

import EJ09.carta.Carta;

public class EJ09 {
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
        Collections.sort(cartas);
        for (Carta ca : cartas) {
            System.out.println(ca);
        }
    }
}
