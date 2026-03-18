package org.softtek.menu;

import org.softtek.model.Empleado;
import tools.jackson.databind.ObjectMapper;

import java.io.PrintWriter;
import java.util.Scanner;

import static org.softtek.model.Utilidades.getEmpleados;

public class Menu {

    public static String iniciarElecciones() {
        return ("1- Imprimir Directorio" +
                "2- Buscar Usuario " +
                "3- Guardar Directorio " +
                "4- Leer Directorio");
    }

    public static void imprimirDirectorio() {

    }

    public static void buscarUsuario() {

    }

    public static void guardarDirectorio() {

        try {
            ObjectMapper mapper = new ObjectMapper();
            PrintWriter writejson = new PrintWriter("directorio.json");

            String json = mapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(getEmpleados());

            writejson.write(json);
            writejson.close();
            System.out.println("Guardado correctamente");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void leerDirectorio() {

    }

}