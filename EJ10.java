/*Crea un mini-diccionario español-inglés que contenga, al menos,
* 20 palabras (con su traducción).
* <p>
* Utiliza un objeto de la clase <code>HashMap</code> para almacenar
* las parejas de palabras. El programa pedirá una palabra en
* español y dará la correspondiente traducción en inglés. */

import java.util.HashMap;

public class EJ10 {
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

        System.out.println("Introduzca una palabra en español: ");
        String palabraIntroducida = System.console().readLine();

        if(diccionario.containsKey(palabraIntroducida)){
            System.out.printf("%s -> %s", palabraIntroducida, diccionario.get(palabraIntroducida));
        }else{
            System.out.println("Lo siento, no conozco esa palabra");
        }
    }
}
