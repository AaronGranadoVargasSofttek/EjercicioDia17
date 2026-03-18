package org.softtek.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Utilidades {


    private static final Scanner SC = new Scanner(System.in);
    private List<Empleado> empleados = new ArrayList<>();

    public static String leerTexto(String mensaje) {
        String texto;
        do {
            System.out.print(mensaje + ": ");
            texto = SC.nextLine().trim();
            if (texto.isEmpty())
                System.out.println("Error: el texto no puede estar vacío. Inténtalo de nuevo.");
        } while (texto.isEmpty());
        return texto;
    }

    public void buscarUsuario(String nombre){

        boolean encontrado = false;

        for(Empleado e : empleados){
            if(e.nombre().equalsIgnoreCase(nombre)){
                System.out.println("Usuario encontrado: " + e);
                encontrado = true;
                break;
            }
        }
        if(!encontrado)
        {
            System.out.println("Usuario no encontrado.");
        }

    }
    
    public static int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje + ": ");
            try {
                return Integer.parseInt(SC.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: introduce un número válido.");
            }
        }
    }


    public static double leerDouble(String mensaje) {
        while (true) {
            System.out.print(mensaje + ": ");
            try {
                return Double.parseDouble(SC.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: introduce un número decimal válido.");
            }
        }
    }

    

    public static void cerrar() {
        SC.close();
    }
}
