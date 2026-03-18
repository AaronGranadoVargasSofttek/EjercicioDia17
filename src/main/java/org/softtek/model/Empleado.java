package org.softtek.model;

import java.time.LocalDateTime;
import java.util.List;

public record Empleado(String nombre, String apellido, LocalDateTime fechaAlta,
                       List<String> telefonoContacto,
                       Empleado supervisor) {
}
