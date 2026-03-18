package org.softtek.menu;

import org.softtek.model.Empleado;

import java.util.List;

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

    public static void buscarUsuario(List<Empleado> empleados, String nombreBuscado)
    {
        Empleado empleado = empleados.stream()
                .filter(e -> e.getNombre().equalsIgnoreCase(nombreBuscado))
                .findFirst();
        System.out.println(empleado.nombre()+" "+ empleado.apellido());
    }

    public static void guardarDirectorio()
    {

    }

    public static void leerDirectorio()
    {

    }

}