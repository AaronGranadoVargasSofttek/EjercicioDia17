package org.softtek.menu;

import org.softtek.model.Empleado;
import tools.jackson.databind.ObjectMapper;

import java.io.PrintWriter;
import java.util.Scanner;

import static org.softtek.model.Utilidades.getEmpleados;

import java.util.List;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

public class Menu {

    public static String iniciarElecciones()
    {
        return ("1- Imprimir Directorio" +
                "2- Buscar Usuario " +
                "3- Guardar Directorio " +
                "4- Leer Directorio");
    }

    public static void imprimirDirectorio(List<Empleado> empleados)
    {
        for (Empleado e : empleados)
        {
            System.out.println(e.nombre()+ " "+e.apellido()+"\n---\n");
        }
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

    public static void buscarUsuario(List<Empleado> empleados, String nombreBuscado)
    {
        Empleado empleado = empleados.stream()
                .filter(e -> e.getNombre().equalsIgnoreCase(nombreBuscado))
                .findFirst();
        System.out.println(empleado.nombre()+" "+ empleado.apellido());
    }

    public static void guardarDirectorio()
    {

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

}