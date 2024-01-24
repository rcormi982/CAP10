/**
* Escribe un programa que ordene 10 números enteros introducidos por
* teclado y almacenados en un objeto de la clase ArrayList.
*/

import java.util.ArrayList;
import java.util.Collections;

public class EJ03 {
    public static void main(String[] args) {
        ArrayList<Integer> ordenar = new ArrayList<Integer>();
        System.out.println("Introduce 10 números enteros: ");

        for (int i = 0; i < 10; i++) {
            ordenar.add(Integer.parseInt(System.console().readLine()));
        }

        System.out.println("Lista original: " + ordenar);

        Collections.sort(ordenar);

        System.out.println("Lista ordenada de menor a mayor: " + ordenar);

        //Lista ordenada de mayor a menor
        ArrayList<Integer> b = new ArrayList<Integer>();

        for (int n : ordenar) {
            b.add(0, n);
        }
        System.out.println("Lista ordenada de mayor a menor " + b);
    }
}
