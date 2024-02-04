import java.util.ArrayList;
import java.util.HashMap;

public class EJ11 {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<String, String>();

        diccionario.put("ordenador", "computer");
        diccionario.put("gato", "cat");
        diccionario.put("rojo", "red");
        diccionario.put("árbol", "tree");
        diccionario.put("pingüino", "penguin");
        diccionario.put("sol", "sun");
        diccionario.put("agua", "water");
        diccionario.put("viento", "wind");
        diccionario.put("siesta", "siesta");
        diccionario.put("arriba", "up");
        diccionario.put("ratón", "mouse");
        diccionario.put("estadio", "arena");
        diccionario.put("calumnia", "aspersion");
        diccionario.put("aguacate", "avocado");
        diccionario.put("cuerpo", "body");
        diccionario.put("concurso", "contest");
        diccionario.put("cena", "dinner");
        diccionario.put("salida", "exit");
        diccionario.put("lenteja", "lentil");
        diccionario.put("cacerola", "pan");
        diccionario.put("pastel", "pie");
        diccionario.put("membrillo", "quince");

        int numero;
        //guarda las claves en un array de string

        String[] arrayString = diccionario.keySet().toArray(new String[0]);
        //genera 5 números aleatorios que no se repiten
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add((int)(Math.random()*22));
        for (int i = 0; i < 4; i++) {
            do {
                numero = (int)(Math.random()*22);
            } while (n.contains(numero));
            n.add(numero); 
        }
        // muestra las palabras en español y pregunta por su traducción
        int puntos = 0;
        System.out.println("Mostraré la palabra en español y usted tendrá que traducirla al inglés.");
        for (int i = 0; i < 5; i++) {
            System.out.print(arrayString[n.get(i)] + ": ");
            String palabraIntroducida = System.console().readLine();
            if (palabraIntroducida.equals(diccionario.get(arrayString[n.get(i)]))) {
                System.out.println("¡Correcto!");
                puntos++;
            } else {
                System.out.println("Respuesta incorrecta :(");
                System.out.println("La respuesta correcta es " + diccionario.get(arrayString[n.get(i)]));
            }
        }
        System.out.println("Ha obtenido " + puntos + " puntos.");
    }
}
