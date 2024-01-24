/**
* Realiza un programa que introduzca valores aleatorios (entre 0 y
* 100) en un ArrayList y que luego calcule la suma, la media, el
* máximo y el mínimo de esos números. El tamaño de la lista también
* será aleatorio y podrá oscilar entre 10 y 20 elementos ambos
* inclusive.
*
*/
import java.util.ArrayList;

public class EJ02 {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<Integer>();
        int sum = 0;
        int min = 0;
        int max = 100;
        int size = (int)(10+Math.random()*11);

        for (int i = 0; i < size; i++) {
            n.add((int)(Math.random()*101));
        }

        System.out.println("Lista: " + n);

        /*for (int i = 0; i < n.size(); i++) {
            int numero = n.get(i);
            sum += numero;
        }*/
        for (int numero : n) {
            sum += numero;
            if(numero < min){
                min = numero;
            }
            if(numero > max){
                max = numero;
            }
        }
        System.out.println("La suma de los número generados es " + sum);
        System.out.println("La media de los números generados es " + sum/size);
        System.out.println("El mínimo de los números generados es " + min);
        System.out.println("El máximo de los números generados es " +  max);
    }
}
