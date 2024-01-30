package EJ05;
/*Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta vez
una lista para almacenar la información sobre los discos en lugar de un array
convencional. Comprobarás que el código se simplifica notablemente ¿Cuánto
ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
programa hecho con una lista?*/

import java.util.ArrayList;
import java.util.Scanner;

import EJ05.discos.Disco;

public class EJ05 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);

        ArrayList<Disco> album = new ArrayList<Disco>();
        
        String codigoIntroducido;
        String autorIntroducido;
        String tituloIntroducido;
        String generoIntroducido;
        String duracionIntroducidaString;
        int opcion;
        int opcionListado;
        int limiteInferior;
        int limiteSuperior;
        int duracionIntroducida;
        int discoModificar;

        album.add(new Disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50));
        album.add(new Disco("FGHQ64", "Metallica", "Black album", "hard rock", 46));
        album.add(new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42));

        //Menú
        do {
            System.out.println("\n\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(s.nextLine());

            switch (opcion) {

                case 1://Listado
                    do{
                        System.out.println("\nLISTADO\n=======");
                        System.out.println("1. Completo");
                        System.out.println("2. Por autor");
                        System.out.println("3. Por género");
                        System.out.println("4. En un rango de duración");
                        System.out.println("5. Menú principal");
                        System.out.print("Introduzca una opción: ");
                        opcionListado = Integer.parseInt(s.nextLine());

                        switch (opcionListado) {
                            case 1://Listado completo
                                for (Disco disco : album) {
                                    System.out.println(disco);
                                }
                                break;
                            case 2://Por autor
                                System.out.println("Introduzca el autor: ");
                                autorIntroducido = s.nextLine();
                                for (Disco disco : album) {
                                    if(disco.getAutor().equals(autorIntroducido)){
                                        System.out.println(disco);
                                    }
                                }
                            case 3://Por género
                                System.out.println("Introduzca el género: ");
                                generoIntroducido = s.nextLine();
                                for (Disco disco : album) {
                                    if(disco.getGenero().equals(generoIntroducido)){
                                        System.out.println(disco);
                                    }
                                }
                            case 4://En un rango de duración
                                System.out.println("Establezca el intervalo para la duración.");
                                System.out.println("Introduzca el límite inferior de la duración en minutos: ");
                                limiteInferior = s.nextInt();
                                s.nextLine();
                                System.out.println("Introduzca el límite superior de la duración en minutos: ");
                                limiteSuperior = s.nextInt();
                                s.nextLine();
                                for (Disco disco : album) {
                                    if((disco.getDuracion()<=limiteSuperior) && (disco.getDuracion()>=limiteInferior)){
                                        System.out.println(disco);
                                    }
                                }
                            case 5:
                                break;
                            default:
                                break;
                        }
                    }while(opcionListado !=5);
                    break;
                case 2://Nuevo disco
                    System.out.println("\nNUEVO DISCO\n===========");
                    System.out.println("Por favor, introduzca los datos del disco.");
                    System.out.print("Código: ");
                    codigoIntroducido = s.nextLine();

                    while (album.contains(new Disco(codigoIntroducido, "", "", "", 0))) {
                        System.out.println("El código introducico ya existe en la base de datos, por favor introduce un nuevo código");
                        System.out.println("Introduce el nuevo código: ");
                        codigoIntroducido = s.nextLine();
                    }
                    System.out.print("Autor: ");
                    autorIntroducido = s.nextLine();
                    System.out.print("Título: ");
                    tituloIntroducido = s.nextLine();
                    System.out.print("Género: ");
                    generoIntroducido = s.nextLine();
                    System.out.print("Duración: ");
                    duracionIntroducida = s.nextInt();

                    album.add(new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida));
                    break;
                case 3://Modificar disco
                    System.out.println("\nMODIFICAR\n===========");
                    System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
                    codigoIntroducido = s.nextLine();

                    while(!album.contains(new Disco(codigoIntroducido, "", "", "", 0))) {
                        System.out.print("Ese código no existe.");
                        System.out.println("Introduzca otro código: ");
                        codigoIntroducido = s.nextLine();
                    }
                    discoModificar = album.indexOf(new Disco(codigoIntroducido, "", "", "", 0));
                    System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

                    System.out.println("Código: " + album.get(discoModificar).getCodigo());
                    System.out.print("Nuevo código: ");
                    codigoIntroducido = s.nextLine();
                    if (!codigoIntroducido.equals("")) {
                        album.get(discoModificar).setCodigo(codigoIntroducido);
                    }
                    System.out.println("Autor: " + album.get(discoModificar).getAutor());
                    System.out.print("Nuevo autor: ");
                    autorIntroducido = s.nextLine();
                    if (!autorIntroducido.equals("")) {
                        album.get(discoModificar).setAutor(autorIntroducido);
                    }
                    System.out.println("Título: " + album.get(discoModificar).getTitulo());
                    System.out.print("Nuevo título: ");
                    tituloIntroducido = s.nextLine();
                    if (!tituloIntroducido.equals("")) {
                        album.get(discoModificar).setTitulo(tituloIntroducido);
                    }
                    System.out.println("Género: " + album.get(discoModificar).getGenero());
                    System.out.print("Nuevo género: ");
                    generoIntroducido = s.nextLine();
                    if (!generoIntroducido.equals("")) {
                        album.get(discoModificar).setGenero(generoIntroducido);
                    }
                    System.out.println("Duración: " + album.get(discoModificar).getDuracion());
                    System.out.print("Duración: ");
                    duracionIntroducidaString = s.nextLine();
                    if (!duracionIntroducidaString.equals("")) {
                        album.get(discoModificar).setDuracion(Integer.parseInt(duracionIntroducidaString));
                    }
                    break;
                case 4://Borrar
                    System.out.println("\nBORRAR\n======");
                    System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
                    codigoIntroducido = s.nextLine();
                    if (!album.contains(new Disco(codigoIntroducido,"", "", "", 0))) {
                        System.out.println("Lo siento, el código introducido no existe.");
                    } else {
                        album.remove(album.indexOf(new Disco(codigoIntroducido,"", "", "", 0)));
                            System.out.println("Album borrado.");
                    }
                    break;
                case 5:
                    break;
                default:
                    break;
                } // switch
                    
            } while (opcion != 5);

            s.close();
                
        }
    }    

