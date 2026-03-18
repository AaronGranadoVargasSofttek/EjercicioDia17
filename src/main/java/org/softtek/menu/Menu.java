package org.softtek.menu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Menu {

    public static String iniciarElecciones() {
        return ("Directorio Corporativo <" + leerVersion() + ">. Elija una opcion:" +
                "\n1- Imprimir Directorio" +
                "\n2- Buscar Usuario " +
                "\n3- Guardar Directorio " +
                "\n4- Leer Directorio");
    }

    public static String leerVersion() {
        try (BufferedReader br = new BufferedReader(new FileReader("pom.xml"))) {
            return br.lines()
                    .filter(linea -> linea.contains("<version>"))
                    .map(linea -> linea.replaceAll("<[^>]*>", "").trim())
                    .findFirst()
                    .orElse("Versión no encontrada");
        } catch (IOException e) {
            e.printStackTrace();
            return "Error al leer el archivo";
        }
    }


    public static void imprimirDirectorio() {

    }

    public static void buscarUsuario() {

    }

    public static void guardarDirectorio() {

    }

    public static void leerDirectorio() {

    }

}