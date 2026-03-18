package org.softtek;

import org.softtek.menu.Menu;
import org.softtek.model.Empleado;
import org.softtek.model.Utilidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String eleccionUsuario = Utilidades.leerTexto(Menu.iniciarElecciones());
        List<Empleado> empleados = crearListaEmpleados();

        switch (eleccionUsuario) {
            case "1":
                Menu.imprimirDirectorio(empleados);
            case "2":
                String nombre = Utilidades.leerTexto("Introduce el nombre a buscar");
                Menu.buscarUsuario(empleados, nombre);
            case "3":
                Menu.guardarDirectorio();
            case "4":
                Menu.leerDirectorio();
        }
    }

    public static List<Empleado> crearListaEmpleados()
    {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Alfredo","Montaner",LocalDate.now().atStartOfDay(),null,null));

        empleados.add(new Empleado("Ana","Gomez",LocalDate.now().atStartOfDay(),List.of("123456789"),empleados.get(0)));

        empleados.add(new Empleado("Luis",null,LocalDate.now().atStartOfDay(),null,empleados.get(0)));

        empleados.add(new Empleado("Marta","Lopez",LocalDate.now().atStartOfDay(),List.of("111222333", "444555666"),empleados.get(1)));

        empleados.add(new Empleado("Carlos","Ruiz",LocalDate.now().atStartOfDay(),null,empleados.get(1)));

        empleados.add(new Empleado("Elena","Martinez",LocalDate.now().atStartOfDay(),List.of("777888999"),empleados.get(1)));

        empleados.add(new Empleado("Sofia",null,LocalDate.now().atStartOfDay(),List.of(),empleados.get(5)));

        empleados.add(new Empleado("Pedro","Sanchez",LocalDate.now().atStartOfDay(),null,empleados.get(5)));

        empleados.add(new Empleado("Lucia","Fernandez",LocalDate.now().atStartOfDay(),List.of("222333444"),empleados.get(0)));

        empleados.add(new Empleado("Diego","Torres",LocalDate.now().atStartOfDay(),null,empleados.get(1)));
        return empleados;
    }
}