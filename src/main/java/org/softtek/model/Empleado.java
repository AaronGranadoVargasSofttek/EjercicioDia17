package org.softtek.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public record Empleado(String nombre, String apellido, LocalDateTime fechaAlta,
                       List<String> telefonoContacto,
                       Empleado supervisor) {

    @Override
    public String toString() {
        return "Nombre: "+ nombre
                + "Apellido:" + apellido
                + "Fecha de alta"+ String.join(",", telefonoContacto)
                + "Supervisor" + supervisor;
    }
}
