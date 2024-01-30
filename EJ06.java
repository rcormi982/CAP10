/*Implementa el control de acceso al área restringida de un
* programa. Se debe pedir un nombre de usuario y una contraseña. Si
* el usuario introduce los datos correctamente, el programa dirá
* "Ha accedido al área restringida". El usuario tendrá un máximo de
* 3 oportunidades. Si se agotan las oportunidades el programa dirá
* "Lo siento, no tiene acceso al área restringida". Los nombres de
* usuario con sus correspondientes contraseñas deben estar
* almacenados en una estructura de la clase HashMap. */

import java.util.HashMap;

public class EJ06 {
    public static void main(String[] args) {
        HashMap<String, String> acceso = new HashMap<String, String>();
        String usuario;
        String clave;

        boolean entra = false;
        int oportunidades = 3;

        acceso.put("admin", "224477");
        acceso.put("maria", "ztf99");
        acceso.put("pepe", "zxcvb");

        System.out.println("Por favor introduzca el nombre de usuario y contraseña. Dispone de 3 oportunidades");

        do {
            System.out.println("Usuario: ");
            usuario = System.console().readLine();
            System.out.println("Clave: ");
            clave = System.console().readLine();

            if(acceso.containsKey(usuario)){
                if(acceso.get(usuario).equals(clave)){
                    System.out.println("Ha accedido al área restringida");
                    entra = true;
                }else{
                    System.out.println("Contraseña incorrecta");
                }
            }else{
                System.out.println("El usuario no existe");
            }
            oportunidades--;

            if(!entra && oportunidades > 0){
                System.out.printf("Le quedan %d oportunidades%n", oportunidades);
            }
            
        } while ((!entra) && oportunidades > 0);
        
        if(!entra){
            System.out.println("\nLo siento no tiene acceso al area restringida");
        }
    }
}
