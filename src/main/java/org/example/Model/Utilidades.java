package org.example.Model;

import java.util.Scanner;


public class Utilidades {


    private final Scanner sc;


    public Utilidades() {
        sc = new Scanner(System.in);
    }


    public String leerTexto(String mensaje) {
        String texto;
        do {
            System.out.print(mensaje + ": ");
            texto = sc.nextLine().trim();
            if (texto.isEmpty()) {
                System.out.println("Error: el texto no puede estar vacío. Inténtalo de nuevo.");
            }
        } while (texto.isEmpty());
        return texto;
    }



    public int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje + ": ");
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: introduce un número válido.");
            }
        }
    }


    public double leerDouble(String mensaje) {
        while (true) {
            System.out.print(mensaje + ": ");
            try {
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: introduce un número decimal válido.");
            }
        }
    }
    
    public void cerrar() {
        sc.close();
    }
}
