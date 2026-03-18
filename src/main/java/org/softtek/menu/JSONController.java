package org.softtek.menu;

import org.softtek.model.Empleado;
import tools.jackson.databind.ObjectMapper;

import java.io.File;

import java.util.ArrayList;
import java.util.List;

public class JSONController {

    public static void guardarDirectorio(ObjectMapper mapper, List<Empleado> empleados) {

        List<Empleado> empleadosValidos = empleados.stream()
                .filter(e -> e.nombre() != null
                        && e.apellido() != null
                        && !e.telefonoContacto().isEmpty()
                        && e.fechaAlta() != null
                        && e.supervisor() != null)
                .toList();

        try {
            mapper.writeValue(new File("directorio.json"), empleadosValidos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void leerDirectorio(){

        try{
            ObjectMapper mapper = new ObjectMapper();
            List<Empleado> empleados = mapper.readValue(new File("directorio.json"), mapper.getTypeFactory().constructCollectionType(List.class, Empleado.class));
            for (Empleado e : empleados) {
                System.out.println(e);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
