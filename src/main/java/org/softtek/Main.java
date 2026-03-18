package org.softtek;

import org.softtek.menu.Menu;
import org.softtek.model.Utilidades;

public class Main {

    public static void main(String[] args) {
        String eleccionUsuario = Utilidades.leerTexto(Menu.iniciarElecciones());

        switch (eleccionUsuario) {
            case "1":
                Menu.imprimirDirectorio();
            case "2":
                Menu.buscarUsuario();
            case "3":
                Menu.guardarDirectorio();
            case "4":
                Menu.leerDirectorio();
        }
    }
}